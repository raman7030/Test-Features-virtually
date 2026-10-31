package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: l.ۛۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1JP */
/* JADX INFO: loaded from: classes2.dex */
public final class C5772 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23596 f17745 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f17746 = true;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m16231() {
        return f17746;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23596 m16229() {
        return f17745;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13012 m16228(C13012 c13012, int i, boolean z) {
        EnumSet enumSetAllOf = EnumSet.allOf(EnumC10006.class);
        f17746 = z;
        f17745 = C23596.f76501;
        C20630 c20630M41737 = C17807.m41737(c13012, i);
        m16230(c20630M41737, enumSetAllOf);
        C13012 c13012M25214 = C10047.m25214(c20630M41737, false);
        int iM40536 = c13012M25214.m31591().m40536();
        f17745.getClass();
        if (iM40536 <= 16) {
            return c13012M25214;
        }
        C20630 c20630M41738 = C17807.m41737(c13012, i);
        EnumSet enumSetClone = enumSetAllOf.clone();
        enumSetClone.remove(EnumC10006.CONST_COLLECTOR);
        m16230(c20630M41738, enumSetClone);
        return C10047.m25214(c20630M41738, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16230(C20630 c20630, EnumSet enumSet) {
        boolean z;
        int i;
        C21480 c21480;
        C21480 c21481;
        if (enumSet.contains(EnumC10006.MOVE_PARAM_COMBINER)) {
            C12827.m31201(c20630);
        }
        if (enumSet.contains(EnumC10006.SCCP)) {
            C1579.m5398(c20630);
            C6477.m17872(c20630);
            z = false;
        } else {
            z = true;
        }
        if (enumSet.contains(EnumC10006.LITERAL_UPGRADE)) {
            C21295.m48330(c20630);
            C6477.m17872(c20630);
            z = false;
        }
        EnumC10006 enumC10006 = EnumC10006.ESCAPE_ANALYSIS;
        enumSet.remove(enumC10006);
        if (enumSet.contains(enumC10006)) {
            C0832.m3107(c20630);
            C6477.m17872(c20630);
            z = false;
        }
        if (enumSet.contains(EnumC10006.CONST_COLLECTOR)) {
            C14237 c14237 = new C14237();
            int iM47186 = c20630.m47186();
            int iM47187 = c20630.m47186();
            HashMap map = new HashMap();
            new HashSet();
            int i2 = 0;
            while (true) {
                i = 1;
                if (i2 >= iM47187) {
                    break;
                }
                AbstractC14278 abstractC14278M47194 = c20630.m47194(i2);
                if (abstractC14278M47194 != null && abstractC14278M47194.mo29537() != null) {
                    C21480 c21480M34042 = abstractC14278M47194.m34042();
                    InterfaceC1538 interfaceC1538M48637 = c21480M34042.m48637();
                    if (interfaceC1538M48637.mo5253()) {
                        AbstractC6162 abstractC6162 = (AbstractC6162) interfaceC1538M48637;
                        if (abstractC14278M47194.mo29537().m9562() == 56) {
                            abstractC14278M47194 = (AbstractC14278) C18566.m43105(((C16395) c20630.m47190().get(abstractC14278M47194.m34044().m38624().nextSetBit(0))).m38615(), 1);
                        }
                        if (!abstractC14278M47194.mo29543() && !c20630.m47183(c21480M34042)) {
                            Integer num = (Integer) map.get(abstractC6162);
                            if (num == null) {
                                map.put(abstractC6162, 1);
                            } else {
                                map.put(abstractC6162, Integer.valueOf(num.intValue() + 1));
                            }
                        }
                    }
                }
                i2++;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                if (((Integer) entry.getValue()).intValue() > 1) {
                    arrayList.add((AbstractC6162) entry.getKey());
                }
            }
            Collections.sort(arrayList, new C17766(map));
            int iMin = Math.min(arrayList.size(), 5);
            C16395 c16395M47195 = c20630.m47195();
            HashMap map2 = new HashMap(iMin);
            int i3 = 0;
            while (i3 < iMin) {
                AbstractC6162 abstractC6163 = (AbstractC6162) arrayList.get(i3);
                C21480 c21480M48631 = C21480.m48631(c20630.m47193(), abstractC6163);
                C3135 c3135M29855 = C12307.m29855(abstractC6163);
                if (c3135M29855.m9558() == i) {
                    c16395M47195.m38597(new C5252(C12307.m29855(abstractC6163), C10191.f30620, c21480M48631, C20069.f65002, abstractC6163));
                    c21481 = c21480M48631;
                } else {
                    C16395 c16395M47196 = c20630.m47195();
                    C16395 c16395M38606 = c16395M47196.m38606();
                    C16395 c16395M38616 = c16395M47196.m38616(c16395M38606);
                    C10191 c10191 = C10191.f30620;
                    C20069 c20069 = C20069.f65002;
                    c16395M38616.m38611(new C11602(c3135M29855, c10191, c20069, C13922.f41594, abstractC6163));
                    c21481 = c21480M48631;
                    c16395M38616.m38616(c16395M38606).m38597(new C1018(C12307.m29863(c21480M48631.m48637()), c10191, c21481, c20069));
                }
                map2.put(abstractC6163, c21481);
                i3++;
                c16395M47195 = c16395M47195;
                arrayList = arrayList;
                iMin = iMin;
                i = 1;
            }
            new HashSet();
            ArrayList[] arrayListArrM47201 = c20630.m47201();
            for (int i4 = 0; i4 < iM47186; i4++) {
                AbstractC14278 abstractC14278M47195 = c20630.m47194(i4);
                if (abstractC14278M47195 != null) {
                    C21480 c21480M34043 = abstractC14278M47195.m34042();
                    InterfaceC1538 interfaceC1538M48638 = abstractC14278M47195.m34042().m48637();
                    if (interfaceC1538M48638.mo5253() && (c21480 = (C21480) map2.get((AbstractC6162) interfaceC1538M48638)) != null && !c20630.m47183(c21480M34043)) {
                        C17060 c17060 = new C17060(c14237, c21480M34043, c21480);
                        for (AbstractC14278 abstractC14278 : arrayListArrM47201[c21480M34043.m48652()]) {
                            if (!abstractC14278.mo29543() || abstractC14278.m34044().m38604().cardinality() <= 1) {
                                abstractC14278.mo29539(c17060);
                            }
                        }
                    }
                }
            }
            C6477.m17872(c20630);
            z = false;
        }
        if (z) {
            C6477.m17872(c20630);
        }
        C7183.m19201(c20630);
    }
}
