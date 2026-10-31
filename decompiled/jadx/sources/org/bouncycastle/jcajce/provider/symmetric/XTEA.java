package org.bouncycastle.jcajce.provider.symmetric;

import l.C12662;
import l.C5368;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.XTEAEngine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public final class XTEA {

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "XTEA IV";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB extends BaseBlockCipher {
        public ECB() {
            super(new XTEAEngine());
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("XTEA", 128, new CipherKeyGenerator());
        }
    }

    public class Mappings extends AlgorithmProvider {
        public static final String PREFIX = XTEA.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$AlgParams", "AlgorithmParameters.XTEA", C5368.m15340(str, "$KeyGen", "KeyGenerator.XTEA", C5368.m15340(str, "$ECB", "Cipher.XTEA", sb, configurableProvider), configurableProvider), configurableProvider);
        }
    }
}
