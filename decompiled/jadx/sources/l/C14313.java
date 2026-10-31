package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UBJ4 */
/* JADX INFO: loaded from: classes4.dex */
public final enum C14313 extends EnumC22780 {
    public /* synthetic */ C14313() {
        this("InTableText", 9);
    }

    public C14313(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC22780
    /* JADX INFO: renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        if (abstractC2195.f7214 == EnumC15599.Character) {
            C17011 c17011 = (C17011) abstractC2195;
            if (c17011.m39895().equals(EnumC22780.f73536)) {
                c17136.m40182(this);
                return false;
            }
            ((ArrayList) c17136.m40209()).add(c17011.m39895());
            return true;
        }
        if (((ArrayList) c17136.m40209()).size() > 0) {
            for (String str : (ArrayList) c17136.m40209()) {
                if (!EnumC22780.m50858(str)) {
                    c17136.m40182(this);
                    if (C20519.m47005(c17136.m2153().m45588(), C11492.f34316)) {
                        c17136.m40213(true);
                        C17011 c17012 = new C17011();
                        c17012.m39894(str);
                        c17136.m40175(c17012, EnumC22780.f73546);
                        c17136.m40213(false);
                    } else {
                        C17011 c17013 = new C17011();
                        c17013.m39894(str);
                        c17136.m40175(c17013, EnumC22780.f73546);
                    }
                } else {
                    C17011 c17014 = new C17011();
                    c17014.m39894(str);
                    c17136.m40179(c17014);
                }
            }
            c17136.m40220();
        }
        c17136.m40212(c17136.m40171());
        return c17136.mo2158(abstractC2195);
    }
}
