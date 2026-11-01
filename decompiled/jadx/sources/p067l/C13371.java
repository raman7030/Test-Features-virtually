package p067l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۨ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6W9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13371 {

    /* JADX INFO: renamed from: ֫ */
    public final int f37515;

    /* JADX INFO: renamed from: ۧ */
    public final ByteBuffer f37516;

    /* JADX INFO: renamed from: ܽ */
    public final float f37517;

    /* JADX INFO: renamed from: ܿ */
    public final ByteBuffer f37518;

    /* JADX INFO: renamed from: ᩳ */
    public final float f37519;

    public C13371(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.f37518 = byteBuffer;
        this.f37516 = byteBuffer2;
        this.f37515 = byteBuffer2.capacity() / 2;
        float fMin = Float.POSITIVE_INFINITY;
        float fMax = Float.NEGATIVE_INFINITY;
        for (int i = 2; i < byteBuffer.capacity(); i += 12) {
            float f = byteBuffer.getShort(i) / 256.0f;
            fMin = Math.min(fMin, f);
            fMax = Math.max(fMax, f);
        }
        this.f37519 = fMin;
        this.f37517 = fMax;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m30510(C14677 c14677) throws IOException {
        if (c14677.available() < 8 || c14677.readInt() != 1362318413) {
            throw new IOException("Invalid logo mesh header");
        }
        int i = c14677.readInt();
        if (i < 1 || i > 32) {
            throw new IOException("Invalid logo mesh count");
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (c14677.available() < 8) {
                throw new IOException("Truncated logo mesh");
            }
            int i3 = c14677.readInt();
            int i4 = c14677.readInt();
            long j = (((long) i4) * 2) + (((long) i3) * 12);
            if (i3 < 3 || i3 > 60000 || i4 < 3 || i4 % 3 != 0 || j > c14677.available()) {
                throw new IOException("Invalid logo mesh lengths");
            }
            ByteBuffer byteBufferM30509 = m30509(i3, 12, c14677);
            ByteBuffer byteBufferM305010 = m30509(i4, 2, c14677);
            for (int i5 = 0; i5 < byteBufferM305010.capacity(); i5 += 2) {
                if ((byteBufferM305010.getShort(i5) & HPKE.aead_EXPORT_ONLY) >= i3) {
                    throw new IOException("Invalid logo mesh index");
                }
            }
            arrayList.add(new C13371(byteBufferM30509, byteBufferM305010));
        }
        if (c14677.available() == 0) {
            return arrayList;
        }
        throw new IOException("Trailing logo mesh data");
    }

    /* JADX INFO: renamed from: ֫ */
    public static ByteBuffer m30509(int i, int i2, C14677 c14677) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i * i2).order(ByteOrder.LITTLE_ENDIAN);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 = (i4 + (c14677.readByte() & 255)) & 255;
                byteBufferOrder.put((i5 * i2) + i3, (byte) i4);
            }
        }
        return byteBufferOrder;
    }
}
