package p067l;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۖ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4468 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC9866 f10044;

    /* JADX INFO: renamed from: ᩸ */
    public long f10045;

    /* JADX INFO: renamed from: ᩹ */
    public long f10046;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C4468(InterfaceC9866 interfaceC9866, long j, long j2) {
        this.f10044 = interfaceC9866;
        this.f10046 = j;
        this.f10045 = j2;
    }

    @Override // java.io.InputStream
    public final int read() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.f10045;
        if (j <= 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        synchronized (this.f10044) {
            this.f10044.seek(this.f10046);
            i3 = this.f10044.read(bArr, i, i2);
            if (i3 > 0) {
                long j2 = i3;
                this.f10045 -= j2;
                this.f10046 += j2;
            }
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int available() {
        long j = this.f10045;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }
}
