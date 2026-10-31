package l;

/* JADX INFO: renamed from: l.ۜܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: D4MB */
/* JADX INFO: loaded from: classes3.dex */
public final class C6794 extends AbstractC9617 implements InterfaceC20994, InterfaceC0804 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC19475 f21082;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC19475 f21083;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final /* synthetic */ String mo1789() {
        throw null;
    }

    public C6794(C12918 c12918, EnumC0841 enumC0841, int i) {
        super(c12918, enumC0841, i);
        this.f21083 = null;
        this.f21082 = null;
    }

    @Override // l.InterfaceC6718
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3615() {
        return this.f29163.m31418().m11942(this.f29164 + 1);
    }

    @Override // l.InterfaceC16595
    /* JADX INFO: renamed from: ᩴ */
    public final int mo9712() {
        return this.f29163.m31418().m11936(this.f29164 + 4);
    }

    @Override // l.InterfaceC10952
    public final InterfaceC8293 getReference() {
        AbstractC19475 abstractC19475 = this.f21083;
        if (abstractC19475 != null) {
            return abstractC19475;
        }
        int i = this.f29162.f3318;
        C12918 c12918 = this.f29163;
        return AbstractC2143.m7069(c12918, i, c12918.m31418().m11936(this.f29164 + 2));
    }

    @Override // l.InterfaceC10952
    /* JADX INFO: renamed from: ֡ */
    public final int mo3609() {
        return this.f29162.f3318;
    }

    @Override // l.InterfaceC12799
    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC8293 mo9710() {
        AbstractC19475 abstractC19475 = this.f21082;
        if (abstractC19475 != null) {
            return abstractC19475;
        }
        int i = this.f29162.f3317;
        C12918 c12918 = this.f29163;
        return AbstractC2143.m7069(c12918, i, c12918.m31418().m11936(this.f29164 + 6));
    }

    @Override // l.InterfaceC12799
    /* JADX INFO: renamed from: ۠ */
    public final int mo9711() {
        return this.f29162.f3317;
    }

    @Override // l.InterfaceC0804
    /* JADX INFO: renamed from: ֫ */
    public final void mo3030(C19357 c19357) {
        this.f21083 = (AbstractC19475) c19357.m44609(getReference());
        this.f21082 = (AbstractC19475) c19357.m44609(mo9710());
    }
}
