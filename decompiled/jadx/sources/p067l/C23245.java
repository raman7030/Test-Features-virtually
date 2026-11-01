package p067l;

import java.net.ProtocolException;

/* JADX INFO: renamed from: l.᩹֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U4D5 */
/* JADX INFO: loaded from: classes.dex */
public final class C23245 {

    /* JADX INFO: renamed from: ֫ */
    public final int f73071;

    /* JADX INFO: renamed from: ۧ */
    public final String f73072;

    /* JADX INFO: renamed from: ܽ */
    public final EnumC16041 f73073;

    public C23245(EnumC16041 enumC16041, int i, String str) {
        this.f73073 = enumC16041;
        this.f73071 = i;
        this.f73072 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23245 m51791(String str) throws ProtocolException {
        EnumC16041 enumC16041;
        int i;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                enumC16041 = EnumC16041.HTTP_1_0;
            } else if (iCharAt == 1) {
                enumC16041 = EnumC16041.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (str.startsWith("ICY ")) {
            enumC16041 = EnumC16041.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new C23245(enumC16041, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f73073 == EnumC16041.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f73071);
        String str = this.f73072;
        if (str != null) {
            sb.append(' ');
            sb.append(str);
        }
        return sb.toString();
    }
}
