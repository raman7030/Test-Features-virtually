package l;

/* JADX INFO: renamed from: l.᩶ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes5.dex */
public final enum C19959 extends EnumC22780 {
    public /* synthetic */ C19959() {
        this("BeforeHead", 2);
    }

    public C19959(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC22780
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        if (EnumC22780.m50859(abstractC2195)) {
            abstractC2195.getClass();
            c17136.m40179((C17011) abstractC2195);
            return true;
        }
        if (abstractC2195.m7254()) {
            c17136.m40178((C14188) abstractC2195);
            return true;
        }
        if (abstractC2195.m7256()) {
            c17136.m40182(this);
            return false;
        }
        if (abstractC2195.m7255() && ((C9251) abstractC2195).f26122.equals("html")) {
            return EnumC22780.f73546.mo1361(abstractC2195, c17136);
        }
        if (abstractC2195.m7255()) {
            C9251 c9251 = (C9251) abstractC2195;
            if (c9251.f26122.equals("head")) {
                c17136.m40196(c17136.m40173(c9251));
                c17136.m40212(EnumC22780.f73545);
                return true;
            }
        }
        if (abstractC2195.m7257() && C20519.m47005(((C20540) abstractC2195).f26122, C11492.f34321)) {
            c17136.m2164("head");
            return c17136.mo2158(abstractC2195);
        }
        if (abstractC2195.m7257()) {
            c17136.m40182(this);
            return false;
        }
        c17136.m2164("head");
        return c17136.mo2158(abstractC2195);
    }
}
