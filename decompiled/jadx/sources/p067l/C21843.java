package p067l;

import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩶᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P78M */
/* JADX INFO: loaded from: classes4.dex */
public final class C21843 {

    /* JADX INFO: renamed from: ֫ */
    public final String f68734;

    /* JADX INFO: renamed from: ۜ */
    public final int f68735;

    /* JADX INFO: renamed from: ۧ */
    public C23184 f68736;

    /* JADX INFO: renamed from: ܳ */
    public final String f68737;

    /* JADX INFO: renamed from: ܽ */
    public int f68738;

    /* JADX INFO: renamed from: ܿ */
    public C7090 f68739 = new C7090(0, 0, 0, 0, new ArrayList(), new ArrayList());

    /* JADX INFO: renamed from: ᩳ */
    public final String f68740;

    /* JADX INFO: renamed from: ᩻ */
    public final String f68741;

    public C21843(int i, int i2, String str, String str2, String str3, String str4) {
        this.f68740 = str;
        this.f68737 = str2;
        this.f68741 = str3;
        this.f68734 = str4;
        this.f68735 = i;
        this.f68738 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21843 m49270(int i, String str) {
        String strTrim = C5749.m12801(str).trim().substring(6).trim();
        int iIndexOf = strTrim.indexOf(61);
        if (iIndexOf >= 0) {
            strTrim = strTrim.substring(0, iIndexOf).trim();
        }
        int iM49268 = m49268(strTrim, ':');
        if (iM49268 < 0) {
            return m49271(i, "field", strTrim);
        }
        C23854 c23854M49272 = m49272(iM49268, strTrim);
        return new C21843(i, i, "field", c23854M49272.f75781, C24420.m53894(new StringBuilder(), c23854M49272.f75781, ":", m49269(strTrim.substring(iM49268 + 1).trim())), strTrim.substring(0, c23854M49272.f75782).trim());
    }

    /* JADX INFO: renamed from: ܽ */
    public static C21843 m49273(int i, String str) {
        String strTrim = C5749.m12801(str).trim().substring(7).trim();
        int iM49268 = m49268(strTrim, '(');
        if (iM49268 < 0) {
            return m49271(i, AbstractC0213e.f995s, strTrim);
        }
        C23854 c23854M49272 = m49272(iM49268, strTrim);
        return new C21843(i, i, AbstractC0213e.f995s, c23854M49272.f75781, C10965.m25286(new StringBuilder(), c23854M49272.f75781, m49269(strTrim.substring(iM49268).trim())), strTrim.substring(0, c23854M49272.f75782).trim());
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m49268(String str, char c) {
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

    /* JADX INFO: renamed from: ֫ */
    public static String m49269(String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public static C21843 m49271(int i, String str, String str2) {
        int iIndexOf = str2.indexOf(str.equals("field") ? 58 : 40);
        return new C21843(i, i, str, iIndexOf < 0 ? str2 : str2.substring(0, iIndexOf), str2, "");
    }

    /* JADX INFO: renamed from: ۧ */
    public static C23854 m49272(int i, String str) {
        int iLastIndexOf;
        while (i > 0 && Character.isWhitespace(str.charAt(i - 1))) {
            i--;
        }
        if (i > 0) {
            int i2 = i - 1;
            if (str.charAt(i2) == '`' && (iLastIndexOf = str.lastIndexOf(96, i - 2)) >= 0) {
                return new C23854(str.substring(iLastIndexOf + 1, i2), iLastIndexOf);
            }
        }
        int i3 = i;
        while (i3 > 0 && !Character.isWhitespace(str.charAt(i3 - 1))) {
            i3--;
        }
        return new C23854(str.substring(i3, i), i3);
    }
}
