package p067l;

import android.util.SparseArray;

/* JADX INFO: renamed from: l.ۚ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78R7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7467 {

    /* JADX INFO: renamed from: ֫ */
    public final SparseArray f19545;

    /* JADX INFO: renamed from: ۧ */
    public final C7625 f19546;

    public C7467(C7625 c7625, SparseArray sparseArray) {
        this.f19546 = c7625;
        SparseArray sparseArray2 = new SparseArray(c7625.m17589());
        for (int i = 0; i < c7625.m17589(); i++) {
            int iM17592 = c7625.m17592(i);
            C2772 c2772 = (C2772) sparseArray.get(iM17592);
            c2772.getClass();
            sparseArray2.append(iM17592, c2772);
        }
        this.f19545 = sparseArray2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C2772 m17238(int i) {
        C2772 c2772 = (C2772) this.f19545.get(i);
        c2772.getClass();
        return c2772;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m17236(int i) {
        return this.f19546.m17590(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m17235() {
        return this.f19546.m17589();
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m17237(int i) {
        return this.f19546.m17592(i);
    }
}
