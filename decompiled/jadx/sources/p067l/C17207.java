package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: l.ܺ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17207 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final FileChannel f51219;

    /* JADX INFO: renamed from: ᩹ */
    public long f51220;

    public C17207(FileChannel fileChannel, long j) {
        this.f51219 = fileChannel;
        this.f51220 = j;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        long j = this.f51220;
        while (byteBufferWrap.hasRemaining()) {
            int iWrite = this.f51219.write(byteBufferWrap, j);
            if (iWrite <= 0) {
                throw new IOException("FileChannel write made no progress");
            }
            j += (long) iWrite;
        }
        this.f51220 = j;
    }
}
