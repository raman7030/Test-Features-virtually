package l;

/* JADX INFO: renamed from: l.ۛۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes3.dex */
public final class C6029 extends AbstractC13416 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7067 f18499;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18356 f18500;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6029(C7067 c7067, C23294 c23294, C18356 c18356) {
        super(c23294);
        this.f18499 = c7067;
        this.f18500 = c18356;
    }

    @Override // l.AbstractC13416
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16870(C14163 c14163) {
        this.f18499.m19069(c14163, this.f18500);
    }

    @Override // l.AbstractC13416
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16869(AbstractC5698 abstractC5698) {
        if (abstractC5698.f17559 == EnumC1296.f4567 && abstractC5698.f17561.f17559 == EnumC1296.f4571 && ((C12048) abstractC5698).m29425() == null) {
            C7067 c7067 = this.f18499;
            for (AbstractC24000 abstractC24000M19067 = c7067.m19067(); abstractC24000M19067 != null; abstractC24000M19067 = abstractC24000M19067.f77789) {
                if (abstractC24000M19067.f77786.mo989() == EnumC18550.f57523) {
                    if (c7067.m19048(abstractC24000M19067.f77785, abstractC5698) == null) {
                        return;
                    } else {
                        ((C18356) abstractC24000M19067).m42781(abstractC5698, EnumC21179.CAPTURED_VAR);
                    }
                }
            }
        }
    }
}
