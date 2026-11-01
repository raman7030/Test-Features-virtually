package p067l;

import java.util.Map;

/* JADX INFO: renamed from: l.ᩳ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes5.dex */
public final class C19734 extends AbstractC18392 {

    /* JADX INFO: renamed from: ᩳ֫ */
    public final /* synthetic */ C7664 f60026;

    @Override // p067l.AbstractC18392
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC18392 mo10549(C4036 c4036, AbstractC14355 abstractC14355) {
        C10332 c10332 = (C10332) this.f54918;
        Map map = this.f54919;
        return new C19734(this.f60026, (C10332) abstractC14355, c4036, c10332, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19734(C7664 c7664, C10332 c10332, C4036 c4036, C10332 c10333, Map map) {
        super(c7664, c10332, c4036, c10333, map);
        this.f60026 = c7664;
    }

    @Override // p067l.AbstractC18392
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462 mo20830(C24626 c24626) {
        C7664 c7664 = this.f60026;
        C11216 c11216 = c7664.f20102;
        InterfaceC6125 interfaceC6125 = c24626.f77961;
        AbstractC6462 abstractC6462 = c24626.f77965;
        c11216.getClass();
        C24626 c24626Mo40739 = c24626.mo40739(new C21314(c11216, interfaceC6125));
        AbstractC14355 abstractC14355 = this.f54918;
        C10332 c10332 = (C10332) abstractC14355;
        if (c10332.mo14738()) {
            return c24626Mo40739.mo15456(abstractC14355, c10332.f18925);
        }
        if (abstractC6462.m14777(EnumC11353.VOID)) {
            c24626.f77961.mo3480(this.f6819, c7664.f20102.f31159.m18543(C13665.f38453));
            return c7664.f20102.f31200.m19475(abstractC6462);
        }
        AbstractC14355 abstractC14356 = c10332.f28612;
        C7664.m17733(abstractC14356, abstractC14356.f18925, c24626Mo40739);
        AbstractC14355 abstractC14357 = c10332.f28613;
        C7664.m17733(abstractC14357, abstractC14357.f18925, c24626Mo40739);
        return c24626Mo40739.f77965;
    }
}
