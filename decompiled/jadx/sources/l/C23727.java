package l;

/* JADX INFO: renamed from: l.᩻ܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: E4MM */
/* JADX INFO: loaded from: classes2.dex */
public final class C23727 extends AbstractC9617 implements InterfaceC6882, InterfaceC0804 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public AbstractC19475 f76834;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC19475 f76835;

    @Override // l.InterfaceC22677
    /* JADX INFO: renamed from: ֨ */
    public final /* synthetic */ String mo1789() {
        throw null;
    }

    public C23727(C12918 c12918, EnumC0841 enumC0841, int i) {
        super(c12918, enumC0841, i);
        this.f76835 = null;
        this.f76834 = null;
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
        AbstractC19475 abstractC19475 = this.f76835;
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
        AbstractC19475 abstractC19475 = this.f76834;
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
        this.f76835 = (AbstractC19475) c19357.m44609(getReference());
        this.f76834 = (AbstractC19475) c19357.m44609(mo9710());
    }
}
