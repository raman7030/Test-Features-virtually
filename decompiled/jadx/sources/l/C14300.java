package l;

/* JADX INFO: renamed from: l.ܳۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes4.dex */
public final class C14300 implements InterfaceC20858 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f43120;

    public C14300(Runnable runnable) {
        this.f43120 = runnable;
    }

    @Override // l.InterfaceC20858
    public final void onSuccess() {
        C22435.f72683 = false;
        this.f43120.run();
    }

    @Override // l.InterfaceC20858
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo25586(Exception exc) {
        C22435.f72683 = false;
        return false;
    }

    @Override // l.InterfaceC20858
    public final void onCanceled() {
        C22435.f72683 = false;
    }
}
