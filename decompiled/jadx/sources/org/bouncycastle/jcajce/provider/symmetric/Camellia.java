package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import l.C11010;
import l.C12662;
import l.C13325;
import l.C16014;
import l.C3200;
import l.C3435;
import l.C4153;
import l.C5368;
import l.C9045;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.CamelliaEngine;
import org.bouncycastle.crypto.engines.CamelliaWrapEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.internal.asn1.ntt.NTTObjectIdentifiers;
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
public final class Camellia {

    public class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("Camellia");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for Camellia parameter generation.");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Camellia IV";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new CamelliaEngine()), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC128 extends BaseBlockCipher {
        public CBC128() {
            super(128, new CBCBlockCipher(new CamelliaEngine()), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC192 extends BaseBlockCipher {
        public CBC192() {
            super(192, new CBCBlockCipher(new CamelliaEngine()), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC256 extends BaseBlockCipher {
        public CBC256() {
            super(256, new CBCBlockCipher(new CamelliaEngine()), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Camellia.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new CamelliaEngine();
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class GMAC extends BaseMac {
        public GMAC() {
            super(new GMac(GCMBlockCipher.newInstance(new CamelliaEngine())));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("Camellia", null);
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("Camellia", i, new CipherKeyGenerator());
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
        public static final String PREFIX = Camellia.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$AlgParams", "AlgorithmParameters.CAMELLIA", sb, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NTTObjectIdentifiers.id_camellia128_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", aSN1ObjectIdentifier, "CAMELLIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NTTObjectIdentifiers.id_camellia192_cbc;
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", aSN1ObjectIdentifier2, "CAMELLIA");
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NTTObjectIdentifiers.id_camellia256_cbc;
            C3200.m9836(C13325.m32309(configurableProvider, "Alg.Alias.AlgorithmParameters", "CAMELLIA", str, aSN1ObjectIdentifier3), "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", aSN1ObjectIdentifier2, "CAMELLIA");
            C12662.m30943(str, "$Wrap", "Cipher.CAMELLIAWRAP", C5368.m15340(str, "$RFC3211Wrap", "Cipher.CAMELLIARFC3211WRAP", C4153.m12553("$CBC256", "Cipher", C13325.m32309(configurableProvider, "Cipher", C9045.m23341(C4153.m12553("$CBC128", "Cipher", C3435.m10502("$ECB", "Cipher.CAMELLIA", str, C13325.m32309(configurableProvider, "Alg.Alias.AlgorithmParameterGenerator", "CAMELLIA", str, aSN1ObjectIdentifier3), configurableProvider), aSN1ObjectIdentifier, configurableProvider), str, "$CBC192"), str, aSN1ObjectIdentifier2), aSN1ObjectIdentifier3, configurableProvider), configurableProvider), configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NTTObjectIdentifiers.id_camellia128_wrap;
            C11010.m27351(configurableProvider, str, "$Wrap128", "Cipher", aSN1ObjectIdentifier4);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NTTObjectIdentifiers.id_camellia192_wrap;
            C11010.m27351(configurableProvider, str, "$Wrap192", "Cipher", aSN1ObjectIdentifier5);
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NTTObjectIdentifiers.id_camellia256_wrap;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier6, str + "$Wrap256");
            C12662.m30943(str, "$KeyFactory", "SecretKeyFactory.CAMELLIA", new StringBuilder(), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier, "CAMELLIA");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", aSN1ObjectIdentifier2, "CAMELLIA");
            StringBuilder sbM32309 = C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen192", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen256", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen128", "KeyGenerator", C3435.m10502("$KeyGen", "KeyGenerator.CAMELLIA", str, C13325.m32309(configurableProvider, "Alg.Alias.SecretKeyFactory", "CAMELLIA", str, aSN1ObjectIdentifier3), configurableProvider), aSN1ObjectIdentifier4, configurableProvider), str, "$KeyGen192"), str, aSN1ObjectIdentifier5), aSN1ObjectIdentifier6, configurableProvider), str, "$KeyGen128"), str, aSN1ObjectIdentifier), aSN1ObjectIdentifier2, configurableProvider), str, "$KeyGen256"), str, aSN1ObjectIdentifier3);
            sbM32309.append("$GMAC");
            addGMacAlgorithm(configurableProvider, "CAMELLIA", sbM32309.toString(), C16014.m37867(str, "$KeyGen"));
            addPoly1305Algorithm(configurableProvider, "CAMELLIA", C16014.m37867(str, "$Poly1305"), C16014.m37867(str, "$Poly1305KeyGen"));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new CamelliaEngine()));
        }
    }

    public class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Camellia", 256, new Poly1305KeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class RFC3211Wrap extends BaseWrapCipher {
        public RFC3211Wrap() {
            super(new RFC3211WrapEngine(new CamelliaEngine()), 16);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new CamelliaWrapEngine());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Wrap128 extends BaseWrapCipher {
        public Wrap128() {
            super(128, new CamelliaWrapEngine());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Wrap192 extends BaseWrapCipher {
        public Wrap192() {
            super(192, new CamelliaWrapEngine());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Wrap256 extends BaseWrapCipher {
        public Wrap256() {
            super(256, new CamelliaWrapEngine());
        }
    }
}
