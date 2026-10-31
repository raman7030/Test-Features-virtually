package org.bouncycastle.jcajce.provider.digest;

import l.C12662;
import l.C16014;
import l.C21639;
import l.C3200;
import l.C8954;
import l.C9045;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.internal.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.internal.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class SHA1 {

    public class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new SHA1Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new SHA1Digest((SHA1Digest) this.digest);
            return digest;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new SHA1Digest()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class KeyFactory extends BaseSecretKeyFactory {
        public KeyFactory() {
            super("HmacSHA1", null);
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA1", DHParameters.DEFAULT_MINIMUM_LENGTH, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends DigestAlgorithmProvider {
        public static final String PREFIX = SHA1.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$Digest", "MessageDigest.SHA-1", sb, configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA1", "SHA-1");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA", "SHA-1");
            StringBuilder sb2 = new StringBuilder("Alg.Alias.MessageDigest.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = OIWObjectIdentifiers.idSHA1;
            StringBuilder sbM23342 = C9045.m23342("SHA-1", str, sb2, aSN1ObjectIdentifier, configurableProvider);
            sbM23342.append("$HashMac");
            addHMACAlgorithm(configurableProvider, "SHA1", sbM23342.toString(), C16014.m37867(str, "$KeyGenerator"));
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.id_hmacWithSHA1;
            addHMACAlias(configurableProvider, "SHA1", aSN1ObjectIdentifier2);
            addHMACAlias(configurableProvider, "SHA1", IANAObjectIdentifiers.hmacSHA1);
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA", str + "$SHA1Mac");
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            C3200.m9836(sb3, "$SHA1Mac", configurableProvider, "Mac.PBEWITHHMACSHA1");
            configurableProvider.addAlgorithm(C21639.m48907(configurableProvider, "SecretKeyFactory.HMACSHA1", C8954.m23074("SecretKeyFactory.PBEWITHHMACSHA1", C8954.m23074(C21639.m48907(configurableProvider, C21639.m48907(configurableProvider, "Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1", "Alg.Alias.SecretKeyFactory.", aSN1ObjectIdentifier), "PBEWITHHMACSHA1", "Alg.Alias.Mac.", aSN1ObjectIdentifier), "PBEWITHHMACSHA", str, "$PBEWithMacKeyFactory", configurableProvider), str, "$KeyFactory", configurableProvider), "Alg.Alias.SecretKeyFactory.", aSN1ObjectIdentifier2), "HMACSHA1");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA1", null, false, 2, 1, DHParameters.DEFAULT_MINIMUM_LENGTH, 0);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SHA1Mac extends BaseMac {
        public SHA1Mac() {
            super(new HMac(new SHA1Digest()));
        }
    }
}
