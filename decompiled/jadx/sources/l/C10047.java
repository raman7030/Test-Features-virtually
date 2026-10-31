package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TBH1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10047 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22041 f30198;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13012 m25214(C20630 c20630, boolean z) {
        int i;
        Iterator it;
        C7888 c7888M35492 = new C14984(c20630, new C10047(c20630, z).f30198).m35492();
        c20630.m47200();
        c20630.m47181(c7888M35492);
        ArrayList<C16395> arrayListM47190 = c20630.m47190();
        for (C16395 c16395 : arrayListM47190) {
            c16395.m38602(new C12163(arrayListM47190));
            c16395.m38593();
        }
        Iterator it2 = arrayListM47190.iterator();
        while (it2.hasNext()) {
            ((C16395) it2.next()).m38605();
        }
        int iM47202 = c20630.m47202();
        C16354 c16354 = new C16354(c20630.m47186());
        int iM47186 = c20630.m47186();
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 >= iM47186) {
                break;
            }
            if (i2 < iM47202) {
                c16354.mo21169(i2, (iM47186 - iM47202) + i2, 1);
            } else {
                c16354.mo21169(i2, i2 - iM47202, 1);
            }
            i2++;
        }
        c20630.m47181(c16354);
        c20630.m47176(new C12868(c20630.m47190()));
        ArrayList arrayListM47191 = c20630.m47190();
        C16395 c16395M47196 = c20630.m47196();
        BitSet bitSetM47174 = c20630.m47174();
        int iCardinality = bitSetM47174.cardinality();
        if (c16395M47196 != null && bitSetM47174.get(c16395M47196.m38609())) {
            iCardinality--;
        }
        C17246 c17246 = new C17246(iCardinality);
        Iterator it3 = arrayListM47191.iterator();
        int i3 = 0;
        while (it3.hasNext()) {
            C16395 c16396 = (C16395) it3.next();
            if (!bitSetM47174.get(c16396.m38609()) || c16396 == c16395M47196) {
                it = it3;
            } else {
                int i4 = i3 + 1;
                C21064 c21064M38614 = c16396.m38614();
                int iM38608 = c16396.m38608();
                C16395 c16395M47197 = c20630.m47196();
                int iM47912 = c21064M38614.m47912(c16395M47197 == null ? -1 : c16395M47197.m38607());
                if (iM47912 < 0) {
                    iM47912 = -1;
                }
                if (iM47912 >= 0) {
                    if (c21064M38614.size() > i) {
                        throw new RuntimeException("Exit predecessor must have no other successors".concat(C14712.m35006(c16396.m38607())));
                    }
                    c21064M38614 = C21064.f67936;
                    C3135 c3135Mo29537 = ((AbstractC14278) C18566.m43105(c16396.m38615(), i)).mo29537();
                    if (c3135Mo29537.m9558() != 2 && c3135Mo29537 != C12307.f36670) {
                        throw new RuntimeException("Exit predecessor must end in valid exit statement.");
                    }
                    iM38608 = -1;
                }
                c21064M38614.mo20349();
                int iM38607 = c16396.m38607();
                ArrayList arrayListM38615 = c16396.m38615();
                int size = arrayListM38615.size();
                C2430 c2430 = new C2430(size);
                int i5 = 0;
                while (i5 < size) {
                    c2430.m40986(i5, ((AbstractC14278) arrayListM38615.get(i5)).mo29538());
                    i5++;
                    it3 = it3;
                }
                it = it3;
                c2430.mo20349();
                c17246.m40531(i3, new C16540(iM38607, c2430, c21064M38614, iM38608));
                i3 = i4;
            }
            i = 1;
            it3 = it;
        }
        if (c16395M47196 == null || c16395M47196.m38615().isEmpty()) {
            return new C21336(new C13012(c17246, c20630.m47173(c20630.m47198()))).m48372();
        }
        throw new RuntimeException("Exit block must have no insns when leaving SSA form");
    }

    public C10047(C20630 c20630, boolean z) {
        this.f30198 = C4402.m13126(c20630);
    }
}
