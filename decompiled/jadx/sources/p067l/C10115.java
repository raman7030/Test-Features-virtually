package p067l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۠ۨۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6MT */
/* JADX INFO: loaded from: classes3.dex */
public final class C10115 extends FilterInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩶ */
    public final long f28052;

    /* JADX INFO: renamed from: ᩸ */
    public long f28053;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f28054;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C10115(InputStream inputStream) {
        super(inputStream);
        this.f28052 = 268435456L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        m23591();
        int i = ((FilterInputStream) this).in.read();
        if (i >= 0) {
            m23590(1L);
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        m23591();
        InputStream inputStream = ((FilterInputStream) this).in;
        long j = i2;
        long j2 = this.f28052 - this.f28053;
        if (j2 != C14849.FOREVER_NS) {
            j2++;
        }
        int i3 = inputStream.read(bArr, i, (int) Math.min(j, j2));
        if (i3 > 0) {
            m23590(i3);
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        m23591();
        InputStream inputStream = ((FilterInputStream) this).in;
        long j2 = this.f28052 - this.f28053;
        if (j2 != C14849.FOREVER_NS) {
            j2++;
        }
        long jSkip = inputStream.skip(Math.min(j, j2));
        if (jSkip > 0) {
            m23590(jSkip);
        }
        return jSkip;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m23590(long j) throws IOException {
        long j2 = this.f28053;
        if (j > this.f28052 - j2) {
            this.f28054 = true;
        } else {
            this.f28053 = j2 + j;
        }
        m23591();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23591() throws IOException {
        if (this.f28054) {
            throw new IOException("Image input exceeds byte limit");
        }
    }
}
