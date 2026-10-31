package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۙ᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C3016 extends C1563 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m9237(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C11233.m27805(charSequence, "<this>");
        C11233.m27805(charSequence2, "other");
        if (!(charSequence2 instanceof String)) {
            if (C7249.m19398(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
                return true;
            }
        } else if (C7249.m19399(2, charSequence, (String) charSequence2, z) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9242(CharSequence charSequence) {
        C11233.m27805(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!C0899.m3251(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List m9245(String str) {
        C11233.m27805(str, "<this>");
        C22066 c22066 = new C22066(str);
        if (c22066.hasNext()) {
            Object next = c22066.next();
            if (!c22066.hasNext()) {
                return C1913.m6273(next);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(next);
            while (c22066.hasNext()) {
                arrayList.add(c22066.next());
            }
            return arrayList;
        }
        return C8969.f27244;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static CharSequence m9248(String str) {
        C11233.m27805(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM3251 = C0899.m3251(str.charAt(!z ? i : length));
            if (z) {
                if (!zM3251) {
                    break;
                }
                length--;
            } else if (zM3251) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m9239(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9235(String str, String str2, String str3) {
        C11233.m27805(str, "<this>");
        int iM19395 = C7249.m19395(0, str, str2, false);
        if (iM19395 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iM19395);
            sb.append(str3);
            i2 = iM19395 + length;
            if (iM19395 >= str.length()) {
                break;
            }
            iM19395 = C7249.m19395(iM19395 + i, str, str2, false);
        } while (iM19395 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        C11233.m27803(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9243(String str, String str2) {
        C11233.m27805(str, "<this>");
        return str.startsWith(str2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m9244(String str, String str2) {
        C11233.m27805(str2, "delimiter");
        int iM19399 = C7249.m19399(6, str, str2, false);
        if (iM19399 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iM19399, str.length());
        C11233.m27803(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m9240(String str, String str2, boolean z) {
        C11233.m27805(str, "<this>");
        C11233.m27805(str2, "suffix");
        return !z ? str.endsWith(str2) : C22771.m50848(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m9247(String str) {
        List listM6273;
        int length;
        Comparable comparable;
        String strSubstring;
        C11233.m27805(str, "<this>");
        C22066 c22066 = new C22066(str);
        if (c22066.hasNext()) {
            Object next = c22066.next();
            if (c22066.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c22066.hasNext()) {
                    arrayList.add(c22066.next());
                }
                listM6273 = arrayList;
            } else {
                listM6273 = C1913.m6273(next);
            }
        } else {
            listM6273 = C8969.f27244;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM6273) {
            if (!m9242((CharSequence) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C1913.m6270((Iterable) arrayList2));
        Iterator it = arrayList2.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!C0899.m3251(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList3.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listM6273.size();
        int iM6271 = C1913.m6271(listM6273);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : listM6273) {
            int i = length + 1;
            if (length < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iM6271) && m9242((CharSequence) str3)) {
                strSubstring = null;
            } else {
                C11233.m27805(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(C18307.m42645(iIntValue, "Requested character count ", " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                C11233.m27803(strSubstring, "substring(...)");
            }
            if (strSubstring != null) {
                arrayList4.add(strSubstring);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        C20964.m47783(arrayList4, sb, "\n", "", "", "...", null);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m9246(CharSequence charSequence) {
        C11233.m27805(charSequence, "<this>");
        return charSequence.length() > 0 && C0899.m3252(charSequence.charAt(0), '\t', false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m9238(String str) {
        C11233.m27805(str, "<this>");
        return str.length() > 0 && C0899.m3252(str.charAt(C7249.m19396(str)), '/', false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m9241(String str) {
        return str.lastIndexOf(46, C7249.m19396(str));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m9236(String str, char[] cArr) {
        if (cArr.length == 1) {
            String strValueOf = String.valueOf(cArr[0]);
            int iM19395 = C7249.m19395(0, str, strValueOf, false);
            if (iM19395 == -1) {
                return C1913.m6273(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int length = 0;
            do {
                arrayList.add(str.subSequence(length, iM19395).toString());
                length = strValueOf.length() + iM19395;
                iM19395 = C7249.m19395(length, str, strValueOf, false);
            } while (iM19395 != -1);
            arrayList.add(str.subSequence(length, str.length()).toString());
            return arrayList;
        }
        C19245<C4882> c19245 = new C19245(new C21361(str, new C13598(cArr)));
        ArrayList arrayList2 = new ArrayList(C1913.m6270((Iterable) c19245));
        for (C4882 c4882 : c19245) {
            C11233.m27805(c4882, "range");
            arrayList2.add(str.subSequence(c4882.getFirst(), c4882.getLast() + 1).toString());
        }
        return arrayList2;
    }
}
