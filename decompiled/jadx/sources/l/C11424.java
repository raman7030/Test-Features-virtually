package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۨۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87M */
/* JADX INFO: loaded from: classes3.dex */
public final class C11424 extends OutputStream {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC10405 f34168;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CountDownLatch f34169;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f34170;

    public C11424(AtomicReference atomicReference, InterfaceC10405 interfaceC10405, CountDownLatch countDownLatch) {
        this.f34170 = atomicReference;
        this.f34168 = interfaceC10405;
        this.f34169 = countDownLatch;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m28233() throws IOException {
        IOException iOException = (IOException) this.f34170.get();
        if (iOException != null) {
            throw new IOException(iOException.getMessage(), iOException);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m28233();
        this.f34168.writeByte(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m28233();
        this.f34168.mo26252(i, i2, bArr);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m28233();
        this.f34168.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m28233();
        this.f34168.close();
        try {
            this.f34169.await();
        } catch (InterruptedException unused) {
        }
        m28233();
    }
}
