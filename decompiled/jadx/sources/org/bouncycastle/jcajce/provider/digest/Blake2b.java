package org.bouncycastle.jcajce.provider.digest;

import l.C19462;
import l.C9045;
import org.bouncycastle.crypto.digests.Blake2bDigest;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: loaded from: classes.dex */
public class Blake2b {

    public class Blake2b160 extends BCMessageDigest implements Cloneable {
        public Blake2b160() {
            super(new Blake2bDigest(DHParameters.DEFAULT_MINIMUM_LENGTH));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2b160 blake2b160 = (Blake2b160) super.clone();
            blake2b160.digest = new Blake2bDigest((Blake2bDigest) this.digest);
            return blake2b160;
        }
    }

    public class Blake2b256 extends BCMessageDigest implements Cloneable {
        public Blake2b256() {
            super(new Blake2bDigest(256));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2b256 blake2b256 = (Blake2b256) super.clone();
            blake2b256.digest = new Blake2bDigest((Blake2bDigest) this.digest);
            return blake2b256;
        }
    }

    public class Blake2b384 extends BCMessageDigest implements Cloneable {
        public Blake2b384() {
            super(new Blake2bDigest(MLKEMEngine.KyberPolyBytes));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2b384 blake2b384 = (Blake2b384) super.clone();
            blake2b384.digest = new Blake2bDigest((Blake2bDigest) this.digest);
            return blake2b384;
        }
    }

    public class Blake2b512 extends BCMessageDigest implements Cloneable {
        public Blake2b512() {
            super(new Blake2bDigest(512));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            Blake2b512 blake2b512 = (Blake2b512) super.clone();
            blake2b512.digest = new Blake2bDigest((Blake2bDigest) this.digest);
            return blake2b512;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends DigestAlgorithmProvider {
        public static final String PREFIX = Blake2b.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$Blake2b512");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-512", sb.toString());
            StringBuilder sbM23342 = C9045.m23342("BLAKE2B-512", str, new StringBuilder("Alg.Alias.MessageDigest."), MiscObjectIdentifiers.id_blake2b512, configurableProvider);
            sbM23342.append("$Blake2b384");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-384", sbM23342.toString());
            StringBuilder sbM23343 = C9045.m23342("BLAKE2B-384", str, new StringBuilder("Alg.Alias.MessageDigest."), MiscObjectIdentifiers.id_blake2b384, configurableProvider);
            sbM23343.append("$Blake2b256");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-256", sbM23343.toString());
            StringBuilder sbM23344 = C9045.m23342("BLAKE2B-256", str, new StringBuilder("Alg.Alias.MessageDigest."), MiscObjectIdentifiers.id_blake2b256, configurableProvider);
            sbM23344.append("$Blake2b160");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-160", sbM23344.toString());
            C19462.m44861(new StringBuilder("Alg.Alias.MessageDigest."), MiscObjectIdentifiers.id_blake2b160, configurableProvider, "BLAKE2B-160");
        }
    }
}
