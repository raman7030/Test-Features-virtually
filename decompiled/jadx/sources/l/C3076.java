package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۗۜᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6WV */
/* JADX INFO: loaded from: classes2.dex */
public final class C3076 extends OutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12953 f9648;

    public C3076(C12953 c12953) {
        this.f9648 = c12953;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        C12953 c12953 = this.f9648;
        if (c12953.f38859) {
            return;
        }
        if (c12953.f38856.f2177 >= 8388608) {
            C12953.m31512(c12953);
        } else {
            c12953.f38856.write(i);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        C12953 c12953 = this.f9648;
        if (c12953.f38859) {
            return;
        }
        if (i2 > 8388608 - c12953.f38856.f2177) {
            C12953.m31512(c12953);
        } else {
            c12953.f38856.write(bArr, i, i2);
        }
    }
}
