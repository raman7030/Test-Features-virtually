package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;

/* JADX INFO: renamed from: l.ۜۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6BE */
/* JADX INFO: loaded from: classes2.dex */
public final class C8576 {

    /* JADX INFO: renamed from: ֫ */
    public final String f23052;

    public C8576(String str) {
        this.f23052 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m19989(AbstractC21988 abstractC21988) {
        char cCharAt;
        String str = this.f23052;
        int length = str.length();
        int i = 0;
        if (str.charAt(0) == '<') {
            i = 2;
            do {
                int iIndexOf = str.indexOf(58, i);
                abstractC21988.mo26168(str.substring(i - 1, iIndexOf));
                int iM19988 = iIndexOf + 1;
                char cCharAt2 = str.charAt(iM19988);
                if (cCharAt2 == 'L' || cCharAt2 == '[' || cCharAt2 == 'T') {
                    iM19988 = m19988(str, iM19988, abstractC21988.mo26166());
                }
                while (true) {
                    i = iM19988 + 1;
                    cCharAt = str.charAt(iM19988);
                    if (cCharAt != ':') {
                        break;
                    } else {
                        iM19988 = m19988(str, i, abstractC21988.mo26169());
                    }
                }
            } while (cCharAt != '>');
        }
        if (str.charAt(i) == '(') {
            int iM19989 = i + 1;
            while (str.charAt(iM19989) != ')') {
                iM19989 = m19988(str, iM19989, abstractC21988.mo26176());
            }
            int iM199810 = m19988(str, iM19989 + 1, abstractC21988.mo26164());
            while (iM199810 < length) {
                iM199810 = m19988(str, iM199810 + 1, abstractC21988.mo26173());
            }
            return;
        }
        int iM199811 = m19988(str, i, abstractC21988.mo26175());
        while (iM199811 < length) {
            iM199811 = m19988(str, iM199811, abstractC21988.mo26172());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m19990(AbstractC21988 abstractC21988) {
        m19988(this.f23052, 0, abstractC21988);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m19988(String str, int i, AbstractC21988 abstractC21988) {
        int iM19988 = i + 1;
        char cCharAt = str.charAt(i);
        if (cCharAt != 'F') {
            if (cCharAt == 'L') {
                boolean z = false;
                int i2 = iM19988;
                boolean z2 = false;
                while (true) {
                    int i3 = iM19988 + 1;
                    char cCharAt2 = str.charAt(iM19988);
                    if (cCharAt2 == '.' || cCharAt2 == ';') {
                        if (!z) {
                            String strSubstring = str.substring(i2, iM19988);
                            if (z2) {
                                abstractC21988.mo26171(strSubstring);
                            } else {
                                abstractC21988.mo26163(strSubstring);
                            }
                        }
                        if (cCharAt2 == ';') {
                            abstractC21988.mo26170();
                            return i3;
                        }
                        z = false;
                        z2 = true;
                        iM19988 = i3;
                        i2 = iM19988;
                    } else if (cCharAt2 == '<') {
                        String strSubstring2 = str.substring(i2, iM19988);
                        if (z2) {
                            abstractC21988.mo26171(strSubstring2);
                        } else {
                            abstractC21988.mo26163(strSubstring2);
                        }
                        iM19988 = i3;
                        while (true) {
                            char cCharAt3 = str.charAt(iM19988);
                            if (cCharAt3 == '>') {
                                break;
                            }
                            if (cCharAt3 == '*') {
                                iM19988++;
                                abstractC21988.mo26165();
                            } else if (cCharAt3 == '+' || cCharAt3 == '-') {
                                iM19988 = m19988(str, iM19988 + 1, abstractC21988.mo26167(cCharAt3));
                            } else {
                                iM19988 = m19988(str, iM19988, abstractC21988.mo26167(C0184a.f880h));
                            }
                        }
                        z = true;
                    } else {
                        iM19988 = i3;
                    }
                }
            } else if (cCharAt != 'V' && cCharAt != 'I' && cCharAt != 'J' && cCharAt != 'S') {
                if (cCharAt == 'T') {
                    int iIndexOf = str.indexOf(59, iM19988);
                    abstractC21988.mo26174(str.substring(iM19988, iIndexOf));
                    return iIndexOf + 1;
                }
                if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        return m19988(str, iM19988, abstractC21988.mo26161());
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                        case 'D':
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                }
            }
        }
        abstractC21988.mo26162(cCharAt);
        return iM19988;
    }
}
