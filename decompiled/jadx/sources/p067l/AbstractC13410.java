package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G7LX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13410 extends AbstractC4002 {
    /* JADX INFO: renamed from: ֫ */
    public abstract void mo30558(AbstractC3094 abstractC3094, C4848 c4848, boolean z, AbstractC6462 abstractC6462);

    @Override // p067l.AbstractC4002
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9701 mo7981(C11674 c11674) {
        AbstractC14355 abstractC14355 = c11674.f32571;
        AbstractC14355 abstractC14356 = c11674.f32570;
        C4848 c4848M10283 = C4848.m10283();
        C4848 c4848M7978 = AbstractC4002.m7978(abstractC14355);
        c4848M10283.getClass();
        C4848 c4848M10292 = c4848M7978.m10292(c4848M10283);
        C4848 c4848M7979 = AbstractC4002.m7978(abstractC14356);
        c4848M10292.getClass();
        C4848 c4848M10293 = c4848M7979.m10292(c4848M10292);
        AbstractC14355 abstractC14357 = c11674.f32571;
        AbstractC9701 abstractC9701M34451 = this.f8727.m34451(abstractC14357.f18925, abstractC14357);
        abstractC9701M34451.mo19301();
        abstractC9701M34451.mo8027();
        mo30558(c11674, c4848M10293, false, c11674.f18925);
        return abstractC9701M34451;
    }

    @Override // p067l.AbstractC4002
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9701 mo7980(C11003 c11003) {
        AbstractC14355 abstractC14355 = c11003.f30470;
        AbstractC14355 abstractC14356 = c11003.f30469;
        C4848 c4848M10283 = C4848.m10283();
        C4848 c4848M7978 = AbstractC4002.m7978(abstractC14355);
        c4848M10283.getClass();
        C4848 c4848M10292 = c4848M7978.m10292(c4848M10283);
        C4848 c4848M7979 = AbstractC4002.m7978(abstractC14356);
        c4848M10292.getClass();
        mo30558(c11003, c4848M7979.m10292(c4848M10292), true, c11003.f18925);
        return this.f8727.m34467().m36601(this.f8729.f69215);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4848 m30557(C4848 c4848) {
        C20271 c20271 = new C20271();
        C20271 c20272 = new C20271();
        Iterator it = c4848.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC7257 abstractC7257 = (AbstractC7257) it.next();
            int i2 = (abstractC7257.f18925.mo5577() == EnumC11353.LONG || abstractC7257.f18925.mo5577() == EnumC11353.DOUBLE) ? 2 : 1;
            if (i + i2 >= 200) {
                c20271.m45777((Object) c20272.m45783());
                c20272.clear();
                i = 0;
            }
            c20272.m45777(abstractC7257);
            i += i2;
        }
        if (!c20272.isEmpty()) {
            c20271.m45777((Object) c20272.m45783());
        }
        return c20271.m45783();
    }
}
