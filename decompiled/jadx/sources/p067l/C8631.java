package p067l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۜۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 21TH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8631 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۛ */
    public final C23383 f23178;

    /* JADX INFO: renamed from: ۤ */
    public final int f23179;

    /* JADX INFO: renamed from: ۬ */
    public InputStream f23182;

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC7290 f23183;

    /* JADX INFO: renamed from: ᩸ */
    public final C6422 f23184;

    /* JADX INFO: renamed from: ᩺ */
    public final boolean f23186;

    /* JADX INFO: renamed from: ᩹ */
    public C10445 f23185 = null;

    /* JADX INFO: renamed from: ۫ */
    public final C14665 f23181 = new C14665();

    /* JADX INFO: renamed from: ۙ */
    public boolean f23177 = false;

    /* JADX INFO: renamed from: ۗ */
    public IOException f23176 = null;

    /* JADX INFO: renamed from: ۨ */
    public final byte[] f23180 = new byte[1];

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C8631(InputStream inputStream, int i, boolean z, byte[] bArr, C6422 c6422) throws C17347, C23856, C11314 {
        this.f23184 = c6422;
        this.f23182 = inputStream;
        this.f23179 = i;
        this.f23186 = z;
        C23383 c23383M37754 = C16676.m37754(bArr);
        this.f23178 = c23383M37754;
        this.f23183 = AbstractC7290.m16744(c23383M37754.f74509);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f23180;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        if (this.f23182 == null) {
            throw new C4608("Stream closed");
        }
        IOException iOException = this.f23176;
        if (iOException != null) {
            throw iOException;
        }
        if (this.f23177) {
            return -1;
        }
        int i4 = 0;
        while (i2 > 0) {
            try {
                C10445 c10445 = this.f23185;
                C14665 c14665 = this.f23181;
                if (c10445 == null) {
                    try {
                        this.f23185 = new C10445(this.f23182, this.f23183, this.f23186, this.f23179, this.f23184);
                    } catch (C13798 unused) {
                        c14665.m33531(this.f23182);
                        m20049();
                        this.f23177 = true;
                        if (i4 > 0) {
                            return i4;
                        }
                        return -1;
                    }
                }
                int i5 = this.f23185.read(bArr, i, i2);
                if (i5 > 0) {
                    i4 += i5;
                    i += i5;
                    i2 -= i5;
                } else if (i5 == -1) {
                    c14665.mo11423(this.f23185.m24164(), this.f23185.m24163());
                    this.f23185 = null;
                }
            } catch (IOException e) {
                this.f23176 = e;
                if (i4 == 0) {
                    throw e;
                }
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m20049() throws IOException {
        byte[] bArr = new byte[12];
        new DataInputStream(this.f23182).readFully(bArr);
        C23383 c23383M37752 = C16676.m37752(bArr);
        if (this.f23178.f74509 != c23383M37752.f74509 || this.f23181.m15095() != c23383M37752.f74508) {
            throw new C23856("XZ Stream Footer does not match Stream Header");
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f23182 == null) {
            throw new C4608("Stream closed");
        }
        IOException iOException = this.f23176;
        if (iOException != null) {
            throw iOException;
        }
        C10445 c10445 = this.f23185;
        if (c10445 == null) {
            return 0;
        }
        return c10445.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m20050(true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20050(boolean z) {
        if (this.f23182 != null) {
            C10445 c10445 = this.f23185;
            if (c10445 != null) {
                c10445.close();
                this.f23185 = null;
            }
            if (z) {
                try {
                    this.f23182.close();
                } finally {
                    this.f23182 = null;
                }
            }
        }
    }
}
