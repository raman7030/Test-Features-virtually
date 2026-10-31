package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;

/* JADX INFO: renamed from: l.᩵ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6NV */
/* JADX INFO: loaded from: classes4.dex */
public final class C19180 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m44258(char c) {
        return c == '\n' || c == '\r' || c == 133 || c == 8232 || c == 8233;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44257(String str) {
        int i;
        int iM44261;
        int iM44262;
        int iM44263;
        int iIndexOf = str.indexOf("//");
        while (iIndexOf >= 0) {
            int i2 = iIndexOf - 1;
            while (i2 >= 0) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != ' ' && cCharAt != '\t') {
                    break;
                } else {
                    i2--;
                }
            }
            if (i2 < 0 || m44258(str.charAt(i2))) {
                int iM44264 = m44261(iIndexOf + 2, str);
                if (m44259(iM44264, str, "require") && (iM44261 = m44261((i = iM44264 + 7), str)) != i && m44259(iM44261, str, "mt") && (iM44262 = m44261(iM44261 + 2, str)) != str.length() && str.charAt(iM44262) == '>') {
                    int i3 = iM44262 + 1;
                    boolean z = i3 < str.length() && str.charAt(i3) == '=';
                    if (z) {
                        i3 = iM44262 + 2;
                    }
                    int iM44265 = m44261(i3, str);
                    int iM44266 = m44265(iM44265, str);
                    if (iM44266 >= 0 && ((iM44263 = m44261(iM44266, str)) >= str.length() || m44258(str.charAt(iM44263)))) {
                        String strSubstring = str.substring(iM44265, iM44266);
                        boolean z2 = strSubstring.indexOf(46) < 0;
                        int iM44267 = z2 ? 26101061 : m44262("2.26.10");
                        int i4 = z2 ? Integer.parseInt(strSubstring) : m44262(strSubstring);
                        if (z) {
                            if (iM44267 >= i4) {
                                return;
                            }
                        } else if (iM44267 > i4) {
                            return;
                        }
                        throw new C9134(C4925.m14327(R.string.MT_Protector) + "\n(Require " + (z2 ? "VersionCode" : "VersionName") + " " + (z ? ">=" : ">") + " " + strSubstring + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                }
            }
            iIndexOf = str.indexOf("//", iIndexOf + 2);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m44265(int i, String str) {
        int i2;
        int iM44256;
        int iM44257;
        int i3;
        int iM44258;
        int iM44259;
        int iM442510 = m44256(i, str);
        int i4 = iM442510 - i;
        if (i4 == 8) {
            return iM442510;
        }
        if (i4 != 1 || iM442510 == str.length() || str.charAt(iM442510) != '.' || (iM44257 = (iM44256 = m44256((i2 = iM442510 + 1), str)) - i2) < 1 || iM44257 > 3 || iM44256 == str.length() || str.charAt(iM44256) != '.' || (iM44259 = (iM44258 = m44256((i3 = iM44256 + 1), str)) - i3) < 1 || iM44259 > 3) {
            return -1;
        }
        return iM44258;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m44256(int i, String str) {
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m44261(int i, String str) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m44259(int i, String str, String str2) {
        if (str2.length() + i <= str.length()) {
            for (int i2 = 0; i2 < str2.length(); i2++) {
                char cCharAt = str.charAt(i + i2);
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    cCharAt = (char) (cCharAt + ' ');
                }
                if (cCharAt == str2.charAt(i2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m44264(int i, String str) {
        char cCharAt;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || (cCharAt >= '\t' && cCharAt <= '\r'))) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m44263(String str, String str2) {
        int iIndexOf = str2.indexOf(35);
        while (iIndexOf >= 0) {
            int i = iIndexOf - 1;
            while (i >= 0) {
                char cCharAt = str2.charAt(i);
                if (!m44258(cCharAt)) {
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != 11 && cCharAt != '\f') {
                        break;
                    }
                    i--;
                }
                return new C0666(str, new C20177()).m2713(str2);
            }
            if (i >= 0) {
                iIndexOf = str2.indexOf(35, iIndexOf + 1);
            } else {
                return new C0666(str, new C20177()).m2713(str2);
            }
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0092 A[RETURN] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m44260(String str, String str2) {
        boolean z = str2.indexOf(46) < 0;
        int iM44262 = z ? 26101061 : m44262("2.26.10");
        int i = z ? Integer.parseInt(str2) : m44262(str2);
        str.getClass();
        switch (str) {
            case "<":
                if (iM44262 < i) {
                    return true;
                }
                return false;
            case ">":
                if (iM44262 > i) {
                    return true;
                }
                return false;
            case "!=":
                if (iM44262 != i) {
                    return true;
                }
                return false;
            case "<=":
                if (iM44262 <= i) {
                    return true;
                }
                return false;
            case "==":
                if (iM44262 == i) {
                    return true;
                }
                return false;
            case ">=":
                if (iM44262 >= i) {
                    return true;
                }
                return false;
            default:
                throw new RuntimeException("Unknown operator: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m44262(String str) {
        int iIndexOf = str.indexOf(46);
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(46, i);
        int iIndexOf3 = str.indexOf(45);
        if (iIndexOf3 < 0) {
            iIndexOf3 = str.length();
        }
        return Integer.parseInt(str.substring(iIndexOf2 + 1, iIndexOf3)) + (Integer.parseInt(str.substring(i, iIndexOf2)) * 1000) + (Integer.parseInt(str.substring(0, iIndexOf)) * BasicLabelFormatter.MILLION);
    }
}
