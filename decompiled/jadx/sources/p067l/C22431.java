package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩷᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6SP */
/* JADX INFO: loaded from: classes5.dex */
public final class C22431 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C11702 f70779;

    /* JADX INFO: renamed from: ᩶ */
    public long f70780;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f70781;

    /* JADX INFO: renamed from: ᩹ */
    public final byte[] f70782 = new byte[1];

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C22431(C11702 c11702) {
        this.f70779 = c11702;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f70782;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C12826.checkFromIndexSize(i, i2, bArr.length);
        C11702 c11702 = this.f70779;
        C11031 c11031 = c11702.f32629;
        C11031.m25428(c11031);
        if (this.f70781) {
            throw new IOException("Legacy state slice is closed");
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f70780 == c11702.f32627) {
            return -1;
        }
        int i3 = c11031.f30550.read(ByteBuffer.wrap(bArr, i, (int) Math.min(i2, c11702.f32627 - this.f70780)), c11702.f32628 + this.f70780);
        if (i3 <= 0) {
            throw new EOFException("Legacy state slice is truncated");
        }
        this.f70780 += (long) i3;
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f70781 = true;
    }
}
