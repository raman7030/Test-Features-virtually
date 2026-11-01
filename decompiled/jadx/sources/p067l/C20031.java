package p067l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩴۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1QE */
/* JADX INFO: loaded from: classes5.dex */
public final class C20031 extends AbstractC8433 {

    /* JADX INFO: renamed from: ۗ */
    public C9774[] f60871;

    /* JADX INFO: renamed from: ۙ */
    public IOException f60872;

    /* JADX INFO: renamed from: ۛ */
    public OutputStream f60873;

    /* JADX INFO: renamed from: ۤ */
    public final C5278 f60874;

    /* JADX INFO: renamed from: ۨ */
    public final C23383 f60875;

    /* JADX INFO: renamed from: ۫ */
    public boolean f60876;

    /* JADX INFO: renamed from: ۬ */
    public boolean f60877;

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC7290 f60878;

    /* JADX INFO: renamed from: ᩸ */
    public final C6422 f60879;

    /* JADX INFO: renamed from: ᩹ */
    public C17149 f60880;

    /* JADX INFO: renamed from: ᩺ */
    public final byte[] f60881;

    public C20031(OutputStream outputStream, C12655 c12655) throws IOException {
        C12655[] c12655Arr = {c12655};
        C6422 c6422M14707 = C6422.m14707();
        C23383 c23383 = new C23383();
        this.f60875 = c23383;
        this.f60874 = new C5278();
        this.f60880 = null;
        this.f60872 = null;
        this.f60876 = false;
        this.f60881 = new byte[1];
        this.f60879 = c6422M14707;
        this.f60873 = outputStream;
        this.f60877 = true;
        C12655 c12656 = c12655Arr[0];
        c12656.getClass();
        C9774[] c9774Arr = {new C9774(c12656)};
        this.f60877 = this.f60877;
        C16006.m36379(c9774Arr);
        this.f60871 = c9774Arr;
        c23383.f74509 = 4;
        this.f60878 = AbstractC7290.m16744(4);
        this.f60873.write(C10643.f29435);
        byte[] bArr = {0, (byte) c23383.f74509};
        this.f60873.write(bArr);
        C22713.m50842(bArr, this.f60873);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f60881;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f60872;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f60876) {
            throw new C4608("Stream finished or closed");
        }
        try {
            if (this.f60880 == null) {
                this.f60880 = new C17149(this.f60873, this.f60871, this.f60878, this.f60879);
            }
            this.f60880.write(bArr, i, i2);
        } catch (IOException e) {
            this.f60872 = e;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45394() throws IOException {
        IOException iOException = this.f60872;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f60876) {
            throw new C4608("Stream finished or closed");
        }
        C17149 c17149 = this.f60880;
        if (c17149 != null) {
            try {
                c17149.finish();
                this.f60874.mo11423(this.f60880.m38864(), this.f60880.m38863());
                this.f60880 = null;
            } catch (IOException e) {
                this.f60872 = e;
                throw e;
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        IOException iOException = this.f60872;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f60876) {
            throw new C4608("Stream finished or closed");
        }
        try {
            C17149 c17149 = this.f60880;
            if (c17149 != null) {
                if (this.f60877) {
                    c17149.flush();
                    return;
                } else {
                    m45394();
                    this.f60873.flush();
                    return;
                }
            }
            this.f60873.flush();
        } catch (IOException e) {
            this.f60872 = e;
            throw e;
        }
    }

    @Override // p067l.AbstractC8433
    public final void finish() throws IOException {
        C5278 c5278 = this.f60874;
        if (this.f60876) {
            return;
        }
        m45394();
        try {
            c5278.m11424(this.f60873);
            byte[] bArr = new byte[6];
            long jM15095 = (c5278.m15095() / 4) - 1;
            for (int i = 0; i < 4; i++) {
                bArr[i] = (byte) (jM15095 >>> (i * 8));
            }
            bArr[4] = 0;
            bArr[5] = (byte) this.f60875.f74509;
            C22713.m50842(bArr, this.f60873);
            this.f60873.write(bArr);
            this.f60873.write(C10643.f29434);
            this.f60876 = true;
        } catch (IOException e) {
            this.f60872 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f60873 != null) {
            try {
                finish();
            } catch (IOException unused) {
            }
            try {
                this.f60873.close();
            } catch (IOException e) {
                if (this.f60872 == null) {
                    this.f60872 = e;
                }
            }
            this.f60873 = null;
        }
        IOException iOException = this.f60872;
        if (iOException != null) {
            throw iOException;
        }
    }
}
