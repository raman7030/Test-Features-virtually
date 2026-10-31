package l;

/* JADX INFO: renamed from: l.ۗܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V742 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3309 implements InterfaceC15097 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public InterfaceC0987 f10370;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC15097 f10372;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f10374;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC21654 f10376;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f10377;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C1898 f10371 = new C1898();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC11776 f10375 = InterfaceC11776.f35141;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f10373 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10114(C16197 c16197) {
        this.f10376 = c16197;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10115(C20243 c20243) {
        this.f10370 = c20243;
        this.f10377 = c20243 == null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10112(InterfaceC11776 interfaceC11776) {
        this.f10375 = interfaceC11776;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10113(InterfaceC15097 interfaceC15097) {
        this.f10372 = interfaceC15097;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10111(int i) {
        this.f10374 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10116() {
        this.f10373 = false;
    }

    @Override // l.InterfaceC15097
    /* JADX INFO: renamed from: ֫ */
    public final C13186 mo6247() {
        InterfaceC15097 interfaceC15097 = this.f10372;
        C4720 c4720M46487 = null;
        InterfaceC21449 interfaceC21449Mo6247 = interfaceC15097 != null ? interfaceC15097.mo6247() : null;
        int i = this.f10374;
        InterfaceC21654 interfaceC21654 = this.f10376;
        interfaceC21654.getClass();
        if (!this.f10377 && interfaceC21449Mo6247 != null) {
            InterfaceC0987 interfaceC0987 = this.f10370;
            if (interfaceC0987 == null) {
                C20243 c20243 = new C20243();
                c20243.m46488(interfaceC21654);
                c4720M46487 = c20243.m46487();
            } else {
                c4720M46487 = ((C20243) interfaceC0987).m46487();
            }
        }
        return new C13186(interfaceC21654, interfaceC21449Mo6247, this.f10371.mo6247(), c4720M46487, this.f10375, i, this.f10373);
    }
}
