package l;

import com.umeng.analytics.pro.bo;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۗ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9VY */
/* JADX INFO: loaded from: classes2.dex */
public final class C2913 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8901(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) ((i >> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m8903(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static short m8900(int i, byte[] bArr) {
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m8904(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static short m8902(int i, byte[] bArr) {
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m8906(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m8905(int i, byte[] bArr) throws IOException {
        char[] cArr = new char[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            int i5 = b & 255;
            if (i5 == 0) {
                break;
            }
            if (i5 < 128) {
                cArr[i3] = (char) i5;
                i2 = i4;
            } else if ((b & bo.k) == 192) {
                if (i - i4 < 2) {
                    break;
                }
                char c = (char) ((b & bo.j) << 6);
                cArr[i3] = c;
                i2 += 2;
                byte b2 = bArr[i4];
                char c2 = (char) (c | (b2 & 63));
                cArr[i3] = c2;
                if ((b2 & 192) != 128 || c2 < 128) {
                    throw new IOException("Invalid UTF-8 sequence");
                }
            } else {
                if ((b & 240) != 224) {
                    throw new IOException("Unsupported UTF-8 sequence");
                }
                if (i - i4 < 3) {
                    break;
                }
                char c3 = (char) ((b & 15) << 12);
                cArr[i3] = c3;
                int i6 = i2 + 2;
                byte b3 = bArr[i4];
                if ((b3 & 192) != 128) {
                    throw new IOException("Invalid UTF-8 sequence");
                }
                char c4 = (char) (((b3 & 63) << 6) | c3);
                cArr[i3] = c4;
                i2 += 3;
                byte b4 = bArr[i6];
                char c5 = (char) (c4 | (b4 & 63));
                cArr[i3] = c5;
                if ((b4 & 192) != 128 || c5 < 2048) {
                    throw new IOException("Invalid UTF-8 sequence");
                }
            }
            i3++;
        }
        return new String(cArr, 0, i3);
    }
}
