package org.bouncycastle.pqc.crypto.mayo;

import org.bouncycastle.util.GF16;

/* JADX INFO: loaded from: classes2.dex */
public class GF16Utils {
    public static final long MASK_LSB = 1229782938247303441L;
    public static final long MASK_MSB = -8608480567731124088L;
    public static final long NIBBLE_MASK_LSB = -1229782938247303442L;
    public static final long NIBBLE_MASK_MSB = 8608480567731124087L;

    public static void mVecMulAdd(int i, long[] jArr, int i2, int i3, long[] jArr2, int i4) {
        long j = i3;
        long j2 = 4294967295L & j;
        long j3 = j & 1;
        long j4 = (j2 >>> 1) & 1;
        long j5 = (j2 >>> 2) & 1;
        long j6 = (j2 >>> 3) & 1;
        int i5 = 0;
        char c = 1;
        int i6 = i2;
        int i7 = i4;
        while (i5 < i) {
            int i8 = i6 + 1;
            long j7 = jArr[i6];
            int i9 = i7;
            long j8 = (-j3) & j7;
            long j9 = (j7 & MASK_MSB) >>> 3;
            long j10 = ((j7 & NIBBLE_MASK_MSB) << c) ^ (j9 + (j9 << c));
            long j11 = j3;
            long j12 = ((-j4) & j10) ^ j8;
            long j13 = (j10 & MASK_MSB) >>> 3;
            long j14 = (j13 + (j13 << c)) ^ ((j10 & NIBBLE_MASK_MSB) << c);
            long j15 = (j14 & MASK_MSB) >>> 3;
            jArr2[i9] = ((j12 ^ ((-j5) & j14)) ^ ((((j14 & NIBBLE_MASK_MSB) << 1) ^ (j15 + (j15 << 1))) & (-j6))) ^ jArr2[i9];
            i5++;
            i7 = i9 + 1;
            i6 = i8;
            j4 = j4;
            j3 = j11;
            c = 1;
        }
    }

    public static void matMul(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < i3) {
            int i7 = 0;
            byte bMul = 0;
            while (i7 < i2) {
                bMul = (byte) (GF16.mul(bArr[i5], bArr2[i + i7]) ^ bMul);
                i7++;
                i5++;
            }
            bArr3[i6] = bMul;
            i4++;
            i6++;
        }
    }

    public static void mulAddMUpperTriangularMatXMat(int i, long[] jArr, byte[] bArr, long[] jArr2, int i2, int i3, int i4) {
        int i5 = i4 * i;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i3) {
            int i10 = i6;
            int i11 = i7;
            int i12 = i8;
            while (i11 < i3) {
                int i13 = 0;
                int i14 = 0;
                while (i13 < i4) {
                    mVecMulAdd(i, jArr, i10, bArr[i12 + i13], jArr2, i2 + i9 + i14);
                    i13++;
                    i14 += i;
                }
                i10 += i;
                i11++;
                i12 += i4;
            }
            i7++;
            i8 += i4;
            i9 += i5;
            i6 = i10;
        }
    }

    public static void mulAddMUpperTriangularMatXMatTrans(int i, long[] jArr, byte[] bArr, long[] jArr2, int i2, int i3) {
        int i4 = i * i3;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i2) {
            int i8 = i5;
            for (int i9 = i6; i9 < i2; i9++) {
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i10 < i3) {
                    mVecMulAdd(i, jArr, i8, bArr[i11 + i9], jArr2, i7 + i12);
                    i10++;
                    i11 += i2;
                    i12 += i;
                }
                i8 += i;
            }
            i6++;
            i7 += i4;
            i5 = i8;
        }
    }

    public static void mulAddMatTransXMMat(int i, byte[] bArr, long[] jArr, int i2, long[] jArr2, int i3, int i4) {
        int i5 = i4 * i;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (i8 < i3) {
                byte b = bArr[i9 + i6];
                int i11 = 0;
                int i12 = 0;
                while (i11 < i4) {
                    mVecMulAdd(i, jArr, i2 + i10 + i12, b, jArr2, i7 + i12);
                    i11++;
                    i12 += i;
                }
                i8++;
                i9 += i4;
                i10 += i5;
            }
            i6++;
            i7 += i5;
        }
    }

    public static void mulAddMatXMMat(int i, byte[] bArr, long[] jArr, int i2, long[] jArr2, int i3, int i4, int i5) {
        int i6 = i * i5;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < i3) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < i4) {
                byte b = bArr[i9 + i10];
                int i12 = 0;
                int i13 = 0;
                while (i12 < i5) {
                    mVecMulAdd(i, jArr, i11 + i13 + i2, b, jArr2, i8 + i13);
                    i12++;
                    i13 += i;
                }
                i10++;
                i11 += i6;
            }
            i7++;
            i8 += i6;
            i9 += i4;
        }
    }

    public static void mulAddMatXMMat(int i, byte[] bArr, long[] jArr, long[] jArr2, int i2, int i3) {
        int i4 = i * i2;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < i2) {
            int i8 = 0;
            int i9 = 0;
            while (i8 < i3) {
                byte b = bArr[i6 + i8];
                int i10 = 0;
                int i11 = 0;
                while (i10 < i2) {
                    mVecMulAdd(i, jArr, i9 + i11, b, jArr2, i7 + i11);
                    i10++;
                    i11 += i;
                }
                i8++;
                i9 += i4;
            }
            i5++;
            i6 += i3;
            i7 += i4;
        }
    }

    public static long mulFx8(byte b, long j) {
        int i = b & 255;
        long j2 = ((j << 3) & ((long) (-((i >> 3) & 1)))) ^ (((((long) (-(b & 1))) & j) ^ (((long) (-((i >> 1) & 1))) & (j << 1))) ^ (((long) (-((i >> 2) & 1))) & (j << 2)));
        long j3 = (-1085102592571150096L) & j2;
        return ((j2 ^ (j3 >>> 4)) ^ (j3 >>> 3)) & 1085102592571150095L;
    }
}
