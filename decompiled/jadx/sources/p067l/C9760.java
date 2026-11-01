package p067l;

/* JADX INFO: renamed from: l.۟᩺ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9760 implements InterfaceC18588 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AbstractActivityC5549 f26945;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC18588 f26946;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ boolean f26947;

    public /* synthetic */ C9760(InterfaceC18588 interfaceC18588, boolean z, AbstractActivityC5549 abstractActivityC5549) {
        this.f26946 = interfaceC18588;
        this.f26947 = z;
        this.f26945 = abstractActivityC5549;
    }

    @Override // p067l.InterfaceC18588
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo3924() {
        if (this.f26946.mo3924()) {
            return true;
        }
        if (!this.f26947) {
            return false;
        }
        AbstractActivityC5549 abstractActivityC5549 = this.f26945;
        return abstractActivityC5549.isFinishing() || abstractActivityC5549.isDestroyed();
    }
}
