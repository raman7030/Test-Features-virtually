package p067l;

import bin.p000mt.json.JSON;
import bin.p000mt.json.JSONObject;
import bin.p000mt.json.JSONValue;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C766 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7413 {
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
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C20825 m17131(C23506 c23506, C9338 c9338, C23420 c23420, boolean z, JSONValue jSONValue) {
        String str;
        String strM30505;
        int iM30504;
        long j;
        boolean zEquals;
        String str2;
        C6211 c6211M17130;
        C2718 c2718;
        C2718 c2719;
        C6211 c6211;
        boolean z2;
        String str3;
        long j2;
        C23420 c23421;
        int i;
        int i2;
        int i3;
        String str4;
        String strM30506;
        String strM30507;
        String strM30508;
        String str5;
        String strM30509;
        String strM305010;
        long j3;
        String str6 = c23420.f74592;
        String str7 = c23420.f74590;
        String str8 = c23420.f74586;
        String str9 = c9338.f25443;
        C13362 c13362M30503 = C13362.m30503(str9);
        int i4 = c13362M30503.f37508;
        if (!z) {
            if (i4 == 40) {
                if (AbstractC0213e.f989m.equals(str7)) {
                    if (!"auto".equals(str8)) {
                        throw C8498.m19769(c23420);
                    }
                } else if (!"arm".equals(str8) && !"thumb".equals(str8)) {
                    throw C8498.m19773(c23420);
                }
            } else if (!"auto".equals(str8)) {
                throw C5276.m11406("instructionMode must be auto for non-ARM ELF", "instructionMode", JSON.value(str8), JSON.array("auto"), (JSONObject) null);
            }
            str = "auto";
            if (z) {
                strM30505 = c23420.f74594;
            } else {
                strM30505 = c13362M30503.m30505();
            }
            if (z) {
                iM30504 = c23420.f74593;
            } else {
                iM30504 = c13362M30503.m30504(str);
            }
            j = c23420.f74580;
            zEquals = "virtual".equals(str6);
            if (z) {
                str2 = str;
                j3 = c23420.f74598;
                if (zEquals) {
                    j = j3;
                }
                C6211 c6211M17131 = m17130(c23506, str9, j, zEquals);
                C13863.m31570(c6211M17131);
                c2718 = new C2718(c6211M17131, j3);
            } else {
                str2 = str;
                c6211M17130 = m17130(c23506, str9, j, zEquals);
                C13863.m31570(c6211M17130);
                if (i4 != 40 && "virtual".equals(str6) && (j & 1) == 1) {
                    long j4 = (-2) & j;
                    boolean z3 = c6211M17130.f15635;
                    if (z3 && c6211M17130.f15639) {
                        C6211 c6211M17132 = m17130(c23506, str9, j4, true);
                        C13863.m31570(c6211M17132);
                        c2719 = new C2718(c6211M17132, j4);
                    } else {
                        if (!z3) {
                            C6211 c6211M17133 = m17130(c23506, str9, j4, true);
                            C13863.m31570(c6211M17133);
                            if (c6211M17133.f15635 && c6211M17133.f15639) {
                                c2719 = new C2718(c6211M17133, j4);
                            }
                        }
                        c2718 = new C2718(c6211M17130, j);
                    }
                    c2718 = c2719;
                } else {
                    if (!zEquals) {
                        j = c6211M17130.f15637;
                    }
                    c2718 = new C2718(c6211M17130, j);
                }
            }
            c6211 = c2718.f4562;
            if (i4 == 40 || !c6211.f15639) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!c6211.f15635) {
                List list = Collections.EMPTY_LIST;
                C17237 c17237M39002 = C17237.m39002();
                int i5 = c13362M30503.f37507;
                if (AbstractC0213e.f989m.equals(str7)) {
                    strM30509 = "";
                    str5 = str2;
                } else {
                    str5 = str2;
                    strM30509 = c13362M30503.m30506(str5);
                }
                if (AbstractC0213e.f989m.equals(str7)) {
                    strM305010 = "";
                } else {
                    strM305010 = c13362M30503.m30507(str5);
                }
                return new C20825(str5, false, c6211, strM30505, iM30504, i5, strM30509, strM305010, c17237M39002);
            }
            str3 = str2;
            if (!c6211.f15636) {
                List list2 = Collections.EMPTY_LIST;
                C17237 c17237M39003 = C17237.m39002();
                int i6 = c13362M30503.f37507;
                if (AbstractC0213e.f989m.equals(str7)) {
                    strM30507 = "";
                } else {
                    strM30507 = c13362M30503.m30506(str3);
                }
                if (AbstractC0213e.f989m.equals(str7)) {
                    strM30508 = "";
                } else {
                    strM30508 = c13362M30503.m30507(str3);
                }
                return new C20825(str3, false, c6211, strM30505, iM30504, i6, strM30507, strM30508, c17237M39003);
            }
            j2 = c2718.f4563;
            if (j2 >= 0) {
                throw C13863.m31571();
            }
            String str10 = c9338.f25443;
            c23421 = c23420;
            String str11 = c23421.f74590;
            int i7 = c23421.f74595;
            int i8 = c23421.f74596;
            long j5 = c23421.f74589;
            int i9 = c23421.f74579;
            int i10 = c23421.f74582;
            int i11 = c23421.f74591;
            List list3 = c23421.f74583;
            try {
                c23506.getClass();
                C17237 c17237M40096 = C17609.m40096(str10, strM30505, iM30504, str11, j2, z2, i7, i8, j5, i9, i10, i11, list3);
                int i12 = c23421.f74595;
                String str12 = "code";
                if ("code".equals(str7)) {
                    i = 1;
                } else if (AbstractC0213e.f989m.equals(str7)) {
                    i = 2;
                } else {
                    i = 3;
                }
                i2 = c17237M40096.f51296;
                List list4 = c17237M40096.f51290;
                int i13 = c17237M40096.f51291;
                long j6 = c17237M40096.f51292;
                int i14 = c17237M40096.f51293;
                int i15 = iM30504;
                boolean z4 = c17237M40096.f51289;
                String str13 = strM30505;
                int i16 = c17237M40096.f51294;
                if (i2 >= 0 || i16 < 0 || i16 > i || ((!z4 && i16 >= i) || i14 < 0 || i14 > i2 || j6 < 0 || i13 < 0 || (i3 = c17237M40096.f51295) < 0 || i3 > c23421.f74582 || list4.size() > c23421.f74591)) {
                    throw C13863.m31554();
                }
                if (z4 && i16 != i) {
                    throw C13863.m31554();
                }
                if (!z4) {
                    if (i16 == i12) {
                        int i17 = c23421.f74596;
                        if (i14 == i17) {
                            long j7 = c23421.f74589;
                            if (j6 == j7) {
                                throw C13863.m31554();
                            }
                            throw C13863.m31554();
                        }
                    }
                }
                String str14 = c17237M40096.f51288;
                if (!C8377.m19517(str14) || "target_not_mapped".equals(str14)) {
                    throw C13863.m31554();
                }
                if (z4) {
                    if (!"scan_space_exhausted".equals(str14)) {
                        throw C13863.m31554();
                    }
                } else if (!"result_limit_reached".equals(str14) && !"scan_budget_exhausted".equals(str14) && !"relocation_page_budget_exhausted".equals(str14)) {
                    throw C13863.m31554();
                }
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    C10533 c10533 = (C10533) it.next();
                    String str15 = c10533.f29149;
                    String str16 = c10533.f29147;
                    int i18 = c10533.f29152;
                    long j8 = c10533.f29151;
                    String str17 = c10533.f29153;
                    int iM9504 = C4498.m9504(str15);
                    long j9 = c10533.f29154;
                    if (j9 >= 0 && j8 >= 0 && i18 > 0) {
                        Iterator it2 = it;
                        String str18 = c10533.f29148;
                        if (str18 != null) {
                            C17237 c17237 = c17237M40096;
                            if (str18.length() <= 512 && (("instruction".equals(str17) || "data_relocation".equals(str17) || "data_pointer".equals(str17)) && iM9504 != 0 && (c23421.f74578 & iM9504) != 0 && ((!str12.equals(str7) || "instruction".equals(str17)) && ((!AbstractC0213e.f989m.equals(str7) || !"instruction".equals(str17)) && ((!"both".equals(str7) || i12 <= 0 || !"instruction".equals(str17)) && (((!"data_relocation".equals(str17) && !"data_pointer".equals(str17)) || iM9504 == 4) && str16 != null && (str16.length() & 1) == 0)))))) {
                                for (int i19 = 0; i19 < str16.length(); i19++) {
                                    char cCharAt = str16.charAt(i19);
                                    if ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'f')) {
                                    }
                                }
                                if (str16.length() == i18 * 2) {
                                    C5839 c5839 = c10533.f29150;
                                    if (c5839 != null) {
                                        long j10 = c5839.f14320;
                                        if (j10 >= 0) {
                                            long j11 = c5839.f14322;
                                            if (j11 >= -1) {
                                                long j12 = c5839.f14321;
                                                if (j12 >= 0) {
                                                    long j13 = c5839.f14323;
                                                    if (j13 > 0 && j12 < j13) {
                                                        long j14 = C14849.FOREVER_NS - j12;
                                                        if (j10 > j14 || j10 + j12 != j9 || ((j11 >= 0 && (j11 > j14 || j11 + j12 != j8)) || j10 > C14849.FOREVER_NS - j13)) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        throw C13863.m31554();
                                    }
                                    it = it2;
                                    c17237M40096 = c17237;
                                    c23421 = c23420;
                                    str12 = str12;
                                    i12 = i12;
                                    str7 = str7;
                                }
                            }
                        }
                    }
                    throw C13863.m31554();
                }
                C17237 c17238 = c17237M40096;
                String str19 = str7;
                int i20 = c13362M30503.f37507;
                if (AbstractC0213e.f989m.equals(str19)) {
                    strM30506 = "";
                    str4 = str3;
                } else {
                    str4 = str3;
                    strM30506 = c13362M30503.m30506(str4);
                }
                return new C20825(str4, true, c6211, str13, i15, i20, strM30506, AbstractC0213e.f989m.equals(str19) ? "" : c13362M30503.m30507(str4), c17238);
            } catch (IllegalArgumentException unused) {
                if (z) {
                    throw C5276.m11406("Invalid cursor", "nextCursor", jSONValue, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
                }
                throw C5276.m11406("Invalid native xref scan position", "nextCursor", (JSONValue) null, JSON.array(), JSON.object().add("nextCursor", "<cursor>"));
            } catch (RuntimeException unused2) {
                throw C5276.m11410("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
            }
        }
        str8 = c23420.f74585;
        str = str8;
        if (z) {
            strM30505 = c23420.f74594;
        } else {
            strM30505 = c13362M30503.m30505();
        }
        if (z) {
            iM30504 = c23420.f74593;
        } else {
            iM30504 = c13362M30503.m30504(str);
        }
        j = c23420.f74580;
        zEquals = "virtual".equals(str6);
        if (z) {
            str2 = str;
            j3 = c23420.f74598;
            if (zEquals) {
                j = j3;
            }
            C6211 c6211M17134 = m17130(c23506, str9, j, zEquals);
            C13863.m31570(c6211M17134);
            c2718 = new C2718(c6211M17134, j3);
        } else {
            str2 = str;
            c6211M17130 = m17130(c23506, str9, j, zEquals);
            C13863.m31570(c6211M17130);
            if (i4 != 40) {
                if (!zEquals) {
                    j = c6211M17130.f15637;
                }
                c2718 = new C2718(c6211M17130, j);
            } else {
                if (!zEquals) {
                    j = c6211M17130.f15637;
                }
                c2718 = new C2718(c6211M17130, j);
            }
        }
        c6211 = c2718.f4562;
        if (i4 == 40) {
            z2 = false;
        } else {
            z2 = false;
        }
        if (!c6211.f15635) {
            List list5 = Collections.EMPTY_LIST;
            C17237 c17237M39004 = C17237.m39002();
            int i21 = c13362M30503.f37507;
            if (AbstractC0213e.f989m.equals(str7)) {
                strM30509 = "";
                str5 = str2;
            } else {
                str5 = str2;
                strM30509 = c13362M30503.m30506(str5);
            }
            if (AbstractC0213e.f989m.equals(str7)) {
                strM305010 = "";
            } else {
                strM305010 = c13362M30503.m30507(str5);
            }
            return new C20825(str5, false, c6211, strM30505, iM30504, i21, strM30509, strM305010, c17237M39004);
        }
        str3 = str2;
        if (!c6211.f15636) {
            List list6 = Collections.EMPTY_LIST;
            C17237 c17237M39005 = C17237.m39002();
            int i22 = c13362M30503.f37507;
            if (AbstractC0213e.f989m.equals(str7)) {
                strM30507 = "";
            } else {
                strM30507 = c13362M30503.m30506(str3);
            }
            if (AbstractC0213e.f989m.equals(str7)) {
                strM30508 = "";
            } else {
                strM30508 = c13362M30503.m30507(str3);
            }
            return new C20825(str3, false, c6211, strM30505, iM30504, i22, strM30507, strM30508, c17237M39005);
        }
        j2 = c2718.f4563;
        if (j2 >= 0) {
            throw C13863.m31571();
        }
        String str110 = c9338.f25443;
        c23421 = c23420;
        String str111 = c23421.f74590;
        int i23 = c23421.f74595;
        int i24 = c23421.f74596;
        long j15 = c23421.f74589;
        int i25 = c23421.f74579;
        int i110 = c23421.f74582;
        int i111 = c23421.f74591;
        List list7 = c23421.f74583;
        c23506.getClass();
        C17237 c17237M40097 = C17609.m40096(str110, strM30505, iM30504, str111, j2, z2, i23, i24, j15, i25, i110, i111, list7);
        int i112 = c23421.f74595;
        String str112 = "code";
        if ("code".equals(str7)) {
            i = 1;
        } else if (AbstractC0213e.f989m.equals(str7)) {
            i = 2;
        } else {
            i = 3;
        }
        i2 = c17237M40097.f51296;
        List list8 = c17237M40097.f51290;
        int i113 = c17237M40097.f51291;
        long j16 = c17237M40097.f51292;
        int i114 = c17237M40097.f51293;
        int i115 = iM30504;
        boolean z5 = c17237M40097.f51289;
        String str113 = strM30505;
        int i116 = c17237M40097.f51294;
        if (i2 >= 0) {
        }
        throw C13863.m31554();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6211 m17130(InterfaceC5986 interfaceC5986, String str, long j, boolean z) throws C5276 {
        try {
            ((C23506) interfaceC5986).getClass();
            return C17609.m40093(str, j, z, false);
        } catch (RuntimeException unused) {
            throw C5276.m11410("NATIVE_ANALYZER_FAILED", "Native ELF analysis failed.");
        }
    }
}
