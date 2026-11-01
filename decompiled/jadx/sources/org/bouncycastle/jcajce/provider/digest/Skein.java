package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.SkeinDigest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.macs.SkeinMac;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p067l.C10965;
import p067l.C17588;
import p067l.C19768;
import p067l.C7470;

/* JADX INFO: loaded from: classes.dex */
public class Skein {

    public class DigestSkein1024 extends BCMessageDigest implements Cloneable {
        public DigestSkein1024(int i) {
            super(new SkeinDigest(1024, i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SkeinDigest((SkeinDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public class DigestSkein256 extends BCMessageDigest implements Cloneable {
        public DigestSkein256(int i) {
            super(new SkeinDigest(256, i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SkeinDigest((SkeinDigest) this.digest);
            return bCMessageDigest;
        }
    }

    public class DigestSkein512 extends BCMessageDigest implements Cloneable {
        public DigestSkein512(int i) {
            super(new SkeinDigest(512, i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new SkeinDigest((SkeinDigest) this.digest);
            return bCMessageDigest;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest_1024_1024 extends DigestSkein1024 {
        public Digest_1024_1024() {
            super(1024);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest_1024_384 extends DigestSkein1024 {
        public Digest_1024_384() {
            super(MLKEMEngine.KyberPolyBytes);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest_1024_512 extends DigestSkein1024 {
        public Digest_1024_512() {
            super(512);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest_256_128 extends DigestSkein256 {
        public Digest_256_128() {
            super(128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest_256_160 extends DigestSkein256 {
        public Digest_256_160() {
            super(DHParameters.DEFAULT_MINIMUM_LENGTH);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest_256_224 extends DigestSkein256 {
        public Digest_256_224() {
            super(BERTags.FLAGS);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest_256_256 extends DigestSkein256 {
        public Digest_256_256() {
            super(256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest_512_128 extends DigestSkein512 {
        public Digest_512_128() {
            super(128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest_512_160 extends DigestSkein512 {
        public Digest_512_160() {
            super(DHParameters.DEFAULT_MINIMUM_LENGTH);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest_512_224 extends DigestSkein512 {
        public Digest_512_224() {
            super(BERTags.FLAGS);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest_512_256 extends DigestSkein512 {
        public Digest_512_256() {
            super(256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest_512_384 extends DigestSkein512 {
        public Digest_512_384() {
            super(MLKEMEngine.KyberPolyBytes);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest_512_512 extends DigestSkein512 {
        public Digest_512_512() {
            super(512);
        }
    }

    public class HMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_1024() {
            super("HMACSkein-1024-1024", 1024, new CipherKeyGenerator());
        }
    }

    public class HMacKeyGenerator_1024_384 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_384() {
            super("HMACSkein-1024-384", MLKEMEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public class HMacKeyGenerator_1024_512 extends BaseKeyGenerator {
        public HMacKeyGenerator_1024_512() {
            super("HMACSkein-1024-512", 512, new CipherKeyGenerator());
        }
    }

    public class HMacKeyGenerator_256_128 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_128() {
            super("HMACSkein-256-128", 128, new CipherKeyGenerator());
        }
    }

    public class HMacKeyGenerator_256_160 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_160() {
            super("HMACSkein-256-160", DHParameters.DEFAULT_MINIMUM_LENGTH, new CipherKeyGenerator());
        }
    }

    public class HMacKeyGenerator_256_224 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_224() {
            super("HMACSkein-256-224", BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    public class HMacKeyGenerator_256_256 extends BaseKeyGenerator {
        public HMacKeyGenerator_256_256() {
            super("HMACSkein-256-256", 256, new CipherKeyGenerator());
        }
    }

    public class HMacKeyGenerator_512_128 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_128() {
            super("HMACSkein-512-128", 128, new CipherKeyGenerator());
        }
    }

    public class HMacKeyGenerator_512_160 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_160() {
            super("HMACSkein-512-160", DHParameters.DEFAULT_MINIMUM_LENGTH, new CipherKeyGenerator());
        }
    }

    public class HMacKeyGenerator_512_224 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_224() {
            super("HMACSkein-512-224", BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    public class HMacKeyGenerator_512_256 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_256() {
            super("HMACSkein-512-256", 256, new CipherKeyGenerator());
        }
    }

    public class HMacKeyGenerator_512_384 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_384() {
            super("HMACSkein-512-384", MLKEMEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public class HMacKeyGenerator_512_512 extends BaseKeyGenerator {
        public HMacKeyGenerator_512_512() {
            super("HMACSkein-512-512", 512, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac_1024_1024 extends BaseMac {
        public HashMac_1024_1024() {
            super(new HMac(new SkeinDigest(1024, 1024)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac_1024_384 extends BaseMac {
        public HashMac_1024_384() {
            super(new HMac(new SkeinDigest(1024, MLKEMEngine.KyberPolyBytes)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac_1024_512 extends BaseMac {
        public HashMac_1024_512() {
            super(new HMac(new SkeinDigest(1024, 512)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac_256_128 extends BaseMac {
        public HashMac_256_128() {
            super(new HMac(new SkeinDigest(256, 128)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac_256_160 extends BaseMac {
        public HashMac_256_160() {
            super(new HMac(new SkeinDigest(256, DHParameters.DEFAULT_MINIMUM_LENGTH)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac_256_224 extends BaseMac {
        public HashMac_256_224() {
            super(new HMac(new SkeinDigest(256, BERTags.FLAGS)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac_256_256 extends BaseMac {
        public HashMac_256_256() {
            super(new HMac(new SkeinDigest(256, 256)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac_512_128 extends BaseMac {
        public HashMac_512_128() {
            super(new HMac(new SkeinDigest(512, 128)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac_512_160 extends BaseMac {
        public HashMac_512_160() {
            super(new HMac(new SkeinDigest(512, DHParameters.DEFAULT_MINIMUM_LENGTH)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac_512_224 extends BaseMac {
        public HashMac_512_224() {
            super(new HMac(new SkeinDigest(512, BERTags.FLAGS)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac_512_256 extends BaseMac {
        public HashMac_512_256() {
            super(new HMac(new SkeinDigest(512, 256)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac_512_384 extends BaseMac {
        public HashMac_512_384() {
            super(new HMac(new SkeinDigest(512, MLKEMEngine.KyberPolyBytes)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac_512_512 extends BaseMac {
        public HashMac_512_512() {
            super(new HMac(new SkeinDigest(512, 512)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends DigestAlgorithmProvider {
        public static final String PREFIX = Skein.class.getName();

        private void addSkeinMacAlgorithm(ConfigurableProvider configurableProvider, int i, int i2) {
            String strM44907 = C19768.m44907("Skein-MAC-", i, i2, "-");
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            sb.append(str);
            sb.append("$SkeinMac_");
            sb.append(i);
            sb.append("_");
            sb.append(i2);
            configurableProvider.addAlgorithm("Mac." + strM44907, sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.Skein-MAC" + i + "/" + i2, strM44907);
            StringBuilder sb2 = new StringBuilder("KeyGenerator.");
            sb2.append(strM44907);
            configurableProvider.addAlgorithm(sb2.toString(), str + "$SkeinMacKeyGenerator_" + i + "_" + i2);
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.Skein-MAC" + i + "/" + i2, strM44907);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            addHMACAlgorithm(configurableProvider, "Skein-256-128", C10965.m25286(C7470.m17249(str, "$Digest_1024_1024", "MessageDigest.Skein-1024-1024", C7470.m17249(str, "$Digest_1024_512", "MessageDigest.Skein-1024-512", C7470.m17249(str, "$Digest_1024_384", "MessageDigest.Skein-1024-384", C7470.m17249(str, "$Digest_512_512", "MessageDigest.Skein-512-512", C7470.m17249(str, "$Digest_512_384", "MessageDigest.Skein-512-384", C7470.m17249(str, "$Digest_512_256", "MessageDigest.Skein-512-256", C7470.m17249(str, "$Digest_512_224", "MessageDigest.Skein-512-224", C7470.m17249(str, "$Digest_512_160", "MessageDigest.Skein-512-160", C7470.m17249(str, "$Digest_512_128", "MessageDigest.Skein-512-128", C7470.m17249(str, "$Digest_256_256", "MessageDigest.Skein-256-256", C7470.m17249(str, "$Digest_256_224", "MessageDigest.Skein-256-224", C7470.m17249(str, "$Digest_256_160", "MessageDigest.Skein-256-160", C7470.m17249(str, "$Digest_256_128", "MessageDigest.Skein-256-128", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), str, "$HashMac_256_128"), C17588.m40053(str, "$HMacKeyGenerator_256_128"));
            addHMACAlgorithm(configurableProvider, "Skein-256-160", C17588.m40053(str, "$HashMac_256_160"), C17588.m40053(str, "$HMacKeyGenerator_256_160"));
            addHMACAlgorithm(configurableProvider, "Skein-256-224", C17588.m40053(str, "$HashMac_256_224"), C17588.m40053(str, "$HMacKeyGenerator_256_224"));
            addHMACAlgorithm(configurableProvider, "Skein-256-256", C17588.m40053(str, "$HashMac_256_256"), C17588.m40053(str, "$HMacKeyGenerator_256_256"));
            addHMACAlgorithm(configurableProvider, "Skein-512-128", C17588.m40053(str, "$HashMac_512_128"), C17588.m40053(str, "$HMacKeyGenerator_512_128"));
            addHMACAlgorithm(configurableProvider, "Skein-512-160", C17588.m40053(str, "$HashMac_512_160"), C17588.m40053(str, "$HMacKeyGenerator_512_160"));
            addHMACAlgorithm(configurableProvider, "Skein-512-224", C17588.m40053(str, "$HashMac_512_224"), C17588.m40053(str, "$HMacKeyGenerator_512_224"));
            addHMACAlgorithm(configurableProvider, "Skein-512-256", C17588.m40053(str, "$HashMac_512_256"), C17588.m40053(str, "$HMacKeyGenerator_512_256"));
            addHMACAlgorithm(configurableProvider, "Skein-512-384", C17588.m40053(str, "$HashMac_512_384"), C17588.m40053(str, "$HMacKeyGenerator_512_384"));
            addHMACAlgorithm(configurableProvider, "Skein-512-512", C17588.m40053(str, "$HashMac_512_512"), C17588.m40053(str, "$HMacKeyGenerator_512_512"));
            addHMACAlgorithm(configurableProvider, "Skein-1024-384", C17588.m40053(str, "$HashMac_1024_384"), C17588.m40053(str, "$HMacKeyGenerator_1024_384"));
            addHMACAlgorithm(configurableProvider, "Skein-1024-512", C17588.m40053(str, "$HashMac_1024_512"), C17588.m40053(str, "$HMacKeyGenerator_1024_512"));
            addHMACAlgorithm(configurableProvider, "Skein-1024-1024", C17588.m40053(str, "$HashMac_1024_1024"), C17588.m40053(str, "$HMacKeyGenerator_1024_1024"));
            addSkeinMacAlgorithm(configurableProvider, 256, 128);
            addSkeinMacAlgorithm(configurableProvider, 256, DHParameters.DEFAULT_MINIMUM_LENGTH);
            addSkeinMacAlgorithm(configurableProvider, 256, BERTags.FLAGS);
            addSkeinMacAlgorithm(configurableProvider, 256, 256);
            addSkeinMacAlgorithm(configurableProvider, 512, 128);
            addSkeinMacAlgorithm(configurableProvider, 512, DHParameters.DEFAULT_MINIMUM_LENGTH);
            addSkeinMacAlgorithm(configurableProvider, 512, BERTags.FLAGS);
            addSkeinMacAlgorithm(configurableProvider, 512, 256);
            addSkeinMacAlgorithm(configurableProvider, 512, MLKEMEngine.KyberPolyBytes);
            addSkeinMacAlgorithm(configurableProvider, 512, 512);
            addSkeinMacAlgorithm(configurableProvider, 1024, MLKEMEngine.KyberPolyBytes);
            addSkeinMacAlgorithm(configurableProvider, 1024, 512);
            addSkeinMacAlgorithm(configurableProvider, 1024, 1024);
        }
    }

    public class SkeinMacKeyGenerator_1024_1024 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_1024() {
            super("Skein-MAC-1024-1024", 1024, new CipherKeyGenerator());
        }
    }

    public class SkeinMacKeyGenerator_1024_384 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_384() {
            super("Skein-MAC-1024-384", MLKEMEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public class SkeinMacKeyGenerator_1024_512 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_512() {
            super("Skein-MAC-1024-512", 512, new CipherKeyGenerator());
        }
    }

    public class SkeinMacKeyGenerator_256_128 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_128() {
            super("Skein-MAC-256-128", 128, new CipherKeyGenerator());
        }
    }

    public class SkeinMacKeyGenerator_256_160 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_160() {
            super("Skein-MAC-256-160", DHParameters.DEFAULT_MINIMUM_LENGTH, new CipherKeyGenerator());
        }
    }

    public class SkeinMacKeyGenerator_256_224 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_224() {
            super("Skein-MAC-256-224", BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    public class SkeinMacKeyGenerator_256_256 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_256() {
            super("Skein-MAC-256-256", 256, new CipherKeyGenerator());
        }
    }

    public class SkeinMacKeyGenerator_512_128 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_128() {
            super("Skein-MAC-512-128", 128, new CipherKeyGenerator());
        }
    }

    public class SkeinMacKeyGenerator_512_160 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_160() {
            super("Skein-MAC-512-160", DHParameters.DEFAULT_MINIMUM_LENGTH, new CipherKeyGenerator());
        }
    }

    public class SkeinMacKeyGenerator_512_224 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_224() {
            super("Skein-MAC-512-224", BERTags.FLAGS, new CipherKeyGenerator());
        }
    }

    public class SkeinMacKeyGenerator_512_256 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_256() {
            super("Skein-MAC-512-256", 256, new CipherKeyGenerator());
        }
    }

    public class SkeinMacKeyGenerator_512_384 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_384() {
            super("Skein-MAC-512-384", MLKEMEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public class SkeinMacKeyGenerator_512_512 extends BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_512() {
            super("Skein-MAC-512-512", 512, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SkeinMac_1024_1024 extends BaseMac {
        public SkeinMac_1024_1024() {
            super(new SkeinMac(1024, 1024));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SkeinMac_1024_384 extends BaseMac {
        public SkeinMac_1024_384() {
            super(new SkeinMac(1024, MLKEMEngine.KyberPolyBytes));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SkeinMac_1024_512 extends BaseMac {
        public SkeinMac_1024_512() {
            super(new SkeinMac(1024, 512));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SkeinMac_256_128 extends BaseMac {
        public SkeinMac_256_128() {
            super(new SkeinMac(256, 128));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SkeinMac_256_160 extends BaseMac {
        public SkeinMac_256_160() {
            super(new SkeinMac(256, DHParameters.DEFAULT_MINIMUM_LENGTH));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SkeinMac_256_224 extends BaseMac {
        public SkeinMac_256_224() {
            super(new SkeinMac(256, BERTags.FLAGS));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SkeinMac_256_256 extends BaseMac {
        public SkeinMac_256_256() {
            super(new SkeinMac(256, 256));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SkeinMac_512_128 extends BaseMac {
        public SkeinMac_512_128() {
            super(new SkeinMac(512, 128));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SkeinMac_512_160 extends BaseMac {
        public SkeinMac_512_160() {
            super(new SkeinMac(512, DHParameters.DEFAULT_MINIMUM_LENGTH));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SkeinMac_512_224 extends BaseMac {
        public SkeinMac_512_224() {
            super(new SkeinMac(512, BERTags.FLAGS));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SkeinMac_512_256 extends BaseMac {
        public SkeinMac_512_256() {
            super(new SkeinMac(512, 256));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SkeinMac_512_384 extends BaseMac {
        public SkeinMac_512_384() {
            super(new SkeinMac(512, MLKEMEngine.KyberPolyBytes));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SkeinMac_512_512 extends BaseMac {
        public SkeinMac_512_512() {
            super(new SkeinMac(512, 512));
        }
    }
}
