package p067l;

import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.ۜܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K963 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8927 {
    /* JADX INFO: renamed from: ֫ */
    public static void m20634(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    /* JADX INFO: renamed from: ۧ */
    public static BigDecimal m20635(String str) {
        m20634(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    /* JADX INFO: renamed from: ܽ */
    public static BigInteger m20636(String str) {
        m20634(str);
        return new BigInteger(str);
    }
}
