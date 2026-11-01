package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۙۙۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 25VK */
/* JADX INFO: loaded from: classes2.dex */
public final class C6563 {
    /* JADX INFO: renamed from: ֫ */
    public static void m15002(C7726 c7726) {
        C15041 c15041;
        ArrayList<C7055> arrayList = c7726.f20264;
        c7726.f20264 = new ArrayList();
        C21316 c21316 = new C21316();
        for (C7055 c7055 : arrayList) {
            C7055 c7055M16269 = c7055.m16269(c21316);
            AbstractC3880 abstractC3880M7669 = c7055.f18393.m7669();
            boolean z = false;
            while (true) {
                c15041 = c7055.f18391;
                if (abstractC3880M7669 == c15041) {
                    break;
                }
                if (C16620.m37688(abstractC3880M7669)) {
                    if (!z) {
                        AbstractC3880 abstractC3880M7671 = abstractC3880M7669.m7671();
                        if (abstractC3880M7671 == null || abstractC3880M7671.f8417 != EnumC9677.LABEL) {
                            abstractC3880M7671 = new C15041();
                            c7726.f20257.m40882(abstractC3880M7669, abstractC3880M7671);
                        }
                        c7055M16269.f18393 = (C15041) abstractC3880M7671;
                        z = true;
                    }
                } else if (z) {
                    AbstractC3880 abstractC3880M7672 = abstractC3880M7669.m7671();
                    if (abstractC3880M7672 == null || abstractC3880M7672.f8417 != EnumC9677.LABEL) {
                        abstractC3880M7672 = new C15041();
                        c7726.f20257.m40882(abstractC3880M7669, abstractC3880M7672);
                    }
                    c7055M16269.f18391 = (C15041) abstractC3880M7672;
                    c7726.f20264.add(c7055M16269);
                    c7055M16269 = c7055.m16269(c21316);
                    z = false;
                }
                abstractC3880M7669 = abstractC3880M7669.m7669();
            }
            if (z) {
                c7055M16269.f18391 = c15041;
                c7726.f20264.add(c7055M16269);
            }
        }
    }
}
