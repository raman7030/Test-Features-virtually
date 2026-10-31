package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ۛۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6RA */
/* JADX INFO: loaded from: classes3.dex */
public final class C5836 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FileChannel f17897;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f17898;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f17899;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final byte[] f17900 = new byte[1];

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C5836(C11481 c11481, FileChannel fileChannel) {
        this.f17897 = fileChannel;
        this.f17898 = c11481.f34290;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f17900;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C11003.checkFromIndexSize(i, i2, bArr.length);
        if (this.f17899) {
            throw new IOException("Recovery attachment stream is closed");
        }
        if (i2 == 0) {
            return 0;
        }
        long j = this.f17898;
        if (j == 0) {
            return -1;
        }
        int i3 = this.f17897.read(ByteBuffer.wrap(bArr, i, (int) Math.min(i2, j)));
        if (i3 <= 0) {
            throw new EOFException("Recovery attachment changed during reading");
        }
        this.f17898 -= (long) i3;
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f17899) {
            return;
        }
        this.f17899 = true;
        this.f17897.close();
    }
}
