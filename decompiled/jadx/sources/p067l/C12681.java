package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.ۧ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: H4GQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C12681 extends InflaterInputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ᩶ */
    public final boolean f35580;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f35581;

    /* JADX INFO: renamed from: ᩹ */
    public final C5738 f35582;

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C12681(C5738 c5738, InputStream inputStream, boolean z) {
        super(inputStream, new Inflater(true));
        this.f35582 = c5738;
        this.f35580 = z;
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C5738 c5738 = this.f35582;
        boolean z = this.f35580;
        try {
            int i3 = super.read(bArr, i, i2);
            if (i3 == -1 && z) {
                m29162();
            }
            return i3;
        } catch (EOFException unused) {
            if (!z) {
                return -1;
            }
            throw new ZipException("Unexpected end of DEFLATE stream (" + c5738.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (ZipException e) {
            C4809.m10150(e, c5738);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m29162() throws ZipException {
        if (this.f35581) {
            return;
        }
        if (!((InflaterInputStream) this).inf.finished()) {
            throw new ZipException("Unexpected end of DEFLATE stream (" + this.f35582.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        if (((InflaterInputStream) this).inf.getRemaining() != 0 || ((InflaterInputStream) this).in.read() != -1) {
            throw new ZipException("Trailing data after DEFLATE stream (" + this.f35582.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f35581 = true;
    }
}
