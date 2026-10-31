package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۤܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94G3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10329 extends OutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC7889 f31106;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f31107 = 0;

    public C10329(C23411 c23411) {
        this.f31106 = c23411;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i2 > 0) {
            this.f31106.write(bArr, i, i2);
            this.f31107 += (long) i2;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f31106.write(i);
        this.f31107++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m26115() {
        return this.f31107;
    }
}
