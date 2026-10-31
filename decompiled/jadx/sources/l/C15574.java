package l;

/* JADX INFO: renamed from: l.ܺ֡֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes5.dex */
public final class C15574 extends C3581 implements InterfaceC8090 {

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public boolean f47987;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public AbstractC5698 f47988;

    @Override // l.C3581, l.AbstractC5698, l.InterfaceC21496
    /* JADX INFO: renamed from: ۘ */
    public final int mo953() {
        return 15;
    }

    @Override // l.C3581
    /* JADX INFO: renamed from: ᩹֫ */
    public final C15574 mo10967() {
        return this;
    }

    public C15574(AbstractC5698 abstractC5698, boolean z) {
        super(abstractC5698.f17563, abstractC5698.f17562, abstractC5698.f17560, abstractC5698.f17561);
        this.f47988 = abstractC5698;
        this.f47987 = z;
    }

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public final int m36708() {
        AbstractC5698 abstractC5698 = this.f47988;
        if (abstractC5698.f17559 == EnumC1296.f4567) {
            if (this.f47987) {
                return abstractC5698.mo15572() ? 2 : 1;
            }
            return abstractC5698.mo15572() ? 4 : 3;
        }
        if (abstractC5698.m16075()) {
            return 8;
        }
        if (abstractC5698.mo15572()) {
            return 6;
        }
        if ((abstractC5698.mo16084() & 2) != 0) {
            AbstractC5698 abstractC5699 = this;
            while (abstractC5699 != null && !(abstractC5699 instanceof C21926)) {
                abstractC5699 = abstractC5699.f17561;
            }
            if (abstractC5699 == null || !((C21926) abstractC5699).f70206) {
                return 7;
            }
        }
        return abstractC5698.m16071().m16070() ? 9 : 5;
    }

    @Override // l.AbstractC5698, l.InterfaceC21496
    /* JADX INFO: renamed from: ֫ */
    public final Object mo3574(C6319 c6319) {
        return new C23069(this.f47988, Integer.valueOf(m36708()));
    }

    @Override // l.AbstractC5698
    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC5698 mo7048() {
        return this.f47988;
    }
}
