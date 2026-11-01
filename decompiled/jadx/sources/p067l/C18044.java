package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.ܽ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: DARC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18044 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۙ */
    public InputStream f53867;

    /* JADX INFO: renamed from: ᩶ */
    public final byte[] f53868 = new byte[1];

    /* JADX INFO: renamed from: ᩸ */
    public C10669 f53869;

    /* JADX INFO: renamed from: ᩹ */
    public final C5738 f53870;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C18044(C5738 c5738, InputStream inputStream) {
        this.f53869 = new C10669(inputStream);
        this.f53867 = inputStream;
        this.f53870 = c5738;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr;
        int i;
        do {
            bArr = this.f53868;
            i = read(bArr);
            if (i == -1) {
                return -1;
            }
        } while (i == 0);
        if (i == 1) {
            return bArr[0] & 255;
        }
        StringBuilder sbM34408 = C15033.m34408(i, "Invalid return value from read: ", " (");
        sbM34408.append(this.f53870.getName());
        sbM34408.append(MotionUtils.EASING_TYPE_FORMAT_END);
        throw new IllegalStateException(sbM34408.toString());
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        C10669 c10669 = this.f53869;
        if (c10669 == null) {
            return -1;
        }
        try {
            int iM24559 = c10669.m24559(i, i2, bArr);
            if (iM24559 == -1) {
                C23461.m52177(this.f53869);
                this.f53869 = null;
            }
            return iM24559;
        } catch (RuntimeException e) {
            throw new IOException("Invalid Deflate64 input. (" + this.f53870.getName() + MotionUtils.EASING_TYPE_FORMAT_END, e);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        C10669 c10669 = this.f53869;
        if (c10669 != null) {
            return c10669.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            C23461.m52177(this.f53869);
            this.f53869 = null;
        } finally {
            InputStream inputStream = this.f53867;
            if (inputStream != null) {
                inputStream.close();
                this.f53867 = null;
            }
        }
    }
}
