package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۨ᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes4.dex */
public final class C13764 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public C3645 f38908;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractActivityC5549 f38909;

    public C13764(AbstractActivityC5549 abstractActivityC5549) {
        this.f38909 = abstractActivityC5549;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22248(this.f38909, 300);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f38908 = C10351.m23972();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        AbstractActivityC5549 abstractActivityC5549 = this.f38909;
        if (abstractActivityC5549.isFinishing() || abstractActivityC5549.isDestroyed() || !abstractActivityC5549.getLifecycle().mo21805().m35142(EnumC15415.STARTED)) {
            return;
        }
        C9010 c9010M50371 = C22422.m50371();
        if (c9010M50371 != null && !c9010M50371.f24458.mo17768()) {
            C22422.m50350(abstractActivityC5549);
            return;
        }
        if (!C10351.m23977(this.f38908)) {
            C22422.m50350(abstractActivityC5549);
            return;
        }
        C4847 c4847M6920 = this.f38908.m6920();
        if (c4847M6920 != null) {
            new C22422(abstractActivityC5549);
            C22422.m50349(c4847M6920, this.f38908.m6923());
        } else {
            C22682.m50799(R.string.MT_Protector);
            if (abstractActivityC5549 instanceof ActivityC11693) {
                abstractActivityC5549.finish();
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        AbstractActivityC5549 abstractActivityC5549 = this.f38909;
        if (abstractActivityC5549.isFinishing() || abstractActivityC5549.isDestroyed()) {
            return;
        }
        abstractActivityC5549.m12260(exc, abstractActivityC5549 instanceof ActivityC11693);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
