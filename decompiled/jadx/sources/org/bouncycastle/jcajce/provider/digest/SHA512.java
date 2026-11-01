package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHA512tDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.OldHMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import p067l.C10965;
import p067l.C14403;
import p067l.C17588;
import p067l.C19965;
import p067l.C20865;
import p067l.C21466;
import p067l.C5410;
import p067l.C5633;

/* JADX INFO: loaded from: classes.dex */
public class SHA512 {

    public class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA512Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA512Digest((SHA512Digest) this.digest);
            return digest;
        }
    }

    public class DigestT extends BCMessageDigest implements Cloneable {
        public DigestT(int i) {
            super(new SHA512tDigest(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            DigestT digestT = (DigestT) super.clone();
            digestT.digest = new SHA512tDigest((SHA512tDigest) this.digest);
            return digestT;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class DigestT224 extends DigestT {
        public DigestT224() {
            super(BERTags.FLAGS);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class DigestT256 extends DigestT {
        public DigestT256() {
            super(256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA512Digest()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMacT224 extends BaseMac {
        public HashMacT224() {
            super(new HMac(new SHA512tDigest(BERTags.FLAGS)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMacT256 extends BaseMac {
        public HashMacT256() {
            super(new HMac(new SHA512tDigest(256)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("HmacSHA512", null);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory224 extends BaseSecretKeyFactory {
        public KeyFactory224() {
            super("HmacSHA512/224", null);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory256 extends BaseSecretKeyFactory {
        public KeyFactory256() {
            super("HmacSHA512/256", null);
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA512", 512, new CipherKeyGenerator());
        }
    }

    public class KeyGeneratorT224 extends BaseKeyGenerator {
        public KeyGeneratorT224() {
            super("HMACSHA512/224", BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    public class KeyGeneratorT256 extends BaseKeyGenerator {
        public KeyGeneratorT256() {
            super("HMACSHA512/256", 256, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends DigestAlgorithmProvider {
        public static final String PREFIX = SHA512.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C14403.m33021(str, "$Digest", "MessageDigest.SHA-512", sb, configurableProvider);
            C5410.m11881(C10965.m25287(XMSSKeyParameters.SHA_512, str, C19965.m45307(configurableProvider, "Alg.Alias.MessageDigest.SHA512", XMSSKeyParameters.SHA_512, "Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha512, configurableProvider), "$DigestT224", configurableProvider, "MessageDigest.SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512/224", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512224", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA-512(224)", "SHA-512/224");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512(224)", "SHA-512/224");
            C5410.m11881(C10965.m25287("SHA-512/224", str, new StringBuilder("Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha512_224, configurableProvider), "$DigestT256", configurableProvider, "MessageDigest.SHA-512/256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512/256", SPHINCSKeyParameters.SHA512_256);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512256", SPHINCSKeyParameters.SHA512_256);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA-512(256)", SPHINCSKeyParameters.SHA512_256);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512(256)", SPHINCSKeyParameters.SHA512_256);
            StringBuilder sbM12526 = C5633.m12526("$HashMac", "Mac.PBEWITHHMACSHA512", str, C5633.m12526("$OldSHA512", "Mac.OLDHMACSHA512", str, C10965.m25287(SPHINCSKeyParameters.SHA512_256, str, new StringBuilder("Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha512_256, configurableProvider), configurableProvider), configurableProvider);
            sbM12526.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA512", sbM12526.toString(), C17588.m40053(str, "$KeyGenerator"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_hmacWithSHA512;
            addHMACAlias(configurableProvider, "SHA512", aSN1ObjectIdentifier);
            addHMACAlgorithm(configurableProvider, "SHA512/224", C17588.m40053(str, "$HashMacT224"), C17588.m40053(str, "$KeyGeneratorT224"));
            addHMACAlgorithm(configurableProvider, "SHA512/256", C17588.m40053(str, "$HashMacT256"), C17588.m40053(str, "$KeyGeneratorT256"));
            C5410.m11881(C10965.m25287("HMACSHA512", str, C21466.m48632(str, "$KeyFactory", "SecretKeyFactory.HMACSHA512", "Alg.Alias.SecretKeyFactory.", configurableProvider), aSN1ObjectIdentifier, configurableProvider), "$KeyFactory224", configurableProvider, "SecretKeyFactory.HMACSHA512/224");
            C5410.m11881(C10965.m25287("HMACSHA512/224", str, C19965.m45307(configurableProvider, "Alg.Alias.SecretKeyFactory.HMACSHA512(224)", "HMACSHA512/224", "Alg.Alias.SecretKeyFactory."), PKCSObjectIdentifiers.id_hmacWithSHA512_224, configurableProvider), "$KeyFactory256", configurableProvider, "SecretKeyFactory.HMACSHA512/256");
            C20865.m47157(C19965.m45307(configurableProvider, "Alg.Alias.SecretKeyFactory.HMACSHA512(256)", "HMACSHA512/256", "Alg.Alias.SecretKeyFactory."), PKCSObjectIdentifiers.id_hmacWithSHA512_256, configurableProvider, "HMACSHA512/256");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class OldSHA512 extends BaseMac {
        public OldSHA512() {
            super(new OldHMac(new SHA512Digest()));
        }
    }
}
