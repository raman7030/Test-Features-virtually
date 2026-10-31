package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.json.JSONValue;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡ۡۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46X2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0306 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20177 f1670;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17760 f1671;

    public C0306(C17760 c17760) {
        C20177 c20177 = new C20177();
        this.f1671 = c17760;
        this.f1670 = c20177;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19358 m1698(String str, boolean z) throws C3059 {
        String str2;
        C17760 c17760 = this.f1671;
        String strM41605 = C17760.m41605(str, c17760.m41607(), MotionUtils.EASING_TYPE_PATH);
        C10000 c10000M41611 = c17760.m41611(strM41605);
        try {
            AbstractC15440 abstractC15440M41612 = c17760.m41612(strM41605);
            m1695(m1688(abstractC15440M41612), strM41605);
            String parent = abstractC15440M41612.getParent();
            if (!z) {
                C19358 c19358M1689 = m1689(strM41605, parent);
                c10000M41611.close();
                return c19358M1689;
            }
            C7383 c7383M41607 = c17760.m41607();
            do {
                c7383M41607.m19884(strM41605);
                str2 = c7383M41607.f22729;
                if (parent != null) {
                    c7383M41607.m19884(parent);
                }
                c7383M41607.m19882(strM41605);
                AbstractC15440 abstractC15440M41613 = c17760.m41612(strM41605);
                c17760.m41610(abstractC15440M41613, new C8774(strM41605, str2));
                m1695(m1688(abstractC15440M41613), strM41605);
                m1697(abstractC15440M41613, c7383M41607, strM41605);
                c7383M41607 = c17760.m41607();
            } while (!str2.equals(c7383M41607.f22729));
            c7383M41607.m19884(strM41605);
            if (parent != null) {
                c7383M41607.m19884(parent);
            }
            c7383M41607.m19882(strM41605);
            AbstractC15440 abstractC15440M41614 = c17760.m41612(strM41605);
            c17760.m41610(abstractC15440M41614, new C8774(strM41605, c7383M41607.f22729));
            m1695(m1688(abstractC15440M41614), strM41605);
            C19358 c19358M1690 = m1690(abstractC15440M41614, c7383M41607, strM41605);
            c10000M41611.close();
            return c19358M1690;
        } catch (Throwable th) {
            try {
                c10000M41611.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00df  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C19358 m1689(String str, String str2) throws C3059 {
        C17760 c17760;
        String str3;
        EnumC13324 enumC13324;
        C7383 c7383M41607;
        String str4;
        boolean z;
        C3059 c3059M1683;
        ?? r6;
        JSONArray jSONArray;
        do {
            c17760 = this.f1671;
            C7383 c7383M41608 = c17760.m41607();
            c7383M41608.m19884(str);
            str3 = c7383M41608.f22729;
            if (str2 != null) {
                c7383M41608.m19884(str2);
            }
            c7383M41608.m19882(str);
            AbstractC15440 abstractC15440M41612 = c17760.m41612(str);
            c17760.m41610(abstractC15440M41612, new C8774(str, str3));
            m1695(m1688(abstractC15440M41612), str);
            enumC13324 = EnumC13324.DELETE_EMPTY_DIRECTORY;
            m1687(abstractC15440M41612, enumC13324, str3, "delete_directory");
            c7383M41607 = c17760.m41607();
            str4 = c7383M41607.f22729;
        } while (!str3.equals(str4));
        AbstractC15440 abstractC15440M41613 = c17760.m41612(str);
        c17760.m41610(abstractC15440M41613, new C8774(str, str4));
        m1695(m1688(abstractC15440M41613), str);
        EnumC4858 enumC4858M1687 = m1687(abstractC15440M41613, enumC13324, str4, "delete_directory");
        String str5 = enumC4858M1687 == EnumC4858.ATOMIC ? "atomic" : "best_effort";
        JSONArray jSONArrayArray = JSON.array();
        try {
            abstractC15440M41613.mo23558().mo8677();
        } catch (C22497 e) {
            C3835 c3835M1686 = m1686(str, EnumC3447.DIRECTORY, enumC4858M1687);
            if (c3835M1686.f12250) {
                m1691(jSONArrayArray, "The backend reported an error after the directory disappeared.");
            } else {
                boolean z2 = c3835M1686.f12251;
                boolean z3 = c3835M1686.f12252;
                C3059 c3059M1685 = m1685(e);
                String str6 = c7383M41607.f22729;
                z = z3;
                c3059M1683 = m1683(c3059M1685, str, str6, str5, z2, z3, jSONArrayArray, 0, 0, str, "delete_directory", z);
                r6 = z2;
            }
            if (r6 == 0) {
                try {
                    this.f1670.getClass();
                    C18081.m42150();
                    C14463.m34559(str);
                    C16669.m39185();
                    jSONArray = jSONArrayArray;
                } catch (RuntimeException unused) {
                    jSONArray = jSONArrayArray;
                    m1691(jSONArray, "Directory change notification could not be completed.");
                }
            } else {
                this.f1670.getClass();
                C18081.m42150();
                C14463.m34559(str);
                C16669.m39185();
                jSONArray = jSONArrayArray;
            }
            if (c3059M1683 == null) {
                throw m1683(c3059M1683, str, c7383M41607.f22729, str5, r6, z, jSONArray, 0, 0, str, m1679(c3059M1683, "operation", "delete_directory"), z);
            }
            return new C19358(0, r6, new JSONArray(jSONArray), str);
        }
        c3059M1683 = null;
        r6 = 1;
        z = true;
        if (r6 == 0 || !z) {
            this.f1670.getClass();
            C18081.m42150();
            C14463.m34559(str);
            C16669.m39185();
        }
        jSONArray = jSONArrayArray;
        if (c3059M1683 == null) {
            throw m1683(c3059M1683, str, c7383M41607.f22729, str5, r6, z, jSONArray, 0, 0, str, m1679(c3059M1683, "operation", "delete_directory"), z);
        }
        return new C19358(0, r6, new JSONArray(jSONArray), str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m1697(AbstractC15440 abstractC15440, C7383 c7383, String str) throws C3059 {
        String str2 = c7383.f22729;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(new C2424(abstractC15440));
        while (!arrayDeque.isEmpty()) {
            C2424 c2424 = (C2424) arrayDeque.peek();
            boolean z = c2424.f7718;
            AbstractC15440 abstractC15441 = c2424.f7715;
            if (!z) {
                String strMo23554 = abstractC15441.mo23554();
                c7383.m19884(strMo23554);
                c7383.m19882(strMo23554);
                C12619 c12619M1688 = c2424.f7717;
                if (c12619M1688 == null) {
                    c12619M1688 = m1688(abstractC15441);
                }
                EnumC3447 enumC3447M30885 = c12619M1688.m30885();
                EnumC3447 enumC3447 = EnumC3447.MISSING;
                C17760 c17760 = this.f1671;
                if (enumC3447M30885 == enumC3447) {
                    if (strMo23554.equals(str)) {
                        c17760.getClass();
                        throw C17760.m41606(str);
                    }
                    arrayDeque.pop();
                } else {
                    if (c12619M1688.m30885() != EnumC3447.DIRECTORY) {
                        throw m1682(strMo23554, c12619M1688.m30885());
                    }
                    m1687(abstractC15441, EnumC13324.DELETE_EMPTY_DIRECTORY, str2, "preflight_delete_directory");
                    c17760.getClass();
                    try {
                        C2424.m7855(c2424, abstractC15441.mo23558().mo8668(c12619M1688), str, str2);
                    } catch (C22497 e) {
                        throw C17760.m41604(e);
                    }
                }
            } else if (c2424.f7716 >= c2424.f7714.size()) {
                arrayDeque.pop();
            } else {
                List list = c2424.f7714;
                int i = c2424.f7716;
                c2424.f7716 = i + 1;
                String strM1696 = m1696(c2424, (C12619) list.get(i), str, str2);
                c7383.m19884(strM1696);
                c7383.m19882(strM1696);
                C12619 c12619 = (C12619) c2424.f7714.get(c2424.f7716 - 1);
                AbstractC15440 abstractC15440M30882 = c12619.m30882();
                int i2 = C15828.f48907[c12619.m30885().ordinal()];
                if (i2 == 2) {
                    arrayDeque.push(new C2424(abstractC15440M30882, c12619, 0));
                } else if (i2 == 3 || i2 == 4) {
                    m1687(abstractC15440M30882, EnumC13324.DELETE_FILE_OR_LINK, str2, "preflight_delete_file");
                } else if (i2 == 5) {
                    throw m1682(strM1696, c12619.m30885());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0150  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r16v0, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r17v1, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r19v3, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r24v0, types: [l.֡ۡۜ] */
    /* JADX WARN: Type inference failed for: r7v0, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [bin.mt.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C19358 m1690(AbstractC15440 abstractC15440, C7383 c7383, String str) throws C3059 {
        C18652 c18652;
        boolean z;
        C18652 c18653;
        ?? r8;
        ?? r7;
        C3059 c3059M1683;
        C18652 c18654;
        ?? r12;
        ?? r11;
        ?? r9;
        ?? r10;
        ?? r13;
        ?? r14;
        ?? r15 = str;
        ?? Array = JSON.array();
        C18652 c18655 = new C18652();
        int i = 1;
        c18655.f58963 = true;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(new C2424(abstractC15440));
        while (!arrayDeque.isEmpty()) {
            try {
                C2424 c2424 = (C2424) arrayDeque.peek();
                if (!c2424.f7718) {
                    try {
                        m1694(c2424, r15, c7383, c18655);
                        if (!c2424.f7718) {
                            arrayDeque.pop();
                        }
                    } catch (C3059 e) {
                        e = e;
                        ?? r23 = r15;
                        r15 = Array;
                        Array = r23;
                        c18652 = c18655;
                        z = true;
                        String str2 = c7383.f22729;
                        if (c18652.f58964 == null) {
                            c18652.f58964 = m1679(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                            c18652.f58966 = m1679(e, "operation", "delete_tree");
                            c18652.f58963 = z;
                            c18652.f58965 = false;
                        }
                        c18653 = c18652;
                        c3059M1683 = m1683(e, str, str2, "non_atomic", C18652.m43255(c18652), c18652.f58963, r15, c18652.f58962, c18652.f58961, c18652.f58964, c18652.f58966, c18652.f58965);
                        r7 = Array;
                        r8 = r15;
                        if (C18652.m43255(c18653)) {
                            try {
                                this.f1670.getClass();
                                C18081.m42150();
                                C14463.m34559(str);
                                C16669.m39185();
                            } catch (RuntimeException unused) {
                                m1691((JSONArray) r8, "Directory change notification could not be completed.");
                            }
                        }
                        if (c3059M1683 == null) {
                            C18652 c18656 = c18653;
                            throw m1683(c3059M1683, str, c7383.f22729, "non_atomic", C18652.m43255(c18656), c18656.f58963, r8, c18656.f58962, c18656.f58961, c18656.f58964, c18656.f58966, c18656.f58965);
                        }
                        C18652 c18657 = c18653;
                        return new C19358(c18657.f58962, c18657.f58961, new JSONArray((JSONArray) r8), r7);
                    }
                } else {
                    if (c2424.f7716 < c2424.f7714.size()) {
                        List list = c2424.f7714;
                        int i2 = c2424.f7716;
                        c2424.f7716 = i2 + 1;
                        String strM1696 = m1696(c2424, (C12619) list.get(i2), r15, c7383.f22729);
                        c7383.m19884(strM1696);
                        c7383.m19882(strM1696);
                        AbstractC15440 abstractC15440M30882 = ((C12619) c2424.f7714.get(c2424.f7716 - i)).m30882();
                        try {
                            C12619 c12619M1688 = m1688(abstractC15440M30882);
                            int i3 = C15828.f48907[c12619M1688.m30885().ordinal()];
                            if (i3 == 2) {
                                c18654 = c18655;
                                r13 = Array;
                                r14 = r15;
                                arrayDeque.push(new C2424(abstractC15440M30882));
                            } else if (i3 == 3 || i3 == 4) {
                                try {
                                    c18654 = c18655;
                                    r12 = Array;
                                    r11 = r15;
                                    try {
                                        m1692(str, strM1696, abstractC15440M30882, c12619M1688.m30885(), c7383, c18654, r12);
                                        r14 = r11;
                                        r13 = r12;
                                    } catch (C3059 e2) {
                                        e = e2;
                                        Array = r11;
                                        r15 = r12;
                                        c18655 = c18654;
                                        c18652 = c18655;
                                        z = true;
                                        String str3 = c7383.f22729;
                                        if (c18652.f58964 == null) {
                                            c18652.f58964 = m1679(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                                            c18652.f58966 = m1679(e, "operation", "delete_tree");
                                            c18652.f58963 = z;
                                            c18652.f58965 = false;
                                        }
                                        c18653 = c18652;
                                        c3059M1683 = m1683(e, str, str3, "non_atomic", C18652.m43255(c18652), c18652.f58963, r15, c18652.f58962, c18652.f58961, c18652.f58964, c18652.f58966, c18652.f58965);
                                        r7 = Array;
                                        r8 = r15;
                                        if (C18652.m43255(c18653)) {
                                            this.f1670.getClass();
                                            C18081.m42150();
                                            C14463.m34559(str);
                                            C16669.m39185();
                                        }
                                        if (c3059M1683 == null) {
                                            C18652 c18658 = c18653;
                                            throw m1683(c3059M1683, str, c7383.f22729, "non_atomic", C18652.m43255(c18658), c18658.f58963, r8, c18658.f58962, c18658.f58961, c18658.f58964, c18658.f58966, c18658.f58965);
                                        }
                                        C18652 c18659 = c18653;
                                        return new C19358(c18659.f58962, c18659.f58961, new JSONArray((JSONArray) r8), r7);
                                    }
                                } catch (C3059 e3) {
                                    e = e3;
                                    c18654 = c18655;
                                    r12 = Array;
                                    r11 = r15;
                                    Array = r11;
                                    r15 = r12;
                                    c18655 = c18654;
                                    c18652 = c18655;
                                    z = true;
                                    String str4 = c7383.f22729;
                                    if (c18652.f58964 == null) {
                                        c18652.f58964 = m1679(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                                        c18652.f58966 = m1679(e, "operation", "delete_tree");
                                        c18652.f58963 = z;
                                        c18652.f58965 = false;
                                    }
                                    c18653 = c18652;
                                    c3059M1683 = m1683(e, str, str4, "non_atomic", C18652.m43255(c18652), c18652.f58963, r15, c18652.f58962, c18652.f58961, c18652.f58964, c18652.f58966, c18652.f58965);
                                    r7 = Array;
                                    r8 = r15;
                                    if (C18652.m43255(c18653)) {
                                        this.f1670.getClass();
                                        C18081.m42150();
                                        C14463.m34559(str);
                                        C16669.m39185();
                                    }
                                    if (c3059M1683 == null) {
                                        C18652 c186510 = c18653;
                                        throw m1683(c3059M1683, str, c7383.f22729, "non_atomic", C18652.m43255(c186510), c186510.f58963, r8, c186510.f58962, c186510.f58961, c186510.f58964, c186510.f58966, c186510.f58965);
                                    }
                                    C18652 c186511 = c18653;
                                    return new C19358(c186511.f58962, c186511.f58961, new JSONArray((JSONArray) r8), r7);
                                }
                            } else {
                                if (i3 == 5) {
                                    throw m1684(m1682(strM1696, c12619M1688.m30885()), str, c7383.f22729, c18655, strM1696, "delete_file", true, false, (JSONArray) Array, false);
                                }
                                c18652 = c18655;
                                r11 = 1;
                                ?? r24 = r15;
                                r9 = Array;
                                r10 = r24;
                                r12 = r12;
                            }
                            r10 = r14;
                            r9 = r13;
                            c18652 = c18654;
                            r11 = 1;
                            r12 = r13;
                        } catch (C3059 e4) {
                            c18654 = c18655;
                            r12 = Array;
                            r11 = r15;
                            Array = r11;
                            r15 = r12;
                            c18655 = c18654;
                            throw m1684(e4, str, c7383.f22729, c18655, strM1696, "stat_entry", !C18652.m43255(c18654), true, (JSONArray) r15, false);
                        }
                    } else {
                        try {
                            ?? r25 = r15;
                            r15 = Array;
                            Array = r25;
                            z = true;
                            r11 = 1;
                            c18652 = c18655;
                            try {
                                m1693(str, c2424.f7715, c7383, c18655, r15);
                                arrayDeque.pop();
                                r10 = Array;
                                r9 = r15;
                                r12 = r12;
                            } catch (C3059 e5) {
                                e = e5;
                                String str5 = c7383.f22729;
                                if (c18652.f58964 == null) {
                                    c18652.f58964 = m1679(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                                    c18652.f58966 = m1679(e, "operation", "delete_tree");
                                    c18652.f58963 = z;
                                    c18652.f58965 = false;
                                }
                                c18653 = c18652;
                                c3059M1683 = m1683(e, str, str5, "non_atomic", C18652.m43255(c18652), c18652.f58963, r15, c18652.f58962, c18652.f58961, c18652.f58964, c18652.f58966, c18652.f58965);
                                r7 = Array;
                                r8 = r15;
                                if (C18652.m43255(c18653)) {
                                    this.f1670.getClass();
                                    C18081.m42150();
                                    C14463.m34559(str);
                                    C16669.m39185();
                                }
                                if (c3059M1683 == null) {
                                    C18652 c186512 = c18653;
                                    throw m1683(c3059M1683, str, c7383.f22729, "non_atomic", C18652.m43255(c186512), c186512.f58963, r8, c186512.f58962, c186512.f58961, c186512.f58964, c186512.f58966, c186512.f58965);
                                }
                                C18652 c186513 = c18653;
                                return new C19358(c186513.f58962, c186513.f58961, new JSONArray((JSONArray) r8), r7);
                            }
                        } catch (C3059 e6) {
                            e = e6;
                            c18652 = c18655;
                            z = true;
                            String str6 = c7383.f22729;
                            if (c18652.f58964 == null) {
                                c18652.f58964 = m1679(e, MotionUtils.EASING_TYPE_PATH, (String) Array);
                                c18652.f58966 = m1679(e, "operation", "delete_tree");
                                c18652.f58963 = z;
                                c18652.f58965 = false;
                            }
                            c18653 = c18652;
                            c3059M1683 = m1683(e, str, str6, "non_atomic", C18652.m43255(c18652), c18652.f58963, r15, c18652.f58962, c18652.f58961, c18652.f58964, c18652.f58966, c18652.f58965);
                            r7 = Array;
                            r8 = r15;
                            if (C18652.m43255(c18653)) {
                                this.f1670.getClass();
                                C18081.m42150();
                                C14463.m34559(str);
                                C16669.m39185();
                            }
                            if (c3059M1683 == null) {
                                C18652 c186514 = c18653;
                                throw m1683(c3059M1683, str, c7383.f22729, "non_atomic", C18652.m43255(c186514), c186514.f58963, r8, c186514.f58962, c186514.f58961, c186514.f58964, c186514.f58966, c186514.f58965);
                            }
                            C18652 c186515 = c18653;
                            return new C19358(c186515.f58962, c186515.f58961, new JSONArray((JSONArray) r8), r7);
                        }
                    }
                    c18655 = c18652;
                    i = 1;
                    ?? r26 = r9;
                    r15 = r10;
                    Array = r26;
                }
            } catch (C3059 e7) {
                e = e7;
                c18652 = c18655;
                z = true;
                ?? r27 = r15;
                r15 = Array;
                Array = r27;
            }
        }
        ?? r28 = r15;
        r8 = Array;
        r7 = r28;
        c3059M1683 = null;
        c18653 = c18655;
        if (C18652.m43255(c18653)) {
            this.f1670.getClass();
            C18081.m42150();
            C14463.m34559(str);
            C16669.m39185();
        }
        if (c3059M1683 == null) {
            C18652 c186516 = c18653;
            throw m1683(c3059M1683, str, c7383.f22729, "non_atomic", C18652.m43255(c186516), c186516.f58963, r8, c186516.f58962, c186516.f58961, c186516.f58964, c186516.f58966, c186516.f58965);
        }
        C18652 c186517 = c18653;
        return new C19358(c186517.f58962, c186517.f58961, new JSONArray((JSONArray) r8), r7);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m1694(C2424 c2424, String str, C7383 c7383, C18652 c18652) throws C3059 {
        AbstractC15440 abstractC15440 = c2424.f7715;
        String strMo23554 = abstractC15440.mo23554();
        c7383.m19884(strMo23554);
        String str2 = c7383.f22729;
        c7383.m19882(strMo23554);
        try {
            C12619 c12619M1688 = m1688(abstractC15440);
            EnumC3447 enumC3447M30885 = c12619M1688.m30885();
            EnumC3447 enumC3447 = EnumC3447.MISSING;
            C17760 c17760 = this.f1671;
            if (enumC3447M30885 == enumC3447) {
                if (strMo23554.equals(str) && c18652.f58961 == 0 && c18652.f58962 == 0) {
                    c17760.getClass();
                    throw C17760.m41606(str);
                }
                return;
            }
            if (c12619M1688.m30885() != EnumC3447.DIRECTORY) {
                throw m1684(m1682(strMo23554, c12619M1688.m30885()), str, c7383.f22729, c18652, strMo23554, "stat_directory", true, false, JSON.array(), false);
            }
            m1687(abstractC15440, EnumC13324.DELETE_EMPTY_DIRECTORY, str2, "delete_directory");
            try {
                c17760.getClass();
                try {
                    C2424.m7855(c2424, abstractC15440.mo23558().mo8678(), str, str2);
                } catch (C22497 e) {
                    throw C17760.m41604(e);
                }
            } catch (C3059 e2) {
                throw m1684(e2, str, c7383.f22729, c18652, strMo23554, "list_directory", !C18652.m43255(c18652), true, JSON.array(), false);
            }
        } catch (C3059 e3) {
            throw m1684(e3, str, c7383.f22729, c18652, strMo23554, "stat_directory", !C18652.m43255(c18652), true, JSON.array(), false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m1692(String str, String str2, AbstractC15440 abstractC15440, EnumC3447 enumC3447, C7383 c7383, C18652 c18652, JSONArray jSONArray) throws C3059 {
        EnumC4858 enumC4858M1687 = m1687(abstractC15440, EnumC13324.DELETE_FILE_OR_LINK, c7383.f22729, "delete_file");
        try {
            abstractC15440.mo23558().mo8676();
            c18652.f58962++;
        } catch (C22497 e) {
            C3835 c3835M1686 = m1686(str2, enumC3447, enumC4858M1687);
            if (c3835M1686.f12250) {
                c18652.f58962++;
                m1691(jSONArray, "The backend reported an error after a file or link disappeared.");
            } else {
                C3059 c3059M1685 = m1685(e);
                String str3 = c7383.f22729;
                boolean z = c3835M1686.f12252;
                throw m1684(c3059M1685, str, str3, c18652, str2, "delete_file", z, z, jSONArray, c3835M1686.f12251);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m1693(String str, AbstractC15440 abstractC15440, C7383 c7383, C18652 c18652, JSONArray jSONArray) throws C3059 {
        String strMo23554 = abstractC15440.mo23554();
        try {
            C12619 c12619M1688 = m1688(abstractC15440);
            if (c12619M1688.m30885() == EnumC3447.MISSING) {
                return;
            }
            if (c12619M1688.m30885() != EnumC3447.DIRECTORY) {
                throw m1684(m1682(strMo23554, c12619M1688.m30885()), str, c7383.f22729, c18652, strMo23554, "delete_directory", true, false, jSONArray, false);
            }
            EnumC4858 enumC4858M1687 = m1687(abstractC15440, EnumC13324.DELETE_EMPTY_DIRECTORY, c7383.f22729, "delete_directory");
            try {
                abstractC15440.mo23558().mo8677();
                c18652.f58961++;
            } catch (C22497 e) {
                C3835 c3835M1686 = m1686(strMo23554, EnumC3447.DIRECTORY, enumC4858M1687);
                if (c3835M1686.f12250) {
                    c18652.f58961++;
                    m1691(jSONArray, "The backend reported an error after a directory disappeared.");
                } else {
                    C3059 c3059M1685 = m1685(e);
                    String str2 = c7383.f22729;
                    boolean z = c3835M1686.f12252;
                    throw m1684(c3059M1685, str, str2, c18652, strMo23554, "delete_directory", z, z, jSONArray, c3835M1686.f12251);
                }
            }
        } catch (C3059 e2) {
            throw m1684(e2, str, c7383.f22729, c18652, strMo23554, "stat_directory", !C18652.m43255(c18652), true, jSONArray, false);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12619 m1688(AbstractC15440 abstractC15440) throws C3059 {
        try {
            return abstractC15440.mo23558().mo8672();
        } catch (C22497 e) {
            this.f1671.getClass();
            throw C17760.m41604(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C3835 m1686(String str, EnumC3447 enumC3447, EnumC4858 enumC4858) {
        C12619 c12619Mo8672;
        try {
            c12619Mo8672 = this.f1671.m41612(str).mo23558().mo8672();
        } catch (RuntimeException | C22497 unused) {
            c12619Mo8672 = null;
        }
        if (c12619Mo8672 != null && c12619Mo8672.m30885() == EnumC3447.MISSING) {
            return new C3835(true, true, true);
        }
        if (c12619Mo8672 != null && c12619Mo8672.m30885() == enumC3447) {
            return new C3835(false, true, false);
        }
        boolean z = enumC4858 == EnumC4858.ATOMIC;
        return new C3835(false, z, !z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m1695(C12619 c12619, String str) throws C3059 {
        int i = C15828.f48907[c12619.m30885().ordinal()];
        C17760 c17760 = this.f1671;
        if (i == 1) {
            c17760.getClass();
            throw C17760.m41606(str);
        }
        if (i == 3) {
            throw C20382.m46697(c12619, c17760, "FILE_NOT_DIRECTORY", "The requested delete root is not a directory.", str);
        }
        if (i == 4) {
            throw C20382.m46697(c12619, c17760, "FILE_IS_SYMLINK", "Symbolic links are not accepted as directory delete roots.", str);
        }
        if (i == 5) {
            throw C20382.m46697(c12619, c17760, "FILE_UNSUPPORTED_TYPE", "Special nodes cannot be deleted by general directory tools.", str);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C3059 m1682(String str, EnumC3447 enumC3447) {
        EnumC3447 enumC3448 = EnumC3447.LINK;
        C17760 c17760 = this.f1671;
        if (enumC3447 == enumC3448) {
            c17760.getClass();
            return C17760.m41603("FILE_IS_SYMLINK", "A directory changed into a symbolic link during deletion.", str, enumC3447);
        }
        if (enumC3447 == EnumC3447.OTHER) {
            c17760.getClass();
            return C17760.m41603("FILE_UNSUPPORTED_TYPE", "The directory tree contains an unsupported special node.", str, enumC3447);
        }
        c17760.getClass();
        return C17760.m41603("FILE_NOT_DIRECTORY", "A directory changed type during deletion.", str, enumC3447);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC4858 m1687(AbstractC15440 abstractC15440, EnumC13324 enumC13324, String str, String str2) throws C3059 {
        EnumC4858 enumC4858Mo8669 = abstractC15440.mo23558().mo8669(enumC13324);
        if (enumC4858Mo8669 != EnumC4858.UNSUPPORTED) {
            return enumC4858Mo8669;
        }
        throw m1681("FILE_BACKEND_UNSUPPORTED", "The file backend does not support the required checked delete operation.", abstractC15440.mo23554(), str, str2, "unsupported", (String) null, JSON.array(), abstractC15440.mo23554(), str2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m1696(C2424 c2424, C12619 c12619, String str, String str2) throws C3059 {
        String strMo23554 = c12619.m30882().mo23554();
        try {
            if (C12301.m29847(strMo23554, MotionUtils.EASING_TYPE_PATH).equals(strMo23554)) {
                String strSubstring = "/";
                if ("/".equals(strMo23554)) {
                    strSubstring = null;
                } else {
                    int iLastIndexOf = strMo23554.lastIndexOf(47);
                    if (iLastIndexOf != 0) {
                        strSubstring = strMo23554.substring(0, iLastIndexOf);
                    }
                }
                if (C11003.equals(strSubstring, c2424.f7715.mo23554()) && C12301.m29846(strMo23554, str)) {
                    return strMo23554;
                }
            }
            throw m1681("FILE_STORAGE_ERROR", "The backend returned an invalid directory child identity.", str, str2, "list_directory", "invalid_child_path", "non_atomic", JSON.array(), strMo23554, "list_directory");
        } catch (C3059 unused) {
            throw m1681("FILE_STORAGE_ERROR", "The backend returned an invalid directory child identity.", str, str2, "list_directory", "invalid_child_path", "non_atomic", JSON.array(), strMo23554, "list_directory");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C3059 m1685(C22497 c22497) {
        this.f1671.getClass();
        C3059 c3059M41604 = C17760.m41604(c22497);
        return c22497.m50458() != EnumC21792.IO_ERROR ? c3059M41604 : C3059.m9365("FILE_DIRECTORY_DELETE_FAILED", "Failed to permanently delete a directory tree node.", "warning", (JSONArray) null, new JSONObject(c3059M41604.f9609));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m1684(C3059 c3059, String str, String str2, C18652 c18652, String str3, String str4, boolean z, boolean z2, JSONArray jSONArray, boolean z3) {
        c18652.f58964 = str3;
        c18652.f58966 = str4;
        c18652.f58963 = z;
        c18652.f58965 = z2;
        c18652.f58967 |= z3;
        return m1683(c3059, str, str2, "non_atomic", C18652.m43255(c18652), z, jSONArray, c18652.f58962, c18652.f58961, str3, str4, z2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m1683(C3059 c3059, String str, String str2, String str3, boolean z, boolean z2, JSONArray jSONArray, int i, int i2, String str4, String str5, boolean z3) {
        JSONObject jSONObject = c3059.f9609;
        JSONArray jSONArray2 = c3059.f9604;
        JSONObject jSONObject2 = new JSONObject(jSONObject);
        jSONObject2.put(MotionUtils.EASING_TYPE_PATH, str);
        jSONObject2.put("policyRevision", str2);
        jSONObject2.put("changed", z);
        jSONObject2.put("operationMode", JSON.value(str3));
        jSONObject2.put("stateKnown", z2);
        jSONObject2.put("warnings", new JSONArray(jSONArray));
        jSONObject2.put("deletedFiles", i);
        jSONObject2.put("deletedDirectories", i2);
        jSONObject2.put("failedPath", str4 == null ? JSON.NULL : JSON.value(str4));
        jSONObject2.put("failureStage", str5 == null ? JSON.NULL : JSON.value(str5));
        jSONObject2.put("safeToRetry", z3);
        boolean z4 = "non_atomic".equals(str3) && (i > 0 || i2 > 0 || z);
        String str6 = z4 ? "FILE_DIRECTORY_DELETE_PARTIAL" : c3059.f9610;
        if (c3059.f9607 || z4) {
            return C3059.m9365(str6, c3059.getMessage(), "warning", jSONArray2, jSONObject2);
        }
        return C3059.m9369(str6, c3059.getMessage(), c3059.f9611, jSONArray2, jSONObject2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m1681(String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONArray jSONArray, String str8, String str9) {
        JSONObject jSONObjectAdd = C7416.m19939(MotionUtils.EASING_TYPE_PATH, str3, "policyRevision", str4).add("operation", str5).add("backendReason", str6).add("changed", false).add("operationMode", str7 == null ? JSON.NULL : JSON.value(str7)).add("stateKnown", true).add("warnings", new JSONArray(jSONArray)).add("deletedFiles", 0).add("deletedDirectories", 0).add("failedPath", str8 == null ? JSON.NULL : JSON.value(str8)).add("failureStage", JSON.value(str9)).add("safeToRetry", false);
        return ("FILE_STORAGE_ERROR".equals(str) || "FILE_DIRECTORY_DELETE_FAILED".equals(str) || "FILE_OPERATION_STATE_UNKNOWN".equals(str)) ? C3059.m9365(str, str2, "warning", (JSONArray) null, jSONObjectAdd) : C3059.m9369(str, str2, "fatal", null, jSONObjectAdd);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m1679(C3059 c3059, String str, String str2) {
        JSONValue jSONValue = c3059.f9609.get(str);
        return (jSONValue == null || !jSONValue.isString()) ? str2 : jSONValue.asString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1691(JSONArray jSONArray, String str) {
        Iterator it = jSONArray.iterator();
        while (it.hasNext()) {
            JSONValue jSONValue = (JSONValue) it.next();
            if (jSONValue.isString() && str.equals(jSONValue.asString())) {
                return;
            }
        }
        jSONArray.add(str);
    }
}
