package p067l;

/* JADX INFO: renamed from: l.᩵᩵ */
/* JADX INFO: compiled from: L3KT */
/* JADX INFO: loaded from: classes4.dex */
public final class C1817 {

    /* JADX INFO: renamed from: ֫ */
    public int f66112;

    /* JADX INFO: renamed from: ۧ */
    public int[] f66113;

    /* JADX INFO: renamed from: ܽ */
    public int f66114;

    /* JADX INFO: renamed from: ᩳ */
    public int f66115;

    public C1817() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f66112 = iHighestOneBit - 1;
        this.f66113 = new int[iHighestOneBit];
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47493(int i) {
        int[] iArr = this.f66113;
        int i2 = this.f66115;
        iArr[i2] = i;
        int i3 = this.f66112 & (i2 + 1);
        this.f66115 = i3;
        int i4 = this.f66114;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            if (i6 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy(this.f66113, 0, iArr2, i5, this.f66114);
            this.f66113 = iArr2;
            this.f66114 = 0;
            this.f66115 = length;
            this.f66112 = i6 - 1;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m47495() {
        int i = this.f66114;
        if (i == this.f66115) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.f66113[i];
        this.f66114 = (i + 1) & this.f66112;
        return i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47492() {
        this.f66115 = this.f66114;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m47494() {
        return this.f66114 == this.f66115;
    }
}
