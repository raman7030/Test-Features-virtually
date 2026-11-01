package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1799 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12383 {

    /* JADX INFO: renamed from: ֫ */
    public final C22127 f34570;

    /* JADX INFO: renamed from: ۧ */
    public final C13480 f34571;

    /* JADX INFO: renamed from: ܽ */
    public final C17384 f34572;

    /* JADX INFO: renamed from: ֫ */
    public static void m28490() {
        C22127.m49919().m49920();
    }

    public C12383(C13480 c13480, C17384 c17384) {
        C22127 c22127M49919 = C22127.m49919();
        this.f34571 = c13480;
        this.f34572 = c17384;
        this.f34570 = c22127M49919;
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
    /* JADX INFO: renamed from: ֫ */
    public final C5007 m28495(C16484 c16484, C11319 c11319, C17502 c17502) {
        ?? c9700;
        ?? c7018;
        C19160 c19160;
        int i;
        C15064 c15064;
        C17502 c17503 = c17502;
        String str = c11319.f31517;
        String str2 = c11319.f31519;
        boolean zEquals = "dex_method".equals(str2);
        String str3 = c11319.f31512;
        String str4 = c11319.f31518;
        String str5 = c11319.f31514;
        C17384 c17384 = this.f34572;
        if (zEquals) {
            C22127 c22127 = this.f34570;
            c22127.m49920();
            if (!"exact".equals(str)) {
                c17384.getClass();
                if (C17384.m39567(str5)) {
                    c9700 = new C9700(str4, c22127);
                    Iterator it = c16484.f48424.iterator();
                    while (it.hasNext()) {
                        C9952 c9952M30627 = this.f34571.m30627(c16484, (C19160) it.next(), c17503);
                        c9700.m22644(c9952M30627.getType(), C8359.m19284(c9952M30627, str4));
                    }
                } else {
                    c9700 = new C9700(str4, c22127);
                    Iterator it2 = c17384.m39579(c16484, str5, c17503).iterator();
                    while (it2.hasNext()) {
                        C9952 c9952M39597 = c17384.m39597(c16484, str5, (C19160) it2.next(), c17503);
                        c9700.m22644(c9952M39597.getType(), C8359.m19284(c9952M39597, str4));
                    }
                }
            } else {
                C18102 c18102Mo42805 = c22127.mo42805(str3, str4);
                if (c18102Mo42805.f54043 == EnumC19444.FOUND) {
                    int i2 = c18102Mo42805.f54042.f35761 & 7;
                    c9700 = new C7018(str3, str4, i2 == 2 || i2 == 4);
                } else {
                    Iterator it3 = c17384.m39580(c16484, str5, false, c17503).iterator();
                    do {
                        if (!it3.hasNext()) {
                            c19160 = null;
                            break;
                        }
                        c19160 = (C19160) it3.next();
                    } while (!str3.equals(C16477.m37402(c19160.f57226)));
                    if (c19160 == null) {
                        c7018 = new C7018(str3, str4, false);
                    } else {
                        Iterator it4 = c17384.m39585(c16484, str5, c19160, c17503).getMethods().iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                InterfaceC19897 interfaceC19897 = (InterfaceC19897) it4.next();
                                if (C17075.m38724(interfaceC19897, str4)) {
                                    c7018 = new C7018(str3, str4, C9700.m22622(interfaceC19897));
                                    break;
                                }
                            } else {
                                c7018 = new C7018(str3, str4, false);
                                break;
                            }
                        }
                    }
                }
            }
            c7018 = c9700;
        } else {
            c7018 = new C7018("", "", false);
        }
        ?? r15 = c7018;
        boolean z = "dex_method".equals(str2) && r15.mo16148(str3, str4);
        ArrayList arrayList = new ArrayList();
        C5677 c5677 = new C5677();
        C14394 c14394M33010 = C14394.m33010(c11319);
        C15064 c15065 = new C15064(this);
        C4021 c4021 = c11319.f31515;
        ArrayList arrayListM39579 = c17384.m39579(c16484, str5, c17503);
        int i3 = c4021.f8789;
        int i4 = c4021.f8791;
        int i5 = i3;
        ?? r16 = r15;
        while (i5 < arrayListM39579.size()) {
            C9952 c9952M39598 = c17384.m39597(c16484, str5, (C19160) arrayListM39579.get(i5), c17503);
            int i6 = i5 == i3 ? i4 : 0;
            int i7 = 0;
            ?? r17 = r16;
            for (C18155 c18155 : c9952M39598.getMethods()) {
                int i8 = i7 + 1;
                if (i7 < i6) {
                    i = i5;
                    c15064 = c15065;
                } else {
                    int i9 = (i5 == i3 && i7 == i4) ? c4021.f8790 : 0;
                    int i10 = i7;
                    i = i5;
                    c15064 = c15065;
                    c15065.m34427(c11319, r17, arrayList, c18155, z, c5677, c14394M33010);
                    int iM41357 = c18155.m41357(i9, c15064);
                    C4021 c4022 = iM41357 >= 0 ? new C4021(i, i10, iM41357) : null;
                    if (c4022 != null) {
                        return new C5007(c16484.f48416, c11319.f31519, c11319.f31512, c11319.f31518, str, arrayList, c4022);
                    }
                }
                i5 = i;
                c15065 = c15064;
                i7 = i8;
                str5 = str5;
                i6 = i6;
                c17384 = c17384;
                i4 = i4;
                i3 = i3;
                arrayListM39579 = arrayListM39579;
                c4021 = c4021;
                r17 = r17;
            }
            i5++;
            c17503 = c17502;
            c17384 = c17384;
            r16 = r17;
        }
        return new C5007(c16484.f48416, c11319.f31519, c11319.f31512, c11319.f31518, str, arrayList, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m28493(C12383 c12383, C11319 c11319, InterfaceC10727 interfaceC10727, C18155 c18155, C14645 c14645, int i, EnumC3167 enumC3167, int i2, boolean z, C5677 c5677, C14394 c14394) {
        if (i2 != 3 || !enumC3167.f6089.startsWith("invoke-")) {
            return false;
        }
        AbstractC6086 abstractC6086M33504 = c14645.m33504();
        int iM33501 = c14645.m33501(i);
        int iM13856 = abstractC6086M33504.m13856(iM33501);
        String str = c11319.f31518;
        String str2 = c11319.f31517;
        String str3 = c11319.f31512;
        if ("exact".equals(str2)) {
            if (!c14645.m33493(iM13856, 0, str3.length(), str3) || !m28494(c14645, iM33501, str, c14394)) {
                return false;
            }
            m28492(c5677, enumC3167, c14645.m33487(iM13856), str, z);
            return true;
        }
        if (enumC3167.f6089.startsWith("invoke-polymorphic") || enumC3167.f6089.startsWith("invoke-static") || enumC3167.f6089.startsWith("invoke-direct") || enumC3167.f6089.startsWith("invoke-object-init")) {
            if (!c14645.m33493(iM13856, 0, str3.length(), str3) || !m28494(c14645, iM33501, str, c14394)) {
                return false;
            }
            m28492(c5677, enumC3167, c14645.m33487(iM13856), str, z);
            return true;
        }
        if (enumC3167.f6089.startsWith("invoke-super")) {
            if (!m28494(c14645, iM33501, str, c14394)) {
                return false;
            }
            String strM33487 = c14645.m33487(iM13856);
            boolean zEquals = str3.equals(strM33487);
            if (!"slot".equals(str2)) {
                EnumC11398 enumC11398Mo16147 = interfaceC10727.mo16147(c18155.f54220.getType(), strM33487, str3, str);
                if (enumC11398Mo16147 == EnumC11398.NONE) {
                    return false;
                }
                m28491(c5677, strM33487, str, "super_call", enumC11398Mo16147.f31791);
                return true;
            }
            if (zEquals) {
                m28491(c5677, strM33487, str, "super_call", "not_applicable");
                return true;
            }
            if (!interfaceC10727.mo16150(strM33487, str3, str)) {
                return false;
            }
            m28491(c5677, strM33487, str, "same_virtual_slot", "not_applicable");
            return true;
        }
        if (!enumC3167.f6089.startsWith("invoke-virtual") && !enumC3167.f6089.startsWith("invoke-interface")) {
            if (!c14645.m33493(iM13856, 0, str3.length(), str3) || !m28494(c14645, iM33501, str, c14394)) {
                return false;
            }
            m28492(c5677, enumC3167, c14645.m33487(iM13856), str, z);
            return true;
        }
        if (!m28494(c14645, iM33501, str, c14394)) {
            return false;
        }
        String strM33488 = c14645.m33487(iM13856);
        boolean zEquals2 = str3.equals(strM33488);
        if ("slot".equals(str2)) {
            if (!str.equals(str)) {
                return false;
            }
            if (zEquals2) {
                m28491(c5677, strM33488, str, "exact_reference", z ? "possible" : "not_applicable");
                return true;
            }
            if (!interfaceC10727.mo16150(strM33488, str3, str)) {
                return false;
            }
            m28491(c5677, strM33488, str, "same_virtual_slot", "not_applicable");
            return true;
        }
        if (!str.equals(str)) {
            return false;
        }
        if (zEquals2) {
            m28491(c5677, strM33488, str, "exact_reference", z ? "possible" : "not_applicable");
            return true;
        }
        if (z) {
            if (!interfaceC10727.mo16149(strM33488, str3, str)) {
                return false;
            }
            m28491(c5677, strM33488, str, "possible_virtual_dispatch", "possible");
            return true;
        }
        if (!interfaceC10727.mo16150(strM33488, str3, str)) {
            return false;
        }
        m28491(c5677, strM33488, str, "same_virtual_slot", "not_applicable");
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28492(C5677 c5677, EnumC3167 enumC3167, String str, String str2, boolean z) {
        if (enumC3167.f6089.startsWith("invoke-super")) {
            m28491(c5677, str, str2, "super_call", "not_applicable");
            return;
        }
        if (enumC3167.f6089.startsWith("invoke-virtual") || enumC3167.f6089.startsWith("invoke-interface")) {
            m28491(c5677, str, str2, "exact_reference", z ? "possible" : "not_applicable");
        } else if (enumC3167.f6089.startsWith("invoke-polymorphic")) {
            m28491(c5677, str, str2, "exact_reference", "not_applicable");
        } else {
            m28491(c5677, str, str2, "exact_reference", "exact");
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0082  */
    /* JADX INFO: renamed from: ֫ */
    public static boolean m28494(C14645 c14645, int i, String str, C14394 c14394) {
        int i2;
        AbstractC6086 abstractC6086M33504 = c14645.m33504();
        if (!c14645.m33478(abstractC6086M33504.mo13855(i + 4), 0, c14394.f41140, str)) {
            return false;
        }
        int iM13856 = abstractC6086M33504.m13856(i + 2);
        AbstractC6086 abstractC6086M33505 = c14645.m33504();
        int iM33485 = c14645.m33485(iM13856);
        int iMo13855 = abstractC6086M33505.mo13855(iM33485 + 8);
        int i3 = c14394.f41141;
        int i4 = c14394.f41139;
        int i5 = c14394.f41142;
        if (iMo13855 > 0) {
            int iMo13856 = abstractC6086M33505.mo13855(iMo13855);
            int i6 = iMo13855 + 4;
            int i7 = 0;
            while (i7 < iMo13856) {
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
                if (i8 >= 0 && c14645.m33493(abstractC6086M33505.m13856((i7 * 2) + i6), i3, i8 - i3, str)) {
                    i7++;
                    i3 = i8;
                }
            }
            if (i3 == i5) {
                return c14645.m33493(abstractC6086M33505.mo13855(iM33485 + 4), i4, str.length() - i4, str);
            }
        } else if (i3 == i5) {
            return c14645.m33493(abstractC6086M33505.mo13855(iM33485 + 4), i4, str.length() - i4, str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28491(C5677 c5677, String str, String str2, String str3, String str4) {
        c5677.f13836 = C24104.m53357(str, "->", str2);
        c5677.f13835 = str3;
        c5677.f13834 = str4;
    }
}
