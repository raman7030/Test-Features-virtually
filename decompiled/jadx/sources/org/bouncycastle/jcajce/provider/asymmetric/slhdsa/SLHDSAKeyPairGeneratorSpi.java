package org.bouncycastle.jcajce.provider.asymmetric.slhdsa;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.jcajce.spec.SLHDSAParameterSpec;
import org.bouncycastle.jcajce.util.SpecUtil;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAKeyPairGenerator;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAParameters;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAPublicKeyParameters;
import org.bouncycastle.util.Strings;
import p067l.C18241;

/* JADX INFO: loaded from: classes.dex */
public class SLHDSAKeyPairGeneratorSpi extends KeyPairGenerator {
    public static Map parameters;
    public SLHDSAKeyPairGenerator engine;
    public boolean initialised;
    public SLHDSAKeyGenerationParameters param;
    public SecureRandom random;

    public class Hash extends SLHDSAKeyPairGeneratorSpi {
        public Hash() {
            super("HASH-SLH-DSA");
        }
    }

    public class HashSha2_128f extends SLHDSAKeyPairGeneratorSpi {
        public HashSha2_128f() {
            super(SLHDSAParameterSpec.slh_dsa_sha2_128f_with_sha256);
        }
    }

    public class HashSha2_128s extends SLHDSAKeyPairGeneratorSpi {
        public HashSha2_128s() {
            super(SLHDSAParameterSpec.slh_dsa_sha2_128s_with_sha256);
        }
    }

    public class HashSha2_192f extends SLHDSAKeyPairGeneratorSpi {
        public HashSha2_192f() {
            super(SLHDSAParameterSpec.slh_dsa_sha2_192f_with_sha512);
        }
    }

    public class HashSha2_192s extends SLHDSAKeyPairGeneratorSpi {
        public HashSha2_192s() {
            super(SLHDSAParameterSpec.slh_dsa_sha2_192s_with_sha512);
        }
    }

    public class HashSha2_256f extends SLHDSAKeyPairGeneratorSpi {
        public HashSha2_256f() {
            super(SLHDSAParameterSpec.slh_dsa_sha2_256f_with_sha512);
        }
    }

    public class HashSha2_256s extends SLHDSAKeyPairGeneratorSpi {
        public HashSha2_256s() {
            super(SLHDSAParameterSpec.slh_dsa_sha2_256s_with_sha512);
        }
    }

    public class HashShake_128f extends SLHDSAKeyPairGeneratorSpi {
        public HashShake_128f() {
            super(SLHDSAParameterSpec.slh_dsa_shake_128f_with_shake128);
        }
    }

    public class HashShake_128s extends SLHDSAKeyPairGeneratorSpi {
        public HashShake_128s() {
            super(SLHDSAParameterSpec.slh_dsa_shake_128s_with_shake128);
        }
    }

    public class HashShake_192f extends SLHDSAKeyPairGeneratorSpi {
        public HashShake_192f() {
            super(SLHDSAParameterSpec.slh_dsa_shake_192f_with_shake256);
        }
    }

    public class HashShake_192s extends SLHDSAKeyPairGeneratorSpi {
        public HashShake_192s() {
            super(SLHDSAParameterSpec.slh_dsa_shake_192s_with_shake256);
        }
    }

    public class HashShake_256f extends SLHDSAKeyPairGeneratorSpi {
        public HashShake_256f() {
            super(SLHDSAParameterSpec.slh_dsa_shake_256f_with_shake256);
        }
    }

    public class HashShake_256s extends SLHDSAKeyPairGeneratorSpi {
        public HashShake_256s() {
            super(SLHDSAParameterSpec.slh_dsa_shake_256s_with_shake256);
        }
    }

    public class Pure extends SLHDSAKeyPairGeneratorSpi {
        public Pure() {
            super("SLH-DSA");
        }
    }

    public class Sha2_128f extends SLHDSAKeyPairGeneratorSpi {
        public Sha2_128f() {
            super(SLHDSAParameterSpec.slh_dsa_sha2_128f);
        }
    }

