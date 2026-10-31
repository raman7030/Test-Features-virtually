package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.ۜۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6BE */
/* JADX INFO: loaded from: classes2.dex */
public final class C6532 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f20174;

    public C6532(String str) {
        this.f20174 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18039(AbstractC20644 abstractC20644) {
        char cCharAt;
        String str = this.f20174;
        int length = str.length();
        int i = 0;
        if (str.charAt(0) == '<') {
            i = 2;
            do {
                int iIndexOf = str.indexOf(58, i);
                abstractC20644.mo24158(str.substring(i - 1, iIndexOf));
                int iM18038 = iIndexOf + 1;
                char cCharAt2 = str.charAt(iM18038);
                if (cCharAt2 == 'L' || cCharAt2 == '[' || cCharAt2 == 'T') {
                    iM18038 = m18038(str, iM18038, abstractC20644.mo24156());
                }
                while (true) {
                    i = iM18038 + 1;
                    cCharAt = str.charAt(iM18038);
                    if (cCharAt != ':') {
                        break;
                    } else {
                        iM18038 = m18038(str, i, abstractC20644.mo24159());
                    }
                }
            } while (cCharAt != '>');
        }
        if (str.charAt(i) == '(') {
            int iM18039 = i + 1;
            while (str.charAt(iM18039) != ')') {
                iM18039 = m18038(str, iM18039, abstractC20644.mo24166());
            }
            int iM180310 = m18038(str, iM18039 + 1, abstractC20644.mo24154());
            while (iM180310 < length) {
                iM180310 = m18038(str, iM180310 + 1, abstractC20644.mo24163());
            }
            return;
        }
        int iM180311 = m18038(str, i, abstractC20644.mo24165());
        while (iM180311 < length) {
            iM180311 = m18038(str, iM180311, abstractC20644.mo24162());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18040(AbstractC20644 abstractC20644) {
        m18038(this.f20174, 0, abstractC20644);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m18038(String str, int i, AbstractC20644 abstractC20644) {
        int iM18038 = i + 1;
        char cCharAt = str.charAt(i);
        if (cCharAt != 'F') {
            if (cCharAt == 'L') {
                boolean z = false;
                int i2 = iM18038;
                boolean z2 = false;
                while (true) {
                    int i3 = iM18038 + 1;
                    char cCharAt2 = str.charAt(iM18038);
                    if (cCharAt2 == '.' || cCharAt2 == ';') {
                        if (!z) {
                            String strSubstring = str.substring(i2, iM18038);
                            if (z2) {
                                abstractC20644.mo24161(strSubstring);
                            } else {
                                abstractC20644.mo24153(strSubstring);
                            }
                        }
                        if (cCharAt2 == ';') {
                            abstractC20644.mo24160();
                            return i3;
                        }
                        z = false;
                        z2 = true;
                        iM18038 = i3;
                        i2 = iM18038;
                    } else if (cCharAt2 == '<') {
                        String strSubstring2 = str.substring(i2, iM18038);
                        if (z2) {
                            abstractC20644.mo24161(strSubstring2);
                        } else {
                            abstractC20644.mo24153(strSubstring2);
                        }
                        iM18038 = i3;
                        while (true) {
                            char cCharAt3 = str.charAt(iM18038);
                            if (cCharAt3 == '>') {
                                break;
                            }
                            if (cCharAt3 == '*') {
                                iM18038++;
                                abstractC20644.mo24155();
                            } else if (cCharAt3 == '+' || cCharAt3 == '-') {
                                iM18038 = m18038(str, iM18038 + 1, abstractC20644.mo24157(cCharAt3));
                            } else {
                                iM18038 = m18038(str, iM18038, abstractC20644.mo24157(a.h));
                            }
                        }
                        z = true;
                    } else {
                        iM18038 = i3;
                    }
                }
            } else if (cCharAt != 'V' && cCharAt != 'I' && cCharAt != 'J' && cCharAt != 'S') {
                if (cCharAt == 'T') {
                    int iIndexOf = str.indexOf(59, iM18038);
                    abstractC20644.mo24164(str.substring(iM18038, iIndexOf));
                    return iIndexOf + 1;
                }
                if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        return m18038(str, iM18038, abstractC20644.mo24151());
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
        abstractC20644.mo24152(cCharAt);
        return iM18038;
    }
}
