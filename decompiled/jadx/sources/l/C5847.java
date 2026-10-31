package l;

import com.alipay.sdk.m.n.c;

/* JADX INFO: renamed from: l.ۛۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C5847 extends EnumC22780 {
    public /* synthetic */ C5847() {
        this("InTable", 8);
    }

    @Override // l.EnumC22780
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        if (abstractC2195.f7214 == EnumC15599.Character && C20519.m47005(c17136.m2153().m45588(), C11492.f34316)) {
            c17136.m40220();
            c17136.m40219();
            c17136.m40212(EnumC22780.f73556);
            return c17136.mo2158(abstractC2195);
        }
        if (abstractC2195.m7254()) {
            c17136.m40178((C14188) abstractC2195);
            return true;
        }
        if (abstractC2195.m7256()) {
            c17136.m40182(this);
            return false;
        }
        if (abstractC2195.m7255()) {
            C9251 c9251 = (C9251) abstractC2195;
            String str = c9251.f26122;
            if (str.equals("caption")) {
                c17136.m40206();
                c17136.m40185();
                c17136.m40173(c9251);
                c17136.m40212(EnumC22780.f73559);
                return true;
            }
            if (str.equals("colgroup")) {
                c17136.m40206();
                c17136.m40173(c9251);
                c17136.m40212(EnumC22780.f73541);
                return true;
            }
            if (str.equals("col")) {
                c17136.m40206();
                c17136.m2164("colgroup");
                return c17136.mo2158(abstractC2195);
            }
            if (C20519.m47005(str, C11492.f34308)) {
                c17136.m40206();
                c17136.m40173(c9251);
                c17136.m40212(EnumC22780.f73540);
                return true;
            }
            if (C20519.m47005(str, C11492.f34320)) {
                c17136.m40206();
                c17136.m2164("tbody");
                return c17136.mo2158(abstractC2195);
            }
            if (str.equals("table")) {
                c17136.m40182(this);
                if (c17136.m40210(str)) {
                    c17136.m40187(str);
                    if (!c17136.m40225()) {
                        c17136.m40173(c9251);
                        return true;
                    }
                    return c17136.mo2158(abstractC2195);
                }
            } else {
                if (C20519.m47005(str, C11492.f34322)) {
                    EnumC22780 enumC22780 = EnumC22780.f73545;
                    c17136.f2106 = abstractC2195;
                    return enumC22780.mo1361(abstractC2195, c17136);
                }
                if (str.equals("input")) {
                    if (!c9251.m22252() || !c9251.f26118.get("type").equalsIgnoreCase("hidden")) {
                        return m16373(abstractC2195, c17136);
                    }
                    c17136.m40201(c9251);
                    return true;
                }
                if (str.equals(c.c)) {
                    c17136.m40182(this);
                    if (c17136.m40198() == null && !c17136.m40186("template")) {
                        c17136.m40176(c9251, false, false);
                        return true;
                    }
                } else {
                    return m16373(abstractC2195, c17136);
                }
            }
            return false;
        }
        if (abstractC2195.m7257()) {
            String str2 = ((C20540) abstractC2195).f26122;
            if (str2.equals("table")) {
                if (!c17136.m40210(str2)) {
                    c17136.m40182(this);
                    return false;
                }
                c17136.m40187("table");
                c17136.m40225();
                return true;
            }
            if (C20519.m47005(str2, C11492.f34341)) {
                c17136.m40182(this);
                return false;
            }
            if (str2.equals("template")) {
                c17136.m40175(abstractC2195, EnumC22780.f73545);
                return true;
            }
            return m16373(abstractC2195, c17136);
        }
        if (abstractC2195.m7258()) {
            if (c17136.m2157("html")) {
                c17136.m40182(this);
            }
            return true;
        }
        return m16373(abstractC2195, c17136);
    }

    public C5847(String str, int i) {
        super(str, i, 0);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m16373(AbstractC2195 abstractC2195, C17136 c17136) {
        c17136.m40182(this);
        c17136.m40213(true);
        c17136.m40175(abstractC2195, EnumC22780.f73546);
        c17136.m40213(false);
        return true;
    }
}
