package org.bouncycastle.jcajce.provider.digest;

import l.C12662;
import l.C16014;
import l.C18515;
import l.C19462;
import l.C20094;
import l.C3435;
import l.C9045;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA384Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.OldHMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: loaded from: classes.dex */
public class SHA384 {

    public class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA384Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA384Digest((SHA384Digest) this.digest);
            return digest;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA384Digest()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("HmacSHA384", null);
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA384", MLKEMEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends DigestAlgorithmProvider {
        public static final String PREFIX = SHA384.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$Digest", "MessageDigest.SHA-384", sb, configurableProvider);
            StringBuilder sbM10502 = C3435.m10502("$HashMac", "Mac.PBEWITHHMACSHA384", str, C3435.m10502("$OldSHA384", "Mac.OLDHMACSHA384", str, C9045.m23342("SHA-384", str, C18515.m43029(configurableProvider, "Alg.Alias.MessageDigest.SHA384", "SHA-384", "Alg.Alias.MessageDigest."), NISTObjectIdentifiers.id_sha384, configurableProvider), configurableProvider), configurableProvider);
            sbM10502.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA384", sbM10502.toString(), C16014.m37867(str, "$KeyGenerator"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_hmacWithSHA384;
            addHMACAlias(configurableProvider, "SHA384", aSN1ObjectIdentifier);
            C19462.m44861(C20094.m46316(str, "$KeyFactory", "SecretKeyFactory.HMACSHA384", "Alg.Alias.SecretKeyFactory.", configurableProvider), aSN1ObjectIdentifier, configurableProvider, "HMACSHA384");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class OldSHA384 extends BaseMac {
        public OldSHA384() {
            super(new OldHMac(new SHA384Digest()));
        }
    }
}
