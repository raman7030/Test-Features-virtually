package p067l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩶ۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G668 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21483 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ byte[] f67771;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ DialogInterfaceC2564 f67772;

    /* JADX INFO: renamed from: ܳ */
    public AbstractC17043 f67773;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ byte[] f67774;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C5389 f67775;

    public C21483(C5389 c5389, byte[] bArr, byte[] bArr2, DialogInterfaceC2564 dialogInterfaceC2564) {
        this.f67775 = c5389;
        this.f67771 = bArr;
        this.f67774 = bArr2;
        this.f67772 = dialogInterfaceC2564;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        m22248(this.f67775.f12789, 100);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() {
        this.f67773 = C23691.m52701(C10792.m24868(), this.f67775.f12791.m38675(), this.f67771, this.f67774);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        C17127.m38756();
        this.f67772.dismiss();
        this.f67775.f12792.accept(this.f67773);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f67775.f12789.m12259(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        m22249();
    }
}
