package l;

/* JADX INFO: renamed from: l.᩻ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes.dex */
public final enum C23486 extends EnumC22780 {
    public /* synthetic */ C23486() {
        this("InCaption", 10);
    }

    public C23486(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC22780
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        if (abstractC2195.m7257()) {
            C20540 c20540 = (C20540) abstractC2195;
            if (c20540.f26122.equals("caption")) {
                if (!c17136.m40210(c20540.f26122)) {
                    c17136.m40182(this);
                    return false;
                }
                c17136.m40204(false);
                if (!c17136.m2157("caption")) {
                    c17136.m40182(this);
                }
                c17136.m40187("caption");
                c17136.m40217();
                c17136.m40212(EnumC22780.f73560);
                return true;
            }
        }
        if ((abstractC2195.m7255() && C20519.m47005(((C9251) abstractC2195).f26122, C11492.f34305)) || (abstractC2195.m7257() && ((C20540) abstractC2195).f26122.equals("table"))) {
            c17136.m40182(this);
            if (c17136.m2163("caption")) {
                return c17136.mo2158(abstractC2195);
            }
            return true;
        }
        if (abstractC2195.m7257() && C20519.m47005(((C20540) abstractC2195).f26122, C11492.f34335)) {
            c17136.m40182(this);
            return false;
        }
        EnumC22780 enumC22780 = EnumC22780.f73546;
        c17136.f2106 = abstractC2195;
        return enumC22780.mo1361(abstractC2195, c17136);
    }
}
