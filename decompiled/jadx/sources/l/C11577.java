package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۨ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6W9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11577 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f34516;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f34517;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float f34518;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f34519;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final float f34520;

    public C11577(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.f34519 = byteBuffer;
        this.f34517 = byteBuffer2;
        this.f34516 = byteBuffer2.capacity() / 2;
        float fMin = Float.POSITIVE_INFINITY;
        float fMax = Float.NEGATIVE_INFINITY;
        for (int i = 2; i < byteBuffer.capacity(); i += 12) {
            float f = byteBuffer.getShort(i) / 256.0f;
            fMin = Math.min(fMin, f);
            fMax = Math.max(fMax, f);
        }
        this.f34520 = fMin;
        this.f34518 = fMax;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m28464(C12951 c12951) throws IOException {
        if (c12951.available() < 8 || c12951.readInt() != 1362318413) {
            throw new IOException("Invalid logo mesh header");
        }
        int i = c12951.readInt();
        if (i < 1 || i > 32) {
            throw new IOException("Invalid logo mesh count");
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (c12951.available() < 8) {
                throw new IOException("Truncated logo mesh");
            }
            int i3 = c12951.readInt();
            int i4 = c12951.readInt();
            long j = (((long) i4) * 2) + (((long) i3) * 12);
            if (i3 < 3 || i3 > 60000 || i4 < 3 || i4 % 3 != 0 || j > c12951.available()) {
                throw new IOException("Invalid logo mesh lengths");
            }
            ByteBuffer byteBufferM28463 = m28463(i3, 12, c12951);
            ByteBuffer byteBufferM28464 = m28463(i4, 2, c12951);
            for (int i5 = 0; i5 < byteBufferM28464.capacity(); i5 += 2) {
                if ((byteBufferM28464.getShort(i5) & HPKE.aead_EXPORT_ONLY) >= i3) {
                    throw new IOException("Invalid logo mesh index");
                }
            }
            arrayList.add(new C11577(byteBufferM28463, byteBufferM28464));
        }
        if (c12951.available() == 0) {
            return arrayList;
        }
        throw new IOException("Trailing logo mesh data");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m28463(int i, int i2, C12951 c12951) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i * i2).order(ByteOrder.LITTLE_ENDIAN);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 = (i4 + (c12951.readByte() & 255)) & 255;
                byteBufferOrder.put((i5 * i2) + i3, (byte) i4);
            }
        }
        return byteBufferOrder;
    }
}
