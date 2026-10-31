package com.amazonaws.util;

import l.C19370;
import org.bouncycastle.util.encoders.Base32Encoder;

/* JADX INFO: loaded from: classes.dex */
public class Base64Codec {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f825 = CodecUtils.m765("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");

    public class LazyHolder {

        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public static final byte[] f826;

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
            f826 = bArr;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m748(byte[] bArr) {
        int length = bArr.length / 3;
        int length2 = bArr.length % 3;
        int i = 0;
        if (length2 == 0) {
            byte[] bArr2 = new byte[length * 4];
            int i2 = 0;
            while (i < bArr.length) {
                m747(i, i2, bArr, bArr2);
                i += 3;
                i2 += 4;
            }
            return bArr2;
        }
        byte[] bArr3 = new byte[(length + 1) * 4];
        int i3 = 0;
        while (i < bArr.length - length2) {
            m747(i, i3, bArr, bArr3);
            i += 3;
            i3 += 4;
        }
        byte[] bArr4 = this.f825;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m747(int i, int i2, byte[] bArr, byte[] bArr2) {
        byte b = bArr[i];
        byte[] bArr3 = this.f825;
        bArr2[i2] = bArr3[(b >>> 2) & 63];
        byte b2 = bArr[i + 1];
        bArr2[i2 + 1] = bArr3[((b & 3) << 4) | ((b2 >>> 4) & 15)];
        byte b3 = bArr[i + 2];
        bArr2[i2 + 2] = bArr3[((b3 >>> 6) & 3) | ((b2 & 15) << 2)];
        bArr2[i2 + 3] = bArr3[b3 & 63];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m746(int i, byte[] bArr) {
        int i2;
        if (i % 4 != 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "Input is expected to be encoded in multiple of 4 bytes but found: "));
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
            int iM745 = m745(bArr[i7]) << 2;
            int iM746 = m745(bArr[i7 + 1]);
            bArr2[i4] = (byte) (iM745 | ((iM746 >>> 4) & 3));
            int iM747 = m745(bArr[i7 + 2]);
            bArr2[i4 + 1] = (byte) ((15 & (iM747 >>> 2)) | ((iM746 & 15) << 4));
            bArr2[i4 + 2] = (byte) (((iM747 & 3) << 6) | m745(bArr[i7 + 3]));
            i7 += 4;
            i4 += 3;
        }
        if (i2 < 3) {
            int i8 = i4 + 1;
            int iM748 = m745(bArr[i7]) << 2;
            int i9 = i7 + 2;
            int iM749 = m745(bArr[i7 + 1]);
            bArr2[i4] = (byte) (iM748 | ((iM749 >>> 4) & 3));
            if (i2 == 1) {
                CodecUtils.m766(iM749, 15);
                return bArr2;
            }
            int i10 = i4 + 2;
            int i11 = (iM749 & 15) << 4;
            int i12 = i7 + 3;
            int iM7410 = m745(bArr[i9]);
            bArr2[i8] = (byte) (i11 | (15 & (iM7410 >>> 2)));
            if (i2 == 2) {
                CodecUtils.m766(iM7410, 3);
                return bArr2;
            }
            bArr2[i10] = (byte) (((iM7410 & 3) << 6) | m745(bArr[i12]));
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m745(byte b) {
        byte b2 = LazyHolder.f826[b];
        if (b2 > -1) {
            return b2;
        }
        throw new IllegalArgumentException("Invalid base 64 character: '" + ((char) b) + "'");
    }
}
