package l;

/* JADX INFO: renamed from: l.᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L3KT */
/* JADX INFO: loaded from: classes4.dex */
public final class C19661 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f63490;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f63491;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f63492;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f63493;

    public C19661() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f63490 = iHighestOneBit - 1;
        this.f63491 = new int[iHighestOneBit];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45196(int i) {
        int[] iArr = this.f63491;
        int i2 = this.f63493;
        iArr[i2] = i;
        int i3 = this.f63490 & (i2 + 1);
        this.f63493 = i3;
        int i4 = this.f63492;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            if (i6 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy(this.f63491, 0, iArr2, i5, this.f63492);
            this.f63491 = iArr2;
            this.f63492 = 0;
            this.f63493 = length;
            this.f63490 = i6 - 1;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m45198() {
        int i = this.f63492;
        if (i == this.f63493) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.f63491[i];
        this.f63492 = (i + 1) & this.f63490;
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45195() {
        this.f63493 = this.f63492;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m45197() {
        return this.f63492 == this.f63493;
    }
}
