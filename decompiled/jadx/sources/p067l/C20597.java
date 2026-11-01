package p067l;

import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;

/* JADX INFO: renamed from: l.᩵ۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6NV */
/* JADX INFO: loaded from: classes4.dex */
public final class C20597 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m46553(char c) {
        return c == '\n' || c == '\r' || c == 133 || c == 8232 || c == 8233;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46552(String str) {
        int i;
        int iM46556;
        int iM46557;
        int iM46558;
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
            if (i2 < 0 || m46553(str.charAt(i2))) {
                int iM46559 = m46556(iIndexOf + 2, str);
                if (m46554(iM46559, str, "require") && (iM46556 = m46556((i = iM46559 + 7), str)) != i && m46554(iM46556, str, "mt") && (iM46557 = m46556(iM46556 + 2, str)) != str.length() && str.charAt(iM46557) == '>') {
                    int i3 = iM46557 + 1;
                    boolean z = i3 < str.length() && str.charAt(i3) == '=';
                    if (z) {
                        i3 = iM46557 + 2;
                    }
                    int iM465510 = m46556(i3, str);
                    int iM46560 = m46560(iM465510, str);
                    if (iM46560 >= 0 && ((iM46558 = m46556(iM46560, str)) >= str.length() || m46553(str.charAt(iM46558)))) {
                        String strSubstring = str.substring(iM465510, iM46560);
                        boolean z2 = strSubstring.indexOf(46) < 0;
                        int iM465511 = z2 ? 26101061 : m46557("2.26.10");
                        int i4 = z2 ? Integer.parseInt(strSubstring) : m46557(strSubstring);
                        if (z) {
                            if (iM465511 >= i4) {
                                return;
                            }
                        } else if (iM465511 > i4) {
                            return;
                        }
                        throw new C11050(C7050.m16224(R.string.MT_Protector) + "\n(Require " + (z2 ? "VersionCode" : "VersionName") + " " + (z ? ">=" : ">") + " " + strSubstring + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                }
            }
            iIndexOf = str.indexOf("//", iIndexOf + 2);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m46560(int i, String str) {
        int i2;
        int iM46551;
        int iM46552;
        int i3;
        int iM46553;
        int iM46554;
        int iM46555 = m46551(i, str);
        int i4 = iM46555 - i;
        if (i4 == 8) {
            return iM46555;
        }
        if (i4 != 1 || iM46555 == str.length() || str.charAt(iM46555) != '.' || (iM46552 = (iM46551 = m46551((i2 = iM46555 + 1), str)) - i2) < 1 || iM46552 > 3 || iM46551 == str.length() || str.charAt(iM46551) != '.' || (iM46554 = (iM46553 = m46551((i3 = iM46551 + 1), str)) - i3) < 1 || iM46554 > 3) {
            return -1;
        }
        return iM46553;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m46551(int i, String str) {
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m46556(int i, String str) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m46554(int i, String str, String str2) {
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

    /* JADX INFO: renamed from: ܽ */
    public static int m46559(int i, String str) {
        char cCharAt;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || (cCharAt >= '\t' && cCharAt <= '\r'))) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m46558(String str, String str2) {
        int iIndexOf = str2.indexOf(35);
        while (iIndexOf >= 0) {
            int i = iIndexOf - 1;
            while (i >= 0) {
                char cCharAt = str2.charAt(i);
                if (!m46553(cCharAt)) {
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != 11 && cCharAt != '\f') {
                        break;
                    }
                    i--;
                }
                return new C3002(str, new C21545()).m5052(str2);
            }
            if (i >= 0) {
                iIndexOf = str2.indexOf(35, iIndexOf + 1);
            } else {
                return new C3002(str, new C21545()).m5052(str2);
            }
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0092 A[RETURN] */
    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m46555(String str, String str2) {
        boolean z = str2.indexOf(46) < 0;
        int iM46557 = z ? 26101061 : m46557("2.26.10");
        int i = z ? Integer.parseInt(str2) : m46557(str2);
        str.getClass();
        switch (str) {
            case "<":
                if (iM46557 < i) {
                    return true;
                }
                return false;
            case ">":
                if (iM46557 > i) {
                    return true;
                }
                return false;
            case "!=":
                if (iM46557 != i) {
                    return true;
                }
                return false;
            case "<=":
                if (iM46557 <= i) {
                    return true;
                }
                return false;
            case "==":
                if (iM46557 == i) {
                    return true;
                }
                return false;
            case ">=":
                if (iM46557 >= i) {
                    return true;
                }
                return false;
            default:
                throw new RuntimeException("Unknown operator: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m46557(String str) {
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
