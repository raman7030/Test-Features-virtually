package l;

/* JADX INFO: renamed from: l.ۖۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes2.dex */
public final enum C2320 extends EnumC22780 {
    public /* synthetic */ C2320() {
        this("InSelectInTable", 16);
    }

    public C2320(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC22780
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        boolean zM7255 = abstractC2195.m7255();
        String[] strArr = C11492.f34324;
        if (zM7255 && C20519.m47005(((C9251) abstractC2195).f26122, strArr)) {
            c17136.m40182(this);
            c17136.m40187("select");
            c17136.m40225();
            return c17136.mo2158(abstractC2195);
        }
        if (abstractC2195.m7257()) {
            C20540 c20540 = (C20540) abstractC2195;
            if (C20519.m47005(c20540.f26122, strArr)) {
                c17136.m40182(this);
                if (!c17136.m40210(c20540.f26122)) {
                    return false;
                }
                c17136.m40187("select");
                c17136.m40225();
                return c17136.mo2158(abstractC2195);
            }
        }
        EnumC22780 enumC22780 = EnumC22780.f73553;
        c17136.f2106 = abstractC2195;
        return enumC22780.mo1361(abstractC2195, c17136);
    }
}
