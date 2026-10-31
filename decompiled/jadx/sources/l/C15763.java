package l;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܺۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: V9OM */
/* JADX INFO: loaded from: classes4.dex */
public final class C15763 extends FilterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f48598;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C15763(InputStream inputStream, int i) {
        super(inputStream);
        this.f48598 = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f48598);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f48598 <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.f48598--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f48598;
        if (i3 <= 0) {
            return -1;
        }
        int i4 = super.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            this.f48598 -= i4;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        int iSkip = (int) super.skip(Math.min(j, this.f48598));
        if (iSkip >= 0) {
            this.f48598 -= iSkip;
        }
        return iSkip;
    }
}
