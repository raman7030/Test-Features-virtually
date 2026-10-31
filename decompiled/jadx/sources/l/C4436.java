package l;

/* JADX INFO: renamed from: l.ۙۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C4436 extends EnumC22780 {
    public /* synthetic */ C4436() {
        this("InHead", 3);
    }

    public C4436(String str, int i) {
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
        int i = C21370.f68842[abstractC2195.f7214.ordinal()];
        if (i == 1) {
            c17136.m40178((C14188) abstractC2195);
            return true;
        }
        if (i == 2) {
            c17136.m40182(this);
            return false;
        }
        if (i != 3) {
            if (i != 4) {
                return m13161(abstractC2195, (AbstractC0489) c17136);
            }
            String str = ((C20540) abstractC2195).f26122;
            if (str.equals("head")) {
                c17136.m40190();
                c17136.m40212(EnumC22780.f73548);
                return true;
            }
            if (C20519.m47005(str, C11492.f34328)) {
                return m13161(abstractC2195, (AbstractC0489) c17136);
            }
            if (str.equals("template")) {
                if (!c17136.m40186(str)) {
                    c17136.m40182(this);
                    return true;
                }
                c17136.m40204(true);
                if (!str.equals(c17136.m2153().m45588())) {
                    c17136.m40182(this);
                }
                c17136.m40187(str);
                c17136.m40217();
                c17136.m40172();
                c17136.m40225();
                return true;
            }
            c17136.m40182(this);
            return false;
        }
        C9251 c9251 = (C9251) abstractC2195;
        String str2 = c9251.f26122;
        if (str2.equals("html")) {
            return EnumC22780.f73546.mo1361(abstractC2195, c17136);
        }
        if (C20519.m47005(str2, C11492.f34317)) {
            C19814 c19814M40201 = c17136.m40201(c9251);
            if (str2.equals("base") && c19814M40201.mo25052("href")) {
                c17136.m40216(c19814M40201);
            }
            return true;
        }
        if (str2.equals("meta")) {
            c17136.m40201(c9251);
            return true;
        }
        if (str2.equals("title")) {
            EnumC22780.m50861(c9251, c17136);
            return true;
        }
        if (C20519.m47005(str2, C11492.f34337)) {
            EnumC22780.m50860(c9251, c17136);
            return true;
        }
        if (str2.equals("noscript")) {
            c17136.m40173(c9251);
            c17136.m40212(EnumC22780.f73552);
            return true;
        }
        if (str2.equals("script")) {
            c17136.f2104.m44177(EnumC19541.f63125);
            c17136.m40219();
            c17136.m40212(EnumC22780.f73551);
            c17136.m40173(c9251);
            return true;
        }
        if (str2.equals("head")) {
            c17136.m40182(this);
            return false;
        }
        if (str2.equals("template")) {
            c17136.m40173(c9251);
            c17136.m40185();
            c17136.m40183(false);
            EnumC22780 enumC22780 = EnumC22780.f73543;
            c17136.m40212(enumC22780);
            c17136.m40203(enumC22780);
            return true;
        }
        return m13161(abstractC2195, (AbstractC0489) c17136);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m13161(AbstractC2195 abstractC2195, AbstractC0489 abstractC0489) {
        abstractC0489.m2163("head");
        return abstractC0489.mo2158(abstractC2195);
    }
}
