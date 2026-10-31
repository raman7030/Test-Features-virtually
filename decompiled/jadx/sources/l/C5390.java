package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۚܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 84GI */
/* JADX INFO: loaded from: classes2.dex */
public final class C5390 extends OutputStream {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final OutputStream f16745;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f16747;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C1156 f16749;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte[] f16750 = new byte[16];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f16748 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f16751 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f16746 = true;

    public C5390(OutputStream outputStream, String str, int i, boolean z) {
        this.f16745 = outputStream;
        this.f16747 = z;
        this.f16749 = new C1156(str, i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int iMin = Math.min(16 - this.f16748, i2);
            System.arraycopy(bArr, i, this.f16750, this.f16748, iMin);
            int i3 = this.f16748 + iMin;
            this.f16748 = i3;
            i += iMin;
            i2 -= iMin;
            if (i3 == 16) {
                m15356(false);
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        int i2 = this.f16748;
        int i3 = i2 + 1;
        this.f16748 = i3;
        this.f16750[i2] = (byte) i;
        if (i3 == 16) {
            m15356(false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m15356(boolean z) throws IOException {
        boolean z2 = this.f16746;
        C1156 c1156 = this.f16749;
        OutputStream outputStream = this.f16745;
        if (z2) {
            this.f16746 = false;
            if (this.f16747) {
                byte[] bArr = new byte[8];
                C15972.m37748(6436280820912968781L, 0, bArr);
                outputStream.write(bArr);
            }
            outputStream.write(c1156.m3954());
            outputStream.write(c1156.m3952());
        }
        if (!z && this.f16748 != 16) {
            throw new IllegalStateException();
        }
        int i = this.f16748;
        byte[] bArr2 = this.f16750;
        c1156.m3951(i, bArr2);
        outputStream.write(bArr2, 0, this.f16748);
        this.f16748 = 0;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f16751) {
            return;
        }
        this.f16751 = true;
        int i = this.f16748;
        C1156 c1156 = this.f16749;
        OutputStream outputStream = this.f16745;
        if (i > 0) {
            m15356(true);
        } else if (this.f16746) {
            this.f16746 = false;
            if (this.f16747) {
                byte[] bArr = new byte[8];
                C15972.m37748(6436280820912968781L, 0, bArr);
                outputStream.write(bArr);
            }
            outputStream.write(c1156.m3954());
            outputStream.write(c1156.m3952());
        }
        outputStream.write(c1156.m3953());
        outputStream.close();
    }
}
