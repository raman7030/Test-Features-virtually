package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.᩺ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q73C */
/* JADX INFO: loaded from: classes.dex */
public final class C23028 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InputStream f74110;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3545 f74111;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f74112;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CRC32 f74113;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InputStream f74114;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f74115;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C23028(C3545 c3545, InputStream inputStream, C19502 c19502, boolean z) {
        this.f74111 = c3545;
        this.f74110 = inputStream;
        this.f74114 = c19502;
        this.f74113 = z ? new CRC32() : null;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f74110.read();
        if (i == -1) {
            m51167();
            return i;
        }
        m51168(1);
        CRC32 crc32 = this.f74113;
        if (crc32 != null) {
            crc32.update(i);
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f74110.read(bArr, i, i2);
        if (i3 == -1) {
            m51167();
            return i3;
        }
        if (i3 > 0) {
            m51168(i3);
            CRC32 crc32 = this.f74113;
            if (crc32 != null) {
                crc32.update(bArr, i, i3);
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51168(int i) throws ZipException {
        C3545 c3545 = this.f74111;
        long size = c3545.getSize();
        long j = this.f74115;
        long j2 = i;
        if (j > C13132.FOREVER_NS - j2) {
            throw new ZipException("Uncompressed size overflow (" + c3545.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        long j3 = j + j2;
        if (j3 > size) {
            throw new ZipException(String.format("Bad uncompressed size: expected=%d, got=%d (%s)", Long.valueOf(c3545.getSize()), Long.valueOf(j3), c3545.getName()));
        }
        this.f74115 = j3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51167() throws IOException {
        int value;
        if (this.f74112) {
            return;
        }
        InputStream inputStream = this.f74114;
        if (inputStream != null) {
            while (inputStream.read(new byte[8192]) != -1) {
            }
        }
        long j = this.f74115;
        C3545 c3545 = this.f74111;
        if (j != c3545.getSize()) {
            throw new ZipException(String.format("Bad uncompressed size: expected=%d, got=%d (%s)", Long.valueOf(c3545.getSize()), Long.valueOf(this.f74115), c3545.getName()));
        }
        CRC32 crc32 = this.f74113;
        if (crc32 != null && c3545.m10782() != (value = (int) crc32.getValue())) {
            throw C6095.m17005(c3545, value);
        }
        this.f74112 = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f74110.close();
    }
}
