package org.bouncycastle.jcajce.provider.symmetric;

import l.C12662;
import l.C8954;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public final class SipHash128 {

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("SipHash128", 128, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mac24 extends BaseMac {
        public Mac24() {
            super(new org.bouncycastle.crypto.macs.SipHash128());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mac48 extends BaseMac {
        public Mac48() {
            super(new org.bouncycastle.crypto.macs.SipHash128(4, 8));
        }
    }

    public class Mappings extends AlgorithmProvider {
        public static final String PREFIX = SipHash128.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$Mac24", "Mac.SIPHASH128-2-4", sb, configurableProvider);
            configurableProvider.addAlgorithm("KeyGenerator.SIPHASH128", C8954.m23074("Mac.SIPHASH128-4-8", C8954.m23074("Alg.Alias.Mac.SIPHASH128", "SIPHASH128-2-4", str, "$Mac48", configurableProvider), str, "$KeyGen", configurableProvider));
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.SIPHASH128-2-4", "SIPHASH128");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.SIPHASH128-4-8", "SIPHASH128");
        }
    }
}
