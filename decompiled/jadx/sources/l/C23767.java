package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: J16Q */
/* JADX INFO: loaded from: classes.dex */
public final class C23767 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22856 f76936 = new C22856();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52437(C15094 c15094, InterfaceC13683 interfaceC13683, boolean z) {
        C5218 c5218;
        C5218 c5219;
        C5218 c52110;
        C5218 c52111;
        C5218 c52112;
        if (!(c15094 instanceof C21446) && c15094.m35740() && m52439(c15094)) {
            C21446.m48563(c15094, interfaceC13683, new C22856());
        }
        C5218 c5218Mo9453 = c15094.mo9453(EnumC0278.LEFT);
        C5218 c5218Mo9454 = c15094.mo9453(EnumC0278.RIGHT);
        int iM15004 = c5218Mo9453.m15004();
        int iM15005 = c5218Mo9454.m15004();
        char c = 0;
        if (c5218Mo9453.m14995() != null && c5218Mo9453.m15001()) {
            for (C5218 c52113 : c5218Mo9453.m14995()) {
                C15094 c15095 = c52113.f16341;
                boolean zM52439 = m52439(c15095);
                C5218 c52114 = c15095.f46141;
                C5218 c52115 = c15095.f46159;
                if (c15095.m35740() && zM52439) {
                    C21446.m48563(c15095, interfaceC13683, new C22856());
                }
                EnumC8040 enumC8040 = c15095.f46124[c];
                EnumC8040 enumC8041 = EnumC8040.MATCH_CONSTRAINT;
                if (enumC8040 != enumC8041 || zM52439) {
                    if (!c15095.m35740()) {
                        if (c52113 == c52114 && c52115.f16339 == null) {
                            int iM15007 = c52114.m15007() + iM15004;
                            c15095.m35710(iM15007, c15095.m35753() + iM15007);
                            m52437(c15095, interfaceC13683, z);
                        } else if (c52113 == c52115 && c52114.f16339 == null) {
                            int iM15008 = iM15004 - c52115.m15007();
                            c15095.m35710(iM15008 - c15095.m35753(), iM15008);
                            m52437(c15095, interfaceC13683, z);
                        } else if (c52113 == c52114 && (c52110 = c52115.f16339) != null && c52110.m15001() && !c15095.m35729()) {
                            m52441(c15095, interfaceC13683, z);
                        }
                    }
                } else if (enumC8040 == enumC8041 && c15095.f46113 >= 0 && c15095.f46153 >= 0 && ((c15095.m35735() == 8 || (c15095.f46145 == 0 && c15095.f46108 == 0.0f)) && !c15095.m35729() && !c15095.m35748() && (((c52113 == c52114 && (c52112 = c52115.f16339) != null && c52112.m15001()) || (c52113 == c52115 && (c52111 = c52114.f16339) != null && c52111.m15001())) && !c15095.m35729()))) {
                    m52436(c15094, interfaceC13683, c15095, z);
                }
                c = 0;
            }
        }
        if ((c15094 instanceof C3101) || c5218Mo9454.m14995() == null || !c5218Mo9454.m15001()) {
            return;
        }
        for (C5218 c52116 : c5218Mo9454.m14995()) {
            C15094 c15096 = c52116.f16341;
            boolean zM524310 = m52439(c15096);
            C5218 c52117 = c15096.f46141;
            C5218 c52118 = c15096.f46159;
            if (c15096.m35740() && zM524310) {
                C21446.m48563(c15096, interfaceC13683, new C22856());
            }
            boolean z2 = (c52116 == c52117 && (c5219 = c52118.f16339) != null && c5219.m15001()) || (c52116 == c52118 && (c5218 = c52117.f16339) != null && c5218.m15001());
            EnumC8040 enumC8042 = c15096.f46124[0];
            EnumC8040 enumC8043 = EnumC8040.MATCH_CONSTRAINT;
            if (enumC8042 != enumC8043 || zM524310) {
                if (!c15096.m35740()) {
                    if (c52116 == c52117 && c52118.f16339 == null) {
                        int iM15009 = c52117.m15007() + iM15005;
                        c15096.m35710(iM15009, c15096.m35753() + iM15009);
                        m52437(c15096, interfaceC13683, z);
                    } else if (c52116 == c52118 && c52117.f16339 == null) {
                        int iM150010 = iM15005 - c52118.m15007();
                        c15096.m35710(iM150010 - c15096.m35753(), iM150010);
                        m52437(c15096, interfaceC13683, z);
                    } else if (z2 && !c15096.m35729()) {
                        m52441(c15096, interfaceC13683, z);
                    }
                }
            } else if (enumC8042 == enumC8043 && c15096.f46113 >= 0 && c15096.f46153 >= 0 && (c15096.m35735() == 8 || (c15096.f46145 == 0 && c15096.f46108 == 0.0f))) {
                if (!c15096.m35729() && !c15096.m35748() && z2 && !c15096.m35729()) {
                    m52436(c15094, interfaceC13683, c15096, z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m52440(C15094 c15094, InterfaceC13683 interfaceC13683) {
        C5218 c5218;
        C5218 c5219;
        C5218 c52110;
        C5218 c52111;
        C5218 c52112;
        if (!(c15094 instanceof C21446) && c15094.m35740() && m52439(c15094)) {
            C21446.m48563(c15094, interfaceC13683, new C22856());
        }
        C5218 c5218Mo9453 = c15094.mo9453(EnumC0278.TOP);
        C5218 c5218Mo9454 = c15094.mo9453(EnumC0278.BOTTOM);
        int iM15004 = c5218Mo9453.m15004();
        int iM15005 = c5218Mo9454.m15004();
        if (c5218Mo9453.m14995() != null && c5218Mo9453.m15001()) {
            for (C5218 c52113 : c5218Mo9453.m14995()) {
                C15094 c15095 = c52113.f16341;
                boolean zM52439 = m52439(c15095);
                C5218 c52114 = c15095.f46161;
                C5218 c52115 = c15095.f46133;
                if (c15095.m35740() && zM52439) {
                    C21446.m48563(c15095, interfaceC13683, new C22856());
                }
                EnumC8040 enumC8040 = c15095.f46124[1];
                EnumC8040 enumC8041 = EnumC8040.MATCH_CONSTRAINT;
                if (enumC8040 != enumC8041 || zM52439) {
                    if (!c15095.m35740()) {
                        if (c52113 == c52114 && c52115.f16339 == null) {
                            int iM15007 = c52114.m15007() + iM15004;
                            c15095.m35744(iM15007, c15095.m35732() + iM15007);
                            m52440(c15095, interfaceC13683);
                        } else if (c52113 == c52115 && c52115.f16339 == null) {
                            int iM15008 = iM15004 - c52115.m15007();
                            c15095.m35744(iM15008 - c15095.m35732(), iM15008);
                            m52440(c15095, interfaceC13683);
                        } else if (c52113 == c52114 && (c52110 = c52115.f16339) != null && c52110.m15001()) {
                            m52434(c15095, interfaceC13683);
                        }
                    }
                } else if (enumC8040 == enumC8041 && c15095.f46128 >= 0 && c15095.f46138 >= 0 && (c15095.m35735() == 8 || (c15095.f46170 == 0 && c15095.f46108 == 0.0f))) {
                    if (!c15095.m35749() && !c15095.m35748() && ((c52113 == c52114 && (c52112 = c52115.f16339) != null && c52112.m15001()) || (c52113 == c52115 && (c52111 = c52114.f16339) != null && c52111.m15001()))) {
                        if (!c15095.m35749()) {
                            m52435(c15094, interfaceC13683, c15095);
                        }
                    }
                }
            }
        }
        if (c15094 instanceof C3101) {
            return;
        }
        if (c5218Mo9454.m14995() != null && c5218Mo9454.m15001()) {
            for (C5218 c52116 : c5218Mo9454.m14995()) {
                C15094 c15096 = c52116.f16341;
                boolean zM524310 = m52439(c15096);
                C5218 c52117 = c15096.f46161;
                C5218 c52118 = c15096.f46133;
                if (c15096.m35740() && zM524310) {
                    C21446.m48563(c15096, interfaceC13683, new C22856());
                }
                boolean z = (c52116 == c52117 && (c5219 = c52118.f16339) != null && c5219.m15001()) || (c52116 == c52118 && (c5218 = c52117.f16339) != null && c5218.m15001());
                EnumC8040 enumC8042 = c15096.f46124[1];
                EnumC8040 enumC8043 = EnumC8040.MATCH_CONSTRAINT;
                if (enumC8042 != enumC8043 || zM524310) {
                    if (!c15096.m35740()) {
                        if (c52116 == c52117 && c52118.f16339 == null) {
                            int iM15009 = c52117.m15007() + iM15005;
                            c15096.m35744(iM15009, c15096.m35732() + iM15009);
                            m52440(c15096, interfaceC13683);
                        } else if (c52116 == c52118 && c52117.f16339 == null) {
                            int iM150010 = iM15005 - c52118.m15007();
                            c15096.m35744(iM150010 - c15096.m35732(), iM150010);
                            m52440(c15096, interfaceC13683);
                        } else if (z && !c15096.m35749()) {
                            m52434(c15096, interfaceC13683);
                        }
                    }
                } else if (enumC8042 == enumC8043 && c15096.f46128 >= 0 && c15096.f46138 >= 0 && (c15096.m35735() == 8 || (c15096.f46170 == 0 && c15096.f46108 == 0.0f))) {
                    if (!c15096.m35749() && !c15096.m35748() && z && !c15096.m35749()) {
                        m52435(c15094, interfaceC13683, c15096);
                    }
                }
            }
        }
        C5218 c5218Mo9455 = c15094.mo9453(EnumC0278.BASELINE);
        if (c5218Mo9455.m14995() == null || !c5218Mo9455.m15001()) {
            return;
        }
        int iM15006 = c5218Mo9455.m15004();
        for (C5218 c52119 : c5218Mo9455.m14995()) {
            C15094 c15097 = c52119.f16341;
            boolean zM524311 = m52439(c15097);
            if (c15097.m35740() && zM524311) {
                C21446.m48563(c15097, interfaceC13683, new C22856());
            }
            if (c15097.f46124[1] != EnumC8040.MATCH_CONSTRAINT || zM524311) {
                if (!c15097.m35740() && c52119 == c15097.f46126) {
                    c15097.m35777(iM15006);
                    m52440(c15097, interfaceC13683);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m52441(C15094 c15094, InterfaceC13683 interfaceC13683, boolean z) {
        float fM35772 = c15094.m35772();
        C5218 c5218 = c15094.f46141;
        int iM15004 = c5218.f16339.m15004();
        C5218 c5219 = c15094.f46159;
        int iM15005 = c5219.f16339.m15004();
        int iM15007 = c5218.m15007() + iM15004;
        int iM15008 = iM15005 - c5219.m15007();
        if (iM15004 == iM15005) {
            fM35772 = 0.5f;
        } else {
            iM15004 = iM15007;
            iM15005 = iM15008;
        }
        int iM35753 = c15094.m35753();
        int i = (iM15005 - iM15004) - iM35753;
        if (iM15004 > iM15005) {
            i = (iM15004 - iM15005) - iM35753;
        }
        int i2 = ((int) ((fM35772 * i) + 0.5f)) + iM15004;
        int i3 = i2 + iM35753;
        if (iM15004 > iM15005) {
            i3 = i2 - iM35753;
        }
        c15094.m35710(i2, i3);
        m52437(c15094, interfaceC13683, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52434(C15094 c15094, InterfaceC13683 interfaceC13683) {
        float fM35730 = c15094.m35730();
        C5218 c5218 = c15094.f46161;
        int iM15004 = c5218.f16339.m15004();
        C5218 c5219 = c15094.f46133;
        int iM15005 = c5219.f16339.m15004();
        int iM15007 = c5218.m15007() + iM15004;
        int iM15008 = iM15005 - c5219.m15007();
        if (iM15004 == iM15005) {
            fM35730 = 0.5f;
        } else {
            iM15004 = iM15007;
            iM15005 = iM15008;
        }
        int iM35732 = c15094.m35732();
        int i = (iM15005 - iM15004) - iM35732;
        if (iM15004 > iM15005) {
            i = (iM15004 - iM15005) - iM35732;
        }
        int i2 = (int) ((fM35730 * i) + 0.5f);
        int i3 = iM15004 + i2;
        int i4 = i3 + iM35732;
        if (iM15004 > iM15005) {
            i3 = iM15004 - i2;
            i4 = i3 - iM35732;
        }
        c15094.m35744(i3, i4);
        m52440(c15094, interfaceC13683);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52436(C15094 c15094, InterfaceC13683 interfaceC13683, C15094 c15095, boolean z) {
        int iM35753;
        float fM35772 = c15095.m35772();
        C5218 c5218 = c15095.f46141;
        int iM15007 = c5218.m15007() + c5218.f16339.m15004();
        C5218 c5219 = c15095.f46159;
        int iM15004 = c5219.f16339.m15004() - c5219.m15007();
        if (iM15004 >= iM15007) {
            int iM35754 = c15095.m35753();
            if (c15095.m35735() != 8) {
                int i = c15095.f46145;
                if (i == 2) {
                    if (c15094 instanceof C21446) {
                        iM35753 = c15094.m35753();
                    } else {
                        iM35753 = c15094.f46132.m35753();
                    }
                    iM35754 = (int) (c15095.m35772() * 0.5f * iM35753);
                } else if (i == 0) {
                    iM35754 = iM15004 - iM15007;
                }
                iM35754 = Math.max(c15095.f46153, iM35754);
                int i2 = c15095.f46113;
                if (i2 > 0) {
                    iM35754 = Math.min(i2, iM35754);
                }
            }
            int i3 = iM15007 + ((int) ((fM35772 * ((iM15004 - iM15007) - iM35754)) + 0.5f));
            c15095.m35710(i3, iM35754 + i3);
            m52437(c15095, interfaceC13683, z);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52435(C15094 c15094, InterfaceC13683 interfaceC13683, C15094 c15095) {
        int iM35732;
        float fM35730 = c15095.m35730();
        C5218 c5218 = c15095.f46161;
        int iM15007 = c5218.m15007() + c5218.f16339.m15004();
        C5218 c5219 = c15095.f46133;
        int iM15004 = c5219.f16339.m15004() - c5219.m15007();
        if (iM15004 >= iM15007) {
            int iM35733 = c15095.m35732();
            if (c15095.m35735() != 8) {
                int i = c15095.f46170;
                if (i == 2) {
                    if (c15094 instanceof C21446) {
                        iM35732 = c15094.m35732();
                    } else {
                        iM35732 = c15094.f46132.m35732();
                    }
                    iM35733 = (int) (fM35730 * 0.5f * iM35732);
                } else if (i == 0) {
                    iM35733 = iM15004 - iM15007;
                }
                iM35733 = Math.max(c15095.f46138, iM35733);
                int i2 = c15095.f46128;
                if (i2 > 0) {
                    iM35733 = Math.min(i2, iM35733);
                }
            }
            int i3 = iM15007 + ((int) ((fM35730 * ((iM15004 - iM15007) - iM35733)) + 0.5f));
            c15095.m35744(i3, iM35733 + i3);
            m52440(c15095, interfaceC13683);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52438(C21446 c21446, InterfaceC13683 interfaceC13683) {
        EnumC8040[] enumC8040Arr = c21446.f46124;
        EnumC8040 enumC8040 = enumC8040Arr[0];
        EnumC8040 enumC8041 = enumC8040Arr[1];
        c21446.m35734();
        ArrayList arrayList = c21446.f18169;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C15094) arrayList.get(i)).m35734();
        }
        boolean zM48578 = c21446.m48578();
        if (enumC8040 == EnumC8040.FIXED) {
            c21446.m35710(0, c21446.m35753());
        } else {
            c21446.m35723();
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C15094 c15094 = (C15094) arrayList.get(i2);
            if (c15094 instanceof C3101) {
                C3101 c3101 = (C3101) c15094;
                if (c3101.m9463() == 1) {
                    if (c3101.m9454() != -1) {
                        c3101.m9452(c3101.m9454());
                    } else if (c3101.m9461() != -1 && c21446.mo7762()) {
                        c3101.m9452(c21446.m35753() - c3101.m9461());
                    } else if (c21446.mo7762()) {
                        c3101.m9452((int) ((c3101.m9456() * c21446.m35753()) + 0.5f));
                    }
                    z = true;
                }
            } else if ((c15094 instanceof C2396) && ((C2396) c15094).m7769() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                C15094 c15095 = (C15094) arrayList.get(i3);
                if (c15095 instanceof C3101) {
                    C3101 c3102 = (C3101) c15095;
                    if (c3102.m9463() == 1) {
                        m52437(c3102, interfaceC13683, zM48578);
                    }
                }
            }
        }
        m52437(c21446, interfaceC13683, zM48578);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                C15094 c15096 = (C15094) arrayList.get(i4);
                if (c15096 instanceof C2396) {
                    C2396 c2396 = (C2396) c15096;
                    if (c2396.m7769() == 0 && c2396.m7763()) {
                        m52437(c2396, interfaceC13683, zM48578);
                    }
                }
            }
        }
        if (enumC8041 == EnumC8040.FIXED) {
            c21446.m35744(0, c21446.m35732());
        } else {
            c21446.m35747();
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            C15094 c15097 = (C15094) arrayList.get(i5);
            if (c15097 instanceof C3101) {
                C3101 c3103 = (C3101) c15097;
                if (c3103.m9463() == 0) {
                    if (c3103.m9454() != -1) {
                        c3103.m9452(c3103.m9454());
                    } else if (c3103.m9461() != -1 && c21446.mo7768()) {
                        c3103.m9452(c21446.m35732() - c3103.m9461());
                    } else if (c21446.mo7768()) {
                        c3103.m9452((int) ((c3103.m9456() * c21446.m35732()) + 0.5f));
                    }
                    z3 = true;
                }
            } else if ((c15097 instanceof C2396) && ((C2396) c15097).m7769() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                C15094 c15098 = (C15094) arrayList.get(i6);
                if (c15098 instanceof C3101) {
                    C3101 c3104 = (C3101) c15098;
                    if (c3104.m9463() == 0) {
                        m52440(c3104, interfaceC13683);
                    }
                }
            }
        }
        m52440(c21446, interfaceC13683);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                C15094 c15099 = (C15094) arrayList.get(i7);
                if (c15099 instanceof C2396) {
                    C2396 c2397 = (C2396) c15099;
                    if (c2397.m7769() == 1 && c2397.m7763()) {
                        m52440(c2397, interfaceC13683);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            C15094 c150910 = (C15094) arrayList.get(i8);
            if (c150910.m35740() && m52439(c150910)) {
                C21446.m48563(c150910, interfaceC13683, f76936);
                m52437(c150910, interfaceC13683, zM48578);
                m52440(c150910, interfaceC13683);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52439(C15094 c15094) {
        EnumC8040[] enumC8040Arr = c15094.f46124;
        EnumC8040 enumC8040 = enumC8040Arr[0];
        EnumC8040 enumC8041 = enumC8040Arr[1];
        C15094 c15095 = c15094.f46132;
        C21446 c21446 = c15095 != null ? (C21446) c15095 : null;
        if (c21446 != null) {
            EnumC8040 enumC8042 = c21446.f46124[0];
            EnumC8040 enumC8043 = EnumC8040.FIXED;
        }
        if (c21446 != null) {
            EnumC8040 enumC8044 = c21446.f46124[1];
            EnumC8040 enumC8045 = EnumC8040.FIXED;
        }
        EnumC8040 enumC8046 = EnumC8040.FIXED;
        boolean z = enumC8040 == enumC8046 || enumC8040 == EnumC8040.WRAP_CONTENT || (enumC8040 == EnumC8040.MATCH_CONSTRAINT && c15094.f46145 == 0 && c15094.f46108 == 0.0f && c15094.m35761(0)) || c15094.mo7762();
        boolean z2 = enumC8041 == enumC8046 || enumC8041 == EnumC8040.WRAP_CONTENT || (enumC8041 == EnumC8040.MATCH_CONSTRAINT && c15094.f46170 == 0 && c15094.f46108 == 0.0f && c15094.m35761(1)) || c15094.mo7768();
        return (c15094.f46108 > 0.0f && (z || z2)) || (z && z2);
    }
}
