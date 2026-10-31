package org.bouncycastle.jcajce.provider.symmetric;

import l.C12662;
import l.C5368;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.Grainv1Engine;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public final class Grainv1 {

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Grainv1 IV";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Base extends BaseStreamCipher {
        public Base() {
            super(new Grainv1Engine(), 8);
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Grainv1", 80, new CipherKeyGenerator());
        }
    }

    public class Mappings extends AlgorithmProvider {
        public static final String PREFIX = Grainv1.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$AlgParams", "AlgorithmParameters.Grainv1", C5368.m15340(str, "$KeyGen", "KeyGenerator.Grainv1", C5368.m15340(str, "$Base", "Cipher.Grainv1", sb, configurableProvider), configurableProvider), configurableProvider);
        }
    }
}
