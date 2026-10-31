package l;

import java.io.IOException;
import java.io.OutputStream;
import net.sf.sevenzipjbinding.NativeXZOutputStream;

/* JADX INFO: renamed from: l.ۡۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes3.dex */
public final class C8861 extends OutputStream implements InterfaceC0687 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f26977;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f26978;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f26979;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f26980;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final NativeXZOutputStream f26981;

    public C8861(NativeXZOutputStream nativeXZOutputStream, long j) {
        this.f26981 = nativeXZOutputStream;
        this.f26978 = j;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f26981.write(i);
        m22885(1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f26981.write(bArr, i, i2);
        m22885(i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f26981.flush();
        this.f26980 = this.f26977;
        this.f26979 = 0L;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f26981.close();
        this.f26980 = this.f26977;
        this.f26979 = 0L;
    }

    @Override // l.InterfaceC0687
    /* JADX INFO: renamed from: ֫ */
    public final long mo2776() {
        return this.f26980;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22885(int i) throws IOException {
        long j = i;
        this.f26977 += j;
        long j2 = this.f26979 + j;
        long j3 = j2 - (j2 % 1048576);
        this.f26980 += j3;
        this.f26979 = j2 - j3;
        long j4 = this.f26978;
        if (j4 <= 0) {
            return;
        }
        if (j >= j4) {
            this.f26978 = 0L;
            this.f26981.flush();
            this.f26980 = this.f26977;
            this.f26979 = 0L;
            return;
        }
        this.f26978 = j4 - j;
    }
}
