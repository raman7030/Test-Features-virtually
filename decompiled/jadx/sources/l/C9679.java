package l;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 74MB */
/* JADX INFO: loaded from: classes3.dex */
public final class C9679 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24615(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m24618(String str) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        int i = 0;
        while (i != length && "/".indexOf(str.charAt(i)) != -1) {
            i++;
        }
        return str.substring(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24610(String str) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        while (length != 0 && "/".indexOf(str.charAt(length - 1)) != -1) {
            length--;
        }
        return str.substring(0, length);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m24606(String str, CharSequence charSequence, int i) {
        if (charSequence == null || str == null) {
            return -1;
        }
        if (i < 0) {
            i = 0;
        }
        int length = (charSequence.length() - str.length()) + 1;
        if (i > length) {
            return -1;
        }
        if (str.length() == 0) {
            return i;
        }
        while (i < length) {
            if (C23789.m52464(i, str.length(), charSequence, str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24616(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence2.length();
            int length2 = charSequence.length() - length;
            for (int i = 0; i <= length2; i++) {
                if (C23789.m52464(i, length, charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24614(Object[] objArr, char c) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        if (length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(length * 16);
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append(c);
            }
            Object obj = objArr[i];
            if (obj != null) {
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24613(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        int length = objArr.length;
        if (length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(length * 16);
        for (int i = 0; i < length; i++) {
            if (i > 0) {
                sb.append("\n \n");
            }
            Object obj = objArr[i];
            if (obj != null) {
                sb.append(obj);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24612(Collection collection, char c) {
        Iterator it;
        if (collection == null || (it = collection.iterator()) == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C11003.toString(next, "");
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            sb.append(c);
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24609(Iterable iterable, String str) {
        Iterator it;
        if (iterable == null || (it = iterable.iterator()) == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return C11003.toString(next, "");
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            sb.append(str);
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24611(String str, String str2, String str3) {
        if (m24615((CharSequence) str) || m24615((CharSequence) str2) || str3 == null) {
            return str;
        }
        int i = 0;
        int iIndexOf = str.indexOf(str2, 0);
        if (iIndexOf == -1) {
            return str;
        }
        int length = str2.length();
        int length2 = str3.length() - length;
        if (length2 < 0) {
            length2 = 0;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length2 * 16));
        int i2 = -1;
        while (iIndexOf != -1) {
            sb.append((CharSequence) str, i, iIndexOf);
            sb.append(str3);
            i = iIndexOf + length;
            i2--;
            if (i2 == 0) {
                break;
            }
            iIndexOf = str.indexOf(str2, i);
        }
        sb.append((CharSequence) str, i, str.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24608(int i, String str) {
        if (str == null) {
            return null;
        }
        if (i <= 0) {
            return "";
        }
        int length = str.length();
        if (i == 1 || length == 0) {
            return str;
        }
        if (length == 1 && i <= 8192) {
            return m24607(str.charAt(0), i);
        }
        int i2 = length * i;
        if (length == 1) {
            return m24607(str.charAt(0), i);
        }
        if (length == 2) {
            char cCharAt = str.charAt(0);
            char cCharAt2 = str.charAt(1);
            char[] cArr = new char[i2];
            for (int i3 = (i * 2) - 2; i3 >= 0; i3 -= 2) {
                cArr[i3] = cCharAt;
                cArr[i3 + 1] = cCharAt2;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(i2);
        for (int i4 = 0; i4 < i; i4++) {
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24607(char c, int i) {
        if (i <= 0) {
            return "";
        }
        char[] cArr = new char[i];
        while (true) {
            i--;
            if (i >= 0) {
                cArr[i] = c;
            } else {
                return new String(cArr);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m24605(String str, char c) {
        if (m24615((CharSequence) str)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (c == str.charAt(i2)) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m24619(CharSequence charSequence, String str) {
        if (str == null || charSequence == null) {
            return str == null && charSequence == null;
        }
        if (charSequence.length() > str.length()) {
            return false;
        }
        return C23789.m52464(0, charSequence.length(), str, charSequence);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24617(CharSequence charSequence, String str) {
        if (str == null || charSequence == null) {
            return str == null && charSequence == null;
        }
        if (charSequence.length() > str.length()) {
            return false;
        }
        return C23789.m52464(str.length() - charSequence.length(), charSequence.length(), str, charSequence);
    }
}
