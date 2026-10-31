package l;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M4F8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6104 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f18713;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f18714;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f18716;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f18717;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f18719;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f18718 = "";

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f18715 = "";

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f18720 = -1;

    public C6104() {
        ArrayList arrayList = new ArrayList();
        this.f18717 = arrayList;
        arrayList.add("");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11749 m17022() {
        if (this.f18714 == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (this.f18716 == null) {
            throw new IllegalStateException("host == null");
        }
        return new C11749(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f18714;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (!this.f18718.isEmpty() || !this.f18715.isEmpty()) {
            sb.append(this.f18718);
            if (!this.f18715.isEmpty()) {
                sb.append(':');
                sb.append(this.f18715);
            }
            sb.append('@');
        }
        String str2 = this.f18716;
        if (str2 != null) {
            if (str2.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f18716);
                sb.append(']');
            } else {
                sb.append(this.f18716);
            }
        }
        int iM28762 = this.f18720;
        if (iM28762 != -1 || this.f18714 != null) {
            if (iM28762 == -1) {
                iM28762 = C11749.m28762(this.f18714);
            }
            String str3 = this.f18714;
            if (str3 == null || iM28762 != C11749.m28762(str3)) {
                sb.append(':');
                sb.append(iM28762);
            }
        }
        ArrayList arrayList = this.f18717;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((String) arrayList.get(i));
        }
        if (this.f18719 != null) {
            sb.append('?');
            C11749.m28760(sb, this.f18719);
        }
        if (this.f18713 != null) {
            sb.append('#');
            sb.append(this.f18713);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17023(C11749 c11749, String str) {
        int i;
        byte b;
        byte b2;
        int iM46169;
        ArrayList arrayList;
        String str2;
        int i2;
        int i3;
        char c;
        ArrayList arrayList2;
        char cCharAt;
        char cCharAt2;
        int iM46186 = C20032.m46186(0, str.length(), str);
        int iM46189 = C20032.m46189(iM46186, str.length(), str);
        byte b3 = -1;
        if (iM46189 - iM46186 < 2 || (((cCharAt2 = str.charAt(iM46186)) < 'a' || cCharAt2 > 'z') && (cCharAt2 < 'A' || cCharAt2 > 'Z'))) {
            i = -1;
            break;
        }
        int i4 = iM46186 + 1;
        while (true) {
            if (i4 < iM46189) {
                char cCharAt3 = str.charAt(i4);
                if ((cCharAt3 >= 'a' && cCharAt3 <= 'z') || ((cCharAt3 >= 'A' && cCharAt3 <= 'Z') || ((cCharAt3 >= '0' && cCharAt3 <= '9') || cCharAt3 == '+' || cCharAt3 == '-' || cCharAt3 == '.'))) {
                    i4++;
                } else if (cCharAt3 == ':') {
                    i = i4;
                    break;
                }
            }
            i = -1;
            break;
        }
        if (i != -1) {
            if (str.regionMatches(true, iM46186, "https:", 0, 6)) {
                this.f18714 = b.a;
                iM46186 += 6;
            } else {
                if (!str.regionMatches(true, iM46186, "http:", 0, 5)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + "'");
                }
                this.f18714 = a.s;
                iM46186 += 5;
            }
        } else {
            if (c11749 == null) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            this.f18714 = c11749.f35074;
        }
        int i5 = 0;
        int i6 = iM46186;
        while (true) {
            b = 47;
            b2 = 92;
            if (i6 >= iM46189 || !((cCharAt = str.charAt(i6)) == '\\' || cCharAt == '/')) {
                break;
            }
            i5++;
            i6++;
        }
        byte b4 = 63;
        ArrayList arrayList3 = this.f18717;
        byte b5 = 35;
        if (i5 >= 2 || c11749 == null || !c11749.f35074.equals(this.f18714)) {
            int i7 = iM46186 + i5;
            String str3 = str;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                iM46169 = C20032.m46169(str3, i7, iM46189, "@/\\?#");
                byte bCharAt = iM46169 != iM46189 ? str3.charAt(iM46169) : (byte) -1;
                if (bCharAt == b3 || bCharAt == b5 || bCharAt == b || bCharAt == b2 || bCharAt == b4) {
                    break;
                }
                if (bCharAt != 64) {
                    arrayList3 = arrayList3;
                } else {
                    if (z) {
                        i3 = iM46169;
                        this.f18715 += "%40" + C11749.m28757(str, i7, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                    } else {
                        int iM46168 = C20032.m46168(str3, i7, iM46169, ':');
                        i3 = iM46169;
                        String strM28757 = C11749.m28757(str, i7, iM46168, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                        if (z2) {
                            strM28757 = C23202.m51498(new StringBuilder(), this.f18718, "%40", strM28757);
                        }
                        this.f18718 = strM28757;
                        if (iM46168 != i3) {
                            this.f18715 = C11749.m28757(str, iM46168 + 1, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                            z = true;
                        }
                        z2 = true;
                    }
                    i7 = i3 + 1;
                    str3 = str;
                }
                b5 = 35;
                b2 = 92;
                b4 = 63;
                arrayList3 = arrayList3;
                b3 = -1;
                b = 47;
            }
            arrayList = arrayList3;
            int i8 = i7;
            while (true) {
                if (i8 < iM46169) {
                    char cCharAt4 = str3.charAt(i8);
                    if (cCharAt4 == ':') {
                        break;
                    }
                    if (cCharAt4 == '[') {
                        do {
                            i8++;
                            if (i8 >= iM46169) {
                                break;
                            }
                        } while (str3.charAt(i8) != ']');
                    }
                    i8++;
                } else {
                    i8 = iM46169;
                    break;
                }
            }
            int i9 = i8 + 1;
            if (i9 < iM46169) {
                this.f18716 = C20032.m46171(C11749.m28758(str3, i7, i8, false));
                try {
                    i2 = Integer.parseInt(C11749.m28757(str3, i9, iM46169, "", false, false, false, true));
                    if (i2 <= 0 || i2 > 65535) {
                        i2 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.f18720 = i2;
                if (i2 == -1) {
                    throw new IllegalArgumentException("Invalid URL port: \"" + str3.substring(i9, iM46169) + '\"');
                }
            } else {
                this.f18716 = C20032.m46171(C11749.m28758(str3, i7, i8, false));
                this.f18720 = C11749.m28762(this.f18714);
            }
            if (this.f18716 == null) {
                throw new IllegalArgumentException("Invalid URL host: \"" + str3.substring(i7, i8) + '\"');
            }
            str2 = str3;
            iM46186 = iM46169;
        } else {
            this.f18718 = c11749.m28776();
            this.f18715 = c11749.m28765();
            this.f18716 = c11749.f35068;
            this.f18720 = c11749.f35071;
            arrayList3.clear();
            arrayList3.addAll(c11749.m28775());
            if (iM46186 == iM46189 || str.charAt(iM46186) == '#') {
                String strM28777 = c11749.m28777();
                this.f18719 = strM28777 != null ? C11749.m28764(C11749.m28757(strM28777, 0, strM28777.length(), " \"'<>#", true, false, true, true)) : null;
            }
            arrayList = arrayList3;
            str2 = str;
        }
        int iM461610 = C20032.m46169(str2, iM46186, iM46189, "?#");
        if (iM46186 != iM461610) {
            char cCharAt5 = str2.charAt(iM46186);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList2 = arrayList;
                arrayList2.clear();
                arrayList2.add("");
                iM46186++;
            } else {
                arrayList2 = arrayList;
                arrayList2.set(arrayList.size() - 1, "");
            }
            int i10 = iM46186;
            while (i10 < iM461610) {
                int iM461611 = C20032.m46169(str2, i10, iM461610, "/\\");
                boolean z3 = iM461611 < iM461610;
                String strM28758 = C11749.m28757(str2, i10, iM461611, " \"<>^`{}|/\\?#", true, false, false, true);
                if (!strM28758.equals(".") && !strM28758.equalsIgnoreCase("%2e")) {
                    if (!strM28758.equals("..") && !strM28758.equalsIgnoreCase("%2e.") && !strM28758.equalsIgnoreCase(".%2e") && !strM28758.equalsIgnoreCase("%2e%2e")) {
                        if (((String) C18566.m43105(arrayList2, 1)).isEmpty()) {
                            arrayList2.set(arrayList2.size() - 1, strM28758);
                        } else {
                            arrayList2.add(strM28758);
                        }
                        if (z3) {
                            arrayList2.add("");
                        }
                    } else if (!((String) C4248.m12790(arrayList2, 1)).isEmpty() || arrayList2.isEmpty()) {
                        arrayList2.add("");
                    } else {
                        arrayList2.set(arrayList2.size() - 1, "");
                    }
                }
                if (z3) {
                    iM461611++;
                }
                i10 = iM461611;
            }
        }
        if (iM461610 >= iM46189 || str2.charAt(iM461610) != '?') {
            c = '#';
        } else {
            c = '#';
            int iM461612 = C20032.m46168(str2, iM461610, iM46189, '#');
            this.f18719 = C11749.m28764(C11749.m28757(str2, iM461610 + 1, iM461612, " \"'<>#", true, false, true, true));
            iM461610 = iM461612;
        }
        if (iM461610 >= iM46189 || str2.charAt(iM461610) != c) {
            return;
        }
        this.f18713 = C11749.m28757(str2, iM461610 + 1, iM46189, "", true, false, false, false);
    }
}
