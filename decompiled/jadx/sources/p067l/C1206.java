package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟۠ */
/* JADX INFO: compiled from: G1B3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1206 {

    /* JADX INFO: renamed from: ֫ */
    public C1906 f25448;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f25450 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public C1976 f25449 = new C1976();

    /* JADX INFO: renamed from: ֫ */
    public final void m21664(C1906 c1906) {
        ArrayList arrayList = this.f25450;
        arrayList.clear();
        int size = c1906.f21023.size();
        for (int i = 0; i < size; i++) {
            C1591 c1591 = (C1591) c1906.f21023.get(i);
            EnumC1241[] enumC1241Arr = c1591.f49244;
            EnumC1241 enumC1241 = enumC1241Arr[0];
            EnumC1241 enumC1242 = EnumC1241.MATCH_CONSTRAINT;
            if (enumC1241 == enumC1242 || enumC1241Arr[1] == enumC1242) {
                arrayList.add(c1591);
            }
        }
        c1906.f71747.m41572();
    }

    public C1206(C1906 c1906) {
        this.f25448 = c1906;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m21662(C1906 c1906, int i, int i2) {
        int iM37927 = c1906.m37927();
        int iM37925 = c1906.m37925();
        c1906.m37883(0);
        c1906.m37913(0);
        c1906.m37928(i);
        c1906.m37891(i2);
        c1906.m37883(iM37927);
        c1906.m37913(iM37925);
        this.f25448.mo18536();
    }

    /* JADX WARN: Code duplicated, block: B:146:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:260:0x01bf A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final void m21665(C1906 c1906, int i, int i2, int i3, int i4, int i5) {
        float f;
        boolean zM41569;
        int i6;
        int i7;
        C1906 c1907;
        boolean z;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        int i8;
        int i9;
        boolean z4;
        int i10;
        boolean z5;
        C1636 c1636;
        C1776 c1776;
        boolean zM415610;
        int i11;
        InterfaceC1521 interfaceC1521M50908 = c1906.m50908();
        C1671 c1671 = c1906.f71747;
        int size = c1906.f21023.size();
        int iM37911 = c1906.m37911();
        int iM37890 = c1906.m37890();
        boolean zM31868 = C1451.m31868(i, 128);
        char c = 0;
        boolean z6 = zM31868 || C1451.m31868(i, 64);
        if (z6) {
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    C1591 c1591 = (C1591) c1906.f21023.get(i12);
                    EnumC1241[] enumC1241Arr = c1591.f49244;
                    EnumC1241 enumC1241 = enumC1241Arr[c];
                    EnumC1241 enumC1242 = EnumC1241.MATCH_CONSTRAINT;
                    boolean z7 = enumC1241 == enumC1242;
                    boolean z8 = enumC1241Arr[1] == enumC1242;
                    if (z7 && z8) {
                        f = 0.0f;
                        boolean z9 = c1591.f49228 > 0.0f;
                        if ((c1591.m37887() || !z9) && !((c1591.m37907() && z9) || (c1591 instanceof C1346) || c1591.m37887() || c1591.m37907())) {
                            i12++;
                            c = 0;
                        } else {
                            z6 = false;
                        }
                    } else {
                        f = 0.0f;
                    }
                    if (c1591.m37887()) {
                        i12++;
                        c = 0;
                    } else {
                        i12++;
                        c = 0;
                    }
                    z6 = false;
                } else {
                    f = 0.0f;
                }
            }
        } else {
            f = 0.0f;
        }
        boolean z10 = z6 & ((i2 == 1073741824 && i4 == 1073741824) || zM31868);
        if (z10) {
            int iMin = Math.min(c1906.m37885(), i3);
            int iMin2 = Math.min(c1906.m37882(), i5);
            if (i2 == 1073741824 && c1906.m37911() != iMin) {
                c1906.m37928(iMin);
                c1671.m41572();
            }
            if (i4 == 1073741824 && c1906.m37890() != iMin2) {
                c1906.m37891(iMin2);
                c1671.m41572();
            }
            if (i2 == 1073741824 && i4 == 1073741824) {
                zM41569 = c1671.m41570(zM31868);
                i6 = 2;
            } else {
                c1671.m41571();
                if (i2 == 1073741824) {
                    zM415610 = c1671.m41569(0, zM31868);
                    i11 = 1;
                } else {
                    zM415610 = true;
                    i11 = 0;
                }
                if (i4 == 1073741824) {
                    zM41569 = c1671.m41569(1, zM31868) & zM415610;
                    i6 = i11 + 1;
                } else {
                    zM41569 = zM415610;
                    i6 = i11;
                }
            }
            if (zM41569) {
                c1906.mo37880(i2 == 1073741824, i4 == 1073741824);
            }
        } else {
            zM41569 = false;
            i6 = 0;
        }
        if (zM41569 && i6 == 2) {
            return;
        }
        int iM50917 = c1906.m50917();
        if (size > 0) {
            int size2 = c1906.f21023.size();
            boolean zM50901 = c1906.m50901(64);
            InterfaceC1521 interfaceC1521M50909 = c1906.m50908();
            int i13 = 0;
            while (i13 < size2) {
                C1591 c1592 = (C1591) c1906.f21023.get(i13);
                if ((c1592 instanceof C0996) || (c1592 instanceof C0961) || c1592.m37906() || (zM50901 && (c1636 = c1592.f49276) != null && (c1776 = c1592.f49260) != null && c1636.f28284.f56464 && c1776.f28284.f56464)) {
                    i8 = iM50917;
                    i9 = size2;
                    z4 = zM50901;
                } else {
                    EnumC1241 enumC1241M37899 = c1592.m37899(0);
                    EnumC1241 enumC1241M378910 = c1592.m37899(1);
                    i9 = size2;
                    EnumC1241 enumC1243 = EnumC1241.MATCH_CONSTRAINT;
                    if (enumC1241M37899 == enumC1243) {
                        z4 = zM50901;
                        i8 = iM50917;
                        i10 = 1;
                        if (c1592.f49265 != 1 && enumC1241M378910 == enumC1243 && c1592.f49290 != 1) {
                            z5 = true;
                        }
                        if (!z5 && c1906.m50901(i10) && !(c1592 instanceof C1346)) {
                            if (enumC1241M37899 == enumC1243 && c1592.f49265 == 0 && enumC1241M378910 != enumC1243 && !c1592.m37887()) {
                                z5 = true;
                            }
                            if (enumC1241M378910 == enumC1243 && c1592.f49290 == 0 && enumC1241M37899 != enumC1243 && !c1592.m37887()) {
                                z5 = true;
                            }
                            if ((enumC1241M37899 != enumC1243 || enumC1241M378910 == enumC1243) && c1592.f49228 > f) {
                            }
                        }
                        if (z5) {
                            m21663(interfaceC1521M50909, c1592, 0);
                        }
                    } else {
                        i8 = iM50917;
                        z4 = zM50901;
                        i10 = 1;
                    }
                    z5 = false;
                    if (!z5) {
                        if (enumC1241M37899 == enumC1243) {
                            z5 = true;
                        }
                        if (enumC1241M378910 == enumC1243) {
                            z5 = true;
                        }
                        z5 = enumC1241M37899 != enumC1243 ? true : true;
                    }
                    if (z5) {
                        m21663(interfaceC1521M50909, c1592, 0);
                    }
                }
                i13++;
                size2 = i9;
                zM50901 = z4;
                iM50917 = i8;
            }
            i7 = iM50917;
            interfaceC1521M50909.mo35044();
        } else {
            i7 = iM50917;
        }
        m21664(c1906);
        ArrayList arrayList2 = this.f25450;
        int size3 = arrayList2.size();
        if (size > 0) {
            m21662(c1906, iM37911, iM37890);
        }
        if (size3 > 0) {
            EnumC1241[] enumC1241Arr2 = c1906.f49244;
            EnumC1241 enumC1244 = enumC1241Arr2[0];
            EnumC1241 enumC1245 = EnumC1241.WRAP_CONTENT;
            boolean z11 = enumC1244 == enumC1245;
            boolean z12 = enumC1241Arr2[1] == enumC1245;
            int iM37912 = c1906.m37911();
            C1906 c1908 = this.f25448;
            int iMax = Math.max(iM37912, c1908.m37927());
            int iMax2 = Math.max(c1906.m37890(), c1908.m37925());
            int i14 = 0;
            boolean zM27523 = false;
            while (i14 < size3) {
                C1591 c1593 = (C1591) arrayList2.get(i14);
                if (c1593 instanceof C1346) {
                    int iM37913 = c1593.m37911();
                    int iM37891 = c1593.m37890();
                    boolean zM21663 = m21663(interfaceC1521M50908, c1593, 1) | zM27523;
                    int iM37914 = c1593.m37911();
                    int iM37892 = c1593.m37890();
                    if (iM37914 != iM37913) {
                        c1593.m37928(iM37914);
                        if (z11 && c1593.m37863() > iMax) {
                            iMax = Math.max(iMax, c1593.mo11496(EnumC0856.RIGHT).m16917() + c1593.m37863());
                        }
                        z3 = true;
                    } else {
                        z3 = zM21663;
                    }
                    if (iM37892 != iM37891) {
                        c1593.m37891(iM37892);
                        if (z12 && c1593.m37921() > iMax2) {
                            iMax2 = Math.max(iMax2, c1593.mo11496(EnumC0856.BOTTOM).m16917() + c1593.m37921());
                        }
                        z3 = true;
                    }
                    zM27523 = ((C1346) c1593).m27523() | z3;
                }
                i14++;
                iM37911 = iM37911;
            }
            int i15 = iM37911;
            int i16 = 0;
            while (i16 < 2) {
                int i17 = 0;
                while (i17 < size3) {
                    C1591 c1594 = (C1591) arrayList2.get(i17);
                    if (((c1594 instanceof C1486) && !(c1594 instanceof C1346)) || (c1594 instanceof C0996) || c1594.m37893() == 8 || ((z10 && c1594.f49276.f28284.f56464 && c1594.f49260.f28284.f56464) || (c1594 instanceof C1346))) {
                        z2 = z10;
                        arrayList = arrayList2;
                    } else {
                        int iM37915 = c1594.m37911();
                        int iM37893 = c1594.m37890();
                        z2 = z10;
                        int iM37916 = c1594.m37914();
                        arrayList = arrayList2;
                        boolean zM21664 = m21663(interfaceC1521M50908, c1594, i16 == 1 ? 2 : 1) | zM27523;
                        int iM37917 = c1594.m37911();
                        int iM37894 = c1594.m37890();
                        if (iM37917 != iM37915) {
                            c1594.m37928(iM37917);
                            if (z11 && c1594.m37863() > iMax) {
                                iMax = Math.max(iMax, c1594.mo11496(EnumC0856.RIGHT).m16917() + c1594.m37863());
                            }
                            zM27523 = true;
                        } else {
                            zM27523 = zM21664;
                        }
                        if (iM37894 != iM37893) {
                            c1594.m37891(iM37894);
                            if (z12 && c1594.m37921() > iMax2) {
                                iMax2 = Math.max(iMax2, c1594.mo11496(EnumC0856.BOTTOM).m16917() + c1594.m37921());
                            }
                            zM27523 = true;
                        }
                        if (c1594.m37929() && iM37916 != c1594.m37914()) {
                            zM27523 = true;
                        }
                    }
                    i17++;
                    z10 = z2;
                    arrayList2 = arrayList;
                }
                boolean z13 = z10;
                ArrayList arrayList3 = arrayList2;
                if (!zM27523) {
                    break;
                }
                m21662(c1906, i15, iM37890);
                i16++;
                zM27523 = false;
                z10 = z13;
                arrayList2 = arrayList3;
            }
            c1907 = c1906;
            if (zM27523) {
                m21662(c1907, i15, iM37890);
                if (c1906.m37911() < iMax) {
                    c1907.m37928(iMax);
                    z = true;
                } else {
                    z = false;
                }
                if (c1906.m37890() < iMax2) {
                    c1907.m37891(iMax2);
                    z = true;
                }
                if (z) {
                    m21662(c1907, i15, iM37890);
                }
            }
        } else {
            c1907 = c1906;
        }
        c1907.m50909(i7);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m21663(InterfaceC1521 interfaceC1521, C1591 c1591, int i) {
        EnumC1241[] enumC1241Arr = c1591.f49244;
        int[] iArr = c1591.f49239;
        EnumC1241 enumC1241 = enumC1241Arr[0];
        C1976 c1976 = this.f25449;
        c1976.f76476 = enumC1241;
        c1976.f76484 = enumC1241Arr[1];
        c1976.f76479 = c1591.m37911();
        c1976.f76478 = c1591.m37890();
        c1976.f76485 = false;
        c1976.f76481 = i;
        EnumC1241 enumC1242 = c1976.f76476;
        EnumC1241 enumC1243 = EnumC1241.MATCH_CONSTRAINT;
        boolean z = enumC1242 == enumC1243;
        boolean z2 = c1976.f76484 == enumC1243;
        boolean z3 = z && c1591.f49228 > 0.0f;
        boolean z4 = z2 && c1591.f49228 > 0.0f;
        if (z3 && iArr[0] == 4) {
            c1976.f76476 = EnumC1241.FIXED;
        }
        if (z4 && iArr[1] == 4) {
            c1976.f76484 = EnumC1241.FIXED;
        }
        interfaceC1521.mo35045(c1591, c1976);
        c1591.m37928(c1976.f76477);
        c1591.m37891(c1976.f76480);
        c1591.m37879(c1976.f76482);
        c1591.m37910(c1976.f76483);
        c1976.f76481 = 0;
        return c1976.f76485;
    }
}
