package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.ParallelHash;
import org.bouncycastle.crypto.digests.SHA3Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.crypto.digests.TupleHash;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.KMAC;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p067l.C10965;
import p067l.C12832;
import p067l.C14403;
import p067l.C17588;
import p067l.C20778;
import p067l.C21466;
import p067l.C21740;
import p067l.C5410;
import p067l.C5633;
import p067l.C7470;

/* JADX INFO: loaded from: classes.dex */
public class SHA3 {

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest224 extends DigestSHA3 {
        public Digest224() {
            super(BERTags.FLAGS);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest256 extends DigestSHA3 {
        public Digest256() {
            super(256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest384 extends DigestSHA3 {
        public Digest384() {
            super(MLKEMEngine.KyberPolyBytes);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest512 extends DigestSHA3 {
        public Digest512() {
            super(512);
        }
    }

    public class DigestParallelHash extends BCMessageDigest implements Cloneable {
        public DigestParallelHash(int i, int i2) {
            super(new ParallelHash(i, null, 128, i2));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new ParallelHash((ParallelHash) this.digest);
            return bCMessageDigest;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class DigestParallelHash128_256 extends DigestParallelHash {
        public DigestParallelHash128_256() {
            super(128, 256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class DigestParallelHash256_512 extends DigestParallelHash {
        public DigestParallelHash256_512() {
            super(256, 512);
        }
    }

    public class DigestSHA3 extends BCMessageDigest implements Cloneable {
        public DigestSHA3(int i) {
            super(new SHA3Digest(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SHA3Digest((SHA3Digest) this.digest);
            return bCMessageDigest;
        }
    }

    public class DigestSHAKE extends BCMessageDigest implements Cloneable {
        public DigestSHAKE(int i, int i2) {
            super(new SHAKEDigest(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SHAKEDigest((SHAKEDigest) this.digest);
            return bCMessageDigest;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class DigestShake128_256 extends DigestSHAKE {
        public DigestShake128_256() {
            super(128, 256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class DigestShake256_512 extends DigestSHAKE {
        public DigestShake256_512() {
            super(256, 512);
        }
    }

    public class DigestTupleHash extends BCMessageDigest implements Cloneable {
        public DigestTupleHash(int i, int i2) {
            super(new TupleHash(i, null, i2));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new TupleHash((TupleHash) this.digest);
            return bCMessageDigest;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class DigestTupleHash128_256 extends DigestTupleHash {
        public DigestTupleHash128_256() {
            super(128, 256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class DigestTupleHash256_512 extends DigestTupleHash {
        public DigestTupleHash256_512() {
            super(256, 512);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac224 extends HashMacSHA3 {
        public HashMac224() {
            super(BERTags.FLAGS);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac256 extends HashMacSHA3 {
        public HashMac256() {
            super(256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac384 extends HashMacSHA3 {
        public HashMac384() {
            super(MLKEMEngine.KyberPolyBytes);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac512 extends HashMacSHA3 {
        public HashMac512() {
            super(512);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMacSHA3 extends BaseMac {
        public HashMacSHA3(int i) {
            super(new HMac(new SHA3Digest(i)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KMac128 extends BaseMac {
        public KMac128() {
            super(new KMAC(128, new byte[0]));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KMac256 extends BaseMac {
        public KMac256() {
            super(new KMAC(256, new byte[0]));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory224 extends KeyFactorySHA3 {
        public KeyFactory224() {
            super(BERTags.FLAGS, NISTObjectIdentifiers.id_hmacWithSHA3_224);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory256 extends KeyFactorySHA3 {
        public KeyFactory256() {
            super(256, NISTObjectIdentifiers.id_hmacWithSHA3_256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory384 extends KeyFactorySHA3 {
        public KeyFactory384() {
            super(MLKEMEngine.KyberPolyBytes, NISTObjectIdentifiers.id_hmacWithSHA3_384);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory512 extends KeyFactorySHA3 {
        public KeyFactory512() {
            super(512, NISTObjectIdentifiers.id_hmacWithSHA3_512);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactoryKMAC extends BaseSecretKeyFactory {
        public KeyFactoryKMAC(int i, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            super(C20778.m46922(i, "KMAC"), aSN1ObjectIdentifier);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactoryKMAC128 extends KeyFactoryKMAC {
        public KeyFactoryKMAC128() {
            super(128, NISTObjectIdentifiers.id_KmacWithSHAKE128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactoryKMAC256 extends KeyFactoryKMAC {
        public KeyFactoryKMAC256() {
            super(256, NISTObjectIdentifiers.id_KmacWithSHAKE256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactorySHA3 extends BaseSecretKeyFactory {
        public KeyFactorySHA3(int i, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            super(C20778.m46922(i, "HmacSHA3-"), aSN1ObjectIdentifier);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyGenerator224 extends KeyGeneratorSHA3 {
        public KeyGenerator224() {
            super(BERTags.FLAGS);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyGenerator256 extends KeyGeneratorSHA3 {
        public KeyGenerator256() {
            super(256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyGenerator384 extends KeyGeneratorSHA3 {
        public KeyGenerator384() {
            super(MLKEMEngine.KyberPolyBytes);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyGenerator512 extends KeyGeneratorSHA3 {
        public KeyGenerator512() {
            super(512);
        }
    }

    public class KeyGeneratorSHA3 extends BaseKeyGenerator {
        public KeyGeneratorSHA3(int i) {
            super(C20778.m46922(i, "HMACSHA3-"), i, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends DigestAlgorithmProvider {
        public static final String PREFIX = SHA3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C14403.m33021(str, "$Digest512", "MessageDigest.SHA3-512", C7470.m17249(str, "$Digest384", "MessageDigest.SHA3-384", C7470.m17249(str, "$Digest256", "MessageDigest.SHA3-256", C7470.m17249(str, "$Digest224", "MessageDigest.SHA3-224", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            C12832.m29413(configurableProvider, str, "$Digest224", "MessageDigest", NISTObjectIdentifiers.id_sha3_224);
            C12832.m29413(configurableProvider, str, "$Digest256", "MessageDigest", NISTObjectIdentifiers.id_sha3_256);
            C12832.m29413(configurableProvider, str, "$Digest384", "MessageDigest", NISTObjectIdentifiers.id_sha3_384);
            configurableProvider.addAlgorithm("MessageDigest", NISTObjectIdentifiers.id_sha3_512, str + "$Digest512");
            C14403.m33021(str, "$DigestShake128_256", "MessageDigest.SHAKE128-256", C7470.m17249(str, "$DigestShake256_512", "MessageDigest.SHAKE256-512", new StringBuilder(), configurableProvider), configurableProvider);
            C12832.m29413(configurableProvider, str, "$DigestShake256_512", "MessageDigest", NISTObjectIdentifiers.id_shake256);
            C12832.m29413(configurableProvider, str, "$DigestShake128_256", "MessageDigest", NISTObjectIdentifiers.id_shake128);
            addHMACAlgorithm(configurableProvider, "SHA3-224", C10965.m25286(C21740.m49019("Alg.Alias.MessageDigest.SHAKE256", "SHAKE256-512", "Alg.Alias.MessageDigest.SHAKE128", "SHAKE128-256", configurableProvider), str, "$HashMac224"), C17588.m40053(str, "$KeyGenerator224"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_hmacWithSHA3_224;
            addHMACAlias(configurableProvider, "SHA3-224", aSN1ObjectIdentifier);
            StringBuilder sbM25287 = C10965.m25287("HMACSHA3-224", str, C21466.m48632(str, "$KeyFactory224", "SecretKeyFactory.HMACSHA3-224", "Alg.Alias.SecretKeyFactory.", configurableProvider), aSN1ObjectIdentifier, configurableProvider);
            sbM25287.append("$HashMac256");
            addHMACAlgorithm(configurableProvider, "SHA3-256", sbM25287.toString(), C17588.m40053(str, "$KeyGenerator256"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_hmacWithSHA3_256;
            addHMACAlias(configurableProvider, "SHA3-256", aSN1ObjectIdentifier2);
            StringBuilder sbM25288 = C10965.m25287("HMACSHA3-256", str, C21466.m48632(str, "$KeyFactory256", "SecretKeyFactory.HMACSHA3-256", "Alg.Alias.SecretKeyFactory.", configurableProvider), aSN1ObjectIdentifier2, configurableProvider);
            sbM25288.append("$HashMac384");
            addHMACAlgorithm(configurableProvider, "SHA3-384", sbM25288.toString(), C17588.m40053(str, "$KeyGenerator384"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_hmacWithSHA3_384;
            addHMACAlias(configurableProvider, "SHA3-384", aSN1ObjectIdentifier3);
            StringBuilder sbM25289 = C10965.m25287("HMACSHA3-384", str, C21466.m48632(str, "$KeyFactory384", "SecretKeyFactory.HMACSHA3-384", "Alg.Alias.SecretKeyFactory.", configurableProvider), aSN1ObjectIdentifier3, configurableProvider);
            sbM25289.append("$HashMac512");
            addHMACAlgorithm(configurableProvider, "SHA3-512", sbM25289.toString(), C17588.m40053(str, "$KeyGenerator512"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_hmacWithSHA3_512;
            addHMACAlias(configurableProvider, "SHA3-512", aSN1ObjectIdentifier4);
            StringBuilder sbM252810 = C10965.m25287("HMACSHA3-512", str, C21466.m48632(str, "$KeyFactory512", "SecretKeyFactory.HMACSHA3-512", "Alg.Alias.SecretKeyFactory.", configurableProvider), aSN1ObjectIdentifier4, configurableProvider);
            sbM252810.append("$KMac128");
            addKMACAlgorithm(configurableProvider, "128", sbM252810.toString(), C17588.m40053(str, "$KeyGenerator256"));
            StringBuilder sbM252811 = C10965.m25287("KMAC128", str, C21466.m48632(str, "$KeyFactoryKMAC128", "SecretKeyFactory.KMAC128", "Alg.Alias.SecretKeyFactory.", configurableProvider), NISTObjectIdentifiers.id_Kmac128, configurableProvider);
            sbM252811.append("$KMac256");
            addKMACAlgorithm(configurableProvider, "256", sbM252811.toString(), C17588.m40053(str, "$KeyGenerator512"));
            C5410.m11881(C5633.m12526("$DigestTupleHash256_512", "MessageDigest.TUPLEHASH256-512", str, C10965.m25287("KMAC256", str, C21466.m48632(str, "$KeyFactoryKMAC256", "SecretKeyFactory.KMAC256", "Alg.Alias.SecretKeyFactory.", configurableProvider), NISTObjectIdentifiers.id_Kmac256, configurableProvider), configurableProvider), "$DigestTupleHash128_256", configurableProvider, "MessageDigest.TUPLEHASH128-256");
            C14403.m33021(str, "$DigestParallelHash128_256", "MessageDigest.PARALLELHASH128-256", C7470.m17249(str, "$DigestParallelHash256_512", "MessageDigest.PARALLELHASH256-512", C21740.m49019("Alg.Alias.MessageDigest.TUPLEHASH256", "TUPLEHASH256-512", "Alg.Alias.MessageDigest.TUPLEHASH128", "TUPLEHASH128-256", configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.PARALLELHASH256", "PARALLELHASH256-512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.PARALLELHASH128", "PARALLELHASH128-256");
        }
    }
}
