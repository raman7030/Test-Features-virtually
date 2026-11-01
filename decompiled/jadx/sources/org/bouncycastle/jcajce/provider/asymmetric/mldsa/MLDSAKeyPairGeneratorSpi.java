package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.jcajce.spec.MLDSAParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.SpecUtil;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAKeyPairGenerator;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAParameters;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAPublicKeyParameters;
import org.bouncycastle.util.Strings;
import p067l.C18241;

/* JADX INFO: loaded from: classes.dex */
public class MLDSAKeyPairGeneratorSpi extends KeyPairGenerator {
    public MLDSAKeyPairGenerator engine;
    public boolean initialised;
    public final MLDSAParameters mldsaParameters;
    public MLDSAKeyGenerationParameters param;
    public SecureRandom random;

    public class Hash extends MLDSAKeyPairGeneratorSpi {
        public Hash() {
            super("HASH-ML-DSA");
        }
    }

    public class MLDSA44 extends MLDSAKeyPairGeneratorSpi {
        public MLDSA44() {
            super(MLDSAParameterSpec.ml_dsa_44);
        }
    }

    public class MLDSA44withSHA512 extends MLDSAKeyPairGeneratorSpi {
        public MLDSA44withSHA512() {
            super(MLDSAParameterSpec.ml_dsa_44_with_sha512);
        }
    }

    public class MLDSA65 extends MLDSAKeyPairGeneratorSpi {
        public MLDSA65() {
            super(MLDSAParameterSpec.ml_dsa_65);
        }
    }

    public class MLDSA65withSHA512 extends MLDSAKeyPairGeneratorSpi {
        public MLDSA65withSHA512() {
            super(MLDSAParameterSpec.ml_dsa_65_with_sha512);
        }
    }

    public class MLDSA87 extends MLDSAKeyPairGeneratorSpi {
        public MLDSA87() {
            super(MLDSAParameterSpec.ml_dsa_87);
        }
    }

    public class MLDSA87withSHA512 extends MLDSAKeyPairGeneratorSpi {
        public MLDSA87withSHA512() {
            super(MLDSAParameterSpec.ml_dsa_87_with_sha512);
        }
    }

    public class Pure extends MLDSAKeyPairGeneratorSpi {
        public Pure() {
            super("ML-DSA");
        }
    }

    public MLDSAKeyPairGeneratorSpi(String str) {
        super(str);
        this.engine = new MLDSAKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
        this.mldsaParameters = null;
    }

    public MLDSAKeyPairGeneratorSpi(MLDSAParameterSpec mLDSAParameterSpec) {
        super(Strings.toUpperCase(mLDSAParameterSpec.getName()));
        this.engine = new MLDSAKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
        MLDSAParameters parameters = Utils.getParameters(mLDSAParameterSpec.getName());
        this.mldsaParameters = parameters;
        if (this.param == null) {
            this.param = new MLDSAKeyGenerationParameters(this.random, parameters);
        }
        this.engine.init(this.param);
        this.initialised = true;
    }

    public static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof MLDSAParameterSpec ? ((MLDSAParameterSpec) algorithmParameterSpec).getName() : Strings.toUpperCase(SpecUtil.getNameFrom(algorithmParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            this.param = getAlgorithm().startsWith("HASH") ? new MLDSAKeyGenerationParameters(this.random, MLDSAParameters.ml_dsa_87_with_sha512) : new MLDSAKeyGenerationParameters(this.random, MLDSAParameters.ml_dsa_87);
            this.engine.init(this.param);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCMLDSAPublicKey((MLDSAPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCMLDSAPrivateKey((MLDSAPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override // java.security.KeyPairGenerator
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        try {
            initialize(algorithmParameterSpec, new BCJcaJceHelper().createSecureRandom("DEFAULT"));
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("unable to find DEFAULT DRBG");
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        String nameFromParams = getNameFromParams(algorithmParameterSpec);
        if (nameFromParams == null) {
            throw new InvalidAlgorithmParameterException(C18241.m41502("invalid ParameterSpec: ", algorithmParameterSpec));
        }
        MLDSAParameters parameters = Utils.getParameters(nameFromParams);
        if (parameters == null) {
            throw new InvalidAlgorithmParameterException("unknown parameter set name: ".concat(nameFromParams));
        }
        this.param = new MLDSAKeyGenerationParameters(secureRandom, parameters);
        if (this.mldsaParameters == null || parameters.getName().equals(this.mldsaParameters.getName())) {
            this.engine.init(this.param);
            this.initialised = true;
        } else {
            throw new InvalidAlgorithmParameterException("key pair generator locked to " + MLDSAParameterSpec.fromName(this.mldsaParameters.getName()).getName());
        }
    }
}
