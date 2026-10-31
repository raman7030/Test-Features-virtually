package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import l.C16014;
import l.C5368;
import l.C9045;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.SM4Engine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

/* JADX INFO: loaded from: classes.dex */
public final class SM4 {

    public class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("SM4");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for SM4 parameter generation.");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "SM4 IV";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CMAC extends BaseMac {
        public CMAC() {
            super(new CMac(new SM4Engine()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.SM4.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new SM4Engine();
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class GMAC extends BaseMac {
        public GMAC() {
            super(new GMac(GCMBlockCipher.newInstance(new SM4Engine())));
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SM4", 128, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends SymmetricAlgorithmProvider {
        public static final String PREFIX = SM4.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            addCMacAlgorithm(configurableProvider, "SM4", C9045.m23341(C5368.m15340(str, "$KeyGen", "KeyGenerator.SM4", C5368.m15340(str, "$ECB", "Cipher.SM4", C5368.m15340(str, "$AlgParamGen", "AlgorithmParameterGenerator.SM4", C5368.m15340(str, "$AlgParams", "AlgorithmParameters.SM4", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), str, "$CMAC"), C16014.m37867(str, "$KeyGen"));
            addGMacAlgorithm(configurableProvider, "SM4", C16014.m37867(str, "$GMAC"), C16014.m37867(str, "$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "SM4", C16014.m37867(str, "$Poly1305"), C16014.m37867(str, "$Poly1305KeyGen"));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new SM4Engine()));
        }
    }

    public class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-SM4", 256, new Poly1305KeyGenerator());
        }
    }
}
