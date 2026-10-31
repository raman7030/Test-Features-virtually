package l;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ᩴۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1QE */
/* JADX INFO: loaded from: classes5.dex */
public final class C18585 extends AbstractC6381 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C7792[] f57648;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public IOException f57649;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public OutputStream f57650;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C3062 f57651;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22112 f57652;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f57653;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f57654;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC5179 f57655;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4265 f57656;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15552 f57657;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final byte[] f57658;

    public C18585(OutputStream outputStream, C10824 c10824) throws IOException {
        C10824[] c10824Arr = {c10824};
        C4265 c4265M12843 = C4265.m12843();
        C22112 c22112 = new C22112();
        this.f57652 = c22112;
        this.f57651 = new C3062();
        this.f57657 = null;
        this.f57649 = null;
        this.f57653 = false;
        this.f57658 = new byte[1];
        this.f57656 = c4265M12843;
        this.f57650 = outputStream;
        this.f57654 = true;
        C10824 c10825 = c10824Arr[0];
        c10825.getClass();
        C7792[] c7792Arr = {new C7792(c10825)};
        this.f57654 = this.f57654;
        C14350.m34246(c7792Arr);
        this.f57648 = c7792Arr;
        c22112.f71787 = 4;
        this.f57655 = AbstractC5179.m14834(4);
        this.f57650.write(C8707.f26510);
        byte[] bArr = {0, (byte) c22112.f71787};
        this.f57650.write(bArr);
        C21407.m48506(bArr, this.f57650);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f57658;
        bArr[0] = (byte) i;
        write(bArr, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        IOException iOException = this.f57649;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f57653) {
            throw new C2357("Stream finished or closed");
        }
        try {
            if (this.f57657 == null) {
                this.f57657 = new C15552(this.f57650, this.f57648, this.f57655, this.f57656);
            }
            this.f57657.write(bArr, i, i2);
        } catch (IOException e) {
            this.f57649 = e;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43116() throws IOException {
        IOException iOException = this.f57649;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f57653) {
            throw new C2357("Stream finished or closed");
        }
        C15552 c15552 = this.f57657;
        if (c15552 != null) {
            try {
                c15552.finish();
                this.f57651.mo9381(this.f57657.m36703(), this.f57657.m36702());
                this.f57657 = null;
            } catch (IOException e) {
                this.f57649 = e;
                throw e;
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        IOException iOException = this.f57649;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f57653) {
            throw new C2357("Stream finished or closed");
        }
        try {
            C15552 c15552 = this.f57657;
            if (c15552 != null) {
                if (this.f57654) {
                    c15552.flush();
                    return;
                } else {
                    m43116();
                    this.f57650.flush();
                    return;
                }
            }
            this.f57650.flush();
        } catch (IOException e) {
            this.f57649 = e;
            throw e;
        }
    }

    @Override // l.AbstractC6381
    public final void finish() throws IOException {
        C3062 c3062 = this.f57651;
        if (this.f57653) {
            return;
        }
        m43116();
        try {
            c3062.m9382(this.f57650);
            byte[] bArr = new byte[6];
            long jM13213 = (c3062.m13213() / 4) - 1;
            for (int i = 0; i < 4; i++) {
                bArr[i] = (byte) (jM13213 >>> (i * 8));
            }
            bArr[4] = 0;
            bArr[5] = (byte) this.f57652.f71787;
            C21407.m48506(bArr, this.f57650);
            this.f57650.write(bArr);
            this.f57650.write(C8707.f26509);
            this.f57653 = true;
        } catch (IOException e) {
            this.f57649 = e;
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f57650 != null) {
            try {
                finish();
            } catch (IOException unused) {
            }
            try {
                this.f57650.close();
            } catch (IOException e) {
                if (this.f57649 == null) {
                    this.f57649 = e;
                }
            }
            this.f57650 = null;
        }
        IOException iOException = this.f57649;
        if (iOException != null) {
            throw iOException;
        }
    }
}
