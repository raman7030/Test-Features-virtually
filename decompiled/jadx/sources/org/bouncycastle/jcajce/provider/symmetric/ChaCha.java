package org.bouncycastle.jcajce.provider.symmetric;

import l.C12662;
import l.C18473;
import l.C19462;
import l.C3435;
import l.C5368;
import l.C9045;
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
            C12662.m30943(str, "$AlgParams", "AlgorithmParameters.CHACHA7539", C5368.m15340(str, "$KeyGen7539", "KeyGenerator.CHACHA7539", C5368.m15340(str, "$Base7539", "Cipher.CHACHA7539", C5368.m15340(str, "$KeyGen", "KeyGenerator.CHACHA", C5368.m15340(str, "$Base", "Cipher.CHACHA", sb, configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.CHACHA20-POLY1305", "CHACHA7539");
            StringBuilder sb2 = new StringBuilder("Alg.Alias.KeyGenerator.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_alg_AEADChaCha20Poly1305;
            StringBuilder sbM10502 = C3435.m10502("$BaseCC20P1305", "Cipher.CHACHA20-POLY1305", str, C9045.m23342("CHACHA7539", str, sb2, aSN1ObjectIdentifier, configurableProvider), configurableProvider);
            sbM10502.append("$AlgParamsCC1305");
            configurableProvider.addAlgorithm("AlgorithmParameters.CHACHA20-POLY1305", sbM10502.toString());
            C19462.m44861(C18473.m42951("CHACHA20-POLY1305", "Alg.Alias.AlgorithmParameters.OID.", C18473.m42951("CHACHA20-POLY1305", "Alg.Alias.Cipher.OID.", C18473.m42951("CHACHA20-POLY1305", "Alg.Alias.AlgorithmParameters.", new StringBuilder("Alg.Alias.Cipher."), aSN1ObjectIdentifier, configurableProvider), aSN1ObjectIdentifier, configurableProvider), aSN1ObjectIdentifier, configurableProvider), aSN1ObjectIdentifier, configurableProvider, "CHACHA20-POLY1305");
        }
    }
}
