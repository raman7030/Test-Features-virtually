package p067l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩶֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y3NK */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC21217 {
    /* JADX INFO: renamed from: ֫ */
    public abstract int mo14813(int i, int i2, String str, byte[] bArr);

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo14814(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo14815(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: ֫ */
    public abstract String mo14816(ByteBuffer byteBuffer, int i, int i2);

    /* JADX INFO: renamed from: ۧ */
    public static String m47913(ByteBuffer byteBuffer, int i, int i2) throws C4293 {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (b < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (b2 >= 0) {
                cArr[i5] = (char) b2;
                i5++;
                i = i6;
                while (i < i3) {
                    byte b3 = byteBuffer.get(i);
                    if (b3 < 0) {
                        break;
                    }
                    i++;
                    cArr[i5] = (char) b3;
                    i5++;
                }
            } else if (b2 < -32) {
                if (i6 >= i3) {
                    throw C4293.m8709();
                }
                i += 2;
                C23228.m51775(b2, byteBuffer.get(i6), cArr, i5);
                i5++;
            } else if (b2 < -16) {
                if (i6 >= i3 - 1) {
                    throw C4293.m8709();
                }
                int i7 = i + 2;
                i += 3;
                C23228.m51774(b2, byteBuffer.get(i6), byteBuffer.get(i7), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw C4293.m8709();
                }
                byte b4 = byteBuffer.get(i6);
                int i8 = i + 3;
                byte b5 = byteBuffer.get(i + 2);
                i += 4;
                C23228.m51773(b2, b4, b5, byteBuffer.get(i8), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }
}
