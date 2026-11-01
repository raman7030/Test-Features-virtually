package p067l;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩵᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes5.dex */
public final class C21076 extends AbstractC18392 {

    /* JADX INFO: renamed from: ܿ֫ */
    public C18189 f66215;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final /* synthetic */ C7664 f66216;

    @Override // p067l.AbstractC18392
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC18392 mo10549(C4036 c4036, AbstractC14355 abstractC14355) {
        C15164 c15164 = (C15164) this.f54918;
        Map map = this.f54919;
        return new C21076(this.f66216, (C15164) abstractC14355, c4036, c15164, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21076(C7664 c7664, C15164 c15164, C4036 c4036, C15164 c15165, Map map) {
        super(c7664, c15164, c4036, c15165, map);
        this.f66216 = c7664;
        this.f66215 = C18189.empty();
    }

    @Override // p067l.AbstractC18392
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462 mo20830(C24626 c24626) {
        C7664 c7664 = this.f66216;
        C11216 c11216 = c7664.f20102;
        InterfaceC6125 interfaceC6125 = c24626.f77961;
        c11216.getClass();
        C24626 c24626Mo40739 = c24626.mo40739(new C21314(c11216, interfaceC6125));
        AbstractC6462 abstractC6462 = c24626.f77965;
        if (abstractC6462.m14777(EnumC11353.VOID)) {
            c24626.f77961.mo3480(this.f6819, c7664.f20102.f31159.m18543(C13665.f38469));
            return c7664.f20102.f31200.m19475(abstractC6462);
        }
        Iterator it = ((C4848) this.f66215.orElseGet(new Supplier() { // from class: l.ۘ᩶֨
            @Override // java.util.function.Supplier
            public final Object get() {
                C20271 c20271 = new C20271();
                C21076 c21076 = this.f16389;
                new C20405(c21076, c20271).m35992(((C15164) c21076.f54918).f43269);
                C4848 c4848M45783 = c20271.m45783();
                c21076.f66215 = C18189.m41402of(c4848M45783);
                return c4848M45783;
            }
        })).iterator();
        while (it.hasNext()) {
            AbstractC14355 abstractC14355 = ((C4575) it.next()).f10248;
            C7664.m17733(abstractC14355, abstractC14355.f18925, c24626);
        }
        return c24626Mo40739.f77965;
    }
}
