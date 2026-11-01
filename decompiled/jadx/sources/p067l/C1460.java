package p067l;

/* JADX INFO: renamed from: l.۫ܳ */
/* JADX INFO: compiled from: A5FO */
/* JADX INFO: loaded from: classes4.dex */
public final class C1460 implements InterfaceC1714 {

    /* JADX INFO: renamed from: ᩸ */
    public boolean f40483;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C1425 f40484;

    public C1460(C1425 c1425) {
        this.f40484 = c1425;
    }

    @Override // p067l.InterfaceC1714
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4428(C0994 c0994) {
        this.f40484.f38080.onMenuOpened(108, c0994);
        return true;
    }

    @Override // p067l.InterfaceC1714
    public final void onCloseMenu(C0994 c0994, boolean z) {
        if (this.f40483) {
            return;
        }
        this.f40483 = true;
        C1425 c1425 = this.f40484;
        c1425.f38079.mo4550();
        c1425.f38080.onPanelClosed(108, c0994);
        this.f40483 = false;
    }
}
