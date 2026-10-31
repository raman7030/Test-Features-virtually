package l;

/* JADX INFO: renamed from: l.ۨܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 422Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C11836 extends C1080 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC23124 f35310;

    public C11836(RunnableC23124 runnableC23124) {
        this.f35310 = runnableC23124;
    }

    @Override // l.C1080, l.InterfaceC21882
    /* JADX INFO: renamed from: ֫ */
    public final void mo3669() {
        this.f35310.f74367.f16840.setVisibility(0);
    }

    @Override // l.InterfaceC21882
    public final void onAnimationEnd() {
        LayoutInflaterFactory2C5402 layoutInflaterFactory2C5402 = this.f35310.f74367;
        layoutInflaterFactory2C5402.f16840.setAlpha(1.0f);
        layoutInflaterFactory2C5402.f16834.m36602((InterfaceC21882) null);
        layoutInflaterFactory2C5402.f16834 = null;
    }
}
