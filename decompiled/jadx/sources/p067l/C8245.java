package p067l;

/* JADX INFO: renamed from: l.ۛܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BF0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8245 extends C19034 {

    /* JADX INFO: renamed from: ᩶ */
    public static final C8245 f21845 = new C8245(0);

    /* JADX INFO: renamed from: ֫ */
    public static C8245 m19036(C8245 c8245, C8245 c8246) {
        if (c8245 == f21845) {
            return c8246;
        }
        int size = c8245.size();
        int size2 = c8246.size();
        C8245 c8247 = new C8245(size + size2);
        for (int i = 0; i < size; i++) {
            c8247.m43241(i, (C12269) c8245.m43238(i));
        }
        for (int i2 = 0; i2 < size2; i2++) {
            c8247.m43241(size + i2, (C12269) c8246.m43238(i2));
        }
        return c8247;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19037(int i, int i2, int i3) {
        m43241(i, new C12269(i2, i3));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m19038(int i) {
        int size = size();
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            C12269 c12269 = (C12269) m43238(i4);
            int iM28287 = c12269.m28287();
            if (iM28287 <= i && iM28287 > i2) {
                int iM28286 = c12269.m28286();
                if (iM28287 == i) {
                    return iM28286;
                }
                i3 = iM28286;
                i2 = iM28287;
            }
        }
        return i3;
    }
}
