package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: l.ۛۖܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1JP */
/* JADX INFO: loaded from: classes2.dex */
public final class C7854 {

    /* JADX INFO: renamed from: ֫ */
    public static C24794 f20592 = null;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f20593 = true;

    /* JADX INFO: renamed from: ۧ */
    public static boolean m18150() {
        return f20593;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C24794 m18148() {
        return f20592;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14735 m18147(C14735 c14735, int i, boolean z) {
        EnumSet enumSetAllOf = EnumSet.allOf(EnumC11878.class);
        f20593 = z;
        f20592 = C24794.f79245;
        C21975 c21975M43983 = C19292.m43983(c14735, i);
        m18149(c21975M43983, enumSetAllOf);
        C14735 c14735M27231 = C11917.m27231(c21975M43983, false);
        int iM42785 = c14735M27231.m33676().m42785();
        f20592.getClass();
        if (iM42785 <= 16) {
            return c14735M27231;
        }
        C21975 c21975M43984 = C19292.m43983(c14735, i);
        EnumSet enumSetClone = enumSetAllOf.clone();
        enumSetClone.remove(EnumC11878.CONST_COLLECTOR);
        m18149(c21975M43984, enumSetClone);
        return C11917.m27231(c21975M43984, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m18149(C21975 c21975, EnumSet enumSet) {
        boolean z;
        int i;
        C22783 c22783;
        C22783 c22784;
        if (enumSet.contains(EnumC11878.MOVE_PARAM_COMBINER)) {
            C14559.m33287(c21975);
        }
        if (enumSet.contains(EnumC11878.SCCP)) {
            C3869.m7627(c21975);
            C8524.m19820(c21975);
            z = false;
        } else {
            z = true;
        }
        if (enumSet.contains(EnumC11878.LITERAL_UPGRADE)) {
            C22607.m50664(c21975);
            C8524.m19820(c21975);
            z = false;
        }
        EnumC11878 enumC11878 = EnumC11878.ESCAPE_ANALYSIS;
        enumSet.remove(enumC11878);
        if (enumSet.contains(enumC11878)) {
            C3159.m5421(c21975);
            C8524.m19820(c21975);
            z = false;
        }
        if (enumSet.contains(EnumC11878.CONST_COLLECTOR)) {
            C15899 c15899 = new C15899();
            int iM49513 = c21975.m49513();
            int iM49514 = c21975.m49513();
            HashMap map = new HashMap();
            new HashSet();
            int i2 = 0;
            while (true) {
                i = 1;
                if (i2 >= iM49514) {
                    break;
                }
                AbstractC15938 abstractC15938M49521 = c21975.m49521(i2);
                if (abstractC15938M49521 != null && abstractC15938M49521.mo31602() != null) {
                    C22783 c22783M36175 = abstractC15938M49521.m36175();
                    InterfaceC3830 interfaceC3830M50974 = c22783M36175.m50974();
                    if (interfaceC3830M50974.mo7482()) {
                        AbstractC8225 abstractC8225 = (AbstractC8225) interfaceC3830M50974;
                        if (abstractC15938M49521.mo31602().m11605() == 56) {
                            abstractC15938M49521 = (AbstractC15938) C20013.m45383(((C17950) c21975.m49517().get(abstractC15938M49521.m36177().m40841().nextSetBit(0))).m40832(), 1);
                        }
                        if (!abstractC15938M49521.mo31608() && !c21975.m49510(c22783M36175)) {
                            Integer num = (Integer) map.get(abstractC8225);
                            if (num == null) {
                                map.put(abstractC8225, 1);
                            } else {
                                map.put(abstractC8225, Integer.valueOf(num.intValue() + 1));
                            }
                        }
                    }
                }
                i2++;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                if (((Integer) entry.getValue()).intValue() > 1) {
                    arrayList.add((AbstractC8225) entry.getKey());
                }
            }
            Collections.sort(arrayList, new C19253(map));
            int iMin = Math.min(arrayList.size(), 5);
            C17950 c17950M49522 = c21975.m49522();
            HashMap map2 = new HashMap(iMin);
            int i3 = 0;
            while (i3 < iMin) {
                AbstractC8225 abstractC8226 = (AbstractC8225) arrayList.get(i3);
                C22783 c22783M50968 = C22783.m50968(c21975.m49520(), abstractC8226);
                C5348 c5348M31915 = C14065.m31915(abstractC8226);
                if (c5348M31915.m11601() == i) {
                    c17950M49522.m40814(new C7360(C14065.m31915(abstractC8226), C12054.f33582, c22783M50968, C21442.f67643, abstractC8226));
                    c22784 = c22783M50968;
                } else {
                    C17950 c17950M49523 = c21975.m49522();
                    C17950 c17950M40823 = c17950M49523.m40823();
                    C17950 c17950M40833 = c17950M49523.m40833(c17950M40823);
                    C12054 c12054 = C12054.f33582;
                    C21442 c21442 = C21442.f67643;
                    c17950M40833.m40828(new C13395(c5348M31915, c12054, c21442, C15600.f44675, abstractC8226));
                    c22784 = c22783M50968;
                    c17950M40833.m40833(c17950M40823).m40814(new C3336(C14065.m31923(c22783M50968.m50974()), c12054, c22784, c21442));
                }
                map2.put(abstractC8226, c22784);
                i3++;
                c17950M49522 = c17950M49522;
                arrayList = arrayList;
                iMin = iMin;
                i = 1;
            }
            new HashSet();
            ArrayList[] arrayListArrM49528 = c21975.m49528();
            for (int i4 = 0; i4 < iM49513; i4++) {
                AbstractC15938 abstractC15938M49522 = c21975.m49521(i4);
                if (abstractC15938M49522 != null) {
                    C22783 c22783M36176 = abstractC15938M49522.m36175();
                    InterfaceC3830 interfaceC3830M50975 = abstractC15938M49522.m36175().m50974();
                    if (interfaceC3830M50975.mo7482() && (c22783 = (C22783) map2.get((AbstractC8225) interfaceC3830M50975)) != null && !c21975.m49510(c22783M36176)) {
                        C18582 c18582 = new C18582(c15899, c22783M36176, c22783);
                        for (AbstractC15938 abstractC15938 : arrayListArrM49528[c22783M36176.m50989()]) {
                            if (!abstractC15938.mo31608() || abstractC15938.m36177().m40821().cardinality() <= 1) {
                                abstractC15938.mo31604(c18582);
                            }
                        }
                    }
                }
            }
            C8524.m19820(c21975);
            z = false;
        }
        if (z) {
            C8524.m19820(c21975);
        }
        C9195.m21148(c21975);
    }
}
