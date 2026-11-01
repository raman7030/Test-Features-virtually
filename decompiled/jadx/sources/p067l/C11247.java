package p067l;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: renamed from: l.ۢۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7GP */
/* JADX INFO: loaded from: classes3.dex */
public final class C11247 {

    /* JADX INFO: renamed from: ۧ */
    public final StringBuilder f31312 = new StringBuilder();

    /* JADX INFO: renamed from: ֫ */
    public final C17441 f31311 = new C17441();

    /* JADX INFO: renamed from: ֫ */
    public final void m26108(String str) throws C3870, IOException {
        (str != null ? Integer.valueOf(str.length()) : "null").toString();
        if ((str == null || str.length() >= 500) && str != null) {
            str.substring(0, 500);
        }
        C17441 c17441 = this.f31311;
        c17441.clear();
        StringBuilder sb = this.f31312;
        sb.setLength(0);
        C9196 c9196 = new C9196();
        c9196.m21166(new StringReader(str));
        for (int iM21178 = c9196.m21178(); iM21178 != 1; iM21178 = c9196.m21167()) {
            if (iM21178 == 4) {
                String strM21175 = c9196.m21175();
                if (strM21175 != null) {
                    m26106(strM21175);
                }
                if (strM21175 != null && !strM21175.isEmpty()) {
                    int iM21170 = c9196.m21170();
                    sb.length();
                    c17441.getClass();
                    for (int i = 0; i < strM21175.length(); i++) {
                        char cCharAt = strM21175.charAt(i);
                        sb.append(cCharAt);
                        c17441.add(iM21170 + i);
                        if (strM21175.length() <= 50) {
                            sb.length();
                            m26105(cCharAt);
                        }
                    }
                    if (strM21175.length() > 50) {
                        sb.length();
                        sb.length();
                    }
                }
            }
        }
        sb.length();
        c17441.getClass();
        if (sb.length() < 200) {
            m26106(sb.toString());
        } else {
            m26106(sb.substring(0, 200));
        }
        if (c17441.isEmpty()) {
            return;
        }
        int iMin = Math.min(c17441.size(), 50);
        for (int i2 = 0; i2 < iMin; i2++) {
            c17441.getInt(i2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m26107(int i) {
        C17441 c17441 = this.f31311;
        c17441.getClass();
        if (i < 0) {
            return -1;
        }
        if (i == c17441.size()) {
            if (c17441.isEmpty()) {
                return 0;
            }
            return c17441.getInt(c17441.size() - 1) + 1;
        }
        if (i > c17441.size()) {
            c17441.getClass();
            return -1;
        }
        int i2 = c17441.getInt(i);
        StringBuilder sb = this.f31312;
        m26105(i < sb.length() ? sb.charAt(i) : '?');
        return i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m26106(String str) {
        return str == null ? "null" : str.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26105(char c) {
        if (c == '\t' || c == '\n' || c == '\r' || c == ' ') {
            return;
        }
        String.valueOf(c);
    }
}
