package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۤۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final class C10109 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13262 f30436;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f30437;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC20858 f30438;

    public C10109(InterfaceC20858 interfaceC20858, AbstractC13262 abstractC13262, AbstractActivityC3346 abstractActivityC3346) {
        this.f30437 = abstractActivityC3346;
        this.f30436 = abstractC13262;
        this.f30438 = interfaceC20858;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20272(this.f30437, 200);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f30436.mo32190();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        this.f30438.onSuccess();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f30438.mo25586(exc)) {
            return;
        }
        this.f30437.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
