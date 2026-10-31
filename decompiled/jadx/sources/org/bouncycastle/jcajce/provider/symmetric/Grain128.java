package org.bouncycastle.jcajce.provider.symmetric;

import l.C12662;
import l.C5368;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.Grain128Engine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public final class Grain128 {

    /* JADX INFO: loaded from: classes2.dex */
    public class Base extends BaseStreamCipher {
        public Base() {
            super(new Grain128Engine(), 12);
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Grain128", 128, new CipherKeyGenerator());
        }
    }

    public class Mappings extends AlgorithmProvider {
        public static final String PREFIX = Grain128.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$KeyGen", "KeyGenerator.Grain128", C5368.m15340(str, "$Base", "Cipher.Grain128", sb, configurableProvider), configurableProvider);
        }
    }
}
