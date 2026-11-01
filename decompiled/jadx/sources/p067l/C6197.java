package p067l;

/* JADX INFO: renamed from: l.ۘܶᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final class C6197 {

    /* JADX INFO: renamed from: ֫ */
    public C10891 f15599;

    /* JADX INFO: renamed from: ۖ */
    public final /* synthetic */ C23631 f15600;

    /* JADX INFO: renamed from: ۘ */
    public final C14146 f15601;

    /* JADX INFO: renamed from: ۜ */
    public final C24301 f15602;

    /* JADX INFO: renamed from: ۡ */
    public boolean f15603;

    /* JADX INFO: renamed from: ۢ */
    public final String f15604;

    /* JADX INFO: renamed from: ۧ */
    public FutureC5767 f15605;

    /* JADX INFO: renamed from: ܳ */
    public final C11249 f15606;

    /* JADX INFO: renamed from: ܺ */
    public final RunnableC7265 f15607;

    /* JADX INFO: renamed from: ܽ */
    public final FutureC5767 f15608;

    /* JADX INFO: renamed from: ܿ */
    public final C17595 f15609;

    /* JADX INFO: renamed from: ᩳ */
    public FutureC5767 f15610;

    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC9768 f15611;

    /* JADX INFO: renamed from: ᩻ */
    public C21070 f15612;

    /* JADX WARN: Type inference failed for: r2v5, types: [l.ܺܶᩳ] */
    public C6197(C23631 c23631, C24301 c24301) {
        this.f15600 = c23631;
        C14146 c14146 = c23631.f75242;
        this.f15601 = c14146;
        C11249 c11249 = c23631.f8387;
        this.f15606 = c11249;
        this.f15604 = c23631.m7649().f17850.mo25505();
        this.f15608 = new FutureC5767();
        this.f15607 = new RunnableC7265(1, this);
        this.f15609 = new InterfaceC3326() { // from class: l.ܺܶᩳ
            @Override // p067l.InterfaceC3326
            /* JADX INFO: renamed from: ֫ */
            public final void mo4017(Object obj) {
                this.f52588.m14046();
            }
        };
        this.f15602 = c24301;
        InterfaceC9768 interfaceC9768M32500 = null;
        if (c23631.f75236 == null && c23631.f75243 == null && ((c11249 == null || !c11249.m26151()) && c14146 != null)) {
            interfaceC9768M32500 = c14146.m32500();
        }
        this.f15611 = interfaceC9768M32500;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14046() {
        if (this.f15603 || this.f15608.isDone()) {
            return;
        }
        this.f15603 = true;
        C7050.m16212(new RunnableC19037(1, this));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14045(Throwable th) {
        FutureC5767 futureC5767 = this.f15608;
        if (futureC5767.isDone()) {
            return;
        }
        m14044();
        futureC5767.m12891(th);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14044() {
        FutureC5767 futureC5767 = this.f15605;
        if (futureC5767 != null) {
            futureC5767.cancel(false);
        }
        FutureC5767 futureC5768 = this.f15610;
        if (futureC5768 != null) {
            futureC5768.cancel(false);
        }
        C14146 c14146 = this.f15601;
        if (c14146 != null) {
            c14146.m32493(this.f15607);
        }
        C11249 c11249 = this.f15606;
        if (c11249 != null) {
            c11249.m26134(this.f15609);
        }
        C23631 c23631 = this.f15600;
        if (c23631.f75225 == this) {
            c23631.f75225 = null;
        }
    }
}
