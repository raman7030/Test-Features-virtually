package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܰᩴۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7BB */
/* JADX INFO: loaded from: classes4.dex */
public final class C15677 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩸ */
    public long f45444;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InputStream f45445;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C15677(long j, InputStream inputStream) {
        this.f45445 = inputStream;
        this.f45444 = Math.max(j, 0L);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f45444 <= 0) {
            return -1;
        }
        int i = this.f45445.read();
        if (i != -1) {
            this.f45444--;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f45444;
        if (j <= 0) {
            return -1;
        }
        int i3 = this.f45445.read(bArr, i, (int) Math.min(i2, j));
        if (i3 > 0) {
            this.f45444 -= (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f45445.close();
    }
}
