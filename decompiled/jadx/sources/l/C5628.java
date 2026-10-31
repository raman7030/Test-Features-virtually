package l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۚ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B2H */
/* JADX INFO: loaded from: classes2.dex */
public final class C5628 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C0521 f17399;

    public C5628(OutputStream outputStream) {
        super(outputStream);
        this.f17399 = new C0521(32768);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        C0521 c0521 = this.f17399;
        if (c0521.f2177 < 32768) {
            c0521.write(i);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        C0521 c0521 = this.f17399;
        int iMin = Math.min(32768 - c0521.f2177, i2);
        if (iMin > 0) {
            c0521.write(bArr, i, iMin);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }
}
