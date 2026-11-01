package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.᩹ۖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6X3 */
/* JADX INFO: loaded from: classes.dex */
public final class C23271 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final OutputStream f73133;

    public C23271(OutputStream outputStream) {
        this.f73133 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        try {
            this.f73133.write(i);
        } catch (RuntimeException e) {
            throw C14553.m33265(e);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.f73133.write(bArr, i, i2);
        } catch (RuntimeException e) {
            throw C14553.m33265(e);
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.f73133.flush();
        } catch (RuntimeException e) {
            throw C14553.m33265(e);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            this.f73133.close();
        } catch (RuntimeException e) {
            throw C14553.m33265(e);
        }
    }
}
