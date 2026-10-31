package l;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۢܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46W4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9685 extends FilterInputStream implements InterfaceC14905 {
    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C9685(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Content search canceled.");
        }
        return ((FilterInputStream) this).in.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Content search canceled.");
        }
        return ((FilterInputStream) this).in.read(bArr, i, i2);
    }
}
