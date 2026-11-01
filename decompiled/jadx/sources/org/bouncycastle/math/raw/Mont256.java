package org.bouncycastle.math.raw;

import p067l.C22934;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Mont256 {

    /* JADX INFO: renamed from: M */
    public static final long f81545M = 4294967295L;

    public static int inverse32(int i) {
        int iM51252 = C22934.m51252(i, i, 2, i);
        int iM51253 = C22934.m51252(i, iM51252, 2, iM51252);
        int iM51254 = C22934.m51252(i, iM51253, 2, iM51253);
        return C22934.m51252(i, iM51254, 2, iM51254);
    }

    public static void multAdd(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int i) {
        char c = 0;
        long j = 4294967295L;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 8) {
            long j3 = ((long) iArr3[c]) & j;
            long j4 = ((long) iArr[i2]) & j;
            long j5 = j4 * j2;
            long j6 = j3 + (j5 & j);
            long j7 = j2;
            long j8 = ((long) (((int) j6) * i)) & j;
            int i4 = i2;
            int i5 = i3;
            long j9 = (((long) iArr4[0]) & j) * j8;
            long j10 = ((j6 + (j9 & j)) >>> 32) + (j5 >>> 32) + (j9 >>> 32);
            int i6 = 1;
            while (i6 < 8) {
                long j11 = (((long) iArr2[i6]) & j) * j4;
                long j12 = (((long) iArr4[i6]) & j) * j8;
                long j13 = j8;
                long j14 = (j11 & j) + (j12 & j) + (((long) iArr3[i6]) & j) + j10;
                iArr3[i6 - 1] = (int) j14;
                j10 = (j14 >>> 32) + (j11 >>> 32) + (j12 >>> 32);
                i6++;
                j8 = j13;
                j = 4294967295L;
            }
            j = 4294967295L;
            long j15 = j10 + (((long) i5) & 4294967295L);
            iArr3[7] = (int) j15;
            i3 = (int) (j15 >>> 32);
            i2 = i4 + 1;
            c = 0;
            j2 = j7;
        }
        if (i3 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void multAddXF(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        char c = 0;
        long j = ((long) iArr2[0]) & 4294967295L;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 8;
            if (i >= 8) {
                break;
            }
            long j2 = ((long) iArr[i]) & 4294967295L;
            long j3 = (j2 * j) + (((long) iArr3[c]) & 4294967295L);
            long j4 = j3 & 4294967295L;
            long j5 = (j3 >>> 32) + j4;
            int i4 = 1;
            while (i4 < i3) {
                long j6 = j;
                long j7 = (((long) iArr2[i4]) & 4294967295L) * j2;
                long j8 = (((long) iArr4[i4]) & 4294967295L) * j4;
                long j9 = (j7 & 4294967295L) + (j8 & 4294967295L) + (((long) iArr3[i4]) & 4294967295L) + j5;
                iArr3[i4 - 1] = (int) j9;
                j5 = (j9 >>> 32) + (j7 >>> 32) + (j8 >>> 32);
                i4++;
                i3 = 8;
                j = j6;
                j2 = j2;
                j4 = j4;
            }
            long j10 = j5 + (((long) i2) & 4294967295L);
            iArr3[7] = (int) j10;
            i2 = (int) (j10 >>> 32);
            i++;
            c = 0;
            j = j;
        }
        if (i2 != 0 || Nat256.gte(iArr3, iArr4)) {
            Nat256.sub(iArr3, iArr4, iArr3);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2, int i) {
        char c = 0;
        int i2 = 0;
        while (i2 < 8) {
            int i3 = iArr[c];
            long j = ((long) (i3 * i)) & 4294967295L;
            long j2 = (((((long) iArr2[c]) & 4294967295L) * j) + (((long) i3) & 4294967295L)) >>> 32;
            for (int i4 = 1; i4 < 8; i4++) {
                long j3 = ((((long) iArr2[i4]) & 4294967295L) * j) + (((long) iArr[i4]) & 4294967295L) + j2;
                iArr[i4 - 1] = (int) j3;
                j2 = j3 >>> 32;
            }
            iArr[7] = (int) j2;
            i2++;
            c = 0;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }

    public static void reduceXF(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 8; i++) {
            long j = ((long) iArr[0]) & 4294967295L;
            long j2 = j;
            for (int i2 = 1; i2 < 8; i2++) {
                long j3 = ((((long) iArr2[i2]) & 4294967295L) * j) + (((long) iArr[i2]) & 4294967295L) + j2;
                iArr[i2 - 1] = (int) j3;
                j2 = j3 >>> 32;
            }
            iArr[7] = (int) j2;
        }
        if (Nat256.gte(iArr, iArr2)) {
            Nat256.sub(iArr, iArr2, iArr);
        }
    }
}
