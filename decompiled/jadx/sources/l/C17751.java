package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U75B */
/* JADX INFO: loaded from: classes4.dex */
public final class C17751 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m41568(C16339 c16339, int i, int i2) {
        StringBuilder sbM15339 = C5368.m15339("stretch:\n  x: ");
        ArrayList arrayList = c16339.f50302;
        C4499 c4499 = c16339.f50303;
        C4499 c44910 = c16339.f50301;
        m41573(sbM15339, arrayList);
        sbM15339.append("\n  y: ");
        m41573(sbM15339, c16339.f50300);
        sbM15339.append("\n\n");
        C4499 c44911 = c16339.f50298;
        if (c44911 == null) {
            sbM15339.append("content: auto");
        } else {
            sbM15339.append("content:\n  x: ");
            m41574(sbM15339, c44911);
            sbM15339.append("\n  y: ");
            m41574(sbM15339, c16339.f50299);
        }
        sbM15339.append("\n\n");
        if (c44910.f14318 == 0 && c44910.f14317 == i && c4499.f14318 == 0 && c4499.f14317 == i2) {
            sbM15339.append("optical: full");
        } else {
            sbM15339.append("optical:\n  x: ");
            m41574(sbM15339, c44910);
            sbM15339.append("\n  y: ");
            m41574(sbM15339, c4499);
        }
        return sbM15339.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16339 m41572(int i, int i2, String str) {
        int i3;
        C4499 c4499M41570;
        String[] strArr;
        byte b;
        if (str == null || i <= 0 || i2 <= 0) {
            throw m41566();
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
                    throw m41567(i4 + 1);
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
                        throw m41567(i4 + 1);
                    }
                    zArr[b] = true;
                    if (strTrim3.isEmpty()) {
                        b2 = b;
                    } else if (b == 1 && strTrim3.equals("auto")) {
                        b2 = -1;
                        z = true;
                    } else {
                        if (b != 2 || !strTrim3.equals("full")) {
                            throw m41567(i4 + 1);
                        }
                        b2 = -1;
                        z2 = true;
                    }
                } else {
                    if ((!strTrim2.equals("x") && !strTrim2.equals("y")) || strTrim3.isEmpty() || b2 == -1) {
                        throw m41567(i4 + 1);
                    }
                    boolean zEquals = strTrim2.equals("x");
                    int i5 = i4 + 1;
                    if (b2 == 0) {
                        if ((zEquals ? str2 : str3) != null) {
                            throw m41567(i5);
                        }
                        if (zEquals) {
                            str2 = strTrim3;
                        } else {
                            str3 = strTrim3;
                        }
                    } else if (b2 == 1) {
                        if ((zEquals ? str4 : str5) != null) {
                            throw m41567(i5);
                        }
                        if (zEquals) {
                            str4 = strTrim3;
                        } else {
                            str5 = strTrim3;
                        }
                    } else {
                        if ((zEquals ? str6 : str7) != null) {
                            throw m41567(i5);
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
            ArrayList arrayListM41575 = m41575(i, str2);
            ArrayList arrayListM41576 = m41575(i2, str3);
            C4499 c4499M41571 = z ? null : m41570(i, str4);
            C4499 c4499M41572 = z ? null : m41570(i2, str5);
            if (z2) {
                i3 = 0;
                c4499M41570 = new C4499(0, i);
            } else {
                i3 = 0;
                c4499M41570 = m41570(i, str6);
            }
            C4499 c4499 = c4499M41570;
            C4499 c44910 = z2 ? new C4499(i3, i2) : m41570(i2, str7);
            if (c4499M41571 != null && (c4499.f14318 > c4499M41571.f14318 || c4499.f14317 < c4499M41571.f14317 || c44910.f14318 > c4499M41572.f14318 || c44910.f14317 < c4499M41572.f14317)) {
                throw m41566();
            }
            if (arrayListM41575.size() * 2 > 127 || arrayListM41576.size() * 2 > 127) {
                throw m41566();
            }
            if (((long) m41565(arrayListM41575, i)) * ((long) m41565(arrayListM41576, i2)) <= 127) {
                return new C16339(arrayListM41575, arrayListM41576, c4499M41571, c4499M41572, c4499, c44910, i, i2);
            }
            throw m41566();
        }
        throw m41566();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41574(StringBuilder sb, C4499 c4499) {
        sb.append(c4499.f14318 + 1);
        sb.append('-');
        sb.append(c4499.f14317 + 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41573(StringBuilder sb, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            sb.append("none");
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            m41574(sb, (C4499) arrayList.get(i));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m41575(int i, String str) {
        if (str.equals("none")) {
            return new ArrayList();
        }
        String[] strArrSplit = str.split(",", -1);
        ArrayList arrayList = new ArrayList(strArrSplit.length);
        for (String str2 : strArrSplit) {
            if (str2.trim().isEmpty()) {
                throw m41566();
            }
            arrayList.add(m41570(i, str2));
        }
        return m41576(arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4499 m41570(int i, String str) {
        int iIndexOf = str.indexOf(45);
        if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf(45)) {
            throw m41566();
        }
        int iM41564 = m41564(str.substring(0, iIndexOf).trim());
        int iM41565 = m41564(str.substring(iIndexOf + 1).trim());
        if (iM41564 < 1 || iM41564 >= iM41565 || iM41565 > i + 1) {
            throw m41566();
        }
        return new C4499(iM41564 - 1, iM41565 - 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m41564(String str) {
        if (str.isEmpty()) {
            throw m41566();
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                throw m41566();
            }
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw m41566();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m41576(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4499 c4499 = (C4499) it.next();
            arrayList.add(c4499 == null ? null : new C4499(c4499.f14318, c4499.f14317));
        }
        Collections.sort(arrayList);
        int i = 0;
        while (i < arrayList.size() - 1) {
            C4499 c44910 = (C4499) arrayList.get(i);
            int i2 = i + 1;
            C4499 c44911 = (C4499) arrayList.get(i2);
            int i3 = c44911.f14318;
            int i4 = c44910.f14317;
            if (i3 <= i4) {
                c44910.f14317 = Math.max(i4, c44911.f14317);
                arrayList.remove(i2);
            } else {
                i = i2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4499 m41571(C4499 c4499) {
        if (c4499 == null) {
            return null;
        }
        return new C4499(c4499.f14318, c4499.f14317);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m41565(ArrayList arrayList, int i) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        int size = arrayList.size() * 2;
        int i2 = size - 1;
        if (((C4499) arrayList.get(0)).f14318 <= 0) {
            size = i2;
        }
        return ((C4499) C18566.m43105(arrayList, 1)).f14317 < i ? size + 1 : size;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m41566() {
        return new IllegalArgumentException("Invalid nine-patch region text");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IllegalArgumentException m41567(int i) {
        return new IllegalArgumentException(C19370.m44628(i, "Invalid nine-patch region text at line "));
    }
}
