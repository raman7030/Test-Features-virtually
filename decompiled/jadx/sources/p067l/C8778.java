package p067l;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.ۜۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes3.dex */
public final class C8778 implements InterfaceC11461 {

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f23821 = {1, 5, 9, 13, 17};

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20308(byte[] bArr, int i) {
        int i2;
        if (i >= 4) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            while (byteBufferWrap.remaining() >= 4) {
                int i3 = byteBufferWrap.getInt();
                if (i3 == 407708164) {
                    return true;
                }
                if ((i3 >>> 4) != 25481893 || byteBufferWrap.remaining() < 4 || byteBufferWrap.remaining() < (i2 = byteBufferWrap.getInt())) {
                    break;
                }
                byteBufferWrap.position(byteBufferWrap.position() + i2);
            }
        }
        return false;
    }

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final long mo20305(InterfaceC9866 interfaceC9866) {
        try {
            interfaceC9866.seek(4L);
            if (C10125.m23599(interfaceC9866.readByte()).m23602(EnumC3419.CONTENT_SIZE)) {
                interfaceC9866.skipBytes(1);
                return interfaceC9866.readLong();
            }
        } catch (RuntimeException unused) {
        }
        return -1L;
    }

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo20306(InputStream inputStream) {
        return new C20855(inputStream);
    }

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final OutputStream mo20307(OutputStream outputStream, int i, long j) {
        return new C22866(outputStream, f23821[i], j);
    }
}
