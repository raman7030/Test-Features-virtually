package org.bouncycastle.crypto.agreement.jpake;

import com.umeng.analytics.pro.C0655am;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public class JPAKEPrimeOrderGroup {

    /* JADX INFO: renamed from: g */
    public final BigInteger f80757g;

    /* JADX INFO: renamed from: p */
    public final BigInteger f80758p;

    /* JADX INFO: renamed from: q */
    public final BigInteger f80759q;

    public JPAKEPrimeOrderGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, false);
    }

    public JPAKEPrimeOrderGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, boolean z) {
        JPAKEUtil.validateNotNull(bigInteger, C0655am.f2322ax);
        JPAKEUtil.validateNotNull(bigInteger2, "q");
        JPAKEUtil.validateNotNull(bigInteger3, "g");
        if (!z) {
            BigInteger bigInteger4 = JPAKEUtil.ONE;
            if (!bigInteger.subtract(bigInteger4).mod(bigInteger2).equals(JPAKEUtil.ZERO)) {
                throw new IllegalArgumentException("p-1 must be evenly divisible by q");
            }
            if (bigInteger3.compareTo(BigInteger.valueOf(2L)) < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("g must be in [2, p-1]");
            }
            if (!bigInteger3.modPow(bigInteger2, bigInteger).equals(bigInteger4)) {
                throw new IllegalArgumentException("g^q mod p must equal 1");
            }
            if (!bigInteger.isProbablePrime(20)) {
                throw new IllegalArgumentException("p must be prime");
            }
            if (!bigInteger2.isProbablePrime(20)) {
                throw new IllegalArgumentException("q must be prime");
            }
        }
        this.f80758p = bigInteger;
        this.f80759q = bigInteger2;
        this.f80757g = bigInteger3;
    }

    public BigInteger getG() {
        return this.f80757g;
    }

    public BigInteger getP() {
        return this.f80758p;
    }

    public BigInteger getQ() {
        return this.f80759q;
    }
}
