package l;

import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۡ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F2NF */
/* JADX INFO: loaded from: classes3.dex */
public final class C9194 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f27867;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m23627() {
        return this.f27867;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        this.f27867 += (long) i2;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        this.f27867++;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }
}
