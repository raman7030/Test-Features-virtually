package l;

/* JADX INFO: renamed from: l.ۘܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final class C4028 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8967 f12784;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22372 f12785;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C12392 f12786;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C23077 f12787;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f12788;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String f12789;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public FutureC3575 f12790;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9344 f12791;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final RunnableC5152 f12792;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 f12793;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C16021 f12794;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public FutureC3575 f12795;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f12796;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C19677 f12797;

    /* JADX WARN: Type inference failed for: r2v5, types: [l.ܺܶᩳ] */
    public C4028(C22372 c22372, C23077 c23077) {
        this.f12785 = c22372;
        C12392 c12392 = c22372.f72517;
        this.f12786 = c12392;
        C9344 c9344 = c22372.f5607;
        this.f12791 = c9344;
        this.f12789 = c22372.m5420().f15019.mo23554();
        this.f12793 = new FutureC3575();
        this.f12792 = new RunnableC5152(1, this);
        this.f12794 = new InterfaceC1008() { // from class: l.ܺܶᩳ
            @Override // l.InterfaceC1008
            /* JADX INFO: renamed from: ֫ */
            public final void mo1617(Object obj) {
                this.f49425.m12126();
            }
        };
        this.f12787 = c23077;
        InterfaceC7785 interfaceC7785M30436 = null;
        if (c22372.f72511 == null && c22372.f72518 == null && ((c9344 == null || !c9344.m24142()) && c12392 != null)) {
            interfaceC7785M30436 = c12392.m30436();
        }
        this.f12796 = interfaceC7785M30436;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12126() {
        if (this.f12788 || this.f12793.isDone()) {
            return;
        }
        this.f12788 = true;
        C4925.m14315(new RunnableC17538(1, this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12125(Throwable th) {
        FutureC3575 futureC3575 = this.f12793;
        if (futureC3575.isDone()) {
            return;
        }
        m12124();
        futureC3575.m10914(th);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12124() {
        FutureC3575 futureC3575 = this.f12790;
        if (futureC3575 != null) {
            futureC3575.cancel(false);
        }
        FutureC3575 futureC3576 = this.f12795;
        if (futureC3576 != null) {
            futureC3576.cancel(false);
        }
        C12392 c12392 = this.f12786;
        if (c12392 != null) {
            c12392.m30429(this.f12792);
        }
        C9344 c9344 = this.f12791;
        if (c9344 != null) {
            c9344.m24125(this.f12794);
        }
        C22372 c22372 = this.f12785;
        if (c22372.f72500 == this) {
            c22372.f72500 = null;
        }
    }
}
