package l;

/* JADX INFO: renamed from: l.ۡۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C8670 extends EnumC22780 {
    public /* synthetic */ C8670() {
        this("InCell", 14);
    }

    public C8670(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC22780
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        if (abstractC2195.m7257()) {
            String str = ((C20540) abstractC2195).f26122;
            if (C20519.m47005(str, C11492.f34313)) {
                if (c17136.m40210(str)) {
                    c17136.m40204(false);
                    if (!c17136.m2157(str)) {
                        c17136.m40182(this);
                    }
                    c17136.m40187(str);
                    c17136.m40217();
                    c17136.m40212(EnumC22780.f73554);
                    return true;
                }
                c17136.m40182(this);
                c17136.m40212(EnumC22780.f73554);
                return false;
            }
            if (C20519.m47005(str, C11492.f34336)) {
                c17136.m40182(this);
                return false;
            }
            if (C20519.m47005(str, C11492.f34306)) {
                if (!c17136.m40210(str)) {
                    c17136.m40182(this);
                    return false;
                }
                m22456(c17136);
                return c17136.mo2158(abstractC2195);
            }
            return m22457(abstractC2195, c17136);
        }
        if (abstractC2195.m7255() && C20519.m47005(((C9251) abstractC2195).f26122, C11492.f34305)) {
            if (!c17136.m40210("td") && !c17136.m40210("th")) {
                c17136.m40182(this);
                return false;
            }
            m22456(c17136);
            return c17136.mo2158(abstractC2195);
        }
        return m22457(abstractC2195, c17136);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m22457(AbstractC2195 abstractC2195, C17136 c17136) {
        EnumC22780 enumC22780 = EnumC22780.f73546;
        c17136.f2106 = abstractC2195;
        return enumC22780.mo1361(abstractC2195, c17136);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22456(C17136 c17136) {
        if (c17136.m40210("td")) {
            c17136.m2163("td");
        } else {
            c17136.m2163("th");
        }
    }
}
