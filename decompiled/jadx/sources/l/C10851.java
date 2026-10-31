package l;

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
public final class C10851 extends InflaterInputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f32604;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f32605;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3545 f32606;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C10851(C3545 c3545, InputStream inputStream, boolean z) {
        super(inputStream, new Inflater(true));
        this.f32606 = c3545;
        this.f32604 = z;
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        C3545 c3545 = this.f32606;
        boolean z = this.f32604;
        try {
            int i3 = super.read(bArr, i, i2);
            if (i3 == -1 && z) {
                m27117();
            }
            return i3;
        } catch (EOFException unused) {
            if (!z) {
                return -1;
            }
            throw new ZipException("Unexpected end of DEFLATE stream (" + c3545.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        } catch (ZipException e) {
            C2568.m8117(e, c3545);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m27117() throws ZipException {
        if (this.f32605) {
            return;
        }
        if (!((InflaterInputStream) this).inf.finished()) {
            throw new ZipException("Unexpected end of DEFLATE stream (" + this.f32606.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        if (((InflaterInputStream) this).inf.getRemaining() != 0 || ((InflaterInputStream) this).in.read() != -1) {
            throw new ZipException("Trailing data after DEFLATE stream (" + this.f32606.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f32605 = true;
    }
}
