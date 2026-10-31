package l;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.ۜܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K963 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6901 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18685(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static BigDecimal m18686(String str) {
        m18685(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static BigInteger m18687(String str) {
        m18685(str);
        return new BigInteger(str);
    }
}
