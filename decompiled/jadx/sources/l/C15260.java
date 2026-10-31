package l;

/* JADX INFO: renamed from: l.ܶܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes4.dex */
public final class C15260 implements InterfaceC6403 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3267 f46833;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1323 f46834;

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo7078() {
        return false;
    }

    public C15260(C3267 c3267, C1323 c1323) {
        this.f46833 = c3267;
        this.f46834 = c1323;
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076(AbstractC5698 abstractC5698) {
        C0052 c0052 = (C0052) abstractC5698;
        c0052.f17563 |= 268435456;
        C3267 c3267 = this.f46833;
        C20201 c20201 = new C20201(c3267);
        C22364 c22364 = c3267.f10283;
        C1323 c1323 = this.f46834;
        InterfaceC18278 interfaceC18278M7284 = c22364.m7284(c1323.f4745);
        C3587 c3587M4616 = c1323.m4616();
        C18230 c18230 = c3267.f10275;
        c3587M4616.getClass();
        InterfaceC3109 interfaceC3109M42471 = c18230.m42471((InterfaceC3109) c3587M4616);
        try {
            c20201.mo1375(c3587M4616);
            c3267.m10048(c0052);
            C3267.m10031(c3267, c3587M4616);
        } finally {
            c3267.f10283.m7284(interfaceC18278M7284);
            c3267.f10275.m42471(interfaceC3109M42471);
            c0052.f17563 &= -268435457;
        }
    }

    public final String toString() {
        return "SourceCompleter: " + this.f46834.f4745.getName();
    }
}
