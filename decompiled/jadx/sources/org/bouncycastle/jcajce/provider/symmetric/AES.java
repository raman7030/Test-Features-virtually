package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;
import l.C11010;
import l.C12662;
import l.C13325;
import l.C16014;
import l.C18473;
import l.C19462;
import l.C20094;
import l.C20382;
import l.C21639;
import l.C3200;
import l.C3435;
import l.C4153;
import l.C5368;
import l.C8954;
import l.C9045;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DefaultBufferedBlockCipher;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.engines.AESEngine;
import org.bouncycastle.crypto.engines.AESWrapEngine;
import org.bouncycastle.crypto.engines.AESWrapPadEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.engines.RFC5649WrapEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CCMBlockCipher;
import org.bouncycastle.crypto.modes.CCMModeCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.internal.asn1.cms.CCMParameters;
import org.bouncycastle.internal.asn1.cms.GCMParameters;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public final class AES {
    public static final Map generalAesAttributes;

    /* JADX INFO: loaded from: classes2.dex */
    public class AESCCMMAC extends BaseMac {
        public AESCCMMAC() {
            super(new CCMMac());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class AESCCMMAC128 extends BaseMac {
        public AESCCMMAC128() {
            super(128, new CCMMac());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class AESCCMMAC192 extends BaseMac {
        public AESCCMMAC192() {
            super(192, new CCMMac());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class AESCCMMAC256 extends BaseMac {
        public AESCCMMAC256() {
            super(256, new CCMMac());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class AESCMAC extends BaseMac {
        public AESCMAC() {
            super(new CMac(AESEngine.newInstance()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class AESGMAC extends BaseMac {
        public AESGMAC() {
            super(new GMac(GCMBlockCipher.newInstance(AESEngine.newInstance())));
        }
    }

    public class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("AES");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public class AlgParamGenCCM extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("CCM");
                algorithmParametersCreateParametersInstance.init(new CCMParameters(bArr, 12).getEncoded());
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public class AlgParamGenGCM extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (this.random == null) {
                this.random = new SecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("GCM");
                algorithmParametersCreateParametersInstance.init(new GCMParameters(bArr, 16).getEncoded());
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "AES IV";
        }
    }

    public class AlgParamsCCM extends BaseAlgorithmParameters {
        public CCMParameters ccmParams;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            return this.ccmParams.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.ccmParams.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.ccmParams = CCMParameters.getInstance(GcmSpecUtil.extractGcmParameters(algorithmParameterSpec));
            } else {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
                }
                AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
                this.ccmParams = new CCMParameters(aEADParameterSpec.getNonce(), aEADParameterSpec.getMacSizeInBits() / 8);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) {
            this.ccmParams = CCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                throw new IOException("unknown format specified");
            }
            this.ccmParams = CCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "CCM";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                return GcmSpecUtil.gcmSpecExtractable() ? GcmSpecUtil.extractGcmSpec(this.ccmParams.toASN1Primitive()) : new AEADParameterSpec(this.ccmParams.getNonce(), this.ccmParams.getIcvLen() * 8);
            }
            if (cls == AEADParameterSpec.class) {
                return new AEADParameterSpec(this.ccmParams.getNonce(), this.ccmParams.getIcvLen() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.ccmParams.getNonce());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }
    }

    public class AlgParamsGCM extends BaseAlgorithmParameters {
        public GCMParameters gcmParams;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            return this.gcmParams.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return this.gcmParams.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (GcmSpecUtil.isGcmSpec(algorithmParameterSpec)) {
                this.gcmParams = GcmSpecUtil.extractGcmParameters(algorithmParameterSpec);
            } else {
                if (!(algorithmParameterSpec instanceof AEADParameterSpec)) {
                    throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: ".concat(algorithmParameterSpec.getClass().getName()));
                }
                AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
                this.gcmParams = new GCMParameters(aEADParameterSpec.getNonce(), aEADParameterSpec.getMacSizeInBits() / 8);
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) {
            this.gcmParams = GCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                throw new IOException("unknown format specified");
            }
            this.gcmParams = GCMParameters.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "GCM";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || GcmSpecUtil.isGcmSpec(cls)) {
                return GcmSpecUtil.gcmSpecExtractable() ? GcmSpecUtil.extractGcmSpec(this.gcmParams.toASN1Primitive()) : new AEADParameterSpec(this.gcmParams.getNonce(), this.gcmParams.getIcvLen() * 8);
            }
            if (cls == AEADParameterSpec.class) {
                return new AEADParameterSpec(this.gcmParams.getNonce(), this.gcmParams.getIcvLen() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.gcmParams.getNonce());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: ".concat(cls.getName()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC extends BaseBlockCipher {
        public CBC() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC128 extends BaseBlockCipher {
        public CBC128() {
            super(128, CBCBlockCipher.newInstance(AESEngine.newInstance()), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC192 extends BaseBlockCipher {
        public CBC192() {
            super(192, CBCBlockCipher.newInstance(AESEngine.newInstance()), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC256 extends BaseBlockCipher {
        public CBC256() {
            super(192, CBCBlockCipher.newInstance(AESEngine.newInstance()), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CCM extends BaseBlockCipher {
        public CCM() {
            super((AEADBlockCipher) CCMBlockCipher.newInstance(AESEngine.newInstance()), false, 12);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CCM128 extends BaseBlockCipher {
        public CCM128() {
            super(128, CCMBlockCipher.newInstance(AESEngine.newInstance()), false, 12);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CCM192 extends BaseBlockCipher {
        public CCM192() {
            super(192, CCMBlockCipher.newInstance(AESEngine.newInstance()), false, 12);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CCM256 extends BaseBlockCipher {
        public CCM256() {
            super(256, CCMBlockCipher.newInstance(AESEngine.newInstance()), false, 12);
        }
    }

    public class CCMMac implements Mac {
        public final CCMModeCipher ccm = CCMBlockCipher.newInstance(AESEngine.newInstance());
        public int macLength = 8;

        @Override // org.bouncycastle.crypto.Mac
        public int doFinal(byte[] bArr, int i) {
            try {
                return this.ccm.doFinal(bArr, 0);
            } catch (InvalidCipherTextException e) {
                throw new IllegalStateException("exception on doFinal(): " + e.toString());
            }
        }

        @Override // org.bouncycastle.crypto.Mac
        public String getAlgorithmName() {
            return this.ccm.getAlgorithmName() + "Mac";
        }

        @Override // org.bouncycastle.crypto.Mac
        public int getMacSize() {
            return this.macLength;
        }

        @Override // org.bouncycastle.crypto.Mac
        public void init(CipherParameters cipherParameters) {
            this.ccm.init(true, cipherParameters);
            this.macLength = this.ccm.getMac().length;
        }

        @Override // org.bouncycastle.crypto.Mac
        public void reset() {
            this.ccm.reset();
        }

        @Override // org.bouncycastle.crypto.Mac
        public void update(byte b) {
            this.ccm.processAADByte(b);
        }

        @Override // org.bouncycastle.crypto.Mac
        public void update(byte[] bArr, int i, int i2) {
            this.ccm.processAADBytes(bArr, i, i2);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CFB extends BaseBlockCipher {
        public CFB() {
            super(new DefaultBufferedBlockCipher(CFBBlockCipher.newInstance(AESEngine.newInstance(), 128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CFB128 extends BaseBlockCipher {
        public CFB128() {
            super(128, new DefaultBufferedBlockCipher(CFBBlockCipher.newInstance(AESEngine.newInstance(), 128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CFB192 extends BaseBlockCipher {
        public CFB192() {
            super(192, new DefaultBufferedBlockCipher(CFBBlockCipher.newInstance(AESEngine.newInstance(), 128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CFB256 extends BaseBlockCipher {
        public CFB256() {
            super(256, new DefaultBufferedBlockCipher(CFBBlockCipher.newInstance(AESEngine.newInstance(), 128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.AES.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return AESEngine.newInstance();
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB128 extends BaseBlockCipher {
        public ECB128() {
            super(128, new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.AES.ECB128.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return AESEngine.newInstance();
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB192 extends BaseBlockCipher {
        public ECB192() {
            super(192, new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.AES.ECB192.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return AESEngine.newInstance();
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB256 extends BaseBlockCipher {
        public ECB256() {
            super(256, new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.AES.ECB256.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return AESEngine.newInstance();
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class GCM extends BaseBlockCipher {
        public GCM() {
            super(GCMBlockCipher.newInstance(AESEngine.newInstance()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class GCM128 extends BaseBlockCipher {
        public GCM128() {
            super(128, GCMBlockCipher.newInstance(AESEngine.newInstance()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class GCM192 extends BaseBlockCipher {
        public GCM192() {
            super(192, GCMBlockCipher.newInstance(AESEngine.newInstance()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class GCM256 extends BaseBlockCipher {
        public GCM256() {
            super(256, GCMBlockCipher.newInstance(AESEngine.newInstance()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("AES", null);
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(192);
        }

        public KeyGen(int i) {
            super("AES", i, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends SymmetricAlgorithmProvider {
        public static final String PREFIX = AES.class.getName();
        public static final String wrongAES128 = "2.16.840.1.101.3.4.2";
        public static final String wrongAES192 = "2.16.840.1.101.3.4.22";
        public static final String wrongAES256 = "2.16.840.1.101.3.4.42";

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$AlgParams", "AlgorithmParameters.AES", sb, configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
            StringBuilder sb2 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_aes128_CBC;
            StringBuilder sbM42951 = C18473.m42951("AES", "Alg.Alias.AlgorithmParameters.", sb2, aSN1ObjectIdentifier, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes192_CBC;
            StringBuilder sbM42952 = C18473.m42951("AES", "Alg.Alias.AlgorithmParameters.", sbM42951, aSN1ObjectIdentifier2, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_aes256_CBC;
            StringBuilder sbM23342 = C9045.m23342("AES", str, sbM42952, aSN1ObjectIdentifier3, configurableProvider);
            sbM23342.append("$AlgParamsGCM");
            configurableProvider.addAlgorithm("AlgorithmParameters.GCM", sbM23342.toString());
            StringBuilder sb3 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_aes128_GCM;
            StringBuilder sbM42953 = C18473.m42951("GCM", "Alg.Alias.AlgorithmParameters.", sb3, aSN1ObjectIdentifier4, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_aes192_GCM;
            StringBuilder sbM42954 = C18473.m42951("GCM", "Alg.Alias.AlgorithmParameters.", sbM42953, aSN1ObjectIdentifier5, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_aes256_GCM;
            StringBuilder sbM23343 = C9045.m23342("GCM", str, sbM42954, aSN1ObjectIdentifier6, configurableProvider);
            sbM23343.append("$AlgParamsCCM");
            configurableProvider.addAlgorithm("AlgorithmParameters.CCM", sbM23343.toString());
            StringBuilder sb4 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NISTObjectIdentifiers.id_aes128_CCM;
            StringBuilder sbM42955 = C18473.m42951("CCM", "Alg.Alias.AlgorithmParameters.", sb4, aSN1ObjectIdentifier7, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NISTObjectIdentifiers.id_aes192_CCM;
            StringBuilder sbM42956 = C18473.m42951("CCM", "Alg.Alias.AlgorithmParameters.", sbM42955, aSN1ObjectIdentifier8, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NISTObjectIdentifiers.id_aes256_CCM;
            C3200.m9836(C9045.m23342("CCM", str, sbM42956, aSN1ObjectIdentifier9, configurableProvider), "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + aSN1ObjectIdentifier, "AES");
            C19462.m44861(C18473.m42951("AES", "Alg.Alias.AlgorithmParameterGenerator.", new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier2, configurableProvider), aSN1ObjectIdentifier3, configurableProvider, "AES");
            configurableProvider.addAttributes("Cipher.AES", AES.generalAesAttributes);
            configurableProvider.addAlgorithm("Cipher.AES", str + "$ECB");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.id_aes128_ECB;
            C11010.m27351(configurableProvider, str, "$ECB128", "Cipher", aSN1ObjectIdentifier10);
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NISTObjectIdentifiers.id_aes192_ECB;
            C11010.m27351(configurableProvider, str, "$ECB192", "Cipher", aSN1ObjectIdentifier11);
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NISTObjectIdentifiers.id_aes256_ECB;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier12, str + "$ECB256");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier3, C9045.m23341(C4153.m12553("$CBC192", "Cipher", C13325.m32309(configurableProvider, "Cipher", C9045.m23341(new StringBuilder(), str, "$CBC128"), str, aSN1ObjectIdentifier), aSN1ObjectIdentifier2, configurableProvider), str, "$CBC256"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = NISTObjectIdentifiers.id_aes128_OFB;
            C11010.m27351(configurableProvider, str, "$OFB128", "Cipher", aSN1ObjectIdentifier13);
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = NISTObjectIdentifiers.id_aes192_OFB;
            C11010.m27351(configurableProvider, str, "$OFB192", "Cipher", aSN1ObjectIdentifier14);
            ASN1ObjectIdentifier aSN1ObjectIdentifier15 = NISTObjectIdentifiers.id_aes256_OFB;
            C11010.m27351(configurableProvider, str, "$OFB256", "Cipher", aSN1ObjectIdentifier15);
            ASN1ObjectIdentifier aSN1ObjectIdentifier16 = NISTObjectIdentifiers.id_aes128_CFB;
            C11010.m27351(configurableProvider, str, "$CFB128", "Cipher", aSN1ObjectIdentifier16);
            ASN1ObjectIdentifier aSN1ObjectIdentifier17 = NISTObjectIdentifiers.id_aes192_CFB;
            C11010.m27351(configurableProvider, str, "$CFB192", "Cipher", aSN1ObjectIdentifier17);
            ASN1ObjectIdentifier aSN1ObjectIdentifier18 = NISTObjectIdentifiers.id_aes256_CFB;
            C11010.m27351(configurableProvider, str, "$CFB256", "Cipher", aSN1ObjectIdentifier18);
            configurableProvider.addAttributes("Cipher.AESWRAP", AES.generalAesAttributes);
            configurableProvider.addAlgorithm("Cipher.AESWRAP", str + "$Wrap");
            ASN1ObjectIdentifier aSN1ObjectIdentifier19 = NISTObjectIdentifiers.id_aes128_wrap;
            C11010.m27351(configurableProvider, str, "$Wrap128", "Cipher", aSN1ObjectIdentifier19);
            ASN1ObjectIdentifier aSN1ObjectIdentifier20 = NISTObjectIdentifiers.id_aes192_wrap;
            C11010.m27351(configurableProvider, str, "$Wrap192", "Cipher", aSN1ObjectIdentifier20);
            ASN1ObjectIdentifier aSN1ObjectIdentifier21 = NISTObjectIdentifiers.id_aes256_wrap;
            C11010.m27351(configurableProvider, str, "$Wrap256", "Cipher", aSN1ObjectIdentifier21);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.AESKW", "AESWRAP");
            configurableProvider.addAttributes("Cipher.AESWRAPPAD", AES.generalAesAttributes);
            configurableProvider.addAlgorithm("Cipher.AESWRAPPAD", str + "$WrapPad");
            ASN1ObjectIdentifier aSN1ObjectIdentifier22 = NISTObjectIdentifiers.id_aes128_wrap_pad;
            C11010.m27351(configurableProvider, str, "$WrapPad128", "Cipher", aSN1ObjectIdentifier22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier23 = NISTObjectIdentifiers.id_aes192_wrap_pad;
            C11010.m27351(configurableProvider, str, "$WrapPad192", "Cipher", aSN1ObjectIdentifier23);
            ASN1ObjectIdentifier aSN1ObjectIdentifier24 = NISTObjectIdentifiers.id_aes256_wrap_pad;
            C11010.m27351(configurableProvider, str, "$WrapPad256", "Cipher", aSN1ObjectIdentifier24);
            configurableProvider.addAlgorithm(C21639.m48907(configurableProvider, C21639.m48907(configurableProvider, C21639.m48907(configurableProvider, "AlgorithmParameterGenerator.CCM", C8954.m23074("Cipher.AESRFC5649WRAP", C8954.m23074("Cipher.AESRFC3211WRAP", C8954.m23074("Alg.Alias.Cipher.AESKWP", "AESWRAPPAD", str, "$RFC3211Wrap", configurableProvider), str, "$RFC5649Wrap", configurableProvider), str, "$AlgParamGenCCM", configurableProvider), "Alg.Alias.AlgorithmParameterGenerator.", aSN1ObjectIdentifier7), "CCM", "Alg.Alias.AlgorithmParameterGenerator.", aSN1ObjectIdentifier8), "CCM", "Alg.Alias.AlgorithmParameterGenerator.", aSN1ObjectIdentifier9), "CCM");
            configurableProvider.addAttributes("Cipher.CCM", AES.generalAesAttributes);
            StringBuilder sbM32309 = C13325.m32309(configurableProvider, "Cipher", C9045.m23341(C4153.m12553("$CCM192", "Cipher", C13325.m32309(configurableProvider, "Cipher", C8954.m23074("Cipher.CCM", str + "$CCM", str, "$CCM128", configurableProvider), str, aSN1ObjectIdentifier7), aSN1ObjectIdentifier8, configurableProvider), str, "$CCM256"), str, aSN1ObjectIdentifier9);
            sbM32309.append("$AlgParamGenGCM");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.GCM", sbM32309.toString());
            C19462.m44861(C18473.m42951("GCM", "Alg.Alias.AlgorithmParameterGenerator.", C18473.m42951("GCM", "Alg.Alias.AlgorithmParameterGenerator.", new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier4, configurableProvider), aSN1ObjectIdentifier5, configurableProvider), aSN1ObjectIdentifier6, configurableProvider, "GCM");
            configurableProvider.addAttributes("Cipher.GCM", AES.generalAesAttributes);
            StringBuilder sbM10502 = C3435.m10502("$AESCMAC", "Mac.AESCMAC", str, C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen192", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C5368.m15340(str, "$KeyGen", "KeyGenerator.AESWRAPPAD", C4153.m12553("$KeyGen256", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen128", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen192", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen256", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen128", "KeyGenerator", C3435.m10502("$KeyGen", "KeyGenerator.AESWRAP", str, C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen256", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen256", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen192", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen192", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen128", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen128", "KeyGenerator", C3435.m10502("$KeyGen256", "KeyGenerator.2.16.840.1.101.3.4.42", str, C3435.m10502("$KeyGen192", "KeyGenerator.2.16.840.1.101.3.4.22", str, C3435.m10502("$KeyGen128", "KeyGenerator.2.16.840.1.101.3.4.2", str, C3435.m10502("$KeyGen", "KeyGenerator.AES", str, C13325.m32309(configurableProvider, "Cipher", C9045.m23341(C4153.m12553("$GCM192", "Cipher", C13325.m32309(configurableProvider, "Cipher", C8954.m23074("Cipher.GCM", str + "$GCM", str, "$GCM128", configurableProvider), str, aSN1ObjectIdentifier4), aSN1ObjectIdentifier5, configurableProvider), str, "$GCM256"), str, aSN1ObjectIdentifier6), configurableProvider), configurableProvider), configurableProvider), configurableProvider), aSN1ObjectIdentifier10, configurableProvider), str, "$KeyGen128"), str, aSN1ObjectIdentifier), aSN1ObjectIdentifier13, configurableProvider), str, "$KeyGen128"), str, aSN1ObjectIdentifier16), aSN1ObjectIdentifier11, configurableProvider), str, "$KeyGen192"), str, aSN1ObjectIdentifier2), aSN1ObjectIdentifier14, configurableProvider), str, "$KeyGen192"), str, aSN1ObjectIdentifier17), aSN1ObjectIdentifier12, configurableProvider), str, "$KeyGen256"), str, aSN1ObjectIdentifier3), aSN1ObjectIdentifier15, configurableProvider), str, "$KeyGen256"), str, aSN1ObjectIdentifier18), configurableProvider), aSN1ObjectIdentifier19, configurableProvider), str, "$KeyGen192"), str, aSN1ObjectIdentifier20), aSN1ObjectIdentifier21, configurableProvider), str, "$KeyGen128"), str, aSN1ObjectIdentifier4), aSN1ObjectIdentifier5, configurableProvider), str, "$KeyGen256"), str, aSN1ObjectIdentifier6), aSN1ObjectIdentifier7, configurableProvider), str, "$KeyGen192"), str, aSN1ObjectIdentifier8), aSN1ObjectIdentifier9, configurableProvider), configurableProvider), str, "$KeyGen128"), str, aSN1ObjectIdentifier22), aSN1ObjectIdentifier23, configurableProvider), str, "$KeyGen256"), str, aSN1ObjectIdentifier24), configurableProvider);
            sbM10502.append("$AESCCMMAC");
            configurableProvider.addAlgorithm("Mac.AESCCMMAC", sbM10502.toString());
            StringBuilder sbM46316 = C20094.m46316(str, "$AESCCMMAC128", "Mac." + aSN1ObjectIdentifier7.getId(), "Mac.", configurableProvider);
            sbM46316.append(aSN1ObjectIdentifier8.getId());
            StringBuilder sbM46317 = C20094.m46316(str, "$AESCCMMAC192", sbM46316.toString(), "Mac.", configurableProvider);
            sbM46317.append(aSN1ObjectIdentifier9.getId());
            configurableProvider.addAlgorithm(sbM46317.toString(), str + "$AESCCMMAC256");
            ASN1ObjectIdentifier aSN1ObjectIdentifier25 = BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes128_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier25, "PBEWITHSHAAND128BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier26 = BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes192_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier26, "PBEWITHSHAAND192BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier27 = BCObjectIdentifiers.bc_pbe_sha1_pkcs12_aes256_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier27, "PBEWITHSHAAND256BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier28 = BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes128_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier28, "PBEWITHSHA256AND128BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier29 = BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes192_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier29, "PBEWITHSHA256AND192BITAES-CBC-BC");
            ASN1ObjectIdentifier aSN1ObjectIdentifier30 = BCObjectIdentifiers.bc_pbe_sha256_pkcs12_aes256_cbc;
            C3200.m9836(C3435.m10502("$PBEWithSHA256AESCBC192", "Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", str, C3435.m10502("$PBEWithSHA256AESCBC128", "Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", str, C3435.m10502("$PBEWithSHA1AESCBC256", "Cipher.PBEWITHSHAAND256BITAES-CBC-BC", str, C3435.m10502("$PBEWithSHA1AESCBC192", "Cipher.PBEWITHSHAAND192BITAES-CBC-BC", str, C3435.m10502("$PBEWithSHA1AESCBC128", "Cipher.PBEWITHSHAAND128BITAES-CBC-BC", str, C13325.m32309(configurableProvider, "Alg.Alias.Cipher", "PBEWITHSHA256AND256BITAES-CBC-BC", str, aSN1ObjectIdentifier30), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), "$PBEWithSHA256AESCBC256", configurableProvider, "Cipher.PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            C12662.m30943(str, "$KeyFactory", "SecretKeyFactory.AES", C5368.m15340(str, "$PBEWithAESCBC", "Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", C5368.m15340(str, "$PBEWithAESCBC", "Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", C5368.m15340(str, "$PBEWithAESCBC", "Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", C20382.m46696("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC", "Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC", configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("SecretKeyFactory", NISTObjectIdentifiers.aes, str + "$KeyFactory");
            C12662.m30943(str, "$PBEWithSHA256And256BitAESBC", "SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", C5368.m15340(str, "$PBEWithSHA256And192BitAESBC", "SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", C5368.m15340(str, "$PBEWithSHA256And128BitAESBC", "SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", C5368.m15340(str, "$PBEWithSHAAnd256BitAESBC", "SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", C5368.m15340(str, "$PBEWithSHAAnd192BitAESBC", "SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", C5368.m15340(str, "$PBEWithSHAAnd128BitAESBC", "SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", C5368.m15340(str, "$PBEWithMD5And256BitAESCBCOpenSSL", "SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", C5368.m15340(str, "$PBEWithMD5And192BitAESCBCOpenSSL", "SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", C5368.m15340(str, "$PBEWithMD5And128BitAESCBCOpenSSL", "SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", new StringBuilder(), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier25, "PBEWITHSHAAND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier26, "PBEWITHSHAAND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier27, "PBEWITHSHAAND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier28, "PBEWITHSHA256AND128BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier29, "PBEWITHSHA256AND192BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier30, "PBEWITHSHA256AND256BITAES-CBC-BC");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier25.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier26.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier27.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier28.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier29.getId(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier30.getId(), "PKCS12PBE");
            addGMacAlgorithm(configurableProvider, "AES", str + "$AESGMAC", C16014.m37867(str, "$KeyGen128"));
            addPoly1305Algorithm(configurableProvider, "AES", C16014.m37867(str, "$Poly1305"), C16014.m37867(str, "$Poly1305KeyGen"));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class OFB extends BaseBlockCipher {
        public OFB() {
            super(new DefaultBufferedBlockCipher(new OFBBlockCipher(AESEngine.newInstance(), 128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class OFB128 extends BaseBlockCipher {
        public OFB128() {
            super(128, new DefaultBufferedBlockCipher(new OFBBlockCipher(AESEngine.newInstance(), 128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class OFB192 extends BaseBlockCipher {
        public OFB192() {
            super(192, new DefaultBufferedBlockCipher(new OFBBlockCipher(AESEngine.newInstance(), 128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class OFB256 extends BaseBlockCipher {
        public OFB256() {
            super(256, new DefaultBufferedBlockCipher(new OFBBlockCipher(AESEngine.newInstance(), 128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithAESCBC extends BaseBlockCipher {
        public PBEWithAESCBC() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithMD5And128BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And128BitAESCBCOpenSSL() {
            super("PBEWithMD5And128BitAES-CBC-OpenSSL", null, true, 3, 0, 128, 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithMD5And192BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And192BitAESCBCOpenSSL() {
            super("PBEWithMD5And192BitAES-CBC-OpenSSL", null, true, 3, 0, 192, 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithMD5And256BitAESCBCOpenSSL extends PBESecretKeyFactory {
        public PBEWithMD5And256BitAESCBCOpenSSL() {
            super("PBEWithMD5And256BitAES-CBC-OpenSSL", null, true, 3, 0, 256, 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHA1AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC128() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 2, 1, 128, 16);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHA1AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC192() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 2, 1, 192, 16);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHA1AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA1AESCBC256() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 2, 1, 256, 16);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHA256AESCBC128 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC128() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 2, 4, 128, 16);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHA256AESCBC192 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC192() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 2, 4, 192, 16);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHA256AESCBC256 extends BaseBlockCipher {
        public PBEWithSHA256AESCBC256() {
            super(CBCBlockCipher.newInstance(AESEngine.newInstance()), 2, 4, 256, 16);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHA256And128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And128BitAESBC() {
            super("PBEWithSHA256And128BitAES-CBC-BC", null, true, 2, 4, 128, 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHA256And192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And192BitAESBC() {
            super("PBEWithSHA256And192BitAES-CBC-BC", null, true, 2, 4, 192, 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHA256And256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHA256And256BitAESBC() {
            super("PBEWithSHA256And256BitAES-CBC-BC", null, true, 2, 4, 256, 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHAAnd128BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd128BitAESBC() {
            super("PBEWithSHA1And128BitAES-CBC-BC", null, true, 2, 1, 128, 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHAAnd192BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd192BitAESBC() {
            super("PBEWithSHA1And192BitAES-CBC-BC", null, true, 2, 1, 192, 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHAAnd256BitAESBC extends PBESecretKeyFactory {
        public PBEWithSHAAnd256BitAESBC() {
            super("PBEWithSHA1And256BitAES-CBC-BC", null, true, 2, 1, 256, 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(AESEngine.newInstance()));
        }
    }

    public class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-AES", 256, new Poly1305KeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new RFC3211WrapEngine(AESEngine.newInstance()), 16);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class RFC5649Wrap extends BaseWrapCipher {
        public RFC5649Wrap() {
            super(new RFC5649WrapEngine(AESEngine.newInstance()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new AESWrapEngine());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Wrap128 extends BaseWrapCipher {
        public Wrap128() {
            super(new AESWrapEngine());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Wrap192 extends BaseWrapCipher {
        public Wrap192() {
            super(new AESWrapEngine());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Wrap256 extends BaseWrapCipher {
        public Wrap256() {
            super(new AESWrapEngine());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class WrapPad extends BaseWrapCipher {
        public WrapPad() {
            super(new AESWrapPadEngine());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class WrapPad128 extends BaseWrapCipher {
        public WrapPad128() {
            super(new AESWrapPadEngine());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class WrapPad192 extends BaseWrapCipher {
        public WrapPad192() {
            super(new AESWrapPadEngine());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class WrapPad256 extends BaseWrapCipher {
        public WrapPad256() {
            super(new AESWrapPadEngine());
        }
    }

    static {
        HashMap map = new HashMap();
        generalAesAttributes = map;
        map.put("SupportedKeyClasses", "javax.crypto.SecretKey");
        map.put("SupportedKeyFormats", "RAW");
    }
}
