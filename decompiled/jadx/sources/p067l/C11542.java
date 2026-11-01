package p067l;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۢܳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAZL */
/* JADX INFO: loaded from: classes3.dex */
public final class C11542 {
    /* JADX INFO: renamed from: ֫ */
    public static ByteBuffer m26607(ByteBuffer byteBuffer) throws C22271 {
        if (byteBuffer.remaining() < 4) {
            throw new C22271("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i > byteBuffer.remaining()) {
            StringBuilder sbM34408 = C15033.m34408(i, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
            sbM34408.append(byteBuffer.remaining());
            throw new C22271(sbM34408.toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException(C20778.m46922(i, "size: "));
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

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m26608(ByteBuffer byteBuffer) throws C22271 {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new C22271("Negative length");
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbM34408 = C15033.m34408(i, "Underflow while reading length-prefixed value. Length: ", ", available: ");
        sbM34408.append(byteBuffer.remaining());
        throw new C22271(sbM34408.toString());
    }
}
