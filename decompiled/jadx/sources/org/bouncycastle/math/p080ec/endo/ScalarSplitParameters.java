package org.bouncycastle.math.p080ec.endo;

import com.alipay.sdk.p010m.p016c0.AbstractC0093c;
import java.math.BigInteger;
import p067l.C6988;

/* JADX INFO: loaded from: classes2.dex */
public class ScalarSplitParameters {
    public final int bits;

    /* JADX INFO: renamed from: g1 */
    public final BigInteger f81505g1;

    /* JADX INFO: renamed from: g2 */
    public final BigInteger f81506g2;
    public final BigInteger v1A;
    public final BigInteger v1B;
    public final BigInteger v2A;
    public final BigInteger v2B;

    public ScalarSplitParameters(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2, BigInteger bigInteger, BigInteger bigInteger2, int i) {
        checkVector(bigIntegerArr, AbstractC0093c.f363c);
        checkVector(bigIntegerArr2, AbstractC0093c.f364d);
        this.v1A = bigIntegerArr[0];
        this.v1B = bigIntegerArr[1];
        this.v2A = bigIntegerArr2[0];
        this.v2B = bigIntegerArr2[1];
        this.f81505g1 = bigInteger;
        this.f81506g2 = bigInteger2;
        this.bits = i;
    }

    public int getBits() {
        return this.bits;
    }

    public BigInteger getG1() {
        return this.f81505g1;
    }

    public BigInteger getG2() {
        return this.f81506g2;
    }

    public BigInteger getV1A() {
        return this.v1A;
    }

    public BigInteger getV1B() {
        return this.v1B;
    }

    public BigInteger getV2A() {
        return this.v2A;
    }

    public BigInteger getV2B() {
        return this.v2B;
    }

    public static void checkVector(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr == null || bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            throw new IllegalArgumentException(C6988.m16053("'", str, "' must consist of exactly 2 (non-null) values"));
        }
    }
}
