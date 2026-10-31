package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۗۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L2QA */
/* JADX INFO: loaded from: classes3.dex */
public class C3123 extends AbstractC10179 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final long f9755;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f9756;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f9757;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C20177 f9758;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f9759;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f9756 = this.f9759;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        ((FilterInputStream) this).in.reset();
        this.f9759 = this.f9756;
    }

    @Override // l.AbstractC10179, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long jSkip;
        long j2 = this.f9755;
        if (j2 >= 0) {
            j = Math.min(j, j2 - m9503());
        }
        jSkip = super.skip(j);
        this.f9759 += jSkip;
        return jSkip;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized long m9503() {
        return this.f9759;
    }

    @Override // l.AbstractC10179
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void mo9504(int i) {
        if (i != -1) {
            this.f9759 += (long) i;
        }
        super.mo9504(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m9505() {
        this.f9757 = false;
    }

    @Deprecated
    public C3123(long j, InputStream inputStream) {
        C4534 c4534 = new C4534();
        c4534.m46242(j);
        super(inputStream, c4534);
        this.f9757 = true;
        this.f9759 = 0L;
        this.f9755 = c4534.m46241();
        this.f9757 = c4534.m46244();
        this.f9758 = c4534.m46243();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (m9502()) {
            m9503();
            this.f9758.getClass();
            return 0;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // l.AbstractC10179, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f9757) {
            super.close();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m9502() {
        long j = this.f9755;
        return j >= 0 && m9503() >= j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // l.AbstractC10179, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (m9502()) {
            m9503();
            this.f9758.getClass();
            return -1;
        }
        return super.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // l.AbstractC10179, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (m9502()) {
            m9503();
            this.f9758.getClass();
            return -1;
        }
        long jMin = i2;
        long j = this.f9755;
        if (j >= 0) {
            jMin = Math.min(jMin, j - m9503());
        }
        return super.read(bArr, i, (int) jMin);
    }

    public final String toString() {
        return ((FilterInputStream) this).in.toString();
    }
}
