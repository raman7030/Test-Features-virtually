package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import l.C12662;
import l.C13325;
import l.C16014;
import l.C3435;
import l.C4153;
import l.C8954;
import l.C9045;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.SEEDEngine;
import org.bouncycastle.crypto.engines.SEEDWrapEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.internal.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

/* JADX INFO: loaded from: classes.dex */
public final class SEED {

    public class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("SEED");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for SEED parameter generation.");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "SEED IV";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC extends BaseBlockCipher {
        public CBC() {
            super(128, new CBCBlockCipher(new SEEDEngine()), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CMAC extends BaseMac {
        public CMAC() {
            super(new CMac(new SEEDEngine()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB extends BaseBlockCipher {
        public ECB() {
            super(128, new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.SEED.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new SEEDEngine();
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class GMAC extends BaseMac {
        public GMAC() {
            super(new GMac(GCMBlockCipher.newInstance(new SEEDEngine())));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("SEED", null);
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SEED", 128, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends SymmetricAlgorithmProvider {
        public static final String PREFIX = SEED.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.SEED", sb.toString());
            StringBuilder sb2 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = KISAObjectIdentifiers.id_seedCBC;
            StringBuilder sbM23342 = C9045.m23342("SEED", str, sb2, aSN1ObjectIdentifier, configurableProvider);
            sbM23342.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.SEED", sbM23342.toString());
            C12662.m30943(str, "$Wrap", "Cipher.SEEDWRAP", C4153.m12553("$CBC", "Cipher", C3435.m10502("$ECB", "Cipher.SEED", str, C9045.m23342("SEED", str, new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier, configurableProvider), configurableProvider), aSN1ObjectIdentifier, configurableProvider), configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap;
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", aSN1ObjectIdentifier2, "SEEDWRAP");
            C12662.m30943(str, "$KeyFactory", "SecretKeyFactory.SEED", C4153.m12553("$KeyGen", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C8954.m23074("KeyGenerator.SEED", C8954.m23074("Alg.Alias.Cipher.SEEDKW", "SEEDWRAP", str, "$KeyGen", configurableProvider), str, "$KeyGen", configurableProvider), str, aSN1ObjectIdentifier), aSN1ObjectIdentifier2, configurableProvider), configurableProvider);
            StringBuilder sbM32309 = C13325.m32309(configurableProvider, "Alg.Alias.SecretKeyFactory", "SEED", str, aSN1ObjectIdentifier);
            sbM32309.append("$CMAC");
            addCMacAlgorithm(configurableProvider, "SEED", sbM32309.toString(), C16014.m37867(str, "$KeyGen"));
            addGMacAlgorithm(configurableProvider, "SEED", C16014.m37867(str, "$GMAC"), C16014.m37867(str, "$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "SEED", C16014.m37867(str, "$Poly1305"), C16014.m37867(str, "$Poly1305KeyGen"));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new SEEDEngine()));
        }
    }

    public class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-SEED", 256, new Poly1305KeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(128, new SEEDWrapEngine());
        }
    }
}
