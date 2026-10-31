package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۢ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AK2 */
/* JADX INFO: loaded from: classes3.dex */
public class C9453 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f28662;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InputStream f28664;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C1691 f28665;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f28663 = false;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f28661 = 0;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C17919 f28666 = null;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int iM41909;
        C17919 c17919 = this.f28666;
        if (c17919 == null) {
            m24292();
            iM41909 = -1;
        } else {
            iM41909 = c17919.m41909();
        }
        return (iM41909 == -1 && m24291()) ? this.f28666.m41909() : iM41909;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        C17919 c17919 = this.f28666;
        int i4 = 0;
        if (c17919 == null) {
            m24292();
        } else {
            i3 = 0;
            int i5 = i;
            while (i3 < i2) {
                int iM41909 = c17919.m41909();
                if (iM41909 == -1) {
                    if (i3 != 0) {
                        break;
                    }
                    break;
                }
                bArr[i5] = (byte) iM41909;
                i3++;
                i5++;
            }
            if (i3 == -1 || !m24291()) {
                return i3;
            }
            C17919 c179110 = this.f28666;
            while (i4 < i2) {
                int iM419010 = c179110.m41909();
                if (iM419010 == -1) {
                    if (i4 == 0) {
                        return -1;
                    }
                    return i4;
                }
                bArr[i] = (byte) iM419010;
                i4++;
                i++;
            }
            c179110.getClass();
            return i4;
        }
        i3 = -1;
        if (i3 == -1) {
        }
        return i3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f28665 != null) {
            this.f28663 = true;
            this.f28666 = null;
            this.f28665 = null;
            try {
                this.f28664.close();
            } finally {
                this.f28664 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m24292() throws IOException {
        C1691 c1691 = this.f28665;
        if (c1691 == null) {
            throw new C23563("Stream closed");
        }
        if (this.f28663) {
            return;
        }
        try {
            int iM5702 = c1691.m5702(16);
            int iM5703 = this.f28665.m5702(8);
            int iM5704 = this.f28665.m5702(8) - 48;
            if (iM5702 != 16986 || iM5703 != 104 || iM5704 < 1 || iM5704 > 9) {
                throw new C23563("Invalid BZip2 header");
            }
            this.f28662 = iM5704 * 100000;
        } catch (IOException e) {
            this.f28663 = true;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m24291() throws IOException {
        if (this.f28663) {
            return false;
        }
        C17919 c17919 = this.f28666;
        if (c17919 != null) {
            int iM41908 = c17919.m41908();
            int i = this.f28661;
            this.f28661 = iM41908 ^ ((i >>> 31) | (i << 1));
        }
        int iM5702 = this.f28665.m5702(24);
        int iM5703 = this.f28665.m5702(24);
        if (iM5702 == 3227993 && iM5703 == 2511705) {
            try {
                this.f28666 = new C17919(this.f28665, this.f28662);
                return true;
            } catch (IOException e) {
                this.f28663 = true;
                throw e;
            }
        }
        if (iM5702 == 1536581 && iM5703 == 3690640) {
            this.f28663 = true;
            C1691 c1691 = this.f28665;
            if ((c1691.m5702(16) | (c1691.m5702(16) << 16)) == this.f28661) {
                return false;
            }
            throw new C23563("BZip2 stream CRC error");
        }
        this.f28663 = true;
        throw new C23563("BZip2 stream format error");
    }

    public C9453(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Null input stream");
        }
        this.f28664 = inputStream;
        this.f28665 = new C1691(inputStream);
    }
}
