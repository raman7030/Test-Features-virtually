package p067l;

/* JADX INFO: renamed from: l.ۨۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: K2S3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13383 extends AbstractC8018 {
    @Override // p067l.AbstractC8018
    /* JADX INFO: renamed from: ֫ */
    public final synchronized byte[] mo18597() {
        return m18599();
    }

    public C13383() {
        synchronized (this) {
            m18596(1024);
        }
    }

    @Override // p067l.AbstractC8018, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        synchronized (this) {
            m18600(i, i2, bArr);
        }
    }

    @Override // p067l.AbstractC8018, java.io.OutputStream
    public final synchronized void write(int i) {
        m18598(i);
    }
}
