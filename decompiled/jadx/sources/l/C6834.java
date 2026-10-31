package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X156 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6834 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18517(EnumC8040 enumC8040, EnumC8040 enumC8041, EnumC8040 enumC8042, EnumC8040 enumC8043) {
        EnumC8040 enumC8044;
        EnumC8040 enumC8045;
        EnumC8040 enumC8046 = EnumC8040.FIXED;
        return (enumC8042 == enumC8046 || enumC8042 == (enumC8045 = EnumC8040.WRAP_CONTENT) || (enumC8042 == EnumC8040.MATCH_PARENT && enumC8040 != enumC8045)) || (enumC8043 == enumC8046 || enumC8043 == (enumC8044 = EnumC8040.WRAP_CONTENT) || (enumC8043 == EnumC8040.MATCH_PARENT && enumC8041 != enumC8044));
    }

    /* JADX WARN: Code duplicated, block: B:190:0x0356  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18518(C21446 c21446, InterfaceC13683 interfaceC13683) {
        C0483 c0483;
        int iM2136;
        int iM2137;
        C0483 c0484;
        C0483 c0485;
        ArrayList arrayList = c21446.f18169;
        int size = arrayList.size();
        char c = 0;
        for (int i = 0; i < size; i++) {
            C15094 c15094 = (C15094) arrayList.get(i);
            EnumC8040[] enumC8040Arr = c21446.f46124;
            EnumC8040 enumC8040 = enumC8040Arr[0];
            EnumC8040 enumC8041 = enumC8040Arr[1];
            EnumC8040[] enumC8040Arr2 = c15094.f46124;
            if (!m18517(enumC8040, enumC8041, enumC8040Arr2[0], enumC8040Arr2[1]) || (c15094 instanceof C20035)) {
                return false;
            }
        }
        int i2 = 0;
        ArrayList arrayList2 = null;
        ArrayList<C12978> arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList<C12978> arrayList5 = null;
        ArrayList arrayList6 = null;
        ArrayList arrayList7 = null;
        while (i2 < size) {
            C15094 c15095 = (C15094) arrayList.get(i2);
            EnumC8040[] enumC8040Arr3 = c21446.f46124;
            EnumC8040 enumC8042 = enumC8040Arr3[c];
            EnumC8040 enumC8043 = enumC8040Arr3[1];
            EnumC8040[] enumC8040Arr4 = c15095.f46124;
            if (!m18517(enumC8042, enumC8043, enumC8040Arr4[0], enumC8040Arr4[1])) {
                C21446.m48563(c15095, interfaceC13683, c21446.f69059);
            }
            boolean z = c15095 instanceof C3101;
            if (z) {
                C3101 c3101 = (C3101) c15095;
                if (c3101.m9463() == 0) {
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(c3101);
                }
                if (c3101.m9463() == 1) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(c3101);
                }
            }
            if (c15095 instanceof C12978) {
                if (c15095 instanceof C2396) {
                    C2396 c2396 = (C2396) c15095;
                    if (c2396.m7769() == 0) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(c2396);
                    }
                    if (c2396.m7769() == 1) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(c2396);
                    }
                } else {
                    C12978 c12978 = (C12978) c15095;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(c12978);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                    }
                    arrayList5.add(c12978);
                }
            }
            if (c15095.f46141.f16339 == null && c15095.f46159.f16339 == null && !z && !(c15095 instanceof C2396)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(c15095);
            }
            if (c15095.f46161.f16339 == null && c15095.f46133.f16339 == null && c15095.f46126.f16339 == null && !z && !(c15095 instanceof C2396)) {
                if (arrayList7 == null) {
                    arrayList7 = new ArrayList();
                }
                arrayList7.add(c15095);
            }
            i2++;
            c = 0;
        }
        ArrayList<C0483> arrayList8 = new ArrayList();
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                m18516((C3101) it.next(), 0, arrayList8, (C0483) null);
            }
        }
        C0483 c0486 = null;
        int i3 = 0;
        if (arrayList3 != null) {
            for (C12978 c12979 : arrayList3) {
                C0483 c0483M18516 = m18516(c12979, i3, arrayList8, c0486);
                c12979.m31542(i3, c0483M18516, arrayList8);
                c0483M18516.m2138(arrayList8);
                c0486 = null;
                i3 = 0;
            }
        }
        C5218 c5218Mo9453 = c21446.mo9453(EnumC0278.LEFT);
        if (c5218Mo9453.m14995() != null) {
            Iterator it2 = c5218Mo9453.m14995().iterator();
            while (it2.hasNext()) {
                m18516(((C5218) it2.next()).f16341, 0, arrayList8, (C0483) null);
            }
        }
        C5218 c5218Mo9454 = c21446.mo9453(EnumC0278.RIGHT);
        if (c5218Mo9454.m14995() != null) {
            Iterator it3 = c5218Mo9454.m14995().iterator();
            while (it3.hasNext()) {
                m18516(((C5218) it3.next()).f16341, 0, arrayList8, (C0483) null);
            }
        }
        C5218 c5218Mo9455 = c21446.mo9453(EnumC0278.CENTER);
        if (c5218Mo9455.m14995() != null) {
            Iterator it4 = c5218Mo9455.m14995().iterator();
            while (it4.hasNext()) {
                m18516(((C5218) it4.next()).f16341, 0, arrayList8, (C0483) null);
            }
        }
        C0483 c0487 = null;
        if (arrayList6 != null) {
            Iterator it5 = arrayList6.iterator();
            while (it5.hasNext()) {
                m18516((C15094) it5.next(), 0, arrayList8, (C0483) null);
            }
        }
        if (arrayList4 != null) {
            Iterator it6 = arrayList4.iterator();
            while (it6.hasNext()) {
                m18516((C3101) it6.next(), 1, arrayList8, (C0483) null);
            }
        }
        if (arrayList5 != null) {
            for (C12978 c129710 : arrayList5) {
                C0483 c0483M18517 = m18516(c129710, 1, arrayList8, c0487);
                c129710.m31542(1, c0483M18517, arrayList8);
                c0483M18517.m2138(arrayList8);
                c0487 = null;
            }
        }
        C5218 c5218Mo9456 = c21446.mo9453(EnumC0278.TOP);
        if (c5218Mo9456.m14995() != null) {
            Iterator it7 = c5218Mo9456.m14995().iterator();
            while (it7.hasNext()) {
                m18516(((C5218) it7.next()).f16341, 1, arrayList8, (C0483) null);
            }
        }
        C5218 c5218Mo9457 = c21446.mo9453(EnumC0278.BASELINE);
        if (c5218Mo9457.m14995() != null) {
            Iterator it8 = c5218Mo9457.m14995().iterator();
            while (it8.hasNext()) {
                m18516(((C5218) it8.next()).f16341, 1, arrayList8, (C0483) null);
            }
        }
        C5218 c5218Mo9458 = c21446.mo9453(EnumC0278.BOTTOM);
        if (c5218Mo9458.m14995() != null) {
            Iterator it9 = c5218Mo9458.m14995().iterator();
            while (it9.hasNext()) {
                m18516(((C5218) it9.next()).f16341, 1, arrayList8, (C0483) null);
            }
        }
        C5218 c5218Mo9459 = c21446.mo9453(EnumC0278.CENTER);
        if (c5218Mo9459.m14995() != null) {
            Iterator it10 = c5218Mo9459.m14995().iterator();
            while (it10.hasNext()) {
                m18516(((C5218) it10.next()).f16341, 1, arrayList8, (C0483) null);
            }
        }
        C0483 c0488 = null;
        if (arrayList7 != null) {
            Iterator it11 = arrayList7.iterator();
            while (it11.hasNext()) {
                m18516((C15094) it11.next(), 1, arrayList8, (C0483) null);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            C15094 c15096 = (C15094) arrayList.get(i4);
            EnumC8040[] enumC8040Arr5 = c15096.f46124;
            EnumC8040 enumC8044 = enumC8040Arr5[0];
            EnumC8040 enumC8045 = EnumC8040.MATCH_CONSTRAINT;
            if (enumC8044 == enumC8045 && enumC8040Arr5[1] == enumC8045) {
                int i5 = c15096.f46152;
                int size2 = arrayList8.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        c0484 = null;
                        break;
                    }
                    c0484 = (C0483) arrayList8.get(i6);
                    if (i5 == c0484.f2089) {
                        break;
                    }
                    i6++;
                }
                int i7 = c15096.f46125;
                int size3 = arrayList8.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size3) {
                        c0485 = null;
                        break;
                    }
                    c0485 = (C0483) arrayList8.get(i8);
                    if (i7 == c0485.f2089) {
                        break;
                    }
                    i8++;
                }
                if (c0484 != null && c0485 != null) {
                    c0484.m2137(0, c0485);
                    c0485.f2091 = 2;
                    arrayList8.remove(c0484);
                }
            }
        }
        if (arrayList8.size() <= 1) {
            return false;
        }
        if (c21446.f46124[0] == EnumC8040.WRAP_CONTENT) {
            int i9 = 0;
            c0483 = null;
            for (C0483 c0489 : arrayList8) {
                if (c0489.f2091 != 1 && (iM2137 = c0489.m2136(c21446.m48574(), 0)) > i9) {
                    c0483 = c0489;
                    i9 = iM2137;
                }
            }
            if (c0483 != null) {
                c21446.m35717(EnumC8040.FIXED);
                c21446.m35770(i9);
            } else {
                c0483 = null;
            }
        } else {
            c0483 = null;
        }
        if (c21446.f46124[1] == EnumC8040.WRAP_CONTENT) {
            int i10 = 0;
            C0483 c04810 = null;
            for (C0483 c04811 : arrayList8) {
                if (c04811.f2091 != 0 && (iM2136 = c04811.m2136(c21446.m48574(), 1)) > i10) {
                    c04810 = c04811;
                    i10 = iM2136;
                }
            }
            if (c04810 != null) {
                c21446.m35746(EnumC8040.FIXED);
                c21446.m35733(i10);
                c0488 = c04810;
            }
        }
        return (c0483 == null && c0488 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0483 m18516(C15094 c15094, int i, ArrayList arrayList, C0483 c0483) {
        int i2;
        int i3;
        if (i == 0) {
            i2 = c15094.f46152;
        } else {
            i2 = c15094.f46125;
        }
        if (i2 != -1 && (c0483 == null || i2 != c0483.f2089)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                C0483 c0484 = (C0483) arrayList.get(i4);
                if (c0484.f2089 == i2) {
                    if (c0483 != null) {
                        c0483.m2137(i, c0484);
                        arrayList.remove(c0483);
                    }
                    c0483 = c0484;
                    break;
                }
            }
        } else if (i2 != -1) {
            return c0483;
        }
        if (c0483 == null) {
            if (c15094 instanceof C12978) {
                C12978 c12978 = (C12978) c15094;
                int i5 = 0;
                while (true) {
                    if (i5 >= c12978.f38881) {
                        i3 = -1;
                        break;
                    }
                    C15094 c15095 = c12978.f38882[i5];
                    if ((i == 0 && (i3 = c15095.f46152) != -1) || (i == 1 && (i3 = c15095.f46125) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i3 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        C0483 c0485 = (C0483) arrayList.get(i6);
                        if (c0485.f2089 == i3) {
                            c0483 = c0485;
                            break;
                        }
                    }
                }
            }
            if (c0483 == null) {
                c0483 = new C0483(i);
            }
            arrayList.add(c0483);
        }
        int i7 = c0483.f2089;
        if (c0483.m2139(c15094)) {
            if (c15094 instanceof C3101) {
                C3101 c3101 = (C3101) c15094;
                c3101.m9458().m14997(c3101.m9463() == 0 ? 1 : 0, c0483, arrayList);
            }
            if (i == 0) {
                c15094.f46152 = i7;
                c15094.f46141.m14997(i, c0483, arrayList);
                c15094.f46159.m14997(i, c0483, arrayList);
            } else {
                c15094.f46125 = i7;
                c15094.f46161.m14997(i, c0483, arrayList);
                c15094.f46126.m14997(i, c0483, arrayList);
                c15094.f46133.m14997(i, c0483, arrayList);
            }
            c15094.f46131.m14997(i, c0483, arrayList);
        }
        return c0483;
    }
}
