package org.bouncycastle.jcajce.provider.digest;

import l.C12662;
import l.C5368;
import org.bouncycastle.crypto.digests.Haraka256Digest;
import org.bouncycastle.crypto.digests.Haraka512Digest;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class Haraka {

    public class Digest256 extends BCMessageDigest implements Cloneable {
        public Digest256() {
            super(new Haraka256Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest256 digest256 = (Digest256) super.clone();
            digest256.digest = new Haraka256Digest((Haraka256Digest) this.digest);
            return digest256;
        }
    }

    public class Digest512 extends BCMessageDigest implements Cloneable {
        public Digest512() {
            super(new Haraka512Digest());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Digest512 digest512 = (Digest512) super.clone();
            digest512.digest = new Haraka512Digest((Haraka512Digest) this.digest);
            return digest512;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends DigestAlgorithmProvider {
        public static final String PREFIX = Haraka.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$Digest512", "MessageDigest.HARAKA-512", C5368.m15340(str, "$Digest256", "MessageDigest.HARAKA-256", sb, configurableProvider), configurableProvider);
        }
    }
}
