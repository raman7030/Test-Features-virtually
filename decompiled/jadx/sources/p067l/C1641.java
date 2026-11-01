package p067l;

/* JADX INFO: renamed from: l.ܺᩴ */
/* JADX INFO: compiled from: H56R */
/* JADX INFO: loaded from: classes5.dex */
public final class C1641 extends C3395 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f52810 = false;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C0976 f52811;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ int f52812;

    public C1641(C0976 c0976, int i) {
        this.f52811 = c0976;
        this.f52812 = i;
    }

    @Override // p067l.C3395, p067l.InterfaceC1927
    /* JADX INFO: renamed from: ֫ */
    public final void mo5940() {
        this.f52811.f11248.setVisibility(0);
    }

    @Override // p067l.InterfaceC1927
    public final void onAnimationEnd() {
        if (this.f52810) {
            return;
        }
        this.f52811.f11248.setVisibility(this.f52812);
    }

    @Override // p067l.C3395, p067l.InterfaceC1927
    public final void onAnimationCancel() {
        this.f52810 = true;
    }
}
