package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.engines.ChaCha7539Engine;
import org.bouncycastle.crypto.engines.ChaChaEngine;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.modes.ChaCha20Poly1305;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import p067l.C10965;
import p067l.C14403;
import p067l.C19925;
import p067l.C20865;
import p067l.C5633;
import p067l.C7470;

/* JADX INFO: loaded from: classes.dex */
public final class ChaCha {

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "ChaCha7539 IV";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParamsCC1305 extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "ChaCha20-Poly1305 IV";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Base extends BaseStreamCipher {
        public Base() {
            super(new ChaChaEngine(), 8);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Base7539 extends BaseStreamCipher {
        public Base7539() {
            super(new ChaCha7539Engine(), 12);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class BaseCC20P1305 extends BaseBlockCipher {
        public BaseCC20P1305() {
            super((AEADCipher) new ChaCha20Poly1305(), true, 12);
        }
    }

    public class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            super("ChaCha", 128, new CipherKeyGenerator());
        }
    }

    public class KeyGen7539 extends BaseKeyGenerator {
        public KeyGen7539() {
            super("ChaCha7539", 256, new CipherKeyGenerator());
        }
    }

    public class Mappings extends AlgorithmProvider {
        public static final String PREFIX = ChaCha.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C14403.m33021(str, "$AlgParams", "AlgorithmParameters.CHACHA7539", C7470.m17249(str, "$KeyGen7539", "KeyGenerator.CHACHA7539", C7470.m17249(str, "$Base7539", "Cipher.CHACHA7539", C7470.m17249(str, "$KeyGen", "KeyGenerator.CHACHA", C7470.m17249(str, "$Base", "Cipher.CHACHA", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.CHACHA20-POLY1305", "CHACHA7539");
            StringBuilder sb2 = new StringBuilder("Alg.Alias.KeyGenerator.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_alg_AEADChaCha20Poly1305;
            StringBuilder sbM12526 = C5633.m12526("$BaseCC20P1305", "Cipher.CHACHA20-POLY1305", str, C10965.m25287("CHACHA7539", str, sb2, aSN1ObjectIdentifier, configurableProvider), configurableProvider);
            sbM12526.append("$AlgParamsCC1305");
            configurableProvider.addAlgorithm("AlgorithmParameters.CHACHA20-POLY1305", sbM12526.toString());
            C20865.m47157(C19925.m45227("CHACHA20-POLY1305", "Alg.Alias.AlgorithmParameters.OID.", C19925.m45227("CHACHA20-POLY1305", "Alg.Alias.Cipher.OID.", C19925.m45227("CHACHA20-POLY1305", "Alg.Alias.AlgorithmParameters.", new StringBuilder("Alg.Alias.Cipher."), aSN1ObjectIdentifier, configurableProvider), aSN1ObjectIdentifier, configurableProvider), aSN1ObjectIdentifier, configurableProvider), aSN1ObjectIdentifier, configurableProvider, "CHACHA20-POLY1305");
        }
    }
}
