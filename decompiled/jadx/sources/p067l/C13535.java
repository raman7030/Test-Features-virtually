package p067l;

import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import com.alipay.sdk.p010m.p041p.C0184a;
import com.google.android.material.badge.BadgeDrawable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۨܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M4F8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13535 {

    /* JADX INFO: renamed from: ۢ */
    public static final char[] f38064 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ֫ */
    public final String f38065;

    /* JADX INFO: renamed from: ۜ */
    public final String f38066;

    /* JADX INFO: renamed from: ۧ */
    public final String f38067;

    /* JADX INFO: renamed from: ܳ */
    public final List f38068;

    /* JADX INFO: renamed from: ܽ */
    public final String f38069;

    /* JADX INFO: renamed from: ܿ */
    public final int f38070;

    /* JADX INFO: renamed from: ᩳ */
    public final List f38071;

    /* JADX INFO: renamed from: ᩷ */
    public final String f38072;

    /* JADX INFO: renamed from: ᩻ */
    public final String f38073;

    public C13535(C8170 c8170) {
        this.f38073 = c8170.f21569;
        String str = c8170.f21573;
        this.f38072 = m30805(str, 0, str.length(), false);
        String str2 = c8170.f21570;
        this.f38069 = m30805(str2, 0, str2.length(), false);
        this.f38067 = c8170.f21571;
        int i = c8170.f21575;
        this.f38070 = i == -1 ? m30809(c8170.f21569) : i;
        this.f38071 = m30806(c8170.f21572, false);
        ArrayList arrayList = c8170.f21574;
        this.f38068 = arrayList != null ? m30806(arrayList, true) : null;
        String str3 = c8170.f21568;
        this.f38065 = str3 != null ? m30805(str3, 0, str3.length(), false) : null;
        this.f38066 = c8170.toString();
    }

    /* JADX INFO: renamed from: ۖ */
    public final String m30814() {
        return this.f38073;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m30827() {
        return this.f38073.equals(C0171b.f688a);
    }

    /* JADX INFO: renamed from: ܿ */
    public final String m30823() {
        if (this.f38072.isEmpty()) {
            return "";
        }
        int length = this.f38073.length() + 3;
        String str = this.f38066;
        return str.substring(length, C21407.m48485(str, length, str.length(), ":@"));
    }

    /* JADX INFO: renamed from: ᩴ */
    public final String m30825() {
        return this.f38072;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m30812() {
        if (this.f38069.isEmpty()) {
            return "";
        }
        int length = this.f38073.length() + 3;
        String str = this.f38066;
        return str.substring(str.indexOf(58, length) + 1, str.indexOf(64));
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m30816() {
        return this.f38069;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m30820() {
        return this.f38067;
    }

    /* JADX INFO: renamed from: ۢ */
    public final int m30818() {
        return this.f38070;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m30809(String str) {
        if (str.equals(C0170a.f680s)) {
            return 80;
        }
        return str.equals(C0171b.f688a) ? 443 : -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m30819() {
        int length = this.f38073.length() + 3;
        String str = this.f38066;
        int iIndexOf = str.indexOf(47, length);
        return str.substring(iIndexOf, C21407.m48485(str, iIndexOf, str.length(), "?#"));
    }

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList m30822() {
        int length = this.f38073.length() + 3;
        String str = this.f38066;
        int iIndexOf = str.indexOf(47, length);
        int iM48485 = C21407.m48485(str, iIndexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iM48485) {
            int i = iIndexOf + 1;
            int iM48484 = C21407.m48484(str, i, iM48485, '/');
            arrayList.add(str.substring(i, iM48484));
            iIndexOf = iM48484;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final List m30826() {
        return this.f38071;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m30824() {
        if (this.f38068 == null) {
            return null;
        }
        String str = this.f38066;
        int iIndexOf = str.indexOf(63) + 1;
        return str.substring(iIndexOf, C21407.m48484(str, iIndexOf, str.length(), '#'));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m30807(StringBuilder sb, List list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append(C0184a.f880h);
                sb.append(str2);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static ArrayList m30811(String str) {
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

    /* JADX INFO: renamed from: ۡ */
    public final String m30817() {
        List list = this.f38068;
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m30807(sb, list);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۘ */
    public final URI m30815() {
        C8170 c8170 = new C8170();
        String str = this.f38073;
        c8170.f21569 = str;
        c8170.f21573 = m30823();
        c8170.f21570 = m30812();
        c8170.f21571 = this.f38067;
        int iM30809 = m30809(str);
        int i = this.f38070;
        if (i == iM30809) {
            i = -1;
        }
        c8170.f21575 = i;
        ArrayList arrayList = c8170.f21572;
        arrayList.clear();
        arrayList.addAll(m30822());
        String strM30824 = m30824();
        String strSubstring = null;
        c8170.f21574 = strM30824 != null ? m30811(m30804(strM30824, 0, strM30824.length(), " \"'<>#", true, false, true, true)) : null;
        if (this.f38065 != null) {
            String str2 = this.f38066;
            strSubstring = str2.substring(str2.indexOf(35) + 1);
        }
        c8170.f21568 = strSubstring;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str3 = (String) arrayList.get(i2);
            arrayList.set(i2, m30804(str3, 0, str3.length(), "[]", true, true, false, true));
        }
        ArrayList arrayList2 = c8170.f21574;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str4 = (String) c8170.f21574.get(i3);
                if (str4 != null) {
                    c8170.f21574.set(i3, m30804(str4, 0, str4.length(), "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str5 = c8170.f21568;
        if (str5 != null) {
            c8170.f21568 = m30804(str5, 0, str5.length(), " \"#<>\\^`{|}", true, true, false, false);
        }
        String string = c8170.toString();
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

    /* JADX INFO: renamed from: ֫ */
    public final C13535 m30813(String str) {
        C8170 c8170;
        try {
            c8170 = new C8170();
            c8170.m18954(this, str);
        } catch (IllegalArgumentException unused) {
            c8170 = null;
        }
        if (c8170 != null) {
            return c8170.m18953();
        }
        return null;
    }

    /* JADX INFO: renamed from: ܺ */
    public final String m30821() {
        C8170 c8170;
        try {
            c8170 = new C8170();
            c8170.m18954(this, "/...");
        } catch (IllegalArgumentException unused) {
            c8170 = null;
        }
        c8170.getClass();
        c8170.f21573 = m30804("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        c8170.f21570 = m30804("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return c8170.m18953().f38066;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C13535 m30810(String str) {
        C8170 c8170 = new C8170();
        c8170.m18954(null, str);
        return c8170.m18953();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C13535) && ((C13535) obj).f38066.equals(this.f38066);
    }

    public final int hashCode() {
        return this.f38066.hashCode();
    }

    public final String toString() {
        return this.f38066;
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m30806(ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            arrayList2.add(str != null ? m30805(str, 0, str.length(), z) : null);
        }
        return C21562.unmodifiableList(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0052  */
    /* JADX INFO: renamed from: ֫ */
    public static String m30805(String str, int i, int i2, boolean z) {
        int i3;
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                C14268 c14268 = new C14268();
                c14268.m32781(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i3 = iCharCount + 2) < i2) {
                        int iM48482 = C21407.m48482(str.charAt(iCharCount + 1));
                        int iM48483 = C21407.m48482(str.charAt(i3));
                        if (iM48482 != -1 && iM48483 != -1) {
                            c14268.m56480writeByte((iM48482 << 4) + iM48483);
                            iCharCount = i3;
                        } else {
                            c14268.m32791(iCodePointAt);
                        }
                    } else if (iCodePointAt == 43 && z) {
                        c14268.m56480writeByte(32);
                    } else {
                        c14268.m32791(iCodePointAt);
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                return c14268.m32788();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m30808(int i, int i2, String str) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && C21407.m48482(str.charAt(i + 1)) != -1 && C21407.m48482(str.charAt(i3)) != -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m30804(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        int iCharCount = i;
        while (iCharCount < i2) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt >= 32 && iCodePointAt != 127 && ((iCodePointAt < 128 || !z4) && str2.indexOf(iCodePointAt) == -1 && ((iCodePointAt != 37 || (z && (!z2 || m30808(iCharCount, i2, str)))) && (iCodePointAt != 43 || !z3)))) {
                iCharCount += Character.charCount(iCodePointAt);
            } else {
                C14268 c14268 = new C14268();
                c14268.m32781(i, iCharCount, str);
                C14268 c14269 = null;
                while (iCharCount < i2) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z3) {
                            String str3 = z ? BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX : "%2B";
                            c14268.m32781(0, str3.length(), str3);
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= 128 && z4) || str2.indexOf(iCodePointAt2) != -1 || (iCodePointAt2 == 37 && (!z || (z2 && !m30808(iCharCount, i2, str)))))) {
                            if (c14269 == null) {
                                c14269 = new C14268();
                            }
                            c14269.m32791(iCodePointAt2);
                            while (!c14269.mo14213()) {
                                byte b = c14269.readByte();
                                c14268.m56480writeByte(37);
                                char[] cArr = f38064;
                                c14268.m56480writeByte((int) cArr[((b & 255) >> 4) & 15]);
                                c14268.m56480writeByte((int) cArr[b & 15]);
                            }
                        } else {
                            c14268.m32791(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                }
                return c14268.m32788();
            }
        }
        return str.substring(i, i2);
    }
}
