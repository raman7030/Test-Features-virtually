package p067l;

/* JADX INFO: renamed from: l.᩶ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 41SC */
/* JADX INFO: loaded from: classes4.dex */
public final class C21372 {

    /* JADX INFO: renamed from: ֫ */
    public final int f67366;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f67367;

    public C21372(int i) {
        if (i < 1 || i > 256) {
            throw new IllegalArgumentException(C20778.m46922(i, "Invalid distance: "));
        }
        this.f67366 = i;
        this.f67367 = new byte[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48417(int i, int i2, byte[] bArr) {
        byte[] bArr2;
        int i3 = this.f67366;
        int iMin = Math.min(i2, i3);
        int i4 = 0;
        while (true) {
            bArr2 = this.f67367;
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
