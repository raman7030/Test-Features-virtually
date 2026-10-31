package org.bouncycastle.jcajce.provider.drbg;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.Security;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l.C12662;
import l.C5368;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.prng.EntropySource;
import org.bouncycastle.crypto.prng.EntropySourceProvider;
import org.bouncycastle.crypto.prng.SP800SecureRandom;
import org.bouncycastle.crypto.prng.SP800SecureRandomBuilder;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes.dex */
public class DRBG {
    public static final String PREFIX = "org.bouncycastle.jcajce.provider.drbg.DRBG";
    public static EntropyDaemon entropyDaemon;
    public static final String[][] initialEntropySourceNames = {new String[]{"sun.security.provider.Sun", "sun.security.provider.SecureRandom"}, new String[]{"org.apache.harmony.security.provider.crypto.CryptoProvider", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl"}, new String[]{"com.android.org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLRandom"}, new String[]{"org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLRandom"}};
    public static Thread entropyThread = null;

    public class CoreSecureRandom extends SecureRandom {
        public CoreSecureRandom(Object[] objArr) {
            super((SecureRandomSpi) objArr[1], (Provider) objArr[0]);
        }
    }

    public class Default extends SecureRandomSpi {
        public static final SecureRandom random = DRBG.createBaseRandom(true);

        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i) {
            return random.generateSeed(i);
        }

        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    public class HybridEntropySource implements EntropySource {
        public final byte[] additionalInput;
        public final int bytesRequired;
        public final SP800SecureRandom drbg;
        public final SignallingEntropySource entropySource;
        public final AtomicInteger samples;
        public final AtomicBoolean seedAvailable;

        /* JADX INFO: loaded from: classes2.dex */
        public class SignallingEntropySource implements IncrementalEntropySource {
            public final int byteLength;
            public final EntropyDaemon entropyDaemon;
            public final IncrementalEntropySource entropySource;
            public final AtomicBoolean seedAvailable;
            public final AtomicReference entropy = new AtomicReference();
            public final AtomicBoolean scheduled = new AtomicBoolean(false);

            public SignallingEntropySource(EntropyDaemon entropyDaemon, AtomicBoolean atomicBoolean, EntropySourceProvider entropySourceProvider, int i) {
                this.entropyDaemon = entropyDaemon;
                this.seedAvailable = atomicBoolean;
                this.entropySource = (IncrementalEntropySource) entropySourceProvider.get(i);
                this.byteLength = (i + 7) / 8;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public int entropySize() {
                return this.byteLength * 8;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public byte[] getEntropy() {
                try {
                    return getEntropy(0L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException("initial entropy fetch interrupted");
                }
            }

            @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource
            public byte[] getEntropy(long j) {
                byte[] bArr = (byte[]) this.entropy.getAndSet(null);
                if (bArr == null || bArr.length != this.byteLength) {
                    return this.entropySource.getEntropy(j);
                }
                this.scheduled.set(false);
                return bArr;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public boolean isPredictionResistant() {
                return true;
            }

            public void schedule() {
                if (this.scheduled.getAndSet(true)) {
                    return;
                }
                this.entropyDaemon.addTask(new EntropyGatherer(this.entropySource, this.seedAvailable, this.entropy));
            }
        }

        public HybridEntropySource(EntropyDaemon entropyDaemon, int i) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.seedAvailable = atomicBoolean;
            this.samples = new AtomicInteger(0);
            this.additionalInput = Pack.longToBigEndian(System.currentTimeMillis());
            EntropySourceProvider entropySourceProviderCreateCoreEntropySourceProvider = DRBG.createCoreEntropySourceProvider();
            this.bytesRequired = (i + 7) / 8;
            SignallingEntropySource signallingEntropySource = new SignallingEntropySource(entropyDaemon, atomicBoolean, entropySourceProviderCreateCoreEntropySourceProvider, DRBG.get256BitsEffectiveEntropySize());
            this.entropySource = signallingEntropySource;
            this.drbg = new SP800SecureRandomBuilder(new EntropySourceProvider() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.HybridEntropySource.1
                @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
                public EntropySource get(int i2) {
                    return HybridEntropySource.this.entropySource;
                }
            }).setPersonalizationString(Strings.toByteArray("Bouncy Castle Hybrid Entropy Source")).buildHMAC(new HMac(new SHA512Digest()), signallingEntropySource.getEntropy(), false);
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public int entropySize() {
            return this.bytesRequired * 8;
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public byte[] getEntropy() {
            byte[] bArr = new byte[this.bytesRequired];
            if (this.samples.getAndIncrement() > 128) {
                if (this.seedAvailable.getAndSet(false)) {
                    this.samples.set(0);
                    this.drbg.reseed(this.additionalInput);
                } else {
                    this.entropySource.schedule();
                }
            }
            this.drbg.nextBytes(bArr);
            return bArr;
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public boolean isPredictionResistant() {
            return true;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            C12662.m30943(DRBG.PREFIX, "$NonceAndIV", "SecureRandom.NONCEANDIV", C5368.m15340(DRBG.PREFIX, "$Default", "SecureRandom.DEFAULT", new StringBuilder(), configurableProvider), configurableProvider);
        }
    }

    public class NonceAndIV extends SecureRandomSpi {
        public static final SecureRandom random = DRBG.createBaseRandom(false);

        @Override // java.security.SecureRandomSpi
        public byte[] engineGenerateSeed(int i) {
            return random.generateSeed(i);
        }

        @Override // java.security.SecureRandomSpi
        public void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        @Override // java.security.SecureRandomSpi
        public void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    public class OneShotHybridEntropySource implements EntropySource {
        public final byte[] additionalInput;
        public final int bytesRequired;
        public final SP800SecureRandom drbg;
        public final OneShotSignallingEntropySource entropySource;
        public final AtomicInteger samples;
        public final AtomicBoolean seedAvailable;

        /* JADX INFO: loaded from: classes2.dex */
        public class OneShotSignallingEntropySource implements IncrementalEntropySource {
            public final int byteLength;
            public final IncrementalEntropySource entropySource;
            public final AtomicBoolean seedAvailable;
            public final AtomicReference entropy = new AtomicReference();
            public final AtomicBoolean scheduled = new AtomicBoolean(false);

            public OneShotSignallingEntropySource(AtomicBoolean atomicBoolean, EntropySourceProvider entropySourceProvider, int i) {
                this.seedAvailable = atomicBoolean;
                this.entropySource = (IncrementalEntropySource) entropySourceProvider.get(i);
                this.byteLength = (i + 7) / 8;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public int entropySize() {
                return this.byteLength * 8;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public byte[] getEntropy() {
                try {
                    return getEntropy(0L);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new IllegalStateException("initial entropy fetch interrupted");
                }
            }

            @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource
            public byte[] getEntropy(long j) {
                byte[] bArr = (byte[]) this.entropy.getAndSet(null);
                if (bArr == null || bArr.length != this.byteLength) {
                    return this.entropySource.getEntropy(j);
                }
                this.scheduled.set(false);
                return bArr;
            }

            @Override // org.bouncycastle.crypto.prng.EntropySource
            public boolean isPredictionResistant() {
                return true;
            }

            public void schedule() {
                if (this.scheduled.getAndSet(true)) {
                    return;
                }
                Thread thread = new Thread(new EntropyGatherer(this.entropySource, this.seedAvailable, this.entropy));
                thread.setDaemon(true);
                thread.start();
            }
        }

        public OneShotHybridEntropySource(int i) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.seedAvailable = atomicBoolean;
            this.samples = new AtomicInteger(0);
            this.additionalInput = Pack.longToBigEndian(System.currentTimeMillis());
            EntropySourceProvider entropySourceProviderCreateCoreEntropySourceProvider = DRBG.createCoreEntropySourceProvider();
            this.bytesRequired = (i + 7) / 8;
            OneShotSignallingEntropySource oneShotSignallingEntropySource = new OneShotSignallingEntropySource(atomicBoolean, entropySourceProviderCreateCoreEntropySourceProvider, DRBG.get256BitsEffectiveEntropySize());
            this.entropySource = oneShotSignallingEntropySource;
            this.drbg = new SP800SecureRandomBuilder(new EntropySourceProvider() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.OneShotHybridEntropySource.1
                @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
                public EntropySource get(int i2) {
                    return OneShotHybridEntropySource.this.entropySource;
                }
            }).setPersonalizationString(Strings.toByteArray("Bouncy Castle Hybrid Entropy Source")).buildHMAC(new HMac(new SHA512Digest()), oneShotSignallingEntropySource.getEntropy(), false);
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public int entropySize() {
            return this.bytesRequired * 8;
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public byte[] getEntropy() {
            byte[] bArr = new byte[this.bytesRequired];
            if (this.samples.getAndIncrement() > 1024) {
                if (this.seedAvailable.getAndSet(false)) {
                    this.samples.set(0);
                    this.drbg.reseed(this.additionalInput);
                } else {
                    this.entropySource.schedule();
                }
            }
            this.drbg.nextBytes(bArr);
            return bArr;
        }

        @Override // org.bouncycastle.crypto.prng.EntropySource
        public boolean isPredictionResistant() {
            return true;
        }
    }

    public class URLSeededEntropySourceProvider implements EntropySourceProvider {
        public final InputStream seedStream;

        public URLSeededEntropySourceProvider(final URL url) {
            this.seedStream = (InputStream) AccessController.doPrivileged(new PrivilegedAction(this) { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededEntropySourceProvider.1
                public final /* synthetic */ URLSeededEntropySourceProvider this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.security.PrivilegedAction
                public InputStream run() {
                    try {
                        return url.openStream();
                    } catch (IOException unused) {
                        throw new IllegalStateException("unable to open random source");
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int privilegedRead(final byte[] bArr, final int i, final int i2) {
            return ((Integer) AccessController.doPrivileged(new PrivilegedAction(this) { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededEntropySourceProvider.2
                public final /* synthetic */ URLSeededEntropySourceProvider this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.security.PrivilegedAction
                public Integer run() {
                    try {
                        return Integer.valueOf(this.this$0.seedStream.read(bArr, i, i2));
                    } catch (IOException unused) {
                        throw new InternalError("unable to read random source");
                    }
                }
            })).intValue();
        }

        @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
        public EntropySource get(int i) {
            return new IncrementalEntropySource(this, i) { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.URLSeededEntropySourceProvider.3
                public final int numBytes;
                public final /* synthetic */ URLSeededEntropySourceProvider this$0;
                public final /* synthetic */ int val$bitsRequired;

                {
                    this.val$bitsRequired = i;
                    this.this$0 = this;
                    this.numBytes = (i + 7) / 8;
                }

                @Override // org.bouncycastle.crypto.prng.EntropySource
                public int entropySize() {
                    return this.val$bitsRequired;
                }

                @Override // org.bouncycastle.crypto.prng.EntropySource
                public byte[] getEntropy() {
                    try {
                        return getEntropy(0L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new IllegalStateException("initial entropy fetch interrupted");
                    }
                }

                @Override // org.bouncycastle.jcajce.provider.drbg.IncrementalEntropySource
                public byte[] getEntropy(long j) throws InterruptedException {
                    int i2 = this.numBytes;
                    byte[] bArr = new byte[i2];
                    int i3 = 0;
                    while (i3 != i2) {
                        int iPrivilegedRead = this.this$0.privilegedRead(bArr, i3, i2 - i3);
                        if (iPrivilegedRead <= -1) {
                            break;
                        }
                        i3 += iPrivilegedRead;
                        DRBG.sleep(j);
                    }
                    if (i3 == i2) {
                        return bArr;
                    }
                    throw new InternalError("unable to fully read random source");
                }

                @Override // org.bouncycastle.crypto.prng.EntropySource
                public boolean isPredictionResistant() {
                    return true;
                }
            };
        }
    }

    static {
        entropyDaemon = null;
        entropyDaemon = new EntropyDaemon();
    }

    public static SecureRandom createBaseRandom(boolean z) {
        if (Properties.getPropertyValue("org.bouncycastle.drbg.entropysource") != null) {
            EntropySourceProvider entropySourceProviderCreateEntropySource = createEntropySource();
            EntropySource entropySource = entropySourceProviderCreateEntropySource.get(128);
            byte[] entropy = entropySource.getEntropy();
            return new SP800SecureRandomBuilder(entropySourceProviderCreateEntropySource).setPersonalizationString(z ? generateDefaultPersonalizationString(entropy) : generateNonceIVPersonalizationString(entropy)).buildHash(new SHA512Digest(), entropySource.getEntropy(), z);
        }
        if (!Properties.isOverrideSet("org.bouncycastle.drbg.entropy_thread")) {
            OneShotHybridEntropySource oneShotHybridEntropySource = new OneShotHybridEntropySource(256);
            byte[] entropy2 = oneShotHybridEntropySource.getEntropy();
            return new SP800SecureRandomBuilder(new EntropySourceProvider() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.2
                @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
                public EntropySource get(int i) {
                    return new OneShotHybridEntropySource(i);
                }
            }).setPersonalizationString(z ? generateDefaultPersonalizationString(entropy2) : generateNonceIVPersonalizationString(entropy2)).buildHash(new SHA512Digest(), oneShotHybridEntropySource.getEntropy(), z);
        }
        synchronized (entropyDaemon) {
            if (entropyThread == null) {
                Thread thread = new Thread(entropyDaemon, "BC Entropy Daemon");
                entropyThread = thread;
                thread.setDaemon(true);
                entropyThread.start();
            }
        }
        HybridEntropySource hybridEntropySource = new HybridEntropySource(entropyDaemon, 256);
        byte[] entropy3 = hybridEntropySource.getEntropy();
        return new SP800SecureRandomBuilder(new EntropySourceProvider() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.1
            @Override // org.bouncycastle.crypto.prng.EntropySourceProvider
            public EntropySource get(int i) {
                return new HybridEntropySource(DRBG.entropyDaemon, i);
            }
        }).setPersonalizationString(z ? generateDefaultPersonalizationString(entropy3) : generateNonceIVPersonalizationString(entropy3)).buildHash(new SHA512Digest(), hybridEntropySource.getEntropy(), z);
    }

    public static EntropySourceProvider createCoreEntropySourceProvider() {
        SecureRandom secureRandom;
        if (((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.3
            @Override // java.security.PrivilegedAction
            public Boolean run() {
                try {
                    return Boolean.valueOf(SecureRandom.class.getMethod("getInstanceStrong", null) != null);
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }
        })).booleanValue() && (secureRandom = (SecureRandom) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.4
            @Override // java.security.PrivilegedAction
            public SecureRandom run() {
                try {
                    return (SecureRandom) SecureRandom.class.getMethod("getInstanceStrong", null).invoke(null, null);
                } catch (Exception unused) {
                    return null;
                }
            }
        })) != null) {
            return new IncrementalEntropySourceProvider(secureRandom, true);
        }
        return createInitialEntropySource();
    }

    public static EntropySourceProvider createEntropySource() {
        final String propertyValue = Properties.getPropertyValue("org.bouncycastle.drbg.entropysource");
        return (EntropySourceProvider) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.6
            @Override // java.security.PrivilegedAction
            public EntropySourceProvider run() {
                try {
                    return (EntropySourceProvider) ClassUtil.loadClass(DRBG.class, propertyValue).newInstance();
                } catch (Exception e) {
                    throw new IllegalStateException("entropy source " + propertyValue + " not created: " + e.getMessage(), e);
                }
            }
        });
    }

    public static EntropySourceProvider createInitialEntropySource() {
        String str = (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.jcajce.provider.drbg.DRBG.5
            @Override // java.security.PrivilegedAction
            public String run() {
                return Security.getProperty("securerandom.source");
            }
        });
        if (str == null) {
            return new IncrementalEntropySourceProvider(new CoreSecureRandom(findSource()), true);
        }
        try {
            return new URLSeededEntropySourceProvider(new URL(str));
        } catch (Exception unused) {
            return new IncrementalEntropySourceProvider(new CoreSecureRandom(findSource()), true);
        }
    }

    public static final Object[] findSource() {
        int i = 0;
        while (true) {
            String[][] strArr = initialEntropySourceNames;
            if (i >= strArr.length) {
                return null;
            }
            String[] strArr2 = strArr[i];
            try {
                return new Object[]{Class.forName(strArr2[0]).newInstance(), Class.forName(strArr2[1]).newInstance()};
            } catch (Throwable unused) {
                i++;
            }
        }
    }

    public static byte[] generateDefaultPersonalizationString(byte[] bArr) {
        return Arrays.concatenate(Strings.toByteArray("Default"), bArr, Pack.longToBigEndian(Thread.currentThread().getId()), Pack.longToBigEndian(System.currentTimeMillis()));
    }

    public static byte[] generateNonceIVPersonalizationString(byte[] bArr) {
        return Arrays.concatenate(Strings.toByteArray("Nonce"), bArr, Pack.longToLittleEndian(Thread.currentThread().getId()), Pack.longToLittleEndian(System.currentTimeMillis()));
    }

    public static int get256BitsEffectiveEntropySize() {
        return ((Properties.asInteger("org.bouncycastle.drbg.effective_256bits_entropy", 282) + 7) / 8) * 8;
    }

    public static void sleep(long j) throws InterruptedException {
        if (j != 0) {
            Thread.sleep(j);
        }
    }
}
