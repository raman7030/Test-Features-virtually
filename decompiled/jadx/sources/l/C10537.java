package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1799 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10537 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20790 f31606;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11691 f31607;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15799 f31608;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26457() {
        C20790.m47591().m47592();
    }

    public C10537(C11691 c11691, C15799 c15799) {
        C20790 c20790M47591 = C20790.m47591();
        this.f31607 = c11691;
        this.f31608 = c15799;
        this.f31606 = c20790M47591;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [l.ۡۢۜ] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r2v12, types: [l.۬᩷ۜ] */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v28, types: [l.ۡۢۜ] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r7v2, types: [l.۟᩷ۜ] */
    /* JADX WARN: Type inference failed for: r7v3, types: [l.۟᩷ۜ] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6, types: [l.ۙ᩷ۜ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2776 m26462(C14852 c14852, C9418 c9418, C15923 c15923) {
        ?? c7714;
        ?? c4892;
        C17667 c17667;
        int i;
        C13358 c13358;
        C15923 c15924 = c15923;
        String str = c9418.f28570;
        String str2 = c9418.f28572;
        boolean zEquals = "dex_method".equals(str2);
        String str3 = c9418.f28565;
        String str4 = c9418.f28571;
        String str5 = c9418.f28567;
        C15799 c15799 = this.f31608;
        if (zEquals) {
            C20790 c20790 = this.f31606;
            c20790.m47592();
            if (!"exact".equals(str)) {
                c15799.getClass();
                if (C15799.m37396(str5)) {
                    c7714 = new C7714(str4, c20790);
                    Iterator it = c14852.f45308.iterator();
                    while (it.hasNext()) {
                        C7980 c7980M28579 = this.f31607.m28579(c14852, (C17667) it.next(), c15924);
                        c7714.m20664(c7980M28579.getType(), C6303.m17344(c7980M28579, str4));
                    }
                } else {
                    c7714 = new C7714(str4, c20790);
                    Iterator it2 = c15799.m37408(c14852, str5, c15924).iterator();
                    while (it2.hasNext()) {
                        C7980 c7980M37426 = c15799.m37426(c14852, str5, (C17667) it2.next(), c15924);
                        c7714.m20664(c7980M37426.getType(), C6303.m17344(c7980M37426, str4));
                    }
                }
            } else {
                C16555 c16555Mo40556 = c20790.mo40556(str3, str4);
                if (c16555Mo40556.f50865 == EnumC17967.FOUND) {
                    int i2 = c16555Mo40556.f50864.f32783 & 7;
                    c7714 = new C4892(str3, str4, i2 == 2 || i2 == 4);
                } else {
                    Iterator it3 = c15799.m37409(c14852, str5, false, c15924).iterator();
                    do {
                        if (!it3.hasNext()) {
                            c17667 = null;
                            break;
                        }
                        c17667 = (C17667) it3.next();
                    } while (!str3.equals(C14844.m35246(c17667.f54033)));
                    if (c17667 == null) {
                        c4892 = new C4892(str3, str4, false);
                    } else {
                        Iterator it4 = c15799.m37414(c14852, str5, c17667, c15924).getMethods().iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                InterfaceC18444 interfaceC18444 = (InterfaceC18444) it4.next();
                                if (C15474.m36565(interfaceC18444, str4)) {
                                    c4892 = new C4892(str3, str4, C7714.m20642(interfaceC18444));
                                    break;
                                }
                            } else {
                                c4892 = new C4892(str3, str4, false);
                                break;
                            }
                        }
                    }
                }
            }
            c4892 = c7714;
        } else {
            c4892 = new C4892("", "", false);
        }
        ?? r15 = c4892;
        boolean z = "dex_method".equals(str2) && r15.mo14251(str3, str4);
        ArrayList arrayList = new ArrayList();
        C3481 c3481 = new C3481();
        C12653 c12653M30932 = C12653.m30932(c9418);
        C13358 c13359 = new C13358(this);
        C1739 c1739 = c9418.f28568;
        ArrayList arrayListM37408 = c15799.m37408(c14852, str5, c15924);
        int i3 = c1739.f6012;
        int i4 = c1739.f6014;
        int i5 = i3;
        ?? r16 = r15;
        while (i5 < arrayListM37408.size()) {
            C7980 c7980M37427 = c15799.m37426(c14852, str5, (C17667) arrayListM37408.get(i5), c15924);
            int i6 = i5 == i3 ? i4 : 0;
            int i7 = 0;
            ?? r17 = r16;
            for (C16611 c16611 : c7980M37427.getMethods()) {
                int i8 = i7 + 1;
                if (i7 < i6) {
                    i = i5;
                    c13358 = c13359;
                } else {
                    int i9 = (i5 == i3 && i7 == i4) ? c1739.f6013 : 0;
                    int i10 = i7;
                    i = i5;
                    c13358 = c13359;
                    c13359.m32326(c9418, r17, arrayList, c16611, z, c3481, c12653M30932);
                    int iM39130 = c16611.m39130(i9, c13358);
                    C1739 c17310 = iM39130 >= 0 ? new C1739(i, i10, iM39130) : null;
                    if (c17310 != null) {
                        return new C2776(c14852.f45300, c9418.f28572, c9418.f28565, c9418.f28571, str, arrayList, c17310);
                    }
                }
                i5 = i;
                c13359 = c13358;
                i7 = i8;
                str5 = str5;
                i6 = i6;
                c15799 = c15799;
                i4 = i4;
                i3 = i3;
                arrayListM37408 = arrayListM37408;
                c1739 = c1739;
                r17 = r17;
            }
            i5++;
            c15924 = c15923;
            c15799 = c15799;
            r16 = r17;
        }
        return new C2776(c14852.f45300, c9418.f28572, c9418.f28565, c9418.f28571, str, arrayList, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m26460(C10537 c10537, C9418 c9418, InterfaceC8795 interfaceC8795, C16611 c16611, C12918 c12918, int i, EnumC0841 enumC0841, int i2, boolean z, C3481 c3481, C12653 c12653) {
        if (i2 != 3 || !enumC0841.f3315.startsWith("invoke-")) {
            return false;
        }
        AbstractC3912 abstractC3912M31418 = c12918.m31418();
        int iM31415 = c12918.m31415(i);
        int iM11936 = abstractC3912M31418.m11936(iM31415);
        String str = c9418.f28571;
        String str2 = c9418.f28570;
        String str3 = c9418.f28565;
        if ("exact".equals(str2)) {
            if (!c12918.m31407(iM11936, 0, str3.length(), str3) || !m26461(c12918, iM31415, str, c12653)) {
                return false;
            }
            m26459(c3481, enumC0841, c12918.m31401(iM11936), str, z);
            return true;
        }
        if (enumC0841.f3315.startsWith("invoke-polymorphic") || enumC0841.f3315.startsWith("invoke-static") || enumC0841.f3315.startsWith("invoke-direct") || enumC0841.f3315.startsWith("invoke-object-init")) {
            if (!c12918.m31407(iM11936, 0, str3.length(), str3) || !m26461(c12918, iM31415, str, c12653)) {
                return false;
            }
            m26459(c3481, enumC0841, c12918.m31401(iM11936), str, z);
            return true;
        }
        if (enumC0841.f3315.startsWith("invoke-super")) {
            if (!m26461(c12918, iM31415, str, c12653)) {
                return false;
            }
            String strM31401 = c12918.m31401(iM11936);
            boolean zEquals = str3.equals(strM31401);
            if (!"slot".equals(str2)) {
                EnumC9501 enumC9501Mo14250 = interfaceC8795.mo14250(c16611.f51043.getType(), strM31401, str3, str);
                if (enumC9501Mo14250 == EnumC9501.NONE) {
                    return false;
                }
                m26458(c3481, strM31401, str, "super_call", enumC9501Mo14250.f28843);
                return true;
            }
            if (zEquals) {
                m26458(c3481, strM31401, str, "super_call", "not_applicable");
                return true;
            }
            if (!interfaceC8795.mo14253(strM31401, str3, str)) {
                return false;
            }
            m26458(c3481, strM31401, str, "same_virtual_slot", "not_applicable");
            return true;
        }
        if (!enumC0841.f3315.startsWith("invoke-virtual") && !enumC0841.f3315.startsWith("invoke-interface")) {
            if (!c12918.m31407(iM11936, 0, str3.length(), str3) || !m26461(c12918, iM31415, str, c12653)) {
                return false;
            }
            m26459(c3481, enumC0841, c12918.m31401(iM11936), str, z);
            return true;
        }
        if (!m26461(c12918, iM31415, str, c12653)) {
            return false;
        }
        String strM31402 = c12918.m31401(iM11936);
        boolean zEquals2 = str3.equals(strM31402);
        if ("slot".equals(str2)) {
            if (!str.equals(str)) {
                return false;
            }
            if (zEquals2) {
                m26458(c3481, strM31402, str, "exact_reference", z ? "possible" : "not_applicable");
                return true;
            }
            if (!interfaceC8795.mo14253(strM31402, str3, str)) {
                return false;
            }
            m26458(c3481, strM31402, str, "same_virtual_slot", "not_applicable");
            return true;
        }
        if (!str.equals(str)) {
            return false;
        }
        if (zEquals2) {
            m26458(c3481, strM31402, str, "exact_reference", z ? "possible" : "not_applicable");
            return true;
        }
        if (z) {
            if (!interfaceC8795.mo14252(strM31402, str3, str)) {
                return false;
            }
            m26458(c3481, strM31402, str, "possible_virtual_dispatch", "possible");
            return true;
        }
        if (!interfaceC8795.mo14253(strM31402, str3, str)) {
            return false;
        }
        m26458(c3481, strM31402, str, "same_virtual_slot", "not_applicable");
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26459(C3481 c3481, EnumC0841 enumC0841, String str, String str2, boolean z) {
        if (enumC0841.f3315.startsWith("invoke-super")) {
            m26458(c3481, str, str2, "super_call", "not_applicable");
            return;
        }
        if (enumC0841.f3315.startsWith("invoke-virtual") || enumC0841.f3315.startsWith("invoke-interface")) {
            m26458(c3481, str, str2, "exact_reference", z ? "possible" : "not_applicable");
        } else if (enumC0841.f3315.startsWith("invoke-polymorphic")) {
            m26458(c3481, str, str2, "exact_reference", "not_applicable");
        } else {
            m26458(c3481, str, str2, "exact_reference", "exact");
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m26461(C12918 c12918, int i, String str, C12653 c12653) {
        int i2;
        AbstractC3912 abstractC3912M31418 = c12918.m31418();
        if (!c12918.m31392(abstractC3912M31418.mo11935(i + 4), 0, c12653.f38112, str)) {
            return false;
        }
        int iM11936 = abstractC3912M31418.m11936(i + 2);
        AbstractC3912 abstractC3912M31419 = c12918.m31418();
        int iM31399 = c12918.m31399(iM11936);
        int iMo11935 = abstractC3912M31419.mo11935(iM31399 + 8);
        int i3 = c12653.f38113;
        int i4 = c12653.f38111;
        int i5 = c12653.f38114;
        if (iMo11935 > 0) {
            int iMo11936 = abstractC3912M31419.mo11935(iMo11935);
            int i6 = iMo11935 + 4;
            int i7 = 0;
            while (i7 < iMo11936) {
                int i8 = -1;
                if (i3 < i5) {
                    int i9 = i3;
                    while (i9 < i5 && str.charAt(i9) == '[') {
                        i9++;
                    }
                    if (i9 < i5) {
                        if (str.charAt(i9) == 'L') {
                            int iIndexOf = str.indexOf(59, i9);
                            if (iIndexOf >= 0 && iIndexOf < i5) {
                                i2 = iIndexOf + 1;
                                i8 = i2;
                            }
                        } else {
                            i2 = i9 + 1;
                            if (i2 <= i5) {
                                i8 = i2;
                            }
                        }
                    }
                }
                if (i8 >= 0 && c12918.m31407(abstractC3912M31419.m11936((i7 * 2) + i6), i3, i8 - i3, str)) {
                    i7++;
                    i3 = i8;
                }
            }
            if (i3 == i5) {
                return c12918.m31407(abstractC3912M31419.mo11935(iM31399 + 4), i4, str.length() - i4, str);
            }
        } else if (i3 == i5) {
            return c12918.m31407(abstractC3912M31419.mo11935(iM31399 + 4), i4, str.length() - i4, str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26458(C3481 c3481, String str, String str2, String str3, String str4) {
        c3481.f11031 = C22870.m50967(str, "->", str2);
        c3481.f11030 = str3;
        c3481.f11029 = str4;
    }
}
