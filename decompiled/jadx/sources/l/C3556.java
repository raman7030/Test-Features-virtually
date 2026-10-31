package l;

import com.alipay.sdk.m.t.e;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X785 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3556 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f11291;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f11292 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f11293 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f11294;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f11295;

    public C3556(String str) {
        C18373.m42806(str);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00db A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3556 m10822(String str, String str2) {
        ArrayList arrayList;
        String strM10820;
        String strM10821;
        String strM10822;
        C3556 c3556 = new C3556(str);
        String[] strArrSplit = C8163.m21638(str2).split("\n", -1);
        int i = 0;
        C20490 c20490M46947 = null;
        C20490 c20490M46950 = null;
        while (true) {
            int length = strArrSplit.length;
            arrayList = c3556.f11293;
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            String strTrim = m10821(strArrSplit[i]).trim();
            if (c20490M46950 != null) {
                if (strTrim.equals(".end method")) {
                    c20490M46950.f66059 = i2;
                    c20490M46950 = null;
                }
            } else if (c20490M46947 == null) {
                if (m10820(strTrim, ".class") != null) {
                    c3556.f11291 = strTrim;
                } else {
                    strM10820 = m10820(strTrim, ".super");
                    if (strM10820 != null) {
                        c3556.f11294 = strM10820;
                    } else {
                        strM10821 = m10820(strTrim, ".source");
                        if (strM10821 != null) {
                            if (strM10821.length() >= 2 && strM10821.charAt(0) == '\"' && C7416.m19937(1, strM10821) == '\"') {
                                strM10821 = C10035.f30194.m28254(C15472.m36561(1, 1, strM10821));
                            }
                            c3556.f11295 = strM10821;
                        } else {
                            strM10822 = m10820(strTrim, ".implements");
                            if (strM10822 != null) {
                                c3556.f11292.add(strM10822);
                            } else if (m10820(strTrim, ".field") != null) {
                                c20490M46947 = C20490.m46947(i2, strTrim);
                                arrayList.add(c20490M46947);
                            } else if (m10820(strTrim, ".method") != null) {
                                c20490M46950 = C20490.m46950(i2, strTrim);
                                arrayList.add(c20490M46950);
                            }
                        }
                    }
                }
            } else if (strTrim.equals(".end field")) {
                c20490M46947.f66059 = i2;
                c20490M46947 = null;
            } else if (m10820(strTrim, ".class") != null || m10820(strTrim, ".super") != null || m10820(strTrim, ".source") != null || m10820(strTrim, ".implements") != null || m10820(strTrim, ".field") != null || m10820(strTrim, ".method") != null) {
                c20490M46947.f66059 = c20490M46947.f66056;
                c20490M46947 = null;
                if (m10820(strTrim, ".class") != null) {
                    c3556.f11291 = strTrim;
                } else {
                    strM10820 = m10820(strTrim, ".super");
                    if (strM10820 != null) {
                        c3556.f11294 = strM10820;
                    } else {
                        strM10821 = m10820(strTrim, ".source");
                        if (strM10821 != null) {
                            if (strM10821.length() >= 2) {
                                strM10821 = C10035.f30194.m28254(C15472.m36561(1, 1, strM10821));
                            }
                            c3556.f11295 = strM10821;
                        } else {
                            strM10822 = m10820(strTrim, ".implements");
                            if (strM10822 != null) {
                                c3556.f11292.add(strM10822);
                            } else if (m10820(strTrim, ".field") != null) {
                                c20490M46947 = C20490.m46947(i2, strTrim);
                                arrayList.add(c20490M46947);
                            } else if (m10820(strTrim, ".method") != null) {
                                c20490M46950 = C20490.m46950(i2, strTrim);
                                arrayList.add(c20490M46950);
                            }
                        }
                    }
                }
            }
            i = i2;
        }
        if (c20490M46947 != null) {
            c20490M46947.f66059 = c20490M46947.f66056;
        }
        if (c20490M46950 != null) {
            c20490M46950.f66059 = strArrSplit.length;
        }
        C6083.sort(arrayList, new C23300(2));
        return c3556;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m10820(String str, String str2) {
        if (str.startsWith(str2) && str.length() != str2.length() && Character.isWhitespace(str.charAt(str2.length()))) {
            return str.substring(str2.length()).trim();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m10821(String str) {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (z) {
                z = false;
            } else if (z2 || z3) {
                if (cCharAt == '\\') {
                    z = true;
                } else if (z2 && cCharAt == '\"') {
                    z2 = false;
                } else if (z3 && cCharAt == '\'') {
                    z3 = false;
                }
            } else if (cCharAt == '\"') {
                z2 = true;
            } else if (cCharAt == '\'') {
                z3 = true;
            } else if (cCharAt == '#') {
                return str.substring(0, i);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20490 m10823(String str) {
        for (C20490 c20490 : this.f11293) {
            if (e.s.equals(c20490.f66061) && str.equals(c20490.f66062)) {
                return c20490;
            }
        }
        return null;
    }
}
