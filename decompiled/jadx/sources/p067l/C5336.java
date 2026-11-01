package p067l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۗۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L2QA */
/* JADX INFO: loaded from: classes3.dex */
public class C5336 extends AbstractC12042 {

    /* JADX INFO: renamed from: ۗ */
    public final long f12558;

    /* JADX INFO: renamed from: ۙ */
    public long f12559;

    /* JADX INFO: renamed from: ۫ */
    public boolean f12560;

    /* JADX INFO: renamed from: ۬ */
    public final C21545 f12561;

    /* JADX INFO: renamed from: ᩶ */
    public long f12562;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.f12559 = this.f12562;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        ((FilterInputStream) this).in.reset();
        this.f12562 = this.f12559;
    }

    @Override // p067l.AbstractC12042, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long jSkip;
        long j2 = this.f12558;
        if (j2 >= 0) {
            j = Math.min(j, j2 - m11546());
        }
        jSkip = super.skip(j);
        this.f12562 += jSkip;
        return jSkip;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized long m11546() {
        return this.f12562;
    }

    @Override // p067l.AbstractC12042
    /* JADX INFO: renamed from: ֫ */
    public final synchronized void mo11547(int i) {
        if (i != -1) {
            this.f12562 += (long) i;
        }
        super.mo11547(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m11548() {
        this.f12560 = false;
    }

    @Deprecated
    public C5336(long j, InputStream inputStream) {
        C6677 c6677 = new C6677();
        c6677.m48558(j);
        super(inputStream, c6677);
        this.f12560 = true;
        this.f12562 = 0L;
        this.f12558 = c6677.m48557();
        this.f12560 = c6677.m48560();
        this.f12561 = c6677.m48559();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        if (m11545()) {
            m11546();
            this.f12561.getClass();
            return 0;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // p067l.AbstractC12042, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f12560) {
            super.close();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m11545() {
        long j = this.f12558;
        return j >= 0 && m11546() >= j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return ((FilterInputStream) this).in.markSupported();
    }

    @Override // p067l.AbstractC12042, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (m11545()) {
            m11546();
            this.f12561.getClass();
            return -1;
        }
        return super.read();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // p067l.AbstractC12042, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (m11545()) {
            m11546();
            this.f12561.getClass();
            return -1;
        }
        long jMin = i2;
        long j = this.f12558;
        if (j >= 0) {
            jMin = Math.min(jMin, j - m11546());
        }
        return super.read(bArr, i, (int) jMin);
    }

    public final String toString() {
        return ((FilterInputStream) this).in.toString();
    }
}
