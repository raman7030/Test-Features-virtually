package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩵۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 37P4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20747 {

    /* JADX INFO: renamed from: ֫ */
    public int f64024;

    /* JADX INFO: renamed from: ۧ */
    public C20271 f64025;

    /* JADX INFO: renamed from: ܽ */
    public C20271 f64026;

    /* JADX INFO: renamed from: ֫ */
    public static C4848 m46856(C20747 c20747, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            AbstractC2640 abstractC2640 = (AbstractC2640) it.next();
            if (abstractC2640.f4411 == -1) {
                c20747.m46857(abstractC2640);
            }
        }
        return c20747.f64025.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46857(AbstractC2640 abstractC2640) {
        AbstractC2640 abstractC2641;
        int i = this.f64024;
        abstractC2640.f4411 = i;
        abstractC2640.f4410 = i;
        this.f64024 = i + 1;
        C20271 c20271 = this.f64026;
        c20271.m45781(abstractC2640);
        for (AbstractC2640 abstractC2642 : abstractC2640.mo4028()) {
            if (abstractC2642.f4411 == -1) {
                m46857(abstractC2642);
                abstractC2640.f4410 = Math.min(abstractC2640.f4410, abstractC2642.f4410);
            } else if (c20271.contains(abstractC2642)) {
                abstractC2640.f4410 = Math.min(abstractC2640.f4410, abstractC2642.f4411);
            }
        }
        if (abstractC2640.f4410 == abstractC2640.f4411) {
            C20271 c20272 = new C20271();
            do {
                abstractC2641 = (AbstractC2640) c20271.remove();
                abstractC2641.getClass();
                c20272.m45777(abstractC2641);
            } while (abstractC2641 != abstractC2640);
            this.f64025.m45777((Object) c20272.m45783());
        }
    }
}
