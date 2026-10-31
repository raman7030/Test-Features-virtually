package l;

/* JADX INFO: renamed from: l.᩵ۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes5.dex */
public final enum C19254 extends EnumC22780 {
    public /* synthetic */ C19254() {
        this("Initial", 0);
    }

    public C19254(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC22780
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        if (EnumC22780.m50859(abstractC2195)) {
            return true;
        }
        if (abstractC2195.m7254()) {
            c17136.m40178((C14188) abstractC2195);
            return true;
        }
        if (!abstractC2195.m7256()) {
            c17136.m40212(EnumC22780.f73544);
            return c17136.mo2158(abstractC2195);
        }
        C23361 c23361 = (C23361) abstractC2195;
        C7818 c7818 = new C7818(c17136.f2103.m5156(c23361.f75040.toString()), c23361.f75042.toString(), c23361.f75038.toString());
        c7818.m20902(c23361.f75039);
        c17136.f2109.m45584(c7818);
        c17136.m2155(c7818, abstractC2195);
        if (c23361.f75041) {
            c17136.f2109.m2908(EnumC4996.quirks);
        }
        c17136.m40212(EnumC22780.f73544);
        return true;
    }
}
