package org.bouncycastle.jcajce.provider.digest;

import l.C12662;
import l.C16014;
import l.C18515;
import l.C19462;
import l.C20094;
import l.C21639;
import l.C3200;
import l.C8954;
import l.C9045;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: loaded from: classes.dex */
public class SHA256 {

    public class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(SHA256Digest.newInstance());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = SHA256Digest.newInstance(this.digest);
            return digest;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(SHA256Digest.newInstance()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("HmacSHA256", null);
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA256", 256, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends DigestAlgorithmProvider {
        public static final String PREFIX = SHA256.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$Digest", "MessageDigest.SHA-256", sb, configurableProvider);
            StringBuilder sbM43029 = C18515.m43029(configurableProvider, "Alg.Alias.MessageDigest.SHA256", XMSSKeyParameters.SHA_256, "Alg.Alias.MessageDigest.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
            C3200.m9836(C9045.m23342(XMSSKeyParameters.SHA_256, str, sbM43029, aSN1ObjectIdentifier, configurableProvider), "$PBEWithMacKeyFactory", configurableProvider, "SecretKeyFactory.PBEWITHHMACSHA256");
            addHMACAlgorithm(configurableProvider, "SHA256", C8954.m23074("Mac.PBEWITHHMACSHA256", C8954.m23074(C21639.m48907(configurableProvider, "Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA-256", "PBEWITHHMACSHA256", "Alg.Alias.SecretKeyFactory.", aSN1ObjectIdentifier), "PBEWITHHMACSHA256", str, "$HashMac", configurableProvider), str, "$HashMac", configurableProvider), C16014.m37867(str, "$KeyGenerator"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.id_hmacWithSHA256;
            addHMACAlias(configurableProvider, "SHA256", aSN1ObjectIdentifier2);
            addHMACAlias(configurableProvider, "SHA256", aSN1ObjectIdentifier);
            C19462.m44861(C20094.m46316(str, "$KeyFactory", "SecretKeyFactory.HMACSHA256", "Alg.Alias.SecretKeyFactory.", configurableProvider), aSN1ObjectIdentifier2, configurableProvider, "HMACSHA256");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA256", null, false, 2, 4, 256, 0);
        }
    }
}
