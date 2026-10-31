package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.ۛܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: K4GS */
/* JADX INFO: loaded from: classes3.dex */
public final class C6095 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InputStream f18678;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CRC32 f18679 = new CRC32();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3545 f18680;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C6095(C3545 c3545, InputStream inputStream) {
        this.f18680 = c3545;
        this.f18678 = inputStream;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f18678.read(bArr, i, i2);
        CRC32 crc32 = this.f18679;
        if (i3 > 0) {
            crc32.update(bArr, i, i3);
            return i3;
        }
        if (i3 == -1) {
            int value = (int) crc32.getValue();
            C3545 c3545 = this.f18680;
            if (c3545.m10782() != value) {
                throw m17005(c3545, value);
            }
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f18678.read();
        CRC32 crc32 = this.f18679;
        if (i != -1) {
            crc32.update(i);
            return i;
        }
        int value = (int) crc32.getValue();
        C3545 c3545 = this.f18680;
        if (c3545.m10782() == value) {
            return i;
        }
        throw m17005(c3545, value);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f18678.close();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IOException m17005(C3545 c3545, int i) {
        if (c3545.m10808() && c3545.m10792() && c3545.m10767() == 0) {
            return new C3979(c3545.getName());
        }
        return new ZipException(String.format("Bad file CRC value: expected=0x%08x, got=0x%08x (%s)", Integer.valueOf(c3545.m10782()), Integer.valueOf(i), c3545.getName()));
    }
}
