package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩳ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 658Z */
/* JADX INFO: loaded from: classes4.dex */
public final class C19824 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f60279 = 0;

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m45069(ArrayDeque arrayDeque, int i) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m45068(InputStream inputStream) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = inputStream.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return m45069(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            iMin = C15129.m34552(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return m45069(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    static {
        new C18482();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m45067(InputStream inputStream, byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(C19768.m44906(i2, "len (", ") cannot be negative"));
        }
        C6194.m14024(i, i + i2, bArr.length);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = inputStream.read(bArr, i + i3, i2 - i3);
            if (i4 == -1) {
                break;
            } else {
                i3 += i4;
            }
        }
        if (i3 != i2) {
            throw new EOFException(C20780.m46928("reached end of stream after reading ", i3, " bytes; ", " bytes expected", i2));
        }
    }
}
