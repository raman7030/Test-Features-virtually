package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import l.C12662;
import l.C20094;
import l.C20382;
import l.C3200;
import l.C3435;
import l.C5368;
import l.C8954;
import l.C9045;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.DESedeWrapEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.crypto.generators.DESedeKeyGenerator;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.internal.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public final class DESede {

    public class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("DES");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DES parameter generation.");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC extends BaseBlockCipher {
        public CBC() {
            super(CBCBlockCipher.newInstance(new DESedeEngine()), 64);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBCMAC extends BaseMac {
        public CBCMAC() {
            super(new CBCBlockCipherMac(new DESedeEngine()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CMAC extends BaseMac {
        public CMAC() {
            super(new CMac(new DESedeEngine()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class DESede64 extends BaseMac {
        public DESede64() {
            super(new CBCBlockCipherMac(new DESedeEngine(), 64));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class DESede64with7816d4 extends BaseMac {
        public DESede64with7816d4() {
            super(new CBCBlockCipherMac(new DESedeEngine(), 64, new ISO7816d4Padding()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class DESedeCFB8 extends BaseMac {
        public DESedeCFB8() {
            super(new CFBBlockCipherMac(new DESedeEngine()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB extends BaseBlockCipher {
        public ECB() {
            super(new DESedeEngine());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("DESede", null);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) {
            return keySpec instanceof DESedeKeySpec ? new SecretKeySpec(((DESedeKeySpec) keySpec).getKey(), "DESede") : super.engineGenerateSecret(keySpec);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
            if (cls == null) {
                throw new InvalidKeySpecException("keySpec parameter is null");
            }
            if (secretKey == null) {
                throw new InvalidKeySpecException("key parameter is null");
            }
            if (SecretKeySpec.class.isAssignableFrom(cls)) {
                return new SecretKeySpec(secretKey.getEncoded(), this.algName);
            }
            if (!DESedeKeySpec.class.isAssignableFrom(cls)) {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
            byte[] encoded = secretKey.getEncoded();
            try {
                if (encoded.length != 16) {
                    return new DESedeKeySpec(encoded);
                }
                byte[] bArr = new byte[24];
                System.arraycopy(encoded, 0, bArr, 0, 16);
                System.arraycopy(encoded, 0, bArr, 16, 8);
                return new DESedeKeySpec(bArr);
            } catch (Exception e) {
                throw new InvalidKeySpecException(e.toString());
            }
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        public boolean keySizeSet;

        public KeyGenerator() {
            super("DESede", 192, new DESedeKeyGenerator());
            this.keySizeSet = false;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        public SecretKey engineGenerateKey() {
            if (this.uninitialised) {
                this.engine.init(new KeyGenerationParameters(CryptoServicesRegistrar.getSecureRandom(), this.defaultKeySize));
                this.uninitialised = false;
            }
            if (this.keySizeSet) {
                return new SecretKeySpec(this.engine.generateKey(), this.algName);
            }
            byte[] bArrGenerateKey = this.engine.generateKey();
            System.arraycopy(bArrGenerateKey, 0, bArrGenerateKey, 16, 8);
            return new SecretKeySpec(bArrGenerateKey, this.algName);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator, javax.crypto.KeyGeneratorSpi
        public void engineInit(int i, SecureRandom secureRandom) {
            super.engineInit(i, secureRandom);
            this.keySizeSet = true;
        }
    }

    public class KeyGenerator3 extends BaseKeyGenerator {
        public KeyGenerator3() {
            super("DESede3", 192, new DESedeKeyGenerator());
        }
    }

    public class Mappings extends AlgorithmProvider {
        public static final String PACKAGE = "org.bouncycastle.jcajce.provider.symmetric";
        public static final String PREFIX = DESede.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$ECB", "Cipher.DESEDE", sb, configurableProvider);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.des_EDE3_CBC;
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, str + "$CBC");
            C12662.m30943(str, "$Wrap", "Cipher.DESEDEWRAP", new StringBuilder(), configurableProvider);
            configurableProvider.addAlgorithm("Cipher", PKCSObjectIdentifiers.id_alg_CMS3DESwrap, str + "$Wrap");
            C12662.m30943(str, "$RFC3211", "Cipher.DESEDERFC3211WRAP", new StringBuilder(), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DESEDERFC3217WRAP", "DESEDEWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.TDEA", "DESEDE");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.TDEAWRAP", "DESEDEWRAP");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.TDEA", "DESEDE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.TDEA", "DESEDE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.TDEA", "DESEDE");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.TDEA", "DESEDE");
            if (configurableProvider.hasAlgorithm("MessageDigest", "SHA-1")) {
                configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", str + "$PBEWithSHAAndDES3Key");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                C3200.m9836(sb2, "$PBEWithSHAAndDES2Key", configurableProvider, "Cipher.PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher", PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher", PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC, "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYTRIPLEDES-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYTRIPLEDES-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND3-KEYDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND2-KEYDESEDE-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYDESEDE-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            }
            StringBuilder sbM46316 = C20094.m46316(str, "$KeyGenerator", "KeyGenerator.DESEDE", "KeyGenerator.", configurableProvider);
            sbM46316.append(aSN1ObjectIdentifier);
            configurableProvider.addAlgorithm(sbM46316.toString(), str + "$KeyGenerator3");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            C3200.m9836(C3435.m10502("$KeyGenerator", "KeyGenerator.DESEDEWRAP", str, sb3, configurableProvider), "$KeyFactory", configurableProvider, "SecretKeyFactory.DESEDE");
            configurableProvider.addAlgorithm("SecretKeyFactory", OIWObjectIdentifiers.desEDE, str + "$KeyFactory");
            C12662.m30943(str, "$CBCMAC", "Mac.DESEDEMAC", C5368.m15340(str, "$CMAC", "Mac.DESEDECMAC", new StringBuilder(), configurableProvider), configurableProvider);
            C12662.m30943(str, "$DESede64", "Mac.DESEDEMAC64", C20382.m46696("Mac.DESEDEMAC/CFB8", C8954.m23074("Alg.Alias.Mac.DESEDE", "DESEDEMAC", str, "$DESedeCFB8", configurableProvider), "Alg.Alias.Mac.DESEDE/CFB8", "DESEDEMAC/CFB8", configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Mac.DESEDEMAC64WITHISO7816-4PADDING", C8954.m23074("Alg.Alias.Mac.DESEDE64", "DESEDEMAC64", str, "$DESede64with7816d4", configurableProvider));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESEDE64WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESEDEISO9797ALG1MACWITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.DESEDEISO9797ALG1WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            configurableProvider.addAlgorithm("AlgorithmParameters.DESEDE", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters." + aSN1ObjectIdentifier, "DESEDE");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.DESEDE", str + "$AlgParamGen");
            C3200.m9836(C3435.m10502("$PBEWithSHAAndDES3KeyFactory", "SecretKeyFactory.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", str, C9045.m23342("DESEDE", str, new StringBuilder("Alg.Alias.AlgorithmParameterGenerator."), aSN1ObjectIdentifier, configurableProvider), configurableProvider), "$PBEWithSHAAndDES2KeyFactory", configurableProvider, "SecretKeyFactory.PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES3KEY-CBC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES2KEY-CBC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.3", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.4", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.3", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.4", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHAAndDES2Key extends BaseBlockCipher {
        public PBEWithSHAAndDES2Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 128, 8);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHAAndDES2KeyFactory extends DES.DESPBEKeyFactory {
        public PBEWithSHAAndDES2KeyFactory() {
            super("PBEwithSHAandDES2Key-CBC", PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC, true, 2, 1, 128, 64);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHAAndDES3Key extends BaseBlockCipher {
        public PBEWithSHAAndDES3Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 192, 8);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithSHAAndDES3KeyFactory extends DES.DESPBEKeyFactory {
        public PBEWithSHAAndDES3KeyFactory() {
            super("PBEwithSHAandDES3Key-CBC", PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, true, 2, 1, 192, 64);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class RFC3211 extends BaseWrapCipher {
        public RFC3211() {
            super(new RFC3211WrapEngine(new DESedeEngine()), 8);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Wrap extends BaseWrapCipher {
        public Wrap() {
            super(new DESedeWrapEngine());
        }
    }
}
