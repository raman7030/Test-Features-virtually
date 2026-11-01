package p067l;

/* JADX INFO: renamed from: l.ܰ᩶ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6OG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15717 extends AbstractC24937 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m35774(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n' || c == '\f';
    }

    @Override // p067l.AbstractC24937, p067l.InterfaceC3479
    public final InterfaceC2808 nextToken() {
        C22149.m49958();
        return super.nextToken();
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m35775(String str) {
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
                    if (i >= str.length() || !m35774(str.charAt(i)) || (str.charAt(i) == '\r' && (i2 = i2 + 2) < str.length() && str.charAt(i2) == '\n')) {
                    }
                }
                i2 = i;
            }
            i2++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m35773(String str) {
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
