package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܶۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16595 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ DialogInterfaceC2564 f48739;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C21291 f48740;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C9662 f48741;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractActivityC5549 f48742;

    public C16595(C21291 c21291, AbstractActivityC5549 abstractActivityC5549, C9662 c9662, DialogInterfaceC2564 dialogInterfaceC2564) {
        this.f48740 = c21291;
        this.f48742 = abstractActivityC5549;
        this.f48741 = c9662;
        this.f48739 = dialogInterfaceC2564;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f48742, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C3924 {
        long jM22511 = this.f48741.m22511();
        C19701 c19701M44739 = C19701.m44739(4181);
        c19701M44739.m44743(jM22511);
        C25065 c25065M44754 = c19701M44739.m44754();
        if (!c25065M44754.m55016()) {
            throw new C3924(C3865.m7621(c25065M44754, R.string.MT_Protector));
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f48739.dismiss();
        this.f48740.mo8363(this.f48742);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f48742.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
