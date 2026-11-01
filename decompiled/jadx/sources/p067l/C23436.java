package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.᩹۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C23436 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final C11084 f74661;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ ActivityC17874 f74662;

    /* JADX INFO: renamed from: ܳ */
    public C9729 f74663;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ C23631 f74664;

    /* JADX INFO: renamed from: ᩻ */
    public C19721 f74665;

    public C23436(C23631 c23631, ActivityC17874 activityC17874) {
        this.f74664 = c23631;
        this.f74662 = activityC17874;
        this.f74661 = C11084.m25530(c23631.getViewLifecycleOwner());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f74663 = this.f74664.f75242.m32500().mo28595();
        m22242(this.f74662);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C9729 c9729 = this.f74663;
        try {
            String string = c9729.toString();
            C20960 c20960 = new C20960();
            c20960.f65851 = 28;
            C20765 c20765 = new C20765(C9873.m23150(28));
            C11572.m26641(string, c20765, c20960);
            C22776 c22776 = new C22776();
            c20765.m50870(c22776);
            this.f74665 = C4654.m9844("", c22776.m50961(), ApplicationC21448.f67649.mo20199((byte) 0, "dex_decompile_engine"));
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
        if (this.f74661.m25532()) {
            C23631 c23631 = this.f74664;
            if (!c23631.f75233 || c23631.isDetached() || c23631.m7643()) {
                return;
            }
            if (!this.f74665.f59997.m55016()) {
                C25065 c25065 = this.f74665.f59997;
                c25065.getClass();
                this.f74662.m12257(C3865.m7621(c25065, R.string.MT_Protector), false);
                return;
            }
            ActivityC16573.m37552(c23631.f75234, this.f74665, c23631.m7649().m12209() + ".java");
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f74661.m25532()) {
            C23631 c23631 = this.f74664;
            if (!c23631.f75233 || c23631.isDetached() || c23631.m7643()) {
                return;
            }
            c23631.m52484(exc, this.f74662);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        C9729 c9729 = this.f74663;
        if (c9729 != null) {
            c9729.close();
        }
        m22249();
    }
}
