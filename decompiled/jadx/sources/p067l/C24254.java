package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.᩺ܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q73C */
/* JADX INFO: loaded from: classes.dex */
public final class C24254 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۗ */
    public final InputStream f76849;

    /* JADX INFO: renamed from: ۙ */
    public final C5738 f76850;

    /* JADX INFO: renamed from: ۬ */
    public boolean f76851;

    /* JADX INFO: renamed from: ᩶ */
    public final CRC32 f76852;

    /* JADX INFO: renamed from: ᩸ */
    public final InputStream f76853;

    /* JADX INFO: renamed from: ᩹ */
    public long f76854;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C24254(C5738 c5738, InputStream inputStream, C20903 c20903, boolean z) {
        this.f76850 = c5738;
        this.f76849 = inputStream;
        this.f76853 = c20903;
        this.f76852 = z ? new CRC32() : null;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.f76849.read();
        if (i == -1) {
            m53560();
            return i;
        }
        m53561(1);
        CRC32 crc32 = this.f76852;
        if (crc32 != null) {
            crc32.update(i);
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f76849.read(bArr, i, i2);
        if (i3 == -1) {
            m53560();
            return i3;
        }
        if (i3 > 0) {
            m53561(i3);
            CRC32 crc32 = this.f76852;
            if (crc32 != null) {
                crc32.update(bArr, i, i3);
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53561(int i) throws ZipException {
        C5738 c5738 = this.f76850;
        long size = c5738.getSize();
        long j = this.f76854;
        long j2 = i;
        if (j > C14849.FOREVER_NS - j2) {
            throw new ZipException("Uncompressed size overflow (" + c5738.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        long j3 = j + j2;
        if (j3 > size) {
            throw new ZipException(String.format("Bad uncompressed size: expected=%d, got=%d (%s)", Long.valueOf(c5738.getSize()), Long.valueOf(j3), c5738.getName()));
        }
        this.f76854 = j3;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m53560() throws IOException {
        int value;
        if (this.f76851) {
            return;
        }
        InputStream inputStream = this.f76853;
        if (inputStream != null) {
            while (inputStream.read(new byte[8192]) != -1) {
            }
        }
        long j = this.f76854;
        C5738 c5738 = this.f76850;
        if (j != c5738.getSize()) {
            throw new ZipException(String.format("Bad uncompressed size: expected=%d, got=%d (%s)", Long.valueOf(c5738.getSize()), Long.valueOf(this.f76854), c5738.getName()));
        }
        CRC32 crc32 = this.f76852;
        if (crc32 != null && c5738.m12763() != (value = (int) crc32.getValue())) {
            throw C8161.m18936(c5738, value);
        }
        this.f76851 = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f76849.close();
    }
}
