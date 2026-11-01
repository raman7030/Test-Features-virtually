package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.Zuc128Engine;
import org.bouncycastle.crypto.engines.Zuc256Engine;
import org.bouncycastle.crypto.macs.Zuc128Mac;
import org.bouncycastle.crypto.macs.Zuc256Mac;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import p067l.C10878;
import p067l.C14403;
import p067l.C7470;

/* JADX INFO: loaded from: classes.dex */
public class Zuc {

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Zuc IV";
        }
    }

    public class KeyGen128 extends BaseKeyGenerator {
        public KeyGen128() {
            super("ZUC128", 128, new CipherKeyGenerator());
        }
    }

    public class KeyGen256 extends BaseKeyGenerator {
        public KeyGen256() {
            super("ZUC256", 256, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends SymmetricAlgorithmProvider {
        public static final String PREFIX = Zuc.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C14403.m33021(str, "$ZucMac256", "Mac.ZUC-256", C7470.m17249(str, "$ZucMac128", "Mac.ZUC-128", C7470.m17249(str, "$AlgParams", "AlgorithmParameters.ZUC-256", C7470.m17249(str, "$KeyGen256", "KeyGenerator.ZUC-256", C7470.m17249(str, "$Zuc256", "Cipher.ZUC-256", C7470.m17249(str, "$AlgParams", "AlgorithmParameters.ZUC-128", C7470.m17249(str, "$KeyGen128", "KeyGenerator.ZUC-128", C7470.m17249(str, "$Zuc128", "Cipher.ZUC-128", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Mac.ZUC-256-32", C10878.m25048("Mac.ZUC-256-64", C10878.m25048("Alg.Alias.Mac.ZUC-256-128", "ZUC-256", str, "$ZucMac256_64", configurableProvider), str, "$ZucMac256_32", configurableProvider));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Zuc128 extends BaseStreamCipher {
        public Zuc128() {
            super(new Zuc128Engine(), 16, 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Zuc256 extends BaseStreamCipher {
        public Zuc256() {
            super(new Zuc256Engine(), 25, 256);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ZucMac128 extends BaseMac {
        public ZucMac128() {
            super(new Zuc128Mac());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ZucMac256 extends BaseMac {
        public ZucMac256() {
            super(new Zuc256Mac(128));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ZucMac256_32 extends BaseMac {
        public ZucMac256_32() {
            super(new Zuc256Mac(32));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ZucMac256_64 extends BaseMac {
        public ZucMac256_64() {
            super(new Zuc256Mac(64));
        }
    }
}
