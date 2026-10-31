package l;

/* JADX INFO: renamed from: l.ۢۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274A */
/* JADX INFO: loaded from: classes3.dex */
public final class C9315 implements InterfaceC15097 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 f28260;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23713 f28261;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC15097 f28262;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC23425 f28263;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f28264 = false;

    public C9315(C23713 c23713, InterfaceC15097 interfaceC15097, InterfaceC23425 interfaceC23425) {
        this.f28261 = c23713;
        this.f28260 = interfaceC15097;
        this.f28262 = interfaceC15097;
        this.f28263 = interfaceC23425;
    }

    public C9315(C23713 c23713, C22282 c22282, InterfaceC15097 interfaceC15097, C3591 c3591) {
        this.f28261 = c23713;
        this.f28260 = c22282;
        this.f28262 = interfaceC15097;
        this.f28263 = c3591;
    }

    public C9315(C23713 c23713, InterfaceC15097 interfaceC15097, InterfaceC15097 interfaceC15098, InterfaceC23425 interfaceC23425) {
        this.f28261 = c23713;
        this.f28260 = interfaceC15097;
        this.f28262 = interfaceC15098;
        this.f28263 = interfaceC23425;
    }

    @Override // l.InterfaceC15097
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC21449 mo6247() {
        return new C20604(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13186 m23960(C9315 c9315, C16197 c16197) {
        C20243 c20243 = new C20243();
        c20243.m46488(c16197);
        C3309 c3309 = new C3309();
        c3309.m10114(c16197);
        c3309.m10113(c9315.f28260);
        c3309.m10115(c20243);
        c3309.m10112(new C12662(6));
        c3309.m10111(2);
        c3309.m10116();
        return c3309.mo6247();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC15097 m23961(C23713 c23713) {
        C16197 c16197M52288 = c23713.m52288();
        if (c16197M52288 == null) {
            return C16008.f49386;
        }
        C3309 c3309 = new C3309();
        c3309.m10114(c16197M52288);
        c3309.m10113((InterfaceC15097) null);
        c3309.m10115((C20243) null);
        c3309.m10112(new C14252());
        c3309.m10111(0);
        c3309.m10116();
        return c3309;
    }
}
