package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۧۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 672L */
/* JADX INFO: loaded from: classes4.dex */
public final class C10978 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final BufferedInputStream f33036;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C9453 f33037;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f33038;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C10978(InputStream inputStream) {
        BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 65536);
        this.f33036 = bufferedInputStream;
        this.f33037 = new C9453(bufferedInputStream);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (!this.f33038) {
            int i = this.f33037.read();
            if (i != -1) {
                return i;
            }
            if (!m27289()) {
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
        while (!this.f33038) {
            int i3 = this.f33037.read(bArr, i, i2);
            if (i3 != -1) {
                return i3;
            }
            if (!m27289()) {
                break;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m27289() throws IOException {
        byte b;
        BufferedInputStream bufferedInputStream = this.f33036;
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
            this.f33038 = true;
            return false;
        }
        if (i != 4 || bArr[0] != 66 || bArr[1] != 90 || bArr[2] != 104 || (b = bArr[3]) < 49 || b > 57) {
            throw new IOException("Invalid trailing BZIP2 member");
        }
        bufferedInputStream.reset();
        this.f33037 = new C9453(bufferedInputStream);
        return true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f33038 = true;
        this.f33036.close();
    }
}
