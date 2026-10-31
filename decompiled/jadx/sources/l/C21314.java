package l;

/* JADX INFO: renamed from: l.᩸ۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes5.dex */
public final class C21314 implements InterfaceC20858 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11667 f68701;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC12846 f68702;

    public C21314(InterfaceC12846 interfaceC12846, C11667 c11667) {
        this.f68702 = interfaceC12846;
        this.f68701 = c11667;
    }

    @Override // l.InterfaceC20858
    public final void onSuccess() {
        this.f68702.mo3776(this.f68701, false);
    }

    @Override // l.InterfaceC20858
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo25586(Exception exc) {
        return this.f68702.mo3777(exc);
    }

    @Override // l.InterfaceC20858
    public final void onCanceled() {
        this.f68702.onCanceled();
    }
}
