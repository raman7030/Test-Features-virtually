package org.bouncycastle.jcajce.provider.asymmetric.compositesignatures;

import com.alipay.sdk.m.p.d;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.internal.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.jce.spec.ECNamedCurveGenParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class CompositeIndex {
    public static Map pairings = new HashMap();
    public static Map kpgInitSpecs = new HashMap();
    public static Map algorithmNames = new HashMap();

    static {
        Map map = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = IANAObjectIdentifiers.id_MLDSA44_RSA2048_PSS_SHA256;
        map.put(aSN1ObjectIdentifier, new String[]{SignatureSpi.ML_DSA_44, "RSASSA-PSS"});
        Map map2 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = IANAObjectIdentifiers.id_MLDSA44_RSA2048_PKCS15_SHA256;
        map2.put(aSN1ObjectIdentifier2, new String[]{SignatureSpi.ML_DSA_44, "sha256WithRSAEncryption"});
        Map map3 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = IANAObjectIdentifiers.id_MLDSA44_Ed25519_SHA512;
        map3.put(aSN1ObjectIdentifier3, new String[]{SignatureSpi.ML_DSA_44, EdDSAParameterSpec.Ed25519});
        Map map4 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = IANAObjectIdentifiers.id_MLDSA44_ECDSA_P256_SHA256;
        map4.put(aSN1ObjectIdentifier4, new String[]{SignatureSpi.ML_DSA_44, "SHA256withECDSA"});
        Map map5 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = IANAObjectIdentifiers.id_MLDSA65_RSA3072_PSS_SHA512;
        map5.put(aSN1ObjectIdentifier5, new String[]{SignatureSpi.ML_DSA_65, "RSASSA-PSS"});
        Map map6 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = IANAObjectIdentifiers.id_MLDSA65_RSA3072_PKCS15_SHA512;
        map6.put(aSN1ObjectIdentifier6, new String[]{SignatureSpi.ML_DSA_65, "sha256WithRSAEncryption"});
        Map map7 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = IANAObjectIdentifiers.id_MLDSA65_RSA4096_PSS_SHA512;
        map7.put(aSN1ObjectIdentifier7, new String[]{SignatureSpi.ML_DSA_65, "RSASSA-PSS"});
        Map map8 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = IANAObjectIdentifiers.id_MLDSA65_RSA4096_PKCS15_SHA512;
        map8.put(aSN1ObjectIdentifier8, new String[]{SignatureSpi.ML_DSA_65, "sha384WithRSAEncryption"});
        Map map9 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = IANAObjectIdentifiers.id_MLDSA65_ECDSA_P256_SHA512;
        map9.put(aSN1ObjectIdentifier9, new String[]{SignatureSpi.ML_DSA_65, "SHA256withECDSA"});
        Map map10 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = IANAObjectIdentifiers.id_MLDSA65_ECDSA_P384_SHA512;
        map10.put(aSN1ObjectIdentifier10, new String[]{SignatureSpi.ML_DSA_65, "SHA384withECDSA"});
        Map map11 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = IANAObjectIdentifiers.id_MLDSA65_ECDSA_brainpoolP256r1_SHA512;
        map11.put(aSN1ObjectIdentifier11, new String[]{SignatureSpi.ML_DSA_65, "SHA256withECDSA"});
        Map map12 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = IANAObjectIdentifiers.id_MLDSA65_Ed25519_SHA512;
        map12.put(aSN1ObjectIdentifier12, new String[]{SignatureSpi.ML_DSA_65, EdDSAParameterSpec.Ed25519});
        Map map13 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = IANAObjectIdentifiers.id_MLDSA87_ECDSA_P384_SHA512;
        map13.put(aSN1ObjectIdentifier13, new String[]{SignatureSpi.ML_DSA_87, "SHA384withECDSA"});
        Map map14 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = IANAObjectIdentifiers.id_MLDSA87_ECDSA_brainpoolP384r1_SHA512;
        map14.put(aSN1ObjectIdentifier14, new String[]{SignatureSpi.ML_DSA_87, "SHA384withECDSA"});
        Map map15 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = IANAObjectIdentifiers.id_MLDSA87_Ed448_SHAKE256;
        map15.put(aSN1ObjectIdentifier15, new String[]{SignatureSpi.ML_DSA_87, EdDSAParameterSpec.Ed448});
        Map map16 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = IANAObjectIdentifiers.id_MLDSA87_RSA3072_PSS_SHA512;
        map16.put(aSN1ObjectIdentifier16, new String[]{SignatureSpi.ML_DSA_87, "RSASSA-PSS"});
        Map map17 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = IANAObjectIdentifiers.id_MLDSA87_RSA4096_PSS_SHA512;
        map17.put(aSN1ObjectIdentifier17, new String[]{SignatureSpi.ML_DSA_87, "RSASSA-PSS"});
        Map map18 = pairings;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = IANAObjectIdentifiers.id_MLDSA87_ECDSA_P521_SHA512;
        map18.put(aSN1ObjectIdentifier18, new String[]{SignatureSpi.ML_DSA_87, "SHA512withECDSA"});
        Map map19 = kpgInitSpecs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = MiscObjectIdentifiers.id_HashMLDSA44_RSA2048_PSS_SHA256;
        BigInteger bigInteger = RSAKeyGenParameterSpec.F4;
        map19.put(aSN1ObjectIdentifier19, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(2048, bigInteger)});
        Map map20 = kpgInitSpecs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = MiscObjectIdentifiers.id_HashMLDSA44_RSA2048_PKCS15_SHA256;
        map20.put(aSN1ObjectIdentifier20, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(2048, bigInteger)});
        Map map21 = kpgInitSpecs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = MiscObjectIdentifiers.id_HashMLDSA44_Ed25519_SHA512;
        map21.put(aSN1ObjectIdentifier21, new AlgorithmParameterSpec[]{null, null});
        Map map22 = kpgInitSpecs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = MiscObjectIdentifiers.id_HashMLDSA44_ECDSA_P256_SHA256;
        map22.put(aSN1ObjectIdentifier22, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("P-256")});
        Map map23 = kpgInitSpecs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = MiscObjectIdentifiers.id_HashMLDSA65_RSA3072_PSS_SHA512;
        map23.put(aSN1ObjectIdentifier23, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(3072, bigInteger)});
        Map map24 = kpgInitSpecs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = MiscObjectIdentifiers.id_HashMLDSA65_RSA3072_PKCS15_SHA512;
        map24.put(aSN1ObjectIdentifier24, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(3072, bigInteger)});
        Map map25 = kpgInitSpecs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier25 = MiscObjectIdentifiers.id_HashMLDSA65_RSA4096_PSS_SHA512;
        map25.put(aSN1ObjectIdentifier25, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(4096, bigInteger)});
        Map map26 = kpgInitSpecs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier26 = MiscObjectIdentifiers.id_HashMLDSA65_RSA4096_PKCS15_SHA512;
        map26.put(aSN1ObjectIdentifier26, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(4096, bigInteger)});
        Map map27 = kpgInitSpecs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier27 = MiscObjectIdentifiers.id_HashMLDSA65_ECDSA_P384_SHA512;
        map27.put(aSN1ObjectIdentifier27, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("P-384")});
        Map map28 = kpgInitSpecs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier28 = MiscObjectIdentifiers.id_HashMLDSA65_ECDSA_brainpoolP256r1_SHA512;
        map28.put(aSN1ObjectIdentifier28, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("brainpoolP256r1")});
        Map map29 = kpgInitSpecs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier29 = MiscObjectIdentifiers.id_HashMLDSA65_Ed25519_SHA512;
        map29.put(aSN1ObjectIdentifier29, new AlgorithmParameterSpec[]{null, null});
        Map map30 = kpgInitSpecs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier30 = MiscObjectIdentifiers.id_HashMLDSA87_ECDSA_P384_SHA512;
        map30.put(aSN1ObjectIdentifier30, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("P-384")});
        Map map31 = kpgInitSpecs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier31 = MiscObjectIdentifiers.id_HashMLDSA87_ECDSA_brainpoolP384r1_SHA512;
        map31.put(aSN1ObjectIdentifier31, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("brainpoolP384r1")});
        Map map32 = kpgInitSpecs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier32 = MiscObjectIdentifiers.id_HashMLDSA87_Ed448_SHA512;
        map32.put(aSN1ObjectIdentifier32, new AlgorithmParameterSpec[]{null, null});
        kpgInitSpecs.put(aSN1ObjectIdentifier, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(2048, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier2, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(2048, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier3, new AlgorithmParameterSpec[]{null, null});
        kpgInitSpecs.put(aSN1ObjectIdentifier4, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("P-256")});
        kpgInitSpecs.put(aSN1ObjectIdentifier5, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(3072, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier6, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(3072, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier7, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(4096, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier8, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(4096, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier9, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("P-256")});
        kpgInitSpecs.put(aSN1ObjectIdentifier10, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("P-384")});
        kpgInitSpecs.put(aSN1ObjectIdentifier11, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("brainpoolP256r1")});
        kpgInitSpecs.put(aSN1ObjectIdentifier12, new AlgorithmParameterSpec[]{null, null});
        kpgInitSpecs.put(aSN1ObjectIdentifier13, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("P-384")});
        kpgInitSpecs.put(aSN1ObjectIdentifier14, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("brainpoolP384r1")});
        kpgInitSpecs.put(aSN1ObjectIdentifier15, new AlgorithmParameterSpec[]{null, null});
        kpgInitSpecs.put(aSN1ObjectIdentifier17, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(4096, bigInteger)});
        kpgInitSpecs.put(aSN1ObjectIdentifier18, new AlgorithmParameterSpec[]{null, new ECNamedCurveGenParameterSpec("P-521")});
        kpgInitSpecs.put(aSN1ObjectIdentifier16, new AlgorithmParameterSpec[]{null, new RSAKeyGenParameterSpec(3072, bigInteger)});
        algorithmNames.put(aSN1ObjectIdentifier19, "HashMLDSA44-RSA2048-PSS-SHA256");
        algorithmNames.put(aSN1ObjectIdentifier20, "HashMLDSA44-RSA2048-PKCS15-SHA256");
        algorithmNames.put(aSN1ObjectIdentifier21, "HashMLDSA44-Ed25519-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier22, "HashMLDSA44-ECDSA-P256-SHA256");
        algorithmNames.put(aSN1ObjectIdentifier23, "HashMLDSA65-RSA3072-PSS-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier24, "HashMLDSA65-RSA3072-PKCS15-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier25, "HashMLDSA65-RSA4096-PSS-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier26, "HashMLDSA65-RSA4096-PKCS15-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier27, "HashMLDSA65-ECDSA-P384-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier28, "HashMLDSA65-ECDSA-brainpoolP256r1-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier29, "HashMLDSA65-Ed25519-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier30, "HashMLDSA87-ECDSA-P384-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier31, "HashMLDSA87-ECDSA-brainpoolP384r1-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier32, "HashMLDSA87-Ed448-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier, "MLDSA44-RSA2048-PSS-SHA256");
        algorithmNames.put(aSN1ObjectIdentifier2, "MLDSA44-RSA2048-PKCS15-SHA256");
        algorithmNames.put(aSN1ObjectIdentifier3, "MLDSA44-Ed25519-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier4, "MLDSA44-ECDSA-P256-SHA256");
        algorithmNames.put(aSN1ObjectIdentifier5, "MLDSA65-RSA3072-PSS-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier6, "MLDSA65-RSA3072-PKCS15-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier7, "MLDSA65-RSA4096-PSS-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier8, "MLDSA65-RSA4096-PKCS15-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier9, "MLDSA65-ECDSA-P256-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier10, "MLDSA65-ECDSA-P384-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier11, "MLDSA65-ECDSA-brainpoolP256r1-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier12, "MLDSA65-Ed25519-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier13, "MLDSA87-ECDSA-P384-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier14, "MLDSA87-ECDSA-brainpoolP384r1-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier15, "MLDSA87-Ed448-SHAKE256");
        algorithmNames.put(aSN1ObjectIdentifier17, "MLDSA87-RSA4096-PSS-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier18, "MLDSA87-ECDSA-P521-SHA512");
        algorithmNames.put(aSN1ObjectIdentifier16, "MLDSA87-RSA3072-PSS-SHA512");
    }

    public static String getAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) algorithmNames.get(aSN1ObjectIdentifier);
    }

    public static String getBaseName(String str) {
        if (str.indexOf(d.a) >= 0) {
            return d.a;
        }
        return str.indexOf("ECDSA") >= 0 ? "EC" : str;
    }

    public static Digest getDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String str = (String) algorithmNames.get(aSN1ObjectIdentifier);
        if (str.endsWith("SHA256")) {
            return new SHA256Digest();
        }
        if (str.endsWith("SHA384")) {
            return new SHA384Digest();
        }
        return str.endsWith("SHA512") ? new SHA512Digest() : new SHAKEDigest(256);
    }

    public static AlgorithmParameterSpec[] getKeyPairSpecs(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (AlgorithmParameterSpec[]) kpgInitSpecs.get(aSN1ObjectIdentifier);
    }

    public static String[] getPairing(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String[]) pairings.get(aSN1ObjectIdentifier);
    }

    public static Set getSupportedIdentifiers() {
        return pairings.keySet();
    }

    public static boolean isAlgorithmSupported(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return pairings.containsKey(aSN1ObjectIdentifier);
    }
}
