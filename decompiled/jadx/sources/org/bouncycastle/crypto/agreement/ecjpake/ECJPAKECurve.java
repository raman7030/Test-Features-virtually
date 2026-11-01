package org.bouncycastle.crypto.agreement.ecjpake;

import com.umeng.analytics.pro.C0655am;
import java.math.BigInteger;
import org.bouncycastle.math.p080ec.ECCurve;
import org.bouncycastle.math.p080ec.ECPoint;

/* JADX INFO: loaded from: classes.dex */
public class ECJPAKECurve {
    public final ECCurve.AbstractFp curve;

    /* JADX INFO: renamed from: g */
    public final ECPoint f80740g;

    public ECJPAKECurve(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6, BigInteger bigInteger7) {
        ECJPAKEUtil.validateNotNull(bigInteger2, C0655am.f2320av);
        ECJPAKEUtil.validateNotNull(bigInteger3, "b");
        ECJPAKEUtil.validateNotNull(bigInteger, "q");
        ECJPAKEUtil.validateNotNull(bigInteger4, "n");
        ECJPAKEUtil.validateNotNull(bigInteger5, C0655am.f2279aG);
        ECJPAKEUtil.validateNotNull(bigInteger6, "g_x");
        ECJPAKEUtil.validateNotNull(bigInteger7, "g_y");
        if (!bigInteger.isProbablePrime(20)) {
            throw new IllegalArgumentException("Field size q must be prime");
        }
        BigInteger bigInteger8 = BigInteger.ZERO;
        if (bigInteger2.compareTo(bigInteger8) < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            throw new IllegalArgumentException("The parameter 'a' is not in the field [0, q-1]");
        }
        if (bigInteger3.compareTo(bigInteger8) < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
            throw new IllegalArgumentException("The parameter 'b' is not in the field [0, q-1]");
        }
        if (calculateDeterminant(bigInteger, bigInteger2, bigInteger3).equals(bigInteger8)) {
            throw new IllegalArgumentException("The curve is singular, i.e the discriminant is equal to 0 mod q.");
        }
        if (!bigInteger4.isProbablePrime(20)) {
            throw new IllegalArgumentException("The order n must be prime");
        }
        ECCurve.C2315Fp c2315Fp = new ECCurve.C2315Fp(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5);
        this.curve = c2315Fp;
        this.f80740g = c2315Fp.validatePoint(bigInteger6, bigInteger7);
    }

    public ECJPAKECurve(ECCurve.AbstractFp abstractFp, ECPoint eCPoint) {
        ECJPAKEUtil.validateNotNull(abstractFp, "curve");
        ECJPAKEUtil.validateNotNull(eCPoint, "g");
        ECJPAKEUtil.validateNotNull(abstractFp.getOrder(), "n");
        ECJPAKEUtil.validateNotNull(abstractFp.getCofactor(), C0655am.f2279aG);
        this.curve = abstractFp;
        this.f80740g = eCPoint;
    }

    public static BigInteger calculateDeterminant(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger2.multiply(bigInteger2).mod(bigInteger).multiply(bigInteger2).mod(bigInteger).shiftLeft(2).add(bigInteger3.multiply(bigInteger3).mod(bigInteger).multiply(BigInteger.valueOf(27L))).mod(bigInteger);
    }

    public BigInteger getA() {
        return this.curve.getA().toBigInteger();
    }

    public BigInteger getB() {
        return this.curve.getB().toBigInteger();
    }

    public ECCurve.AbstractFp getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f80740g;
    }

    public BigInteger getH() {
        return this.curve.getCofactor();
    }

    public BigInteger getN() {
        return this.curve.getOrder();
    }

    public BigInteger getQ() {
        return this.curve.getQ();
    }
}
