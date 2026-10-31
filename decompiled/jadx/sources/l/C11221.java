package l;

/* JADX INFO: renamed from: l.ۧ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes3.dex */
public final class C11221 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C16864[] f33658 = new C16864[6];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f33659;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16864[] m27787() {
        int i = this.f33659;
        C16864[] c16864Arr = new C16864[i];
        System.arraycopy(this.f33658, 0, c16864Arr, 0, i);
        return c16864Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27786(C16864 c16864) {
        while (c16864 != null) {
            int i = 0;
            while (true) {
                int i2 = this.f33659;
                if (i < i2) {
                    if (this.f33658[i].f51745.equals(c16864.f51745)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    C16864[] c16864Arr = this.f33658;
                    if (i2 >= c16864Arr.length) {
                        C16864[] c16864Arr2 = new C16864[c16864Arr.length + 6];
                        System.arraycopy(c16864Arr, 0, c16864Arr2, 0, i2);
                        this.f33658 = c16864Arr2;
                    }
                    C16864[] c16864Arr3 = this.f33658;
                    int i3 = this.f33659;
                    this.f33659 = i3 + 1;
                    c16864Arr3[i3] = c16864;
                    break;
                }
            }
            c16864 = c16864.f51744;
        }
    }
}
