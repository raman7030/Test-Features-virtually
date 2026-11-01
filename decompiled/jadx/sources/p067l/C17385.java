package p067l;

import java.io.IOException;
import java.io.OutputStream;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܺ۠֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17385 extends OutputStream {

    /* JADX INFO: renamed from: ۙ */
    public final int f51885;

    /* JADX INFO: renamed from: ᩶ */
    public OutputStream f51887;

    /* JADX INFO: renamed from: ᩸ */
    public C12693 f51888;

    /* JADX INFO: renamed from: ᩹ */
    public C18056 f51889;

    /* JADX INFO: renamed from: ۬ */
    public boolean f51886 = false;

    /* JADX INFO: renamed from: ۗ */
    public int f51884 = 0;

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        if (this.f51887 == null) {
            throw new C24762("Stream closed");
        }
        if (this.f51886) {
            throw new C24762("Write beyond end of stream");
        }
        int i2 = i & 255;
        if (this.f51889.m41102(i2)) {
            return;
        }
        m39612();
        C18056 c18056 = new C18056(this.f51888, this.f51885);
        this.f51889 = c18056;
        c18056.m41102(i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f51887 == null) {
            throw new C24762("Stream closed");
        }
        if (this.f51886) {
            throw new C24762("Write beyond end of stream");
        }
        while (i2 > 0) {
            C18056 c18056 = this.f51889;
            c18056.getClass();
            int i3 = 0;
            int i4 = i;
            int i5 = i2;
            while (true) {
                int i6 = i5 - 1;
                if (i5 <= 0) {
                    break;
                }
                int i7 = i4 + 1;
                if (!c18056.m41102(bArr[i4])) {
                    break;
                }
                i3++;
                i4 = i7;
                i5 = i6;
            }
            if (i3 < i2) {
                m39612();
                this.f51889 = new C18056(this.f51888, this.f51885);
            }
            i += i3;
            i2 -= i3;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f51887 != null) {
            C12693 c12693 = this.f51888;
            if (!this.f51886) {
                this.f51886 = true;
                try {
                    m39612();
                    c12693.m29211(24, 1536581);
                    c12693.m29211(24, 3690640);
                    int i = this.f51884;
                    c12693.m29211(16, (i >>> 16) & 65535);
                    c12693.m29211(16, i & 65535);
                    c12693.m29210();
                    this.f51887.flush();
                    this.f51889 = null;
                } catch (Throwable th) {
                    this.f51889 = null;
                    throw th;
                }
            }
            this.f51887.close();
            this.f51887 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m39612() throws IOException {
        if (this.f51889.m41104()) {
            return;
        }
        this.f51889.m41101();
        int iM41103 = this.f51889.m41103();
        int i = this.f51884;
        this.f51884 = iM41103 ^ ((i >>> 31) | (i << 1));
    }

    public C17385(OutputStream outputStream, int i) throws IOException {
        if (i < 1 || i > 9) {
            throw new IllegalArgumentException(C20778.m46922(i, "Invalid BZip2 block size"));
        }
        int i2 = 100000 * i;
        this.f51885 = i2;
        this.f51887 = outputStream;
        C12693 c12693 = new C12693(outputStream);
        this.f51888 = c12693;
        c12693.m29211(16, 16986);
        c12693.m29211(8, IShizukuService.Stub.TRANSACTION_isHidden);
        c12693.m29211(8, i + 48);
        this.f51889 = new C18056(c12693, i2);
    }
}
