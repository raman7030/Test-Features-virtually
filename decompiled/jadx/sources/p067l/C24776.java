package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩻۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes.dex */
public final class C24776 extends AbstractC9542 {

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ C6001 f79214;

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
    }

    public C24776(C6001 c6001) {
        this.f79214 = c6001;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        this.f79214.f15045.dismiss();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        C6001.m13512(this.f79214);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C6001 c6001 = this.f79214;
        ((C8683) c6001.f15041.getAdapter()).m20113();
        c6001.f15041.scrollToPosition(0);
        c6001.f15045.m3862();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f79214.f15040.m12259(exc, (DialogInterface.OnDismissListener) null);
    }
}
