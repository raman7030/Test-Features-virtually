package l;

/* JADX INFO: renamed from: l.֫ܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: L5M2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1855 extends AbstractC9617 implements InterfaceC11116, InterfaceC0804 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC19475 f6335;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final /* synthetic */ String mo1789() {
        throw null;
    }

    public C1855(C12918 c12918, EnumC0841 enumC0841, int i) {
        super(c12918, enumC0841, i);
        this.f6335 = null;
    }

    @Override // l.InterfaceC6718
    /* JADX INFO: renamed from: ᩻ */
    public final int mo3615() {
        return AbstractC10494.m26388(this.f29163.m31418().m11942(this.f29164 + 1));
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ᩳ */
    public final int mo3614() {
        return this.f29163.m31418().m11942(this.f29164 + 4) & 15;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ܽ */
    public final int mo3612() {
        return AbstractC10494.m26388(this.f29163.m31418().m11942(this.f29164 + 4));
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ܳ */
    public final int mo3611() {
        return this.f29163.m31418().m11942(this.f29164 + 5) & 15;
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ܿ */
    public final int mo3613() {
        return AbstractC10494.m26388(this.f29163.m31418().m11942(this.f29164 + 5));
    }

    @Override // l.InterfaceC9978
    /* JADX INFO: renamed from: ۧ */
    public final int mo3610() {
        return this.f29163.m31418().m11942(this.f29164 + 1) & 15;
    }

    @Override // l.InterfaceC10952
    public final InterfaceC8293 getReference() {
        AbstractC19475 abstractC19475 = this.f6335;
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

    @Override // l.InterfaceC0804
    /* JADX INFO: renamed from: ֫ */
    public final void mo3030(C19357 c19357) {
        this.f6335 = (AbstractC19475) c19357.m44609(getReference());
    }
}
