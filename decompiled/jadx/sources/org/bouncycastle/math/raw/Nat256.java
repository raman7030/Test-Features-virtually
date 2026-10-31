package org.bouncycastle.math.raw;

import java.math.BigInteger;
import l.C8083;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Nat256 {
    public static final long M = 4294967295L;

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
        long j8 = (((long) iArr[i + 7]) & 4294967295L) + (((long) iArr2[i2 + 7]) & 4294967295L) + (j7 >>> 32);
        iArr3[i3 + 7] = (int) j8;
        return (int) (j8 >>> 32);
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
        long j8 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
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
        int i10 = i3 + 7;
        long j8 = (((long) iArr[i + 7]) & 4294967295L) + (((long) iArr2[i2 + 7]) & 4294967295L) + (((long) iArr3[i10]) & 4294967295L) + (j7 >>> 32);
        iArr3[i10] = (int) j8;
        return (int) (j8 >>> 32);
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
        long j8 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (((long) iArr3[7]) & 4294967295L) + (j7 >>> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
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
        long j7 = (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i9]) & 4294967295L) + (j6 >>> 32);
        iArr2[i9] = (int) j7;
        int i10 = i2 + 7;
        long j8 = (((long) iArr[i + 7]) & 4294967295L) + (4294967295L & ((long) iArr2[i10])) + (j7 >>> 32);
        iArr2[i10] = (int) j8;
        return (int) (j8 >>> 32);
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
        long j7 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j6 >>> 32);
        iArr2[6] = (int) j7;
        long j8 = (((long) iArr[7]) & 4294967295L) + (4294967295L & ((long) iArr2[7])) + (j7 >>> 32);
        iArr2[7] = (int) j8;
        return (int) (j8 >>> 32);
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
        long j7 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j6 >>> 32);
        iArr2[6] = (int) j7;
        long j8 = (((long) iArr[7]) & 4294967295L) + (4294967295L & ((long) iArr2[7])) + (j7 >>> 32);
        iArr2[7] = (int) j8;
        return (int) (j8 >>> 32);
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
        long j7 = (((long) iArr[i19]) & 4294967295L) + (((long) iArr2[i20]) & 4294967295L) + (j6 >>> 32);
        int i21 = (int) j7;
        iArr[i19] = i21;
        iArr2[i20] = i21;
        int i22 = i + 7;
        int i23 = i2 + 7;
        long j8 = (((long) iArr[i22]) & 4294967295L) + (4294967295L & ((long) iArr2[i23])) + (j7 >>> 32);
        int i24 = (int) j8;
        iArr[i22] = i24;
        iArr2[i23] = i24;
        return (int) (j8 >>> 32);
    }

    public static void copy(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2] = iArr[i];
        iArr2[i2 + 1] = iArr[i + 1];
        iArr2[i2 + 2] = iArr[i + 2];
        iArr2[i2 + 3] = iArr[i + 3];
        iArr2[i2 + 4] = iArr[i + 4];
        iArr2[i2 + 5] = iArr[i + 5];
        iArr2[i2 + 6] = iArr[i + 6];
        iArr2[i2 + 7] = iArr[i + 7];
    }

    public static void copy(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
    }

    public static void copy64(long[] jArr, int i, long[] jArr2, int i2) {
        jArr2[i2] = jArr[i];
        jArr2[i2 + 1] = jArr[i + 1];
        jArr2[i2 + 2] = jArr[i + 2];
        jArr2[i2 + 3] = jArr[i + 3];
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static int[] create() {
        return new int[8];
    }

    public static long[] create64() {
        return new long[4];
    }

    public static int[] createExt() {
        return new int[16];
    }

    public static long[] createExt64() {
        return new long[8];
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

    public static boolean eq(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        int[] iArrCreate = create();
        for (int i = 0; i < 8; i++) {
            iArrCreate[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
        }
        return iArrCreate;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] jArrCreate64 = create64();
        for (int i = 0; i < 4; i++) {
            jArrCreate64[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
        }
        return jArrCreate64;
    }

    public static int getBit(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            if ((i & 255) != i) {
                return 0;
            }
            i2 = iArr[i >>> 5] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static boolean gte(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 7; i3 >= 0; i3--) {
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
        for (int i = 7; i >= 0; i--) {
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
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
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
        long j8 = ((long) iArr2[i2 + 7]) & 4294967295L;
        long j9 = ((long) iArr[i]) & 4294967295L;
        long j10 = j9 * j;
        iArr3[i3] = (int) j10;
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr3[i3 + 1] = (int) j11;
        long j12 = (j9 * j3) + (j11 >>> 32);
        iArr3[i3 + 2] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr3[i3 + 3] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr3[i3 + 4] = (int) j14;
        long j15 = (j9 * j6) + (j14 >>> 32);
        iArr3[i3 + 5] = (int) j15;
        long j16 = (j9 * j7) + (j15 >>> 32);
        iArr3[i3 + 6] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr3[i3 + 7] = (int) j17;
        iArr3[i3 + 8] = (int) (j17 >>> 32);
        int i4 = i3;
        int i5 = 1;
        while (i5 < 8) {
            int i6 = i4 + 1;
            long j18 = ((long) iArr[i + i5]) & 4294967295L;
            int i7 = i5;
            long j19 = (j18 * j) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j19;
            int i8 = i4 + 2;
            long j20 = j6;
            long j21 = (j19 >>> 32) + (j18 * j2) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j21;
            int i9 = i4 + 3;
            long j22 = j3;
            long j23 = (j18 * j3) + (((long) iArr3[i9]) & 4294967295L) + (j21 >>> 32);
            iArr3[i9] = (int) j23;
            int i10 = i4 + 4;
            long j24 = (j18 * j4) + (((long) iArr3[i10]) & 4294967295L) + (j23 >>> 32);
            iArr3[i10] = (int) j24;
            int i11 = i4 + 5;
            long j25 = (j18 * j5) + (((long) iArr3[i11]) & 4294967295L) + (j24 >>> 32);
            iArr3[i11] = (int) j25;
            int i12 = i4 + 6;
            long j26 = (j18 * j20) + (((long) iArr3[i12]) & 4294967295L) + (j25 >>> 32);
            iArr3[i12] = (int) j26;
            int i13 = i4 + 7;
            long j27 = (j18 * j7) + (((long) iArr3[i13]) & 4294967295L) + (j26 >>> 32);
            iArr3[i13] = (int) j27;
            int i14 = i4 + 8;
            long j28 = (j18 * j8) + (((long) iArr3[i14]) & 4294967295L) + (j27 >>> 32);
            iArr3[i14] = (int) j28;
            iArr3[i4 + 9] = (int) (j28 >>> 32);
            i5 = i7 + 1;
            i4 = i6;
            j3 = j22;
            j6 = j20;
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
        long j8 = ((long) iArr2[7]) & 4294967295L;
        long j9 = ((long) iArr[0]) & 4294967295L;
        long j10 = j9 * j;
        iArr3[0] = (int) j10;
        char c = ' ';
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (j9 * j3) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (j9 * j6) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (j9 * j7) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        int i = 8;
        iArr3[8] = (int) (j17 >>> 32);
        int i2 = 1;
        while (i2 < i) {
            long j18 = ((long) iArr[i2]) & 4294967295L;
            long j19 = j;
            long j20 = (j18 * j) + (((long) iArr3[i2]) & 4294967295L);
            iArr3[i2] = (int) j20;
            int i3 = i2 + 1;
            long j21 = j2;
            long j22 = (j18 * j2) + (((long) iArr3[i3]) & 4294967295L) + (j20 >>> c);
            iArr3[i3] = (int) j22;
            int i4 = i2 + 2;
            long j23 = j3;
            long j24 = (j18 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j22 >>> c);
            iArr3[i4] = (int) j24;
            int i5 = i2 + 3;
            long j25 = (j18 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j24 >>> 32);
            iArr3[i5] = (int) j25;
            int i6 = i2 + 4;
            long j26 = (j18 * j5) + (((long) iArr3[i6]) & 4294967295L) + (j25 >>> 32);
            iArr3[i6] = (int) j26;
            int i7 = i2 + 5;
            long j27 = (j18 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j26 >>> 32);
            iArr3[i7] = (int) j27;
            int i8 = i2 + 6;
            long j28 = (j18 * j7) + (((long) iArr3[i8]) & 4294967295L) + (j27 >>> 32);
            iArr3[i8] = (int) j28;
            int i9 = i2 + 7;
            long j29 = (j18 * j8) + (((long) iArr3[i9]) & 4294967295L) + (j28 >>> 32);
            iArr3[i9] = (int) j29;
            iArr3[i2 + 8] = (int) (j29 >>> 32);
            i2 = i3;
            j3 = j23;
            j = j19;
            j2 = j21;
            i = 8;
            c = ' ';
        }
    }

    public static void mul128(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr[0]) & 4294967295L;
        long j2 = ((long) iArr[1]) & 4294967295L;
        long j3 = ((long) iArr[2]) & 4294967295L;
        long j4 = ((long) iArr[3]) & 4294967295L;
        long j5 = ((long) iArr[4]) & 4294967295L;
        long j6 = ((long) iArr[5]) & 4294967295L;
        long j7 = ((long) iArr[6]) & 4294967295L;
        long j8 = ((long) iArr[7]) & 4294967295L;
        long j9 = ((long) iArr2[0]) & 4294967295L;
        long j10 = j9 * j;
        iArr3[0] = (int) j10;
        char c = ' ';
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (j9 * j3) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (j9 * j6) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (j9 * j7) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        iArr3[8] = (int) (j17 >>> 32);
        int i = 1;
        int i2 = 4;
        while (i < i2) {
            long j18 = ((long) iArr2[i]) & 4294967295L;
            long j19 = j;
            long j20 = (j18 * j) + (((long) iArr3[i]) & 4294967295L);
            iArr3[i] = (int) j20;
            int i3 = i + 1;
            long j21 = j2;
            long j22 = (j18 * j2) + (((long) iArr3[i3]) & 4294967295L) + (j20 >>> c);
            iArr3[i3] = (int) j22;
            int i4 = i + 2;
            long j23 = j3;
            long j24 = (j18 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j22 >>> c);
            iArr3[i4] = (int) j24;
            int i5 = i + 3;
            long j25 = (j18 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j24 >>> 32);
            iArr3[i5] = (int) j25;
            int i6 = i + 4;
            long j26 = (j18 * j5) + (((long) iArr3[i6]) & 4294967295L) + (j25 >>> 32);
            iArr3[i6] = (int) j26;
            int i7 = i + 5;
            long j27 = (j18 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j26 >>> 32);
            iArr3[i7] = (int) j27;
            int i8 = i + 6;
            long j28 = (j18 * j7) + (((long) iArr3[i8]) & 4294967295L) + (j27 >>> 32);
            iArr3[i8] = (int) j28;
            int i9 = i + 7;
            long j29 = (j18 * j8) + (((long) iArr3[i9]) & 4294967295L) + (j28 >>> 32);
            iArr3[i9] = (int) j29;
            iArr3[i + 8] = (int) (j29 >>> 32);
            i = i3;
            j3 = j23;
            j = j19;
            j2 = j21;
            i2 = 4;
            c = ' ';
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
        long j15 = (j * j14) + j12 + (((long) iArr2[i3 + 6]) & 4294967295L) + (j13 >>> 32);
        iArr3[i4 + 6] = (int) j15;
        long j16 = ((long) iArr[i2 + 7]) & 4294967295L;
        long j17 = (j * j16) + j14 + (4294967295L & ((long) iArr2[i3 + 7])) + (j15 >>> 32);
        iArr3[i4 + 7] = (int) j17;
        return (j17 >>> 32) + j16;
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
        return Nat.incAt(8, iArr, i2, 4);
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
        return Nat.incAt(8, iArr, i3, 3);
    }

    public static int mulAddTo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2]) & 4294967295L;
        long j2 = ((long) iArr2[i2 + 1]) & 4294967295L;
        long j3 = ((long) iArr2[i2 + 2]) & 4294967295L;
        long j4 = ((long) iArr2[i2 + 3]) & 4294967295L;
        long j5 = ((long) iArr2[i2 + 4]) & 4294967295L;
        long j6 = ((long) iArr2[i2 + 5]) & 4294967295L;
        long j7 = ((long) iArr2[i2 + 6]) & 4294967295L;
        long j8 = ((long) iArr2[i2 + 7]) & 4294967295L;
        int i4 = i3;
        long j9 = 0;
        int i5 = 0;
        while (i5 < 8) {
            int i6 = i5;
            long j10 = ((long) iArr[i + i5]) & 4294967295L;
            long j11 = j;
            long j12 = (j10 * j) + (((long) iArr3[i4]) & 4294967295L);
            long j13 = j8;
            iArr3[i4] = (int) j12;
            int i7 = i4 + 1;
            long j14 = j2;
            long j15 = (j10 * j2) + (((long) iArr3[i7]) & 4294967295L) + (j12 >>> 32);
            iArr3[i7] = (int) j15;
            long j16 = j15 >>> 32;
            int i8 = i4 + 2;
            long j17 = j3;
            long j18 = (j10 * j3) + (((long) iArr3[i8]) & 4294967295L) + j16;
            iArr3[i8] = (int) j18;
            int i9 = i4 + 3;
            long j19 = (j10 * j4) + (((long) iArr3[i9]) & 4294967295L) + (j18 >>> 32);
            iArr3[i9] = (int) j19;
            int i10 = i4 + 4;
            long j20 = (j10 * j5) + (((long) iArr3[i10]) & 4294967295L) + (j19 >>> 32);
            iArr3[i10] = (int) j20;
            int i11 = i4 + 5;
            long j21 = (j10 * j6) + (((long) iArr3[i11]) & 4294967295L) + (j20 >>> 32);
            iArr3[i11] = (int) j21;
            long j22 = j21 >>> 32;
            int i12 = i4 + 6;
            long j23 = (j10 * j7) + (((long) iArr3[i12]) & 4294967295L) + j22;
            iArr3[i12] = (int) j23;
            int i13 = i4 + 7;
            long j24 = (j10 * j13) + (((long) iArr3[i13]) & 4294967295L) + (j23 >>> 32);
            iArr3[i13] = (int) j24;
            int i14 = i4 + 8;
            long j25 = (j24 >>> 32) + (((long) iArr3[i14]) & 4294967295L) + j9;
            iArr3[i14] = (int) j25;
            j9 = j25 >>> 32;
            i5 = i6 + 1;
            j8 = j13;
            j = j11;
            i4 = i7;
            j2 = j14;
            j3 = j17;
        }
        return (int) j9;
    }

    public static int mulAddTo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr2[7]) & 4294967295L;
        long j9 = 0;
        int i = 0;
        while (i < 8) {
            long j10 = j8;
            long j11 = ((long) iArr[i]) & 4294967295L;
            long j12 = j;
            long j13 = (j11 * j) + (((long) iArr3[i]) & 4294967295L);
            iArr3[i] = (int) j13;
            int i2 = i + 1;
            long j14 = j2;
            long j15 = (j11 * j2) + (((long) iArr3[i2]) & 4294967295L) + (j13 >>> 32);
            iArr3[i2] = (int) j15;
            int i3 = i + 2;
            long j16 = (j11 * j3) + (((long) iArr3[i3]) & 4294967295L) + (j15 >>> 32);
            iArr3[i3] = (int) j16;
            int i4 = i + 3;
            long j17 = (j11 * j4) + (((long) iArr3[i4]) & 4294967295L) + (j16 >>> 32);
            iArr3[i4] = (int) j17;
            int i5 = i + 4;
            long j18 = (j11 * j5) + (((long) iArr3[i5]) & 4294967295L) + (j17 >>> 32);
            iArr3[i5] = (int) j18;
            int i6 = i + 5;
            long j19 = (j11 * j6) + (((long) iArr3[i6]) & 4294967295L) + (j18 >>> 32);
            iArr3[i6] = (int) j19;
            int i7 = i + 6;
            long j20 = (j11 * j7) + (((long) iArr3[i7]) & 4294967295L) + (j19 >>> 32);
            iArr3[i7] = (int) j20;
            int i8 = i + 7;
            long j21 = (j11 * j10) + (((long) iArr3[i8]) & 4294967295L) + (j20 >>> 32);
            iArr3[i8] = (int) j21;
            int i9 = i + 8;
            long j22 = (j21 >>> 32) + (((long) iArr3[i9]) & 4294967295L) + j9;
            iArr3[i9] = (int) j22;
            j9 = j22 >>> 32;
            i = i2;
            j8 = j10;
            j = j12;
            j2 = j14;
            j3 = j3;
        }
        return (int) j9;
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
        long j8 = ((((long) iArr[6]) & 4294967295L) * j) + (j7 >>> 32);
        iArr[6] = (int) j8;
        long j9 = (j * (4294967295L & ((long) iArr[7]))) + (j8 >>> 32);
        iArr[7] = (int) j9;
        return (int) (j9 >>> 32);
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
        long j8 = ((((long) iArr2[6]) & 4294967295L) * j) + (((long) iArr[6]) & 4294967295L) + (j7 >>> 32);
        iArr2[6] = (int) j8;
        long j9 = (j * (((long) iArr2[7]) & 4294967295L)) + (4294967295L & ((long) iArr[7])) + (j8 >>> 32);
        iArr2[7] = (int) j9;
        return (int) (j9 >>> 32);
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
        } while (i3 < 8);
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
        long j8 = ((((long) iArr[i2 + 6]) & 4294967295L) * j) + (((long) iArr2[i9]) & 4294967295L) + (j7 >>> 32);
        iArr2[i9] = (int) j8;
        int i10 = i3 + 7;
        long j9 = (j * (((long) iArr[i2 + 7]) & 4294967295L)) + (((long) iArr2[i10]) & 4294967295L) + (j8 >>> 32);
        iArr2[i10] = (int) j9;
        return (int) (j9 >>> 32);
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
        return Nat.incAt(8, iArr, i2, 3);
    }

    public static void square(int[] iArr, int i, int[] iArr2, int i2) {
        long j = ((long) iArr[i]) & 4294967295L;
        int i3 = 0;
        int i4 = 16;
        int i5 = 7;
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
                long jM21450 = C8083.m21450(j9, j6, j12 >>> 32, j10);
                long j13 = j11 + (jM21450 >>> 32);
                long j14 = ((long) iArr[i + 3]) & 4294967295L;
                int i13 = i2 + 5;
                long j15 = (((long) iArr2[i13]) & 4294967295L) + (j13 >>> 32);
                int i14 = i2 + 6;
                long j16 = (((long) iArr2[i14]) & 4294967295L) + (j15 >>> 32);
                long j17 = j15 & 4294967295L;
                long j18 = (j14 * j) + (jM21450 & 4294967295L);
                int i15 = (int) j18;
                iArr2[i10] = (i12 >>> 31) | (i15 << 1);
                long jM21451 = C8083.m21450(j14, j6, j18 >>> 32, j13 & 4294967295L);
                long jM21452 = C8083.m21450(j14, j9, jM21451 >>> 32, j17);
                long j19 = j16 + (jM21452 >>> 32);
                long j20 = jM21452 & 4294967295L;
                long j21 = ((long) iArr[i + 4]) & 4294967295L;
                int i16 = i2 + 7;
                long j22 = (((long) iArr2[i16]) & 4294967295L) + (j19 >>> 32);
                int i17 = i2 + 8;
                long j23 = (((long) iArr2[i17]) & 4294967295L) + (j22 >>> 32);
                long j24 = j22 & 4294967295L;
                long j25 = (j21 * j) + (jM21451 & 4294967295L);
                int i18 = (int) j25;
                iArr2[i11] = (i15 >>> 31) | (i18 << 1);
                int i19 = i18 >>> 31;
                long jM21453 = C8083.m21450(j21, j6, j25 >>> 32, j20);
                long jM21454 = C8083.m21450(j21, j9, jM21453 >>> 32, j19 & 4294967295L);
                long jM21455 = C8083.m21450(j21, j14, jM21454 >>> 32, j24);
                long j26 = jM21454 & 4294967295L;
                long j27 = j23 + (jM21455 >>> 32);
                long j28 = ((long) iArr[i + 5]) & 4294967295L;
                int i20 = i2 + 9;
                long j29 = (((long) iArr2[i20]) & 4294967295L) + (j27 >>> 32);
                int i21 = i2 + 10;
                long j30 = (((long) iArr2[i21]) & 4294967295L) + (j29 >>> 32);
                long j31 = j29 & 4294967295L;
                long j32 = (j28 * j) + (jM21453 & 4294967295L);
                int i22 = (int) j32;
                iArr2[i13] = i19 | (i22 << 1);
                int i23 = i22 >>> 31;
                long jM21456 = C8083.m21450(j28, j6, j32 >>> 32, j26);
                long jM21457 = C8083.m21450(j28, j9, jM21456 >>> 32, jM21455 & 4294967295L);
                long jM21458 = C8083.m21450(j28, j14, jM21457 >>> 32, j27 & 4294967295L);
                long j33 = jM21457 & 4294967295L;
                long jM21459 = C8083.m21450(j28, j21, jM21458 >>> 32, j31);
                long j34 = j30 + (jM21459 >>> 32);
                long j35 = jM21459 & 4294967295L;
                long j36 = ((long) iArr[i + 6]) & 4294967295L;
                int i24 = i2 + 11;
                long j37 = (((long) iArr2[i24]) & 4294967295L) + (j34 >>> 32);
                long j38 = j34 & 4294967295L;
                int i25 = i2 + 12;
                long j39 = (((long) iArr2[i25]) & 4294967295L) + (j37 >>> 32);
                long j40 = j37 & 4294967295L;
                long j41 = (j36 * j) + (jM21456 & 4294967295L);
                int i26 = (int) j41;
                iArr2[i14] = i23 | (i26 << 1);
                int i27 = i26 >>> 31;
                long jM214510 = C8083.m21450(j36, j6, j41 >>> 32, j33);
                long jM214511 = C8083.m21450(j36, j9, jM214510 >>> 32, jM21458 & 4294967295L);
                long jM214512 = C8083.m21450(j36, j14, jM214511 >>> 32, j35);
                long j42 = jM214511 & 4294967295L;
                long jM214513 = C8083.m21450(j36, j21, jM214512 >>> 32, j38);
                long j43 = jM214512 & 4294967295L;
                long jM214514 = C8083.m21450(j36, j28, jM214513 >>> 32, j40);
                long j44 = jM214513 & 4294967295L;
                long j45 = j39 + (jM214514 >>> 32);
                long j46 = ((long) iArr[i + 7]) & 4294967295L;
                int i28 = i2 + 13;
                long j47 = (((long) iArr2[i28]) & 4294967295L) + (j45 >>> 32);
                int i29 = i2 + 14;
                long j48 = (((long) iArr2[i29]) & 4294967295L) + (j47 >>> 32);
                long j49 = 4294967295L & j47;
                long j50 = (j * j46) + (jM214510 & 4294967295L);
                int i30 = (int) j50;
                iArr2[i16] = i27 | (i30 << 1);
                int i31 = i30 >>> 31;
                long jM214515 = C8083.m21450(j46, j6, j50 >>> 32, j42);
                long jM214516 = C8083.m21450(j46, j9, jM214515 >>> 32, j43);
                long jM214517 = C8083.m21450(j46, j14, jM214516 >>> 32, j44);
                long jM214518 = C8083.m21450(j46, j21, jM214517 >>> 32, jM214514 & 4294967295L);
                long jM214519 = C8083.m21450(j46, j28, jM214518 >>> 32, j45 & 4294967295L);
                long jM214520 = C8083.m21450(j46, j36, jM214519 >>> 32, j49);
                long j51 = j48 + (jM214520 >>> 32);
                int i32 = (int) jM214515;
                iArr2[i17] = (i32 << 1) | i31;
                int i33 = i32 >>> 31;
                int i34 = (int) jM214516;
                iArr2[i20] = i33 | (i34 << 1);
                int i35 = i34 >>> 31;
                int i36 = (int) jM214517;
                iArr2[i21] = i35 | (i36 << 1);
                int i37 = i36 >>> 31;
                int i38 = (int) jM214518;
                iArr2[i24] = i37 | (i38 << 1);
                int i39 = i38 >>> 31;
                int i40 = (int) jM214519;
                iArr2[i25] = i39 | (i40 << 1);
                int i41 = i40 >>> 31;
                int i42 = (int) jM214520;
                iArr2[i28] = i41 | (i42 << 1);
                int i43 = i42 >>> 31;
                int i44 = (int) j51;
                iArr2[i29] = i43 | (i44 << 1);
                int i45 = i44 >>> 31;
                int i46 = i2 + 15;
                iArr2[i46] = i45 | ((iArr2[i46] + ((int) (j51 >>> 32))) << 1);
                return;
            }
            i5 = i6;
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 16;
        int i2 = 7;
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
                long jM21450 = C8083.m21450(j10, j6, j13 >>> 32, j11);
                long j14 = j12 + (jM21450 >>> 32);
                long j15 = ((long) iArr[3]) & 4294967295L;
                long j16 = (((long) iArr2[5]) & 4294967295L) + (j14 >>> 32);
                long j17 = j14 & 4294967295L;
                long j18 = (((long) iArr2[6]) & 4294967295L) + (j16 >>> 32);
                long j19 = (jM21450 & 4294967295L) + (j15 * j);
                int i7 = (int) j19;
                iArr2[3] = (i6 >>> 31) | (i7 << 1);
                int i8 = i7 >>> 31;
                long jM21451 = C8083.m21450(j15, j6, j19 >>> 32, j17);
                long jM21452 = C8083.m21450(j15, j10, jM21451 >>> 32, j16 & 4294967295L);
                long j20 = j18 + (jM21452 >>> 32);
                long j21 = jM21452 & 4294967295L;
                long j22 = ((long) iArr[4]) & 4294967295L;
                long j23 = (j20 >>> 32) + (((long) iArr2[7]) & 4294967295L);
                long j24 = (((long) iArr2[8]) & 4294967295L) + (j23 >>> 32);
                long j25 = j23 & 4294967295L;
                long j26 = (j22 * j) + (jM21451 & 4294967295L);
                int i9 = (int) j26;
                iArr2[4] = i8 | (i9 << 1);
                int i10 = i9 >>> 31;
                long jM21453 = C8083.m21450(j22, j6, j26 >>> 32, j21);
                long jM21454 = C8083.m21450(j22, j10, jM21453 >>> 32, j20 & 4294967295L);
                long j27 = jM21453 & 4294967295L;
                long jM21455 = C8083.m21450(j22, j15, jM21454 >>> 32, j25);
                long j28 = jM21454 & 4294967295L;
                long j29 = j24 + (jM21455 >>> 32);
                long j30 = ((long) iArr[5]) & 4294967295L;
                long j31 = (j29 >>> 32) + (((long) iArr2[9]) & 4294967295L);
                long j32 = (((long) iArr2[10]) & 4294967295L) + (j31 >>> 32);
                long j33 = j31 & 4294967295L;
                long j34 = (j30 * j) + j27;
                int i11 = (int) j34;
                iArr2[5] = i10 | (i11 << 1);
                int i12 = i11 >>> 31;
                long jM21456 = C8083.m21450(j30, j6, j34 >>> 32, j28);
                long jM21457 = C8083.m21450(j30, j10, jM21456 >>> 32, jM21455 & 4294967295L);
                long jM21458 = C8083.m21450(j30, j15, jM21457 >>> 32, j29 & 4294967295L);
                long j35 = jM21457 & 4294967295L;
                long jM21459 = C8083.m21450(j30, j22, jM21458 >>> 32, j33);
                long j36 = j32 + (jM21459 >>> 32);
                long j37 = jM21459 & 4294967295L;
                long j38 = ((long) iArr[6]) & 4294967295L;
                long j39 = (((long) iArr2[11]) & 4294967295L) + (j36 >>> 32);
                long j40 = (((long) iArr2[12]) & 4294967295L) + (j39 >>> 32);
                long j41 = (j38 * j) + (jM21456 & 4294967295L);
                int i13 = (int) j41;
                iArr2[6] = i12 | (i13 << 1);
                int i14 = i13 >>> 31;
                long jM214510 = C8083.m21450(j38, j6, j41 >>> 32, j35);
                long jM214511 = C8083.m21450(j38, j10, jM214510 >>> 32, jM21458 & 4294967295L);
                long jM214512 = C8083.m21450(j38, j15, jM214511 >>> 32, j37);
                long j42 = jM214511 & 4294967295L;
                long jM214513 = C8083.m21450(j38, j22, jM214512 >>> 32, j36 & 4294967295L);
                long j43 = jM214512 & 4294967295L;
                long jM214514 = C8083.m21450(j38, j30, jM214513 >>> 32, j39 & 4294967295L);
                long j44 = j40 + (jM214514 >>> 32);
                long j45 = ((long) iArr[7]) & 4294967295L;
                long j46 = (((long) iArr2[13]) & 4294967295L) + (j44 >>> 32);
                long j47 = (((long) iArr2[14]) & 4294967295L) + (j46 >>> 32);
                long j48 = 4294967295L & j46;
                long j49 = (j * j45) + (jM214510 & 4294967295L);
                int i15 = (int) j49;
                iArr2[7] = i14 | (i15 << 1);
                long jM214515 = C8083.m21450(j45, j6, j49 >>> 32, j42);
                long jM214516 = C8083.m21450(j45, j10, jM214515 >>> 32, j43);
                long jM214517 = C8083.m21450(j45, j15, jM214516 >>> 32, jM214513 & 4294967295L);
                long jM214518 = C8083.m21450(j45, j22, jM214517 >>> 32, jM214514 & 4294967295L);
                long jM214519 = C8083.m21450(j45, j30, jM214518 >>> 32, j44 & 4294967295L);
                long jM214520 = C8083.m21450(j45, j38, jM214519 >>> 32, j48);
                long j50 = j47 + (jM214520 >>> 32);
                int i16 = (int) jM214515;
                iArr2[8] = (i15 >>> 31) | (i16 << 1);
                int i17 = (int) jM214516;
                iArr2[9] = (i16 >>> 31) | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) jM214517;
                iArr2[10] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) jM214518;
                iArr2[11] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) jM214519;
                iArr2[12] = i22 | (i23 << 1);
                int i24 = (int) jM214520;
                iArr2[13] = (i23 >>> 31) | (i24 << 1);
                int i25 = (int) j50;
                iArr2[14] = (i24 >>> 31) | (i25 << 1);
                iArr2[15] = (i25 >>> 31) | ((iArr2[15] + ((int) (j50 >>> 32))) << 1);
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
        long j8 = ((((long) iArr[i + 7]) & 4294967295L) - (((long) iArr2[i2 + 7]) & 4294967295L)) + (j7 >> 32);
        iArr3[i3 + 7] = (int) j8;
        return (int) (j8 >> 32);
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
        long j8 = ((((long) iArr[7]) & 4294967295L) - (((long) iArr2[7]) & 4294967295L)) + (j7 >> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
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
        long j8 = (((((long) iArr3[7]) & 4294967295L) - (((long) iArr[7]) & 4294967295L)) - (((long) iArr2[7]) & 4294967295L)) + (j7 >> 32);
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
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
        int i9 = i2 + 7;
        long j8 = ((((long) iArr2[i9]) & 4294967295L) - (((long) iArr[i + 7]) & 4294967295L)) + (j7 >> 32);
        iArr2[i9] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int subFrom(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        long j = ((((long) iArr2[i2]) & 4294967295L) - (((long) iArr[i]) & 4294967295L)) + (((long) i3) & 4294967295L);
        iArr2[i2] = (int) j;
        long j2 = j >> 32;
        int i4 = i2 + 1;
        long j3 = ((((long) iArr2[i4]) & 4294967295L) - (((long) iArr[i + 1]) & 4294967295L)) + j2;
        iArr2[i4] = (int) j3;
        int i5 = i2 + 2;
        long j4 = ((((long) iArr2[i5]) & 4294967295L) - (((long) iArr[i + 2]) & 4294967295L)) + (j3 >> 32);
        iArr2[i5] = (int) j4;
        int i6 = i2 + 3;
        long j5 = ((((long) iArr2[i6]) & 4294967295L) - (((long) iArr[i + 3]) & 4294967295L)) + (j4 >> 32);
        iArr2[i6] = (int) j5;
        int i7 = i2 + 4;
        long j6 = ((((long) iArr2[i7]) & 4294967295L) - (((long) iArr[i + 4]) & 4294967295L)) + (j5 >> 32);
        iArr2[i7] = (int) j6;
        int i8 = i2 + 5;
        long j7 = ((((long) iArr2[i8]) & 4294967295L) - (((long) iArr[i + 5]) & 4294967295L)) + (j6 >> 32);
        iArr2[i8] = (int) j7;
        int i9 = i2 + 6;
        long j8 = ((((long) iArr2[i9]) & 4294967295L) - (((long) iArr[i + 6]) & 4294967295L)) + (j7 >> 32);
        iArr2[i9] = (int) j8;
        int i10 = i2 + 7;
        long j9 = ((((long) iArr2[i10]) & 4294967295L) - (((long) iArr[i + 7]) & 4294967295L)) + (j8 >> 32);
        iArr2[i10] = (int) j9;
        return (int) (j9 >> 32);
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
        long j7 = ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) + (j6 >> 32);
        iArr2[6] = (int) j7;
        long j8 = ((((long) iArr2[7]) & 4294967295L) - (4294967295L & ((long) iArr[7]))) + (j7 >> 32);
        iArr2[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int subFrom(int[] iArr, int[] iArr2, int i) {
        long j = ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + (((long) i) & 4294967295L);
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
        long j7 = ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) + (j6 >> 32);
        iArr2[6] = (int) j7;
        long j8 = ((((long) iArr2[7]) & 4294967295L) - (4294967295L & ((long) iArr[7]))) + (j7 >> 32);
        iArr2[7] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static BigInteger toBigInteger(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                Pack.intToBigEndian(i2, bArr, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            if (j != 0) {
                Pack.longToBigEndian(j, bArr, (3 - i) << 3);
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
        iArr[7] = 0;
    }
}
