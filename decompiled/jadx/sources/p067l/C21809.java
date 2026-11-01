package p067l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩶᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: QABT */
/* JADX INFO: loaded from: classes4.dex */
public final class C21809 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AtomicBoolean f68630;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AtomicReference f68631;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C2777 f68632;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21809(OutputStream outputStream, C2777 c2777, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        super(outputStream);
        this.f68632 = c2777;
        this.f68630 = atomicBoolean;
        this.f68631 = atomicReference;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(i);
            m49179();
        } catch (IOException e) {
            m49179();
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
            m49179();
        } catch (IOException e) {
            m49179();
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
            m49179();
        } catch (IOException e) {
            m49179();
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f68632.isClosed()) {
            m49179();
            return;
        }
        try {
            super.close();
            m49179();
            while (!this.f68630.get()) {
                m49179();
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException unused) {
                    return;
                }
            }
        } catch (IOException e) {
            m49179();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49179() throws IOException {
        IOException iOException = (IOException) this.f68631.get();
        if (iOException != null) {
            throw new IOException(iOException.getMessage(), iOException);
        }
    }
}
