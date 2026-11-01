package p067l;

/* JADX INFO: renamed from: l.۠ܰᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C10180 {

    /* JADX INFO: renamed from: ֫ */
    public final int f28232;

    /* JADX INFO: renamed from: ۧ */
    public char[] f28233;

    /* JADX INFO: renamed from: ܳ */
    public final int f28234;

    /* JADX INFO: renamed from: ܽ */
    public final int[] f28235;

    /* JADX INFO: renamed from: ܿ */
    public final C7498 f28236;

    /* JADX INFO: renamed from: ᩳ */
    public int[] f28237;

    public C10180(C7498 c7498, int i, int i2) {
        this.f28236 = c7498;
        this.f28232 = i;
        this.f28234 = i2;
        this.f28235 = new int[c7498.f19638.length + 1];
        for (int i3 = 0; i3 < c7498.f19641; i3++) {
            if (i3 < i || i3 >= i2) {
                int i4 = i3 + 1;
                int iM17314 = c7498.m17314(i3) - c7498.m17316(i3);
                int[] iArr = this.f28235;
                iArr[i3] = iArr[i3] + iM17314;
                iArr[i4] = iArr[i4] - iM17314;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m23743() {
        int iM17314;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C7498 c7498 = this.f28236;
            int i4 = c7498.f19641;
            int[] iArr = this.f28235;
            if (i >= i4) {
                iArr[i4] = i2;
                if (i2 == 0) {
                    return;
                }
                this.f28233 = new char[i2];
                this.f28237 = (int[]) iArr.clone();
                for (int i5 = 0; i5 < c7498.f19641; i5++) {
                    if ((i5 < this.f28232 || i5 >= this.f28234) && (iM17314 = c7498.m17314(i5) - c7498.m17316(i5)) != 0) {
                        System.arraycopy(c7498.f19639, c7498.m17316(i5), this.f28233, iArr[i5], iM17314);
                    }
                }
                return;
            }
            i3 += iArr[i];
            iArr[i] = i2;
            long j = ((long) i2) + ((long) i3);
            i2 = (int) j;
            if (j != i2) {
                throw new ArithmeticException();
            }
            i++;
        }
    }
}
