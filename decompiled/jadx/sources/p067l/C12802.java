package p067l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۧۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 672L */
/* JADX INFO: loaded from: classes4.dex */
public final class C12802 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩶ */
    public final BufferedInputStream f36029;

    /* JADX INFO: renamed from: ᩸ */
    public C11352 f36030;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f36031;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C12802(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 65536);
        this.f36029 = bufferedInputStream;
        this.f36030 = new C11352(bufferedInputStream);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (!this.f36031) {
            int i = this.f36030.read();
            if (i != -1) {
                return i;
            }
            if (!m29351()) {
                break;
            }
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        while (!this.f36031) {
            int i3 = this.f36030.read(bArr, i, i2);
            if (i3 != -1) {
                return i3;
            }
            if (!m29351()) {
                break;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m29351() throws IOException {
        byte b;
        BufferedInputStream bufferedInputStream = this.f36029;
        bufferedInputStream.mark(4);
        byte[] bArr = new byte[4];
        int i = 0;
        while (i < 4) {
            int i2 = bufferedInputStream.read(bArr, i, 4 - i);
            if (i2 == -1) {
                break;
            }
            i += i2;
        }
        if (i == 0) {
            this.f36031 = true;
            return false;
        }
        if (i != 4 || bArr[0] != 66 || bArr[1] != 90 || bArr[2] != 104 || (b = bArr[3]) < 49 || b > 57) {
            throw new IOException("Invalid trailing BZIP2 member");
        }
        bufferedInputStream.reset();
        this.f36030 = new C11352(bufferedInputStream);
        return true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f36031 = true;
        this.f36029.close();
    }
}
