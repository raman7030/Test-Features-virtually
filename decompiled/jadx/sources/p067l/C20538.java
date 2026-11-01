package p067l;

/* JADX INFO: renamed from: l.᩵֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20538 implements InterfaceC20853 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f63460 = false;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AbstractActivityC3102 f63461;

    public C20538(AbstractActivityC3102 abstractActivityC3102) {
        this.f63461 = abstractActivityC3102;
    }

    @Override // p067l.InterfaceC20853
    /* JADX INFO: renamed from: ֫ */
    public final void mo5042(boolean z) {
        AbstractActivityC3102 abstractActivityC3102 = this.f63461;
        if (abstractActivityC3102.f5635 != null) {
            this.f63460 = abstractActivityC3102.f5635.isEnabled();
        }
        if (z == this.f63460) {
            return;
        }
        if (abstractActivityC3102.f5635 != null) {
            abstractActivityC3102.f5635.setEnabled(z);
        }
        this.f63460 = z;
        String strMo5280 = abstractActivityC3102.mo5280();
        if (z) {
            strMo5280 = C17588.m40053(strMo5280, "*");
        }
        abstractActivityC3102.setTitle(strMo5280);
    }

    @Override // p067l.InterfaceC20853
    /* JADX INFO: renamed from: ֫ */
    public final void mo5043(boolean z, boolean z2) {
        AbstractActivityC3102 abstractActivityC3102 = this.f63461;
        if (abstractActivityC3102.f5633 != null) {
            abstractActivityC3102.f5633.setEnabled(z);
        }
        if (abstractActivityC3102.f5636 != null) {
            abstractActivityC3102.f5636.setEnabled(z2);
        }
    }
}
