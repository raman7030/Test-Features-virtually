package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۫ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54G6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12445 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f37441;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f37442;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC7889 f37443;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f37444;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C12445(InterfaceC7889 interfaceC7889, long j, long j2, boolean z) {
        this.f37443 = interfaceC7889;
        this.f37442 = z;
        this.f37441 = j2;
        this.f37444 = j;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i;
        long j = this.f37441;
        this.f37441 = j - 1;
        if (j <= 0) {
            return -1;
        }
        synchronized (this.f37443) {
            try {
                try {
                    InterfaceC7889 interfaceC7889 = this.f37443;
                    long j2 = this.f37444;
                    this.f37444 = 1 + j2;
                    interfaceC7889.seek(j2);
                    i = this.f37443.read();
                } catch (IOException e) {
                    if (this.f37442 && !(e instanceof EOFException) && !(e instanceof InterruptedIOException)) {
                        throw new C13855(e.getMessage(), e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) (this.f37441 & 2147483647L);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.f37441;
        if (j <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        synchronized (this.f37443) {
            try {
                this.f37443.seek(this.f37444);
                i3 = this.f37443.read(bArr, i, i2);
            } catch (IOException e) {
                if (this.f37442 && !(e instanceof EOFException) && !(e instanceof InterruptedIOException)) {
                    throw new C13855(e.getMessage(), e);
                }
                throw e;
            }
        }
        if (i3 > 0) {
            long j2 = i3;
            this.f37444 += j2;
            this.f37441 -= j2;
        }
        return i3;
    }
}
