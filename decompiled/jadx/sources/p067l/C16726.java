package p067l;

/* JADX INFO: renamed from: l.ܶ۠ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 04TE */
/* JADX INFO: loaded from: classes4.dex */
public final class C16726 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m37958(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m37957(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m37958(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m37958(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m37960(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m37959(String str, String str2) {
        char c;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                char cCharAt2 = str2.charAt(i);
                if (cCharAt == cCharAt2 || ((c = (char) ((cCharAt | ' ') - 97)) < 26 && c == ((char) ((cCharAt2 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }
}
