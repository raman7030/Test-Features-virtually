package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۛۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6RA */
/* JADX INFO: loaded from: classes3.dex */
public final class C7915 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ FileChannel f20749;

    /* JADX INFO: renamed from: ᩶ */
    public long f20750;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f20751;

    /* JADX INFO: renamed from: ᩹ */
    public final byte[] f20752 = new byte[1];

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C7915(C13280 c13280, FileChannel fileChannel) {
        this.f20749 = fileChannel;
        this.f20750 = c13280.f37286;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f20752;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C12826.checkFromIndexSize(i, i2, bArr.length);
        if (this.f20751) {
            throw new IOException("Recovery attachment stream is closed");
        }
        if (i2 == 0) {
            return 0;
        }
        long j = this.f20750;
        if (j == 0) {
            return -1;
        }
        int i3 = this.f20749.read(ByteBuffer.wrap(bArr, i, (int) Math.min(i2, j)));
        if (i3 <= 0) {
            throw new EOFException("Recovery attachment changed during reading");
        }
        this.f20750 -= (long) i3;
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f20751) {
            return;
        }
        this.f20751 = true;
        this.f20749.close();
    }
}
