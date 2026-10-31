package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ܳۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes4.dex */
public final class C14277 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9340 f43023;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC18303 f43024;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f43025;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC16891 f43026;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f43027;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C10917 f43028;

    public C14277(C9340 c9340, C16560 c16560, InterfaceC18303 interfaceC18303, Runnable runnable) {
        this.f43023 = c9340;
        this.f43025 = c16560;
        this.f43024 = interfaceC18303;
        this.f43027 = runnable;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f43028 = this.f43025.m38992(true, (Runnable) new RunnableC3861(2, this.f43024));
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f43026 = this.f43024.mo4620(this.f43025.m39044().m39746());
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C9340 c9340 = this.f43023;
        if (c9340.f28351 || !this.f43028.m27226()) {
            AbstractC16891 abstractC16891 = this.f43026;
            if (abstractC16891 != null) {
                abstractC16891.m39744();
                return;
            }
            return;
        }
        c9340.m24061(this.f43025, this.f43026);
        Runnable runnable = this.f43027;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f43028.m27225()) {
            return;
        }
        if ((exc instanceof C1637) || (exc instanceof C19401)) {
            C21374.m48458(0, exc.getMessage()).m48468();
        } else {
            this.f43023.m24073().m10223(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f43028.m27224();
    }
}
