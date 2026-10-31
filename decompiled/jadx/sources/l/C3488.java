package l;

/* JADX INFO: renamed from: l.ۗ᩷ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5C3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3488 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f11051;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f11052;

    public C3488(byte[] bArr) {
        this.f11051 = bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m10669() {
        int i = this.f11052;
        byte[] bArr = this.f11051;
        int i2 = (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        this.f11052 = i + 4;
        return i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final short m10671() {
        int i = this.f11052;
        byte[] bArr = this.f11051;
        short s = (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
        this.f11052 = i + 2;
        return s;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m10670(int i) {
        byte[] bArr = new byte[i];
        System.arraycopy(this.f11051, this.f11052, bArr, 0, i);
        this.f11052 += i;
        return bArr;
    }
}
