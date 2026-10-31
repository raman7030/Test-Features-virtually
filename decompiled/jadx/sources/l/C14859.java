package l;

import com.umeng.commonsdk.statistics.b;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 11F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14859 implements InterfaceC6121 {
    /* JADX WARN: Code duplicated, block: B:113:0x0241  */
    /* JADX WARN: Code duplicated, block: B:115:0x0247  */
    /* JADX WARN: Code duplicated, block: B:117:0x0254  */
    /* JADX WARN: Code duplicated, block: B:120:0x0261 A[LOOP:3: B:116:0x0252->B:120:0x0261, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:219:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:221:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:224:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:226:0x03d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:227:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:232:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:233:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:236:0x0408  */
    /* JADX WARN: Code duplicated, block: B:255:0x0416 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x025a A[SYNTHETIC] */
    @Override // l.InterfaceC6121
    /* JADX INFO: renamed from: ֫ */
    public final void mo3995(C18906 c18906, C10355 c10355, C19220 c19220) throws C1580 {
        int iIntValue;
        Iterator it;
        int iIntValue2;
        C16809 c16809M42444;
        int i;
        String str;
        String str2;
        String strConcat;
        boolean z;
        C14692[] c14692Arr;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        int iM24993;
        int length;
        int i4;
        int i5;
        C4794 c4794M43639;
        Integer numValueOf;
        int iMo12858 = c18906.m43652().mo12858();
        int i6 = 1;
        c18906.m43647(true);
        C18514 c18514M44343 = c19220.m44343("parent");
        String str3 = "null";
        String str4 = "@";
        if (c18514M44343 != null) {
            String strM43026 = c18514M44343.m43026();
            if (!strM43026.startsWith("@")) {
                throw new C1580("Expected reference value", c18514M44343);
            }
            String strSubstring = strM43026.substring(1);
            if (strSubstring.equals("null")) {
                numValueOf = 0;
            } else {
                Integer numM28794 = C11766.m28794(strSubstring);
                if (numM28794 != null) {
                    numValueOf = numM28794;
                } else {
                    int iMo26156 = c10355.mo26156(iMo12858, strSubstring);
                    numValueOf = iMo26156 == -1 ? null : Integer.valueOf(iMo26156);
                }
            }
            if (numValueOf == null) {
                throw new C1580("Resource not found: @".concat(strSubstring), c18514M44343);
            }
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
        }
        c18906.m43638(iIntValue);
        C7073 c7073 = new C7073();
        Iterator itM44337 = C19220.m44337(c19220);
        while (itM44337.hasNext()) {
            C19220 c19221 = (C19220) itM44337.next();
            if (c19221.m44350().equals("item")) {
                C18514 c18514M44348 = c19221.m44348("name");
                String strM43027 = c18514M44348.m43026();
                Integer numM28795 = C11766.m28794(strM43027);
                C17515 c17515Mo26163 = c10355.mo26163();
                String[] strArrSplit = strM43027.split(":", 2);
                if (numM28795 != null) {
                    iIntValue2 = (numM28795.intValue() >>> 24) & 255;
                    it = itM44337;
                } else {
                    it = itM44337;
                    if (strArrSplit.length == 2) {
                        int iMo26157 = c10355.mo26157(strArrSplit[0]);
                        strM43027 = strArrSplit[i6];
                        iIntValue2 = iMo26157;
                    } else {
                        iIntValue2 = iMo12858;
                    }
                }
                if (numM28795 == null) {
                    Iterator it2 = c17515Mo26163.f53493.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            c16809M42444 = null;
                            break;
                        }
                        C18221 c18221 = (C18221) it2.next();
                        if (c18221.m42446() == iIntValue2) {
                            c16809M42444 = c18221.m42444(strM43027);
                            break;
                        }
                    }
                } else {
                    c16809M42444 = c17515Mo26163.m40933(numM28795.intValue());
                }
                if (c16809M42444 == null && iIntValue2 == i6) {
                    c16809M42444 = ((C18221) C11166.m27704().f53493.get(0)).m42444(strM43027);
                }
                if (c16809M42444 == null) {
                    throw new C1580("Unknown attr " + c18514M44348.m43026(), c18514M44348);
                }
                int i7 = c16809M42444.f51604;
                int i8 = c16809M42444.f51608;
                int i9 = i8 & 2;
                if (i9 == 0 || c19221.m44346()) {
                    C0874 c0874M44347 = c19221.m44347();
                    String strM3219 = c0874M44347.m3219();
                    if (strM3219.startsWith(str4)) {
                        c7073.f21767 = i6;
                        String strSubstring2 = strM3219.substring(i6);
                        if (strSubstring2.length() == 8 && C9896.m24990(strSubstring2)) {
                            c7073.f21766 = C9896.m24993(strSubstring2);
                        } else if (C11766.m28794(strSubstring2) != null) {
                            c7073.f21766 = C11766.m28794(strSubstring2).intValue();
                        } else if (strSubstring2.equals(str3)) {
                            c7073.f21766 = 0;
                        } else if (strSubstring2.equals(b.f)) {
                            c7073.f21766 = i6;
                            c7073.f21767 = 0;
                        } else {
                            int iMo26158 = c10355.mo26156(iMo12858, strSubstring2);
                            if (iMo26158 == -1) {
                                throw new C1580("Resource not found: ".concat(strSubstring2), c0874M44347);
                            }
                            c7073.f21766 = iMo26158;
                        }
                    } else {
                        if (strM3219.startsWith("?")) {
                            c7073.f21767 = 2;
                            String strSubstring3 = strM3219.substring(i6);
                            if (strSubstring3.length() == 8 && C9896.m24990(strSubstring3)) {
                                c7073.f21766 = C9896.m24993(strSubstring3);
                            } else if (C11766.m28794(strSubstring3) != null) {
                                c7073.f21766 = C11766.m28794(strSubstring3).intValue();
                            } else {
                                int iMo26159 = c10355.mo26156(iMo12858, strSubstring3);
                                if (iMo26159 == -1) {
                                    throw new C1580("Resource not found: ".concat(strSubstring3), c0874M44347);
                                }
                                c7073.f21766 = iMo26159;
                            }
                        } else {
                            C14692[] c14692Arr2 = c16809M42444.f51607;
                            if ((65536 & i8) != 0) {
                                int length2 = c14692Arr2.length;
                                int i10 = 0;
                                while (true) {
                                    if (i10 < length2) {
                                        C14692 c14692 = c14692Arr2[i10];
                                        i = iMo12858;
                                        if (c14692.f44875.equals(strM3219)) {
                                            c7073.f21766 = c14692.f44876;
                                            c7073.f21767 = c14692.f44877;
                                            str = str3;
                                            str2 = str4;
                                        } else {
                                            i10++;
                                            iMo12858 = i;
                                        }
                                    } else {
                                        i = iMo12858;
                                        if (C9896.m25000(strM3219)) {
                                            int i11 = Integer.parseInt(strM3219);
                                            int length3 = c14692Arr2.length;
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 < length3) {
                                                    if (c14692Arr2[i12].f44876 == i11) {
                                                        c7073.f21767 = 16;
                                                        c7073.f21766 = i11;
                                                    } else {
                                                        i12++;
                                                    }
                                                } else if (i11 == 0 && i8 == 65536) {
                                                    c7073.f21767 = 16;
                                                    c7073.f21766 = i11;
                                                } else if (C9896.m24994(strM3219)) {
                                                    iM24993 = C9896.m24993(strM3219.substring(2));
                                                    length = c14692Arr2.length;
                                                    i4 = 0;
                                                    while (true) {
                                                        if (i4 >= length) {
                                                            if (iM24993 != 0 && i8 == 65536) {
                                                                c7073.f21767 = 16;
                                                                c7073.f21766 = iM24993;
                                                            }
                                                            i2 = 1;
                                                            i3 = 3;
                                                            z3 = false;
                                                        } else if (c14692Arr2[i4].f44876 == iM24993) {
                                                            c7073.f21767 = 16;
                                                            c7073.f21766 = iM24993;
                                                        } else {
                                                            i4++;
                                                        }
                                                    }
                                                }
                                                str = str3;
                                                str2 = str4;
                                                i2 = 1;
                                                i3 = 3;
                                                z3 = false;
                                            }
                                        } else if (C9896.m24994(strM3219)) {
                                            iM24993 = C9896.m24993(strM3219.substring(2));
                                            length = c14692Arr2.length;
                                            i4 = 0;
                                            while (true) {
                                                if (i4 >= length) {
                                                    if (c14692Arr2[i4].f44876 == iM24993) {
                                                        c7073.f21767 = 16;
                                                        c7073.f21766 = iM24993;
                                                    } else {
                                                        i4++;
                                                    }
                                                } else if (iM24993 != 0) {
                                                }
                                                str = str3;
                                                str2 = str4;
                                                i2 = 1;
                                                i3 = 3;
                                                z3 = false;
                                            }
                                        }
                                    }
                                    i2 = 1;
                                    i3 = 3;
                                    z3 = true;
                                }
                            } else {
                                i = iMo12858;
                            }
                            if ((131072 & i8) != 0) {
                                c7073.f21767 = 17;
                                String[] strArrSplit2 = strM3219.split("\\|");
                                int length4 = strArrSplit2.length;
                                int i13 = 0;
                                boolean z4 = false;
                                int i14 = 0;
                                while (true) {
                                    if (i13 >= length4) {
                                        str = str3;
                                        str2 = str4;
                                        z = false;
                                        break;
                                    }
                                    String[] strArr = strArrSplit2;
                                    String strTrim = strArrSplit2[i13].trim();
                                    str = str3;
                                    int length5 = c14692Arr2.length;
                                    str2 = str4;
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 >= length5) {
                                            c14692Arr = c14692Arr2;
                                            z2 = false;
                                            break;
                                        }
                                        int i16 = length5;
                                        C14692 c14693 = c14692Arr2[i15];
                                        c14692Arr = c14692Arr2;
                                        if (c14693.f44875.equals(strTrim)) {
                                            z2 = true;
                                            i14 |= c14693.f44876;
                                            z4 = true;
                                            break;
                                        } else {
                                            i15++;
                                            length5 = i16;
                                            c14692Arr2 = c14692Arr;
                                        }
                                    }
                                    if (!z2) {
                                        z = true;
                                        break;
                                    }
                                    i13++;
                                    str3 = str;
                                    strArrSplit2 = strArr;
                                    str4 = str2;
                                    c14692Arr2 = c14692Arr;
                                }
                                int i17 = i14;
                                if (z || !z4) {
                                    if (!z4 && C9896.m25000(strM3219)) {
                                        c7073.f21766 = Integer.parseInt(strM3219);
                                    } else if (!z4 && C9896.m24994(strM3219)) {
                                        c7073.f21766 = C9896.m24993(strM3219.substring(2));
                                    }
                                    i2 = 1;
                                    i3 = 3;
                                    z3 = false;
                                } else {
                                    c7073.f21766 = i17;
                                    i2 = 1;
                                    i3 = 3;
                                    z3 = true;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                            }
                            if ((i8 & 16) == 0 || !strM3219.startsWith("#")) {
                                i6 = 1;
                            } else {
                                i6 = 1;
                                if (strM3219.length() == 1 || !C9896.m24990(strM3219.substring(1))) {
                                    strConcat = "Color value invalid: %s".concat(strM3219);
                                } else {
                                    strConcat = !C9896.m24991(strM3219, c7073) ? "Color value invalid -- must be #rgb, #argb, #rrggbb, or #aarrggbb: ".concat(strM3219) : null;
                                }
                                if (strConcat != null) {
                                    if (i9 == 0) {
                                        throw new C1580(strConcat, c0874M44347);
                                    }
                                }
                                i2 = i6;
                                i3 = 3;
                                z3 = false;
                            }
                            if ((i8 & 4) == 0 || !C9896.m24998(strM3219, c7073)) {
                                int i18 = i8 & 32;
                                if (!(i18 == 0 && (i8 & 64) == 0 && (i8 & 128) == 0) && C9896.m24995(strM3219, c7073) && (i9 == 0 || C9896.m24992(c7073))) {
                                    int i19 = c7073.f21767;
                                    if (i19 == 4 && i18 == 0) {
                                        if (i9 == 0) {
                                            throw new C1580("Float value is not allowed here: ".concat(strM3219), c0874M44347);
                                        }
                                    } else if (i19 == 6 && (i8 & 128) == 0) {
                                        if (i9 == 0) {
                                            throw new C1580("Fraction value is not allowed here: ".concat(strM3219), c0874M44347);
                                        }
                                    } else if (i19 == 5 && (i8 & 64) == 0) {
                                        if (i9 == 0) {
                                            throw new C1580("Dimension value is not allowed here: ".concat(strM3219), c0874M44347);
                                        }
                                    }
                                    if ((i8 & 8) == 0) {
                                        if (i9 != 0) {
                                            throw new C1580(C20087.m46306("Error: ", strM3219, " [", c16809M42444.m39547(), "]"), c0874M44347);
                                        }
                                        c7073.f21767 = 3;
                                        StringBuilder sb = new StringBuilder(strM3219.length());
                                        C11766.m28797(sb, strM3219);
                                        c7073.f21765 = sb.toString();
                                    } else if (strM3219.equals("true")) {
                                        c7073.f21766 = -1;
                                        c7073.f21767 = 18;
                                    } else if (strM3219.equals("false")) {
                                        c7073.f21766 = 0;
                                        c7073.f21767 = 18;
                                    } else {
                                        if (i9 != 0) {
                                            throw new C1580(C20087.m46306("Error: ", strM3219, " [", c16809M42444.m39547(), "]"), c0874M44347);
                                        }
                                        c7073.f21767 = 3;
                                        StringBuilder sb2 = new StringBuilder(strM3219.length());
                                        C11766.m28797(sb2, strM3219);
                                        c7073.f21765 = sb2.toString();
                                    }
                                } else if ((i8 & 8) == 0) {
                                    if (i9 != 0) {
                                        throw new C1580(C20087.m46306("Error: ", strM3219, " [", c16809M42444.m39547(), "]"), c0874M44347);
                                    }
                                    c7073.f21767 = 3;
                                    StringBuilder sb3 = new StringBuilder(strM3219.length());
                                    C11766.m28797(sb3, strM3219);
                                    c7073.f21765 = sb3.toString();
                                } else if (strM3219.equals("true")) {
                                    c7073.f21766 = -1;
                                    c7073.f21767 = 18;
                                } else if (strM3219.equals("false")) {
                                    c7073.f21766 = 0;
                                    c7073.f21767 = 18;
                                } else {
                                    if (i9 != 0) {
                                        throw new C1580(C20087.m46306("Error: ", strM3219, " [", c16809M42444.m39547(), "]"), c0874M44347);
                                    }
                                    c7073.f21767 = 3;
                                    StringBuilder sb4 = new StringBuilder(strM3219.length());
                                    C11766.m28797(sb4, strM3219);
                                    c7073.f21765 = sb4.toString();
                                }
                            }
                            i2 = i6;
                            i3 = 3;
                            z3 = false;
                        }
                        i5 = c7073.f21767;
                        if (i5 == i3) {
                            c4794M43639 = c18906.m43640(c7073.f21765, (C21916[]) null, -1);
                        } else {
                            c4794M43639 = c18906.m43639(c7073.f21766, i5, -1);
                        }
                        c4794M43639.m13997(i7);
                        if (!z3) {
                            c10355.m26162(c4794M43639, c0874M44347);
                        }
                        i6 = i2;
                    }
                    i = iMo12858;
                    str = str3;
                    str2 = str4;
                    i2 = i6;
                    i3 = 3;
                    z3 = false;
                    i5 = c7073.f21767;
                    if (i5 == i3) {
                        c4794M43639 = c18906.m43640(c7073.f21765, (C21916[]) null, -1);
                    } else {
                        c4794M43639 = c18906.m43639(c7073.f21766, i5, -1);
                    }
                    c4794M43639.m13997(i7);
                    if (!z3) {
                        c10355.m26162(c4794M43639, c0874M44347);
                    }
                    i6 = i2;
                } else {
                    C11766.m28800(c18906, c10355, c19221).m13997(i7);
                    i = iMo12858;
                    str = str3;
                    str2 = str4;
                }
                itM44337 = it;
                iMo12858 = i;
                str3 = str;
                str4 = str2;
            } else {
                C4710.m13804(c18906, c10355, c19221).m13997(C4710.m13802(c19221, c7073));
            }
        }
        c18906.m43642(C18906.f59581);
    }
}
