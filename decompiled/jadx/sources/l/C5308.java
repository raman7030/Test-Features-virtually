package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.alipay.sdk.m.t.e;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C766 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5308 {
    /* JADX WARN: Code duplicated, block: B:101:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:102:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:270:0x040b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:72:0x0107  */
    /* JADX WARN: Code duplicated, block: B:73:0x010c  */
    /* JADX WARN: Code duplicated, block: B:76:0x011a  */
    /* JADX WARN: Code duplicated, block: B:77:0x011d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0131  */
    /* JADX WARN: Code duplicated, block: B:82:0x0137  */
    /* JADX WARN: Code duplicated, block: B:84:0x0147  */
    /* JADX WARN: Code duplicated, block: B:85:0x014a  */
    /* JADX WARN: Code duplicated, block: B:88:0x0156  */
    /* JADX WARN: Code duplicated, block: B:89:0x0159  */
    /* JADX WARN: Code duplicated, block: B:92:0x016d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0177  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b7  */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0208, code lost:
    
        if (r5 > r2) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x020f, code lost:
    
        if (r15 > r5) goto L142;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C19420 m15227(C22241 c22241, C7333 c7333, C22150 c22150, boolean z, JSONValue jSONValue) {
        String str;
        String strM28459;
        int iM28458;
        long j;
        boolean zEquals;
        String str2;
        C4043 c4043M15226;
        C0368 c0368;
        C0368 c0369;
        C4043 c4043;
        boolean z2;
        String str3;
        long j2;
        C22150 c22151;
        int i;
        int i2;
        int i3;
        String str4;
        String strM28460;
        String strM28461;
        String strM28462;
        String str5;
        String strM28463;
        String strM28464;
        long j3;
        String str6 = c22150.f71870;
        String str7 = c22150.f71868;
        String str8 = c22150.f71864;
        String str9 = c7333.f22530;
        C11567 c11567M28457 = C11567.m28457(str9);
        int i4 = c11567M28457.f34509;
        if (!z) {
            if (i4 == 40) {
                if (e.m.equals(str7)) {
                    if (!"auto".equals(str8)) {
                        throw C6450.m17822(c22150);
                    }
                } else if (!"arm".equals(str8) && !"thumb".equals(str8)) {
                    throw C6450.m17826(c22150);
                }
            } else if (!"auto".equals(str8)) {
                throw C3059.m9364("instructionMode must be auto for non-ARM ELF", "instructionMode", JSON.value(str8), JSON.array("auto"), (JSONObject) null);
            }
            str = "auto";
            if (z) {
                strM28459 = c22150.f71872;
            } else {
                strM28459 = c11567M28457.m28459();
            }
            if (z) {
                iM28458 = c22150.f71871;
            } else {
                iM28458 = c11567M28457.m28458(str);
            }
            j = c22150.f71858;
            zEquals = "virtual".equals(str6);
            if (z) {
                str2 = str;
                j3 = c22150.f71876;
                if (zEquals) {
                    j = j3;
                }
                C4043 c4043M15227 = m15226(c22241, str9, j, zEquals);
                C12095.m29507(c4043M15227);
                c0368 = new C0368(c4043M15227, j3);
            } else {
                str2 = str;
                c4043M15226 = m15226(c22241, str9, j, zEquals);
                C12095.m29507(c4043M15226);
                if (i4 != 40 && "virtual".equals(str6) && (j & 1) == 1) {
                    long j4 = (-2) & j;
                    boolean z3 = c4043M15226.f12820;
                    if (z3 && c4043M15226.f12824) {
                        C4043 c4043M15228 = m15226(c22241, str9, j4, true);
                        C12095.m29507(c4043M15228);
                        c0369 = new C0368(c4043M15228, j4);
                    } else {
                        if (!z3) {
                            C4043 c4043M15229 = m15226(c22241, str9, j4, true);
                            C12095.m29507(c4043M15229);
                            if (c4043M15229.f12820 && c4043M15229.f12824) {
                                c0369 = new C0368(c4043M15229, j4);
                            }
                        }
                        c0368 = new C0368(c4043M15226, j);
                    }
                    c0368 = c0369;
                } else {
                    if (!zEquals) {
                        j = c4043M15226.f12822;
                    }
                    c0368 = new C0368(c4043M15226, j);
                }
            }
            c4043 = c0368.f1783;
            if (i4 == 40 || !c4043.f12824) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!c4043.f12820) {
                List list = Collections.EMPTY_LIST;
                C15645 c15645M36836 = C15645.m36836();
                int i5 = c11567M28457.f34508;
                if (e.m.equals(str7)) {
                    strM28463 = "";
                    str5 = str2;
                } else {
                    str5 = str2;
                    strM28463 = c11567M28457.m28460(str5);
                }
                if (e.m.equals(str7)) {
                    strM28464 = "";
                } else {
                    strM28464 = c11567M28457.m28461(str5);
                }
                return new C19420(str5, false, c4043, strM28459, iM28458, i5, strM28463, strM28464, c15645M36836);
            }
            str3 = str2;
            if (!c4043.f12821) {
                List list2 = Collections.EMPTY_LIST;
                C15645 c15645M36837 = C15645.m36836();
                int i6 = c11567M28457.f34508;
                if (e.m.equals(str7)) {
                    strM28461 = "";
                } else {
                    strM28461 = c11567M28457.m28460(str3);
                }
                if (e.m.equals(str7)) {
                    strM28462 = "";
                } else {
                    strM28462 = c11567M28457.m28461(str3);
                }
                return new C19420(str3, false, c4043, strM28459, iM28458, i6, strM28461, strM28462, c15645M36837);
            }
            j2 = c0368.f1784;
            if (j2 >= 0) {
                throw C12095.m29508();
            }
            String str10 = c7333.f22530;
            c22151 = c22150;
            String str11 = c22151.f71868;
            int i7 = c22151.f71873;
            int i8 = c22151.f71874;
            long j5 = c22151.f71867;
            int i9 = c22151.f71857;
            int i10 = c22151.f71860;
            int i11 = c22151.f71869;
            List list3 = c22151.f71861;
            try {
                c22241.getClass();
                C15645 c15645M37909 = C16036.m37909(str10, strM28459, iM28458, str11, j2, z2, i7, i8, j5, i9, i10, i11, list3);
                int i12 = c22151.f71873;
                String str12 = "code";
                if ("code".equals(str7)) {
                    i = 1;
                } else if (e.m.equals(str7)) {
                    i = 2;
                } else {
                    i = 3;
                }
                i2 = c15645M37909.f48156;
                List list4 = c15645M37909.f48150;
                int i13 = c15645M37909.f48151;
                long j6 = c15645M37909.f48152;
                int i14 = c15645M37909.f48153;
                int i15 = iM28458;
                boolean z4 = c15645M37909.f48149;
                String str13 = strM28459;
                int i16 = c15645M37909.f48154;
                if (i2 >= 0 || i16 < 0 || i16 > i || ((!z4 && i16 >= i) || i14 < 0 || i14 > i2 || j6 < 0 || i13 < 0 || (i3 = c15645M37909.f48155) < 0 || i3 > c22151.f71860 || list4.size() > c22151.f71869)) {
                    throw C12095.m29491();
                }
                if (z4 && i16 != i) {
                    throw C12095.m29491();
                }
                if (!z4) {
                    if (i16 == i12) {
                        int i17 = c22151.f71874;
                        if (i14 == i17) {
                            long j7 = c22151.f71867;
                            if (j6 == j7) {
                                throw C12095.m29491();
                            }
                            throw C12095.m29491();
                        }
                    }
                }
                String str14 = c15645M37909.f48148;
                if (!C6322.m17577(str14) || "target_not_mapped".equals(str14)) {
                    throw C12095.m29491();
                }
                if (z4) {
                    if (!"scan_space_exhausted".equals(str14)) {
                        throw C12095.m29491();
                    }
                } else if (!"result_limit_reached".equals(str14) && !"scan_budget_exhausted".equals(str14) && !"relocation_page_budget_exhausted".equals(str14)) {
                    throw C12095.m29491();
                }
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    C8591 c8591 = (C8591) it.next();
                    String str15 = c8591.f26232;
                    String str16 = c8591.f26230;
                    int i18 = c8591.f26235;
                    long j8 = c8591.f26234;
                    String str17 = c8591.f26236;
                    int iM7422 = C2241.m7422(str15);
                    long j9 = c8591.f26237;
                    if (j9 >= 0 && j8 >= 0 && i18 > 0) {
                        Iterator it2 = it;
                        String str18 = c8591.f26231;
                        if (str18 != null) {
                            C15645 c15645 = c15645M37909;
                            if (str18.length() <= 512 && (("instruction".equals(str17) || "data_relocation".equals(str17) || "data_pointer".equals(str17)) && iM7422 != 0 && (c22151.f71856 & iM7422) != 0 && ((!str12.equals(str7) || "instruction".equals(str17)) && ((!e.m.equals(str7) || !"instruction".equals(str17)) && ((!"both".equals(str7) || i12 <= 0 || !"instruction".equals(str17)) && (((!"data_relocation".equals(str17) && !"data_pointer".equals(str17)) || iM7422 == 4) && str16 != null && (str16.length() & 1) == 0)))))) {
                                for (int i19 = 0; i19 < str16.length(); i19++) {
                                    char cCharAt = str16.charAt(i19);
                                    if ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'f')) {
                                    }
                                }
                                if (str16.length() == i18 * 2) {
                                    C3652 c3652 = c8591.f26233;
                                    if (c3652 != null) {
                                        long j10 = c3652.f11514;
                                        if (j10 >= 0) {
                                            long j11 = c3652.f11516;
                                            if (j11 >= -1) {
                                                long j12 = c3652.f11515;
                                                if (j12 >= 0) {
                                                    long j13 = c3652.f11517;
                                                    if (j13 > 0 && j12 < j13) {
                                                        long j14 = C13132.FOREVER_NS - j12;
                                                        if (j10 > j14 || j10 + j12 != j9 || ((j11 >= 0 && (j11 > j14 || j11 + j12 != j8)) || j10 > C13132.FOREVER_NS - j13)) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        throw C12095.m29491();
                                    }
                                    it = it2;
                                    c15645M37909 = c15645;
                                    c22151 = c22150;
                                    str12 = str12;
                                    i12 = i12;
                                    str7 = str7;
                                }
                            }
                        }
                    }
                    throw C12095.m29491();
                }
                C15645 c15646 = c15645M37909;
                String str19 = str7;
                int i20 = c11567M28457.f34508;
                if (e.m.equals(str19)) {
                    strM28460 = "";
                    str4 = str3;
                } else {
                    str4 = str3;
                    strM28460 = c11567M28457.m28460(str4);
                }
                return new C19420(str4, true, c4043, str13, i15, i20, strM28460, e.m.equals(str19) ? "" : c11567M28457.m28461(str4), c15646);
            } catch (IllegalArgumentException unused) {
                if (z) {
                    throw C3059.m9364("Invalid cursor", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
                }
                throw C3059.m9364("Invalid native xref scan position", "nextCursor", (JSONValue) null, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
            } catch (RuntimeException unused2) {
                throw C3059.m9368("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
            }
        }
        str8 = c22150.f71863;
        str = str8;
        if (z) {
            strM28459 = c22150.f71872;
        } else {
            strM28459 = c11567M28457.m28459();
        }
        if (z) {
            iM28458 = c22150.f71871;
        } else {
            iM28458 = c11567M28457.m28458(str);
        }
        j = c22150.f71858;
        zEquals = "virtual".equals(str6);
        if (z) {
            str2 = str;
            j3 = c22150.f71876;
            if (zEquals) {
                j = j3;
            }
            C4043 c4043M152210 = m15226(c22241, str9, j, zEquals);
            C12095.m29507(c4043M152210);
            c0368 = new C0368(c4043M152210, j3);
        } else {
            str2 = str;
            c4043M15226 = m15226(c22241, str9, j, zEquals);
            C12095.m29507(c4043M15226);
            if (i4 != 40) {
                if (!zEquals) {
                    j = c4043M15226.f12822;
                }
                c0368 = new C0368(c4043M15226, j);
            } else {
                if (!zEquals) {
                    j = c4043M15226.f12822;
                }
                c0368 = new C0368(c4043M15226, j);
            }
        }
        c4043 = c0368.f1783;
        if (i4 == 40) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (!c4043.f12820) {
            List list5 = Collections.EMPTY_LIST;
            C15645 c15645M36838 = C15645.m36836();
            int i21 = c11567M28457.f34508;
            if (e.m.equals(str7)) {
                strM28463 = "";
                str5 = str2;
            } else {
                str5 = str2;
                strM28463 = c11567M28457.m28460(str5);
            }
            if (e.m.equals(str7)) {
                strM28464 = "";
            } else {
                strM28464 = c11567M28457.m28461(str5);
            }
            return new C19420(str5, false, c4043, strM28459, iM28458, i21, strM28463, strM28464, c15645M36838);
        }
        str3 = str2;
        if (!c4043.f12821) {
            List list6 = Collections.EMPTY_LIST;
            C15645 c15645M36839 = C15645.m36836();
            int i22 = c11567M28457.f34508;
            if (e.m.equals(str7)) {
                strM28461 = "";
            } else {
                strM28461 = c11567M28457.m28460(str3);
            }
            if (e.m.equals(str7)) {
                strM28462 = "";
            } else {
                strM28462 = c11567M28457.m28461(str3);
            }
            return new C19420(str3, false, c4043, strM28459, iM28458, i22, strM28461, strM28462, c15645M36839);
        }
        j2 = c0368.f1784;
        if (j2 >= 0) {
            throw C12095.m29508();
        }
        String str110 = c7333.f22530;
        c22151 = c22150;
        String str111 = c22151.f71868;
        int i23 = c22151.f71873;
        int i24 = c22151.f71874;
        long j15 = c22151.f71867;
        int i25 = c22151.f71857;
        int i110 = c22151.f71860;
        int i111 = c22151.f71869;
        List list7 = c22151.f71861;
        c22241.getClass();
        C15645 c15645M379010 = C16036.m37909(str110, strM28459, iM28458, str111, j2, z2, i23, i24, j15, i25, i110, i111, list7);
        int i112 = c22151.f71873;
        String str112 = "code";
        if ("code".equals(str7)) {
            i = 1;
        } else if (e.m.equals(str7)) {
            i = 2;
        } else {
            i = 3;
        }
        i2 = c15645M379010.f48156;
        List list8 = c15645M379010.f48150;
        int i113 = c15645M379010.f48151;
        long j16 = c15645M379010.f48152;
        int i114 = c15645M379010.f48153;
        int i115 = iM28458;
        boolean z5 = c15645M379010.f48149;
        String str113 = strM28459;
        int i116 = c15645M379010.f48154;
        if (i2 >= 0) {
        }
        throw C12095.m29491();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4043 m15226(InterfaceC3806 interfaceC3806, String str, long j, boolean z) throws C3059 {
        try {
            ((C22241) interfaceC3806).getClass();
            return C16036.m37906(str, j, z, false);
        } catch (RuntimeException unused) {
            throw C3059.m9368("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
        }
    }
}
