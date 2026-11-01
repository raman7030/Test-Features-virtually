package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۤ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6S5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12372 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ FileChannel f34514;

    /* JADX INFO: renamed from: ᩶ */
    public long f34515;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f34516;

    /* JADX INFO: renamed from: ᩹ */
    public final byte[] f34517 = new byte[1];

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C12372(C14383 c14383, FileChannel fileChannel) {
        this.f34514 = fileChannel;
        this.f34515 = c14383.f41112;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f34517;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C12826.checkFromIndexSize(i, i2, bArr.length);
        if (this.f34516) {
            throw new IOException("Migration state stream is closed");
        }
        if (i2 == 0) {
            return 0;
        }
        long j = this.f34515;
        if (j == 0) {
            return -1;
        }
        int i3 = this.f34514.read(ByteBuffer.wrap(bArr, i, (int) Math.min(i2, j)));
        if (i3 <= 0) {
            throw new EOFException("Migration state changed during reading");
        }
        this.f34515 -= (long) i3;
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f34516) {
            return;
        }
        this.f34516 = true;
        this.f34514.close();
    }
}
