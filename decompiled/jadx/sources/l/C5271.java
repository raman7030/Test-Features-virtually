package l;

/* JADX INFO: renamed from: l.ۚۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8H8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5271 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f16488;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f16489;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f16490;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f16491;

    public C5271(byte[] bArr) {
        this.f16491 = bArr;
        this.f16489 = bArr.length;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m15203() {
        boolean z = (((this.f16491[this.f16490] & 255) >> this.f16488) & 1) == 1;
        m15202(1);
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15201(int i) {
        int i2 = this.f16490;
        int iMin = Math.min(i, 8 - this.f16488);
        int i3 = i2 + 1;
        byte[] bArr = this.f16491;
        int i4 = ((bArr[i2] & 255) >> this.f16488) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (bArr[i3] & 255) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m15202(i);
        return i5;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15202(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f16490 + i3;
        this.f16490 = i4;
        int i5 = (i - (i3 * 8)) + this.f16488;
        this.f16488 = i5;
        boolean z = true;
        if (i5 > 7) {
            this.f16490 = i4 + 1;
            this.f16488 = i5 - 8;
        }
        int i6 = this.f16490;
        if (i6 < 0 || (i6 >= (i2 = this.f16489) && (i6 != i2 || this.f16488 != 0))) {
            z = false;
        }
        C22632.m50634(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15200() {
        return (this.f16490 * 8) + this.f16488;
    }
}
