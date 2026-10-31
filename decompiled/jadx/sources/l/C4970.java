package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۙ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F2NF */
/* JADX INFO: loaded from: classes3.dex */
public final class C4970 extends AbstractC6381 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final OutputStream f15660;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f15661 = 0;

    public C4970(OutputStream outputStream) {
        this.f15660 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f15660.write(i);
        long j = this.f15661;
        if (j >= 0) {
            this.f15661 = j + 1;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f15660.write(bArr, i, i2);
        long j = this.f15661;
        if (j >= 0) {
            this.f15661 = j + ((long) i2);
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f15660.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f15660.close();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m14426() {
        return this.f15661;
    }
}
