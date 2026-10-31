package l;

import java.io.IOException;
import java.io.StringReader;

/* JADX INFO: renamed from: l.ۢۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: X7GP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9342 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f28363 = new StringBuilder();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15859 f28362 = new C15859();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24099(String str) throws C1580, IOException {
        (str != null ? Integer.valueOf(str.length()) : "null").toString();
        if ((str == null || str.length() >= 500) && str != null) {
            str.substring(0, 500);
        }
        C15859 c15859 = this.f28362;
        c15859.clear();
        StringBuilder sb = this.f28363;
        sb.setLength(0);
        C7184 c7184 = new C7184();
        c7184.m19219(new StringReader(str));
        for (int iM19231 = c7184.m19231(); iM19231 != 1; iM19231 = c7184.m19220()) {
            if (iM19231 == 4) {
                String strM19228 = c7184.m19228();
                if (strM19228 != null) {
                    m24097(strM19228);
                }
                if (strM19228 != null && !strM19228.isEmpty()) {
                    int iM19223 = c7184.m19223();
                    sb.length();
                    c15859.getClass();
                    for (int i = 0; i < strM19228.length(); i++) {
                        char cCharAt = strM19228.charAt(i);
                        sb.append(cCharAt);
                        c15859.add(iM19223 + i);
                        if (strM19228.length() <= 50) {
                            sb.length();
                            m24096(cCharAt);
                        }
                    }
                    if (strM19228.length() > 50) {
                        sb.length();
                        sb.length();
                    }
                }
            }
        }
        sb.length();
        c15859.getClass();
        if (sb.length() < 200) {
            m24097(sb.toString());
        } else {
            m24097(sb.substring(0, 200));
        }
        if (c15859.isEmpty()) {
            return;
        }
        int iMin = Math.min(c15859.size(), 50);
        for (int i2 = 0; i2 < iMin; i2++) {
            c15859.getInt(i2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m24098(int i) {
        C15859 c15859 = this.f28362;
        c15859.getClass();
        if (i < 0) {
            return -1;
        }
        if (i == c15859.size()) {
            if (c15859.isEmpty()) {
                return 0;
            }
            return c15859.getInt(c15859.size() - 1) + 1;
        }
        if (i > c15859.size()) {
            c15859.getClass();
            return -1;
        }
        int i2 = c15859.getInt(i);
        StringBuilder sb = this.f28363;
        m24096(i < sb.length() ? sb.charAt(i) : '?');
        return i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m24097(String str) {
        return str == null ? "null" : str.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24096(char c) {
        if (c == '\t' || c == '\n' || c == '\r' || c == ' ') {
            return;
        }
        String.valueOf(c);
    }
}
