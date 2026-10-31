package l;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ܺ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15613 extends OutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final FileChannel f48080;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f48081;

    public C15613(FileChannel fileChannel, long j) {
        this.f48080 = fileChannel;
        this.f48081 = j;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        long j = this.f48081;
        while (byteBufferWrap.hasRemaining()) {
            int iWrite = this.f48080.write(byteBufferWrap, j);
            if (iWrite <= 0) {
                throw new IOException("FileChannel write made no progress");
            }
            j += (long) iWrite;
        }
        this.f48081 = j;
    }
}
