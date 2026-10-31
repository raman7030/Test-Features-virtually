package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۡᩳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O4DO */
/* JADX INFO: loaded from: classes3.dex */
public final class C9036 extends OutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16090 f27407;

    public C9036(C16090 c16090) {
        this.f27407 = c16090;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        C16090 c16090 = this.f27407;
        if (c16090.f49582) {
            throw new IOException("closed");
        }
        c16090.f49581.m30720writeByte((int) ((byte) i));
        c16090.mo26248();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        C16090 c16090 = this.f27407;
        if (c16090.f49582) {
            throw new IOException("closed");
        }
        c16090.f49581.write(bArr, i, i2);
        c16090.mo26248();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        C16090 c16090 = this.f27407;
        if (c16090.f49582) {
            return;
        }
        c16090.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f27407.close();
    }

    public final String toString() {
        return this.f27407 + ".outputStream()";
    }
}
