package p067l;

/* JADX INFO: renamed from: l.ᩴۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6ZV */
/* JADX INFO: loaded from: classes4.dex */
public final class C20044 {

    /* JADX INFO: renamed from: ֫ */
    public int f60911;

    /* JADX INFO: renamed from: ۧ */
    public C13259[] f60912;

    /* JADX INFO: renamed from: ܽ */
    public int[] f60913;

    /* JADX INFO: renamed from: ᩳ */
    public int f60914;

    /* JADX INFO: renamed from: ֫ */
    public final C13259 m45400(C7697 c7697, CharSequence charSequence, int[] iArr, int[] iArr2) {
        for (int i = 0; i < this.f60914; i++) {
            C13259 c13259 = this.f60912[i];
            if (this.f60913[i] == c7697.m17826() && c7697.m17830(c13259.pattern(), charSequence, iArr, iArr2)) {
                int i2 = this.f60913[i];
                if (i == 0) {
                    return c13259;
                }
                C13259[] c13259Arr = this.f60912;
                System.arraycopy(c13259Arr, 0, c13259Arr, 1, i);
                int[] iArr3 = this.f60913;
                System.arraycopy(iArr3, 0, iArr3, 1, i);
                this.f60912[0] = c13259;
                this.f60913[0] = i2;
                return c13259;
            }
        }
        C13259 c13259M30303 = C13259.m30303(c7697.m17826(), c7697.m17827(charSequence, iArr, iArr2));
        int iM17826 = c7697.m17826();
        if (this.f60912 == null) {
            this.f60912 = new C13259[8];
            this.f60913 = new int[8];
        }
        int length = c13259M30303.pattern().length();
        while (true) {
            int i3 = this.f60914;
            if (i3 == 8 || this.f60911 + length > 16384) {
                C13259[] c13259Arr2 = this.f60912;
                int i4 = i3 - 1;
                this.f60914 = i4;
                C13259 c132510 = c13259Arr2[i4];
                c13259Arr2[i4] = null;
                this.f60911 -= c132510.pattern().length();
            } else {
                C13259[] c13259Arr3 = this.f60912;
                System.arraycopy(c13259Arr3, 0, c13259Arr3, 1, i3);
                int[] iArr4 = this.f60913;
                System.arraycopy(iArr4, 0, iArr4, 1, this.f60914);
                this.f60912[0] = c13259M30303;
                this.f60913[0] = iM17826;
                this.f60914++;
                this.f60911 += length;
                return c13259M30303;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m45401() {
        this.f60912 = null;
        this.f60913 = null;
        this.f60914 = 0;
        this.f60911 = 0;
    }
}
