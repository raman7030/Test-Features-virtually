package l;

/* JADX INFO: renamed from: l.ܺۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C15724 extends EnumC22780 {
    public /* synthetic */ C15724() {
        this("InSelect", 15);
    }

    public C15724(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC22780
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        switch (C21370.f68842[abstractC2195.f7214.ordinal()]) {
            case 1:
                c17136.m40178((C14188) abstractC2195);
                return true;
            case 2:
                c17136.m40182(this);
                return false;
            case 3:
                C9251 c9251 = (C9251) abstractC2195;
                String str = c9251.f26122;
                if (str.equals("html")) {
                    EnumC22780 enumC22780 = EnumC22780.f73546;
                    c17136.f2106 = c9251;
                    return enumC22780.mo1361((AbstractC2195) c9251, c17136);
                }
                if (str.equals("option")) {
                    if (c17136.m2157("option")) {
                        c17136.m2163("option");
                    }
                    c17136.m40173(c9251);
                } else if (str.equals("optgroup")) {
                    if (c17136.m2157("option")) {
                        c17136.m2163("option");
                    }
                    if (c17136.m2157("optgroup")) {
                        c17136.m2163("optgroup");
                    }
                    c17136.m40173(c9251);
                } else {
                    if (str.equals("select")) {
                        c17136.m40182(this);
                        return c17136.m2163("select");
                    }
                    if (C20519.m47005(str, C11492.f34325)) {
                        c17136.m40182(this);
                        if (!c17136.m40197("select")) {
                            return false;
                        }
                        c17136.m2163("select");
                        return c17136.mo2158((AbstractC2195) c9251);
                    }
                    if (str.equals("script") || str.equals("template")) {
                        EnumC22780 enumC22781 = EnumC22780.f73545;
                        c17136.f2106 = abstractC2195;
                        return enumC22781.mo1361(abstractC2195, c17136);
                    }
                    return m37114(abstractC2195, c17136);
                }
                return true;
            case 4:
                String str2 = ((C20540) abstractC2195).f26122;
                str2.getClass();
                switch (str2) {
                    case "template":
                        EnumC22780 enumC22782 = EnumC22780.f73545;
                        c17136.f2106 = abstractC2195;
                        return enumC22782.mo1361(abstractC2195, c17136);
                    case "option":
                        if (c17136.m2157("option")) {
                            c17136.m40190();
                        } else {
                            c17136.m40182(this);
                        }
                        return true;
                    case "select":
                        if (!c17136.m40197(str2)) {
                            c17136.m40182(this);
                            return false;
                        }
                        c17136.m40187(str2);
                        c17136.m40225();
                        return true;
                    case "optgroup":
                        if (c17136.m2157("option") && c17136.m40174(c17136.m2153()) != null && c17136.m40174(c17136.m2153()).m45588().equals("optgroup")) {
                            c17136.m2163("option");
                        }
                        if (c17136.m2157("optgroup")) {
                            c17136.m40190();
                        } else {
                            c17136.m40182(this);
                        }
                        return true;
                    default:
                        return m37114(abstractC2195, c17136);
                }
            case 5:
                C17011 c17011 = (C17011) abstractC2195;
                if (c17011.m39895().equals(EnumC22780.f73536)) {
                    c17136.m40182(this);
                    return false;
                }
                c17136.m40179(c17011);
                return true;
            case 6:
                if (!c17136.m2157("html")) {
                    c17136.m40182(this);
                }
                return true;
            default:
                return m37114(abstractC2195, c17136);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m37114(AbstractC2195 abstractC2195, C17136 c17136) {
        c17136.m40182(this);
        return false;
    }
}
