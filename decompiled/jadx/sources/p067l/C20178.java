package p067l;

import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ᩴۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77HY */
/* JADX INFO: loaded from: classes5.dex */
public final class C20178 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ InterfaceC19370 f62440;

    /* JADX INFO: renamed from: ۡ */
    public final /* synthetic */ C18107 f62441;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ BooleanSupplier f62442;

    /* JADX INFO: renamed from: ܳ */
    public C12744 f62443;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ Runnable f62444;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f62445;

    public C20178(C18107 c18107, BooleanSupplier booleanSupplier, InterfaceC19370 interfaceC19370, Runnable runnable) {
        this.f62441 = c18107;
        this.f62442 = booleanSupplier;
        this.f62440 = interfaceC19370;
        this.f62444 = runnable;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f62443 = this.f62441.m41271();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f62445 = this.f62442.getAsBoolean();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f62443.m29270()) {
            return;
        }
        if (this.f62445) {
            C20966.m47307(this.f62441, this.f62440);
        } else {
            this.f62444.run();
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f62443.m29270()) {
            return;
        }
        C20966.m47307(this.f62441, this.f62440);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f62443.m29269();
    }
}
