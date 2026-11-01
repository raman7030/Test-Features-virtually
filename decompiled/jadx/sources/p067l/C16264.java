package p067l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ܳܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35OG */
/* JADX INFO: loaded from: classes4.dex */
public final class C16264 {

    /* JADX INFO: renamed from: ۧ */
    public static Pattern f47830 = Pattern.compile("((-)?infinityf)|(nanf)", 2);

    /* JADX INFO: renamed from: ֫ */
    public static Pattern f47829 = Pattern.compile("((-)?infinityd?)|(nand?)", 2);

    /* JADX INFO: renamed from: ֫ */
    public static byte m37059(String str) {
        char[] charArray;
        boolean z;
        if (str == null) {
            throw new NumberFormatException("string is null");
        }
        if (str.length() == 0) {
            throw new NumberFormatException("string is blank");
        }
        int i = 1;
        byte b = 0;
        if (str.toUpperCase().endsWith("T")) {
            charArray = str.substring(0, str.length() - 1).toCharArray();
        } else {
            charArray = str.toCharArray();
        }
        if (charArray[0] == '-') {
            z = true;
        } else {
            i = 0;
            z = false;
        }
        byte b2 = 10;
        if (charArray[i] == '0') {
            int i2 = i + 1;
            if (i2 == charArray.length) {
                return (byte) 0;
            }
            char c = charArray[i2];
            if (c == 'x' || c == 'X') {
                i += 2;
                b2 = 16;
            } else {
                b2 = Character.digit(c, 8) >= 0 ? (byte) 8 : (byte) 10;
                i = i2;
            }
        }
        byte b3 = (byte) (127 / (b2 / 2));
        while (i < charArray.length) {
            int iDigit = Character.digit(charArray[i], (int) b2);
            if (iDigit < 0) {
                throw new NumberFormatException("The string contains invalid an digit - '" + charArray[i] + "'");
            }
            byte b4 = (byte) (b * b2);
            if (b > b3) {
                throw new NumberFormatException(str.concat(" cannot fit into a byte"));
            }
            if (b4 < 0 && b4 >= (-iDigit)) {
                throw new NumberFormatException(str.concat(" cannot fit into a byte"));
            }
            b = (byte) (b4 + iDigit);
            i++;
        }
        if (!z || b == -128) {
            return b;
        }
        if (b >= 0) {
            return (byte) (b * (-1));
        }
        throw new NumberFormatException(str.concat(" cannot fit into a byte"));
    }

    /* JADX INFO: renamed from: ܳ */
    public static short m37063(String str) {
        char[] charArray;
        boolean z;
        if (str == null) {
            throw new NumberFormatException("string is null");
        }
        if (str.length() == 0) {
            throw new NumberFormatException("string is blank");
        }
        int i = 1;
        short s = 0;
        if (str.toUpperCase().endsWith("S")) {
            charArray = str.substring(0, str.length() - 1).toCharArray();
        } else {
            charArray = str.toCharArray();
        }
        if (charArray[0] == '-') {
            z = true;
        } else {
            i = 0;
            z = false;
        }
        short s2 = 10;
        if (charArray[i] == '0') {
            int i2 = i + 1;
            if (i2 == charArray.length) {
                return (short) 0;
            }
            char c = charArray[i2];
            if (c == 'x' || c == 'X') {
                i += 2;
                s2 = 16;
            } else {
                s2 = Character.digit(c, 8) >= 0 ? (short) 8 : (short) 10;
                i = i2;
            }
        }
        short s3 = (short) (EnumC8055.f21261 / (s2 / 2));
        while (i < charArray.length) {
            int iDigit = Character.digit(charArray[i], (int) s2);
            if (iDigit < 0) {
                throw new NumberFormatException("The string contains invalid an digit - '" + charArray[i] + "'");
            }
            short s4 = (short) (s * s2);
            if (s > s3) {
                throw new NumberFormatException(str.concat(" cannot fit into a short"));
            }
            if (s4 < 0 && s4 >= (-iDigit)) {
                throw new NumberFormatException(str.concat(" cannot fit into a short"));
            }
            s = (short) (s4 + iDigit);
            i++;
        }
        if (!z || s == Short.MIN_VALUE) {
            return s;
        }
        if (s >= 0) {
            return (short) (s * (-1));
        }
        throw new NumberFormatException(str.concat(" cannot fit into a short"));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m37067(String str) {
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

    /* JADX INFO: renamed from: ܿ */
    public static long m37066(String str) {
        char[] charArray;
        if (str == null) {
            throw new NumberFormatException("string is null");
        }
        if (str.length() == 0) {
            throw new NumberFormatException("string is blank");
        }
        int i = 0;
        boolean z = true;
        if (str.toUpperCase().endsWith("L")) {
            charArray = str.substring(0, str.length() - 1).toCharArray();
        } else {
            charArray = str.toCharArray();
        }
        if (charArray[0] == '-') {
            i = 1;
        } else {
            z = false;
        }
        int i2 = 10;
        if (charArray[i] == '0') {
            int i3 = i + 1;
            if (i3 == charArray.length) {
                return 0L;
            }
            char c = charArray[i3];
            if (c == 'x' || c == 'X') {
                i += 2;
                i2 = 16;
            } else {
                i2 = Character.digit(c, 8) >= 0 ? 8 : 10;
                i = i3;
            }
        }
        long j = C14849.FOREVER_NS / ((long) (i2 / 2));
        long j2 = 0;
        while (i < charArray.length) {
            int iDigit = Character.digit(charArray[i], i2);
            if (iDigit < 0) {
                throw new NumberFormatException("The string contains an invalid digit - '" + charArray[i] + "'");
            }
            long j3 = ((long) i2) * j2;
            if (j2 > j) {
                throw new NumberFormatException(str.concat(" cannot fit into a long"));
            }
            if (j3 < 0 && j3 >= (-iDigit)) {
                throw new NumberFormatException(str.concat(" cannot fit into a long"));
            }
            j2 = ((long) iDigit) + j3;
            i++;
        }
        if (!z || j2 == Long.MIN_VALUE) {
            return j2;
        }
        if (j2 >= 0) {
            return j2 * (-1);
        }
        throw new NumberFormatException(str.concat(" cannot fit into a long"));
    }

    /* JADX INFO: renamed from: ܽ */
    public static float m37064(String str) {
        Matcher matcher = f47830.matcher(str);
        if (matcher.matches()) {
            if (matcher.start(1) != -1) {
                return matcher.start(2) != -1 ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
            }
            return Float.NaN;
        }
        return Float.parseFloat(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static double m37061(String str) {
        Matcher matcher = f47829.matcher(str);
        if (matcher.matches()) {
            if (matcher.start(1) != -1) {
                return matcher.start(2) != -1 ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
            }
            return Double.NaN;
        }
        return Double.parseDouble(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m37062(long j) {
        if (j > -1 || j < -2147483648L) {
            throw new NumberFormatException(Long.toString(j) + " cannot fit into an int");
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m37068(long j) {
        if (!(j > 65535) && !(j < -32768)) {
            return;
        }
        throw new NumberFormatException(Long.toString(j) + " cannot fit into a short");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37060(long j) {
        if (!(j > 255) && !(j < -128)) {
            return;
        }
        throw new NumberFormatException(Long.toString(j) + " cannot fit into a byte");
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m37065(long j) {
        if (!(j > 15) && !(j < -8)) {
            return;
        }
        throw new NumberFormatException(Long.toString(j) + " cannot fit into a nibble");
    }
}
