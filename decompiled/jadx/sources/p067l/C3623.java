package p067l;

/* JADX INFO: renamed from: l.֨᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8DU */
/* JADX INFO: loaded from: classes2.dex */
public final class C3623 implements InterfaceC9817 {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ int f7499;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC21729 f7500;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ double f7501;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C23070 f7502;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ double f7503;

    public C3623(C23070 c23070, int i, InterfaceC21729 interfaceC21729, double d, double d2) {
        this.f7502 = c23070;
        this.f7499 = i;
        this.f7500 = interfaceC21729;
        this.f7501 = d;
        this.f7503 = d2;
    }

    @Override // p067l.InterfaceC9817
    public final void run() {
        int i = this.f7499;
        C23070 c23070 = this.f7502;
        C17033 c17033M51458 = C23070.m51458(c23070, i);
        InterfaceC22400 interfaceC22400 = c17033M51458.f50372;
        C20388 c20388 = ((C6306) this.f7500).f15929;
        interfaceC22400.mo8715(c20388.f63039);
        C20388.m46033(c20388, interfaceC22400);
        c17033M51458.f50372.mo8714(this.f7501, this.f7503, ((C9226) c23070.m51461()).m21253());
    }
}
