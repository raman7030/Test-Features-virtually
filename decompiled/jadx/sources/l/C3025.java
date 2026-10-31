package l;

/* JADX INFO: renamed from: l.ۗۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes2.dex */
public final enum C3025 extends EnumC22780 {
    public /* synthetic */ C3025() {
        this("InHeadNoscript", 4);
    }

    public C3025(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC22780
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        if (abstractC2195.m7256()) {
            c17136.m40182(this);
            return true;
        }
        if (abstractC2195.m7255() && ((C9251) abstractC2195).f26122.equals("html")) {
            EnumC22780 enumC22780 = EnumC22780.f73546;
            c17136.f2106 = abstractC2195;
            return enumC22780.mo1361(abstractC2195, c17136);
        }
        if (abstractC2195.m7257() && ((C20540) abstractC2195).f26122.equals("noscript")) {
            c17136.m40190();
            c17136.m40212(EnumC22780.f73545);
            return true;
        }
        if (EnumC22780.m50859(abstractC2195) || abstractC2195.m7254() || (abstractC2195.m7255() && C20519.m47005(((C9251) abstractC2195).f26122, C11492.f34339))) {
            EnumC22780 enumC22781 = EnumC22780.f73545;
            c17136.f2106 = abstractC2195;
            return enumC22781.mo1361(abstractC2195, c17136);
        }
        if (abstractC2195.m7257() && ((C20540) abstractC2195).f26122.equals("br")) {
            return m9273(abstractC2195, c17136);
        }
        if ((!abstractC2195.m7255() || !C20519.m47005(((C9251) abstractC2195).f26122, C11492.f34340)) && !abstractC2195.m7257()) {
            return m9273(abstractC2195, c17136);
        }
        c17136.m40182(this);
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m9273(AbstractC2195 abstractC2195, C17136 c17136) {
        c17136.m40182(this);
        C17011 c17011 = new C17011();
        c17011.m39894(abstractC2195.toString());
        c17136.m40179(c17011);
        return true;
    }
}
