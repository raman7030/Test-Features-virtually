package org.bouncycastle.util;

import com.umeng.analytics.pro.C0698cb;

/* JADX INFO: loaded from: classes2.dex */
public class GF16 {
    public static final byte[] F_STAR = {1, 2, 4, 8, 3, 6, 12, 11, 5, 10, 7, C0698cb.f2570l, 15, C0698cb.f2569k, 9};
    public static final byte[] MT4B = new byte[256];
    public static final byte[] INV4B = new byte[16];

    static {
        for (int i = 0; i < 15; i++) {
            for (int i2 = 0; i2 < 15; i2++) {
                byte[] bArr = MT4B;
                byte[] bArr2 = F_STAR;
                bArr[(bArr2[i] << 4) ^ bArr2[i2]] = bArr2[(i + i2) % 15];
            }
        }
        byte[] bArr3 = F_STAR;
        byte bM55438mt = 1;
        byte b = bArr3[1];
        byte b2 = bArr3[14];
        INV4B[1] = 1;
        byte bM55438mt2 = 1;
        for (int i3 = 0; i3 < 14; i3++) {
            bM55438mt = m55438mt(bM55438mt, b);
            bM55438mt2 = m55438mt(bM55438mt2, b2);
            INV4B[bM55438mt] = bM55438mt2;
        }
    }

    public static void decode(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i3 >> 1;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i2 + 1;
            bArr2[i2] = (byte) (bArr[i] & 15);
            i2 += 2;
            bArr2[i6] = (byte) ((bArr[i] >>> 4) & 15);
            i5++;
            i++;
        }
        if ((i3 & 1) == 1) {
            bArr2[i2] = (byte) (bArr[i] & 15);
        }
    }

    public static void decode(byte[] bArr, byte[] bArr2, int i) {
        int i2 = i >> 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i4 + 1;
            bArr2[i4] = (byte) (bArr[i3] & 15);
            i4 += 2;
            bArr2[i5] = (byte) ((bArr[i3] >>> 4) & 15);
            i3++;
        }
        if ((i & 1) == 1) {
            bArr2[i4] = (byte) (bArr[i3] & 15);
        }
    }

    public static void encode(byte[] bArr, byte[] bArr2, int i) {
        int i2 = i >> 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i4 + 1;
            int i6 = bArr[i4] & 15;
            i4 += 2;
            bArr2[i3] = (byte) (((bArr[i5] & 15) << 4) | i6);
            i3++;
        }
        if ((i & 1) == 1) {
            bArr2[i3] = (byte) (bArr[i4] & 15);
        }
    }

    public static void encode(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3 = i2 >> 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = i5 + 1;
            int i7 = bArr[i5] & 15;
            i5 += 2;
            bArr2[i] = (byte) (((bArr[i6] & 15) << 4) | i7);
            i4++;
            i++;
        }
        if ((i2 & 1) == 1) {
            bArr2[i] = (byte) (bArr[i5] & 15);
        }
    }

    public static byte innerProduct(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = 0;
        byte bMul = 0;
        while (i4 < i3) {
            bMul = (byte) (mul(bArr[i], bArr2[i2]) ^ bMul);
            i4++;
            i2 += i3;
            i++;
        }
        return bMul;
    }

    public static byte inv(byte b) {
        return INV4B[b & 15];
    }

    /* JADX INFO: renamed from: mt */
    public static byte m55438mt(int i, int i2) {
        return MT4B[(i << 4) ^ i2];
    }

    public static byte mul(byte b, byte b2) {
        return MT4B[(b << 4) | b2];
    }

    public static int mul(int i, int i2) {
        return MT4B[(i << 4) | i2];
    }
}
