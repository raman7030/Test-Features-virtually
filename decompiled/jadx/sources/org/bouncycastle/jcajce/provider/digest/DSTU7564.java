package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.asn1.p072ua.UAObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.digests.DSTU7564Digest;
import org.bouncycastle.crypto.macs.DSTU7564Mac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p067l.C10965;
import p067l.C12832;
import p067l.C14403;
import p067l.C17588;
import p067l.C7470;

/* JADX INFO: loaded from: classes.dex */
public class DSTU7564 {

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest256 extends DigestDSTU7564 {
        public Digest256() {
            super(256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest384 extends DigestDSTU7564 {
        public Digest384() {
            super(MLKEMEngine.KyberPolyBytes);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Digest512 extends DigestDSTU7564 {
        public Digest512() {
            super(512);
        }
    }

    public class DigestDSTU7564 extends BCMessageDigest implements Cloneable {
        public DigestDSTU7564(int i) {
            super(new DSTU7564Digest(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public Object clone() {
            BCMessageDigest bCMessageDigest = (BCMessageDigest) super.clone();
            bCMessageDigest.digest = new DSTU7564Digest((DSTU7564Digest) this.digest);
            return bCMessageDigest;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac256 extends BaseMac {
        public HashMac256() {
            super(new DSTU7564Mac(256));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac384 extends BaseMac {
        public HashMac384() {
            super(new DSTU7564Mac(MLKEMEngine.KyberPolyBytes));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class HashMac512 extends BaseMac {
        public HashMac512() {
            super(new DSTU7564Mac(512));
        }
    }

    public class KeyGenerator256 extends BaseKeyGenerator {
        public KeyGenerator256() {
            super("HMACDSTU7564-256", 256, new CipherKeyGenerator());
        }
    }

    public class KeyGenerator384 extends BaseKeyGenerator {
        public KeyGenerator384() {
            super("HMACDSTU7564-384", MLKEMEngine.KyberPolyBytes, new CipherKeyGenerator());
        }
    }

    public class KeyGenerator512 extends BaseKeyGenerator {
        public KeyGenerator512() {
            super("HMACDSTU7564-512", 512, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends DigestAlgorithmProvider {
        public static final String PREFIX = DSTU7564.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C14403.m33021(str, "$Digest512", "MessageDigest.DSTU7564-512", C7470.m17249(str, "$Digest384", "MessageDigest.DSTU7564-384", C7470.m17249(str, "$Digest256", "MessageDigest.DSTU7564-256", sb, configurableProvider), configurableProvider), configurableProvider);
            C12832.m29413(configurableProvider, str, "$Digest256", "MessageDigest", UAObjectIdentifiers.dstu7564digest_256);
            C12832.m29413(configurableProvider, str, "$Digest384", "MessageDigest", UAObjectIdentifiers.dstu7564digest_384);
            configurableProvider.addAlgorithm("MessageDigest", UAObjectIdentifiers.dstu7564digest_512, str + "$Digest512");
            addHMACAlgorithm(configurableProvider, "DSTU7564-256", C10965.m25286(new StringBuilder(), str, "$HashMac256"), C17588.m40053(str, "$KeyGenerator256"));
            addHMACAlgorithm(configurableProvider, "DSTU7564-384", C17588.m40053(str, "$HashMac384"), C17588.m40053(str, "$KeyGenerator384"));
            addHMACAlgorithm(configurableProvider, "DSTU7564-512", C17588.m40053(str, "$HashMac512"), C17588.m40053(str, "$KeyGenerator512"));
            addHMACAlias(configurableProvider, "DSTU7564-256", UAObjectIdentifiers.dstu7564mac_256);
            addHMACAlias(configurableProvider, "DSTU7564-384", UAObjectIdentifiers.dstu7564mac_384);
            addHMACAlias(configurableProvider, "DSTU7564-512", UAObjectIdentifiers.dstu7564mac_512);
        }
    }
}
