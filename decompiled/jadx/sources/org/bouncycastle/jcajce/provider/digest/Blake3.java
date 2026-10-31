package org.bouncycastle.jcajce.provider.digest;

import l.C19462;
import org.bouncycastle.crypto.digests.Blake3Digest;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class Blake3 {

    public class Blake3_256 extends BCMessageDigest implements Cloneable {
        public Blake3_256() {
            super(new Blake3Digest(256));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake3_256 blake3_256 = (Blake3_256) super.clone();
            blake3_256.digest = new Blake3Digest((Blake3Digest) this.digest);
            return blake3_256;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends DigestAlgorithmProvider {
        public static final String PREFIX = Blake3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("MessageDigest.BLAKE3-256", PREFIX + "$Blake3_256");
            C19462.m44861(new StringBuilder("Alg.Alias.MessageDigest."), MiscObjectIdentifiers.blake3_256, configurableProvider, "BLAKE3-256");
        }
    }
}
