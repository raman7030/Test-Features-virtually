package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩶᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: QABT */
/* JADX INFO: loaded from: classes4.dex */
public final class C20455 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f65954;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicReference f65955;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0430 f65956;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20455(OutputStream outputStream, C0430 c0430, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        super(outputStream);
        this.f65956 = c0430;
        this.f65954 = atomicBoolean;
        this.f65955 = atomicReference;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(i);
            m46856();
        } catch (IOException e) {
            m46856();
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
            m46856();
        } catch (IOException e) {
            m46856();
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
            m46856();
        } catch (IOException e) {
            m46856();
            throw e;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f65956.isClosed()) {
            m46856();
            return;
        }
        try {
            super.close();
            m46856();
            while (!this.f65954.get()) {
                m46856();
                try {
                    Thread.sleep(1L);
                } catch (InterruptedException unused) {
                    return;
                }
            }
        } catch (IOException e) {
            m46856();
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46856() throws IOException {
        IOException iOException = (IOException) this.f65955.get();
        if (iOException != null) {
            throw new IOException(iOException.getMessage(), iOException);
        }
    }
}
