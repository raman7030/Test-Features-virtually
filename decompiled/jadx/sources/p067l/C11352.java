package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۢ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AK2 */
/* JADX INFO: loaded from: classes3.dex */
public class C11352 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۙ */
    public int f31611;

    /* JADX INFO: renamed from: ᩶ */
    public InputStream f31613;

    /* JADX INFO: renamed from: ᩸ */
    public C3975 f31614;

    /* JADX INFO: renamed from: ۬ */
    public boolean f31612 = false;

    /* JADX INFO: renamed from: ۗ */
    public int f31610 = 0;

    /* JADX INFO: renamed from: ᩹ */
    public C19398 f31615 = null;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int iM44158;
        C19398 c19398 = this.f31615;
        if (c19398 == null) {
            m26302();
            iM44158 = -1;
        } else {
            iM44158 = c19398.m44158();
        }
        return (iM44158 == -1 && m26301()) ? this.f31615.m44158() : iM44158;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        C19398 c19398 = this.f31615;
        int i4 = 0;
        if (c19398 == null) {
            m26302();
        } else {
            i3 = 0;
            int i5 = i;
            while (i3 < i2) {
                int iM44158 = c19398.m44158();
                if (iM44158 == -1) {
                    if (i3 != 0) {
                        break;
                    }
                    break;
                }
                bArr[i5] = (byte) iM44158;
                i3++;
                i5++;
            }
            if (i3 == -1 || !m26301()) {
                return i3;
            }
            C19398 c19399 = this.f31615;
            while (i4 < i2) {
                int iM44159 = c19399.m44158();
                if (iM44159 == -1) {
                    if (i4 == 0) {
                        return -1;
                    }
                    return i4;
                }
                bArr[i] = (byte) iM44159;
                i4++;
                i++;
            }
            c19399.getClass();
            return i4;
        }
        i3 = -1;
        if (i3 == -1) {
        }
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f31614 != null) {
            this.f31612 = true;
            this.f31615 = null;
            this.f31614 = null;
            try {
                this.f31613.close();
            } finally {
                this.f31613 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m26302() throws IOException {
        C3975 c3975 = this.f31614;
        if (c3975 == null) {
            throw new C24762("Stream closed");
        }
        if (this.f31612) {
            return;
        }
        try {
            int iM7935 = c3975.m7935(16);
            int iM7936 = this.f31614.m7935(8);
            int iM7937 = this.f31614.m7935(8) - 48;
            if (iM7935 != 16986 || iM7936 != 104 || iM7937 < 1 || iM7937 > 9) {
                throw new C24762("Invalid BZip2 header");
            }
            this.f31611 = iM7937 * 100000;
        } catch (IOException e) {
            this.f31612 = true;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m26301() throws IOException {
        if (this.f31612) {
            return false;
        }
        C19398 c19398 = this.f31615;
        if (c19398 != null) {
            int iM44157 = c19398.m44157();
            int i = this.f31610;
            this.f31610 = iM44157 ^ ((i >>> 31) | (i << 1));
        }
        int iM7935 = this.f31614.m7935(24);
        int iM7936 = this.f31614.m7935(24);
        if (iM7935 == 3227993 && iM7936 == 2511705) {
            try {
                this.f31615 = new C19398(this.f31614, this.f31611);
                return true;
            } catch (IOException e) {
                this.f31612 = true;
                throw e;
            }
        }
        if (iM7935 == 1536581 && iM7936 == 3690640) {
            this.f31612 = true;
            C3975 c3975 = this.f31614;
            if ((c3975.m7935(16) | (c3975.m7935(16) << 16)) == this.f31610) {
                return false;
            }
            throw new C24762("BZip2 stream CRC error");
        }
        this.f31612 = true;
        throw new C24762("BZip2 stream format error");
    }

    public C11352(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Null input stream");
        }
        this.f31613 = inputStream;
        this.f31614 = new C3975(inputStream);
    }
}
