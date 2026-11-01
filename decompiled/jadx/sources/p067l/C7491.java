package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۚܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GI */
/* JADX INFO: loaded from: classes2.dex */
public final class C7491 extends OutputStream {

    /* JADX INFO: renamed from: ۗ */
    public final OutputStream f19583;

    /* JADX INFO: renamed from: ۫ */
    public final boolean f19585;

    /* JADX INFO: renamed from: ᩶ */
    public final C3467 f19587;

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f19588 = new byte[16];

    /* JADX INFO: renamed from: ۬ */
    public int f19586 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f19589 = false;

    /* JADX INFO: renamed from: ۙ */
    public boolean f19584 = true;

    public C7491(OutputStream outputStream, String str, int i, boolean z) {
        this.f19583 = outputStream;
        this.f19585 = z;
        this.f19587 = new C3467(str, i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int iMin = Math.min(16 - this.f19586, i2);
            System.arraycopy(bArr, i, this.f19588, this.f19586, iMin);
            int i3 = this.f19586 + iMin;
            this.f19586 = i3;
            i += iMin;
            i2 -= iMin;
            if (i3 == 16) {
                m17267(false);
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        int i2 = this.f19586;
        int i3 = i2 + 1;
        this.f19586 = i3;
        this.f19588[i2] = (byte) i;
        if (i3 == 16) {
            m17267(false);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m17267(boolean z) throws IOException {
        boolean z2 = this.f19584;
        C3467 c3467 = this.f19587;
        OutputStream outputStream = this.f19583;
        if (z2) {
            this.f19584 = false;
            if (this.f19585) {
                byte[] bArr = new byte[8];
                C17548.m39932(6436280820912968781L, 0, bArr);
                outputStream.write(bArr);
            }
            outputStream.write(c3467.m6195());
            outputStream.write(c3467.m6193());
        }
        if (!z && this.f19586 != 16) {
            throw new IllegalStateException();
        }
        int i = this.f19586;
        byte[] bArr2 = this.f19588;
        c3467.m6192(i, bArr2);
        outputStream.write(bArr2, 0, this.f19586);
        this.f19586 = 0;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f19589) {
            return;
        }
        this.f19589 = true;
        int i = this.f19586;
        C3467 c3467 = this.f19587;
        OutputStream outputStream = this.f19583;
        if (i > 0) {
            m17267(true);
        } else if (this.f19584) {
            this.f19584 = false;
            if (this.f19585) {
                byte[] bArr = new byte[8];
                C17548.m39932(6436280820912968781L, 0, bArr);
                outputStream.write(bArr);
            }
            outputStream.write(c3467.m6195());
            outputStream.write(c3467.m6193());
        }
        outputStream.write(c3467.m6194());
        outputStream.close();
    }
}
