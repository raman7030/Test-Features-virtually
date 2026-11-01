package p067l;

import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۡ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F2NF */
/* JADX INFO: loaded from: classes3.dex */
public final class C11107 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public long f30806;

    /* JADX INFO: renamed from: ֫ */
    public final long m25580() {
        return this.f30806;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.f30806 += (long) i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        this.f30806++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }
}
