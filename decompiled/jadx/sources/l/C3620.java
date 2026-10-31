package l;

import java.io.OutputStream;

/* JADX INFO: renamed from: l.ۘ֨᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M9Q4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3620 extends OutputStream {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f11469;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23411 f11470;

    public C3620(long j, C23411 c23411) {
        this.f11470 = c23411;
        this.f11469 = j;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        synchronized (this.f11470) {
            this.f11470.seek(this.f11469);
            this.f11470.write(bArr, i, i2);
            this.f11469 += (long) i2;
        }
    }
}
