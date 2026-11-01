package p067l;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6303 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f15925;

    /* JADX INFO: renamed from: ۧ */
    public HashSet f15926 = new HashSet();

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C20385 f15927;

    /* JADX INFO: renamed from: ֫ */
    public abstract Iterable mo10511(AbstractC21195 abstractC21195);

    public AbstractC6303(C20385 c20385, boolean z) {
        this.f15927 = c20385;
        int i = C4848.f11033;
        this.f15925 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4848 m14312(AbstractC21195 abstractC21195, C4848 c4848) {
        if (abstractC21195 == null || !this.f15926.add(abstractC21195)) {
            return c4848;
        }
        if (this.f15925) {
            C20385 c20385 = this.f15927;
            c4848 = m14312(c20385.f63018.m19502(abstractC21195.f20406).f16705, c4848);
            Iterator it = c20385.f63018.m19450(abstractC21195.f20406).iterator();
            while (it.hasNext()) {
                c4848 = m14312(((AbstractC6462) it.next()).f16705, c4848);
            }
        }
        return c4848.m10290(mo10511(abstractC21195));
    }
}
