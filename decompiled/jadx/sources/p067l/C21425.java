package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩶۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes5.dex */
public final class C21425 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final C11084 f67605;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ ActivityC17874 f67606;

    /* JADX INFO: renamed from: ܳ */
    public C9729 f67607;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C23631 f67608;

    /* JADX INFO: renamed from: ᩻ */
    public C19721 f67609;

    public C21425(C23631 c23631, ActivityC17874 activityC17874) {
        this.f67608 = c23631;
        this.f67606 = activityC17874;
        this.f67605 = C11084.m25530(c23631.getViewLifecycleOwner());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f67607 = this.f67608.f75242.m32500().mo28595();
        m22242(this.f67606);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C9729 c9729 = this.f67607;
        try {
            this.f67609 = C4654.m9844("", C12590.m29003(c9729.toString()), ApplicationC21448.f67649.mo20199((byte) 0, "dex_decompile_engine"));
            c9729.close();
        } catch (Throwable th) {
            if (c9729 != null) {
                try {
                    c9729.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f67605.m25532()) {
            C23631 c23631 = this.f67608;
            if (!c23631.f75233 || c23631.isDetached() || c23631.m7643()) {
                return;
            }
            if (!this.f67609.f59997.m55016()) {
                C25065 c25065 = this.f67609.f59997;
                c25065.getClass();
                this.f67606.m12257(C3865.m7621(c25065, R.string.MT_Protector), false);
                return;
            }
            ActivityC16573.m37552(c23631.f75234, this.f67609, c23631.m7649().m12209() + ".java");
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f67605.m25532()) {
            C23631 c23631 = this.f67608;
            if (!c23631.f75233 || c23631.isDetached() || c23631.m7643()) {
                return;
            }
            c23631.m52484(exc, this.f67606);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C9729 c9729 = this.f67607;
        if (c9729 != null) {
            c9729.close();
        }
        m22249();
    }
}
