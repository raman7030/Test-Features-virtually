package p067l;

import android.text.TextUtils;

/* JADX INFO: renamed from: l.ᩴᩳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 068W */
/* JADX INFO: loaded from: classes4.dex */
public final class C20358 {

    /* JADX INFO: renamed from: ֫ */
    public static final C13259 f62875 = C13259.m30304("<[^<>\\s]+>?");

    /* JADX INFO: renamed from: ۧ */
    public static final C13259 f62876 = C13259.m30304("[/?]?>");

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
    /* JADX INFO: renamed from: ۧ */
    public static void m45950(CharSequence charSequence, int i, InterfaceC4935 interfaceC4935) {
        String strGroup;
        int iIndexOf;
        int iStart;
        int iEnd;
        int iStart2;
        int iEnd2;
        C13929 c13929Matcher;
        int iIndexOf2;
        int i2;
        if (i <= 0 || i >= charSequence.length()) {
            if (m45949(charSequence, i, interfaceC4935)) {
                return;
            }
            ((C17634) interfaceC4935).mo3486();
            return;
        }
        C13259 c13259 = f62875;
        C13929 c13929Matcher2 = c13259.matcher(charSequence);
        C13929 c13929Matcher3 = f62876.matcher(charSequence);
        boolean z = false;
        int i3 = -1;
        while (true) {
            if (z) {
                if (!c13929Matcher2.find(i3)) {
                    break;
                }
                if (z) {
                    z = false;
                }
                if (i <= c13929Matcher2.start()) {
                    if (m45949(charSequence, i, interfaceC4935)) {
                        return;
                    }
                    ((C17634) interfaceC4935).mo3486();
                    return;
                }
                strGroup = c13929Matcher2.group();
                if (strGroup.startsWith("<!--")) {
                    iIndexOf = TextUtils.indexOf(charSequence, "-->", c13929Matcher2.start() + 4);
                    if (iIndexOf == -1) {
                        ((C17634) interfaceC4935).mo3486();
                        return;
                    } else if (i < iIndexOf + 3) {
                        ((C17634) interfaceC4935).mo3486();
                        return;
                    }
                } else if (strGroup.endsWith(">")) {
                    if (i < c13929Matcher2.end()) {
                        ((C17634) interfaceC4935).mo3486();
                        return;
                    }
                } else {
                    iStart = c13929Matcher2.start();
                    iEnd = c13929Matcher2.end();
                    if (c13929Matcher3.find(iEnd)) {
                        iStart2 = -1;
                        break;
                    }
                    c13929Matcher = c13259.matcher(charSequence);
                    if (c13929Matcher.find(iEnd)) {
                        iStart2 = -2;
                        break;
                    }
                    while (true) {
                        if (c13929Matcher.start() <= c13929Matcher3.start()) {
                            if (c13929Matcher.group().startsWith("<!--")) {
                                iIndexOf2 = TextUtils.indexOf(charSequence, "-->", c13929Matcher.start() + 4);
                                if (iIndexOf2 == -1 || (c13929Matcher3.start() < (i2 = iIndexOf2 + 3) && !c13929Matcher3.find(i2))) {
                                    iStart2 = -1;
                                    break;
                                } else if (c13929Matcher.find(i2)) {
                                }
                            } else {
                                iStart2 = c13929Matcher.start();
                                break;
                            }
                        }
                        iStart2 = -2;
                        break;
                    }
                    if (iStart2 == -2) {
                        iEnd2 = c13929Matcher3.end();
                        if (i < c13929Matcher3.end()) {
                            if (m45948(charSequence, i, iStart, iEnd2, interfaceC4935)) {
                                return;
                            }
                            ((C17634) interfaceC4935).mo3486();
                            return;
                        }
                    } else if (iStart2 == -1) {
                        if (m45948(charSequence, i, iStart, charSequence.length(), interfaceC4935)) {
                            return;
                        }
                        ((C17634) interfaceC4935).mo3486();
                        return;
                    } else {
                        if (i <= iStart2) {
                            if (m45949(charSequence, i, interfaceC4935)) {
                                return;
                            }
                            ((C17634) interfaceC4935).mo3486();
                            return;
                        }
                        z = true;
                        i3 = iStart2;
                    }
                }
            } else {
                if (!c13929Matcher2.find()) {
                    break;
                }
                if (z) {
                    z = false;
                }
                if (i <= c13929Matcher2.start()) {
                    if (m45949(charSequence, i, interfaceC4935)) {
                        ((C17634) interfaceC4935).mo3486();
                        return;
                    }
                    return;
                }
                strGroup = c13929Matcher2.group();
                if (strGroup.startsWith("<!--")) {
                    iIndexOf = TextUtils.indexOf(charSequence, "-->", c13929Matcher2.start() + 4);
                    if (iIndexOf == -1) {
                        ((C17634) interfaceC4935).mo3486();
                        return;
                    } else if (i < iIndexOf + 3) {
                        ((C17634) interfaceC4935).mo3486();
                        return;
                    }
                } else if (strGroup.endsWith(">")) {
                    if (i < c13929Matcher2.end()) {
                        ((C17634) interfaceC4935).mo3486();
                        return;
                    }
                } else {
                    iStart = c13929Matcher2.start();
                    iEnd = c13929Matcher2.end();
                    if (c13929Matcher3.find(iEnd)) {
                        c13929Matcher = c13259.matcher(charSequence);
                        if (c13929Matcher.find(iEnd)) {
                            iStart2 = -2;
                            break;
                        }
                        while (true) {
                            if (c13929Matcher.start() <= c13929Matcher3.start()) {
                                if (c13929Matcher.group().startsWith("<!--")) {
                                    iIndexOf2 = TextUtils.indexOf(charSequence, "-->", c13929Matcher.start() + 4);
                                    if (iIndexOf2 == -1) {
                                        if (c13929Matcher.find(i2)) {
                                        }
                                    }
                                    iStart2 = -1;
                                    break;
                                }
                                iStart2 = c13929Matcher.start();
                                break;
                            }
                            iStart2 = -2;
                            break;
                        }
                    }
                    iStart2 = -1;
                    break;
                    if (iStart2 == -2) {
                        iEnd2 = c13929Matcher3.end();
                        if (i < c13929Matcher3.end()) {
                            if (m45948(charSequence, i, iStart, iEnd2, interfaceC4935)) {
                                ((C17634) interfaceC4935).mo3486();
                                return;
                            }
                            return;
                        }
                    } else if (iStart2 == -1) {
                        if (m45948(charSequence, i, iStart, charSequence.length(), interfaceC4935)) {
                            ((C17634) interfaceC4935).mo3486();
                            return;
                        }
                        return;
                    } else {
                        if (i <= iStart2) {
                            if (m45949(charSequence, i, interfaceC4935)) {
                                ((C17634) interfaceC4935).mo3486();
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
        if (m45949(charSequence, i, interfaceC4935)) {
            return;
        }
        ((C17634) interfaceC4935).mo3486();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m45949(CharSequence charSequence, int i, InterfaceC4935 interfaceC4935) {
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
        ((C17634) interfaceC4935).f52694.f62758.clear();
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m45948(CharSequence charSequence, int i, int i2, int i3, InterfaceC4935 interfaceC4935) {
        String strM40201;
        int i4 = i2 + 1;
        C6276 c6276 = new C6276(charSequence.subSequence(i4, i3).toString().toCharArray(), i4);
        c6276.m14247();
        if (i <= c6276.m14245()) {
            charSequence.subSequence(i4, i).toString();
            ((C17634) interfaceC4935).f52694.f62758.clear();
            return true;
        }
        c6276.m14248();
        if (i > c6276.m14245()) {
            do {
                int iM14245 = c6276.m14245();
                String strM14247 = c6276.m14247();
                if (i <= c6276.m14245()) {
                    String string = charSequence.subSequence(iM14245, i).toString();
                    C20318 c20318 = ((C17634) interfaceC4935).f52694;
                    c20318.f62757.m40202(charSequence);
                    c20318.f62761.m10390(string);
                    c20318.f62766 = 2;
                    if (!c20318.f62758.isEmpty()) {
                        c20318.f62765 = iM14245;
                        c20318.f62759 = string.length() + iM14245;
                        return true;
                    }
                } else {
                    c6276.m14248();
                    if (i <= c6276.m14245() || c6276.m14246() != 61) {
                        break;
                    }
                    c6276.m14248();
                    if (i <= c6276.m14245()) {
                        break;
                    }
                    int iM14246 = c6276.m14245() + 1;
                    int iM14247 = c6276.m14246();
                    if (iM14247 != 34 && iM14247 != 39) {
                        break;
                    }
                    for (int iM14248 = c6276.m14246(); iM14248 != -1 && iM14248 != iM14247; iM14248 = c6276.m14246()) {
                    }
                    if (i <= c6276.m14245()) {
                        if (iM14246 > i || i == c6276.m14245()) {
                            break;
                            break;
                        }
                        String string2 = charSequence.subSequence(iM14246, i).toString();
                        C20318 c20319 = ((C17634) interfaceC4935).f52694;
                        c20319.f62757.m40202(charSequence);
                        String[] strArrSplit = strM14247.split(":", 2);
                        if (strArrSplit.length == 2) {
                            strM40201 = c20319.f62757.m40201(strArrSplit[0]);
                            strM14247 = strArrSplit[1];
                        } else {
                            strM40201 = "";
                        }
                        C18344 c18344M43189 = c20319.f62768.m32845().m43189(strM40201, strM14247, c20319.f62764);
                        if (c18344M43189 != null) {
                            c20319.f62767.m14150(c18344M43189, string2);
                            c20319.f62766 = 1;
                            if (!c20319.f62758.isEmpty()) {
                                c20319.f62765 = iM14246;
                                c20319.f62759 = string2.length() + iM14246;
                                return true;
                            }
                        }
                    } else {
                        c6276.m14248();
                    }
                }
                return true;
            } while (i > c6276.m14245());
        }
        return false;
    }
}
