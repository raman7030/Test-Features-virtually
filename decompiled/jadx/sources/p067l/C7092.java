package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۙ᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F2NF */
/* JADX INFO: loaded from: classes3.dex */
public final class C7092 extends AbstractC8433 {

    /* JADX INFO: renamed from: ᩸ */
    public final OutputStream f18494;

    /* JADX INFO: renamed from: ᩹ */
    public long f18495 = 0;

    public C7092(OutputStream outputStream) {
        this.f18494 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f18494.write(i);
        long j = this.f18495;
        if (j >= 0) {
            this.f18495 = j + 1;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f18494.write(bArr, i, i2);
        long j = this.f18495;
        if (j >= 0) {
            this.f18495 = j + ((long) i2);
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f18494.flush();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f18494.close();
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m16330() {
        return this.f18495;
    }
}
