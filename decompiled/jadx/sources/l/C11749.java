package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.google.android.material.badge.BadgeDrawable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M4F8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11749 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final char[] f35065 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f35066;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f35067;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f35068;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f35069;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f35070;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f35071;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List f35072;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f35073;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String f35074;

    public C11749(C6104 c6104) {
        this.f35074 = c6104.f18714;
        String str = c6104.f18718;
        this.f35073 = m28758(str, 0, str.length(), false);
        String str2 = c6104.f18715;
        this.f35070 = m28758(str2, 0, str2.length(), false);
        this.f35068 = c6104.f18716;
        int i = c6104.f18720;
        this.f35071 = i == -1 ? m28762(c6104.f18714) : i;
        this.f35072 = m28759(c6104.f18717, false);
        ArrayList arrayList = c6104.f18719;
        this.f35069 = arrayList != null ? m28759(arrayList, true) : null;
        String str3 = c6104.f18713;
        this.f35066 = str3 != null ? m28758(str3, 0, str3.length(), false) : null;
        this.f35067 = c6104.toString();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m28767() {
        return this.f35074;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m28780() {
        return this.f35074.equals(b.a);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m28776() {
        if (this.f35073.isEmpty()) {
            return "";
        }
        int length = this.f35074.length() + 3;
        String str = this.f35067;
        return str.substring(length, C20032.m46169(str, length, str.length(), ":@"));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m28778() {
        return this.f35073;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m28765() {
        if (this.f35070.isEmpty()) {
            return "";
        }
        int length = this.f35074.length() + 3;
        String str = this.f35067;
        return str.substring(str.indexOf(58, length) + 1, str.indexOf(64));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m28769() {
        return this.f35070;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m28773() {
        return this.f35068;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m28771() {
        return this.f35071;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m28762(String str) {
        if (str.equals(a.s)) {
            return 80;
        }
        return str.equals(b.a) ? 443 : -1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m28772() {
        int length = this.f35074.length() + 3;
        String str = this.f35067;
        int iIndexOf = str.indexOf(47, length);
        return str.substring(iIndexOf, C20032.m46169(str, iIndexOf, str.length(), "?#"));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m28775() {
        int length = this.f35074.length() + 3;
        String str = this.f35067;
        int iIndexOf = str.indexOf(47, length);
        int iM46169 = C20032.m46169(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iM46169) {
            int i = iIndexOf + 1;
            int iM46168 = C20032.m46168(str, i, iM46169, '/');
            arrayList.add(str.substring(i, iM46168));
            iIndexOf = iM46168;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m28779() {
        return this.f35072;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m28777() {
        if (this.f35069 == null) {
            return null;
        }
        String str = this.f35067;
        int iIndexOf = str.indexOf(63) + 1;
        return str.substring(iIndexOf, C20032.m46168(str, iIndexOf, str.length(), '#'));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28760(StringBuilder sb, List list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append(com.alipay.sdk.m.p.a.h);
                sb.append(str2);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m28764(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iIndexOf = str.indexOf(38, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            int iIndexOf2 = str.indexOf(61, i);
            if (iIndexOf2 == -1 || iIndexOf2 > iIndexOf) {
                arrayList.add(str.substring(i, iIndexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, iIndexOf2));
                arrayList.add(str.substring(iIndexOf2 + 1, iIndexOf));
            }
            i = iIndexOf + 1;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m28770() {
        List list = this.f35069;
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m28760(sb, list);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final URI m28768() {
        C6104 c6104 = new C6104();
        String str = this.f35074;
        c6104.f18714 = str;
        c6104.f18718 = m28776();
        c6104.f18715 = m28765();
        c6104.f18716 = this.f35068;
        int iM28762 = m28762(str);
        int i = this.f35071;
        if (i == iM28762) {
            i = -1;
        }
        c6104.f18720 = i;
        ArrayList arrayList = c6104.f18717;
        arrayList.clear();
        arrayList.addAll(m28775());
        String strM28777 = m28777();
        String strSubstring = null;
        c6104.f18719 = strM28777 != null ? m28764(m28757(strM28777, 0, strM28777.length(), " \"'<>#", true, false, true, true)) : null;
        if (this.f35066 != null) {
            String str2 = this.f35067;
            strSubstring = str2.substring(str2.indexOf(35) + 1);
        }
        c6104.f18713 = strSubstring;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str3 = (String) arrayList.get(i2);
            arrayList.set(i2, m28757(str3, 0, str3.length(), "[]", true, true, false, true));
        }
        ArrayList arrayList2 = c6104.f18719;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str4 = (String) c6104.f18719.get(i3);
                if (str4 != null) {
                    c6104.f18719.set(i3, m28757(str4, 0, str4.length(), "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str5 = c6104.f18713;
        if (str5 != null) {
            c6104.f18713 = m28757(str5, 0, str5.length(), " \"#<>\\^`{|}", true, true, false, false);
        }
        String string = c6104.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                return URI.create(string.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11749 m28766(String str) {
        C6104 c6104;
        try {
            c6104 = new C6104();
            c6104.m17023(this, str);
        } catch (IllegalArgumentException unused) {
            c6104 = null;
        }
        if (c6104 != null) {
            return c6104.m17022();
        }
        return null;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m28774() {
        C6104 c6104;
        try {
            c6104 = new C6104();
            c6104.m17023(this, "/...");
        } catch (IllegalArgumentException unused) {
            c6104 = null;
        }
        c6104.getClass();
        c6104.f18718 = m28757("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        c6104.f18715 = m28757("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return c6104.m17022().f35067;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C11749 m28763(String str) {
        C6104 c6104 = new C6104();
        c6104.m17023(null, str);
        return c6104.m17022();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C11749) && ((C11749) obj).f35067.equals(this.f35067);
    }

    public final int hashCode() {
        return this.f35067.hashCode();
    }

    public final String toString() {
        return this.f35067;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m28759(ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            arrayList2.add(str != null ? m28758(str, 0, str.length(), z) : null);
        }
        return C20195.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28758(String str, int i, int i2, boolean z) {
        int i3;
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C12521 c12521 = new C12521();
                c12521.m30707(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i3 = iCharCount + 2) < i2) {
                        int iM46166 = C20032.m46166(str.charAt(iCharCount + 1));
                        int iM46167 = C20032.m46166(str.charAt(i3));
                        if (iM46166 != -1 && iM46167 != -1) {
                            c12521.m30720writeByte((iM46166 << 4) + iM46167);
                            iCharCount = i3;
                        } else {
                            c12521.m30717(iCodePointAt);
                        }
                    } else if (iCodePointAt == 43 && z) {
                        c12521.m30720writeByte(32);
                    } else {
                        c12521.m30717(iCodePointAt);
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                return c12521.m30714();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m28761(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C20032.m46166(str.charAt(i + 1)) != -1 && C20032.m46166(str.charAt(i3)) != -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28757(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z4) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z && (!z2 || m28761(iCharCount, i2, str)))) && (iCodePointAt != 43 || !z3)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                C12521 c12521 = new C12521();
                c12521.m30707(i, iCharCount, str);
                C12521 c12522 = null;
                while (iCharCount < i2) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z3) {
                            String str3 = z ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : "%2B";
                            c12521.m30707(0, str3.length(), str3);
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && z4) || str2.indexOf(iCodePointAt2) != -1 || (iCodePointAt2 == 37 && (!z || (z2 && !m28761(iCharCount, i2, str)))))) {
                            if (c12522 == null) {
                                c12522 = new C12521();
                            }
                            c12522.m30717(iCodePointAt2);
                            while (!c12522.mo12308()) {
                                byte b = c12522.readByte();
                                c12521.m30720writeByte(37);
                                char[] cArr = f35065;
                                c12521.m30720writeByte((int) cArr[((b & 255) >> 4) & 15]);
                                c12521.m30720writeByte((int) cArr[b & 15]);
                            }
                        } else {
                            c12521.m30717(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return c12521.m30714();
            }
        }
        return str.substring(i, i2);
    }
}
