package l;

/* JADX INFO: renamed from: l.֡֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes2.dex */
public final class C0066 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f976;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC0772 f977;

    public C0066(AbstractActivityC0772 abstractActivityC0772) {
        this.f977 = abstractActivityC0772;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo1008() {
        AbstractActivityC0772 abstractActivityC0772 = this.f977;
        abstractActivityC0772.f2867.m30314(abstractActivityC0772.f2869, true, false);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo1009() {
        AbstractActivityC0772 abstractActivityC0772 = this.f977;
        abstractActivityC0772.f2867.m30305(abstractActivityC0772.mo2952(), new C9406());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1006() {
        AbstractActivityC0772 abstractActivityC0772 = this.f977;
        abstractActivityC0772.f2867.m30360();
        abstractActivityC0772.f2867.m30456(false);
        abstractActivityC0772.f2867.m30303();
        if (abstractActivityC0772.f2864 != null) {
            abstractActivityC0772.f2864.setEnabled(false);
        }
        if (abstractActivityC0772.f2861 != null) {
            abstractActivityC0772.f2861.setEnabled(false);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1007(Exception exc) {
        this.f976 = true;
        AbstractActivityC0772 abstractActivityC0772 = this.f977;
        abstractActivityC0772.f2867.setEnabled(false);
        abstractActivityC0772.f2867.m30456(false);
        abstractActivityC0772.f2867.setFocusable(false);
        abstractActivityC0772.f2867.setFocusableInTouchMode(false);
        abstractActivityC0772.f2866.m12890(false);
        abstractActivityC0772.m10224((Throwable) exc, true);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo1010() {
        AbstractActivityC0772 abstractActivityC0772 = this.f977;
        abstractActivityC0772.f2867.m30314(abstractActivityC0772.f2869, false, !this.f976);
    }
}
