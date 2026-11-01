package p067l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۗۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6WV */
/* JADX INFO: loaded from: classes2.dex */
public final class C5292 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14679 f12451;

    public C5292(C14679 c14679) {
        this.f12451 = c14679;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        C14679 c14679 = this.f12451;
        if (c14679.f41903) {
            return;
        }
        if (c14679.f41900.f4950 >= 8388608) {
            C14679.m33599(c14679);
        } else {
            c14679.f41900.write(i);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        C14679 c14679 = this.f12451;
        if (c14679.f41903) {
            return;
        }
        if (i2 > 8388608 - c14679.f41900.f4950) {
            C14679.m33599(c14679);
        } else {
            c14679.f41900.write(bArr, i, i2);
        }
    }
}
