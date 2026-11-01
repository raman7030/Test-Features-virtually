package p067l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5809 extends OutputStream {

    /* JADX INFO: renamed from: ᩸ */
    public long f14274;

    /* JADX INFO: renamed from: ᩹ */
    public final C24618 f14275;

    public C5809(long j, C24618 c24618) {
        this.f14275 = c24618;
        this.f14274 = j;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        synchronized (this.f14275) {
            this.f14275.seek(this.f14274);
            this.f14275.write(bArr, i, i2);
            this.f14274 += (long) i2;
        }
    }
}
