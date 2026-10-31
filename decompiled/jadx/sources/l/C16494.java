package l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܽ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: DARC */
/* JADX INFO: loaded from: classes4.dex */
public final class C16494 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream f50690;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f50691 = new byte[1];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C8734 f50692;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3545 f50693;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C16494(C3545 c3545, InputStream inputStream) {
        this.f50692 = new C8734(inputStream);
        this.f50690 = inputStream;
        this.f50693 = c3545;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr;
        int i;
        do {
            bArr = this.f50691;
            i = read(bArr);
            if (i == -1) {
                return -1;
            }
        } while (i == 0);
        if (i == 1) {
            return bArr[0] & 255;
        }
        StringBuilder sbM32308 = C13325.m32308(i, "Invalid return value from read: ", " (");
        sbM32308.append(this.f50693.getName());
        sbM32308.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IllegalStateException(sbM32308.toString());
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        C8734 c8734 = this.f50692;
        if (c8734 == null) {
            return -1;
        }
        try {
            int iM22590 = c8734.m22590(i, i2, bArr);
            if (iM22590 == -1) {
                C22194.m49850(this.f50692);
                this.f50692 = null;
            }
            return iM22590;
        } catch (RuntimeException e) {
            throw new IOException("Invalid Deflate64 input. (" + this.f50693.getName() + MotionUtils.EASING_TYPE_FORMAT_END, e);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        C8734 c8734 = this.f50692;
        if (c8734 != null) {
            return c8734.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            C22194.m49850(this.f50692);
            this.f50692 = null;
        } finally {
            InputStream inputStream = this.f50690;
            if (inputStream != null) {
                inputStream.close();
                this.f50690 = null;
            }
        }
    }
}
