package p067l;

import android.content.DialogInterface;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.֨ۗ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WS */
/* JADX INFO: loaded from: classes2.dex */
public final class C3184 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C9890 f6118;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ String f6119;

    public C3184(C9890 c9890, String str) {
        this.f6118 = c9890;
        this.f6119 = str;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f6118.f27416, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C3924 {
        long jM22511 = this.f6118.f27419.m22511();
        C19701 c19701M44739 = C19701.m44739(4198);
        c19701M44739.m44743(jM22511);
        c19701M44739.m44750(this.f6119);
        C25065 c25065M44754 = c19701M44739.m44754();
        if (!c25065M44754.m55016()) {
            throw new C3924(C3865.m7621(c25065M44754, R.string.MT_Protector));
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C9890 c9890 = this.f6118;
        c9890.m33348();
        c9890.f27418.dismiss();
        c9890.f27417.mo8363(c9890.f27416);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f6118.f27416.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
