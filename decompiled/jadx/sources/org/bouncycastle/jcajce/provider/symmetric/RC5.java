package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import l.C12662;
import l.C20382;
import l.C5368;
import l.C8954;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.engines.RC532Engine;
import org.bouncycastle.crypto.engines.RC564Engine;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes.dex */
public final class RC5 {

    public class AlgParamGen extends BaseAlgorithmParameterGenerator {
        @Override // java.security.AlgorithmParameterGeneratorSpi
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance("RC5");
                algorithmParametersCreateParametersInstance.init(new IvParameterSpec(bArr));
                return algorithmParametersCreateParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC5 parameter generation.");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class AlgParams extends IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "RC5 IV";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CBC32 extends BaseBlockCipher {
        public CBC32() {
            super(new CBCBlockCipher(new RC532Engine()), 64);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class CFB8Mac32 extends BaseMac {
        public CFB8Mac32() {
            super(new CFBBlockCipherMac(new RC532Engine()));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB32 extends BaseBlockCipher {
        public ECB32() {
            super(new RC532Engine());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class ECB64 extends BaseBlockCipher {
        public ECB64() {
            super(new RC564Engine());
        }
    }

    public class KeyGen32 extends BaseKeyGenerator {
        public KeyGen32() {
            super("RC5", 128, new CipherKeyGenerator());
        }
    }

    public class KeyGen64 extends BaseKeyGenerator {
        public KeyGen64() {
            super("RC5-64", 256, new CipherKeyGenerator());
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class Mac32 extends BaseMac {
        public Mac32() {
            super(new CBCBlockCipherMac(new RC532Engine()));
        }
    }

    public class Mappings extends AlgorithmProvider {
        public static final String PREFIX = RC5.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            C12662.m30943(str, "$ECB32", "Cipher.RC5", sb, configurableProvider);
            C12662.m30943(str, "$Mac32", "Mac.RC5MAC", C5368.m15340(str, "$AlgParams", "AlgorithmParameters.RC5-64", C5368.m15340(str, "$AlgParams", "AlgorithmParameters.RC5", C5368.m15340(str, "$KeyGen64", "KeyGenerator.RC5-64", C20382.m46696("KeyGenerator.RC5", C8954.m23074("Cipher.RC5-64", C8954.m23074("Alg.Alias.Cipher.RC5-32", "RC5", str, "$ECB64", configurableProvider), str, "$KeyGen32", configurableProvider), "Alg.Alias.KeyGenerator.RC5-32", "RC5", configurableProvider), configurableProvider), configurableProvider), configurableProvider), configurableProvider);
            configurableProvider.addAlgorithm("Mac.RC5MAC/CFB8", C8954.m23074("Alg.Alias.Mac.RC5", "RC5MAC", str, "$CFB8Mac32", configurableProvider));
            configurableProvider.addAlgorithm("Alg.Alias.Mac.RC5/CFB8", "RC5MAC/CFB8");
        }
    }
}
