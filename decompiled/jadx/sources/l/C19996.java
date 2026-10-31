package l;

/* JADX INFO: renamed from: l.᩶ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 41SC */
/* JADX INFO: loaded from: classes4.dex */
public final class C19996 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f64724;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f64725;

    public C19996(int i) {
        if (i < 1 || i > 256) {
            throw new IllegalArgumentException(C19370.m44628(i, "Invalid distance: "));
        }
        this.f64724 = i;
        this.f64725 = new byte[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46102(int i, int i2, byte[] bArr) {
        byte[] bArr2;
        int i3 = this.f64724;
        int iMin = Math.min(i2, i3);
        int i4 = 0;
        while (true) {
            bArr2 = this.f64725;
            if (i4 >= iMin) {
                break;
            }
            int i5 = i + i4;
            bArr[i5] = (byte) (bArr[i5] + bArr2[i4]);
            i4++;
        }
        while (i4 < i2) {
            int i6 = i + i4;
            bArr[i6] = (byte) (bArr[i6] + bArr[i6 - i3]);
            i4++;
        }
        if (i2 >= i3) {
            System.arraycopy(bArr, (i + i2) - i3, bArr2, 0, i3);
        } else {
            System.arraycopy(bArr2, i4, bArr2, 0, i3 - i4);
            System.arraycopy(bArr, i, bArr2, i3 - i4, i2);
        }
    }
}
