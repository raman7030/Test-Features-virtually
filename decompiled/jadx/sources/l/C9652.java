package l;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۢܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAZL */
/* JADX INFO: loaded from: classes3.dex */
public final class C9652 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m24593(ByteBuffer byteBuffer) throws C20941 {
        if (byteBuffer.remaining() < 4) {
            throw new C20941("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            StringBuilder sbM32308 = C13325.m32308(i, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
            sbM32308.append(byteBuffer.remaining());
            throw new C20941(sbM32308.toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "size: "));
        }
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m24594(ByteBuffer byteBuffer) throws C20941 {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new C20941("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbM32308 = C13325.m32308(i, "Underflow while reading length-prefixed value. Length: ", ", available: ");
        sbM32308.append(byteBuffer.remaining());
        throw new C20941(sbM32308.toString());
    }
}
