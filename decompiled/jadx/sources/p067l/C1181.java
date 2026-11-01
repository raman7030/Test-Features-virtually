package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۜܶ */
/* JADX INFO: compiled from: X156 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1181 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m20466(EnumC1241 enumC1241, EnumC1241 enumC1242, EnumC1241 enumC1243, EnumC1241 enumC1244) {
        EnumC1241 enumC1245;
        EnumC1241 enumC1246;
        EnumC1241 enumC1247 = EnumC1241.FIXED;
        return (enumC1243 == enumC1247 || enumC1243 == (enumC1246 = EnumC1241.WRAP_CONTENT) || (enumC1243 == EnumC1241.MATCH_PARENT && enumC1241 != enumC1246)) || (enumC1244 == enumC1247 || enumC1244 == (enumC1245 = EnumC1241.WRAP_CONTENT) || (enumC1244 == EnumC1241.MATCH_PARENT && enumC1242 != enumC1245));
    }

    /* JADX WARN: Code duplicated, block: B:190:0x0356  */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m20467(C1906 c1906, InterfaceC1521 interfaceC1521) {
        C0866 c0866;
        int iM4503;
        int iM4504;
        C0866 c0867;
        C0866 c0868;
        ArrayList arrayList = c1906.f21023;
        int size = arrayList.size();
        char c = 0;
        for (int i = 0; i < size; i++) {
            C1591 c1591 = (C1591) arrayList.get(i);
            EnumC1241[] enumC1241Arr = c1906.f49244;
            EnumC1241 enumC1241 = enumC1241Arr[0];
            EnumC1241 enumC1242 = enumC1241Arr[1];
            EnumC1241[] enumC1241Arr2 = c1591.f49244;
            if (!m20466(enumC1241, enumC1242, enumC1241Arr2[0], enumC1241Arr2[1]) || (c1591 instanceof C1836)) {
                return false;
            }
        }
        int i2 = 0;
        ArrayList arrayList2 = null;
        ArrayList<C1486> arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList<C1486> arrayList5 = null;
        ArrayList arrayList6 = null;
        ArrayList arrayList7 = null;
        while (i2 < size) {
            C1591 c1592 = (C1591) arrayList.get(i2);
            EnumC1241[] enumC1241Arr3 = c1906.f49244;
            EnumC1241 enumC1243 = enumC1241Arr3[c];
            EnumC1241 enumC1244 = enumC1241Arr3[1];
            EnumC1241[] enumC1241Arr4 = c1592.f49244;
            if (!m20466(enumC1243, enumC1244, enumC1241Arr4[0], enumC1241Arr4[1])) {
                C1906.m50900(c1592, interfaceC1521, c1906.f71757);
            }
            boolean z = c1592 instanceof C0996;
            if (z) {
                C0996 c0996 = (C0996) c1592;
                if (c0996.m11506() == 0) {
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(c0996);
                }
                if (c0996.m11506() == 1) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(c0996);
                }
            }
            if (c1592 instanceof C1486) {
                if (c1592 instanceof C0961) {
                    C0961 c0961 = (C0961) c1592;
                    if (c0961.m9832() == 0) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(c0961);
                    }
                    if (c0961.m9832() == 1) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(c0961);
                    }
                } else {
                    C1486 c1486 = (C1486) c1592;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(c1486);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                    }
                    arrayList5.add(c1486);
                }
            }
            if (c1592.f49261.f19179 == null && c1592.f49279.f19179 == null && !z && !(c1592 instanceof C0961)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(c1592);
            }
            if (c1592.f49281.f19179 == null && c1592.f49253.f19179 == null && c1592.f49246.f19179 == null && !z && !(c1592 instanceof C0961)) {
                if (arrayList7 == null) {
                    arrayList7 = new ArrayList();
                }
                arrayList7.add(c1592);
            }
            i2++;
            c = 0;
        }
        ArrayList<C0866> arrayList8 = new ArrayList();
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                m20465((C0996) it.next(), 0, arrayList8, (C0866) null);
            }
        }
        C0866 c0869 = null;
        int i3 = 0;
        if (arrayList3 != null) {
            for (C1486 c1487 : arrayList3) {
                C0866 c0866M20465 = m20465(c1487, i3, arrayList8, c0869);
                c1487.m33627(i3, c0866M20465, arrayList8);
                c0866M20465.m4505(arrayList8);
                c0869 = null;
                i3 = 0;
            }
        }
        C1101 c1101Mo11496 = c1906.mo11496(EnumC0856.LEFT);
        if (c1101Mo11496.m16905() != null) {
            Iterator it2 = c1101Mo11496.m16905().iterator();
            while (it2.hasNext()) {
                m20465(((C1101) it2.next()).f19181, 0, arrayList8, (C0866) null);
            }
        }
        C1101 c1101Mo11497 = c1906.mo11496(EnumC0856.RIGHT);
        if (c1101Mo11497.m16905() != null) {
            Iterator it3 = c1101Mo11497.m16905().iterator();
            while (it3.hasNext()) {
                m20465(((C1101) it3.next()).f19181, 0, arrayList8, (C0866) null);
            }
        }
        C1101 c1101Mo11498 = c1906.mo11496(EnumC0856.CENTER);
        if (c1101Mo11498.m16905() != null) {
            Iterator it4 = c1101Mo11498.m16905().iterator();
            while (it4.hasNext()) {
                m20465(((C1101) it4.next()).f19181, 0, arrayList8, (C0866) null);
            }
        }
        C0866 c08610 = null;
        if (arrayList6 != null) {
            Iterator it5 = arrayList6.iterator();
            while (it5.hasNext()) {
                m20465((C1591) it5.next(), 0, arrayList8, (C0866) null);
            }
        }
        if (arrayList4 != null) {
            Iterator it6 = arrayList4.iterator();
            while (it6.hasNext()) {
                m20465((C0996) it6.next(), 1, arrayList8, (C0866) null);
            }
        }
        if (arrayList5 != null) {
            for (C1486 c1488 : arrayList5) {
                C0866 c0866M20466 = m20465(c1488, 1, arrayList8, c08610);
                c1488.m33627(1, c0866M20466, arrayList8);
                c0866M20466.m4505(arrayList8);
                c08610 = null;
            }
        }
        C1101 c1101Mo11499 = c1906.mo11496(EnumC0856.TOP);
        if (c1101Mo11499.m16905() != null) {
            Iterator it7 = c1101Mo11499.m16905().iterator();
            while (it7.hasNext()) {
                m20465(((C1101) it7.next()).f19181, 1, arrayList8, (C0866) null);
            }
        }
        C1101 c1101Mo114910 = c1906.mo11496(EnumC0856.BASELINE);
        if (c1101Mo114910.m16905() != null) {
            Iterator it8 = c1101Mo114910.m16905().iterator();
            while (it8.hasNext()) {
                m20465(((C1101) it8.next()).f19181, 1, arrayList8, (C0866) null);
            }
        }
        C1101 c1101Mo114911 = c1906.mo11496(EnumC0856.BOTTOM);
        if (c1101Mo114911.m16905() != null) {
            Iterator it9 = c1101Mo114911.m16905().iterator();
            while (it9.hasNext()) {
                m20465(((C1101) it9.next()).f19181, 1, arrayList8, (C0866) null);
            }
        }
        C1101 c1101Mo114912 = c1906.mo11496(EnumC0856.CENTER);
        if (c1101Mo114912.m16905() != null) {
            Iterator it10 = c1101Mo114912.m16905().iterator();
            while (it10.hasNext()) {
                m20465(((C1101) it10.next()).f19181, 1, arrayList8, (C0866) null);
            }
        }
        C0866 c08611 = null;
        if (arrayList7 != null) {
            Iterator it11 = arrayList7.iterator();
            while (it11.hasNext()) {
                m20465((C1591) it11.next(), 1, arrayList8, (C0866) null);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            C1591 c1593 = (C1591) arrayList.get(i4);
            EnumC1241[] enumC1241Arr5 = c1593.f49244;
            EnumC1241 enumC1245 = enumC1241Arr5[0];
            EnumC1241 enumC1246 = EnumC1241.MATCH_CONSTRAINT;
            if (enumC1245 == enumC1246 && enumC1241Arr5[1] == enumC1246) {
                int i5 = c1593.f49272;
                int size2 = arrayList8.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        c0867 = null;
                        break;
                    }
                    c0867 = (C0866) arrayList8.get(i6);
                    if (i5 == c0867.f4861) {
                        break;
                    }
                    i6++;
                }
                int i7 = c1593.f49245;
                int size3 = arrayList8.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size3) {
                        c0868 = null;
                        break;
                    }
                    c0868 = (C0866) arrayList8.get(i8);
                    if (i7 == c0868.f4861) {
                        break;
                    }
                    i8++;
                }
                if (c0867 != null && c0868 != null) {
                    c0867.m4504(0, c0868);
                    c0868.f4863 = 2;
                    arrayList8.remove(c0867);
                }
            }
        }
        if (arrayList8.size() <= 1) {
            return false;
        }
        if (c1906.f49244[0] == EnumC1241.WRAP_CONTENT) {
            int i9 = 0;
            c0866 = null;
            for (C0866 c08612 : arrayList8) {
                if (c08612.f4863 != 1 && (iM4504 = c08612.m4503(c1906.m50911(), 0)) > i9) {
                    c0866 = c08612;
                    i9 = iM4504;
                }
            }
            if (c0866 != null) {
                c1906.m37875(EnumC1241.FIXED);
                c1906.m37928(i9);
            } else {
                c0866 = null;
            }
        } else {
            c0866 = null;
        }
        if (c1906.f49244[1] == EnumC1241.WRAP_CONTENT) {
            int i10 = 0;
            C0866 c08613 = null;
            for (C0866 c08614 : arrayList8) {
                if (c08614.f4863 != 0 && (iM4503 = c08614.m4503(c1906.m50911(), 1)) > i10) {
                    c08613 = c08614;
                    i10 = iM4503;
                }
            }
            if (c08613 != null) {
                c1906.m37904(EnumC1241.FIXED);
                c1906.m37891(i10);
                c08611 = c08613;
            }
        }
        return (c0866 == null && c08611 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C0866 m20465(C1591 c1591, int i, ArrayList arrayList, C0866 c0866) {
        int i2;
        int i3;
        if (i == 0) {
            i2 = c1591.f49272;
        } else {
            i2 = c1591.f49245;
        }
        if (i2 != -1 && (c0866 == null || i2 != c0866.f4861)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                C0866 c0867 = (C0866) arrayList.get(i4);
                if (c0867.f4861 == i2) {
                    if (c0866 != null) {
                        c0866.m4504(i, c0867);
                        arrayList.remove(c0866);
                    }
                    c0866 = c0867;
                    break;
                }
            }
        } else if (i2 != -1) {
            return c0866;
        }
        if (c0866 == null) {
            if (c1591 instanceof C1486) {
                C1486 c1486 = (C1486) c1591;
                int i5 = 0;
                while (true) {
                    if (i5 >= c1486.f41927) {
                        i3 = -1;
                        break;
                    }
                    C1591 c1592 = c1486.f41928[i5];
                    if ((i == 0 && (i3 = c1592.f49272) != -1) || (i == 1 && (i3 = c1592.f49245) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i3 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        C0866 c0868 = (C0866) arrayList.get(i6);
                        if (c0868.f4861 == i3) {
                            c0866 = c0868;
                            break;
                        }
                    }
                }
            }
            if (c0866 == null) {
                c0866 = new C0866(i);
            }
            arrayList.add(c0866);
        }
        int i7 = c0866.f4861;
        if (c0866.m4506(c1591)) {
            if (c1591 instanceof C0996) {
                C0996 c0996 = (C0996) c1591;
                c0996.m11501().m16907(c0996.m11506() == 0 ? 1 : 0, c0866, arrayList);
            }
            if (i == 0) {
                c1591.f49272 = i7;
                c1591.f49261.m16907(i, c0866, arrayList);
                c1591.f49279.m16907(i, c0866, arrayList);
            } else {
                c1591.f49245 = i7;
                c1591.f49281.m16907(i, c0866, arrayList);
                c1591.f49246.m16907(i, c0866, arrayList);
                c1591.f49253.m16907(i, c0866, arrayList);
            }
            c1591.f49251.m16907(i, c0866, arrayList);
        }
        return c0866;
    }
}
