package l;

/* JADX INFO: renamed from: l.ۨۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K2S3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11590 extends AbstractC5945 {
    @Override // l.AbstractC5945
    /* JADX INFO: renamed from: ֫ */
    public final synchronized byte[] mo16671() {
        return m16673();
    }

    public C11590() {
        synchronized (this) {
            m16670(1024);
        }
    }

    @Override // l.AbstractC5945, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        synchronized (this) {
            m16674(i, i2, bArr);
        }
    }

    @Override // l.AbstractC5945, java.io.OutputStream
    public final synchronized void write(int i) {
        m16672(i);
    }
}
