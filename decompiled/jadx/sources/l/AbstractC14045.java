package l;

/* JADX INFO: renamed from: l.ܰ᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6OG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14045 extends AbstractC23747 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m33654(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n' || c == '\f';
    }

    @Override // l.AbstractC23747, l.InterfaceC1169
    public final InterfaceC0463 nextToken() {
        C20813.m47630();
        return super.nextToken();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m33655(String str) {
        int i;
        int iDigit;
        StringBuilder sb = new StringBuilder(str.length());
        int i2 = 0;
        while (i2 < str.length()) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\\' || i2 + 1 == str.length()) {
                sb.append(cCharAt);
            } else {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    i = i2 + 1;
                    if (i >= str.length() || i3 >= 6 || (iDigit = Character.digit(str.charAt(i), 16)) < 0 || str.charAt(i) > 127) {
                        break;
                    }
                    i4 = (i4 * 16) + iDigit;
                    i3++;
                    i2 = i;
                }
                if (i3 == 0) {
                    sb.append(str.charAt(i));
                } else {
                    if (i4 == 0 || i4 > 1114111 || (i4 >= 55296 && i4 <= 57343)) {
                        i4 = 65533;
                    }
                    sb.appendCodePoint(i4);
                    if (i >= str.length() || !m33654(str.charAt(i)) || (str.charAt(i) == '\r' && (i2 = i2 + 2) < str.length() && str.charAt(i2) == '\n')) {
                    }
                }
                i2 = i;
            }
            i2++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m33653(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                cCharAt = (char) (cCharAt + ' ');
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }
}
