package p067l;

/* JADX INFO: renamed from: l.ۧۢ */
/* JADX INFO: compiled from: P55W */
/* JADX INFO: loaded from: classes4.dex */
public final class C1383 implements InterfaceC1714 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C1698 f35756;

    public C1383(C1698 c1698) {
        this.f35756 = c1698;
    }

    @Override // p067l.InterfaceC1714
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4428(C0994 c0994) {
        C1698 c1698 = this.f35756;
        if (c0994 == c1698.f29422) {
            return false;
        }
        c1698.f56074 = ((SubMenuC1819) c0994).getItem().getItemId();
        InterfaceC1714 interfaceC1714M24458 = c1698.m24458();
        if (interfaceC1714M24458 != null) {
            return interfaceC1714M24458.mo4428(c0994);
        }
        return false;
    }

    @Override // p067l.InterfaceC1714
    public final void onCloseMenu(C0994 c0994, boolean z) {
        if (c0994 instanceof SubMenuC1819) {
            c0994.getRootMenu().close(false);
        }
        InterfaceC1714 interfaceC1714M24458 = this.f35756.m24458();
        if (interfaceC1714M24458 != null) {
            interfaceC1714M24458.onCloseMenu(c0994, z);
        }
    }
}
