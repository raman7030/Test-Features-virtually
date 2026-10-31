package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۙۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G668 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4589 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f14642;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0895 f14643;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f14644;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC13262 f14645;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f14646;

    public C4589(AbstractActivityC3346 abstractActivityC3346, AbstractC13262 abstractC13262, DialogInterfaceC0206 dialogInterfaceC0206, C0895 c0895) {
        this.f14646 = abstractActivityC3346;
        this.f14645 = abstractC13262;
        this.f14642 = dialogInterfaceC0206;
        this.f14643 = c0895;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20272(this.f14646, 100);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        AbstractC15440 abstractC15440M22897 = C8863.m22897();
        AbstractC13262 abstractC13262 = this.f14645;
        this.f14644 = C22435.m50360(abstractC15440M22897, abstractC13262.mo14006(), abstractC13262.m32197().getEncoded(), abstractC13262.m32193().getEncoded());
        abstractC13262.mo14000();
        abstractC13262.mo14005();
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C15528.m36596();
        this.f14642.dismiss();
        this.f14643.accept(this.f14644);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f14646.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
