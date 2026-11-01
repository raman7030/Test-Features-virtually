package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۙۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G668 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6730 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ DialogInterfaceC2564 f17470;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C3219 f17471;

    /* JADX INFO: renamed from: ܳ */
    public AbstractC17043 f17472;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ AbstractC14973 f17473;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ AbstractActivityC5549 f17474;

    public C6730(AbstractActivityC5549 abstractActivityC5549, AbstractC14973 abstractC14973, DialogInterfaceC2564 dialogInterfaceC2564, C3219 c3219) {
        this.f17474 = abstractActivityC5549;
        this.f17473 = abstractC14973;
        this.f17470 = dialogInterfaceC2564;
        this.f17471 = c3219;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22248(this.f17474, 100);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        AbstractC17043 abstractC17043M24868 = C10792.m24868();
        AbstractC14973 abstractC14973 = this.f17473;
        this.f17472 = C23691.m52701(abstractC17043M24868, abstractC14973.mo15886(), abstractC14973.m34296().getEncoded(), abstractC14973.m34292().getEncoded());
        abstractC14973.mo15880();
        abstractC14973.mo15885();
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C17127.m38756();
        this.f17470.dismiss();
        this.f17471.accept(this.f17472);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f17474.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
