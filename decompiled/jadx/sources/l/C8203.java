package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۠۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes3.dex */
public final class C8203 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC15257 f25210;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C3856 f25211;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f25212;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3264 f25213;

    public C8203(C3264 c3264, InterfaceC15257 interfaceC15257, Runnable runnable) {
        this.f25213 = c3264;
        this.f25210 = interfaceC15257;
        this.f25212 = runnable;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20272(this.f25213.f10236, 200);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f25211 = this.f25210.run();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C3264 c3264 = this.f25213;
        if (!c3264.f10242.m1442() || c3264.f10236.isFinishing()) {
            return;
        }
        c3264.m10007();
        Runnable runnable = this.f25212;
        if (runnable != null) {
            runnable.run();
        }
        C3856 c3856 = this.f25211;
        if (c3856 != null) {
            C3264.m10003(c3264, c3856.f12307);
        }
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C3264 c3264 = this.f25213;
        if (!c3264.f10242.m1442() || c3264.f10236.isFinishing()) {
            return;
        }
        c3264.m10007();
        C21374.m48463(R.string.MT_Protector);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        this.f25211 = null;
        this.f25213.f10240 = false;
        m20273();
    }
}
