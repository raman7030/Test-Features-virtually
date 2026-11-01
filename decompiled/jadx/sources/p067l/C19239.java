package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U75B */
/* JADX INFO: loaded from: classes4.dex */
public final class C19239 {
    /* JADX INFO: renamed from: ֫ */
    public static String m43813(C17897 c17897, int i, int i2) {
        StringBuilder sbM17248 = C7470.m17248("stretch:\n  x: ");
        ArrayList arrayList = c17897.f53475;
        C6644 c6644 = c17897.f53476;
        C6644 c6645 = c17897.f53474;
        m43818(sbM17248, arrayList);
        sbM17248.append("\n  y: ");
        m43818(sbM17248, c17897.f53473);
        sbM17248.append("\n\n");
        C6644 c6646 = c17897.f53471;
        if (c6646 == null) {
            sbM17248.append("content: auto");
        } else {
            sbM17248.append("content:\n  x: ");
            m43819(sbM17248, c6646);
            sbM17248.append("\n  y: ");
            m43819(sbM17248, c17897.f53472);
        }
        sbM17248.append("\n\n");
        if (c6645.f17145 == 0 && c6645.f17144 == i && c6644.f17145 == 0 && c6644.f17144 == i2) {
            sbM17248.append("optical: full");
        } else {
            sbM17248.append("optical:\n  x: ");
            m43819(sbM17248, c6645);
            sbM17248.append("\n  y: ");
            m43819(sbM17248, c6644);
        }
        return sbM17248.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX INFO: renamed from: ֫ */
    public static C17897 m43817(int i, int i2, String str) {
        int i3;
        C6644 c6644M43815;
        String[] strArr;
        byte b;
        if (str == null || i <= 0 || i2 <= 0) {
            throw m43811();
        }
        boolean[] zArr = new boolean[3];
        String[] strArrSplit = str.replace("\r\n", "\n").replace('\r', '\n').split("\n", -1);
        String str2 = null;
        int i4 = 0;
        byte b2 = -1;
        String str3 = null;
        boolean z = false;
        String str4 = null;
        String str5 = null;
        boolean z2 = false;
        String str6 = null;
        String str7 = null;
        while (i4 < strArrSplit.length) {
            String strTrim = strArrSplit[i4].trim();
            if (strTrim.isEmpty()) {
                strArr = strArrSplit;
            } else {
                int iIndexOf = strTrim.indexOf(58);
                if (iIndexOf <= 0) {
                    throw m43812(i4 + 1);
                }
                strArr = strArrSplit;
                String strTrim2 = strTrim.substring(0, iIndexOf).trim();
                String strTrim3 = strTrim.substring(iIndexOf + 1).trim();
                strTrim2.getClass();
                switch (strTrim2) {
                    case "stretch":
                        b = 0;
                        break;
                    case "optical":
                        b = 2;
                        break;
                    case "content":
                        b = 1;
                        break;
                    default:
                        b = -1;
                        break;
                }
                if (b != -1) {
                    if (zArr[b]) {
                        throw m43812(i4 + 1);
                    }
                    zArr[b] = true;
                    if (strTrim3.isEmpty()) {
                        b2 = b;
                    } else if (b == 1 && strTrim3.equals("auto")) {
                        b2 = -1;
                        z = true;
                    } else {
                        if (b != 2 || !strTrim3.equals("full")) {
                            throw m43812(i4 + 1);
                        }
                        b2 = -1;
                        z2 = true;
                    }
                } else {
                    if ((!strTrim2.equals("x") && !strTrim2.equals("y")) || strTrim3.isEmpty() || b2 == -1) {
                        throw m43812(i4 + 1);
                    }
                    boolean zEquals = strTrim2.equals("x");
                    int i5 = i4 + 1;
                    if (b2 == 0) {
                        if ((zEquals ? str2 : str3) != null) {
                            throw m43812(i5);
                        }
                        if (zEquals) {
                            str2 = strTrim3;
                        } else {
                            str3 = strTrim3;
                        }
                    } else if (b2 == 1) {
                        if ((zEquals ? str4 : str5) != null) {
                            throw m43812(i5);
                        }
                        if (zEquals) {
                            str4 = strTrim3;
                        } else {
                            str5 = strTrim3;
                        }
                    } else {
                        if ((zEquals ? str6 : str7) != null) {
                            throw m43812(i5);
                        }
                        if (zEquals) {
                            str6 = strTrim3;
                        } else {
                            str7 = strTrim3;
                        }
                    }
                }
            }
            i4++;
            strArrSplit = strArr;
        }
        if (zArr[0] && str2 != null && str3 != null && zArr[1] && ((z || (str4 != null && str5 != null)) && zArr[2] && (z2 || (str6 != null && str7 != null)))) {
            ArrayList arrayListM43820 = m43820(i, str2);
            ArrayList arrayListM43821 = m43820(i2, str3);
            C6644 c6644M43816 = z ? null : m43815(i, str4);
            C6644 c6644M43817 = z ? null : m43815(i2, str5);
            if (z2) {
                i3 = 0;
                c6644M43815 = new C6644(0, i);
            } else {
                i3 = 0;
                c6644M43815 = m43815(i, str6);
            }
            C6644 c6644 = c6644M43815;
            C6644 c6645 = z2 ? new C6644(i3, i2) : m43815(i2, str7);
            if (c6644M43816 != null && (c6644.f17145 > c6644M43816.f17145 || c6644.f17144 < c6644M43816.f17144 || c6645.f17145 > c6644M43817.f17145 || c6645.f17144 < c6644M43817.f17144)) {
                throw m43811();
            }
            if (arrayListM43820.size() * 2 > 127 || arrayListM43821.size() * 2 > 127) {
                throw m43811();
            }
            if (((long) m43810(arrayListM43820, i)) * ((long) m43810(arrayListM43821, i2)) <= 127) {
                return new C17897(arrayListM43820, arrayListM43821, c6644M43816, c6644M43817, c6644, c6645, i, i2);
            }
            throw m43811();
        }
        throw m43811();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43819(StringBuilder sb, C6644 c6644) {
        sb.append(c6644.f17145 + 1);
        sb.append('-');
        sb.append(c6644.f17144 + 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43818(StringBuilder sb, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            sb.append("none");
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            m43819(sb, (C6644) arrayList.get(i));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static ArrayList m43820(int i, String str) {
        if (str.equals("none")) {
            return new ArrayList();
        }
        String[] strArrSplit = str.split(",", -1);
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (str2.trim().isEmpty()) {
                throw m43811();
            }
            arrayList.add(m43815(i, str2));
        }
        return m43821(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6644 m43815(int i, String str) {
        int iIndexOf = str.indexOf(45);
        if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf(45)) {
            throw m43811();
        }
        int iM43809 = m43809(str.substring(0, iIndexOf).trim());
        int iM438010 = m43809(str.substring(iIndexOf + 1).trim());
        if (iM43809 < 1 || iM43809 >= iM438010 || iM438010 > i + 1) {
            throw m43811();
        }
        return new C6644(iM43809 - 1, iM438010 - 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m43809(String str) {
        if (str.isEmpty()) {
            throw m43811();
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                throw m43811();
            }
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw m43811();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static ArrayList m43821(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6644 c6644 = (C6644) it.next();
            arrayList.add(c6644 == null ? null : new C6644(c6644.f17145, c6644.f17144));
        }
        Collections.sort(arrayList);
        int i = 0;
        while (i < arrayList.size() - 1) {
            C6644 c6645 = (C6644) arrayList.get(i);
            int i2 = i + 1;
            C6644 c6646 = (C6644) arrayList.get(i2);
            int i3 = c6646.f17145;
            int i4 = c6645.f17144;
            if (i3 <= i4) {
                c6645.f17144 = Math.max(i4, c6646.f17144);
                arrayList.remove(i2);
            } else {
                i = i2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6644 m43816(C6644 c6644) {
        if (c6644 == null) {
            return null;
        }
        return new C6644(c6644.f17145, c6644.f17144);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m43810(ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        int size = arrayList.size() * 2;
        int i2 = size - 1;
        if (((C6644) arrayList.get(0)).f17145 <= 0) {
            size = i2;
        }
        return ((C6644) C20013.m45383(arrayList, 1)).f17144 < i ? size + 1 : size;
    }

    /* JADX INFO: renamed from: ֫ */
    public static IllegalArgumentException m43811() {
        return new IllegalArgumentException("Invalid nine-patch region text");
    }

    /* JADX INFO: renamed from: ֫ */
    public static IllegalArgumentException m43812(int i) {
        return new IllegalArgumentException(C20778.m46922(i, "Invalid nine-patch region text at line "));
    }
}
