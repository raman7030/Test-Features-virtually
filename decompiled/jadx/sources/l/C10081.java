package l;

/* JADX INFO: renamed from: l.ۤۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes3.dex */
public final enum C10081 extends EnumC22780 {
    public /* synthetic */ C10081() {
        this("Text", 7);
    }

    @Override // l.EnumC22780
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        if (abstractC2195.f7214 == EnumC15599.Character) {
            c17136.m40179((C17011) abstractC2195);
            return true;
        }
        if (abstractC2195.m7258()) {
            c17136.m40182(this);
            c17136.m40190();
            c17136.m40212(c17136.m40171());
            return c17136.mo2158(abstractC2195);
        }
        if (!abstractC2195.m7257()) {
            return true;
        }
        c17136.m40190();
        c17136.m40212(c17136.m40171());
        return true;
    }

    public C10081(String str, int i) {
        super(str, i, 0);
    }
}
