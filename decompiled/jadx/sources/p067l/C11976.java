package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۤۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H5BW */
/* JADX INFO: loaded from: classes3.dex */
public final class C11976 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ AbstractC14973 f33395;

    /* JADX INFO: renamed from: ܳ */
    public final /* synthetic */ AbstractActivityC5549 f33396;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ InterfaceC22192 f33397;

    public C11976(InterfaceC22192 interfaceC22192, AbstractC14973 abstractC14973, AbstractActivityC5549 abstractActivityC5549) {
        this.f33396 = abstractActivityC5549;
        this.f33395 = abstractC14973;
        this.f33397 = interfaceC22192;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22248(this.f33396, 200);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f33395.mo34289();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        this.f33397.onSuccess();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        if (this.f33397.mo27608(exc)) {
            return;
        }
        this.f33396.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
