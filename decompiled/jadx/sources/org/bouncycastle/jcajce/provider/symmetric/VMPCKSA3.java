package org.bouncycastle.jcajce.provider.symmetric;

import l.C12662;
import l.C5368;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.VMPCKSA3Engine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public final class VMPCKSA3 {

    /* JADX INFO: loaded from: classes2.dex */
    public class Base extends BaseStreamCipher {
        public Base() {
            super(new VMPCKSA3Engine(), 16);
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("VMPC-KSA3", 128, new CipherKeyGenerator());
        }
    }

    public class Mappings extends AlgorithmProvider {
        public static final String PREFIX = VMPCKSA3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$KeyGen", "KeyGenerator.VMPC-KSA3", C5368.m15340(str, "$Base", "Cipher.VMPC-KSA3", sb, configurableProvider), configurableProvider);
        }
    }
}
