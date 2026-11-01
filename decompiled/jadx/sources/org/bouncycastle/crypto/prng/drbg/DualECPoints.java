package org.bouncycastle.crypto.prng.drbg;

import org.bouncycastle.math.p080ec.ECPoint;

/* JADX INFO: loaded from: classes.dex */
public class DualECPoints {
    public final int cofactor;

    /* JADX INFO: renamed from: p */
    public final ECPoint f81302p;

    /* JADX INFO: renamed from: q */
    public final ECPoint f81303q;
    public final int securityStrength;

    public DualECPoints(int i, ECPoint eCPoint, ECPoint eCPoint2, int i2) {
        if (!eCPoint.getCurve().equals(eCPoint2.getCurve())) {
            throw new IllegalArgumentException("points need to be on the same curve");
        }
        this.securityStrength = i;
        this.f81302p = eCPoint;
        this.f81303q = eCPoint2;
        this.cofactor = i2;
    }

    public static int log2(int i) {
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public int getCofactor() {
        return this.cofactor;
    }

    public int getMaxOutlen() {
        return ((this.f81302p.getCurve().getFieldSize() - (log2(this.cofactor) + 13)) / 8) * 8;
    }

    public ECPoint getP() {
        return this.f81302p;
    }

    public ECPoint getQ() {
        return this.f81303q;
    }

    public int getSecurityStrength() {
        return this.securityStrength;
    }

    public int getSeedLen() {
        return this.f81302p.getCurve().getFieldSize();
    }
}
