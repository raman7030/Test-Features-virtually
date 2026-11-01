package p067l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94G3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12185 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC9866 f34069;

    /* JADX INFO: renamed from: ᩹ */
    public long f34070 = 0;

    public C12185(C24618 c24618) {
        this.f34069 = c24618;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            this.f34069.write(bArr, i, i2);
            this.f34070 += (long) i2;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f34069.write(i);
        this.f34070++;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m28140() {
        return this.f34070;
    }
}
