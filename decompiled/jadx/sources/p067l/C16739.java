package p067l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܶۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95GT */
/* JADX INFO: loaded from: classes4.dex */
public final class C16739 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C22776 f49356;

    /* JADX INFO: renamed from: ᩸ */
    public int f49357;

    /* JADX INFO: renamed from: ᩹ */
    public int f49358;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C16739(C22776 c22776, int i) {
        this.f49356 = c22776;
        this.f49358 = i;
        this.f49357 = i;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.f49358;
        C22776 c22776 = this.f49356;
        if (i >= c22776.f71794) {
            return -1;
        }
        byte[] bArr = c22776.f71793;
        int i2 = this.f49358;
        this.f49358 = i2 + 1;
        return bArr[i2];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int length = bArr.length;
        C22776 c22776 = this.f49356;
        int iMin = Math.min(length, c22776.f71794 - this.f49358);
        if (iMin <= 0) {
            return this.f49358 >= c22776.f71794 ? -1 : 0;
        }
        System.arraycopy(c22776.f71793, this.f49358, bArr, 0, iMin);
        this.f49358 += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C22776 c22776 = this.f49356;
        int iMin = Math.min(i2, c22776.f71794 - this.f49358);
        if (iMin <= 0) {
            return this.f49358 >= c22776.f71794 ? -1 : 0;
        }
        System.arraycopy(c22776.f71793, this.f49358, bArr, i, iMin);
        this.f49358 += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int iMax = (int) Math.max(0L, Math.min(j, this.f49356.f71794 - this.f49358));
        this.f49358 += iMax;
        return iMax;
    }

    @Override // java.io.InputStream
    public final int available() {
        return Math.max(0, this.f49356.f71794 - this.f49358);
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f49357 = this.f49358;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f49358 = this.f49357;
    }
}
