package l;

import java.net.ProtocolException;

/* JADX INFO: renamed from: l.᩹֫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U4D5 */
/* JADX INFO: loaded from: classes.dex */
public final class C21967 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f70360;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f70361;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC14386 f70362;

    public C21967(EnumC14386 enumC14386, int i, String str) {
        this.f70362 = enumC14386;
        this.f70360 = i;
        this.f70361 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21967 m49454(String str) throws ProtocolException {
        EnumC14386 enumC14386;
        int i;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                enumC14386 = EnumC14386.HTTP_1_0;
            } else if (iCharAt == 1) {
                enumC14386 = EnumC14386.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (str.startsWith("ICY ")) {
            enumC14386 = EnumC14386.HTTP_1_0;
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
            return new C21967(enumC14386, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f70362 == EnumC14386.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f70360);
        String str = this.f70361;
        if (str != null) {
            sb.append(' ');
            sb.append(str);
        }
        return sb.toString();
    }
}
