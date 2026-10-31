package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩵ܺܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W144 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19570 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f63255;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C19570(ByteBuffer byteBuffer) {
        this.f63255 = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f63255;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.f63255;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }
}
