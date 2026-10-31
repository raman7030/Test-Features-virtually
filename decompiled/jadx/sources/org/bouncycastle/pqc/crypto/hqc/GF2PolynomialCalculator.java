package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class GF2PolynomialCalculator {
    public final int PARAM_N;
    public final long RED_MASK;
    public final int VEC_N_SIZE_64;

    public GF2PolynomialCalculator(int i, int i2, long j) {
        this.VEC_N_SIZE_64 = i;
        this.PARAM_N = i2;
        this.RED_MASK = j;
    }

    private void karatsuba(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3, int i4, long[] jArr4, int i5) {
        if (i4 <= 16) {
            schoolbookMul(jArr, i, jArr2, i2, jArr3, i3, i4);
            return;
        }
        int i6 = i4 >> 1;
        int i7 = i4 - i6;
        int i8 = i4 << 1;
        int i9 = i6 << 1;
        int i10 = i7 << 1;
        int i11 = i5 + i8;
        int i12 = i11 + i8;
        int i13 = i12 + i8;
        int i14 = i13 + i4;
        int i15 = i5 + (i4 << 3);
        karatsuba(jArr4, i5, jArr2, i2, jArr3, i3, i6, jArr4, i15);
        int i16 = i2 + i6;
        int i17 = i3 + i6;
        karatsuba(jArr4, i11, jArr2, i16, jArr3, i17, i7, jArr4, i15);
        int i18 = 0;
        while (true) {
            long j = 0;
            if (i18 >= i7) {
                break;
            }
            long j2 = i18 < i6 ? jArr2[i2 + i18] : 0L;
            if (i18 < i6) {
                j = jArr3[i3 + i18];
            }
            jArr4[i13 + i18] = j2 ^ jArr2[i16 + i18];
            jArr4[i14 + i18] = j ^ jArr3[i17 + i18];
            i18++;
        }
        karatsuba(jArr4, i12, jArr4, i13, jArr4, i14, i7, jArr4, i15);
        System.arraycopy(jArr4, i5, jArr, i, i9);
        System.arraycopy(jArr4, i11, jArr, i + i9, i10);
        int i19 = 0;
        while (i19 < i7 * 2) {
            long j3 = i19 < i9 ? jArr4[i5 + i19] : 0L;
            long j4 = i19 < i10 ? jArr4[i11 + i19] : 0L;
            int i20 = i + i6 + i19;
            jArr[i20] = jArr[i20] ^ ((jArr4[i12 + i19] ^ j3) ^ j4);
            i19++;
        }
    }

    private void reduce(long[] jArr, long[] jArr2) {
        int i = 0;
        while (true) {
            int i2 = this.VEC_N_SIZE_64;
            if (i >= i2) {
                int i3 = i2 - 1;
                jArr[i3] = jArr[i3] & this.RED_MASK;
                return;
            } else {
                long j = jArr2[i];
                long j2 = jArr2[(i + i2) - 1];
                int i4 = this.PARAM_N;
                jArr[i] = (j ^ (j2 >>> (i4 & 63))) ^ (jArr2[i2 + i] << ((int) (64 - (((long) i4) & 63))));
                i++;
            }
        }
    }

    private void schoolbookMul(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3, int i4) {
        int i5 = i;
        Arrays.fill(jArr, i5, (i4 << 1) + i5, 0L);
        int i6 = 0;
        while (i6 < i4) {
            long j = jArr2[i6 + i2];
            for (int i7 = 0; i7 < 64; i7++) {
                long j2 = -((j >> i7) & 1);
                if (i7 == 0) {
                    int i8 = 0;
                    int i9 = i3;
                    int i10 = i5;
                    while (i8 < i4) {
                        jArr[i10] = jArr[i10] ^ (jArr3[i9] & j2);
                        i8++;
                        i10++;
                        i9++;
                    }
                } else {
                    int i11 = 64 - i7;
                    int i12 = 0;
                    int i13 = i3;
                    int i14 = i5;
                    while (i12 < i4) {
                        int i15 = i14 + 1;
                        jArr[i14] = jArr[i14] ^ ((jArr3[i13] << i7) & j2);
                        jArr[i15] = jArr[i15] ^ ((jArr3[i13] >>> i11) & j2);
                        i12++;
                        i13++;
                        i14 = i15;
                    }
                }
            }
            i6++;
            i5++;
        }
    }

    public void vectMul(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = this.VEC_N_SIZE_64;
        long[] jArr4 = new long[i << 1];
        karatsuba(jArr4, 0, jArr2, 0, jArr3, 0, i, new long[i << 4], 0);
        reduce(jArr, jArr4);
    }
}
