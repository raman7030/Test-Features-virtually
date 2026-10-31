package l;

import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: l.᩹ۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBEC */
/* JADX INFO: loaded from: classes.dex */
public final class C22000 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f70510;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20630 f70511;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19884 f70512;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final BitSet f70513;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19884 m49495(C20630 c20630) {
        C22000 c22000;
        C22000 c22001;
        C22000 c22002 = new C22000(c20630);
        C20630 c20631 = c22002.f70511;
        int iM47186 = c20631.m47186();
        C19884 c19884 = c22002.f70512;
        if (iM47186 > 0) {
            int iM47198 = c20631.m47198();
            while (iM47198 >= 0) {
                BitSet bitSet = c22002.f70513;
                bitSet.clear(iM47198);
                C4546 c4546M45715 = c19884.m45715(iM47198);
                C16395 c16395 = (C16395) c22002.f70510.get(iM47198);
                ArrayList arrayListM38615 = c16395.m38615();
                int size = arrayListM38615.size();
                if (iM47198 == c20631.m47192()) {
                    c22000 = c22002;
                } else {
                    int i = size - 1;
                    AbstractC14278 abstractC14278 = (AbstractC14278) arrayListM38615.get(i);
                    boolean z = (abstractC14278.mo29542().mo3533().size() == 0 || abstractC14278.m34042() == null) ? false : true;
                    int i2 = 0;
                    C4546 c4546M13351 = c4546M45715;
                    while (i2 < size) {
                        if (z && i2 == i) {
                            c4546M13351.mo20349();
                            c4546M13351 = c4546M13351.m13351();
                        }
                        AbstractC14278 abstractC14279 = (AbstractC14278) arrayListM38615.get(i2);
                        C21480 c21480Mo29540 = abstractC14279.mo29540();
                        if (c21480Mo29540 == null) {
                            C21480 c21480M34042 = abstractC14279.m34042();
                            if (c21480M34042 != null && c4546M13351.get(c21480M34042.m48652()) != null) {
                                c4546M13351.m13359(c4546M13351.get(c21480M34042.m48652()));
                            }
                        } else {
                            C21480 c21480M48648 = c21480Mo29540.m48648();
                            c4546M13351.getClass();
                            if (!c21480M48648.equals(c4546M13351.get(c21480M48648.m48652()))) {
                                C21480 c21480M13353 = c4546M13351.m13353(c21480M48648.m48653());
                                if (c21480M13353 != null) {
                                    c22001 = c22002;
                                    if (c21480M13353.m48652() != c21480M48648.m48652()) {
                                        c4546M13351.m13359(c21480M13353);
                                    }
                                } else {
                                    c22001 = c22002;
                                }
                                c19884.m45713(abstractC14279, c21480M48648);
                                c4546M13351.m13358(c21480M48648);
                            }
                            i2++;
                            c22002 = c22001;
                        }
                        c22001 = c22002;
                        i2++;
                        c22002 = c22001;
                    }
                    c22000 = c22002;
                    c4546M13351.mo20349();
                    C21064 c21064M38603 = c16395.m38603();
                    int size2 = c21064M38603.size();
                    int iM38623 = c16395.m38623();
                    for (int i3 = 0; i3 < size2; i3++) {
                        int i4 = c21064M38603.get(i3);
                        if (c19884.m45714(i4, i4 == iM38623 ? c4546M13351 : c4546M45715)) {
                            bitSet.set(i4);
                        }
                    }
                }
                iM47198 = bitSet.nextSetBit(0);
                c22002 = c22000;
            }
        }
        c19884.mo20349();
        return c19884;
    }

    public C22000(C20630 c20630) {
        ArrayList arrayListM47190 = c20630.m47190();
        this.f70511 = c20630;
        this.f70510 = arrayListM47190;
        this.f70512 = new C19884(c20630);
        this.f70513 = new BitSet(arrayListM47190.size());
    }
}
