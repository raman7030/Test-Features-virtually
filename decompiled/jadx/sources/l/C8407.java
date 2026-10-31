package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠᩶ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N17O */
/* JADX INFO: loaded from: classes3.dex */
public final class C8407 extends OutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5585 f25762;

    public C8407(C5585 c5585) {
        this.f25762 = c5585;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f25762.m15871(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f25762.m15872();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f25762.m15867();
    }
}
