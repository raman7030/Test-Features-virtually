package l;

import java.io.IOException;
import java.io.OutputStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܺ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15801 extends OutputStream {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f48747;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public OutputStream f48749;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C10864 f48750;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C16507 f48751;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f48748 = false;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f48746 = 0;

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (this.f48749 == null) {
            throw new C23563("Stream closed");
        }
        if (this.f48748) {
            throw new C23563("Write beyond end of stream");
        }
        int i2 = i & 255;
        if (this.f48751.m38876(i2)) {
            return;
        }
        m37441();
        C16507 c16507 = new C16507(this.f48750, this.f48747);
        this.f48751 = c16507;
        c16507.m38876(i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f48749 == null) {
            throw new C23563("Stream closed");
        }
        if (this.f48748) {
            throw new C23563("Write beyond end of stream");
        }
        while (i2 > 0) {
            C16507 c16507 = this.f48751;
            c16507.getClass();
            int i3 = 0;
            int i4 = i;
            int i5 = i2;
            while (true) {
                int i6 = i5 - 1;
                if (i5 <= 0) {
                    break;
                }
                int i7 = i4 + 1;
                if (!c16507.m38876(bArr[i4])) {
                    break;
                }
                i3++;
                i4 = i7;
                i5 = i6;
            }
            if (i3 < i2) {
                m37441();
                this.f48751 = new C16507(this.f48750, this.f48747);
            }
            i += i3;
            i2 -= i3;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f48749 != null) {
            C10864 c10864 = this.f48750;
            if (!this.f48748) {
                this.f48748 = true;
                try {
                    m37441();
                    c10864.m27166(24, 1536581);
                    c10864.m27166(24, 3690640);
                    int i = this.f48746;
                    c10864.m27166(16, (i >>> 16) & 65535);
                    c10864.m27166(16, i & 65535);
                    c10864.m27165();
                    this.f48749.flush();
                    this.f48751 = null;
                } catch (Throwable th) {
                    this.f48751 = null;
                    throw th;
                }
            }
            this.f48749.close();
            this.f48749 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37441() throws IOException {
        if (this.f48751.m38878()) {
            return;
        }
        this.f48751.m38875();
        int iM38877 = this.f48751.m38877();
        int i = this.f48746;
        this.f48746 = iM38877 ^ ((i >>> 31) | (i << 1));
    }

    public C15801(OutputStream outputStream, int i) throws IOException {
        if (i < 1 || i > 9) {
            throw new IllegalArgumentException(C19370.m44628(i, "Invalid BZip2 block size"));
        }
        int i2 = 100000 * i;
        this.f48747 = i2;
        this.f48749 = outputStream;
        C10864 c10864 = new C10864(outputStream);
        this.f48750 = c10864;
        c10864.m27166(16, 16986);
        c10864.m27166(8, IShizukuService.Stub.TRANSACTION_isHidden);
        c10864.m27166(8, i + 48);
        this.f48751 = new C16507(c10864, i2);
    }
}
