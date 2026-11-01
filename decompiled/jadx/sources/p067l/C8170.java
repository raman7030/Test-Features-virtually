package p067l;

import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۛܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M4F8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8170 {

    /* JADX INFO: renamed from: ֫ */
    public String f21568;

    /* JADX INFO: renamed from: ۜ */
    public String f21569;

    /* JADX INFO: renamed from: ܳ */
    public String f21571;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f21572;

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f21574;

    /* JADX INFO: renamed from: ܿ */
    public String f21573 = "";

    /* JADX INFO: renamed from: ۧ */
    public String f21570 = "";

    /* JADX INFO: renamed from: ᩻ */
    public int f21575 = -1;

    public C8170() {
        ArrayList arrayList = new ArrayList();
        this.f21572 = arrayList;
        arrayList.add("");
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13535 m18953() {
        if (this.f21569 == null) {
            throw new IllegalStateException("scheme == null");
        }
        if (this.f21571 == null) {
            throw new IllegalStateException("host == null");
        }
        return new C13535(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f21569;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (!this.f21573.isEmpty() || !this.f21570.isEmpty()) {
            sb.append(this.f21573);
            if (!this.f21570.isEmpty()) {
                sb.append(':');
                sb.append(this.f21570);
            }
            sb.append('@');
        }
        String str2 = this.f21571;
        if (str2 != null) {
            if (str2.indexOf(58) != -1) {
                sb.append('[');
                sb.append(this.f21571);
                sb.append(']');
            } else {
                sb.append(this.f21571);
            }
        }
        int iM30809 = this.f21575;
        if (iM30809 != -1 || this.f21569 != null) {
            if (iM30809 == -1) {
                iM30809 = C13535.m30809(this.f21569);
            }
            String str3 = this.f21569;
            if (str3 == null || iM30809 != C13535.m30809(str3)) {
                sb.append(':');
                sb.append(iM30809);
            }
        }
        ArrayList arrayList = this.f21572;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((String) arrayList.get(i));
        }
        if (this.f21574 != null) {
            sb.append('?');
            C13535.m30807(sb, this.f21574);
        }
        if (this.f21568 != null) {
            sb.append('#');
            sb.append(this.f21568);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18954(C13535 c13535, String str) {
        int i;
        byte b;
        byte b2;
        int iM48485;
        ArrayList arrayList;
        String str2;
        int i2;
        int i3;
        char c;
        ArrayList arrayList2;
        char cCharAt;
        char cCharAt2;
        int iM48502 = C21407.m48502(0, str.length(), str);
        int iM48505 = C21407.m48505(iM48502, str.length(), str);
        byte b3 = -1;
        if (iM48505 - iM48502 < 2 || (((cCharAt2 = str.charAt(iM48502)) < 'a' || cCharAt2 > 'z') && (cCharAt2 < 'A' || cCharAt2 > 'Z'))) {
            i = -1;
            break;
        }
        int i4 = iM48502 + 1;
        while (true) {
            if (i4 < iM48505) {
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
            if (str.regionMatches(true, iM48502, "https:", 0, 6)) {
                this.f21569 = C0171b.f688a;
                iM48502 += 6;
            } else {
                if (!str.regionMatches(true, iM48502, "http:", 0, 5)) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, i) + "'");
                }
                this.f21569 = C0170a.f680s;
                iM48502 += 5;
            }
        } else {
            if (c13535 == null) {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            this.f21569 = c13535.f38073;
        }
        int i5 = 0;
        int i6 = iM48502;
        while (true) {
            b = 47;
            b2 = 92;
            if (i6 >= iM48505 || !((cCharAt = str.charAt(i6)) == '\\' || cCharAt == '/')) {
                break;
            }
            i5++;
            i6++;
        }
        byte b4 = 63;
        ArrayList arrayList3 = this.f21572;
        byte b5 = 35;
        if (i5 >= 2 || c13535 == null || !c13535.f38073.equals(this.f21569)) {
            int i7 = iM48502 + i5;
            String str3 = str;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                iM48485 = C21407.m48485(str3, i7, iM48505, "@/\\?#");
                byte bCharAt = iM48485 != iM48505 ? str3.charAt(iM48485) : (byte) -1;
                if (bCharAt == b3 || bCharAt == b5 || bCharAt == b || bCharAt == b2 || bCharAt == b4) {
                    break;
                }
                if (bCharAt != 64) {
                    arrayList3 = arrayList3;
                } else {
                    if (z) {
                        i3 = iM48485;
                        this.f21570 += "%40" + C13535.m30804(str, i7, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                    } else {
                        int iM48484 = C21407.m48484(str3, i7, iM48485, ':');
                        i3 = iM48485;
                        String strM30804 = C13535.m30804(str, i7, iM48484, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
                        if (z2) {
                            strM30804 = C24420.m53894(new StringBuilder(), this.f21573, "%40", strM30804);
                        }
                        this.f21573 = strM30804;
                        if (iM48484 != i3) {
                            this.f21570 = C13535.m30804(str, iM48484 + 1, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
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
                if (i8 < iM48485) {
                    char cCharAt4 = str3.charAt(i8);
                    if (cCharAt4 == ':') {
                        break;
                    }
                    if (cCharAt4 == '[') {
                        do {
                            i8++;
                            if (i8 >= iM48485) {
                                break;
                            }
                        } while (str3.charAt(i8) != ']');
                    }
                    i8++;
                } else {
                    i8 = iM48485;
                    break;
                }
            }
            int i9 = i8 + 1;
            if (i9 < iM48485) {
                this.f21571 = C21407.m48487(C13535.m30805(str3, i7, i8, false));
                try {
                    i2 = Integer.parseInt(C13535.m30804(str3, i9, iM48485, "", false, false, false, true));
                    if (i2 <= 0 || i2 > 65535) {
                        i2 = -1;
                    }
                } catch (NumberFormatException unused) {
                }
                this.f21575 = i2;
                if (i2 == -1) {
                    throw new IllegalArgumentException("Invalid URL port: \"" + str3.substring(i9, iM48485) + '\"');
                }
            } else {
                this.f21571 = C21407.m48487(C13535.m30805(str3, i7, i8, false));
                this.f21575 = C13535.m30809(this.f21569);
            }
            if (this.f21571 == null) {
                throw new IllegalArgumentException("Invalid URL host: \"" + str3.substring(i7, i8) + '\"');
            }
            str2 = str3;
            iM48502 = iM48485;
        } else {
            this.f21573 = c13535.m30823();
            this.f21570 = c13535.m30812();
            this.f21571 = c13535.f38067;
            this.f21575 = c13535.f38070;
            arrayList3.clear();
            arrayList3.addAll(c13535.m30822());
            if (iM48502 == iM48505 || str.charAt(iM48502) == '#') {
                String strM30824 = c13535.m30824();
                this.f21574 = strM30824 != null ? C13535.m30811(C13535.m30804(strM30824, 0, strM30824.length(), " \"'<>#", true, false, true, true)) : null;
            }
            arrayList = arrayList3;
            str2 = str;
        }
        int iM48486 = C21407.m48485(str2, iM48502, iM48505, "?#");
        if (iM48502 != iM48486) {
            char cCharAt5 = str2.charAt(iM48502);
            if (cCharAt5 == '/' || cCharAt5 == '\\') {
                arrayList2 = arrayList;
                arrayList2.clear();
                arrayList2.add("");
                iM48502++;
            } else {
                arrayList2 = arrayList;
                arrayList2.set(arrayList.size() - 1, "");
            }
            int i10 = iM48502;
            while (i10 < iM48486) {
                int iM48487 = C21407.m48485(str2, i10, iM48486, "/\\");
                boolean z3 = iM48487 < iM48486;
                String strM30805 = C13535.m30804(str2, i10, iM48487, " \"<>^`{}|/\\?#", true, false, false, true);
                if (!strM30805.equals(".") && !strM30805.equalsIgnoreCase("%2e")) {
                    if (!strM30805.equals("..") && !strM30805.equalsIgnoreCase("%2e.") && !strM30805.equalsIgnoreCase(".%2e") && !strM30805.equalsIgnoreCase("%2e%2e")) {
                        if (((String) C20013.m45383(arrayList2, 1)).isEmpty()) {
                            arrayList2.set(arrayList2.size() - 1, strM30805);
                        } else {
                            arrayList2.add(strM30805);
                        }
                        if (z3) {
                            arrayList2.add("");
                        }
                    } else if (!((String) C6406.m14670(arrayList2, 1)).isEmpty() || arrayList2.isEmpty()) {
                        arrayList2.add("");
                    } else {
                        arrayList2.set(arrayList2.size() - 1, "");
                    }
                }
                if (z3) {
                    iM48487++;
                }
                i10 = iM48487;
            }
        }
        if (iM48486 >= iM48505 || str2.charAt(iM48486) != '?') {
            c = '#';
        } else {
            c = '#';
            int iM48488 = C21407.m48484(str2, iM48486, iM48505, '#');
            this.f21574 = C13535.m30811(C13535.m30804(str2, iM48486 + 1, iM48488, " \"'<>#", true, false, true, true));
            iM48486 = iM48488;
        }
        if (iM48486 >= iM48505 || str2.charAt(iM48486) != c) {
            return;
        }
        this.f21568 = C13535.m30804(str2, iM48486 + 1, iM48505, "", true, false, false, false);
    }
}
