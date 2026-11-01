package p067l;

/* JADX INFO: renamed from: l.ۨܿ */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C1429 extends C3395 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ RunnableC1989 f38315;

    public C1429(RunnableC1989 runnableC1989) {
        this.f38315 = runnableC1989;
    }

    @Override // p067l.C3395, p067l.InterfaceC1927
    /* JADX INFO: renamed from: ֫ */
    public final void mo5940() {
        this.f38315.f77113.f19678.setVisibility(0);
    }

    @Override // p067l.InterfaceC1927
    public final void onAnimationEnd() {
        LayoutInflaterFactory2C1110 layoutInflaterFactory2C1110 = this.f38315.f77113;
        layoutInflaterFactory2C1110.f19678.setAlpha(1.0f);
        layoutInflaterFactory2C1110.f19672.m38762((InterfaceC1927) null);
        layoutInflaterFactory2C1110.f19672 = null;
    }
}
