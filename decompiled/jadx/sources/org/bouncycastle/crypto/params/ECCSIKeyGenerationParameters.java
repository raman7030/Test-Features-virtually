package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes.dex */
public class ECCSIKeyGenerationParameters extends KeyGenerationParameters {
    public final ECPoint G;
    public final Digest digest;
    public final byte[] id;
    public final ECPoint kpak;
    public final BigInteger ksak;
    public final int n;
    public final BigInteger q;

    public ECCSIKeyGenerationParameters(SecureRandom secureRandom, X9ECParameters x9ECParameters, Digest digest, byte[] bArr) {
        super(secureRandom, x9ECParameters.getCurve().getA().bitLength());
        BigInteger order = x9ECParameters.getCurve().getOrder();
        this.q = order;
        ECPoint g = x9ECParameters.getG();
        this.G = g;
        this.digest = digest;
        this.id = Arrays.clone(bArr);
        int iBitLength = x9ECParameters.getCurve().getA().bitLength();
        this.n = iBitLength;
        BigInteger bigIntegerMod = BigIntegers.createRandomBigInteger(iBitLength, secureRandom).mod(order);
        this.ksak = bigIntegerMod;
        this.kpak = g.multiply(bigIntegerMod).normalize();
    }

    public BigInteger computeSSK(BigInteger bigInteger) {
        return this.ksak.add(bigInteger).mod(this.q);
    }

    public Digest getDigest() {
        return this.digest;
    }

    public ECPoint getG() {
        return this.G;
    }

    public byte[] getId() {
        return Arrays.clone(this.id);
    }

    public ECPoint getKPAK() {
        return this.kpak;
    }

    public int getN() {
        return this.n;
    }

    public BigInteger getQ() {
        return this.q;
    }
}
