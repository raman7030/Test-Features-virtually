package p067l;

/* JADX INFO: renamed from: l.ۚۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8H8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7378 {

    /* JADX INFO: renamed from: ֫ */
    public int f19325;

    /* JADX INFO: renamed from: ۧ */
    public final int f19326;

    /* JADX INFO: renamed from: ܽ */
    public int f19327;

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] f19328;

    public C7378(byte[] bArr) {
        this.f19328 = bArr;
        this.f19326 = bArr.length;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m17106() {
        boolean z = (((this.f19328[this.f19327] & 255) >> this.f19325) & 1) == 1;
        m17105(1);
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m17104(int i) {
        int i2 = this.f19327;
        int iMin = Math.min(i, 8 - this.f19325);
        int i3 = i2 + 1;
        byte[] bArr = this.f19328;
        int i4 = ((bArr[i2] & 255) >> this.f19325) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (bArr[i3] & 255) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m17105(i);
        return i5;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17105(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f19327 + i3;
        this.f19327 = i4;
        int i5 = (i - (i3 * 8)) + this.f19325;
        this.f19325 = i5;
        boolean z = true;
        if (i5 > 7) {
            this.f19327 = i4 + 1;
            this.f19325 = i5 - 8;
        }
        int i6 = this.f19327;
        if (i6 < 0 || (i6 >= (i2 = this.f19326) && (i6 != i2 || this.f19325 != 0))) {
            z = false;
        }
        C23877.m52960(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m17103() {
        return (this.f19327 * 8) + this.f19325;
    }
}
