package p067l;

/* JADX INFO: renamed from: l.᩸ۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: V702 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22805 implements InterfaceC6515 {

    /* JADX INFO: renamed from: ֫ */
    public final C13929 f71857;

    /* JADX INFO: renamed from: ۧ */
    public final int f71858;

    /* JADX INFO: renamed from: ܽ */
    public final C14262 f71859;

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C5370 f71860;

    public C22805(C5370 c5370, C14262 c14262, C13929 c13929, int i) {
        this.f71860 = c5370;
        this.f71859 = c14262;
        this.f71857 = c13929;
        this.f71858 = i;
    }

    @Override // p067l.InterfaceC6515
    /* JADX INFO: renamed from: ֫ */
    public final int mo14943() {
        C5370 c5370 = this.f71860;
        C3358 c3358 = c5370.f12698;
        c3358.f6576 = this.f71858;
        C13929 c13929 = this.f71857;
        c3358.f6570 = c13929.start();
        c3358.f6574 = c13929.end();
        c3358.f6582 = -1;
        c3358.f6620 = -1;
        c5370.m11652(c3358, this.f71859, c13929);
        return c3358.f6620;
    }
}
