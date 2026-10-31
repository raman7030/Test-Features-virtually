package l;

/* JADX INFO: renamed from: l.ۜۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C6553 extends EnumC22780 {
    public /* synthetic */ C6553() {
        this("InColumnGroup", 11);
    }

    public C6553(String str, int i) {
        super(str, i, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x009d  */
    @Override // l.EnumC22780
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        if (EnumC22780.m50859(abstractC2195)) {
            abstractC2195.getClass();
            c17136.m40179((C17011) abstractC2195);
            return true;
        }
        int i = C21370.f68842[abstractC2195.f7214.ordinal()];
        if (i == 1) {
            c17136.m40178((C14188) abstractC2195);
            return true;
        }
        if (i == 2) {
            c17136.m40182(this);
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                if (i == 6) {
                    if (c17136.m2157("html")) {
                        return true;
                    }
                    return m18060(abstractC2195, c17136);
                }
                return m18060(abstractC2195, c17136);
            }
            String str = ((C20540) abstractC2195).f26122;
            str.getClass();
            if (str.equals("template")) {
                c17136.m40175(abstractC2195, EnumC22780.f73545);
                return true;
            }
            if (str.equals("colgroup")) {
                if (!c17136.m2157(str)) {
                    c17136.m40182(this);
                    return false;
                }
                c17136.m40190();
                c17136.m40212(EnumC22780.f73560);
                return true;
            }
            return m18060(abstractC2195, c17136);
        }
        C9251 c9251 = (C9251) abstractC2195;
        String str2 = c9251.f26122;
        str2.getClass();
        switch (str2) {
            case "template":
                c17136.m40175(abstractC2195, EnumC22780.f73545);
                return true;
            case "col":
                c17136.m40201(c9251);
                return true;
            case "html":
                EnumC22780 enumC22780 = EnumC22780.f73546;
                c17136.f2106 = abstractC2195;
                return enumC22780.mo1361(abstractC2195, c17136);
            default:
                return m18060(abstractC2195, c17136);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m18060(AbstractC2195 abstractC2195, C17136 c17136) {
        if (!c17136.m2157("colgroup")) {
            c17136.m40182(this);
            return false;
        }
        c17136.m40190();
        c17136.m40212(EnumC22780.f73560);
        c17136.mo2158(abstractC2195);
        return true;
    }
}
