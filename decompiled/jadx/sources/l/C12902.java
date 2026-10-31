package l;

/* JADX INFO: renamed from: l.۬ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C12902 extends EnumC22780 {
    public /* synthetic */ C12902() {
        this("AfterHead", 5);
    }

    public C12902(String str, int i) {
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
            return true;
        }
        if (!abstractC2195.m7255()) {
            if (abstractC2195.m7257()) {
                String str = ((C20540) abstractC2195).f26122;
                if (C20519.m47005(str, C11492.f34307)) {
                    m31345(abstractC2195, c17136);
                    return true;
                }
                if (str.equals("template")) {
                    c17136.m40175(abstractC2195, EnumC22780.f73545);
                    return true;
                }
                c17136.m40182(this);
                return false;
            }
            m31345(abstractC2195, c17136);
            return true;
        }
        C9251 c9251 = (C9251) abstractC2195;
        String str2 = c9251.f26122;
        if (str2.equals("html")) {
            EnumC22780 enumC22780 = EnumC22780.f73546;
            c17136.f2106 = abstractC2195;
            return enumC22780.mo1361(abstractC2195, c17136);
        }
        if (str2.equals("body")) {
            c17136.m40173(c9251);
            c17136.m40183(false);
            c17136.m40212(EnumC22780.f73546);
            return true;
        }
        if (str2.equals("frameset")) {
            c17136.m40173(c9251);
            c17136.m40212(EnumC22780.f73535);
            return true;
        }
        if (C20519.m47005(str2, C11492.f34311)) {
            c17136.m40182(this);
            C19814 c19814M40195 = c17136.m40195();
            c17136.f2112.add(c19814M40195);
            c17136.m40175(abstractC2195, EnumC22780.f73545);
            c17136.m40199(c19814M40195);
            return true;
        }
        if (str2.equals("head")) {
            c17136.m40182(this);
            return false;
        }
        m31345(abstractC2195, c17136);
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m31345(AbstractC2195 abstractC2195, C17136 c17136) {
        c17136.m2164("body");
        c17136.m40183(true);
        return c17136.mo2158(abstractC2195);
    }
}
