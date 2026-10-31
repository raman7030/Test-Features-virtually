package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܰᩴۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7BB */
/* JADX INFO: loaded from: classes4.dex */
public final class C14003 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f42361;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InputStream f42362;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C14003(long j, InputStream inputStream) {
        this.f42362 = inputStream;
        this.f42361 = Math.max(j, 0L);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.f42361 <= 0) {
            return -1;
        }
        int i = this.f42362.read();
        if (i != -1) {
            this.f42361--;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f42361;
        if (j <= 0) {
            return -1;
        }
        int i3 = this.f42362.read(bArr, i, (int) Math.min(i2, j));
        if (i3 > 0) {
            this.f42361 -= (long) i3;
        }
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f42362.close();
    }
}
