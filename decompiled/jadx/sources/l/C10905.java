package l;

/* JADX INFO: renamed from: l.ۧۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes4.dex */
public final class C10905 implements InterfaceC17585 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17254 f32778;

    public C10905(C17254 c17254) {
        this.f32778 = c17254;
    }

    @Override // l.InterfaceC17585
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2048(C3060 c3060) {
        C17254 c17254 = this.f32778;
        if (c3060 == c17254.f26497) {
            return false;
        }
        c17254.f52892 = ((SubMenuC19703) c3060).getItem().getItemId();
        InterfaceC17585 interfaceC17585M22489 = c17254.m22489();
        if (interfaceC17585M22489 != null) {
            return interfaceC17585M22489.mo2048(c3060);
        }
        return false;
    }

    @Override // l.InterfaceC17585
    public final void onCloseMenu(C3060 c3060, boolean z) {
        if (c3060 instanceof SubMenuC19703) {
            c3060.getRootMenu().close(false);
        }
        InterfaceC17585 interfaceC17585M22489 = this.f32778.m22489();
        if (interfaceC17585M22489 != null) {
            interfaceC17585M22489.onCloseMenu(c3060, z);
        }
    }
}
