package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.ۛܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4GS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8161 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩶ */
    public final InputStream f21534;

    /* JADX INFO: renamed from: ᩸ */
    public final CRC32 f21535 = new CRC32();

    /* JADX INFO: renamed from: ᩹ */
    public final C5738 f21536;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C8161(C5738 c5738, InputStream inputStream) {
        this.f21536 = c5738;
        this.f21534 = inputStream;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f21534.read(bArr, i, i2);
        CRC32 crc32 = this.f21535;
        if (i3 > 0) {
            crc32.update(bArr, i, i3);
            return i3;
        }
        if (i3 == -1) {
            int value = (int) crc32.getValue();
            C5738 c5738 = this.f21536;
            if (c5738.m12763() != value) {
                throw m18936(c5738, value);
            }
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f21534.read();
        CRC32 crc32 = this.f21535;
        if (i != -1) {
            crc32.update(i);
            return i;
        }
        int value = (int) crc32.getValue();
        C5738 c5738 = this.f21536;
        if (c5738.m12763() == value) {
            return i;
        }
        throw m18936(c5738, value);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f21534.close();
    }

    /* JADX INFO: renamed from: ֫ */
    public static IOException m18936(C5738 c5738, int i) {
        if (c5738.m12789() && c5738.m12773() && c5738.m12748() == 0) {
            return new C6150(c5738.getName());
        }
        return new ZipException(String.format("Bad file CRC value: expected=0x%08x, got=0x%08x (%s)", Integer.valueOf(c5738.m12763()), Integer.valueOf(i), c5738.getName()));
    }
}