    public class Sha2_128s extends SLHDSAKeyPairGeneratorSpi {
        public Sha2_128s() {
            super(SLHDSAParameterSpec.slh_dsa_sha2_128s);
        }
    }

    public class Sha2_192f extends SLHDSAKeyPairGeneratorSpi {
        public Sha2_192f() {
            super(SLHDSAParameterSpec.slh_dsa_sha2_192f);
        }
    }

    public class Sha2_192s extends SLHDSAKeyPairGeneratorSpi {
        public Sha2_192s() {
            super(SLHDSAParameterSpec.slh_dsa_sha2_192s);
        }
    }

    public class Sha2_256f extends SLHDSAKeyPairGeneratorSpi {
        public Sha2_256f() {
            super(SLHDSAParameterSpec.slh_dsa_sha2_256f);
        }
    }

    public class Sha2_256s extends SLHDSAKeyPairGeneratorSpi {
        public Sha2_256s() {
            super(SLHDSAParameterSpec.slh_dsa_sha2_256s);
        }
    }

    public class Shake_128f extends SLHDSAKeyPairGeneratorSpi {
        public Shake_128f() {
            super(SLHDSAParameterSpec.slh_dsa_shake_128f);
        }
    }

    public class Shake_128s extends SLHDSAKeyPairGeneratorSpi {
        public Shake_128s() {
            super(SLHDSAParameterSpec.slh_dsa_shake_128s);
        }
    }

    public class Shake_192f extends SLHDSAKeyPairGeneratorSpi {
        public Shake_192f() {
            super(SLHDSAParameterSpec.slh_dsa_shake_192f);
        }
    }

    public class Shake_192s extends SLHDSAKeyPairGeneratorSpi {
        public Shake_192s() {
            super(SLHDSAParameterSpec.slh_dsa_shake_192s);
        }
    }

    public class Shake_256f extends SLHDSAKeyPairGeneratorSpi {
        public Shake_256f() {
            super(SLHDSAParameterSpec.slh_dsa_shake_256f);
        }
    }

    public class Shake_256s extends SLHDSAKeyPairGeneratorSpi {
        public Shake_256s() {
            super(SLHDSAParameterSpec.slh_dsa_shake_256s);
        }
    }

    static {
        HashMap map = new HashMap();
        parameters = map;
        map.put(SLHDSAParameterSpec.slh_dsa_sha2_128f.getName(), SLHDSAParameters.sha2_128f);
        parameters.put(SLHDSAParameterSpec.slh_dsa_sha2_128s.getName(), SLHDSAParameters.sha2_128s);
        parameters.put(SLHDSAParameterSpec.slh_dsa_sha2_192f.getName(), SLHDSAParameters.sha2_192f);
        parameters.put(SLHDSAParameterSpec.slh_dsa_sha2_192s.getName(), SLHDSAParameters.sha2_192s);
        parameters.put(SLHDSAParameterSpec.slh_dsa_sha2_256f.getName(), SLHDSAParameters.sha2_256f);
        parameters.put(SLHDSAParameterSpec.slh_dsa_sha2_256s.getName(), SLHDSAParameters.sha2_256s);
        parameters.put(SLHDSAParameterSpec.slh_dsa_shake_128f.getName(), SLHDSAParameters.shake_128f);
        parameters.put(SLHDSAParameterSpec.slh_dsa_shake_128s.getName(), SLHDSAParameters.shake_128s);
        parameters.put(SLHDSAParameterSpec.slh_dsa_shake_192f.getName(), SLHDSAParameters.shake_192f);
        parameters.put(SLHDSAParameterSpec.slh_dsa_shake_192s.getName(), SLHDSAParameters.shake_192s);
        parameters.put(SLHDSAParameterSpec.slh_dsa_shake_256f.getName(), SLHDSAParameters.shake_256f);
        parameters.put(SLHDSAParameterSpec.slh_dsa_shake_256s.getName(), SLHDSAParameters.shake_256s);
        parameters.put(SLHDSAParameterSpec.slh_dsa_sha2_128f_with_sha256.getName(), SLHDSAParameters.sha2_128f_with_sha256);
        parameters.put(SLHDSAParameterSpec.slh_dsa_sha2_128s_with_sha256.getName(), SLHDSAParameters.sha2_128s_with_sha256);
        parameters.put(SLHDSAParameterSpec.slh_dsa_sha2_192f_with_sha512.getName(), SLHDSAParameters.sha2_192f_with_sha512);
        parameters.put(SLHDSAParameterSpec.slh_dsa_sha2_192s_with_sha512.getName(), SLHDSAParameters.sha2_192s_with_sha512);
        parameters.put(SLHDSAParameterSpec.slh_dsa_sha2_256f_with_sha512.getName(), SLHDSAParameters.sha2_256f_with_sha512);
        parameters.put(SLHDSAParameterSpec.slh_dsa_sha2_256s_with_sha512.getName(), SLHDSAParameters.sha2_256s_with_sha512);
        parameters.put(SLHDSAParameterSpec.slh_dsa_shake_128f_with_shake128.getName(), SLHDSAParameters.shake_128f_with_shake128);
        parameters.put(SLHDSAParameterSpec.slh_dsa_shake_128s_with_shake128.getName(), SLHDSAParameters.shake_128s_with_shake128);
        parameters.put(SLHDSAParameterSpec.slh_dsa_shake_192f_with_shake256.getName(), SLHDSAParameters.shake_192f_with_shake256);
        parameters.put(SLHDSAParameterSpec.slh_dsa_shake_192s_with_shake256.getName(), SLHDSAParameters.shake_192s_with_shake256);
        parameters.put(SLHDSAParameterSpec.slh_dsa_shake_256f_with_shake256.getName(), SLHDSAParameters.shake_256f_with_shake256);
        parameters.put(SLHDSAParameterSpec.slh_dsa_shake_256s_with_shake256.getName(), SLHDSAParameters.shake_256s_with_shake256);
    }

