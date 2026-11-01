package p067l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۬᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes4.dex */
public final class C15029 extends FilterInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩶ */
    public final long f42935;

    /* JADX INFO: renamed from: ᩸ */
    public final C3237 f42936;

    /* JADX INFO: renamed from: ᩹ */
    public long f42937;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C15029(InputStream inputStream, long j, C3237 c3237) {
        super(inputStream);
        this.f42935 = Math.max(1L, j);
        this.f42936 = c3237;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws C9665, C17850 {
        try {
            int i = super.read();
            if (i != -1) {
                m34402(1);
            }
            return i;
        } catch (IOException e) {
            throw new C9665(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws C9665, C17850 {
        try {
            int i3 = super.read(bArr, i, i2);
            if (i3 > 0) {
                m34402(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new C9665(e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            throw new C9665(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m34402(int i) throws C17850 {
        C3237 c3237 = this.f42936;
        if (c3237.m5590()) {
            throw new C17850();
        }
        long j = this.f42937 + ((long) i);
        this.f42937 = j;
        long j2 = this.f42935;
        c3237.m13477(Math.min(j, j2), j2);
    }
}
