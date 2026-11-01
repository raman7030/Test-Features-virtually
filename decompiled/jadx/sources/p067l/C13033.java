package p067l;

/* JADX INFO: renamed from: l.ۧ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: G67D */
/* JADX INFO: loaded from: classes3.dex */
public final class C13033 {

    /* JADX INFO: renamed from: ֫ */
    public C18396[] f36657 = new C18396[6];

    /* JADX INFO: renamed from: ۧ */
    public int f36658;

    /* JADX INFO: renamed from: ֫ */
    public final C18396[] m29849() {
        int i = this.f36658;
        C18396[] c18396Arr = new C18396[i];
        System.arraycopy(this.f36657, 0, c18396Arr, 0, i);
        return c18396Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29848(C18396 c18396) {
        while (c18396 != null) {
            int i = 0;
            while (true) {
                int i2 = this.f36658;
                if (i < i2) {
                    if (this.f36657[i].f54925.equals(c18396.f54925)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    C18396[] c18396Arr = this.f36657;
                    if (i2 >= c18396Arr.length) {
                        C18396[] c18396Arr2 = new C18396[c18396Arr.length + 6];
                        System.arraycopy(c18396Arr, 0, c18396Arr2, 0, i2);
                        this.f36657 = c18396Arr2;
                    }
                    C18396[] c18396Arr3 = this.f36657;
                    int i3 = this.f36658;
                    this.f36658 = i3 + 1;
                    c18396Arr3[i3] = c18396;
                    break;
                }
            }
            c18396 = c18396.f54924;
        }
    }
}
