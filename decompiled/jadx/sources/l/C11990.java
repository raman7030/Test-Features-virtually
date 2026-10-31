package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۨ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes4.dex */
public final class C11990 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C1343 f35898;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f35899;

    public C11990(AbstractActivityC3346 abstractActivityC3346) {
        this.f35899 = abstractActivityC3346;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20272(this.f35899, 300);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f35898 = C8399.m22002();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        AbstractActivityC3346 abstractActivityC3346 = this.f35899;
        if (abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed() || !abstractActivityC3346.getLifecycle().mo19832().m33028(EnumC13728.STARTED)) {
            return;
        }
        C6988 c6988M48041 = C21100.m48041();
        if (c6988M48041 != null && !c6988M48041.f21578.mo15853()) {
            C21100.m48020(abstractActivityC3346);
            return;
        }
        if (!C8399.m22007(this.f35898)) {
            C21100.m48020(abstractActivityC3346);
            return;
        }
        C2608 c2608M4688 = this.f35898.m4688();
        if (c2608M4688 != null) {
            new C21100(abstractActivityC3346);
            C21100.m48019(c2608M4688, this.f35898.m4691());
        } else {
            C21374.m48463(R.string.MT_Protector);
            if (abstractActivityC3346 instanceof ActivityC9811) {
                abstractActivityC3346.finish();
            }
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractActivityC3346 abstractActivityC3346 = this.f35899;
        if (abstractActivityC3346.isFinishing() || abstractActivityC3346.isDestroyed()) {
            return;
        }
        abstractActivityC3346.m10224(exc, abstractActivityC3346 instanceof ActivityC9811);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
