package p067l;

import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۟᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9655 {

    /* JADX INFO: renamed from: ֫ */
    public C13679 f26586;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC7783 f26587;

    /* JADX INFO: renamed from: ֫ */
    public abstract Iterable mo22455(Predicate predicate, EnumC3620 enumC3620);

    /* JADX INFO: renamed from: ֫ */
    public abstract Iterable mo22457(AbstractC12224 abstractC12224, Predicate predicate, EnumC3620 enumC3620);

    /* JADX INFO: renamed from: ֫ */
    public abstract AbstractC9655 mo22459(AbstractC7783 abstractC7783);

    /* JADX INFO: renamed from: ֫ */
    public abstract boolean mo22461(C20149 c20149);

    public AbstractC9655(AbstractC7783 abstractC7783) {
        C13679 c13679 = new C13679();
        c13679.f38554 = C4848.m10283();
        this.f26586 = c13679;
        this.f26587 = abstractC7783;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Iterable m22456(AbstractC12224 abstractC12224) {
        return mo22457(abstractC12224, null, EnumC3620.RECURSIVE);
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC7783 mo22458(AbstractC12224 abstractC12224, Predicate predicate) {
        Iterator it = mo22457(abstractC12224, predicate, EnumC3620.RECURSIVE).iterator();
        if (it.hasNext()) {
            return (AbstractC7783) it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public boolean mo22462(AbstractC7783 abstractC7783) {
        return mo22457(abstractC7783.f20408, new C9635(abstractC7783), EnumC3620.RECURSIVE).iterator().hasNext();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m22460() {
        return !mo22455((Predicate) null, EnumC3620.NON_RECURSIVE).iterator().hasNext();
    }
}
