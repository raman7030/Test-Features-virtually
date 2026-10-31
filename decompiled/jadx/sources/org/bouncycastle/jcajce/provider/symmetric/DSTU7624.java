package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import l.C11010;
import l.C12662;
import l.C13325;
import l.C18515;
import l.C3200;
import l.C3435;
import l.C4153;
import l.C5368;
import l.C8954;
import l.C9045;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ua.UAObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.DSTU7624Engine;
import org.bouncycastle.crypto.engines.DSTU7624WrapEngine;
import org.bouncycastle.crypto.macs.KGMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.KCCMBlockCipher;
import org.bouncycastle.crypto.modes.KCTRBlockCipher;
import org.bouncycastle.crypto.modes.KGCMBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

/* JADX INFO: loaded from: classes.dex */
public class DSTU7624 {

    public class AlgParamGen extends BaseAlgorithmParameterGenerator {
        public final int ivLength;

        public AlgParamGen(int i) {
            this.ivLength = i / 8;
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[this.ivLength];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("DSTU7624");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSTU7624 parameter generation.");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParamGen128 extends AlgParamGen {
        public AlgParamGen128() {
            super(128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParamGen256 extends AlgParamGen {
        public AlgParamGen256() {
            super(256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParamGen512 extends AlgParamGen {
        public AlgParamGen512() {
            super(512);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "DSTU7624 IV";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC128 extends BaseBlockCipher {
        public CBC128() {
            super(new CBCBlockCipher(new DSTU7624Engine(128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC256 extends BaseBlockCipher {
        public CBC256() {
            super(new CBCBlockCipher(new DSTU7624Engine(256)), 256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC512 extends BaseBlockCipher {
        public CBC512() {
            super(new CBCBlockCipher(new DSTU7624Engine(512)), 512);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CCM128 extends BaseBlockCipher {
        public CCM128() {
            super(new KCCMBlockCipher(new DSTU7624Engine(128)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CCM256 extends BaseBlockCipher {
        public CCM256() {
            super(new KCCMBlockCipher(new DSTU7624Engine(256)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CCM512 extends BaseBlockCipher {
        public CCM512() {
            super(new KCCMBlockCipher(new DSTU7624Engine(512)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CFB128 extends BaseBlockCipher {
        public CFB128() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new DSTU7624Engine(128), 128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CFB256 extends BaseBlockCipher {
        public CFB256() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new DSTU7624Engine(256), 256)), 256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CFB512 extends BaseBlockCipher {
        public CFB512() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new DSTU7624Engine(512), 512)), 512);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CTR128 extends BaseBlockCipher {
        public CTR128() {
            super(new BufferedBlockCipher(new KCTRBlockCipher(new DSTU7624Engine(128))), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CTR256 extends BaseBlockCipher {
        public CTR256() {
            super(new BufferedBlockCipher(new KCTRBlockCipher(new DSTU7624Engine(256))), 256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CTR512 extends BaseBlockCipher {
        public CTR512() {
            super(new BufferedBlockCipher(new KCTRBlockCipher(new DSTU7624Engine(512))), 512);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.DSTU7624.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new DSTU7624Engine(128);
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB128 extends BaseBlockCipher {
        public ECB128() {
            super(new DSTU7624Engine(128));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB256 extends BaseBlockCipher {
        public ECB256() {
            super(new DSTU7624Engine(256));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB512 extends BaseBlockCipher {
        public ECB512() {
            super(new DSTU7624Engine(512));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB_128 extends BaseBlockCipher {
        public ECB_128() {
            super(new DSTU7624Engine(128));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB_256 extends BaseBlockCipher {
        public ECB_256() {
            super(new DSTU7624Engine(256));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB_512 extends BaseBlockCipher {
        public ECB_512() {
            super(new DSTU7624Engine(512));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class GCM128 extends BaseBlockCipher {
        public GCM128() {
            super(new KGCMBlockCipher(new DSTU7624Engine(128)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class GCM256 extends BaseBlockCipher {
        public GCM256() {
            super(new KGCMBlockCipher(new DSTU7624Engine(256)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class GCM512 extends BaseBlockCipher {
        public GCM512() {
            super(new KGCMBlockCipher(new DSTU7624Engine(512)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class GMAC extends BaseMac {
        public GMAC() {
            super(new KGMac(new KGCMBlockCipher(new DSTU7624Engine(128)), 128));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class GMAC128 extends BaseMac {
        public GMAC128() {
            super(new KGMac(new KGCMBlockCipher(new DSTU7624Engine(128)), 128));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class GMAC256 extends BaseMac {
        public GMAC256() {
            super(new KGMac(new KGCMBlockCipher(new DSTU7624Engine(256)), 256));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class GMAC512 extends BaseMac {
        public GMAC512() {
            super(new KGMac(new KGCMBlockCipher(new DSTU7624Engine(512)), 512));
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("DSTU7624", i, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyGen512 extends KeyGen {
        public KeyGen512() {
            super(512);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class OFB128 extends BaseBlockCipher {
        public OFB128() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new DSTU7624Engine(128), 128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class OFB256 extends BaseBlockCipher {
        public OFB256() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new DSTU7624Engine(256), 256)), 256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class OFB512 extends BaseBlockCipher {
        public OFB512() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new DSTU7624Engine(512), 512)), 512);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new DSTU7624WrapEngine(128));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Wrap128 extends BaseWrapCipher {
        public Wrap128() {
            super(new DSTU7624WrapEngine(128));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Wrap256 extends BaseWrapCipher {
        public Wrap256() {
            super(new DSTU7624WrapEngine(256));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Wrap512 extends BaseWrapCipher {
        public Wrap512() {
            super(new DSTU7624WrapEngine(512));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends SymmetricAlgorithmProvider {
        public static final String PREFIX = DSTU7624.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$AlgParams", "AlgorithmParameters.DSTU7624", sb, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = UAObjectIdentifiers.dstu7624cbc_128;
            C11010.m27351(configurableProvider, str, "$AlgParams", "AlgorithmParameters", aSN1ObjectIdentifier);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = UAObjectIdentifiers.dstu7624cbc_256;
            C11010.m27351(configurableProvider, str, "$AlgParams", "AlgorithmParameters", aSN1ObjectIdentifier2);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = UAObjectIdentifiers.dstu7624cbc_512;
            configurableProvider.addAlgorithm("AlgorithmParameters", aSN1ObjectIdentifier3, str + "$AlgParams");
            C3200.m9836(C3435.m10502("$ECB_256", "Cipher.DSTU7624-256", str, C3435.m10502("$ECB_128", "Cipher.DSTU7624-128", str, C3435.m10502("$ECB_128", "Cipher.DSTU7624", str, C13325.m32309(configurableProvider, "AlgorithmParameterGenerator", C9045.m23341(C4153.m12553("$AlgParamGen256", "AlgorithmParameterGenerator", C13325.m32309(configurableProvider, "AlgorithmParameterGenerator", C9045.m23341(C5368.m15340(str, "$AlgParamGen128", "AlgorithmParameterGenerator.DSTU7624", new StringBuilder(), configurableProvider), str, "$AlgParamGen128"), str, aSN1ObjectIdentifier), aSN1ObjectIdentifier2, configurableProvider), str, "$AlgParamGen512"), str, aSN1ObjectIdentifier3), configurableProvider), configurableProvider), configurableProvider), "$ECB_512", configurableProvider, "Cipher.DSTU7624-512");
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = UAObjectIdentifiers.dstu7624ecb_128;
            C11010.m27351(configurableProvider, str, "$ECB128", "Cipher", aSN1ObjectIdentifier4);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = UAObjectIdentifiers.dstu7624ecb_256;
            C11010.m27351(configurableProvider, str, "$ECB256", "Cipher", aSN1ObjectIdentifier5);
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = UAObjectIdentifiers.dstu7624ecb_512;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier6, str + "$ECB512");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier3, C9045.m23341(C4153.m12553("$CBC256", "Cipher", C13325.m32309(configurableProvider, "Cipher", C9045.m23341(new StringBuilder(), str, "$CBC128"), str, aSN1ObjectIdentifier), aSN1ObjectIdentifier2, configurableProvider), str, "$CBC512"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = UAObjectIdentifiers.dstu7624ofb_128;
            C11010.m27351(configurableProvider, str, "$OFB128", "Cipher", aSN1ObjectIdentifier7);
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = UAObjectIdentifiers.dstu7624ofb_256;
            C11010.m27351(configurableProvider, str, "$OFB256", "Cipher", aSN1ObjectIdentifier8);
            ASN1ObjectIdentifier aSN1ObjectIdentifier9 = UAObjectIdentifiers.dstu7624ofb_512;
            C11010.m27351(configurableProvider, str, "$OFB512", "Cipher", aSN1ObjectIdentifier9);
            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = UAObjectIdentifiers.dstu7624cfb_128;
            C11010.m27351(configurableProvider, str, "$CFB128", "Cipher", aSN1ObjectIdentifier10);
            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = UAObjectIdentifiers.dstu7624cfb_256;
            C11010.m27351(configurableProvider, str, "$CFB256", "Cipher", aSN1ObjectIdentifier11);
            ASN1ObjectIdentifier aSN1ObjectIdentifier12 = UAObjectIdentifiers.dstu7624cfb_512;
            C11010.m27351(configurableProvider, str, "$CFB512", "Cipher", aSN1ObjectIdentifier12);
            ASN1ObjectIdentifier aSN1ObjectIdentifier13 = UAObjectIdentifiers.dstu7624ctr_128;
            C11010.m27351(configurableProvider, str, "$CTR128", "Cipher", aSN1ObjectIdentifier13);
            ASN1ObjectIdentifier aSN1ObjectIdentifier14 = UAObjectIdentifiers.dstu7624ctr_256;
            C11010.m27351(configurableProvider, str, "$CTR256", "Cipher", aSN1ObjectIdentifier14);
            ASN1ObjectIdentifier aSN1ObjectIdentifier15 = UAObjectIdentifiers.dstu7624ctr_512;
            C11010.m27351(configurableProvider, str, "$CTR512", "Cipher", aSN1ObjectIdentifier15);
            ASN1ObjectIdentifier aSN1ObjectIdentifier16 = UAObjectIdentifiers.dstu7624ccm_128;
            C11010.m27351(configurableProvider, str, "$CCM128", "Cipher", aSN1ObjectIdentifier16);
            ASN1ObjectIdentifier aSN1ObjectIdentifier17 = UAObjectIdentifiers.dstu7624ccm_256;
            C11010.m27351(configurableProvider, str, "$CCM256", "Cipher", aSN1ObjectIdentifier17);
            ASN1ObjectIdentifier aSN1ObjectIdentifier18 = UAObjectIdentifiers.dstu7624ccm_512;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier18, str + "$CCM512");
            C12662.m30943(str, "$Wrap", "Cipher.DSTU7624KW", new StringBuilder(), configurableProvider);
            StringBuilder sbM43029 = C18515.m43029(configurableProvider, "Cipher.DSTU7624-128KW", C8954.m23074("Alg.Alias.Cipher.DSTU7624WRAP", "DSTU7624KW", str, "$Wrap128", configurableProvider), "Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier19 = UAObjectIdentifiers.dstu7624kw_128;
            sbM43029.append(aSN1ObjectIdentifier19.getId());
            configurableProvider.addAlgorithm(sbM43029.toString(), "DSTU7624-128KW");
            StringBuilder sbM430210 = C18515.m43029(configurableProvider, "Cipher.DSTU7624-256KW", C8954.m23074("Alg.Alias.Cipher.DSTU7624-128WRAP", "DSTU7624-128KW", str, "$Wrap256", configurableProvider), "Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier20 = UAObjectIdentifiers.dstu7624kw_256;
            sbM430210.append(aSN1ObjectIdentifier20.getId());
            configurableProvider.addAlgorithm(sbM430210.toString(), "DSTU7624-256KW");
            StringBuilder sbM430211 = C18515.m43029(configurableProvider, "Cipher.DSTU7624-512KW", C8954.m23074("Alg.Alias.Cipher.DSTU7624-256WRAP", "DSTU7624-256KW", str, "$Wrap512", configurableProvider), "Alg.Alias.Cipher.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier21 = UAObjectIdentifiers.dstu7624kw_512;
            sbM430211.append(aSN1ObjectIdentifier21.getId());
            configurableProvider.addAlgorithm(sbM430211.toString(), "DSTU7624-512KW");
            StringBuilder sbM430212 = C18515.m43029(configurableProvider, "Mac.DSTU7624-128GMAC", C8954.m23074("Mac.DSTU7624GMAC", C8954.m23074("Alg.Alias.Cipher.DSTU7624-512WRAP", "DSTU7624-512KW", str, "$GMAC", configurableProvider), str, "$GMAC128", configurableProvider), "Alg.Alias.Mac.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier22 = UAObjectIdentifiers.dstu7624gmac_128;
            sbM430212.append(aSN1ObjectIdentifier22.getId());
            configurableProvider.addAlgorithm(sbM430212.toString(), "DSTU7624-128GMAC");
            configurableProvider.addAlgorithm("Mac.DSTU7624-256GMAC", str + "$GMAC256");
            StringBuilder sb2 = new StringBuilder("Alg.Alias.Mac.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier23 = UAObjectIdentifiers.dstu7624gmac_256;
            sb2.append(aSN1ObjectIdentifier23.getId());
            configurableProvider.addAlgorithm(sb2.toString(), "DSTU7624-256GMAC");
            configurableProvider.addAlgorithm("Mac.DSTU7624-512GMAC", str + "$GMAC512");
            StringBuilder sb3 = new StringBuilder("Alg.Alias.Mac.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier24 = UAObjectIdentifiers.dstu7624gmac_512;
            sb3.append(aSN1ObjectIdentifier24.getId());
            configurableProvider.addAlgorithm(sb3.toString(), "DSTU7624-512GMAC");
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier24, C9045.m23341(C4153.m12553("$KeyGen256", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen512", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen128", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen256", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen512", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen128", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen256", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen512", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen128", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen256", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen512", "KeyGenerator", C13325.m32309(configurableProvider, "KeyGenerator", C9045.m23341(C4153.m12553("$KeyGen128", "KeyGenerator", C3435.m10502("$KeyGen", "KeyGenerator.DSTU7624", str, sb4, configurableProvider), aSN1ObjectIdentifier19, configurableProvider), str, "$KeyGen256"), str, aSN1ObjectIdentifier20), aSN1ObjectIdentifier21, configurableProvider), str, "$KeyGen128"), str, aSN1ObjectIdentifier4), aSN1ObjectIdentifier5, configurableProvider), str, "$KeyGen512"), str, aSN1ObjectIdentifier6), aSN1ObjectIdentifier, configurableProvider), str, "$KeyGen256"), str, aSN1ObjectIdentifier2), aSN1ObjectIdentifier3, configurableProvider), str, "$KeyGen128"), str, aSN1ObjectIdentifier7), aSN1ObjectIdentifier8, configurableProvider), str, "$KeyGen512"), str, aSN1ObjectIdentifier9), aSN1ObjectIdentifier10, configurableProvider), str, "$KeyGen256"), str, aSN1ObjectIdentifier11), aSN1ObjectIdentifier12, configurableProvider), str, "$KeyGen128"), str, aSN1ObjectIdentifier13), aSN1ObjectIdentifier14, configurableProvider), str, "$KeyGen512"), str, aSN1ObjectIdentifier15), aSN1ObjectIdentifier16, configurableProvider), str, "$KeyGen256"), str, aSN1ObjectIdentifier17), aSN1ObjectIdentifier18, configurableProvider), str, "$KeyGen128"), str, aSN1ObjectIdentifier22), aSN1ObjectIdentifier23, configurableProvider), str, "$KeyGen512"));
        }
    }
}
