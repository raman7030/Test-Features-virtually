package l;

/* JADX INFO: renamed from: l.ۢۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C9376 extends EnumC22780 {
    public /* synthetic */ C9376() {
        this("InRow", 13);
    }

    public C9376(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC22780
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        if (abstractC2195.m7255()) {
            C9251 c9251 = (C9251) abstractC2195;
            String str = c9251.f26122;
            if (C20519.m47005(str, C11492.f34313)) {
                c17136.m40229();
                c17136.m40173(c9251);
                c17136.m40212(EnumC22780.f73549);
                c17136.m40185();
                return true;
            }
            if (C20519.m47005(str, C11492.f34310)) {
                return m24204(abstractC2195, (AbstractC0489) c17136);
            }
            return m24205(abstractC2195, c17136);
        }
        if (abstractC2195.m7257()) {
            String str2 = ((C20540) abstractC2195).f26122;
            if (str2.equals("tr")) {
                if (!c17136.m40210(str2)) {
                    c17136.m40182(this);
                    return false;
                }
                c17136.m40229();
                c17136.m40190();
                c17136.m40212(EnumC22780.f73540);
                return true;
            }
            if (str2.equals("table")) {
                return m24204(abstractC2195, (AbstractC0489) c17136);
            }
            if (C20519.m47005(str2, C11492.f34308)) {
                if (!c17136.m40210(str2) || !c17136.m40210("tr")) {
                    c17136.m40182(this);
                    return false;
                }
                c17136.m40229();
                c17136.m40190();
                c17136.m40212(EnumC22780.f73540);
                return true;
            }
            if (C20519.m47005(str2, C11492.f34312)) {
                c17136.m40182(this);
                return false;
            }
            return m24205(abstractC2195, c17136);
        }
        return m24205(abstractC2195, c17136);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m24205(AbstractC2195 abstractC2195, C17136 c17136) {
        EnumC22780 enumC22780 = EnumC22780.f73560;
        c17136.f2106 = abstractC2195;
        return enumC22780.mo1361(abstractC2195, c17136);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m24204(AbstractC2195 abstractC2195, AbstractC0489 abstractC0489) {
        if (abstractC0489.m2163("tr")) {
            return abstractC0489.mo2158(abstractC2195);
        }
        return false;
    }
}
