package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes2.dex */
public class SAKKEPrivateKeyParameters extends AsymmetricKeyParameter {
    public static final BigInteger qMinOne = SAKKEPublicKeyParameters.f81290q.subtract(BigInteger.ONE);
    public final SAKKEPublicKeyParameters publicParams;

    /* JADX INFO: renamed from: z */
    public final BigInteger f81283z;

    public SAKKEPrivateKeyParameters(BigInteger bigInteger, SAKKEPublicKeyParameters sAKKEPublicKeyParameters) {
        super(true);
        this.f81283z = bigInteger;
        this.publicParams = sAKKEPublicKeyParameters;
        if (!sAKKEPublicKeyParameters.getPoint().multiply(bigInteger).normalize().equals(sAKKEPublicKeyParameters.getZ())) {
            throw new IllegalStateException("public key and private key of SAKKE do not match");
        }
    }

    public SAKKEPrivateKeyParameters(SecureRandom secureRandom) {
        super(true);
        BigInteger bigInteger = BigIntegers.TWO;
        BigInteger bigInteger2 = qMinOne;
        BigInteger bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(bigInteger, bigInteger2, secureRandom);
        this.f81283z = bigIntegerCreateRandomInRange;
        this.publicParams = new SAKKEPublicKeyParameters(BigIntegers.createRandomInRange(bigInteger, bigInteger2, secureRandom), SAKKEPublicKeyParameters.f81284P.multiply(bigIntegerCreateRandomInRange).normalize());
    }

    public BigInteger getMasterSecret() {
        return this.f81283z;
    }

    public SAKKEPublicKeyParameters getPublicParams() {
        return this.publicParams;
    }
}
