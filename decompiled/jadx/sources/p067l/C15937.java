package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ܳۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes4.dex */
public final class C15937 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ C11245 f46115;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ InterfaceC19764 f46116;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C18107 f46117;

    /* JADX INFO: renamed from: ܳ */
    public AbstractC18422 f46118;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ Runnable f46119;

    /* JADX INFO: renamed from: ᩻ */
    public C12744 f46120;

    public C15937(C11245 c11245, C18107 c18107, InterfaceC19764 interfaceC19764, Runnable runnable) {
        this.f46115 = c11245;
        this.f46117 = c18107;
        this.f46116 = interfaceC19764;
        this.f46119 = runnable;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f46120 = this.f46117.m41218(true, (Runnable) new RunnableC6038(2, this.f46116));
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f46118 = this.f46116.mo6852(this.f46117.m41270().m41987());
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C11245 c11245 = this.f46115;
        if (c11245.f31300 || !this.f46120.m29271()) {
            AbstractC18422 abstractC18422 = this.f46118;
            if (abstractC18422 != null) {
                abstractC18422.m41985();
                return;
            }
            return;
        }
        c11245.m26070(this.f46117, this.f46118);
        Runnable runnable = this.f46119;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f46120.m29270()) {
            return;
        }
        if ((exc instanceof C3924) || (exc instanceof C20807)) {
            C22682.m50794(0, exc.getMessage()).m50804();
        } else {
            this.f46115.m26082().m12259(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f46120.m29269();
    }
}
