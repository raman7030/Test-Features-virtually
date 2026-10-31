package l;

/* JADX INFO: renamed from: l.۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5FO */
/* JADX INFO: loaded from: classes4.dex */
public final class C12457 implements InterfaceC17585 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f37463;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11752 f37464;

    public C12457(C11752 c11752) {
        this.f37464 = c11752;
    }

    @Override // l.InterfaceC17585
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2048(C3060 c3060) {
        this.f37464.f35081.onMenuOpened(108, c3060);
        return true;
    }

    @Override // l.InterfaceC17585
    public final void onCloseMenu(C3060 c3060, boolean z) {
        if (this.f37463) {
            return;
        }
        this.f37463 = true;
        C11752 c11752 = this.f37464;
        c11752.f35080.mo2183();
        c11752.f35081.onPanelClosed(108, c3060);
        this.f37463 = false;
    }
}
