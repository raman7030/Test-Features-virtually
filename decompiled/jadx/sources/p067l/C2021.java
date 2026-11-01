package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ܶ */
/* JADX INFO: compiled from: J16Q */
/* JADX INFO: loaded from: classes.dex */
public final class C2021 {

    /* JADX INFO: renamed from: ֫ */
    public static C1976 f79689 = new C1976();

    /* JADX INFO: renamed from: ֫ */
    public static void m54846(C1591 c1591, InterfaceC1521 interfaceC1521, boolean z) {
        C1101 c1101;
        C1101 c1102;
        C1101 c1103;
        C1101 c1104;
        C1101 c1105;
        if (!(c1591 instanceof C1906) && c1591.m37898() && m54848(c1591)) {
            C1906.m50900(c1591, interfaceC1521, new C1976());
        }
        C1101 c1101Mo11496 = c1591.mo11496(EnumC0856.LEFT);
        C1101 c1101Mo11497 = c1591.mo11496(EnumC0856.RIGHT);
        int iM16914 = c1101Mo11496.m16914();
        int iM16915 = c1101Mo11497.m16914();
        char c = 0;
        if (c1101Mo11496.m16905() != null && c1101Mo11496.m16911()) {
            for (C1101 c1106 : c1101Mo11496.m16905()) {
                C1591 c1592 = c1106.f19181;
                boolean zM54848 = m54848(c1592);
                C1101 c1107 = c1592.f49261;
                C1101 c1108 = c1592.f49279;
                if (c1592.m37898() && zM54848) {
                    C1906.m50900(c1592, interfaceC1521, new C1976());
                }
                EnumC1241 enumC1241 = c1592.f49244[c];
                EnumC1241 enumC1242 = EnumC1241.MATCH_CONSTRAINT;
                if (enumC1241 != enumC1242 || zM54848) {
                    if (!c1592.m37898()) {
                        if (c1106 == c1107 && c1108.f19179 == null) {
                            int iM16917 = c1107.m16917() + iM16914;
                            c1592.m37868(iM16917, c1592.m37911() + iM16917);
                            m54846(c1592, interfaceC1521, z);
                        } else if (c1106 == c1108 && c1107.f19179 == null) {
                            int iM16918 = iM16914 - c1108.m16917();
                            c1592.m37868(iM16918 - c1592.m37911(), iM16918);
                            m54846(c1592, interfaceC1521, z);
                        } else if (c1106 == c1107 && (c1103 = c1108.f19179) != null && c1103.m16911() && !c1592.m37887()) {
                            m54850(c1592, interfaceC1521, z);
                        }
                    }
                } else if (enumC1241 == enumC1242 && c1592.f49233 >= 0 && c1592.f49273 >= 0 && ((c1592.m37893() == 8 || (c1592.f49265 == 0 && c1592.f49228 == 0.0f)) && !c1592.m37887() && !c1592.m37906() && (((c1106 == c1107 && (c1105 = c1108.f19179) != null && c1105.m16911()) || (c1106 == c1108 && (c1104 = c1107.f19179) != null && c1104.m16911())) && !c1592.m37887()))) {
                    m54845(c1591, interfaceC1521, c1592, z);
                }
                c = 0;
            }
        }
        if ((c1591 instanceof C0996) || c1101Mo11497.m16905() == null || !c1101Mo11497.m16911()) {
            return;
        }
        for (C1101 c1109 : c1101Mo11497.m16905()) {
            C1591 c1593 = c1109.f19181;
            boolean zM54849 = m54848(c1593);
            C1101 c11010 = c1593.f49261;
            C1101 c11011 = c1593.f49279;
            if (c1593.m37898() && zM54849) {
                C1906.m50900(c1593, interfaceC1521, new C1976());
            }
            boolean z2 = (c1109 == c11010 && (c1102 = c11011.f19179) != null && c1102.m16911()) || (c1109 == c11011 && (c1101 = c11010.f19179) != null && c1101.m16911());
            EnumC1241 enumC1243 = c1593.f49244[0];
            EnumC1241 enumC1244 = EnumC1241.MATCH_CONSTRAINT;
            if (enumC1243 != enumC1244 || zM54849) {
                if (!c1593.m37898()) {
                    if (c1109 == c11010 && c11011.f19179 == null) {
                        int iM16919 = c11010.m16917() + iM16915;
                        c1593.m37868(iM16919, c1593.m37911() + iM16919);
                        m54846(c1593, interfaceC1521, z);
                    } else if (c1109 == c11011 && c11010.f19179 == null) {
                        int iM169110 = iM16915 - c11011.m16917();
                        c1593.m37868(iM169110 - c1593.m37911(), iM169110);
                        m54846(c1593, interfaceC1521, z);
                    } else if (z2 && !c1593.m37887()) {
                        m54850(c1593, interfaceC1521, z);
                    }
                }
            } else if (enumC1243 == enumC1244 && c1593.f49233 >= 0 && c1593.f49273 >= 0 && (c1593.m37893() == 8 || (c1593.f49265 == 0 && c1593.f49228 == 0.0f))) {
                if (!c1593.m37887() && !c1593.m37906() && z2 && !c1593.m37887()) {
                    m54845(c1591, interfaceC1521, c1593, z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m54849(C1591 c1591, InterfaceC1521 interfaceC1521) {
        C1101 c1101;
        C1101 c1102;
        C1101 c1103;
        C1101 c1104;
        C1101 c1105;
        if (!(c1591 instanceof C1906) && c1591.m37898() && m54848(c1591)) {
            C1906.m50900(c1591, interfaceC1521, new C1976());
        }
        C1101 c1101Mo11496 = c1591.mo11496(EnumC0856.TOP);
        C1101 c1101Mo11497 = c1591.mo11496(EnumC0856.BOTTOM);
        int iM16914 = c1101Mo11496.m16914();
        int iM16915 = c1101Mo11497.m16914();
        if (c1101Mo11496.m16905() != null && c1101Mo11496.m16911()) {
            for (C1101 c1106 : c1101Mo11496.m16905()) {
                C1591 c1592 = c1106.f19181;
                boolean zM54848 = m54848(c1592);
                C1101 c1107 = c1592.f49281;
                C1101 c1108 = c1592.f49253;
                if (c1592.m37898() && zM54848) {
                    C1906.m50900(c1592, interfaceC1521, new C1976());
                }
                EnumC1241 enumC1241 = c1592.f49244[1];
                EnumC1241 enumC1242 = EnumC1241.MATCH_CONSTRAINT;
                if (enumC1241 != enumC1242 || zM54848) {
                    if (!c1592.m37898()) {
                        if (c1106 == c1107 && c1108.f19179 == null) {
                            int iM16917 = c1107.m16917() + iM16914;
                            c1592.m37902(iM16917, c1592.m37890() + iM16917);
                            m54849(c1592, interfaceC1521);
                        } else if (c1106 == c1108 && c1108.f19179 == null) {
                            int iM16918 = iM16914 - c1108.m16917();
                            c1592.m37902(iM16918 - c1592.m37890(), iM16918);
                            m54849(c1592, interfaceC1521);
                        } else if (c1106 == c1107 && (c1103 = c1108.f19179) != null && c1103.m16911()) {
                            m54843(c1592, interfaceC1521);
                        }
                    }
                } else if (enumC1241 == enumC1242 && c1592.f49248 >= 0 && c1592.f49258 >= 0 && (c1592.m37893() == 8 || (c1592.f49290 == 0 && c1592.f49228 == 0.0f))) {
                    if (!c1592.m37907() && !c1592.m37906() && ((c1106 == c1107 && (c1105 = c1108.f19179) != null && c1105.m16911()) || (c1106 == c1108 && (c1104 = c1107.f19179) != null && c1104.m16911()))) {
                        if (!c1592.m37907()) {
                            m54844(c1591, interfaceC1521, c1592);
                        }
                    }
                }
            }
        }
        if (c1591 instanceof C0996) {
            return;
        }
        if (c1101Mo11497.m16905() != null && c1101Mo11497.m16911()) {
            for (C1101 c1109 : c1101Mo11497.m16905()) {
                C1591 c1593 = c1109.f19181;
                boolean zM54849 = m54848(c1593);
                C1101 c11010 = c1593.f49281;
                C1101 c11011 = c1593.f49253;
                if (c1593.m37898() && zM54849) {
                    C1906.m50900(c1593, interfaceC1521, new C1976());
                }
                boolean z = (c1109 == c11010 && (c1102 = c11011.f19179) != null && c1102.m16911()) || (c1109 == c11011 && (c1101 = c11010.f19179) != null && c1101.m16911());
                EnumC1241 enumC1243 = c1593.f49244[1];
                EnumC1241 enumC1244 = EnumC1241.MATCH_CONSTRAINT;
                if (enumC1243 != enumC1244 || zM54849) {
                    if (!c1593.m37898()) {
                        if (c1109 == c11010 && c11011.f19179 == null) {
                            int iM16919 = c11010.m16917() + iM16915;
                            c1593.m37902(iM16919, c1593.m37890() + iM16919);
                            m54849(c1593, interfaceC1521);
                        } else if (c1109 == c11011 && c11010.f19179 == null) {
                            int iM169110 = iM16915 - c11011.m16917();
                            c1593.m37902(iM169110 - c1593.m37890(), iM169110);
                            m54849(c1593, interfaceC1521);
                        } else if (z && !c1593.m37907()) {
                            m54843(c1593, interfaceC1521);
                        }
                    }
                } else if (enumC1243 == enumC1244 && c1593.f49248 >= 0 && c1593.f49258 >= 0 && (c1593.m37893() == 8 || (c1593.f49290 == 0 && c1593.f49228 == 0.0f))) {
                    if (!c1593.m37907() && !c1593.m37906() && z && !c1593.m37907()) {
                        m54844(c1591, interfaceC1521, c1593);
                    }
                }
            }
        }
        C1101 c1101Mo11498 = c1591.mo11496(EnumC0856.BASELINE);
        if (c1101Mo11498.m16905() == null || !c1101Mo11498.m16911()) {
            return;
        }
        int iM16916 = c1101Mo11498.m16914();
        for (C1101 c11012 : c1101Mo11498.m16905()) {
            C1591 c1594 = c11012.f19181;
            boolean zM548410 = m54848(c1594);
            if (c1594.m37898() && zM548410) {
                C1906.m50900(c1594, interfaceC1521, new C1976());
            }
            if (c1594.f49244[1] != EnumC1241.MATCH_CONSTRAINT || zM548410) {
                if (!c1594.m37898() && c11012 == c1594.f49246) {
                    c1594.m37935(iM16916);
                    m54849(c1594, interfaceC1521);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m54850(C1591 c1591, InterfaceC1521 interfaceC1521, boolean z) {
        float fM37930 = c1591.m37930();
        C1101 c1101 = c1591.f49261;
        int iM16914 = c1101.f19179.m16914();
        C1101 c1102 = c1591.f49279;
        int iM16915 = c1102.f19179.m16914();
        int iM16917 = c1101.m16917() + iM16914;
        int iM16918 = iM16915 - c1102.m16917();
        if (iM16914 == iM16915) {
            fM37930 = 0.5f;
        } else {
            iM16914 = iM16917;
            iM16915 = iM16918;
        }
        int iM37911 = c1591.m37911();
        int i = (iM16915 - iM16914) - iM37911;
        if (iM16914 > iM16915) {
            i = (iM16914 - iM16915) - iM37911;
        }
        int i2 = ((int) ((fM37930 * i) + 0.5f)) + iM16914;
        int i3 = i2 + iM37911;
        if (iM16914 > iM16915) {
            i3 = i2 - iM37911;
        }
        c1591.m37868(i2, i3);
        m54846(c1591, interfaceC1521, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54843(C1591 c1591, InterfaceC1521 interfaceC1521) {
        float fM37888 = c1591.m37888();
        C1101 c1101 = c1591.f49281;
        int iM16914 = c1101.f19179.m16914();
        C1101 c1102 = c1591.f49253;
        int iM16915 = c1102.f19179.m16914();
        int iM16917 = c1101.m16917() + iM16914;
        int iM16918 = iM16915 - c1102.m16917();
        if (iM16914 == iM16915) {
            fM37888 = 0.5f;
        } else {
            iM16914 = iM16917;
            iM16915 = iM16918;
        }
        int iM37890 = c1591.m37890();
        int i = (iM16915 - iM16914) - iM37890;
        if (iM16914 > iM16915) {
            i = (iM16914 - iM16915) - iM37890;
        }
        int i2 = (int) ((fM37888 * i) + 0.5f);
        int i3 = iM16914 + i2;
        int i4 = i3 + iM37890;
        if (iM16914 > iM16915) {
            i3 = iM16914 - i2;
            i4 = i3 - iM37890;
        }
        c1591.m37902(i3, i4);
        m54849(c1591, interfaceC1521);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54845(C1591 c1591, InterfaceC1521 interfaceC1521, C1591 c1592, boolean z) {
        int iM37911;
        float fM37930 = c1592.m37930();
        C1101 c1101 = c1592.f49261;
        int iM16917 = c1101.m16917() + c1101.f19179.m16914();
        C1101 c1102 = c1592.f49279;
        int iM16914 = c1102.f19179.m16914() - c1102.m16917();
        if (iM16914 >= iM16917) {
            int iM37912 = c1592.m37911();
            if (c1592.m37893() != 8) {
                int i = c1592.f49265;
                if (i == 2) {
                    if (c1591 instanceof C1906) {
                        iM37911 = c1591.m37911();
                    } else {
                        iM37911 = c1591.f49252.m37911();
                    }
                    iM37912 = (int) (c1592.m37930() * 0.5f * iM37911);
                } else if (i == 0) {
                    iM37912 = iM16914 - iM16917;
                }
                iM37912 = Math.max(c1592.f49273, iM37912);
                int i2 = c1592.f49233;
                if (i2 > 0) {
                    iM37912 = Math.min(i2, iM37912);
                }
            }
            int i3 = iM16917 + ((int) ((fM37930 * ((iM16914 - iM16917) - iM37912)) + 0.5f));
            c1592.m37868(i3, iM37912 + i3);
            m54846(c1592, interfaceC1521, z);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54844(C1591 c1591, InterfaceC1521 interfaceC1521, C1591 c1592) {
        int iM37890;
        float fM37888 = c1592.m37888();
        C1101 c1101 = c1592.f49281;
        int iM16917 = c1101.m16917() + c1101.f19179.m16914();
        C1101 c1102 = c1592.f49253;
        int iM16914 = c1102.f19179.m16914() - c1102.m16917();
        if (iM16914 >= iM16917) {
            int iM37891 = c1592.m37890();
            if (c1592.m37893() != 8) {
                int i = c1592.f49290;
                if (i == 2) {
                    if (c1591 instanceof C1906) {
                        iM37890 = c1591.m37890();
                    } else {
                        iM37890 = c1591.f49252.m37890();
                    }
                    iM37891 = (int) (fM37888 * 0.5f * iM37890);
                } else if (i == 0) {
                    iM37891 = iM16914 - iM16917;
                }
                iM37891 = Math.max(c1592.f49258, iM37891);
                int i2 = c1592.f49248;
                if (i2 > 0) {
                    iM37891 = Math.min(i2, iM37891);
                }
            }
            int i3 = iM16917 + ((int) ((fM37888 * ((iM16914 - iM16917) - iM37891)) + 0.5f));
            c1592.m37902(i3, iM37891 + i3);
            m54849(c1592, interfaceC1521);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m54847(C1906 c1906, InterfaceC1521 interfaceC1521) {
        EnumC1241[] enumC1241Arr = c1906.f49244;
        EnumC1241 enumC1241 = enumC1241Arr[0];
        EnumC1241 enumC1242 = enumC1241Arr[1];
        c1906.m37892();
        ArrayList arrayList = c1906.f21023;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C1591) arrayList.get(i)).m37892();
        }
        boolean zM50915 = c1906.m50915();
        if (enumC1241 == EnumC1241.FIXED) {
            c1906.m37868(0, c1906.m37911());
        } else {
            c1906.m37881();
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C1591 c1591 = (C1591) arrayList.get(i2);
            if (c1591 instanceof C0996) {
                C0996 c0996 = (C0996) c1591;
                if (c0996.m11506() == 1) {
                    if (c0996.m11497() != -1) {
                        c0996.m11495(c0996.m11497());
                    } else if (c0996.m11504() != -1 && c1906.mo9825()) {
                        c0996.m11495(c1906.m37911() - c0996.m11504());
                    } else if (c1906.mo9825()) {
                        c0996.m11495((int) ((c0996.m11499() * c1906.m37911()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((c1591 instanceof C0961) && ((C0961) c1591).m9832() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C1591 c1592 = (C1591) arrayList.get(i3);
                if (c1592 instanceof C0996) {
                    C0996 c0997 = (C0996) c1592;
                    if (c0997.m11506() == 1) {
                        m54846(c0997, interfaceC1521, zM50915);
                    }
                }
            }
        }
        m54846(c1906, interfaceC1521, zM50915);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                C1591 c1593 = (C1591) arrayList.get(i4);
                if (c1593 instanceof C0961) {
                    C0961 c0961 = (C0961) c1593;
                    if (c0961.m9832() == 0 && c0961.m9826()) {
                        m54846(c0961, interfaceC1521, zM50915);
                    }
                }
            }
        }
        if (enumC1242 == EnumC1241.FIXED) {
            c1906.m37902(0, c1906.m37890());
        } else {
            c1906.m37905();
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C1591 c1594 = (C1591) arrayList.get(i5);
            if (c1594 instanceof C0996) {
                C0996 c0998 = (C0996) c1594;
                if (c0998.m11506() == 0) {
                    if (c0998.m11497() != -1) {
                        c0998.m11495(c0998.m11497());
                    } else if (c0998.m11504() != -1 && c1906.mo9831()) {
                        c0998.m11495(c1906.m37890() - c0998.m11504());
                    } else if (c1906.mo9831()) {
                        c0998.m11495((int) ((c0998.m11499() * c1906.m37890()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((c1594 instanceof C0961) && ((C0961) c1594).m9832() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                C1591 c1595 = (C1591) arrayList.get(i6);
                if (c1595 instanceof C0996) {
                    C0996 c0999 = (C0996) c1595;
                    if (c0999.m11506() == 0) {
                        m54849(c0999, interfaceC1521);
                    }
                }
            }
        }
        m54849(c1906, interfaceC1521);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                C1591 c1596 = (C1591) arrayList.get(i7);
                if (c1596 instanceof C0961) {
                    C0961 c0962 = (C0961) c1596;
                    if (c0962.m9832() == 1 && c0962.m9826()) {
                        m54849(c0962, interfaceC1521);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            C1591 c1597 = (C1591) arrayList.get(i8);
            if (c1597.m37898() && m54848(c1597)) {
                C1906.m50900(c1597, interfaceC1521, f79689);
                m54846(c1597, interfaceC1521, zM50915);
                m54849(c1597, interfaceC1521);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m54848(C1591 c1591) {
        EnumC1241[] enumC1241Arr = c1591.f49244;
        EnumC1241 enumC1241 = enumC1241Arr[0];
        EnumC1241 enumC1242 = enumC1241Arr[1];
        C1591 c1592 = c1591.f49252;
        C1906 c1906 = c1592 != null ? (C1906) c1592 : null;
        if (c1906 != null) {
            EnumC1241 enumC1243 = c1906.f49244[0];
            EnumC1241 enumC1244 = EnumC1241.FIXED;
        }
        if (c1906 != null) {
            EnumC1241 enumC1245 = c1906.f49244[1];
            EnumC1241 enumC1246 = EnumC1241.FIXED;
        }
        EnumC1241 enumC1247 = EnumC1241.FIXED;
        boolean z = enumC1241 == enumC1247 || enumC1241 == EnumC1241.WRAP_CONTENT || (enumC1241 == EnumC1241.MATCH_CONSTRAINT && c1591.f49265 == 0 && c1591.f49228 == 0.0f && c1591.m37919(0)) || c1591.mo9825();
        boolean z2 = enumC1242 == enumC1247 || enumC1242 == EnumC1241.WRAP_CONTENT || (enumC1242 == EnumC1241.MATCH_CONSTRAINT && c1591.f49290 == 0 && c1591.f49228 == 0.0f && c1591.m37919(1)) || c1591.mo9831();
        return (c1591.f49228 > 0.0f && (z || z2)) || (z && z2);
    }
}
