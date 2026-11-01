package p067l;

import java.io.IOException;
import java.io.OutputStream;
import net.p069sf.sevenzipjbinding.NativeXZOutputStream;

/* JADX INFO: renamed from: l.ۡۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8CE */
/* JADX INFO: loaded from: classes3.dex */
public final class C10790 extends OutputStream implements InterfaceC3022 {

    /* JADX INFO: renamed from: ۗ */
    public long f29900;

    /* JADX INFO: renamed from: ۙ */
    public long f29901;

    /* JADX INFO: renamed from: ᩶ */
    public long f29902;

    /* JADX INFO: renamed from: ᩸ */
    public long f29903;

    /* JADX INFO: renamed from: ᩹ */
    public final NativeXZOutputStream f29904;

    public C10790(NativeXZOutputStream nativeXZOutputStream, long j) {
        this.f29904 = nativeXZOutputStream;
        this.f29901 = j;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f29904.write(i);
        m24856(1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f29904.write(bArr, i, i2);
        m24856(i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f29904.flush();
        this.f29903 = this.f29900;
        this.f29902 = 0L;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f29904.close();
        this.f29903 = this.f29900;
        this.f29902 = 0L;
    }

    @Override // p067l.InterfaceC3022
    /* JADX INFO: renamed from: ֫ */
    public final long mo5115() {
        return this.f29903;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m24856(int i) throws IOException {
        long j = i;
        this.f29900 += j;
        long j2 = this.f29902 + j;
        long j3 = j2 - (j2 % 1048576);
        this.f29903 += j3;
        this.f29902 = j2 - j3;
        long j4 = this.f29901;
        if (j4 <= 0) {
            return;
        }
        if (j >= j4) {
            this.f29901 = 0L;
            this.f29904.flush();
            this.f29903 = this.f29900;
            this.f29902 = 0L;
            return;
        }
        this.f29901 = j4 - j;
    }
}
