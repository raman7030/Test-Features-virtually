package p067l;

import java.util.BitSet;

/* JADX INFO: renamed from: l.᩹ۡܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZBH4 */
/* JADX INFO: loaded from: classes.dex */
public final class C23453 {

    /* JADX INFO: renamed from: ֫ */
    public int f74695 = 0;

    /* JADX INFO: renamed from: ۧ */
    public final BitSet f74696;

    /* JADX INFO: renamed from: ܽ */
    public boolean f74697;

    /* JADX INFO: renamed from: ܿ */
    public final C21442 f74698;

    /* JADX INFO: renamed from: ᩳ */
    public final C21442 f74699;

    public C23453(C21442 c21442, BitSet bitSet, boolean z) {
        this.f74699 = c21442;
        this.f74696 = bitSet;
        this.f74698 = new C21442(c21442.size());
        this.f74697 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52154(C23453 c23453, int i) {
        C22783 c22783M50983 = (C22783) c23453.f74699.m43238(i);
        BitSet bitSet = c23453.f74696;
        if (bitSet == null || !bitSet.get(i)) {
            c22783M50983 = c22783M50983.m50983(c23453.f74695);
            if (!c23453.f74697) {
                c23453.f74695 = c22783M50983.m50982() + c23453.f74695;
            }
        }
        c23453.f74697 = false;
        c23453.f74698.m43241(i, (Object) c22783M50983);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21442 m52153(C23453 c23453) {
        C21442 c21442 = c23453.f74698;
        if (c23453.f74699.m46002()) {
            c21442.mo22326();
        }
        return c21442;
    }
}
