package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۙ᩵, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C5235 extends C3854 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m11295(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C13045.m29867(charSequence, "<this>");
        C13045.m29867(charSequence2, "other");
        if (!(charSequence2 instanceof String)) {
            if (C9258.m21364(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
                return true;
            }
        } else if (C9258.m21365(2, charSequence, (String) charSequence2, z) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m11300(CharSequence charSequence) {
        C13045.m29867(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!C3223.m5570(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static List m11303(String str) {
        C13045.m29867(str, "<this>");
        C23340 c23340 = new C23340(str);
        if (c23340.hasNext()) {
            Object next = c23340.next();
            if (!c23340.hasNext()) {
                return C4187.m8475(next);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(next);
            while (c23340.hasNext()) {
                arrayList.add(c23340.next());
            }
            return arrayList;
        }
        return C10893.f30179;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static CharSequence m11306(String str) {
        C13045.m29867(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM5570 = C3223.m5570(str.charAt(!z ? i : length));
            if (z) {
                if (!zM5570) {
                    break;
                }
                length--;
            } else if (zM5570) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m11297(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m11293(String str, String str2, String str3) {
        C13045.m29867(str, "<this>");
        int iM21361 = C9258.m21361(0, str, str2, false);
        if (iM21361 < 0) {
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
            sb.append((CharSequence) str, i2, iM21361);
            sb.append(str3);
            i2 = iM21361 + length;
            if (iM21361 >= str.length()) {
                break;
            }
            iM21361 = C9258.m21361(iM21361 + i, str, str2, false);
        } while (iM21361 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        C13045.m29865(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m11301(String str, String str2) {
        C13045.m29867(str, "<this>");
        return str.startsWith(str2);
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m11302(String str, String str2) {
        C13045.m29867(str2, "delimiter");
        int iM21365 = C9258.m21365(6, str, str2, false);
        if (iM21365 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iM21365, str.length());
        C13045.m29865(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m11298(String str, String str2, boolean z) {
        C13045.m29867(str, "<this>");
        C13045.m29867(str2, "suffix");
        return !z ? str.endsWith(str2) : C24010.m53191(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    /* JADX INFO: renamed from: ܿ */
    public static String m11305(String str) {
        List listM8475;
        int length;
        Comparable comparable;
        String strSubstring;
        C13045.m29867(str, "<this>");
        C23340 c23340 = new C23340(str);
        if (c23340.hasNext()) {
            Object next = c23340.next();
            if (c23340.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c23340.hasNext()) {
                    arrayList.add(c23340.next());
                }
                listM8475 = arrayList;
            } else {
                listM8475 = C4187.m8475(next);
            }
        } else {
            listM8475 = C10893.f30179;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listM8475) {
            if (!m11300((CharSequence) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C4187.m8472((Iterable) arrayList2));
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
                if (!C3223.m5570(str2.charAt(length))) {
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
        listM8475.size();
        int iM8473 = C4187.m8473(listM8475);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : listM8475) {
            int i = length + 1;
            if (length < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iM8473) && m11300((CharSequence) str3)) {
                strSubstring = null;
            } else {
                C13045.m29867(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(C19768.m44906(iIntValue, "Requested character count ", " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                C13045.m29865(strSubstring, "substring(...)");
            }
            if (strSubstring != null) {
                arrayList4.add(strSubstring);
            }
            length = i;
        }
        StringBuilder sb = new StringBuilder(length3);
        C22293.m50113(arrayList4, sb, "\n", "", "", "...", null);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m11304(CharSequence charSequence) {
        C13045.m29867(charSequence, "<this>");
        return charSequence.length() > 0 && C3223.m5571(charSequence.charAt(0), '\t', false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m11296(String str) {
        C13045.m29867(str, "<this>");
        return str.length() > 0 && C3223.m5571(str.charAt(C9258.m21362(str)), '/', false);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m11299(String str) {
        return str.lastIndexOf(46, C9258.m21362(str));
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m11294(String str, char[] cArr) {
        if (cArr.length == 1) {
            String strValueOf = String.valueOf(cArr[0]);
            int iM21361 = C9258.m21361(0, str, strValueOf, false);
            if (iM21361 == -1) {
                return C4187.m8475(str.toString());
            }
            ArrayList arrayList = new ArrayList(10);
            int length = 0;
            do {
                arrayList.add(str.subSequence(length, iM21361).toString());
                length = strValueOf.length() + iM21361;
                iM21361 = C9258.m21361(length, str, strValueOf, false);
            } while (iM21361 != -1);
            arrayList.add(str.subSequence(length, str.length()).toString());
            return arrayList;
        }
        C20659<C7009> c20659 = new C20659(new C22670(str, new C15292(cArr)));
        ArrayList arrayList2 = new ArrayList(C4187.m8472((Iterable) c20659));
        for (C7009 c7009 : c20659) {
            C13045.m29867(c7009, "range");
            arrayList2.add(str.subSequence(c7009.getFirst(), c7009.getLast() + 1).toString());
        }
        return arrayList2;
    }
}
