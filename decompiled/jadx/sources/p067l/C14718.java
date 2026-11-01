package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۬۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes4.dex */
public final class C14718 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C6867 f41964;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C23631 f41965;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ActivityC17874 f41966;

    public C14718(C23631 c23631, ActivityC17874 activityC17874, C6867 c6867) {
        this.f41965 = c23631;
        this.f41966 = activityC17874;
        this.f41964 = c6867;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22243(this.f41966, R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C24301 c24301 = new C24301(0, C16412.f48248, false, 0, null, null, null);
        synchronized (this.f41965.f75223) {
            C10891 c10891M52482 = C23631.m52482(this.f41965, c24301);
            try {
                c10891M52482.f30177.m37350(this.f41964);
                c10891M52482.close();
            } catch (Throwable th) {
                if (c10891M52482 != null) {
                    try {
                        c10891M52482.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f41965.m52484(exc, this.f41966);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
