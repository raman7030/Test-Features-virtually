package p067l;

import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.۠۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes3.dex */
public final class C10165 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ InterfaceC16869 f28120;

    /* JADX INFO: renamed from: ܳ */
    public C6033 f28121;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ Runnable f28122;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C5471 f28123;

    public C10165(C5471 c5471, InterfaceC16869 interfaceC16869, Runnable runnable) {
        this.f28123 = c5471;
        this.f28120 = interfaceC16869;
        this.f28122 = runnable;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22248(this.f28123.f13044, 200);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f28121 = this.f28120.run();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C5471 c5471 = this.f28123;
        if (!c5471.f13050.m3855() || c5471.f13044.isFinishing()) {
            return;
        }
        c5471.m12040();
        Runnable runnable = this.f28122;
        if (runnable != null) {
            runnable.run();
        }
        C6033 c6033 = this.f28121;
        if (c6033 != null) {
            C5471.m12036(c5471, c6033.f15114);
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        C5471 c5471 = this.f28123;
        if (!c5471.f13050.m3855() || c5471.f13044.isFinishing()) {
            return;
        }
        c5471.m12040();
        C22682.m50799(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f28121 = null;
        this.f28123.f13048 = false;
        m22249();
    }
}
