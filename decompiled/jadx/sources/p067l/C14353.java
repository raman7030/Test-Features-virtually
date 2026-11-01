package p067l;

/* JADX INFO: renamed from: l.۫᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35OG */
/* JADX INFO: loaded from: classes3.dex */
public final class C14353 {
    /* JADX INFO: renamed from: ֫ */
    public static int m32946(String str) {
        int i;
        boolean z;
        if (str == null) {
            throw new NumberFormatException("string is null");
        }
        if (str.length() == 0) {
            throw new NumberFormatException("string is blank");
        }
        char[] charArray = str.toCharArray();
        int i2 = 0;
        if (charArray[0] == '-') {
            i = 1;
            z = true;
        } else {
            i = 0;
            z = false;
        }
        int i3 = 10;
        if (charArray[i] == '0') {
            int i4 = i + 1;
            if (i4 == charArray.length) {
                return 0;
            }
            char c = charArray[i4];
            if (c == 'x' || c == 'X') {
                i += 2;
                i3 = 16;
            } else {
                i3 = Character.digit(c, 8) >= 0 ? 8 : 10;
                i = i4;
            }
        }
        int i5 = Integer.MAX_VALUE / (i3 / 2);
        while (i < charArray.length) {
            int iDigit = Character.digit(charArray[i], i3);
            if (iDigit < 0) {
                throw new NumberFormatException("The string contains an invalid digit - '" + charArray[i] + "'");
            }
            int i6 = i2 * i3;
            if (i2 > i5) {
                throw new NumberFormatException(str.concat(" cannot fit into an int"));
            }
            if (i6 < 0 && i6 >= (-iDigit)) {
                throw new NumberFormatException(str.concat(" cannot fit into an int"));
            }
            i2 = i6 + iDigit;
            i++;
        }
        if (!z || i2 == Integer.MIN_VALUE) {
            return i2;
        }
        if (i2 >= 0) {
            return i2 * (-1);
        }
        throw new NumberFormatException(str.concat(" cannot fit into an int"));
    }
}
