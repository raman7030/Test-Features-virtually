package p067l;

import java.nio.ByteBuffer;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: renamed from: l.۫֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y3NK */
/* JADX INFO: loaded from: classes3.dex */
public final class C13840 {

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC21217 f39111;

    /* JADX INFO: renamed from: ֫ */
    public static int m31507(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m31515(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m31516(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m31514(byte[] bArr) {
        return f39111.mo14814(0, bArr, 0, bArr.length) == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m31511(int i, int i2, byte[] bArr) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return m31515(b, bArr[i]);
        }
        if (i3 == 2) {
            return m31516(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m31512(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i += (127 - cCharAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i2) < 65536) {
                                throw new C5123(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
                break;
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + Blake2xsDigest.MAX_NUMBER_BLOCKS));
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m31510(int i, int i2, String str, byte[] bArr) {
        return f39111.mo14813(i, i2, str, bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m31513(ByteBuffer byteBuffer, int i, int i2) {
        AbstractC21217 abstractC21217 = f39111;
        abstractC21217.getClass();
        if (byteBuffer.hasArray()) {
            return abstractC21217.mo14815(byteBuffer.arrayOffset() + i, i2, byteBuffer.array());
        }
        if (byteBuffer.isDirect()) {
            return abstractC21217.mo14816(byteBuffer, i, i2);
        }
        return AbstractC21217.m47913(byteBuffer, i, i2);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m31517(int i, int i2, byte[] bArr) {
        return f39111.mo14815(i, i2, bArr);
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m31518(int i, int i2, byte[] bArr) {
        return f39111.mo14814(0, bArr, i, i2) == 0;
    }

    static {
        f39111 = (C22558.m50581() && C22558.m50578() && !C2597.m3899()) ? new C14510() : new C6464();
    }
}
