package p067l;

/* JADX INFO: renamed from: l.۬ܽ */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1498 implements InterfaceC18749, InterfaceC1070 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C1428 f42653;

    /* JADX INFO: renamed from: ᩶ */
    public final AbstractC0868 f42654;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC1070 f42655;

    /* JADX INFO: renamed from: ᩹ */
    public final AbstractC9381 f42656;

    public C1498(C1428 c1428, AbstractC9381 abstractC9381, AbstractC0868 abstractC0868) {
        C13045.m29867(abstractC0868, "onBackPressedCallback");
        this.f42653 = c1428;
        this.f42656 = abstractC9381;
        this.f42654 = abstractC0868;
        abstractC9381.mo21806(this);
    }

    @Override // p067l.InterfaceC18749
    /* JADX INFO: renamed from: ֫ */
    public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        if (enumC24133 == EnumC24133.ON_START) {
            this.f42655 = this.f42653.m30940(this.f42654);
            return;
        }
        if (enumC24133 == EnumC24133.ON_STOP) {
            InterfaceC1070 interfaceC1070 = this.f42655;
            if (interfaceC1070 != null) {
                ((C1463) interfaceC1070).cancel();
                return;
            }
            return;
        }
        if (enumC24133 == EnumC24133.ON_DESTROY) {
            cancel();
        }
    }

    @Override // p067l.InterfaceC1070
    public final void cancel() {
        this.f42656.mo21807(this);
        this.f42654.m4608(this);
        InterfaceC1070 interfaceC1070 = this.f42655;
        if (interfaceC1070 != null) {
            ((C1463) interfaceC1070).cancel();
        }
        this.f42655 = null;
    }
}
