package l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ᩴᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 068W */
/* JADX INFO: loaded from: classes4.dex */
public final class C18928 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C11459 f59644 = C11459.m28260("<[^<>\\s]+>?");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C11459 f59645 = C11459.m28260("[/?]?>");

    /* JADX WARN: Code duplicated, block: B:100:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0019 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[LOOP:1: B:42:0x0095->B:111:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0095 A[LOOP:1: B:42:0x0095->B:111:?, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c5 A[EDGE_INSN: B:54:0x00c5->B:60:0x00d4 BREAK  A[LOOP:1: B:42:0x0095->B:111:?]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d3 A[EDGE_INSN: B:59:0x00d3->B:60:0x00d4 BREAK  A[LOOP:1: B:42:0x0095->B:111:?]] */
    /* JADX WARN: Code duplicated, block: B:65:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0106  */
    /* JADX WARN: Code duplicated, block: B:77:0x010c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x004b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0100 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m43684(CharSequence charSequence, int i, InterfaceC2700 interfaceC2700) {
        String strGroup;
        int iIndexOf;
        int iStart;
        int iEnd;
        int iStart2;
        int iEnd2;
        C12164 c12164Matcher;
        int iIndexOf2;
        int i2;
        if (i <= 0 || i >= charSequence.length()) {
            if (m43683(charSequence, i, interfaceC2700)) {
                return;
            }
            ((C16062) interfaceC2700).mo1090();
            return;
        }
        C11459 c11459 = f59644;
        C12164 c12164Matcher2 = c11459.matcher(charSequence);
        C12164 c12164Matcher3 = f59645.matcher(charSequence);
        boolean z = false;
        int i3 = -1;
        while (true) {
            if (z) {
                if (!c12164Matcher2.find(i3)) {
                    break;
                }
                if (z) {
                    z = false;
                }
                if (i <= c12164Matcher2.start()) {
                    if (m43683(charSequence, i, interfaceC2700)) {
                        return;
                    }
                    ((C16062) interfaceC2700).mo1090();
                    return;
                }
                strGroup = c12164Matcher2.group();
                if (strGroup.startsWith("<!--")) {
                    iIndexOf = TextUtils.indexOf(charSequence, "-->", c12164Matcher2.start() + 4);
                    if (iIndexOf == -1) {
                        ((C16062) interfaceC2700).mo1090();
                        return;
                    } else if (i < iIndexOf + 3) {
                        ((C16062) interfaceC2700).mo1090();
                        return;
                    }
                } else if (strGroup.endsWith(">")) {
                    if (i < c12164Matcher2.end()) {
                        ((C16062) interfaceC2700).mo1090();
                        return;
                    }
                } else {
                    iStart = c12164Matcher2.start();
                    iEnd = c12164Matcher2.end();
                    if (c12164Matcher3.find(iEnd)) {
                        iStart2 = -1;
                        break;
                    }
                    c12164Matcher = c11459.matcher(charSequence);
                    if (c12164Matcher.find(iEnd)) {
                        iStart2 = -2;
                        break;
                    }
                    while (true) {
                        if (c12164Matcher.start() <= c12164Matcher3.start()) {
                            if (c12164Matcher.group().startsWith("<!--")) {
                                iIndexOf2 = TextUtils.indexOf(charSequence, "-->", c12164Matcher.start() + 4);
                                if (iIndexOf2 == -1 || (c12164Matcher3.start() < (i2 = iIndexOf2 + 3) && !c12164Matcher3.find(i2))) {
                                    iStart2 = -1;
                                    break;
                                } else if (c12164Matcher.find(i2)) {
                                }
                            } else {
                                iStart2 = c12164Matcher.start();
                                break;
                            }
                        }
                        iStart2 = -2;
                        break;
                    }
                    if (iStart2 == -2) {
                        iEnd2 = c12164Matcher3.end();
                        if (i < c12164Matcher3.end()) {
                            if (m43682(charSequence, i, iStart, iEnd2, interfaceC2700)) {
                                return;
                            }
                            ((C16062) interfaceC2700).mo1090();
                            return;
                        }
                    } else if (iStart2 == -1) {
                        if (m43682(charSequence, i, iStart, charSequence.length(), interfaceC2700)) {
                            return;
                        }
                        ((C16062) interfaceC2700).mo1090();
                        return;
                    } else {
                        if (i <= iStart2) {
                            if (m43683(charSequence, i, interfaceC2700)) {
                                return;
                            }
                            ((C16062) interfaceC2700).mo1090();
                            return;
                        }
                        z = true;
                        i3 = iStart2;
                    }
                }
            } else {
                if (!c12164Matcher2.find()) {
                    break;
                }
                if (z) {
                    z = false;
                }
                if (i <= c12164Matcher2.start()) {
                    if (m43683(charSequence, i, interfaceC2700)) {
                        ((C16062) interfaceC2700).mo1090();
                        return;
                    }
                    return;
                }
                strGroup = c12164Matcher2.group();
                if (strGroup.startsWith("<!--")) {
                    iIndexOf = TextUtils.indexOf(charSequence, "-->", c12164Matcher2.start() + 4);
                    if (iIndexOf == -1) {
                        ((C16062) interfaceC2700).mo1090();
                        return;
                    } else if (i < iIndexOf + 3) {
                        ((C16062) interfaceC2700).mo1090();
                        return;
                    }
                } else if (strGroup.endsWith(">")) {
                    if (i < c12164Matcher2.end()) {
                        ((C16062) interfaceC2700).mo1090();
                        return;
                    }
                } else {
                    iStart = c12164Matcher2.start();
                    iEnd = c12164Matcher2.end();
                    if (c12164Matcher3.find(iEnd)) {
                        c12164Matcher = c11459.matcher(charSequence);
                        if (c12164Matcher.find(iEnd)) {
                            iStart2 = -2;
                            break;
                        }
                        while (true) {
                            if (c12164Matcher.start() <= c12164Matcher3.start()) {
                                if (c12164Matcher.group().startsWith("<!--")) {
                                    iIndexOf2 = TextUtils.indexOf(charSequence, "-->", c12164Matcher.start() + 4);
                                    if (iIndexOf2 == -1) {
                                        if (c12164Matcher.find(i2)) {
                                        }
                                    }
                                    iStart2 = -1;
                                    break;
                                }
                                iStart2 = c12164Matcher.start();
                                break;
                            }
                            iStart2 = -2;
                            break;
                        }
                    }
                    iStart2 = -1;
                    break;
                    if (iStart2 == -2) {
                        iEnd2 = c12164Matcher3.end();
                        if (i < c12164Matcher3.end()) {
                            if (m43682(charSequence, i, iStart, iEnd2, interfaceC2700)) {
                                ((C16062) interfaceC2700).mo1090();
                                return;
                            }
                            return;
                        }
                    } else if (iStart2 == -1) {
                        if (m43682(charSequence, i, iStart, charSequence.length(), interfaceC2700)) {
                            ((C16062) interfaceC2700).mo1090();
                            return;
                        }
                        return;
                    } else {
                        if (i <= iStart2) {
                            if (m43683(charSequence, i, interfaceC2700)) {
                                ((C16062) interfaceC2700).mo1090();
                                return;
                            }
                            return;
                        }
                        z = true;
                        i3 = iStart2;
                    }
                }
            }
        }
        if (m43683(charSequence, i, interfaceC2700)) {
            return;
        }
        ((C16062) interfaceC2700).mo1090();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43683(CharSequence charSequence, int i, InterfaceC2700 interfaceC2700) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            char cCharAt = charSequence.charAt(i);
            if (Character.isWhitespace(cCharAt)) {
                break;
            }
            sb.insert(0, cCharAt);
        }
        if (sb.length() <= 0 || sb.charAt(0) != '<') {
            return false;
        }
        sb.deleteCharAt(0);
        ((C16062) interfaceC2700).f49531.f59529.clear();
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43682(CharSequence charSequence, int i, int i2, int i3, InterfaceC2700 interfaceC2700) {
        String strM38010;
        int i4 = i2 + 1;
        C4111 c4111 = new C4111(charSequence.subSequence(i4, i3).toString().toCharArray(), i4);
        c4111.m12342();
        if (i <= c4111.m12340()) {
            charSequence.subSequence(i4, i).toString();
            ((C16062) interfaceC2700).f49531.f59529.clear();
            return true;
        }
        c4111.m12343();
        if (i > c4111.m12340()) {
            do {
                int iM12340 = c4111.m12340();
                String strM12342 = c4111.m12342();
                if (i <= c4111.m12340()) {
                    String string = charSequence.subSequence(iM12340, i).toString();
                    C18886 c18886 = ((C16062) interfaceC2700).f49531;
                    c18886.f59528.m38011(charSequence);
                    c18886.f59532.m8346(string);
                    c18886.f59537 = 2;
                    if (!c18886.f59529.isEmpty()) {
                        c18886.f59536 = iM12340;
                        c18886.f59530 = string.length() + iM12340;
                        return true;
                    }
                } else {
                    c4111.m12343();
                    if (i <= c4111.m12340() || c4111.m12341() != 61) {
                        break;
                    }
                    c4111.m12343();
                    if (i <= c4111.m12340()) {
                        break;
                    }
                    int iM12341 = c4111.m12340() + 1;
                    int iM12342 = c4111.m12341();
                    if (iM12342 != 34 && iM12342 != 39) {
                        break;
                    }
                    for (int iM12343 = c4111.m12341(); iM12343 != -1 && iM12343 != iM12342; iM12343 = c4111.m12341()) {
                    }
                    if (i <= c4111.m12340()) {
                        if (iM12341 > i || i == c4111.m12340()) {
                            break;
                            break;
                        }
                        String string2 = charSequence.subSequence(iM12341, i).toString();
                        C18886 c18887 = ((C16062) interfaceC2700).f49531;
                        c18887.f59528.m38011(charSequence);
                        String[] strArrSplit = strM12342.split(":", 2);
                        if (strArrSplit.length == 2) {
                            strM38010 = c18887.f59528.m38010(strArrSplit[0]);
                            strM12342 = strArrSplit[1];
                        } else {
                            strM38010 = "";
                        }
                        C16809 c16809M40931 = c18887.f59539.m30773().m40931(strM38010, strM12342, c18887.f59535);
                        if (c16809M40931 != null) {
                            c18887.f59538.m12229(c16809M40931, string2);
                            c18887.f59537 = 1;
                            if (!c18887.f59529.isEmpty()) {
                                c18887.f59536 = iM12341;
                                c18887.f59530 = string2.length() + iM12341;
                                return true;
                            }
                        }
                    } else {
                        c4111.m12343();
                    }
                }
                return true;
            } while (i > c4111.m12340());
        }
        return false;
    }
}
