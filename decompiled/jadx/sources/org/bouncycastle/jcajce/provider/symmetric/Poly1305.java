package org.bouncycastle.jcajce.provider.symmetric;

import l.C12662;
import l.C5368;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public class Poly1305 {

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Poly1305", 256, new Poly1305KeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mac extends BaseMac {
        public Mac() {
            super(new org.bouncycastle.crypto.macs.Poly1305());
        }
    }

    public class Mappings extends AlgorithmProvider {
        public static final String PREFIX = Poly1305.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$KeyGen", "KeyGenerator.POLY1305", C5368.m15340(str, "$Mac", "Mac.POLY1305", sb, configurableProvider), configurableProvider);
        }
    }
}
