package org.bouncycastle.jcajce.provider.symmetric;

import l.C12662;
import l.C8954;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public final class SipHash {

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SipHash", 128, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mac24 extends BaseMac {
        public Mac24() {
            super(new org.bouncycastle.crypto.macs.SipHash());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mac48 extends BaseMac {
        public Mac48() {
            super(new org.bouncycastle.crypto.macs.SipHash(4, 8));
        }
    }

    public class Mappings extends AlgorithmProvider {
        public static final String PREFIX = SipHash.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$Mac24", "Mac.SIPHASH-2-4", sb, configurableProvider);
            configurableProvider.addAlgorithm("KeyGenerator.SIPHASH", C8954.m23074("Mac.SIPHASH-4-8", C8954.m23074("Alg.Alias.Mac.SIPHASH", "SIPHASH-2-4", str, "$Mac48", configurableProvider), str, "$KeyGen", configurableProvider));
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.SIPHASH-2-4", "SIPHASH");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.SIPHASH-4-8", "SIPHASH");
        }
    }
}
