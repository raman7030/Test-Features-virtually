package org.bouncycastle.jcajce.provider.digest;

import l.C16014;
import l.C5368;
import l.C9045;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.TigerDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.internal.asn1.iana.IANAObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory;

/* JADX INFO: loaded from: classes.dex */
public class Tiger {

    public class Digest extends BCMessageDigest implements Cloneable {
        public Digest() {
            super(new TigerDigest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest digest = (Digest) super.clone();
            digest.digest = new TigerDigest((TigerDigest) this.digest);
            return digest;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac extends BaseMac {
        public HashMac() {
            super(new HMac(new TigerDigest()));
        }
    }

    public class KeyGenerator extends BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACTIGER", 192, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends DigestAlgorithmProvider {
        public static final String PREFIX = Tiger.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            addHMACAlgorithm(configurableProvider, "TIGER", C9045.m23341(C5368.m15340(str, "$Digest", "MessageDigest.Tiger", C5368.m15340(str, "$Digest", "MessageDigest.TIGER", sb, configurableProvider), configurableProvider), str, "$HashMac"), C16014.m37867(str, "$KeyGenerator"));
            addHMACAlias(configurableProvider, "TIGER", IANAObjectIdentifiers.hmacTIGER);
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACTIGER", str + "$PBEWithMacKeyFactory");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithHashMac extends BaseMac {
        public PBEWithHashMac() {
            super(new HMac(new TigerDigest()), 2, 3, 192);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class PBEWithMacKeyFactory extends PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacTiger", null, false, 2, 3, 192, 0);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class TigerHmac extends BaseMac {
        public TigerHmac() {
            super(new HMac(new TigerDigest()));
        }
    }
}
