package l;

import java.text.DecimalFormat;

/* JADX INFO: renamed from: l.ۛ᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U5B8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6260 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f19385 = Float.floatToRawIntBits(Float.NaN);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int f19391 = Float.floatToRawIntBits(Float.MAX_VALUE);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int f19390 = Float.floatToRawIntBits(3.1415927f);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int f19389 = Float.floatToRawIntBits(2.7182817f);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final long f19383 = Double.doubleToRawLongBits(Double.NaN);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final long f19386 = Double.doubleToLongBits(Double.MAX_VALUE);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final long f19384 = Double.doubleToLongBits(3.141592653589793d);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final long f19387 = Double.doubleToLongBits(2.718281828459045d);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final DecimalFormat f19388 = new DecimalFormat("0.####################E0");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17271(int i) {
        if (i == f19385 || i == f19391 || i == f19390 || i == f19389) {
            return true;
        }
        if ((i < 0 || i >= 100000000) && i != Integer.MAX_VALUE && i != Integer.MIN_VALUE) {
            int i2 = i >> 24;
            int i3 = (i >> 16) & 255;
            int i4 = 65535 & i;
            if ((i2 == 127 || i2 == 1) && i3 < 31 && i4 < 4095) {
                return false;
            }
            float fIntBitsToFloat = Float.intBitsToFloat(i);
            if (Float.isNaN(fIntBitsToFloat)) {
                return false;
            }
            long j = i;
            DecimalFormat decimalFormat = f19388;
            String str = decimalFormat.format(j);
            String str2 = decimalFormat.format(fIntBitsToFloat);
            int iIndexOf = str2.indexOf(46);
            int iIndexOf2 = str2.indexOf("E");
            int iIndexOf3 = str2.indexOf("000");
            if (iIndexOf3 > iIndexOf && iIndexOf3 < iIndexOf2) {
                str2 = str2.substring(0, iIndexOf3) + str2.substring(iIndexOf2);
            } else {
                int iIndexOf4 = str2.indexOf("999");
                if (iIndexOf4 > iIndexOf && iIndexOf4 < iIndexOf2) {
                    str2 = str2.substring(0, iIndexOf4) + str2.substring(iIndexOf2);
                }
            }
            if (str2.length() < str.length()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17272(long j) {
        if (j == f19383 || j == f19386 || j == f19384 || j == f19387) {
            return true;
        }
        if (j >= 0 && j < 100000) {
            return j == 1012 || j == 1214 || j == 1417 || j == 1619 || j == 1822 || j == 2024 || j == 4048 || j == 6072 || j == 8096 || j == 10120 || j == 12144 || j == 14168 || j == 16192 || j == 18216 || j == 20240 || j == 40480 || j == 60721 || j == 80961;
        }
        if (j != C13132.FOREVER_NS && j != Long.MIN_VALUE) {
            double dLongBitsToDouble = Double.longBitsToDouble(j);
            if (Double.isNaN(dLongBitsToDouble)) {
                return false;
            }
            DecimalFormat decimalFormat = f19388;
            String str = decimalFormat.format(j);
            String str2 = decimalFormat.format(dLongBitsToDouble);
            int iIndexOf = str2.indexOf(46);
            int iIndexOf2 = str2.indexOf("E");
            int iIndexOf3 = str2.indexOf("000");
            if (iIndexOf3 > iIndexOf && iIndexOf3 < iIndexOf2) {
                str2 = str2.substring(0, iIndexOf3) + str2.substring(iIndexOf2);
            } else {
                int iIndexOf4 = str2.indexOf("999");
                if (iIndexOf4 > iIndexOf && iIndexOf4 < iIndexOf2) {
                    str2 = str2.substring(0, iIndexOf4) + str2.substring(iIndexOf2);
                }
            }
            if (str2.length() < str.length()) {
                return true;
            }
        }
        return false;
    }
}
