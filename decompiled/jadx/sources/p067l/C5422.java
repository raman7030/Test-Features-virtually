package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۗۨۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: L530 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5422 {

    /* JADX INFO: renamed from: ᩳ */
    public static final float[] f12915 = {0.00390625f, 3.051758E-5f, 1.192093E-7f, 4.656613E-10f};

    /* JADX INFO: renamed from: ֫ */
    public static final String[] f12912 = {"px", "dp", "sp", "pt", "in", "mm", "", ""};

    /* JADX INFO: renamed from: ܽ */
    public static final String[] f12914 = {"%", "%p", "", "", "", "", "", ""};

    /* JADX INFO: renamed from: ۧ */
    public static final int[] f12913 = {100, 100, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: ֫ */
    public static String m11903(int i, int i2) {
        float f = (i & (-256)) * i2 * f12915[(i >> 4) & 3];
        char[] charArray = String.format(Locale.ENGLISH, "%f", Float.valueOf(f)).toCharArray();
        int length = charArray.length - 1;
        while (length > 0) {
            char c = charArray[length];
            if (c != '0') {
                if (c != '.') {
                    break;
                }
                length--;
                break;
            }
            length--;
        }
        String str = new String(charArray, 0, length + 1);
        int iIndexOf = str.indexOf(46);
        return (iIndexOf == -1 || f < 1.0f || Math.abs(f - ((float) ((int) f))) >= 0.001f) ? str : str.substring(0, iIndexOf);
    }
}
