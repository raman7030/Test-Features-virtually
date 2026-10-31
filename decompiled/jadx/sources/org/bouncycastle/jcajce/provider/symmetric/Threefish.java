package org.bouncycastle.jcajce.provider.symmetric;

import l.C12662;
import l.C5368;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public final class Threefish {

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParams_1024 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Threefish-1024 IV";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParams_256 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Threefish-256 IV";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParams_512 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Threefish-512 IV";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CMAC_1024 extends BaseMac {
        public CMAC_1024() {
            super(new CMac(new ThreefishEngine(1024)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CMAC_256 extends BaseMac {
        public CMAC_256() {
            super(new CMac(new ThreefishEngine(256)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CMAC_512 extends BaseMac {
        public CMAC_512() {
            super(new CMac(new ThreefishEngine(512)));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB_1024 extends BaseBlockCipher {
        public ECB_1024() {
            super(new ThreefishEngine(1024));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB_256 extends BaseBlockCipher {
        public ECB_256() {
            super(new ThreefishEngine(256));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB_512 extends BaseBlockCipher {
        public ECB_512() {
            super(new ThreefishEngine(512));
        }
    }

    public class KeyGen_1024 extends BaseKeyGenerator {
        public KeyGen_1024() {
            super("Threefish-1024", 1024, new CipherKeyGenerator());
        }
    }

    public class KeyGen_256 extends BaseKeyGenerator {
        public KeyGen_256() {
            super("Threefish-256", 256, new CipherKeyGenerator());
        }
    }

    public class KeyGen_512 extends BaseKeyGenerator {
        public KeyGen_512() {
            super("Threefish-512", 512, new CipherKeyGenerator());
        }
    }

    public class Mappings extends AlgorithmProvider {
        public static final String PREFIX = Threefish.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$AlgParams_1024", "AlgorithmParameters.Threefish-1024", C5368.m15340(str, "$AlgParams_512", "AlgorithmParameters.Threefish-512", C5368.m15340(str, "$AlgParams_256", "AlgorithmParameters.Threefish-256", C5368.m15340(str, "$KeyGen_1024", "KeyGenerator.Threefish-1024", C5368.m15340(str, "$KeyGen_512", "KeyGenerator.Threefish-512", C5368.m15340(str, "$KeyGen_256", "KeyGenerator.Threefish-256", C5368.m15340(str, "$ECB_1024", "Cipher.Threefish-1024", C5368.m15340(str, "$ECB_512", "Cipher.Threefish-512", C5368.m15340(str, "$ECB_256", "Cipher.Threefish-256", C5368.m15340(str, "$CMAC_1024", "Mac.Threefish-1024CMAC", C5368.m15340(str, "$CMAC_512", "Mac.Threefish-512CMAC", C5368.m15340(str, "$CMAC_256", "Mac.Threefish-256CMAC", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
        }
    }
}
