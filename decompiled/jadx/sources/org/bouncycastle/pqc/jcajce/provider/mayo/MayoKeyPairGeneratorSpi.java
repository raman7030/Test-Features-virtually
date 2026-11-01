package org.bouncycastle.pqc.jcajce.provider.mayo;

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
import org.bouncycastle.pqc.crypto.mayo.MayoKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.mayo.MayoKeyPairGenerator;
import org.bouncycastle.pqc.crypto.mayo.MayoParameters;
import org.bouncycastle.pqc.crypto.mayo.MayoPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mayo.MayoPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.MayoParameterSpec;
import org.bouncycastle.util.Strings;
import p067l.C18241;

/* JADX INFO: loaded from: classes2.dex */
public class MayoKeyPairGeneratorSpi extends KeyPairGenerator {
    public static Map parameters;
    public MayoKeyPairGenerator engine;
    public boolean initialised;
    public MayoParameters mayoParameters;
    public MayoKeyGenerationParameters param;
    public SecureRandom random;

    public class Mayo1 extends MayoKeyPairGeneratorSpi {
        public Mayo1() {
            super(MayoParameters.mayo1);
        }
    }

    public class Mayo2 extends MayoKeyPairGeneratorSpi {
        public Mayo2() {
            super(MayoParameters.mayo2);
        }
    }

    public class Mayo3 extends MayoKeyPairGeneratorSpi {
        public Mayo3() {
            super(MayoParameters.mayo3);
        }
    }

    public class Mayo5 extends MayoKeyPairGeneratorSpi {
        public Mayo5() {
            super(MayoParameters.mayo5);
        }
    }

    static {
        HashMap map = new HashMap();
        parameters = map;
        MayoParameters mayoParameters = MayoParameters.mayo1;
        map.put("MAYO_1", mayoParameters);
        Map map2 = parameters;
        MayoParameters mayoParameters2 = MayoParameters.mayo2;
        map2.put("MAYO_2", mayoParameters2);
        Map map3 = parameters;
        MayoParameters mayoParameters3 = MayoParameters.mayo3;
        map3.put("MAYO_3", mayoParameters3);
        Map map4 = parameters;
        MayoParameters mayoParameters4 = MayoParameters.mayo5;
        map4.put("MAYO_5", mayoParameters4);
        parameters.put(MayoParameterSpec.mayo1.getName(), mayoParameters);
        parameters.put(MayoParameterSpec.mayo2.getName(), mayoParameters2);
        parameters.put(MayoParameterSpec.mayo3.getName(), mayoParameters3);
        parameters.put(MayoParameterSpec.mayo5.getName(), mayoParameters4);
    }

    public MayoKeyPairGeneratorSpi() {
        super("Mayo");
        this.engine = new MayoKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    public MayoKeyPairGeneratorSpi(MayoParameters mayoParameters) {
        super(mayoParameters.getName());
        this.engine = new MayoKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
        this.mayoParameters = mayoParameters;
    }

    public static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof MayoParameterSpec ? ((MayoParameterSpec) algorithmParameterSpec).getName() : Strings.toLowerCase(SpecUtil.getNameFrom(algorithmParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            MayoKeyGenerationParameters mayoKeyGenerationParameters = new MayoKeyGenerationParameters(this.random, MayoParameters.mayo1);
            this.param = mayoKeyGenerationParameters;
            this.engine.init(mayoKeyGenerationParameters);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCMayoPublicKey((MayoPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCMayoPrivateKey((MayoPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        String nameFromParams = getNameFromParams(algorithmParameterSpec);
        if (nameFromParams == null) {
            throw new InvalidAlgorithmParameterException(C18241.m41502("invalid ParameterSpec: ", algorithmParameterSpec));
        }
        MayoKeyGenerationParameters mayoKeyGenerationParameters = new MayoKeyGenerationParameters(secureRandom, (MayoParameters) parameters.get(nameFromParams));
        this.param = mayoKeyGenerationParameters;
        this.engine.init(mayoKeyGenerationParameters);
        this.initialised = true;
    }
}
