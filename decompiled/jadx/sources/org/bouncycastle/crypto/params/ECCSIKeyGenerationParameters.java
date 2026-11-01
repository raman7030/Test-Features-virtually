package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.asn1.p073x9.X9ECParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.math.p080ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes.dex */
public class ECCSIKeyGenerationParameters extends KeyGenerationParameters {

    /* JADX INFO: renamed from: G */
    public final ECPoint f81244G;
    public final Digest digest;

    /* JADX INFO: renamed from: id */
    public final byte[] f81245id;
    public final ECPoint kpak;
    public final BigInteger ksak;

    /* JADX INFO: renamed from: n */
    public final int f81246n;

    /* JADX INFO: renamed from: q */
    public final BigInteger f81247q;

    public ECCSIKeyGenerationParameters(SecureRandom secureRandom, X9ECParameters x9ECParameters, Digest digest, byte[] bArr) {
        super(secureRandom, x9ECParameters.getCurve().getA().bitLength());
        BigInteger order = x9ECParameters.getCurve().getOrder();
        this.f81247q = order;
        ECPoint g = x9ECParameters.getG();
        this.f81244G = g;
        this.digest = digest;
        this.f81245id = Arrays.clone(bArr);
        int iBitLength = x9ECParameters.getCurve().getA().bitLength();
        this.f81246n = iBitLength;
        BigInteger bigIntegerMod = BigIntegers.createRandomBigInteger(iBitLength, secureRandom).mod(order);
        this.ksak = bigIntegerMod;
        this.kpak = g.multiply(bigIntegerMod).normalize();
    }

    public BigInteger computeSSK(BigInteger bigInteger) {
        return this.ksak.add(bigInteger).mod(this.f81247q);
    }

    public Digest getDigest() {
        return this.digest;
    }

    public ECPoint getG() {
        return this.f81244G;
    }

    public byte[] getId() {
        return Arrays.clone(this.f81245id);
    }

    public ECPoint getKPAK() {
        return this.kpak;
    }

    public int getN() {
        return this.f81246n;
    }

    public BigInteger getQ() {
        return this.f81247q;
    }
}
