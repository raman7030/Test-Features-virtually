package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A1S8 */
/* JADX INFO: loaded from: classes3.dex */
public class C3768 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f11881;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream f11882;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C6590 f11883;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f11884;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final byte[] f11885;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public IOException f11886;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C4265 f11887;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f11888;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C3768(InputStream inputStream) throws IOException {
        C4265 c4265M12843 = C4265.m12843();
        this.f11888 = false;
        this.f11886 = null;
        this.f11885 = new byte[1];
        this.f11887 = c4265M12843;
        this.f11882 = inputStream;
        this.f11881 = -1;
        this.f11884 = true;
        byte[] bArr = new byte[12];
        new DataInputStream(inputStream).readFully(bArr);
        this.f11883 = new C6590(inputStream, -1, true, bArr, c4265M12843);
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f11885;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i2 < 0 || (i3 = i + i2) < 0 || i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = 0;
        if (i2 == 0) {
            return 0;
        }
        if (this.f11882 == null) {
            throw new C2357("Stream closed");
        }
        IOException iOException = this.f11886;
        if (iOException != null) {
            throw iOException;
        }
        if (!this.f11888) {
            while (i2 > 0) {
                try {
                    if (this.f11883 == null) {
                        m11421();
                        if (this.f11888) {
                            if (i4 == 0) {
                            }
                        }
                    }
                    int i5 = this.f11883.read(bArr, i, i2);
                    if (i5 > 0) {
                        i4 += i5;
                        i += i5;
                        i2 -= i5;
                    } else if (i5 == -1) {
                        this.f11883 = null;
                    }
                } catch (IOException e) {
                    this.f11886 = e;
                    if (i4 == 0) {
                        throw e;
                    }
                }
            }
            return i4;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11421() throws IOException {
        DataInputStream dataInputStream = new DataInputStream(this.f11882);
        byte[] bArr = new byte[12];
        while (dataInputStream.read(bArr, 0, 1) != -1) {
            dataInputStream.readFully(bArr, 1, 3);
            if (bArr[0] != 0 || bArr[1] != 0 || bArr[2] != 0 || bArr[3] != 0) {
                dataInputStream.readFully(bArr, 4, 8);
                try {
                    this.f11883 = new C6590(this.f11882, this.f11881, this.f11884, bArr, this.f11887);
                    return;
                } catch (C15761 unused) {
                    throw new C22609("Garbage after a valid XZ Stream");
                }
            }
        }
        this.f11888 = true;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        if (this.f11882 == null) {
            throw new C2357("Stream closed");
        }
        IOException iOException = this.f11886;
        if (iOException != null) {
            throw iOException;
        }
        C6590 c6590 = this.f11883;
        if (c6590 == null) {
            return 0;
        }
        return c6590.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f11882 != null) {
            C6590 c6590 = this.f11883;
            if (c6590 != null) {
                c6590.m18098(false);
                this.f11883 = null;
            }
            try {
                this.f11882.close();
            } finally {
                this.f11882 = null;
            }
        }
    }
}
