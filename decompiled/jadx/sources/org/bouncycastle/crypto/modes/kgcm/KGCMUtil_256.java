package org.bouncycastle.crypto.modes.kgcm;

import org.bouncycastle.crypto.modes.KXTSBlockCipher;
import org.bouncycastle.math.raw.Interleave;

/* JADX INFO: loaded from: classes.dex */
public class KGCMUtil_256 {
    public static final int SIZE = 4;

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void copy(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static boolean equal(long[] jArr, long[] jArr2) {
        return ((jArr2[3] ^ jArr[3]) | (((jArr[0] ^ jArr2[0]) | (jArr[1] ^ jArr2[1])) | (jArr[2] ^ jArr2[2]))) == 0;
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = 0;
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr2[0];
        long j6 = jArr2[1];
        long j7 = jArr2[2];
        long j8 = jArr2[3];
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (i < 64) {
            long j14 = j2;
            long j15 = -(j & 1);
            long j16 = j >>> 1;
            j9 ^= j5 & j15;
            long j17 = -(j14 & 1);
            j10 = (j10 ^ (j6 & j15)) ^ (j5 & j17);
            j11 = (j11 ^ (j7 & j15)) ^ (j6 & j17);
            long j18 = (j12 ^ (j8 & j15)) ^ (j7 & j17);
            j13 ^= j8 & j17;
            long j19 = j8 >> 63;
            j8 = (j8 << 1) | (j7 >>> 63);
            j7 = (j7 << 1) | (j6 >>> 63);
            j6 = (j5 >>> 63) | (j6 << 1);
            j5 = (j5 << 1) ^ (j19 & KXTSBlockCipher.RED_POLY_256);
            i++;
            j = j16;
            j2 = j14 >>> 1;
            j12 = j18;
        }
        long j20 = (((j8 >>> 62) ^ j5) ^ (j8 >>> 59)) ^ (j8 >>> 54);
        long j21 = ((j8 ^ (j8 << 2)) ^ (j8 << 5)) ^ (j8 << 10);
        int i2 = 0;
        while (i2 < 64) {
            long j22 = -(j3 & 1);
            j3 >>>= 1;
            j9 ^= j21 & j22;
            long j23 = j20;
            long j24 = -(j4 & 1);
            j4 >>>= 1;
            j10 = (j10 ^ (j20 & j22)) ^ (j21 & j24);
            j11 = (j11 ^ (j6 & j22)) ^ (j23 & j24);
            j12 = (j12 ^ (j7 & j22)) ^ (j6 & j24);
            j13 ^= j7 & j24;
            long j25 = j7 >> 63;
            j7 = (j7 << 1) | (j6 >>> 63);
            j6 = (j23 >>> 63) | (j6 << 1);
            long j26 = (j23 << 1) | (j21 >>> 63);
            j21 = (j21 << 1) ^ (j25 & KXTSBlockCipher.RED_POLY_256);
            i2++;
            j20 = j26;
        }
        jArr3[0] = j9 ^ (((j13 ^ (j13 << 2)) ^ (j13 << 5)) ^ (j13 << 10));
        jArr3[1] = j10 ^ (((j13 >>> 62) ^ (j13 >>> 59)) ^ (j13 >>> 54));
        jArr3[2] = j11;
        jArr3[3] = j12;
    }

    public static void multiplyX(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = ((j4 >> 63) & KXTSBlockCipher.RED_POLY_256) ^ (j << 1);
        jArr2[1] = (j >>> 63) | (j2 << 1);
        jArr2[2] = (j3 << 1) | (j2 >>> 63);
        jArr2[3] = (j4 << 1) | (j3 >>> 63);
    }

    public static void multiplyX8(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j4 >>> 56;
        jArr2[0] = ((((j << 8) ^ j5) ^ (j5 << 2)) ^ (j5 << 5)) ^ (j5 << 10);
        jArr2[1] = (j >>> 56) | (j2 << 8);
        jArr2[2] = (j3 << 8) | (j2 >>> 56);
        jArr2[3] = (j4 << 8) | (j3 >>> 56);
    }

    public static void one(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }

    public static void square(long[] jArr, long[] jArr2) {
        int i = 8;
        long[] jArr3 = new long[8];
        for (int i2 = 0; i2 < 4; i2++) {
            Interleave.expand64To128(jArr[i2], jArr3, i2 << 1);
        }
        while (true) {
            int i3 = i - 1;
            if (i3 < 4) {
                copy(jArr3, jArr2);
                return;
            }
            long j = jArr3[i3];
            int i4 = i - 5;
            jArr3[i4] = jArr3[i4] ^ ((((j << 2) ^ j) ^ (j << 5)) ^ (j << 10));
            int i5 = i - 4;
            jArr3[i5] = ((j >>> 54) ^ ((j >>> 62) ^ (j >>> 59))) ^ jArr3[i5];
            i = i3;
        }
    }

    public static void x(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }

    public static void zero(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
    }
}
