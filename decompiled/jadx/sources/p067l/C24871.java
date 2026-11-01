package p067l;

import com.github.luben.zstd.Zstd;
import com.github.luben.zstd.ZstdInputStream;
import com.github.luben.zstd.ZstdOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: l.᩻ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes.dex */
public final class C24871 implements InterfaceC11461 {

    /* JADX INFO: renamed from: ֫ */
    public static final int[] f79454 = {-5, -1, 3, 19, 22};

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20308(byte[] bArr, int i) {
        int i2;
        if (i >= 4) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, 0, i);
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            while (byteBufferWrap.remaining() >= 4) {
                int i3 = byteBufferWrap.getInt();
                if (i3 == -47205080) {
                    return true;
                }
                if (i3 != 407710288 || byteBufferWrap.remaining() < 4 || byteBufferWrap.remaining() < (i2 = byteBufferWrap.getInt())) {
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
        byte[] bArr = new byte[(int) Math.min(22L, interfaceC9866.length())];
        interfaceC9866.seek(0L);
        interfaceC9866.readFully(bArr);
        try {
            long frameContentSize = Zstd.getFrameContentSize(bArr);
            if (frameContentSize <= 0) {
                return -1L;
            }
            return frameContentSize;
        } catch (Exception unused) {
            return -1L;
        }
    }

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final InputStream mo20306(InputStream inputStream) {
        return new ZstdInputStream(inputStream);
    }

    @Override // p067l.InterfaceC11461
    /* JADX INFO: renamed from: ֫ */
    public final OutputStream mo20307(OutputStream outputStream, int i, long j) {
        return new ZstdOutputStream(outputStream, f79454[i]);
    }
}
