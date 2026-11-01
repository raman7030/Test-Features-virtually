package p067l;

import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۗ᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X785 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5749 {

    /* JADX INFO: renamed from: ֫ */
    public String f14097;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f14098 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f14099 = new ArrayList();

    /* JADX INFO: renamed from: ܿ */
    public String f14100;

    /* JADX INFO: renamed from: ᩳ */
    public String f14101;

    public C5749(String str) {
        C19831.m45078(str);
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
    /* JADX INFO: renamed from: ۧ */
    public static C5749 m12802(String str, String str2) {
        ArrayList arrayList;
        String strM12800;
        String strM12801;
        String strM12802;
        C5749 c5749 = new C5749(str);
        String[] strArrSplit = C10127.m23607(str2).split("\n", -1);
        int i = 0;
        C21843 c21843M49270 = null;
        C21843 c21843M49273 = null;
        while (true) {
            int length = strArrSplit.length;
            arrayList = c5749.f14099;
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            String strTrim = m12801(strArrSplit[i]).trim();
            if (c21843M49273 != null) {
                if (strTrim.equals(".end method")) {
                    c21843M49273.f68738 = i2;
                    c21843M49273 = null;
                }
            } else if (c21843M49270 == null) {
                if (m12800(strTrim, ".class") != null) {
                    c5749.f14097 = strTrim;
                } else {
                    strM12800 = m12800(strTrim, ".super");
                    if (strM12800 != null) {
                        c5749.f14100 = strM12800;
                    } else {
                        strM12801 = m12800(strTrim, ".source");
                        if (strM12801 != null) {
                            if (strM12801.length() >= 2 && strM12801.charAt(0) == '\"' && C9417.m21911(1, strM12801) == '\"') {
                                strM12801 = C11905.f33152.m30298(C17073.m38720(1, 1, strM12801));
                            }
                            c5749.f14101 = strM12801;
                        } else {
                            strM12802 = m12800(strTrim, ".implements");
                            if (strM12802 != null) {
                                c5749.f14098.add(strM12802);
                            } else if (m12800(strTrim, ".field") != null) {
                                c21843M49270 = C21843.m49270(i2, strTrim);
                                arrayList.add(c21843M49270);
                            } else if (m12800(strTrim, ".method") != null) {
                                c21843M49273 = C21843.m49273(i2, strTrim);
                                arrayList.add(c21843M49273);
                            }
                        }
                    }
                }
            } else if (strTrim.equals(".end field")) {
                c21843M49270.f68738 = i2;
                c21843M49270 = null;
            } else if (m12800(strTrim, ".class") != null || m12800(strTrim, ".super") != null || m12800(strTrim, ".source") != null || m12800(strTrim, ".implements") != null || m12800(strTrim, ".field") != null || m12800(strTrim, ".method") != null) {
                c21843M49270.f68738 = c21843M49270.f68735;
                c21843M49270 = null;
                if (m12800(strTrim, ".class") != null) {
                    c5749.f14097 = strTrim;
                } else {
                    strM12800 = m12800(strTrim, ".super");
                    if (strM12800 != null) {
                        c5749.f14100 = strM12800;
                    } else {
                        strM12801 = m12800(strTrim, ".source");
                        if (strM12801 != null) {
                            if (strM12801.length() >= 2) {
                                strM12801 = C11905.f33152.m30298(C17073.m38720(1, 1, strM12801));
                            }
                            c5749.f14101 = strM12801;
                        } else {
                            strM12802 = m12800(strTrim, ".implements");
                            if (strM12802 != null) {
                                c5749.f14098.add(strM12802);
                            } else if (m12800(strTrim, ".field") != null) {
                                c21843M49270 = C21843.m49270(i2, strTrim);
                                arrayList.add(c21843M49270);
                            } else if (m12800(strTrim, ".method") != null) {
                                c21843M49273 = C21843.m49273(i2, strTrim);
                                arrayList.add(c21843M49273);
                            }
                        }
                    }
                }
            }
            i = i2;
        }
        if (c21843M49270 != null) {
            c21843M49270.f68738 = c21843M49270.f68735;
        }
        if (c21843M49273 != null) {
            c21843M49273.f68738 = strArrSplit.length;
        }
        C8150.sort(arrayList, new C24513(2));
        return c5749;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m12800(String str, String str2) {
        if (str.startsWith(str2) && str.length() != str2.length() && Character.isWhitespace(str.charAt(str2.length()))) {
            return str.substring(str2.length()).trim();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m12801(String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public final C21843 m12803(String str) {
        for (C21843 c21843 : this.f14099) {
            if (AbstractC0213e.f995s.equals(c21843.f68740) && str.equals(c21843.f68741)) {
                return c21843;
            }
        }
        return null;
    }
}