    public SLHDSAKeyPairGeneratorSpi(String str) {
        super(str);
        this.engine = new SLHDSAKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    public SLHDSAKeyPairGeneratorSpi(SLHDSAParameterSpec sLHDSAParameterSpec) {
        super("SLH-DSA-" + Strings.toUpperCase(sLHDSAParameterSpec.getName()));
        this.engine = new SLHDSAKeyPairGenerator();
        SecureRandom secureRandom = CryptoServicesRegistrar.getSecureRandom();
        this.random = secureRandom;
        this.initialised = false;
        SLHDSAKeyGenerationParameters sLHDSAKeyGenerationParameters = new SLHDSAKeyGenerationParameters(secureRandom, (SLHDSAParameters) parameters.get(sLHDSAParameterSpec.getName()));
        this.param = sLHDSAKeyGenerationParameters;
        this.engine.init(sLHDSAKeyGenerationParameters);
        this.initialised = true;
    }

    public static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof SLHDSAParameterSpec ? ((SLHDSAParameterSpec) algorithmParameterSpec).getName() : Strings.toUpperCase(SpecUtil.getNameFrom(algorithmParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            this.param = getAlgorithm().startsWith("HASH") ? new SLHDSAKeyGenerationParameters(this.random, SLHDSAParameters.sha2_128f_with_sha256) : new SLHDSAKeyGenerationParameters(this.random, SLHDSAParameters.sha2_128f);
            this.engine.init(this.param);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair asymmetricCipherKeyPairGenerateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCSLHDSAPublicKey((SLHDSAPublicKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPublic()), new BCSLHDSAPrivateKey((SLHDSAPrivateKeyParameters) asymmetricCipherKeyPairGenerateKeyPair.getPrivate()));
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
        SLHDSAParameters sLHDSAParameters = (SLHDSAParameters) parameters.get(nameFromParams);
        if (sLHDSAParameters == null) {
            throw new InvalidAlgorithmParameterException("unknown parameter set name: ".concat(nameFromParams));
        }
        SLHDSAKeyGenerationParameters sLHDSAKeyGenerationParameters = new SLHDSAKeyGenerationParameters(secureRandom, sLHDSAParameters);
        this.param = sLHDSAKeyGenerationParameters;
        this.engine.init(sLHDSAKeyGenerationParameters);
        this.initialised = true;
    }
}
