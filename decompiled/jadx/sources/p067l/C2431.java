package p067l;

/* JADX INFO: renamed from: l.֡֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes2.dex */
public final class C2431 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public boolean f3751;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractActivityC3102 f3752;

    public C2431(AbstractActivityC3102 abstractActivityC3102) {
        this.f3752 = abstractActivityC3102;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        AbstractActivityC3102 abstractActivityC3102 = this.f3752;
        abstractActivityC3102.f5639.m32378(abstractActivityC3102.f5641, true, false);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        AbstractActivityC3102 abstractActivityC3102 = this.f3752;
        abstractActivityC3102.f5639.m32369(abstractActivityC3102.mo5281(), new C11308());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        AbstractActivityC3102 abstractActivityC3102 = this.f3752;
        abstractActivityC3102.f5639.m32424();
        abstractActivityC3102.f5639.m32520(false);
        abstractActivityC3102.f5639.m32367();
        if (abstractActivityC3102.f5636 != null) {
            abstractActivityC3102.f5636.setEnabled(false);
        }
        if (abstractActivityC3102.f5633 != null) {
            abstractActivityC3102.f5633.setEnabled(false);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f3751 = true;
        AbstractActivityC3102 abstractActivityC3102 = this.f3752;
        abstractActivityC3102.f5639.setEnabled(false);
        abstractActivityC3102.f5639.m32520(false);
        abstractActivityC3102.f5639.setFocusable(false);
        abstractActivityC3102.f5639.setFocusableInTouchMode(false);
        abstractActivityC3102.f5638.m14754(false);
        abstractActivityC3102.m12260((Throwable) exc, true);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        AbstractActivityC3102 abstractActivityC3102 = this.f3752;
        abstractActivityC3102.f5639.m32378(abstractActivityC3102.f5641, false, !this.f3751);
    }
}
