package p067l;

/* JADX INFO: renamed from: l.֫ۜ */
/* JADX INFO: compiled from: B54W */
/* JADX INFO: loaded from: classes3.dex */
public final class C0924 extends C3395 {

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C1379 f8531;

    /* JADX INFO: renamed from: ۧ */
    public boolean f8530 = false;

    /* JADX INFO: renamed from: ֫ */
    public int f8529 = 0;

    public C0924(C1379 c1379) {
        this.f8531 = c1379;
    }

    @Override // p067l.C3395, p067l.InterfaceC1927
    /* JADX INFO: renamed from: ֫ */
    public final void mo5940() {
        if (this.f8530) {
            return;
        }
        this.f8530 = true;
        InterfaceC1927 interfaceC1927 = this.f8531.f35527;
        if (interfaceC1927 != null) {
            interfaceC1927.mo5940();
        }
    }

    @Override // p067l.InterfaceC1927
    public final void onAnimationEnd() {
        int i = this.f8529 + 1;
        this.f8529 = i;
        C1379 c1379 = this.f8531;
        if (i == c1379.f35523.size()) {
            InterfaceC1927 interfaceC1927 = c1379.f35527;
            if (interfaceC1927 != null) {
                interfaceC1927.onAnimationEnd();
            }
            this.f8529 = 0;
            this.f8530 = false;
            c1379.m29104();
        }
    }
}
