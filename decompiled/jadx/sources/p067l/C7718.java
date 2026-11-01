package p067l;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۚ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9B2H */
/* JADX INFO: loaded from: classes2.dex */
public final class C7718 extends FilterOutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public C2864 f20243;

    public C7718(OutputStream outputStream) {
        super(outputStream);
        this.f20243 = new C2864(32768);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        ((FilterOutputStream) this).out.write(i);
        C2864 c2864 = this.f20243;
        if (c2864.f4950 < 32768) {
            c2864.write(i);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
        C2864 c2864 = this.f20243;
        int iMin = Math.min(32768 - c2864.f4950, i2);
        if (iMin > 0) {
            c2864.write(bArr, i, iMin);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }
}
