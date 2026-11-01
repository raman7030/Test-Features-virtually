package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8BF */
/* JADX INFO: loaded from: classes2.dex */
public final class C5975 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public C22866 f14783;

    /* JADX INFO: renamed from: ᩹ */
    public final OutputStream f14784;

    public C5975(OutputStream outputStream) {
        this.f14784 = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (this.f14783 == null) {
            this.f14783 = new C22866(this.f14784);
        }
        this.f14783.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return;
        }
        if (this.f14783 == null) {
            this.f14783 = new C22866(this.f14784);
        }
        this.f14783.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        C22866 c22866 = this.f14783;
        if (c22866 != null) {
            c22866.flush();
        } else {
            this.f14784.flush();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C22866 c22866 = this.f14783;
        if (c22866 != null) {
            c22866.close();
        } else {
            this.f14784.close();
        }
    }
}
