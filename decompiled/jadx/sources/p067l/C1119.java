package p067l;

/* JADX INFO: renamed from: l.ۚ᩷ */
/* JADX INFO: compiled from: 64NR */
/* JADX INFO: loaded from: classes3.dex */
public final class C1119 implements InterfaceC1927 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f20147 = false;

    /* JADX INFO: renamed from: ۧ */
    public int f20148;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ AbstractC0909 f20149;

    public C1119(AbstractC0909 abstractC0909) {
        this.f20149 = abstractC0909;
    }

    @Override // p067l.InterfaceC1927
    /* JADX INFO: renamed from: ֫ */
    public final void mo5940() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f20147 = false;
    }

    @Override // p067l.InterfaceC1927
    public final void onAnimationEnd() {
        if (this.f20147) {
            return;
        }
        AbstractC0909 abstractC0909 = this.f20149;
        abstractC0909.f7690 = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f20148);
    }

    @Override // p067l.InterfaceC1927
    public final void onAnimationCancel() {
        this.f20147 = true;
    }
}
