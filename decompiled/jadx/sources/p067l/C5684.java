package p067l;

/* JADX INFO: renamed from: l.ۗ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5C3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5684 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f13856;

    /* JADX INFO: renamed from: ۧ */
    public int f13857;

    public C5684(byte[] bArr) {
        this.f13856 = bArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m12664() {
        int i = this.f13857;
        byte[] bArr = this.f13856;
        int i2 = (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.f13857 = i + 4;
        return i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final short m12666() {
        int i = this.f13857;
        byte[] bArr = this.f13856;
        short s = (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
        this.f13857 = i + 2;
        return s;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m12665(int i) {
        byte[] bArr = new byte[i];
        System.arraycopy(this.f13856, this.f13857, bArr, 0, i);
        this.f13857 += i;
        return bArr;
    }
}
