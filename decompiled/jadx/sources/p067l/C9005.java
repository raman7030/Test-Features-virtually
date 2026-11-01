package p067l;

import java.util.Map;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۜ᩶֨, reason: contains not printable characters */
/* JADX INFO: compiled from: I7LP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9005 extends AbstractC18392 {

    /* JADX INFO: renamed from: ܳ֫ */
    public final /* synthetic */ C7664 f24409;

    /* JADX INFO: renamed from: ܿ֫ */
    public C18189 f24410;

    /* JADX INFO: renamed from: ᩳ֫ */
    public C18189 f24411;

    @Override // p067l.AbstractC18392
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC18392 mo10549(C4036 c4036, AbstractC14355 abstractC14355) {
        C15834 c15834 = (C15834) this.f54918;
        Map map = this.f54919;
        return new C9005(this.f24409, (C15834) abstractC14355, c4036, c15834, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9005(C7664 c7664, C15834 c15834, C4036 c4036, C15834 c15835, Map map) {
        super(c7664, c15834, c4036, c15835, map);
        this.f24409 = c7664;
        this.f24411 = C18189.empty();
        this.f24410 = C18189.empty();
    }

    @Override // p067l.AbstractC18392
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC6462 mo20830(C24626 c24626) {
        try {
            C8533 c8533M25947 = this.f24409.f20102.m25947((AbstractC6448) this.f54918, c24626, (C4848) this.f24411.orElseGet(new Supplier() { // from class: l.ܿ᩶֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    C9005 c9005 = this.f56874;
                    C4848 c4848M21400 = C9268.m21400(((C15834) c9005.f54918).f45863);
                    c9005.f24411 = C18189.m41402of(c4848M21400);
                    return c4848M21400;
                }
            }));
            AbstractC6462 abstractC6462 = c8533M25947.f22894;
            AbstractC6462 abstractC6463 = c8533M25947.f22895;
            m20829(abstractC6462, c24626);
            return abstractC6463;
        } catch (C8194 e) {
            c24626.f77961.mo3480(null, e.m18981());
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m20829(AbstractC6462 abstractC6462, C24626 c24626) {
        InterfaceC6125 interfaceC6125 = c24626.f77961;
        C7664 c7664 = this.f24409;
        C11216 c11216 = c7664.f20102;
        C15834 c15834 = (C15834) this.f54918;
        C24626 c24626M25950 = c11216.m25950(c15834, abstractC6462, c24626);
        int i = C13029.f36655[c15834.m35951().ordinal()];
        if (i == 1) {
            AbstractC7257 abstractC7257 = c15834.f45864;
            C7664.m17733(abstractC7257, abstractC7257.f18925, c24626M25950);
        } else if (i == 2) {
            for (C11813 c11813 : (C4848) this.f24410.orElseGet(new Supplier() { // from class: l.ܳ᩶֨
                @Override // java.util.function.Supplier
                public final Object get() {
                    C20271 c20271 = new C20271();
                    C25098 c25098 = new C25098(c20271);
                    C9005 c9005 = this.f48136;
                    c25098.mo12739(((C15834) c9005.f54918).f45864);
                    C4848 c4848M45783 = c20271.m45783();
                    c9005.f24410 = C18189.m41402of(c4848M45783);
                    return c4848M45783;
                }
            })) {
                AbstractC6462 abstractC6463 = c24626M25950.f77965;
                InterfaceC6125 interfaceC6126 = c24626M25950.f77961;
                EnumC11353 enumC11353 = EnumC11353.VOID;
                if (abstractC6463.m14777(enumC11353) && c11813.f32975 != null) {
                    c15834.getClass();
                    interfaceC6126.mo3480(c15834, c7664.f20106.m18548("unexpected.ret.val", new Object[0]));
                } else if (!c24626M25950.f77965.m14777(enumC11353)) {
                    if (c11813.f32975 == null) {
                        c15834.getClass();
                        interfaceC6126.mo3480(c15834, c7664.f20106.m18548("missing.ret.val", new Object[0]));
                    }
                    AbstractC14355 abstractC14355 = c11813.f32975;
                    C7664.m17733(abstractC14355, abstractC14355.f18925, c24626M25950);
                }
            }
        }
        c7664.f20102.m25958(c15834, abstractC6462, interfaceC6125);
    }
}
