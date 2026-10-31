package l;

import com.alipay.sdk.m.t.e;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P78M */
/* JADX INFO: loaded from: classes4.dex */
public final class C20490 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f66055;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f66056;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21901 f66057;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f66058;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f66059;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C4967 f66060 = new C4967(0, 0, 0, 0, new ArrayList(), new ArrayList());

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f66061;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f66062;

    public C20490(int i, int i2, String str, String str2, String str3, String str4) {
        this.f66061 = str;
        this.f66058 = str2;
        this.f66062 = str3;
        this.f66055 = str4;
        this.f66056 = i;
        this.f66059 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20490 m46947(int i, String str) {
        String strTrim = C3556.m10821(str).trim().substring(6).trim();
        int iIndexOf = strTrim.indexOf(61);
        if (iIndexOf >= 0) {
            strTrim = strTrim.substring(0, iIndexOf).trim();
        }
        int iM46945 = m46945(strTrim, ':');
        if (iM46945 < 0) {
            return m46948(i, "field", strTrim);
        }
        C22606 c22606M46949 = m46949(iM46945, strTrim);
        return new C20490(i, i, "field", c22606M46949.f73053, C23202.m51498(new StringBuilder(), c22606M46949.f73053, ":", m46946(strTrim.substring(iM46945 + 1).trim())), strTrim.substring(0, c22606M46949.f73054).trim());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C20490 m46950(int i, String str) {
        String strTrim = C3556.m10821(str).trim().substring(7).trim();
        int iM46945 = m46945(strTrim, '(');
        if (iM46945 < 0) {
            return m46948(i, e.s, strTrim);
        }
        C22606 c22606M46949 = m46949(iM46945, strTrim);
        return new C20490(i, i, e.s, c22606M46949.f73053, C9045.m23341(new StringBuilder(), c22606M46949.f73053, m46946(strTrim.substring(iM46945).trim())), strTrim.substring(0, c22606M46949.f73054).trim());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m46945(String str, char c) {
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '`') {
                z = !z;
            } else if (!z && cCharAt == c) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46946(String str) {
        StringBuilder sb = null;
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (z || !Character.isWhitespace(cCharAt)) {
                if (sb != null) {
                    sb.append(cCharAt);
                }
                if (cCharAt == 'L') {
                    z = true;
                } else if (z && cCharAt == ';') {
                    z = false;
                }
            } else if (sb == null) {
                sb = new StringBuilder(str.length());
                sb.append((CharSequence) str, 0, i);
            }
        }
        return sb == null ? str : sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20490 m46948(int i, String str, String str2) {
        int iIndexOf = str2.indexOf(str.equals("field") ? 58 : 40);
        return new C20490(i, i, str, iIndexOf < 0 ? str2 : str2.substring(0, iIndexOf), str2, "");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C22606 m46949(int i, String str) {
        int iLastIndexOf;
        while (i > 0 && Character.isWhitespace(str.charAt(i - 1))) {
            i--;
        }
        if (i > 0) {
            int i2 = i - 1;
            if (str.charAt(i2) == '`' && (iLastIndexOf = str.lastIndexOf(96, i - 2)) >= 0) {
                return new C22606(str.substring(iLastIndexOf + 1, i2), iLastIndexOf);
            }
        }
        int i3 = i;
        while (i3 > 0 && !Character.isWhitespace(str.charAt(i3 - 1))) {
            i3--;
        }
        return new C22606(str.substring(i3, i), i3);
    }
}
