package org.bouncycastle.jcajce.provider.symmetric;

import l.C11010;
import l.C12662;
import l.C16014;
import l.C5368;
import l.C9045;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.SerpentEngine;
import org.bouncycastle.crypto.engines.TnepresEngine;
import org.bouncycastle.crypto.generators.Poly1305KeyGenerator;
import org.bouncycastle.crypto.macs.GMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.internal.asn1.gnu.GNUObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

/* JADX INFO: loaded from: classes.dex */
public final class Serpent {

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Serpent IV";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC extends BaseBlockCipher {
        public CBC() {
            super(new CBCBlockCipher(new SerpentEngine()), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC128 extends BaseBlockCipher {
        public CBC128() {
            super(128, new CBCBlockCipher(new SerpentEngine()), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC192 extends BaseBlockCipher {
        public CBC192() {
            super(192, new CBCBlockCipher(new SerpentEngine()), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC256 extends BaseBlockCipher {
        public CBC256() {
            super(256, new CBCBlockCipher(new SerpentEngine()), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CFB extends BaseBlockCipher {
        public CFB() {
            super(new BufferedBlockCipher(new CFBBlockCipher(new SerpentEngine(), 128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CFB128 extends BaseBlockCipher {
        public CFB128() {
            super(128, new BufferedBlockCipher(new CFBBlockCipher(new SerpentEngine(), 128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CFB192 extends BaseBlockCipher {
        public CFB192() {
            super(192, new BufferedBlockCipher(new CFBBlockCipher(new SerpentEngine(), 128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CFB256 extends BaseBlockCipher {
        public CFB256() {
            super(256, new BufferedBlockCipher(new CFBBlockCipher(new SerpentEngine(), 128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB extends BaseBlockCipher {
        public ECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new SerpentEngine();
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB128 extends BaseBlockCipher {
        public ECB128() {
            super(128, new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.ECB128.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new SerpentEngine();
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB192 extends BaseBlockCipher {
        public ECB192() {
            super(192, new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.ECB192.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new SerpentEngine();
                }
            });
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB256 extends BaseBlockCipher {
        public ECB256() {
            super(256, new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.ECB256.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new SerpentEngine();
                }
            });
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("Serpent", 192, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mappings extends SymmetricAlgorithmProvider {
        public static final String PREFIX = Serpent.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$TAlgParams", "AlgorithmParameters.Tnepres", C5368.m15340(str, "$TKeyGen", "KeyGenerator.Tnepres", C5368.m15340(str, "$TECB", "Cipher.Tnepres", C5368.m15340(str, "$AlgParams", "AlgorithmParameters.Serpent", C5368.m15340(str, "$KeyGen", "KeyGenerator.Serpent", C5368.m15340(str, "$ECB", "Cipher.Serpent", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            C11010.m27351(configurableProvider, str, "$ECB128", "Cipher", GNUObjectIdentifiers.Serpent_128_ECB);
            C11010.m27351(configurableProvider, str, "$ECB192", "Cipher", GNUObjectIdentifiers.Serpent_192_ECB);
            C11010.m27351(configurableProvider, str, "$ECB256", "Cipher", GNUObjectIdentifiers.Serpent_256_ECB);
            C11010.m27351(configurableProvider, str, "$CBC128", "Cipher", GNUObjectIdentifiers.Serpent_128_CBC);
            C11010.m27351(configurableProvider, str, "$CBC192", "Cipher", GNUObjectIdentifiers.Serpent_192_CBC);
            C11010.m27351(configurableProvider, str, "$CBC256", "Cipher", GNUObjectIdentifiers.Serpent_256_CBC);
            C11010.m27351(configurableProvider, str, "$CFB128", "Cipher", GNUObjectIdentifiers.Serpent_128_CFB);
            C11010.m27351(configurableProvider, str, "$CFB192", "Cipher", GNUObjectIdentifiers.Serpent_192_CFB);
            C11010.m27351(configurableProvider, str, "$CFB256", "Cipher", GNUObjectIdentifiers.Serpent_256_CFB);
            C11010.m27351(configurableProvider, str, "$OFB128", "Cipher", GNUObjectIdentifiers.Serpent_128_OFB);
            C11010.m27351(configurableProvider, str, "$OFB192", "Cipher", GNUObjectIdentifiers.Serpent_192_OFB);
            configurableProvider.addAlgorithm("Cipher", GNUObjectIdentifiers.Serpent_256_OFB, str + "$OFB256");
            addGMacAlgorithm(configurableProvider, "SERPENT", C9045.m23341(new StringBuilder(), str, "$SerpentGMAC"), C16014.m37867(str, "$KeyGen"));
            addGMacAlgorithm(configurableProvider, "TNEPRES", C16014.m37867(str, "$TSerpentGMAC"), C16014.m37867(str, "$TKeyGen"));
            addPoly1305Algorithm(configurableProvider, "SERPENT", C16014.m37867(str, "$Poly1305"), C16014.m37867(str, "$Poly1305KeyGen"));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class OFB extends BaseBlockCipher {
        public OFB() {
            super(new BufferedBlockCipher(new OFBBlockCipher(new SerpentEngine(), 128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class OFB128 extends BaseBlockCipher {
        public OFB128() {
            super(128, new BufferedBlockCipher(new OFBBlockCipher(new SerpentEngine(), 128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class OFB192 extends BaseBlockCipher {
        public OFB192() {
            super(192, new BufferedBlockCipher(new OFBBlockCipher(new SerpentEngine(), 128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class OFB256 extends BaseBlockCipher {
        public OFB256() {
            super(256, new BufferedBlockCipher(new OFBBlockCipher(new SerpentEngine(), 128)), 128);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Poly1305 extends BaseMac {
        public Poly1305() {
            super(new org.bouncycastle.crypto.macs.Poly1305(new SerpentEngine()));
        }
    }

    public class Poly1305KeyGen extends BaseKeyGenerator {
        public Poly1305KeyGen() {
            super("Poly1305-Serpent", 256, new Poly1305KeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class SerpentGMAC extends BaseMac {
        public SerpentGMAC() {
            super(new GMac(GCMBlockCipher.newInstance(new SerpentEngine())));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class TAlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "Tnepres IV";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class TECB extends BaseBlockCipher {
        public TECB() {
            super(new BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.Serpent.TECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public BlockCipher get() {
                    return new TnepresEngine();
                }
            });
        }
    }

    public class TKeyGen extends BaseKeyGenerator {
        public TKeyGen() {
            super("Tnepres", 192, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class TSerpentGMAC extends BaseMac {
        public TSerpentGMAC() {
            super(new GMac(GCMBlockCipher.newInstance(new TnepresEngine())));
        }
    }
}
