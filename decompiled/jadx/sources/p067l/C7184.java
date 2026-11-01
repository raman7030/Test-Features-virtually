package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۚۖܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54YN */
/* JADX INFO: loaded from: classes3.dex */
public final class C7184 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC9866 f18772;

    /* JADX INFO: renamed from: ᩸ */
    public long f18773;

    /* JADX INFO: renamed from: ᩹ */
    public long f18774 = -1;

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f18774 = this.f18773;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        long j = this.f18774;
        if (j < 0) {
            throw new IOException("Resetting to invalid mark");
        }
        this.f18773 = j;
    }

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C7184(long j, C24618 c24618) {
        this.f18773 = j;
        this.f18772 = c24618;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.f18773;
        InterfaceC9866 interfaceC9866 = this.f18772;
        interfaceC9866.seek(j);
        this.f18773++;
        return interfaceC9866.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        long j = this.f18773;
        InterfaceC9866 interfaceC9866 = this.f18772;
        interfaceC9866.seek(j);
        int i = interfaceC9866.read(bArr);
        if (i > 0) {
            this.f18773 += (long) i;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.f18773;
        InterfaceC9866 interfaceC9866 = this.f18772;
        interfaceC9866.seek(j);
        int i3 = interfaceC9866.read(bArr, i, i2);
        if (i3 > 0) {
            this.f18773 += (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long jMin = Math.min((int) j, available());
        this.f18773 += jMin;
        return jMin;
    }

    @Override // java.io.InputStream
    public final int available() {
        long length = this.f18772.length() - this.f18773;
        if (length > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) length;
    }
}
