package l;

/* JADX INFO: renamed from: l.֡ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes2.dex */
public final enum C0202 extends EnumC22780 {
    public /* synthetic */ C0202() {
        this("InFrameset", 19);
    }

    public C0202(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC22780
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        EnumC22780 enumC22780;
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
        if (abstractC2195.m7255()) {
            C9251 c9251 = (C9251) abstractC2195;
            String str = c9251.f26122;
            str.getClass();
            switch (str) {
                case "frameset":
                    c17136.m40173(c9251);
                    return true;
                case "html":
                    enumC22780 = EnumC22780.f73546;
                    break;
                case "frame":
                    c17136.m40201(c9251);
                    return true;
                case "noframes":
                    enumC22780 = EnumC22780.f73545;
                    break;
                default:
                    c17136.m40182(this);
                    return false;
            }
            c17136.f2106 = c9251;
            return enumC22780.mo1361((AbstractC2195) c9251, c17136);
        }
        if (abstractC2195.m7257() && ((C20540) abstractC2195).f26122.equals("frameset")) {
            if (c17136.m2157("html")) {
                c17136.m40182(this);
                return false;
            }
            c17136.m40190();
            if (!c17136.m40188() && !c17136.m2157("frameset")) {
                c17136.m40212(EnumC22780.f73537);
                return true;
            }
        } else if (abstractC2195.m7258()) {
            if (!c17136.m2157("html")) {
                c17136.m40182(this);
            }
        } else {
            c17136.m40182(this);
            return false;
        }
        return true;
    }
}
