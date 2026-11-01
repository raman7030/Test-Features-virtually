package p067l;

/* JADX INFO: renamed from: l.᩸ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes5.dex */
public final class C22625 implements InterfaceC22192 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C13457 f71392;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ InterfaceC14577 f71393;

    public C22625(InterfaceC14577 interfaceC14577, C13457 c13457) {
        this.f71393 = interfaceC14577;
        this.f71392 = c13457;
    }

    @Override // p067l.InterfaceC22192
    public final void onSuccess() {
        this.f71393.mo6049(this.f71392, false);
    }

    @Override // p067l.InterfaceC22192
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo27608(Exception exc) {
        return this.f71393.mo6050(exc);
    }

    @Override // p067l.InterfaceC22192
    public final void onCanceled() {
        this.f71393.onCanceled();
    }
}
