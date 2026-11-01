package com.amazonaws.util;

import org.bouncycastle.util.encoders.Base32Encoder;
import p067l.C20778;

/* JADX INFO: loaded from: classes.dex */
public class Base64Codec {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f1985 = CodecUtils.m1930("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    public class LazyHolder {

        /* JADX INFO: renamed from: ֫ */
        public static final byte[] f1986;

        static {
            byte[] bArr = new byte[123];
            for (int i = 0; i <= 122; i++) {
                if (i >= 65 && i <= 90) {
                    bArr[i] = (byte) (i - 65);
                } else if (i >= 48 && i <= 57) {
                    bArr[i] = (byte) (i + 4);
                } else if (i == 43) {
                    bArr[i] = (byte) (i + 19);
                } else if (i == 47) {
                    bArr[i] = (byte) (i + 16);
                } else if (i >= 97 && i <= 122) {
                    bArr[i] = (byte) (i - 71);
                } else {
                    bArr[i] = -1;
                }
            }
            f1986 = bArr;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m1913(byte[] bArr) {
        int length = bArr.length / 3;
        int length2 = bArr.length % 3;
        int i = 0;
        if (length2 == 0) {
            byte[] bArr2 = new byte[length * 4];
            int i2 = 0;
            while (i < bArr.length) {
                m1912(i, i2, bArr, bArr2);
                i += 3;
                i2 += 4;
            }
            return bArr2;
        }
        byte[] bArr3 = new byte[(length + 1) * 4];
        int i3 = 0;
        while (i < bArr.length - length2) {
            m1912(i, i3, bArr, bArr3);
            i += 3;
            i3 += 4;
        }
        byte[] bArr4 = this.f1985;
        if (length2 == 1) {
            byte b = bArr[i];
            bArr3[i3] = bArr4[(b >>> 2) & 63];
            bArr3[i3 + 1] = bArr4[(b & 3) << 4];
            bArr3[i3 + 2] = Base32Encoder.DEFAULT_PADDING;
            bArr3[i3 + 3] = Base32Encoder.DEFAULT_PADDING;
            return bArr3;
        }
        if (length2 != 2) {
            return bArr3;
        }
        int i4 = i + 1;
        byte b2 = bArr[i];
        bArr3[i3] = bArr4[(b2 >>> 2) & 63];
        byte b3 = bArr[i4];
        bArr3[i3 + 1] = bArr4[((b2 & 3) << 4) | ((b3 >>> 4) & 15)];
        bArr3[i3 + 2] = bArr4[(b3 & 15) << 2];
        bArr3[i3 + 3] = Base32Encoder.DEFAULT_PADDING;
        return bArr3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1912(int i, int i2, byte[] bArr, byte[] bArr2) {
        byte b = bArr[i];
        byte[] bArr3 = this.f1985;
        bArr2[i2] = bArr3[(b >>> 2) & 63];
        byte b2 = bArr[i + 1];
        bArr2[i2 + 1] = bArr3[((b & 3) << 4) | ((b2 >>> 4) & 15)];
        byte b3 = bArr[i + 2];
        bArr2[i2 + 2] = bArr3[((b3 >>> 6) & 3) | ((b2 & 15) << 2)];
        bArr2[i2 + 3] = bArr3[b3 & 63];
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m1911(int i, byte[] bArr) {
        int i2;
        if (i % 4 != 0) {
            throw new IllegalArgumentException(C20778.m46922(i, "Input is expected to be encoded in multiple of 4 bytes but found: "));
        }
        int i3 = i - 1;
        int i4 = 0;
        int i5 = 0;
        while (i5 < 2 && i3 > -1 && bArr[i3] == 61) {
            i3--;
            i5++;
        }
        if (i5 == 0) {
            i2 = 3;
        } else if (i5 == 1) {
            i2 = 2;
        } else {
            if (i5 != 2) {
                throw new Error("Impossible");
            }
            i2 = 1;
        }
        int i6 = ((i / 4) * 3) - (3 - i2);
        byte[] bArr2 = new byte[i6];
        int i7 = 0;
        while (i4 < i6 - (i2 % 3)) {
            int iM1910 = m1910(bArr[i7]) << 2;
            int iM1911 = m1910(bArr[i7 + 1]);
            bArr2[i4] = (byte) (iM1910 | ((iM1911 >>> 4) & 3));
            int iM1912 = m1910(bArr[i7 + 2]);
            bArr2[i4 + 1] = (byte) ((15 & (iM1912 >>> 2)) | ((iM1911 & 15) << 4));
            bArr2[i4 + 2] = (byte) (((iM1912 & 3) << 6) | m1910(bArr[i7 + 3]));
            i7 += 4;
            i4 += 3;
        }
        if (i2 < 3) {
            int i8 = i4 + 1;
            int iM1913 = m1910(bArr[i7]) << 2;
            int i9 = i7 + 2;
            int iM1914 = m1910(bArr[i7 + 1]);
            bArr2[i4] = (byte) (iM1913 | ((iM1914 >>> 4) & 3));
            if (i2 == 1) {
                CodecUtils.m1931(iM1914, 15);
                return bArr2;
            }
            int i10 = i4 + 2;
            int i11 = (iM1914 & 15) << 4;
            int i12 = i7 + 3;
            int iM1915 = m1910(bArr[i9]);
            bArr2[i8] = (byte) (i11 | (15 & (iM1915 >>> 2)));
            if (i2 == 2) {
                CodecUtils.m1931(iM1915, 3);
                return bArr2;
            }
            bArr2[i10] = (byte) (((iM1915 & 3) << 6) | m1910(bArr[i12]));
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m1910(byte b) {
        byte b2 = LazyHolder.f1986[b];
        if (b2 > -1) {
            return b2;
        }
        throw new IllegalArgumentException("Invalid base 64 character: '" + ((char) b) + "'");
    }
}
