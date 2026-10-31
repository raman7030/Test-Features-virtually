package l;

/* JADX INFO: renamed from: l.ᩴۜܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: W6ZV */
/* JADX INFO: loaded from: classes4.dex */
public final class C18598 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f57689;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11459[] f57690;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f57691;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f57692;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11459 m43135(C5606 c5606, CharSequence charSequence, int[] iArr, int[] iArr2) {
        for (int i = 0; i < this.f57692; i++) {
            C11459 c11459 = this.f57690[i];
            if (this.f57691[i] == c5606.m15905() && c5606.m15909(c11459.pattern(), charSequence, iArr, iArr2)) {
                int i2 = this.f57691[i];
                if (i == 0) {
                    return c11459;
                }
                C11459[] c11459Arr = this.f57690;
                System.arraycopy(c11459Arr, 0, c11459Arr, 1, i);
                int[] iArr3 = this.f57691;
                System.arraycopy(iArr3, 0, iArr3, 1, i);
                this.f57690[0] = c11459;
                this.f57691[0] = i2;
                return c11459;
            }
        }
        C11459 c11459M28259 = C11459.m28259(c5606.m15905(), c5606.m15906(charSequence, iArr, iArr2));
        int iM15905 = c5606.m15905();
        if (this.f57690 == null) {
            this.f57690 = new C11459[8];
            this.f57691 = new int[8];
        }
        int length = c11459M28259.pattern().length();
        while (true) {
            int i3 = this.f57692;
            if (i3 == 8 || this.f57689 + length > 16384) {
                C11459[] c11459Arr2 = this.f57690;
                int i4 = i3 - 1;
                this.f57692 = i4;
                C11459 c114510 = c11459Arr2[i4];
                c11459Arr2[i4] = null;
                this.f57689 -= c114510.pattern().length();
            } else {
                C11459[] c11459Arr3 = this.f57690;
                System.arraycopy(c11459Arr3, 0, c11459Arr3, 1, i3);
                int[] iArr4 = this.f57691;
                System.arraycopy(iArr4, 0, iArr4, 1, this.f57692);
                this.f57690[0] = c11459M28259;
                this.f57691[0] = iM15905;
                this.f57692++;
                this.f57689 += length;
                return c11459M28259;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43136() {
        this.f57690 = null;
        this.f57691 = null;
        this.f57692 = 0;
        this.f57689 = 0;
    }
}
