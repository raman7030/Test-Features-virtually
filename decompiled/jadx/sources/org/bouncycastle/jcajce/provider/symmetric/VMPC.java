package org.bouncycastle.jcajce.provider.symmetric;

import l.C12662;
import l.C5368;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.VMPCEngine;
import org.bouncycastle.crypto.macs.VMPCMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public final class VMPC {

    /* JADX INFO: loaded from: classes2.dex */
    public class Base extends BaseStreamCipher {
        public Base() {
            super(new VMPCEngine(), 16);
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("VMPC", 128, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mac extends BaseMac {
        public Mac() {
            super(new VMPCMac());
        }
    }

    public class Mappings extends AlgorithmProvider {
        public static final String PREFIX = VMPC.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$Mac", "Mac.VMPCMAC", C5368.m15340(str, "$KeyGen", "KeyGenerator.VMPC", C5368.m15340(str, "$Base", "Cipher.VMPC", sb, configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Mac.VMPC", "VMPCMAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.VMPC-MAC", "VMPCMAC");
        }
    }
}
