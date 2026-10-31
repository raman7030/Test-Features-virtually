package org.bouncycastle.jcajce.provider.digest;

import l.C19462;
import l.C9045;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.digests.Blake2sDigest;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: loaded from: classes.dex */
public class Blake2s {

    public class Blake2s128 extends BCMessageDigest implements Cloneable {
        public Blake2s128() {
            super(new Blake2sDigest(128));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2s128 blake2s128 = (Blake2s128) super.clone();
            blake2s128.digest = new Blake2sDigest((Blake2sDigest) this.digest);
            return blake2s128;
        }
    }

    public class Blake2s160 extends BCMessageDigest implements Cloneable {
        public Blake2s160() {
            super(new Blake2sDigest(DHParameters.DEFAULT_MINIMUM_LENGTH));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2s160 blake2s160 = (Blake2s160) super.clone();
            blake2s160.digest = new Blake2sDigest((Blake2sDigest) this.digest);
            return blake2s160;
        }
    }

    public class Blake2s224 extends BCMessageDigest implements Cloneable {
        public Blake2s224() {
            super(new Blake2sDigest(BERTags.FLAGS));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2s224 blake2s224 = (Blake2s224) super.clone();
            blake2s224.digest = new Blake2sDigest((Blake2sDigest) this.digest);
            return blake2s224;
        }
    }

    public class Blake2s256 extends BCMessageDigest implements Cloneable {
        public Blake2s256() {
            super(new Blake2sDigest(256));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2s256 blake2s256 = (Blake2s256) super.clone();
            blake2s256.digest = new Blake2sDigest((Blake2sDigest) this.digest);
            return blake2s256;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends DigestAlgorithmProvider {
        public static final String PREFIX = Blake2s.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Blake2s256");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2S-256", sb.toString());
            StringBuilder sbM23342 = C9045.m23342("BLAKE2S-256", str, new StringBuilder("Alg.Alias.MessageDigest."), MiscObjectIdentifiers.id_blake2s256, configurableProvider);
            sbM23342.append("$Blake2s224");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2S-224", sbM23342.toString());
            StringBuilder sbM23343 = C9045.m23342("BLAKE2S-224", str, new StringBuilder("Alg.Alias.MessageDigest."), MiscObjectIdentifiers.id_blake2s224, configurableProvider);
            sbM23343.append("$Blake2s160");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2S-160", sbM23343.toString());
            StringBuilder sbM23344 = C9045.m23342("BLAKE2S-160", str, new StringBuilder("Alg.Alias.MessageDigest."), MiscObjectIdentifiers.id_blake2s160, configurableProvider);
            sbM23344.append("$Blake2s128");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2S-128", sbM23344.toString());
            C19462.m44861(new StringBuilder("Alg.Alias.MessageDigest."), MiscObjectIdentifiers.id_blake2s128, configurableProvider, "BLAKE2S-128");
        }
    }
}
