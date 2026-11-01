package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;
import p067l.C10050;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Nat224 {

    /* JADX INFO: renamed from: M */
    public static final long f81550M = 4294967295L;

    public static int add(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (((long) iArr[i]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L);
        iArr3[i3] = (int) j;
        long j2 = (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i2 + 1]) & 4294967295L) + (j >>> 32);
        iArr3[i3 + 1] = (int) j2;
        long j3 = (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i2 + 2]) & 4294967295L) + (j2 >>> 32);
        iArr3[i3 + 2] = (int) j3;
        long j4 = (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i2 + 3]) & 4294967295L) + (j3 >>> 32);
        iArr3[i3 + 3] = (int) j4;
        long j5 = (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i2 + 4]) & 4294967295L) + (j4 >>> 32);
        iArr3[i3 + 4] = (int) j5;
        long j6 = (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i2 + 5]) & 4294967295L) + (j5 >>> 32);
        iArr3[i3 + 5] = (int) j6;
        long j7 = (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i2 + 6]) & 4294967295L) + (j6 >>> 32);
        iArr3[i3 + 6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int add(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int addBothTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (((long) iArr[i]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L) + (((long) iArr3[i3]) & 4294967295L);
        iArr3[i3] = (int) j;
        int i4 = i3 + 1;
        long j2 = (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i2 + 1]) & 4294967295L) + (((long) iArr3[i4]) & 4294967295L) + (j >>> 32);
        iArr3[i4] = (int) j2;
        int i5 = i3 + 2;
        long j3 = (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i2 + 2]) & 4294967295L) + (((long) iArr3[i5]) & 4294967295L) + (j2 >>> 32);
        iArr3[i5] = (int) j3;
        int i6 = i3 + 3;
        long j4 = (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i2 + 3]) & 4294967295L) + (((long) iArr3[i6]) & 4294967295L) + (j3 >>> 32);
        iArr3[i6] = (int) j4;
        int i7 = i3 + 4;
        long j5 = (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i2 + 4]) & 4294967295L) + (((long) iArr3[i7]) & 4294967295L) + (j4 >>> 32);
        iArr3[i7] = (int) j5;
        int i8 = i3 + 5;
        long j6 = (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i2 + 5]) & 4294967295L) + (((long) iArr3[i8]) & 4294967295L) + (j5 >>> 32);
        iArr3[i8] = (int) j6;
        int i9 = i3 + 6;
        long j7 = (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i2 + 6]) & 4294967295L) + (((long) iArr3[i9]) & 4294967295L) + (j6 >>> 32);
        iArr3[i9] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int addBothTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int addTo(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = (((long) iArr[i]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L) + (((long) i3) & 4294967295L);
        iArr2[i2] = (int) j;
        int i4 = i2 + 1;
        long j2 = (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i4]) & 4294967295L) + (j >>> 32);
        iArr2[i4] = (int) j2;
        int i5 = i2 + 2;
        long j3 = (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i5]) & 4294967295L) + (j2 >>> 32);
        iArr2[i5] = (int) j3;
        int i6 = i2 + 3;
        long j4 = (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i6]) & 4294967295L) + (j3 >>> 32);
        iArr2[i6] = (int) j4;
        int i7 = i2 + 4;
        long j5 = (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i7]) & 4294967295L) + (j4 >>> 32);
        iArr2[i7] = (int) j5;
        int i8 = i2 + 5;
        long j6 = (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i8]) & 4294967295L) + (j5 >>> 32);
        iArr2[i8] = (int) j6;
        int i9 = i2 + 6;
        long j7 = (((long) iArr[i + 6]) & 4294967295L) + (4294967295L & ((long) iArr2[i9])) + (j6 >>> 32);
        iArr2[i9] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j >>> 32);
        iArr2[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j2 >>> 32);
        iArr2[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j3 >>> 32);
        iArr2[3] = (int) j4;
        long j5 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j4 >>> 32);
        iArr2[4] = (int) j5;
        long j6 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j5 >>> 32);
        iArr2[5] = (int) j6;
        long j7 = (((long) iArr[6]) & 4294967295L) + (4294967295L & ((long) iArr2[6])) + (j6 >>> 32);
        iArr2[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int addTo(int[] iArr, int[] iArr2, int i) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) i) & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j >>> 32);
        iArr2[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j2 >>> 32);
        iArr2[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j3 >>> 32);
        iArr2[3] = (int) j4;
        long j5 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j4 >>> 32);
        iArr2[4] = (int) j5;
        long j6 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j5 >>> 32);
        iArr2[5] = (int) j6;
        long j7 = (((long) iArr[6]) & 4294967295L) + (4294967295L & ((long) iArr2[6])) + (j6 >>> 32);
        iArr2[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int addToEachOther(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (((long) iArr[i]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L);
        int i3 = (int) j;
        iArr[i] = i3;
        iArr2[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        long j2 = (((long) iArr[i4]) & 4294967295L) + (((long) iArr2[i5]) & 4294967295L) + (j >>> 32);
        int i6 = (int) j2;
        iArr[i4] = i6;
        iArr2[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        long j3 = (((long) iArr[i7]) & 4294967295L) + (((long) iArr2[i8]) & 4294967295L) + (j2 >>> 32);
        int i9 = (int) j3;
        iArr[i7] = i9;
        iArr2[i8] = i9;
        int i10 = i + 3;
        int i11 = i2 + 3;
        long j4 = (((long) iArr[i10]) & 4294967295L) + (((long) iArr2[i11]) & 4294967295L) + (j3 >>> 32);
        int i12 = (int) j4;
        iArr[i10] = i12;
        iArr2[i11] = i12;
        int i13 = i + 4;
        int i14 = i2 + 4;
        long j5 = (((long) iArr[i13]) & 4294967295L) + (((long) iArr2[i14]) & 4294967295L) + (j4 >>> 32);
        int i15 = (int) j5;
        iArr[i13] = i15;
        iArr2[i14] = i15;
        int i16 = i + 5;
        int i17 = i2 + 5;
        long j6 = (((long) iArr[i16]) & 4294967295L) + (((long) iArr2[i17]) & 4294967295L) + (j5 >>> 32);
        int i18 = (int) j6;
        iArr[i16] = i18;
        iArr2[i17] = i18;
        int i19 = i + 6;
        int i20 = i2 + 6;
        long j7 = (((long) iArr[i19]) & 4294967295L) + (4294967295L & ((long) iArr2[i20])) + (j6 >>> 32);
        int i21 = (int) j7;
        iArr[i19] = i21;
        iArr2[i20] = i21;
        return (int) (j7 >>> 32);
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2] = iArr[i];
        iArr2[i2 + 1] = iArr[i + 1];
        iArr2[i2 + 2] = iArr[i + 2];
        iArr2[i2 + 3] = iArr[i + 3];
        iArr2[i2 + 4] = iArr[i + 4];
        iArr2[i2 + 5] = iArr[i + 5];
        iArr2[i2 + 6] = iArr[i + 6];
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static int[] create() {
        return new int[7];
    }

    public static int[] createExt() {
        return new int[14];
    }

    public static boolean diff(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean zGte = gte(iArr, i, iArr2, i2);
        if (zGte) {
            sub(iArr, i, iArr2, i2, iArr3, i3);
            return zGte;
        }
        sub(iArr2, i2, iArr, i, iArr3, i3);
        return zGte;
    }

    /* JADX INFO: renamed from: eq */
    public static boolean m55417eq(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] iArrCreate = create();
        for (int i = 0; i < 7; i++) {
            iArrCreate[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static int getBit(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 7) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 6; i3 >= 0; i3--) {
            int i4 = iArr[i + i3] ^ Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE ^ iArr2[i2 + i3];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    public static boolean gte(int[] iArr, int[] iArr2) {
        for (int i = 6; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean isOne(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 7; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void mul(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2]) & 4294967295L;
        long j2 = ((long) iArr2[i2 + 1]) & 4294967295L;
        long j3 = ((long) iArr2[i2 + 2]) & 4294967295L;
        long j4 = ((long) iArr2[i2 + 3]) & 4294967295L;
        long j5 = ((long) iArr2[i2 + 4]) & 4294967295L;
        long j6 = ((long) iArr2[i2 + 5]) & 4294967295L;
        long j7 = ((long) iArr2[i2 + 6]) & 4294967295L;
        long j8 = ((long) iArr[i]) & 4294967295L;
        long j9 = j8 * j;
        iArr3[i3] = (int) j9;
        long j10 = (j8 * j2) + (j9 >>> 32);
        iArr3[i3 + 1] = (int) j10;
        long j11 = (j8 * j3) + (j10 >>> 32);
        iArr3[i3 + 2] = (int) j11;
        long j12 = (j8 * j4) + (j11 >>> 32);
        iArr3[i3 + 3] = (int) j12;
        long j13 = (j8 * j5) + (j12 >>> 32);
        iArr3[i3 + 4] = (int) j13;
        long j14 = (j8 * j6) + (j13 >>> 32);
        iArr3[i3 + 5] = (int) j14;
        long j15 = (j8 * j7) + (j14 >>> 32);
        iArr3[i3 + 6] = (int) j15;
        iArr3[i3 + 7] = (int) (j15 >>> 32);
        int i4 = i3;
        int i5 = 1;
        while (i5 < 7) {
            int i6 = i4 + 1;
            long j16 = ((long) iArr[i + i5]) & 4294967295L;
            int i7 = i5;
            long j17 = (j16 * j) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j17;
            int i8 = i4 + 2;
            long j18 = j6;
            long j19 = (j16 * j2) + (((long) iArr3[i8]) & 4294967295L) + (j17 >>> 32);
            iArr3[i8] = (int) j19;
            int i9 = i4 + 3;
            long j20 = j3;
            long j21 = (j16 * j3) + (((long) iArr3[i9]) & 4294967295L) + (j19 >>> 32);
            iArr3[i9] = (int) j21;
            int i10 = i4 + 4;
            long j22 = (j16 * j4) + (((long) iArr3[i10]) & 4294967295L) + (j21 >>> 32);
            iArr3[i10] = (int) j22;
            int i11 = i4 + 5;
            long j23 = (j16 * j5) + (((long) iArr3[i11]) & 4294967295L) + (j22 >>> 32);
            iArr3[i11] = (int) j23;
            int i12 = i4 + 6;
            long j24 = (j16 * j18) + (((long) iArr3[i12]) & 4294967295L) + (j23 >>> 32);
            iArr3[i12] = (int) j24;
            int i13 = i4 + 7;
            long j25 = (j16 * j7) + (((long) iArr3[i13]) & 4294967295L) + (j24 >>> 32);
            iArr3[i13] = (int) j25;
            iArr3[i4 + 8] = (int) (j25 >>> 32);
            i5 = i7 + 1;
            i4 = i6;
            j3 = j20;
            j6 = j18;
        }
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr[0]) & 4294967295L;
        long j9 = j8 * j;
        iArr3[0] = (int) j9;
        long j10 = (j8 * j2) + (j9 >>> 32);
        iArr3[1] = (int) j10;
        long j11 = (j8 * j3) + (j10 >>> 32);
        iArr3[2] = (int) j11;
        long j12 = (j8 * j4) + (j11 >>> 32);
        iArr3[3] = (int) j12;
        long j13 = (j8 * j5) + (j12 >>> 32);
        iArr3[4] = (int) j13;
        long j14 = (j8 * j6) + (j13 >>> 32);
        iArr3[5] = (int) j14;
        long j15 = (j8 * j7) + (j14 >>> 32);
        iArr3[6] = (int) j15;
        int i = 7;
        iArr3[7] = (int) (j15 >>> 32);
        int i2 = 1;
        while (i2 < i) {
            long j16 = ((long) iArr[i2]) & 4294967295L;
            long j17 = j4;
            long j18 = (j16 * j) + (((long) iArr3[i2]) & 4294967295L);
            iArr3[i2] = (int) j18;
            int i3 = i2 + 1;
            long j19 = j;
            long j20 = (j16 * j2) + (((long) iArr3[i3]) & 4294967295L) + (j18 >>> 32);
            iArr3[i3] = (int) j20;
            int i4 = i2 + 2;
            long j21 = j2;
            long j22 = (j16 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j20 >>> 32);
            iArr3[i4] = (int) j22;
            long j23 = j22 >>> 32;
            int i5 = i2 + 3;
            long j24 = (j16 * j17) + (((long) iArr3[i5]) & 4294967295L) + j23;
            iArr3[i5] = (int) j24;
            int i6 = i2 + 4;
            long j25 = (j16 * j5) + (((long) iArr3[i6]) & 4294967295L) + (j24 >>> 32);
            iArr3[i6] = (int) j25;
            int i7 = i2 + 5;
            long j26 = (j16 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j25 >>> 32);
            iArr3[i7] = (int) j26;
            long j27 = j26 >>> 32;
            int i8 = i2 + 6;
            long j28 = (j16 * j7) + (((long) iArr3[i8]) & 4294967295L) + j27;
            iArr3[i8] = (int) j28;
            iArr3[i2 + 7] = (int) (j28 >>> 32);
            i = 7;
            i2 = i3;
            j4 = j17;
            j = j19;
            j2 = j21;
        }
    }

    public static long mul33Add(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = ((long) i) & 4294967295L;
        long j2 = ((long) iArr[i2]) & 4294967295L;
        long j3 = (j * j2) + (((long) iArr2[i3]) & 4294967295L);
        iArr3[i4] = (int) j3;
        long j4 = ((long) iArr[i2 + 1]) & 4294967295L;
        long j5 = (j * j4) + j2 + (((long) iArr2[i3 + 1]) & 4294967295L) + (j3 >>> 32);
        iArr3[i4 + 1] = (int) j5;
        long j6 = ((long) iArr[i2 + 2]) & 4294967295L;
        long j7 = (j * j6) + j4 + (((long) iArr2[i3 + 2]) & 4294967295L) + (j5 >>> 32);
        iArr3[i4 + 2] = (int) j7;
        long j8 = ((long) iArr[i2 + 3]) & 4294967295L;
        long j9 = (j * j8) + j6 + (((long) iArr2[i3 + 3]) & 4294967295L) + (j7 >>> 32);
        iArr3[i4 + 3] = (int) j9;
        long j10 = ((long) iArr[i2 + 4]) & 4294967295L;
        long j11 = (j * j10) + j8 + (((long) iArr2[i3 + 4]) & 4294967295L) + (j9 >>> 32);
        iArr3[i4 + 4] = (int) j11;
        long j12 = ((long) iArr[i2 + 5]) & 4294967295L;
        long j13 = (j * j12) + j10 + (((long) iArr2[i3 + 5]) & 4294967295L) + (j11 >>> 32);
        iArr3[i4 + 5] = (int) j13;
        long j14 = ((long) iArr[i2 + 6]) & 4294967295L;
        long j15 = (j * j14) + j12 + (4294967295L & ((long) iArr2[i3 + 6])) + (j13 >>> 32);
        iArr3[i4 + 6] = (int) j15;
        return (j15 >>> 32) + j14;
    }

    public static int mul33DWordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & 4294967295L;
        long j3 = j & 4294967295L;
        long j4 = (j2 * j3) + (((long) iArr[i2]) & 4294967295L);
        iArr[i2] = (int) j4;
        long j5 = j >>> 32;
        long j6 = (j2 * j5) + j3;
        int i3 = i2 + 1;
        long j7 = j6 + (((long) iArr[i3]) & 4294967295L) + (j4 >>> 32);
        iArr[i3] = (int) j7;
        int i4 = i2 + 2;
        long j8 = j5 + (((long) iArr[i4]) & 4294967295L) + (j7 >>> 32);
        iArr[i4] = (int) j8;
        int i5 = i2 + 3;
        long j9 = (j8 >>> 32) + (((long) iArr[i5]) & 4294967295L);
        iArr[i5] = (int) j9;
        if ((j9 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(7, iArr, i2, 4);
    }

    public static int mul33WordAdd(int i, int i2, int[] iArr, int i3) {
        long j = ((long) i) & 4294967295L;
        long j2 = ((long) i2) & 4294967295L;
        long j3 = (j * j2) + (((long) iArr[i3]) & 4294967295L);
        iArr[i3] = (int) j3;
        int i4 = i3 + 1;
        long j4 = j2 + (((long) iArr[i4]) & 4294967295L) + (j3 >>> 32);
        iArr[i4] = (int) j4;
        int i5 = i3 + 2;
        long j5 = (j4 >>> 32) + (((long) iArr[i5]) & 4294967295L);
        iArr[i5] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(7, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2]) & 4294967295L;
        long j2 = ((long) iArr2[i2 + 1]) & 4294967295L;
        long j3 = ((long) iArr2[i2 + 2]) & 4294967295L;
        long j4 = ((long) iArr2[i2 + 3]) & 4294967295L;
        long j5 = ((long) iArr2[i2 + 4]) & 4294967295L;
        long j6 = ((long) iArr2[i2 + 5]) & 4294967295L;
        long j7 = ((long) iArr2[i2 + 6]) & 4294967295L;
        long j8 = 0;
        int i4 = 0;
        int i5 = i3;
        while (i4 < 7) {
            int i6 = i4;
            long j9 = ((long) iArr[i + i4]) & 4294967295L;
            long j10 = j;
            long j11 = (j9 * j) + (((long) iArr3[i5]) & 4294967295L);
            long j12 = j7;
            iArr3[i5] = (int) j11;
            int i7 = i5 + 1;
            long j13 = j2;
            long j14 = (j9 * j2) + (((long) iArr3[i7]) & 4294967295L) + (j11 >>> 32);
            iArr3[i7] = (int) j14;
            long j15 = j14 >>> 32;
            int i8 = i5 + 2;
            long j16 = j3;
            long j17 = (j9 * j3) + (((long) iArr3[i8]) & 4294967295L) + j15;
            iArr3[i8] = (int) j17;
            int i9 = i5 + 3;
            long j18 = (j9 * j4) + (((long) iArr3[i9]) & 4294967295L) + (j17 >>> 32);
            iArr3[i9] = (int) j18;
            int i10 = i5 + 4;
            long j19 = (j9 * j5) + (((long) iArr3[i10]) & 4294967295L) + (j18 >>> 32);
            iArr3[i10] = (int) j19;
            int i11 = i5 + 5;
            long j20 = (j9 * j6) + (((long) iArr3[i11]) & 4294967295L) + (j19 >>> 32);
            iArr3[i11] = (int) j20;
            long j21 = j20 >>> 32;
            int i12 = i5 + 6;
            long j22 = (j9 * j12) + (((long) iArr3[i12]) & 4294967295L) + j21;
            iArr3[i12] = (int) j22;
            int i13 = i5 + 7;
            long j23 = (j22 >>> 32) + (((long) iArr3[i13]) & 4294967295L) + j8;
            iArr3[i13] = (int) j23;
            j8 = j23 >>> 32;
            i4 = i6 + 1;
            j7 = j12;
            j = j10;
            i5 = i7;
            j2 = j13;
            j3 = j16;
        }
        return (int) j8;
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = 0;
        int i = 0;
        while (i < 7) {
            long j9 = j7;
            long j10 = ((long) iArr[i]) & 4294967295L;
            long j11 = j;
            long j12 = (((long) iArr3[i]) & 4294967295L) + (j10 * j);
            iArr3[i] = (int) j12;
            int i2 = i + 1;
            long j13 = j2;
            long j14 = (j10 * j2) + (((long) iArr3[i2]) & 4294967295L) + (j12 >>> 32);
            iArr3[i2] = (int) j14;
            int i3 = i + 2;
            long j15 = (j10 * j3) + (((long) iArr3[i3]) & 4294967295L) + (j14 >>> 32);
            iArr3[i3] = (int) j15;
            int i4 = i + 3;
            long j16 = (j10 * j4) + (((long) iArr3[i4]) & 4294967295L) + (j15 >>> 32);
            iArr3[i4] = (int) j16;
            int i5 = i + 4;
            long j17 = (j10 * j5) + (((long) iArr3[i5]) & 4294967295L) + (j16 >>> 32);
            iArr3[i5] = (int) j17;
            int i6 = i + 5;
            long j18 = (j10 * j6) + (((long) iArr3[i6]) & 4294967295L) + (j17 >>> 32);
            iArr3[i6] = (int) j18;
            int i7 = i + 6;
            long j19 = (j10 * j9) + (((long) iArr3[i7]) & 4294967295L) + (j18 >>> 32);
            iArr3[i7] = (int) j19;
            int i8 = i + 7;
            long j20 = (j19 >>> 32) + (((long) iArr3[i8]) & 4294967295L) + j8;
            iArr3[i8] = (int) j20;
            j8 = j20 >>> 32;
            i = i2;
            j7 = j9;
            j = j11;
            j2 = j13;
            j3 = j3;
        }
        return (int) j8;
    }

    public static int mulByWord(int i, int[] iArr) {
        long j = ((long) i) & 4294967295L;
        long j2 = (((long) iArr[0]) & 4294967295L) * j;
        iArr[0] = (int) j2;
        long j3 = ((((long) iArr[1]) & 4294967295L) * j) + (j2 >>> 32);
        iArr[1] = (int) j3;
        long j4 = ((((long) iArr[2]) & 4294967295L) * j) + (j3 >>> 32);
        iArr[2] = (int) j4;
        long j5 = ((((long) iArr[3]) & 4294967295L) * j) + (j4 >>> 32);
        iArr[3] = (int) j5;
        long j6 = ((((long) iArr[4]) & 4294967295L) * j) + (j5 >>> 32);
        iArr[4] = (int) j6;
        long j7 = ((((long) iArr[5]) & 4294967295L) * j) + (j6 >>> 32);
        iArr[5] = (int) j7;
        long j8 = (j * (4294967295L & ((long) iArr[6]))) + (j7 >>> 32);
        iArr[6] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int mulByWordAddTo(int i, int[] iArr, int[] iArr2) {
        long j = ((long) i) & 4294967295L;
        long j2 = ((((long) iArr2[0]) & 4294967295L) * j) + (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = ((((long) iArr2[1]) & 4294967295L) * j) + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        iArr2[1] = (int) j3;
        long j4 = ((((long) iArr2[2]) & 4294967295L) * j) + (((long) iArr[2]) & 4294967295L) + (j3 >>> 32);
        iArr2[2] = (int) j4;
        long j5 = ((((long) iArr2[3]) & 4294967295L) * j) + (((long) iArr[3]) & 4294967295L) + (j4 >>> 32);
        iArr2[3] = (int) j5;
        long j6 = ((((long) iArr2[4]) & 4294967295L) * j) + (((long) iArr[4]) & 4294967295L) + (j5 >>> 32);
        iArr2[4] = (int) j6;
        long j7 = ((((long) iArr2[5]) & 4294967295L) * j) + (((long) iArr[5]) & 4294967295L) + (j6 >>> 32);
        iArr2[5] = (int) j7;
        long j8 = (j * (((long) iArr2[6]) & 4294967295L)) + (4294967295L & ((long) iArr[6])) + (j7 >>> 32);
        iArr2[6] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int mulWord(int i, int[] iArr, int[] iArr2, int i2) {
        long j = ((long) i) & 4294967295L;
        long j2 = 0;
        int i3 = 0;
        do {
            long j3 = ((((long) iArr[i3]) & 4294967295L) * j) + j2;
            iArr2[i2 + i3] = (int) j3;
            j2 = j3 >>> 32;
            i3++;
        } while (i3 < 7);
        return (int) j2;
    }

    public static int mulWordAddTo(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = ((long) i) & 4294967295L;
        long j2 = ((((long) iArr[i2]) & 4294967295L) * j) + (((long) iArr2[i3]) & 4294967295L);
        iArr2[i3] = (int) j2;
        int i4 = i3 + 1;
        long j3 = ((((long) iArr[i2 + 1]) & 4294967295L) * j) + (((long) iArr2[i4]) & 4294967295L) + (j2 >>> 32);
        iArr2[i4] = (int) j3;
        int i5 = i3 + 2;
        long j4 = ((((long) iArr[i2 + 2]) & 4294967295L) * j) + (((long) iArr2[i5]) & 4294967295L) + (j3 >>> 32);
        iArr2[i5] = (int) j4;
        int i6 = i3 + 3;
        long j5 = ((((long) iArr[i2 + 3]) & 4294967295L) * j) + (((long) iArr2[i6]) & 4294967295L) + (j4 >>> 32);
        iArr2[i6] = (int) j5;
        int i7 = i3 + 4;
        long j6 = ((((long) iArr[i2 + 4]) & 4294967295L) * j) + (((long) iArr2[i7]) & 4294967295L) + (j5 >>> 32);
        iArr2[i7] = (int) j6;
        int i8 = i3 + 5;
        long j7 = ((((long) iArr[i2 + 5]) & 4294967295L) * j) + (((long) iArr2[i8]) & 4294967295L) + (j6 >>> 32);
        iArr2[i8] = (int) j7;
        int i9 = i3 + 6;
        long j8 = (j * (((long) iArr[i2 + 6]) & 4294967295L)) + (((long) iArr2[i9]) & 4294967295L) + (j7 >>> 32);
        iArr2[i9] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int mulWordDwordAdd(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & 4294967295L;
        long j3 = ((j & 4294967295L) * j2) + (((long) iArr[i2]) & 4294967295L);
        iArr[i2] = (int) j3;
        long j4 = j2 * (j >>> 32);
        int i3 = i2 + 1;
        long j5 = j4 + (((long) iArr[i3]) & 4294967295L) + (j3 >>> 32);
        iArr[i3] = (int) j5;
        long j6 = j5 >>> 32;
        int i4 = i2 + 2;
        long j7 = j6 + (((long) iArr[i4]) & 4294967295L);
        iArr[i4] = (int) j7;
        if ((j7 >>> 32) == 0) {
            return 0;
        }
        return Nat.incAt(7, iArr, i2, 3);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        long j = ((long) iArr[i]) & 4294967295L;
        int i3 = 0;
        int i4 = 14;
        int i5 = 6;
        while (true) {
            int i6 = i5 - 1;
            long j2 = ((long) iArr[i + i5]) & 4294967295L;
            long j3 = j2 * j2;
            iArr2[(i4 - 1) + i2] = (i3 << 31) | ((int) (j3 >>> 33));
            i4 -= 2;
            iArr2[i2 + i4] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i6 <= 0) {
                long j4 = j * j;
                long j5 = (((long) (i3 << 31)) & 4294967295L) | (j4 >>> 33);
                iArr2[i2] = (int) j4;
                int i7 = 1 & ((int) (j4 >>> 32));
                long j6 = ((long) iArr[i + 1]) & 4294967295L;
                int i8 = i2 + 2;
                long j7 = ((long) iArr2[i8]) & 4294967295L;
                long j8 = (j6 * j) + j5;
                int i9 = (int) j8;
                iArr2[i2 + 1] = i7 | (i9 << 1);
                long j9 = ((long) iArr[i + 2]) & 4294967295L;
                int i10 = i2 + 3;
                long j10 = ((long) iArr2[i10]) & 4294967295L;
                int i11 = i2 + 4;
                long j11 = ((long) iArr2[i11]) & 4294967295L;
                long j12 = (j9 * j) + j7 + (j8 >>> 32);
                int i12 = (int) j12;
                iArr2[i8] = (i9 >>> 31) | (i12 << 1);
                long jM23418 = C10050.m23418(j9, j6, j12 >>> 32, j10);
                long j13 = j11 + (jM23418 >>> 32);
                long j14 = ((long) iArr[i + 3]) & 4294967295L;
                int i13 = i2 + 5;
                long j15 = (((long) iArr2[i13]) & 4294967295L) + (j13 >>> 32);
                int i14 = i2 + 6;
                long j16 = (((long) iArr2[i14]) & 4294967295L) + (j15 >>> 32);
                long j17 = j15 & 4294967295L;
                long j18 = (j14 * j) + (jM23418 & 4294967295L);
                int i15 = (int) j18;
                iArr2[i10] = (i12 >>> 31) | (i15 << 1);
                long jM23419 = C10050.m23418(j14, j6, j18 >>> 32, j13 & 4294967295L);
                long jM234110 = C10050.m23418(j14, j9, jM23419 >>> 32, j17);
                long j19 = j16 + (jM234110 >>> 32);
                long j20 = jM234110 & 4294967295L;
                long j21 = ((long) iArr[i + 4]) & 4294967295L;
                int i16 = i2 + 7;
                long j22 = (((long) iArr2[i16]) & 4294967295L) + (j19 >>> 32);
                int i17 = i2 + 8;
                long j23 = (((long) iArr2[i17]) & 4294967295L) + (j22 >>> 32);
                long j24 = j22 & 4294967295L;
                long j25 = (j21 * j) + (jM23419 & 4294967295L);
                int i18 = (int) j25;
                iArr2[i11] = (i15 >>> 31) | (i18 << 1);
                int i19 = i18 >>> 31;
                long jM234111 = C10050.m23418(j21, j6, j25 >>> 32, j20);
                long jM234112 = C10050.m23418(j21, j9, jM234111 >>> 32, j19 & 4294967295L);
                long jM234113 = C10050.m23418(j21, j14, jM234112 >>> 32, j24);
                long j26 = jM234112 & 4294967295L;
                long j27 = j23 + (jM234113 >>> 32);
                long j28 = ((long) iArr[i + 5]) & 4294967295L;
                int i20 = i2 + 9;
                long j29 = (((long) iArr2[i20]) & 4294967295L) + (j27 >>> 32);
                int i21 = i2 + 10;
                long j30 = (((long) iArr2[i21]) & 4294967295L) + (j29 >>> 32);
                long j31 = j29 & 4294967295L;
                long j32 = (j28 * j) + (jM234111 & 4294967295L);
                int i22 = (int) j32;
                iArr2[i13] = i19 | (i22 << 1);
                int i23 = i22 >>> 31;
                long jM234114 = C10050.m23418(j28, j6, j32 >>> 32, j26);
                long jM234115 = C10050.m23418(j28, j9, jM234114 >>> 32, jM234113 & 4294967295L);
                long jM234116 = C10050.m23418(j28, j14, jM234115 >>> 32, j27 & 4294967295L);
                long j33 = jM234115 & 4294967295L;
                long jM234117 = C10050.m23418(j28, j21, jM234116 >>> 32, j31);
                long j34 = j30 + (jM234117 >>> 32);
                long j35 = jM234117 & 4294967295L;
                long j36 = ((long) iArr[i + 6]) & 4294967295L;
                int i24 = i2 + 11;
                long j37 = (((long) iArr2[i24]) & 4294967295L) + (j34 >>> 32);
                long j38 = j34 & 4294967295L;
                int i25 = i2 + 12;
                long j39 = (((long) iArr2[i25]) & 4294967295L) + (j37 >>> 32);
                long j40 = (j * j36) + (jM234114 & 4294967295L);
                int i26 = (int) j40;
                iArr2[i14] = i23 | (i26 << 1);
                int i27 = i26 >>> 31;
                long jM234118 = C10050.m23418(j36, j6, j40 >>> 32, j33);
                long jM234119 = C10050.m23418(j36, j9, jM234118 >>> 32, jM234116 & 4294967295L);
                long jM234120 = C10050.m23418(j36, j14, jM234119 >>> 32, j35);
                long jM234121 = C10050.m23418(j36, j21, jM234120 >>> 32, j38);
                long jM234122 = C10050.m23418(j36, j28, jM234121 >>> 32, 4294967295L & j37);
                long j41 = j39 + (jM234122 >>> 32);
                int i28 = (int) jM234118;
                iArr2[i16] = (i28 << 1) | i27;
                int i29 = i28 >>> 31;
                int i30 = (int) jM234119;
                iArr2[i17] = i29 | (i30 << 1);
                int i31 = i30 >>> 31;
                int i32 = (int) jM234120;
                iArr2[i20] = i31 | (i32 << 1);
                int i33 = i32 >>> 31;
                int i34 = (int) jM234121;
                iArr2[i21] = i33 | (i34 << 1);
                int i35 = i34 >>> 31;
                int i36 = (int) jM234122;
                iArr2[i24] = i35 | (i36 << 1);
                int i37 = i36 >>> 31;
                int i38 = (int) j41;
                iArr2[i25] = i37 | (i38 << 1);
                int i39 = i38 >>> 31;
                int i40 = i2 + 13;
                iArr2[i40] = i39 | ((iArr2[i40] + ((int) (j41 >>> 32))) << 1);
                return;
            }
            i5 = i6;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 14;
        int i2 = 6;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            long j2 = ((long) iArr[i2]) & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i3 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | (((long) (i3 << 31)) & 4294967295L);
                iArr2[0] = (int) j4;
                long j6 = ((long) iArr[1]) & 4294967295L;
                long j7 = ((long) iArr2[2]) & 4294967295L;
                long j8 = j5 + (j6 * j);
                int i5 = (int) j8;
                iArr2[1] = (((int) (j4 >>> 32)) & 1) | (i5 << 1);
                long j9 = j7 + (j8 >>> 32);
                long j10 = ((long) iArr[2]) & 4294967295L;
                long j11 = ((long) iArr2[3]) & 4294967295L;
                long j12 = ((long) iArr2[4]) & 4294967295L;
                long j13 = (j10 * j) + j9;
                int i6 = (int) j13;
                iArr2[2] = (i6 << 1) | (i5 >>> 31);
                long jM23418 = C10050.m23418(j10, j6, j13 >>> 32, j11);
                long j14 = j12 + (jM23418 >>> 32);
                long j15 = ((long) iArr[3]) & 4294967295L;
                long j16 = (((long) iArr2[5]) & 4294967295L) + (j14 >>> 32);
                long j17 = j14 & 4294967295L;
                long j18 = (((long) iArr2[6]) & 4294967295L) + (j16 >>> 32);
                long j19 = (jM23418 & 4294967295L) + (j15 * j);
                int i7 = (int) j19;
                iArr2[3] = (i6 >>> 31) | (i7 << 1);
                long jM23419 = C10050.m23418(j15, j6, j19 >>> 32, j17);
                long jM234110 = C10050.m23418(j15, j10, jM23419 >>> 32, j16 & 4294967295L);
                long j20 = j18 + (jM234110 >>> 32);
                long j21 = ((long) iArr[4]) & 4294967295L;
                long j22 = (((long) iArr2[7]) & 4294967295L) + (j20 >>> 32);
                long j23 = j20 & 4294967295L;
                long j24 = (((long) iArr2[8]) & 4294967295L) + (j22 >>> 32);
                long j25 = (jM23419 & 4294967295L) + (j21 * j);
                int i8 = (int) j25;
                iArr2[4] = (i7 >>> 31) | (i8 << 1);
                int i9 = i8 >>> 31;
                long jM234111 = C10050.m23418(j21, j6, j25 >>> 32, jM234110 & 4294967295L);
                long jM234112 = C10050.m23418(j21, j10, jM234111 >>> 32, j23);
                long j26 = jM234111 & 4294967295L;
                long jM234113 = C10050.m23418(j21, j15, jM234112 >>> 32, j22 & 4294967295L);
                long j27 = jM234112 & 4294967295L;
                long j28 = j24 + (jM234113 >>> 32);
                long j29 = ((long) iArr[5]) & 4294967295L;
                long j30 = (((long) iArr2[9]) & 4294967295L) + (j28 >>> 32);
                long j31 = (((long) iArr2[10]) & 4294967295L) + (j30 >>> 32);
                long j32 = j30 & 4294967295L;
                long j33 = (j29 * j) + j26;
                int i10 = (int) j33;
                iArr2[5] = i9 | (i10 << 1);
                int i11 = i10 >>> 31;
                long jM234114 = C10050.m23418(j29, j6, j33 >>> 32, j27);
                long jM234115 = C10050.m23418(j29, j10, jM234114 >>> 32, jM234113 & 4294967295L);
                long jM234116 = C10050.m23418(j29, j15, jM234115 >>> 32, j28 & 4294967295L);
                long j34 = jM234115 & 4294967295L;
                long jM234117 = C10050.m23418(j29, j21, jM234116 >>> 32, j32);
                long j35 = j31 + (jM234117 >>> 32);
                long j36 = jM234117 & 4294967295L;
                long j37 = ((long) iArr[6]) & 4294967295L;
                long j38 = (j35 >>> 32) + (((long) iArr2[11]) & 4294967295L);
                long j39 = (((long) iArr2[12]) & 4294967295L) + (j38 >>> 32);
                long j40 = (j * j37) + (jM234114 & 4294967295L);
                int i12 = (int) j40;
                iArr2[6] = i11 | (i12 << 1);
                long jM234118 = C10050.m23418(j37, j6, j40 >>> 32, j34);
                long jM234119 = C10050.m23418(j37, j10, jM234118 >>> 32, jM234116 & 4294967295L);
                long jM234120 = C10050.m23418(j37, j15, jM234119 >>> 32, j36);
                long jM234121 = C10050.m23418(j37, j21, jM234120 >>> 32, j35 & 4294967295L);
                long jM234122 = C10050.m23418(j37, j29, jM234121 >>> 32, 4294967295L & j38);
                long j41 = j39 + (jM234122 >>> 32);
                int i13 = (int) jM234118;
                iArr2[7] = (i12 >>> 31) | (i13 << 1);
                int i14 = (int) jM234119;
                iArr2[8] = (i13 >>> 31) | (i14 << 1);
                int i15 = i14 >>> 31;
                int i16 = (int) jM234120;
                iArr2[9] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) jM234121;
                iArr2[10] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) jM234122;
                iArr2[11] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j41;
                iArr2[12] = i21 | (i22 << 1);
                iArr2[13] = (i22 >>> 31) | ((iArr2[13] + ((int) (j41 >>> 32))) << 1);
                return;
            }
            i2 = i4;
        }
    }

    public static int sub(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (((long) iArr[i]) & 4294967295L) - (((long) iArr2[i2]) & 4294967295L);
        iArr3[i3] = (int) j;
        long j2 = ((((long) iArr[i + 1]) & 4294967295L) - (((long) iArr2[i2 + 1]) & 4294967295L)) + (j >> 32);
        iArr3[i3 + 1] = (int) j2;
        long j3 = ((((long) iArr[i + 2]) & 4294967295L) - (((long) iArr2[i2 + 2]) & 4294967295L)) + (j2 >> 32);
        iArr3[i3 + 2] = (int) j3;
        long j4 = ((((long) iArr[i + 3]) & 4294967295L) - (((long) iArr2[i2 + 3]) & 4294967295L)) + (j3 >> 32);
        iArr3[i3 + 3] = (int) j4;
        long j5 = ((((long) iArr[i + 4]) & 4294967295L) - (((long) iArr2[i2 + 4]) & 4294967295L)) + (j4 >> 32);
        iArr3[i3 + 4] = (int) j5;
        long j6 = ((((long) iArr[i + 5]) & 4294967295L) - (((long) iArr2[i2 + 5]) & 4294967295L)) + (j5 >> 32);
        iArr3[i3 + 5] = (int) j6;
        long j7 = ((((long) iArr[i + 6]) & 4294967295L) - (((long) iArr2[i2 + 6]) & 4294967295L)) + (j6 >> 32);
        iArr3[i3 + 6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int sub(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int subBothFrom(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((((long) iArr3[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((((long) iArr3[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) - (((long) iArr2[1]) & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = (((((long) iArr3[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) - (((long) iArr2[2]) & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = (((((long) iArr3[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) - (((long) iArr2[3]) & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = (((((long) iArr3[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) - (((long) iArr2[4]) & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = (((((long) iArr3[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) - (((long) iArr2[5]) & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = (((((long) iArr3[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) - (((long) iArr2[6]) & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i2) {
        long j = (((long) iArr2[i2]) & 4294967295L) - (((long) iArr[i]) & 4294967295L);
        iArr2[i2] = (int) j;
        int i3 = i2 + 1;
        long j2 = ((((long) iArr2[i3]) & 4294967295L) - (((long) iArr[i + 1]) & 4294967295L)) + (j >> 32);
        iArr2[i3] = (int) j2;
        int i4 = i2 + 2;
        long j3 = ((((long) iArr2[i4]) & 4294967295L) - (((long) iArr[i + 2]) & 4294967295L)) + (j2 >> 32);
        iArr2[i4] = (int) j3;
        int i5 = i2 + 3;
        long j4 = ((((long) iArr2[i5]) & 4294967295L) - (((long) iArr[i + 3]) & 4294967295L)) + (j3 >> 32);
        iArr2[i5] = (int) j4;
        int i6 = i2 + 4;
        long j5 = ((((long) iArr2[i6]) & 4294967295L) - (((long) iArr[i + 4]) & 4294967295L)) + (j4 >> 32);
        iArr2[i6] = (int) j5;
        int i7 = i2 + 5;
        long j6 = ((((long) iArr2[i7]) & 4294967295L) - (((long) iArr[i + 5]) & 4294967295L)) + (j5 >> 32);
        iArr2[i7] = (int) j6;
        int i8 = i2 + 6;
        long j7 = ((((long) iArr2[i8]) & 4294967295L) - (((long) iArr[i + 6]) & 4294967295L)) + (j6 >> 32);
        iArr2[i8] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2) {
        long j = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j;
        long j2 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j >> 32);
        iArr2[1] = (int) j2;
        long j3 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j2 >> 32);
        iArr2[2] = (int) j3;
        long j4 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j3 >> 32);
        iArr2[3] = (int) j4;
        long j5 = ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j4 >> 32);
        iArr2[4] = (int) j5;
        long j6 = ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j5 >> 32);
        iArr2[5] = (int) j6;
        long j7 = ((((long) iArr2[6]) & 4294967295L) - (4294967295L & ((long) iArr[6]))) + (j6 >> 32);
        iArr2[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i = 0; i < 7; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (6 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void zero(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
    }
}
