package l;

/* JADX INFO: renamed from: l.᩷ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes5.dex */
public final enum C20665 extends EnumC22780 {
    public /* synthetic */ C20665() {
        this("InTableBody", 12);
    }

    public C20665(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC22780
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        int i = C21370.f68842[abstractC2195.f7214.ordinal()];
        if (i == 3) {
            C9251 c9251 = (C9251) abstractC2195;
            String str = c9251.f26122;
            if (str.equals("tr")) {
                c17136.m40214();
                c17136.m40173(c9251);
                c17136.m40212(EnumC22780.f73554);
                return true;
            }
            if (C20519.m47005(str, C11492.f34313)) {
                c17136.m40182(this);
                c17136.m2164("tr");
                return c17136.mo2158((AbstractC2195) c9251);
            }
            if (C20519.m47005(str, C11492.f34323)) {
                return m47282(abstractC2195, c17136);
            }
            return m47281(abstractC2195, c17136);
        }
        if (i == 4) {
            String str2 = ((C20540) abstractC2195).f26122;
            if (C20519.m47005(str2, C11492.f34326)) {
                if (!c17136.m40210(str2)) {
                    c17136.m40182(this);
                    return false;
                }
                c17136.m40214();
                c17136.m40190();
                c17136.m40212(EnumC22780.f73560);
                return true;
            }
            if (str2.equals("table")) {
                return m47282(abstractC2195, c17136);
            }
            if (C20519.m47005(str2, C11492.f34314)) {
                c17136.m40182(this);
                return false;
            }
            return m47281(abstractC2195, c17136);
        }
        return m47281(abstractC2195, c17136);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m47282(AbstractC2195 abstractC2195, C17136 c17136) {
        if (!c17136.m40210("tbody") && !c17136.m40210("thead") && !c17136.m40200("tfoot")) {
            c17136.m40182(this);
            return false;
        }
        c17136.m40214();
        c17136.m2163(c17136.m2153().m45588());
        return c17136.mo2158(abstractC2195);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m47281(AbstractC2195 abstractC2195, C17136 c17136) {
        EnumC22780 enumC22780 = EnumC22780.f73560;
        c17136.f2106 = abstractC2195;
        return enumC22780.mo1361(abstractC2195, c17136);
    }
}
