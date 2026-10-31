package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩶ۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: G668 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20112 extends AbstractC7548 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f65132;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f65133;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f65134;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f65135;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3178 f65136;

    public C20112(C3178 c3178, byte[] bArr, byte[] bArr2, DialogInterfaceC0206 dialogInterfaceC0206) {
        this.f65136 = c3178;
        this.f65132 = bArr;
        this.f65135 = bArr2;
        this.f65133 = dialogInterfaceC0206;
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ۧ */
    public final void mo1008() {
        m20272(this.f65136.f9989, 100);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ܿ */
    public final void mo1009() {
        this.f65134 = C22435.m50360(C8863.m22897(), this.f65136.f9991.m36517(), this.f65132, this.f65135);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1006() {
        C15528.m36596();
        this.f65133.dismiss();
        this.f65136.f9992.accept(this.f65134);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f65136.f9989.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}
