package org.bouncycastle.math.p080ec.rfc8032;

import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ScalarUtil {

    /* JADX INFO: renamed from: M */
    public static final long f81543M = 4294967295L;

    public static void addShifted_NP(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i;
        int i4 = 0;
        long j = 0;
        if (i2 == 0) {
            long j2 = 0;
            while (i4 <= i3) {
                long j3 = ((long) iArr3[i4]) & 4294967295L;
                long j4 = j + (((long) iArr[i4]) & 4294967295L) + j3;
                long j5 = j2 + j3 + (((long) iArr2[i4]) & 4294967295L);
                int i5 = (int) j5;
                j2 = j5 >>> 32;
                iArr3[i4] = i5;
                long j6 = j4 + (((long) i5) & 4294967295L);
                iArr[i4] = (int) j6;
                j = j6 >>> 32;
                i4++;
            }
            return;
        }
        if (i2 < 32) {
            int i6 = 0;
            int i7 = 0;
            long j7 = 0;
            int i8 = 0;
            while (i4 <= i3) {
                int i9 = iArr3[i4];
                int i10 = -i2;
                long j8 = j + (((long) iArr[i4]) & 4294967295L) + (((long) ((i6 >>> i10) | (i9 << i2))) & 4294967295L);
                int i11 = iArr2[i4];
                long j9 = j7 + (((long) i9) & 4294967295L) + (((long) ((i7 >>> i10) | (i11 << i2))) & 4294967295L);
                int i12 = (int) j9;
                j7 = j9 >>> 32;
                iArr3[i4] = i12;
                int i13 = i8 >>> i10;
                int i14 = i4;
                long j10 = j8 + (((long) (i13 | (i12 << i2))) & 4294967295L);
                iArr[i14] = (int) j10;
                j = j10 >>> 32;
                i4 = i14 + 1;
                i8 = i12;
                i6 = i9;
                i7 = i11;
            }
            return;
        }
        System.arraycopy(iArr3, 0, iArr4, 0, i3);
        int i15 = i2 >>> 5;
        int i16 = i2 & 31;
        if (i16 == 0) {
            long j11 = 0;
            for (int i17 = i15; i17 <= i3; i17++) {
                int i18 = i17 - i15;
                long j12 = j + (((long) iArr[i17]) & 4294967295L) + (((long) iArr4[i18]) & 4294967295L);
                long j13 = j11 + (((long) iArr3[i17]) & 4294967295L) + (((long) iArr2[i18]) & 4294967295L);
                iArr3[i17] = (int) j13;
                j11 = j13 >>> 32;
                long j14 = j12 + (((long) iArr3[i18]) & 4294967295L);
                iArr[i17] = (int) j14;
                j = j14 >>> 32;
            }
            return;
        }
        long j15 = 0;
        int i19 = i15;
        int i20 = 0;
        int i21 = 0;
        while (i19 <= i3) {
            int i22 = i19 - i15;
            int i23 = iArr4[i22];
            int i24 = -i16;
            long j16 = j15;
            long j17 = j + (((long) iArr[i19]) & 4294967295L) + (((long) ((i4 >>> i24) | (i23 << i16))) & 4294967295L);
            int i25 = iArr2[i22];
            long j18 = j16 + (((long) iArr3[i19]) & 4294967295L) + (((long) ((i25 << i16) | (i20 >>> i24))) & 4294967295L);
            iArr3[i19] = (int) j18;
            j15 = j18 >>> 32;
            int i26 = iArr3[i22];
            long j19 = j17 + (((long) ((i21 >>> i24) | (i26 << i16))) & 4294967295L);
            iArr[i19] = (int) j19;
            j = j19 >>> 32;
            i19++;
            i3 = i;
            i20 = i25;
            i21 = i26;
            i4 = i23;
            i15 = i15;
        }
    }

    public static void addShifted_UV(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i2 >>> 5;
        int i4 = i2 & 31;
        long j = 0;
        if (i4 == 0) {
            long j2 = 0;
            for (int i5 = i3; i5 <= i; i5++) {
                long j3 = j + (((long) iArr[i5]) & 4294967295L);
                long j4 = j2 + (((long) iArr2[i5]) & 4294967295L);
                int i6 = i5 - i3;
                long j5 = j3 + (((long) iArr3[i6]) & 4294967295L);
                long j6 = j4 + (((long) iArr4[i6]) & 4294967295L);
                iArr[i5] = (int) j5;
                j = j5 >>> 32;
                iArr2[i5] = (int) j6;
                j2 = j6 >>> 32;
            }
            return;
        }
        int i7 = 0;
        int i8 = i3;
        long j7 = 0;
        int i9 = 0;
        while (i8 <= i) {
            int i10 = i8 - i3;
            int i11 = iArr3[i10];
            int i12 = iArr4[i10];
            int i13 = -i4;
            long j8 = j + (((long) iArr[i8]) & 4294967295L);
            long j9 = j8 + (((long) ((i7 >>> i13) | (i11 << i4))) & 4294967295L);
            long j10 = j7 + (((long) iArr2[i8]) & 4294967295L) + (((long) ((i9 >>> i13) | (i12 << i4))) & 4294967295L);
            iArr[i8] = (int) j9;
            j = j9 >>> 32;
            iArr2[i8] = (int) j10;
            j7 = j10 >>> 32;
            i8++;
            i9 = i12;
            i7 = i11;
        }
    }

    public static int getBitLength(int i, int[] iArr) {
        int i2 = iArr[i] >> 31;
        while (i > 0 && iArr[i] == i2) {
            i--;
        }
        return ((i * 32) + 32) - Integers.numberOfLeadingZeros(iArr[i] ^ i2);
    }

    public static int getBitLengthPositive(int i, int[] iArr) {
        while (i > 0 && iArr[i] == 0) {
            i--;
        }
        return ((i * 32) + 32) - Integers.numberOfLeadingZeros(iArr[i]);
    }

    public static boolean lessThan(int i, int[] iArr, int[] iArr2) {
        do {
            int i2 = iArr[i] - Integer.MIN_VALUE;
            int i3 = iArr2[i] - Integer.MIN_VALUE;
            if (i2 < i3) {
                return true;
            }
            if (i2 > i3) {
                return false;
            }
            i--;
        } while (i >= 0);
        return false;
    }

    public static void subShifted_NP(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i;
        int i4 = 0;
        long j = 0;
        if (i2 == 0) {
            long j2 = 0;
            while (i4 <= i3) {
                long j3 = ((long) iArr3[i4]) & 4294967295L;
                long j4 = (j + (((long) iArr[i4]) & 4294967295L)) - j3;
                long j5 = (j2 + j3) - (((long) iArr2[i4]) & 4294967295L);
                int i5 = (int) j5;
                j2 = j5 >> 32;
                iArr3[i4] = i5;
                long j6 = j4 - (((long) i5) & 4294967295L);
                iArr[i4] = (int) j6;
                j = j6 >> 32;
                i4++;
            }
            return;
        }
        if (i2 < 32) {
            int i6 = 0;
            int i7 = 0;
            long j7 = 0;
            int i8 = 0;
            while (i4 <= i3) {
                int i9 = iArr3[i4];
                int i10 = -i2;
                long j8 = (j + (((long) iArr[i4]) & 4294967295L)) - (((long) ((i6 >>> i10) | (i9 << i2))) & 4294967295L);
                int i11 = iArr2[i4];
                long j9 = (j7 + (((long) i9) & 4294967295L)) - (((long) ((i7 >>> i10) | (i11 << i2))) & 4294967295L);
                int i12 = (int) j9;
                j7 = j9 >> 32;
                iArr3[i4] = i12;
                int i13 = i8 >>> i10;
                int i14 = i4;
                long j10 = j8 - (((long) (i13 | (i12 << i2))) & 4294967295L);
                iArr[i14] = (int) j10;
                j = j10 >> 32;
                i4 = i14 + 1;
                i8 = i12;
                i6 = i9;
                i7 = i11;
            }
            return;
        }
        System.arraycopy(iArr3, 0, iArr4, 0, i3);
        int i15 = i2 >>> 5;
        int i16 = i2 & 31;
        if (i16 == 0) {
            long j11 = 0;
            for (int i17 = i15; i17 <= i3; i17++) {
                int i18 = i17 - i15;
                long j12 = (j + (((long) iArr[i17]) & 4294967295L)) - (((long) iArr4[i18]) & 4294967295L);
                long j13 = (j11 + (((long) iArr3[i17]) & 4294967295L)) - (((long) iArr2[i18]) & 4294967295L);
                iArr3[i17] = (int) j13;
                j11 = j13 >> 32;
                long j14 = j12 - (((long) iArr3[i18]) & 4294967295L);
                iArr[i17] = (int) j14;
                j = j14 >> 32;
            }
            return;
        }
        long j15 = 0;
        int i19 = i15;
        int i20 = 0;
        int i21 = 0;
        while (i19 <= i3) {
            int i22 = i19 - i15;
            int i23 = iArr4[i22];
            int i24 = -i16;
            long j16 = j15;
            long j17 = (j + (((long) iArr[i19]) & 4294967295L)) - (((long) ((i4 >>> i24) | (i23 << i16))) & 4294967295L);
            int i25 = iArr2[i22];
            long j18 = (j16 + (((long) iArr3[i19]) & 4294967295L)) - (((long) ((i25 << i16) | (i20 >>> i24))) & 4294967295L);
            iArr3[i19] = (int) j18;
            j15 = j18 >> 32;
            int i26 = iArr3[i22];
            long j19 = j17 - (((long) ((i21 >>> i24) | (i26 << i16))) & 4294967295L);
            iArr[i19] = (int) j19;
            j = j19 >> 32;
            i19++;
            i3 = i;
            i20 = i25;
            i21 = i26;
            i4 = i23;
            i15 = i15;
        }
    }

    public static void subShifted_UV(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int i3 = i2 >>> 5;
        int i4 = i2 & 31;
        long j = 0;
        if (i4 == 0) {
            long j2 = 0;
            for (int i5 = i3; i5 <= i; i5++) {
                long j3 = j + (((long) iArr[i5]) & 4294967295L);
                long j4 = j2 + (((long) iArr2[i5]) & 4294967295L);
                int i6 = i5 - i3;
                long j5 = j3 - (((long) iArr3[i6]) & 4294967295L);
                long j6 = j4 - (((long) iArr4[i6]) & 4294967295L);
                iArr[i5] = (int) j5;
                j = j5 >> 32;
                iArr2[i5] = (int) j6;
                j2 = j6 >> 32;
            }
            return;
        }
        int i7 = 0;
        int i8 = i3;
        long j7 = 0;
        int i9 = 0;
        while (i8 <= i) {
            int i10 = i8 - i3;
            int i11 = iArr3[i10];
            int i12 = iArr4[i10];
            int i13 = -i4;
            long j8 = j + (((long) iArr[i8]) & 4294967295L);
            long j9 = j8 - (((long) ((i7 >>> i13) | (i11 << i4))) & 4294967295L);
            long j10 = (j7 + (((long) iArr2[i8]) & 4294967295L)) - (((long) ((i9 >>> i13) | (i12 << i4))) & 4294967295L);
            iArr[i8] = (int) j9;
            j = j9 >> 32;
            iArr2[i8] = (int) j10;
            j7 = j10 >> 32;
            i8++;
            i9 = i12;
            i7 = i11;
        }
    }
}
