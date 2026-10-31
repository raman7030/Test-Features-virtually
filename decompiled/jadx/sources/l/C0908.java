package l;

/* JADX INFO: renamed from: l.֨ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes2.dex */
public final enum C0908 extends EnumC22780 {
    public /* synthetic */ C0908() {
        this("AfterAfterBody", 21);
    }

    public C0908(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC22780
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        if (abstractC2195.m7254()) {
            c17136.m40178((C14188) abstractC2195);
            return true;
        }
        if (abstractC2195.m7256() || (abstractC2195.m7255() && ((C9251) abstractC2195).f26122.equals("html"))) {
            EnumC22780 enumC22780 = EnumC22780.f73546;
            c17136.f2106 = abstractC2195;
            return enumC22780.mo1361(abstractC2195, c17136);
        }
        if (EnumC22780.m50859(abstractC2195)) {
            c17136.m40179((C17011) abstractC2195);
            return true;
        }
        if (abstractC2195.m7258()) {
            return true;
        }
        c17136.m40182(this);
        c17136.m40208();
        return c17136.mo2158(abstractC2195);
    }
}
