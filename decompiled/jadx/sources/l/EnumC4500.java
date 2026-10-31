package l;

/* JADX INFO: renamed from: l.ۙ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AUH */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC4500 {
    CamelCase,
    PascalCase,
    SnakeCase,
    KebabCase;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m13252(String str) {
        char cCharAt;
        int i = C20023.f64847[ordinal()];
        int i2 = 0;
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            while (i2 < str.length()) {
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                    char c = (char) (cCharAt2 + ' ');
                    if (i2 > 0) {
                        sb.append('_');
                    }
                    sb.append(c);
                } else {
                    sb.append(cCharAt2);
                }
                i2++;
            }
            return sb.toString();
        }
        if (i == 2) {
            StringBuilder sb2 = new StringBuilder();
            while (i2 < str.length()) {
                char cCharAt3 = str.charAt(i2);
                if (cCharAt3 >= 'A' && cCharAt3 <= 'Z') {
                    char c2 = (char) (cCharAt3 + ' ');
                    if (i2 > 0) {
                        sb2.append('-');
                    }
                    sb2.append(c2);
                } else {
                    sb2.append(cCharAt3);
                }
                i2++;
            }
            return sb2.toString();
        }
        if (i != 3) {
            if (i != 4 || (cCharAt = str.charAt(0)) < 'A' || cCharAt > 'Z') {
                return str;
            }
            char[] charArray = str.toCharArray();
            charArray[0] = (char) (charArray[0] + ' ');
            return new String(charArray);
        }
        char cCharAt4 = str.charAt(0);
        if (cCharAt4 < 'a' || cCharAt4 > 'z') {
            return str;
        }
        char[] charArray2 = str.toCharArray();
        charArray2[0] = (char) (charArray2[0] - ' ');
        return new String(charArray2);
    }
}
