package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import l.C12662;
import l.C13325;
import l.C20382;
import l.C3200;
import l.C3435;
import l.C5368;
import l.C8954;
import l.C9045;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.IDEAEngine;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.internal.asn1.misc.IDEACBCPar;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public final class IDEA {

    public class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("IDEA");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for IDEA parameter generation.");
        }
    }

    public class AlgParams extends BaseAlgorithmParameters {
        public byte[] iv;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            return engineGetEncoded("ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str)) {
                return new IDEACBCPar(engineGetEncoded("RAW")).getEncoded();
            }
            if (!str.equals("RAW")) {
                return null;
            }
            byte[] bArr = this.iv;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            }
            this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) {
            byte[] bArr2 = new byte[bArr.length];
            this.iv = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (str.equals("RAW")) {
                engineInit(bArr);
            } else {
                if (!str.equals("ASN.1")) {
                    throw new IOException("Unknown parameters format in IV parameters object");
                }
                engineInit(IDEACBCPar.getInstance(bArr).getIV());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "IDEA Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to IV parameters object.");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC extends BaseBlockCipher {
        public CBC() {
            super(CBCBlockCipher.newInstance(new IDEAEngine()), 64);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CFB8Mac extends BaseMac {
        public CFB8Mac() {
            super(new CFBBlockCipherMac(new IDEAEngine()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB extends BaseBlockCipher {
        public ECB() {
            super(new IDEAEngine());
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("IDEA", 128, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mac extends BaseMac {
        public Mac() {
            super(new CBCBlockCipherMac(new IDEAEngine()));
        }
    }

    public class Mappings extends AlgorithmProvider {
        public static final String PREFIX = IDEA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$AlgParams", "AlgorithmParameters.1.3.6.1.4.1.188.7.1.1.2", C5368.m15340(str, "$AlgParams", "AlgorithmParameters.IDEA", C5368.m15340(str, "$AlgParamGen", "AlgorithmParameterGenerator.1.3.6.1.4.1.188.7.1.1.2", C5368.m15340(str, "$AlgParamGen", "AlgorithmParameterGenerator.IDEA", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            C12662.m30943(str, "$ECB", "Cipher.IDEA", C20382.m46696("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA", "PKCS12PBE", "Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA-CBC", "PKCS12PBE", configurableProvider), configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.as_sys_sec_alg_ideaCBC;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, str + "$CBC");
            C3200.m9836(C3435.m10502("$PBEWithSHAAndIDEAKeyGen", "SecretKeyFactory.PBEWITHSHAANDIDEA-CBC", str, C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C5368.m15340(str, "$KeyGen", "KeyGenerator.IDEA", C5368.m15340(str, "$PBEWithSHAAndIDEA", "Cipher.PBEWITHSHAANDIDEA-CBC", new StringBuilder(), configurableProvider), configurableProvider), str, "$KeyGen"), str, aSN1ObjectIdentifier), configurableProvider), "$Mac", configurableProvider, "Mac.IDEAMAC");
            configurableProvider.addAlgorithm("Mac.IDEAMAC/CFB8", C8954.m23074("Alg.Alias.Mac.IDEA", "IDEAMAC", str, "$CFB8Mac", configurableProvider));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.IDEA/CFB8", "IDEAMAC/CFB8");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHAAndIDEA extends BaseBlockCipher {
        public PBEWithSHAAndIDEA() {
            super(CBCBlockCipher.newInstance(new IDEAEngine()), 2, 1, 128, 8);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHAAndIDEAKeyGen extends PBESecretKeyFactory {
        public PBEWithSHAAndIDEAKeyGen() {
            super("PBEwithSHAandIDEA-CBC", null, true, 2, 1, 128, 64);
        }
    }
}
