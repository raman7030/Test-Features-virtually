package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G1B3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7334 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21446 f22535;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f22537 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22856 f22536 = new C22856();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19691(C21446 c21446) {
        ArrayList arrayList = this.f22537;
        arrayList.clear();
        int size = c21446.f18169.size();
        for (int i = 0; i < size; i++) {
            C15094 c15094 = (C15094) c21446.f18169.get(i);
            EnumC8040[] enumC8040Arr = c15094.f46124;
            EnumC8040 enumC8040 = enumC8040Arr[0];
            EnumC8040 enumC8041 = EnumC8040.MATCH_CONSTRAINT;
            if (enumC8040 == enumC8041 || enumC8040Arr[1] == enumC8041) {
                arrayList.add(c15094);
            }
        }
        c21446.f69049.m39336();
    }

    public C7334(C21446 c21446) {
        this.f22535 = c21446;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19689(C21446 c21446, int i, int i2) {
        int iM35769 = c21446.m35769();
        int iM35767 = c21446.m35767();
        c21446.m35725(0);
        c21446.m35755(0);
        c21446.m35770(i);
        c21446.m35733(i2);
        c21446.m35725(iM35769);
        c21446.m35755(iM35767);
        this.f22535.mo16610();
    }

    /* JADX WARN: Code duplicated, block: B:146:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:260:0x01bf A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19692(C21446 c21446, int i, int i2, int i3, int i4, int i5) {
        float f;
        boolean zM39333;
        int i6;
        int i7;
        C21446 c21447;
        boolean z;
        boolean z2;
        ArrayList arrayList;
        boolean z3;
        int i8;
        int i9;
        boolean z4;
        int i10;
        boolean z5;
        C16005 c16005;
        C18829 c18829;
        boolean zM39334;
        int i11;
        InterfaceC13683 interfaceC13683M48571 = c21446.m48571();
        C16711 c16711 = c21446.f69049;
        int size = c21446.f18169.size();
        int iM35753 = c21446.m35753();
        int iM35732 = c21446.m35732();
        boolean zM29806 = C12273.m29806(i, 128);
        char c = 0;
        boolean z6 = zM29806 || C12273.m29806(i, 64);
        if (z6) {
            int i12 = 0;
            while (true) {
                if (i12 < size) {
                    C15094 c15094 = (C15094) c21446.f18169.get(i12);
                    EnumC8040[] enumC8040Arr = c15094.f46124;
                    EnumC8040 enumC8040 = enumC8040Arr[c];
                    EnumC8040 enumC8041 = EnumC8040.MATCH_CONSTRAINT;
                    boolean z7 = enumC8040 == enumC8041;
                    boolean z8 = enumC8040Arr[1] == enumC8041;
                    if (z7 && z8) {
                        f = 0.0f;
                        boolean z9 = c15094.f46108 > 0.0f;
                        if ((c15094.m35729() || !z9) && !((c15094.m35749() && z9) || (c15094 instanceof C10157) || c15094.m35729() || c15094.m35749())) {
                            i12++;
                            c = 0;
                        } else {
                            z6 = false;
                        }
                    } else {
                        f = 0.0f;
                    }
                    if (c15094.m35729()) {
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
        boolean z10 = z6 & ((i2 == 1073741824 && i4 == 1073741824) || zM29806);
        if (z10) {
            int iMin = Math.min(c21446.m35727(), i3);
            int iMin2 = Math.min(c21446.m35724(), i5);
            if (i2 == 1073741824 && c21446.m35753() != iMin) {
                c21446.m35770(iMin);
                c16711.m39336();
            }
            if (i4 == 1073741824 && c21446.m35732() != iMin2) {
                c21446.m35733(iMin2);
                c16711.m39336();
            }
            if (i2 == 1073741824 && i4 == 1073741824) {
                zM39333 = c16711.m39334(zM29806);
                i6 = 2;
            } else {
                c16711.m39335();
                if (i2 == 1073741824) {
                    zM39334 = c16711.m39333(0, zM29806);
                    i11 = 1;
                } else {
                    zM39334 = true;
                    i11 = 0;
                }
                if (i4 == 1073741824) {
                    zM39333 = c16711.m39333(1, zM29806) & zM39334;
                    i6 = i11 + 1;
                } else {
                    zM39333 = zM39334;
                    i6 = i11;
                }
            }
            if (zM39333) {
                c21446.mo35722(i2 == 1073741824, i4 == 1073741824);
            }
        } else {
            zM39333 = false;
            i6 = 0;
        }
        if (zM39333 && i6 == 2) {
            return;
        }
        int iM48580 = c21446.m48580();
        if (size > 0) {
            int size2 = c21446.f18169.size();
            boolean zM48564 = c21446.m48564(64);
            InterfaceC13683 interfaceC13683M48572 = c21446.m48571();
            int i13 = 0;
            while (i13 < size2) {
                C15094 c15095 = (C15094) c21446.f18169.get(i13);
                if ((c15095 instanceof C3101) || (c15095 instanceof C2396) || c15095.m35748() || (zM48564 && (c16005 = c15095.f46156) != null && (c18829 = c15095.f46140) != null && c16005.f25374.f53276 && c18829.f25374.f53276)) {
                    i8 = iM48580;
                    i9 = size2;
                    z4 = zM48564;
                } else {
                    EnumC8040 enumC8040M35741 = c15095.m35741(0);
                    EnumC8040 enumC8040M35742 = c15095.m35741(1);
                    i9 = size2;
                    EnumC8040 enumC8042 = EnumC8040.MATCH_CONSTRAINT;
                    if (enumC8040M35741 == enumC8042) {
                        z4 = zM48564;
                        i8 = iM48580;
                        i10 = 1;
                        if (c15095.f46145 != 1 && enumC8040M35742 == enumC8042 && c15095.f46170 != 1) {
                            z5 = true;
                        }
                        if (!z5 && c21446.m48564(i10) && !(c15095 instanceof C10157)) {
                            if (enumC8040M35741 == enumC8042 && c15095.f46145 == 0 && enumC8040M35742 != enumC8042 && !c15095.m35729()) {
                                z5 = true;
                            }
                            if (enumC8040M35742 == enumC8042 && c15095.f46170 == 0 && enumC8040M35741 != enumC8042 && !c15095.m35729()) {
                                z5 = true;
                            }
                            if ((enumC8040M35741 != enumC8042 || enumC8040M35742 == enumC8042) && c15095.f46108 > f) {
                            }
                        }
                        if (z5) {
                            m19690(interfaceC13683M48572, c15095, 0);
                        }
                    } else {
                        i8 = iM48580;
                        z4 = zM48564;
                        i10 = 1;
                    }
                    z5 = false;
                    if (!z5) {
                        if (enumC8040M35741 == enumC8042) {
                            z5 = true;
                        }
                        if (enumC8040M35742 == enumC8042) {
                            z5 = true;
                        }
                        z5 = enumC8040M35741 != enumC8042 ? true : true;
                    }
                    if (z5) {
                        m19690(interfaceC13683M48572, c15095, 0);
                    }
                }
                i13++;
                size2 = i9;
                zM48564 = z4;
                iM48580 = i8;
            }
            i7 = iM48580;
            interfaceC13683M48572.mo32929();
        } else {
            i7 = iM48580;
        }
        m19691(c21446);
        ArrayList arrayList2 = this.f22537;
        int size3 = arrayList2.size();
        if (size > 0) {
            m19689(c21446, iM35753, iM35732);
        }
        if (size3 > 0) {
            EnumC8040[] enumC8040Arr2 = c21446.f46124;
            EnumC8040 enumC8043 = enumC8040Arr2[0];
            EnumC8040 enumC8044 = EnumC8040.WRAP_CONTENT;
            boolean z11 = enumC8043 == enumC8044;
            boolean z12 = enumC8040Arr2[1] == enumC8044;
            int iM35754 = c21446.m35753();
            C21446 c21448 = this.f22535;
            int iMax = Math.max(iM35754, c21448.m35769());
            int iMax2 = Math.max(c21446.m35732(), c21448.m35767());
            int i14 = 0;
            boolean zM25504 = false;
            while (i14 < size3) {
                C15094 c15096 = (C15094) arrayList2.get(i14);
                if (c15096 instanceof C10157) {
                    int iM35755 = c15096.m35753();
                    int iM35733 = c15096.m35732();
                    boolean zM19690 = m19690(interfaceC13683M48571, c15096, 1) | zM25504;
                    int iM35756 = c15096.m35753();
                    int iM35734 = c15096.m35732();
                    if (iM35756 != iM35755) {
                        c15096.m35770(iM35756);
                        if (z11 && c15096.m35705() > iMax) {
                            iMax = Math.max(iMax, c15096.mo9453(EnumC0278.RIGHT).m15007() + c15096.m35705());
                        }
                        z3 = true;
                    } else {
                        z3 = zM19690;
                    }
                    if (iM35734 != iM35733) {
                        c15096.m35733(iM35734);
                        if (z12 && c15096.m35763() > iMax2) {
                            iMax2 = Math.max(iMax2, c15096.mo9453(EnumC0278.BOTTOM).m15007() + c15096.m35763());
                        }
                        z3 = true;
                    }
                    zM25504 = ((C10157) c15096).m25504() | z3;
                }
                i14++;
                iM35753 = iM35753;
            }
            int i15 = iM35753;
            int i16 = 0;
            while (i16 < 2) {
                int i17 = 0;
                while (i17 < size3) {
                    C15094 c15097 = (C15094) arrayList2.get(i17);
                    if (((c15097 instanceof C12978) && !(c15097 instanceof C10157)) || (c15097 instanceof C3101) || c15097.m35735() == 8 || ((z10 && c15097.f46156.f25374.f53276 && c15097.f46140.f25374.f53276) || (c15097 instanceof C10157))) {
                        z2 = z10;
                        arrayList = arrayList2;
                    } else {
                        int iM35757 = c15097.m35753();
                        int iM35735 = c15097.m35732();
                        z2 = z10;
                        int iM35758 = c15097.m35756();
                        arrayList = arrayList2;
                        boolean zM19691 = m19690(interfaceC13683M48571, c15097, i16 == 1 ? 2 : 1) | zM25504;
                        int iM35759 = c15097.m35753();
                        int iM35736 = c15097.m35732();
                        if (iM35759 != iM35757) {
                            c15097.m35770(iM35759);
                            if (z11 && c15097.m35705() > iMax) {
                                iMax = Math.max(iMax, c15097.mo9453(EnumC0278.RIGHT).m15007() + c15097.m35705());
                            }
                            zM25504 = true;
                        } else {
                            zM25504 = zM19691;
                        }
                        if (iM35736 != iM35735) {
                            c15097.m35733(iM35736);
                            if (z12 && c15097.m35763() > iMax2) {
                                iMax2 = Math.max(iMax2, c15097.mo9453(EnumC0278.BOTTOM).m15007() + c15097.m35763());
                            }
                            zM25504 = true;
                        }
                        if (c15097.m35771() && iM35758 != c15097.m35756()) {
                            zM25504 = true;
                        }
                    }
                    i17++;
                    z10 = z2;
                    arrayList2 = arrayList;
                }
                boolean z13 = z10;
                ArrayList arrayList3 = arrayList2;
                if (!zM25504) {
                    break;
                }
                m19689(c21446, i15, iM35732);
                i16++;
                zM25504 = false;
                z10 = z13;
                arrayList2 = arrayList3;
            }
            c21447 = c21446;
            if (zM25504) {
                m19689(c21447, i15, iM35732);
                if (c21446.m35753() < iMax) {
                    c21447.m35770(iMax);
                    z = true;
                } else {
                    z = false;
                }
                if (c21446.m35732() < iMax2) {
                    c21447.m35733(iMax2);
                    z = true;
                }
                if (z) {
                    m19689(c21447, i15, iM35732);
                }
            }
        } else {
            c21447 = c21446;
        }
        c21447.m48572(i7);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m19690(InterfaceC13683 interfaceC13683, C15094 c15094, int i) {
        EnumC8040[] enumC8040Arr = c15094.f46124;
        int[] iArr = c15094.f46119;
        EnumC8040 enumC8040 = enumC8040Arr[0];
        C22856 c22856 = this.f22536;
        c22856.f73745 = enumC8040;
        c22856.f73753 = enumC8040Arr[1];
        c22856.f73748 = c15094.m35753();
        c22856.f73747 = c15094.m35732();
        c22856.f73754 = false;
        c22856.f73750 = i;
        EnumC8040 enumC8041 = c22856.f73745;
        EnumC8040 enumC8042 = EnumC8040.MATCH_CONSTRAINT;
        boolean z = enumC8041 == enumC8042;
        boolean z2 = c22856.f73753 == enumC8042;
        boolean z3 = z && c15094.f46108 > 0.0f;
        boolean z4 = z2 && c15094.f46108 > 0.0f;
        if (z3 && iArr[0] == 4) {
            c22856.f73745 = EnumC8040.FIXED;
        }
        if (z4 && iArr[1] == 4) {
            c22856.f73753 = EnumC8040.FIXED;
        }
        interfaceC13683.mo32930(c15094, c22856);
        c15094.m35770(c22856.f73746);
        c15094.m35733(c22856.f73749);
        c15094.m35721(c22856.f73751);
        c15094.m35752(c22856.f73752);
        c22856.f73750 = 0;
        return c22856.f73754;
    }
}
