package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.۫ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54G6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14196 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۙ */
    public long f40458;

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f40459;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC9866 f40460;

    /* JADX INFO: renamed from: ᩹ */
    public long f40461;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C14196(InterfaceC9866 interfaceC9866, long j, long j2, boolean z) {
        this.f40460 = interfaceC9866;
        this.f40459 = z;
        this.f40458 = j2;
        this.f40461 = j;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i;
        long j = this.f40458;
        this.f40458 = j - 1;
        if (j <= 0) {
            return -1;
        }
        synchronized (this.f40460) {
            try {
                try {
                    InterfaceC9866 interfaceC9866 = this.f40460;
                    long j2 = this.f40461;
                    this.f40461 = 1 + j2;
                    interfaceC9866.seek(j2);
                    i = this.f40460.read();
                } catch (IOException e) {
                    if (this.f40459 && !(e instanceof EOFException) && !(e instanceof InterruptedIOException)) {
                        throw new C15536(e.getMessage(), e);
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
        return (int) (this.f40458 & 2147483647L);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.f40458;
        if (j <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        synchronized (this.f40460) {
            try {
                this.f40460.seek(this.f40461);
                i3 = this.f40460.read(bArr, i, i2);
            } catch (IOException e) {
                if (this.f40459 && !(e instanceof EOFException) && !(e instanceof InterruptedIOException)) {
                    throw new C15536(e.getMessage(), e);
                }
                throw e;
            }
        }
        if (i3 > 0) {
            long j2 = i3;
            this.f40461 += j2;
            this.f40458 -= j2;
        }
        return i3;
    }
}
