package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۨۖ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Q87M */
/* JADX INFO: loaded from: classes3.dex */
public final class C13226 extends OutputStream {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ InterfaceC12257 f37164;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ CountDownLatch f37165;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AtomicReference f37166;

    public C13226(AtomicReference atomicReference, InterfaceC12257 interfaceC12257, CountDownLatch countDownLatch) {
        this.f37166 = atomicReference;
        this.f37164 = interfaceC12257;
        this.f37165 = countDownLatch;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m30277() throws IOException {
        IOException iOException = (IOException) this.f37166.get();
        if (iOException != null) {
            throw new IOException(iOException.getMessage(), iOException);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m30277();
        this.f37164.writeByte(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m30277();
        this.f37164.mo28281(i, i2, bArr);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m30277();
        this.f37164.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m30277();
        this.f37164.close();
        try {
            this.f37165.await();
        } catch (InterruptedException unused) {
        }
        m30277();
    }
}
