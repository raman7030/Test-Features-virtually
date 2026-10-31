package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩻۠ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 313O */
/* JADX INFO: loaded from: classes.dex */
public final class C23577 extends AbstractC7548 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3822 f76468;

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
    }

    public C23577(C3822 c3822) {
        this.f76468 = c3822;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        this.f76468.f12238.dismiss();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        C3822.m11576(this.f76468);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C3822 c3822 = this.f76468;
        ((C6644) c3822.f12234.getAdapter()).m18161();
        c3822.f12234.scrollToPosition(0);
        c3822.f12238.m1449();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f76468.f12233.m10223(exc, (DialogInterface.OnDismissListener) null);
    }
}
