package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.KeccakDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p067l.C10965;
import p067l.C17588;
import p067l.C7470;

/* JADX INFO: loaded from: classes.dex */
public class Keccak {

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest224 extends DigestKeccak {
        public Digest224() {
            super(BERTags.FLAGS);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest256 extends DigestKeccak {
        public Digest256() {
            super(256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest288 extends DigestKeccak {
        public Digest288() {
            super(288);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest384 extends DigestKeccak {
        public Digest384() {
            super(MLKEMEngine.KyberPolyBytes);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest512 extends DigestKeccak {
        public Digest512() {
            super(512);
        }
    }

    public class DigestKeccak extends BCMessageDigest implements Cloneable {
        public DigestKeccak(int i) {
            super(new KeccakDigest(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new KeccakDigest((KeccakDigest) this.digest);
            return bCMessageDigest;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac224 extends BaseMac {
        public HashMac224() {
            super(new HMac(new KeccakDigest(BERTags.FLAGS)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac256 extends BaseMac {
        public HashMac256() {
            super(new HMac(new KeccakDigest(256)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac288 extends BaseMac {
        public HashMac288() {
            super(new HMac(new KeccakDigest(288)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac384 extends BaseMac {
        public HashMac384() {
            super(new HMac(new KeccakDigest(MLKEMEngine.KyberPolyBytes)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac512 extends BaseMac {
        public HashMac512() {
            super(new HMac(new KeccakDigest(512)));
        }
    }

    public class KeyGenerator224 extends BaseKeyGenerator {
        public KeyGenerator224() {
            super("HMACKECCAK224", BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    public class KeyGenerator256 extends BaseKeyGenerator {
        public KeyGenerator256() {
            super("HMACKECCAK256", 256, new CipherKeyGenerator());
        }
    }

    public class KeyGenerator288 extends BaseKeyGenerator {
        public KeyGenerator288() {
            super("HMACKECCAK288", 288, new CipherKeyGenerator());
        }
    }

    public class KeyGenerator384 extends BaseKeyGenerator {
        public KeyGenerator384() {
            super("HMACKECCAK384", MLKEMEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public class KeyGenerator512 extends BaseKeyGenerator {
        public KeyGenerator512() {
            super("HMACKECCAK512", 512, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends DigestAlgorithmProvider {
        public static final String PREFIX = Keccak.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            addHMACAlgorithm(configurableProvider, "KECCAK224", C10965.m25286(C7470.m17249(str, "$Digest512", "MessageDigest.KECCAK-512", C7470.m17249(str, "$Digest384", "MessageDigest.KECCAK-384", C7470.m17249(str, "$Digest256", "MessageDigest.KECCAK-256", C7470.m17249(str, "$Digest288", "MessageDigest.KECCAK-288", C7470.m17249(str, "$Digest224", "MessageDigest.KECCAK-224", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), str, "$HashMac224"), C17588.m40053(str, "$KeyGenerator224"));
            addHMACAlgorithm(configurableProvider, "KECCAK256", C17588.m40053(str, "$HashMac256"), C17588.m40053(str, "$KeyGenerator256"));
            addHMACAlgorithm(configurableProvider, "KECCAK288", C17588.m40053(str, "$HashMac288"), C17588.m40053(str, "$KeyGenerator288"));
            addHMACAlgorithm(configurableProvider, "KECCAK384", C17588.m40053(str, "$HashMac384"), C17588.m40053(str, "$KeyGenerator384"));
            addHMACAlgorithm(configurableProvider, "KECCAK512", C17588.m40053(str, "$HashMac512"), C17588.m40053(str, "$KeyGenerator512"));
        }
    }
}
