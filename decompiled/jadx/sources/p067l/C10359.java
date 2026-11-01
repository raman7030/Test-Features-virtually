package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes3.dex */
public final class C10359 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final C7677 f28675;

    public C10359(C7677 c7677) {
        this.f28675 = c7677;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f28675.m17786(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f28675.m17787();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f28675.m17782();
    }
}
