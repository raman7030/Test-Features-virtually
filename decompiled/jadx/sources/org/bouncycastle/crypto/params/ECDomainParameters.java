package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.asn1.p073x9.X9ECParameters;
import org.bouncycastle.math.p080ec.ECAlgorithms;
import org.bouncycastle.math.p080ec.ECConstants;
import org.bouncycastle.math.p080ec.ECCurve;
import org.bouncycastle.math.p080ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes.dex */
public class ECDomainParameters implements ECConstants {

    /* JADX INFO: renamed from: G */
    public final ECPoint f81248G;
    public final ECCurve curve;

    /* JADX INFO: renamed from: h */
    public final BigInteger f81249h;
    public BigInteger hInv;

    /* JADX INFO: renamed from: n */
    public final BigInteger f81250n;
    public final byte[] seed;

    public ECDomainParameters(X9ECParameters x9ECParameters) {
        this(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this(eCCurve, eCPoint, bigInteger, ECConstants.ONE, null);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this(eCCurve, eCPoint, bigInteger, bigInteger2, null);
    }

    public ECDomainParameters(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.hInv = null;
        if (eCCurve == null) {
            throw new NullPointerException("curve");
        }
        if (bigInteger == null) {
            throw new NullPointerException("n");
        }
        this.curve = eCCurve;
        this.f81248G = validatePublicPoint(eCCurve, eCPoint);
        this.f81250n = bigInteger;
        this.f81249h = bigInteger2;
        this.seed = Arrays.clone(bArr);
    }

    public static ECPoint validatePublicPoint(ECCurve eCCurve, ECPoint eCPoint) {
        if (eCPoint == null) {
            throw new NullPointerException("Point cannot be null");
        }
        ECPoint eCPointNormalize = ECAlgorithms.importPoint(eCCurve, eCPoint).normalize();
        if (eCPointNormalize.isInfinity()) {
            throw new IllegalArgumentException("Point at infinity");
        }
        if (eCPointNormalize.isValid()) {
            return eCPointNormalize;
        }
        throw new IllegalArgumentException("Point not on curve");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECDomainParameters)) {
            return false;
        }
        ECDomainParameters eCDomainParameters = (ECDomainParameters) obj;
        return this.curve.equals(eCDomainParameters.curve) && this.f81248G.equals(eCDomainParameters.f81248G) && this.f81250n.equals(eCDomainParameters.f81250n);
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f81248G;
    }

    public BigInteger getH() {
        return this.f81249h;
    }

    public synchronized BigInteger getHInv() {
        if (this.hInv == null) {
            this.hInv = BigIntegers.modOddInverseVar(this.f81250n, this.f81249h);
        }
        return this.hInv;
    }

    public BigInteger getN() {
        return this.f81250n;
    }

    public byte[] getSeed() {
        return Arrays.clone(this.seed);
    }

    public int hashCode() {
        return ((((this.curve.hashCode() ^ 1028) * 257) ^ this.f81248G.hashCode()) * 257) ^ this.f81250n.hashCode();
    }

    public BigInteger validatePrivateScalar(BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new NullPointerException("Scalar cannot be null");
        }
        if (bigInteger.compareTo(ECConstants.ONE) < 0 || bigInteger.compareTo(getN()) >= 0) {
            throw new IllegalArgumentException("Scalar is not in the interval [1, n - 1]");
        }
        return bigInteger;
    }

    public ECPoint validatePublicPoint(ECPoint eCPoint) {
        return validatePublicPoint(getCurve(), eCPoint);
    }
}
