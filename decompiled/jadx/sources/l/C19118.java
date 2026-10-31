package l;

/* JADX INFO: renamed from: l.᩵֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAPA */
/* JADX INFO: loaded from: classes5.dex */
public final class C19118 implements InterfaceC19449 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f60228 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC0772 f60229;

    public C19118(AbstractActivityC0772 abstractActivityC0772) {
        this.f60229 = abstractActivityC0772;
    }

    @Override // l.InterfaceC19449
    /* JADX INFO: renamed from: ֫ */
    public final void mo2703(boolean z) {
        AbstractActivityC0772 abstractActivityC0772 = this.f60229;
        if (abstractActivityC0772.f2863 != null) {
            this.f60228 = abstractActivityC0772.f2863.isEnabled();
        }
        if (z == this.f60228) {
            return;
        }
        if (abstractActivityC0772.f2863 != null) {
            abstractActivityC0772.f2863.setEnabled(z);
        }
        this.f60228 = z;
        String strMo2951 = abstractActivityC0772.mo2951();
        if (z) {
            strMo2951 = C16014.m37867(strMo2951, "*");
        }
        abstractActivityC0772.setTitle(strMo2951);
    }

    @Override // l.InterfaceC19449
    /* JADX INFO: renamed from: ֫ */
    public final void mo2704(boolean z, boolean z2) {
        AbstractActivityC0772 abstractActivityC0772 = this.f60229;
        if (abstractActivityC0772.f2861 != null) {
            abstractActivityC0772.f2861.setEnabled(z);
        }
        if (abstractActivityC0772.f2864 != null) {
            abstractActivityC0772.f2864.setEnabled(z2);
        }
    }
}
