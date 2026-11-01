package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C12232 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۗ */
    public byte[] f34171;

    /* JADX INFO: renamed from: ۙ */
    public int f34172;

    /* JADX INFO: renamed from: ᩶ */
    public C7479 f34173;

    /* JADX INFO: renamed from: ᩸ */
    public final int f34174;

    /* JADX INFO: renamed from: ᩹ */
    public InputStream f34175;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C12232(InputStream inputStream, byte[] bArr, int i, C7479 c7479) {
        this.f34175 = inputStream;
        this.f34171 = bArr;
        this.f34174 = i;
        this.f34173 = c7479;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C12826.checkFromIndexSize(i, i2, bArr.length);
        synchronized (this) {
            if (this.f34175 == null) {
                throw new IOException("Text input is closed");
            }
            if (i2 == 0) {
                return 0;
            }
            int i3 = this.f34172;
            int i4 = this.f34174;
            if (i3 < i4) {
                int iMin = Math.min(i2, i4 - i3);
                System.arraycopy(this.f34171, this.f34172, bArr, i, iMin);
                int i5 = this.f34172 + iMin;
                this.f34172 = i5;
                if (i5 == this.f34174) {
                    this.f34171 = null;
                    C7479 c7479 = this.f34173;
                    if (c7479 != null) {
                        c7479.close();
                        this.f34173 = null;
                    }
                }
                return iMin;
            }
            this.f34171 = null;
            C7479 c74710 = this.f34173;
            if (c74710 != null) {
                c74710.close();
                this.f34173 = null;
            }
            return this.f34175.read(bArr, i, i2);
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream;
        synchronized (this) {
            inputStream = this.f34175;
            this.f34175 = null;
            this.f34171 = null;
            C7479 c7479 = this.f34173;
            if (c7479 != null) {
                c7479.close();
                this.f34173 = null;
            }
        }
        if (inputStream != null) {
            inputStream.close();
        }
    }
}
