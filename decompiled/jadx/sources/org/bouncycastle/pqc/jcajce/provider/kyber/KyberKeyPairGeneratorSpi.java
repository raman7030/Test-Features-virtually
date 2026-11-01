package org.bouncycastle.pqc.jcajce.provider.kyber;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.jcajce.util.SpecUtil;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMKeyPairGenerator;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.KyberParameterSpec;
import org.bouncycastle.util.Strings;
import p067l.C18241;

/* JADX INFO: loaded from: classes2.dex */
public class KyberKeyPairGeneratorSpi extends KeyPairGenerator {
    public static Map parameters;
    public MLKEMKeyPairGenerator engine;
    public boolean initialised;
    public MLKEMParameters kyberParameters;
    public MLKEMKeyGenerationParameters param;
    public SecureRandom random;

    public class Kyber1024 extends KyberKeyPairGeneratorSpi {
        public Kyber1024() {
            super(MLKEMParameters.ml_kem_1024);
        }
    }

    public class Kyber512 extends KyberKeyPairGeneratorSpi {
        public Kyber512() {
            super(MLKEMParameters.ml_kem_512);
        }
    }

    public class Kyber768 extends KyberKeyPairGeneratorSpi {
        public Kyber768() {
            super(MLKEMParameters.ml_kem_768);
        }
    }

    static {
        HashMap map = new HashMap();
        parameters = map;
        map.put(KyberParameterSpec.kyber512.getName(), MLKEMParameters.ml_kem_512);
        parameters.put(KyberParameterSpec.kyber768.getName(), MLKEMParameters.ml_kem_768);
        parameters.put(KyberParameterSpec.kyber1024.getName(), MLKEMParameters.ml_kem_1024);
    }

    public KyberKeyPairGeneratorSpi() {
        super("KYBER");
        this.engine = new MLKEMKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
        this.kyberParameters = null;
    }

    public KyberKeyPairGeneratorSpi(MLKEMParameters mLKEMParameters) {
        super(Strings.toUpperCase(mLKEMParameters.getName()));
        this.engine = new MLKEMKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
        this.kyberParameters = mLKEMParameters;
    }

    public static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof KyberParameterSpec ? ((KyberParameterSpec) algorithmParameterSpec).getName() : Strings.toLowerCase(SpecUtil.getNameFrom(algorithmParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            MLKEMParameters mLKEMParameters = this.kyberParameters;
            if (mLKEMParameters != null) {
                this.param = new MLKEMKeyGenerationParameters(this.random, mLKEMParameters);
            } else {
                this.param = new MLKEMKeyGenerationParameters(this.random, MLKEMParameters.ml_kem_1024);
            }
            this.engine.init(this.param);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCKyberPublicKey((MLKEMPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCKyberPrivateKey((MLKEMPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        String nameFromParams = getNameFromParams(algorithmParameterSpec);
        if (nameFromParams == null || !parameters.containsKey(nameFromParams)) {
            throw new InvalidAlgorithmParameterException(C18241.m41502("invalid ParameterSpec: ", algorithmParameterSpec));
        }
        MLKEMParameters mLKEMParameters = (MLKEMParameters) parameters.get(nameFromParams);
        this.param = new MLKEMKeyGenerationParameters(secureRandom, mLKEMParameters);
        if (this.kyberParameters == null || mLKEMParameters.getName().equals(this.kyberParameters.getName())) {
            this.engine.init(this.param);
            this.initialised = true;
        } else {
            throw new InvalidAlgorithmParameterException("key pair generator locked to " + Strings.toUpperCase(this.kyberParameters.getName()));
        }
    }
}
