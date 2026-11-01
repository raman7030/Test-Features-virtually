package p067l;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Calendar;

/* JADX INFO: renamed from: l.ۖۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5LF */
/* JADX INFO: loaded from: classes2.dex */
public final class C4504 {

    /* JADX INFO: renamed from: ֫ */
    public Serializable f10106;

    public C4504(String str, int i) {
        String strReplace = str.replace(" ", "").replace("_", "");
        if (strReplace.startsWith("-")) {
            try {
                strReplace = Integer.toHexString(Integer.parseInt(strReplace, i));
                i = 16;
            } catch (NumberFormatException unused) {
            }
        }
        this.f10106 = new BigInteger(strReplace, i);
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [java.io.Serializable, long[]] */
    public C4504() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(10, -24);
        this.f10106 = new long[]{jCurrentTimeMillis - 600000, jCurrentTimeMillis - 3600000, timeInMillis, calendar.getTimeInMillis(), jCurrentTimeMillis - 604800000, jCurrentTimeMillis - 2592000000L};
    }

    /* JADX INFO: renamed from: ܽ */
    public String m9528() {
        BigInteger bigInteger = (BigInteger) this.f10106;
        if (bigInteger.intValue() < 0) {
            return bigInteger.toString(10) + ", " + bigInteger.intValue() + " (32bit)";
        }
        return bigInteger.toString(10);
    }

    /* JADX INFO: renamed from: ֫ */
    public int m9526(long j) {
        long[] jArr = (long[]) this.f10106;
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j > jArr[i]) {
                return i;
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: ۧ */
    public String m9527() {
        return m9524(4, ((BigInteger) this.f10106).toString(2), "0b");
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m9524(int i, String str, String str2) {
        int length;
        if (str.length() > 0 && str.charAt(0) == '-') {
            str2 = "-".concat(str2);
            str = str.substring(1);
        }
        StringBuilder sb = new StringBuilder(str2);
        if (str.length() % i != 0) {
            length = i - (str.length() % i);
            for (int i2 = 0; i2 < length; i2++) {
                sb.append('0');
            }
        } else {
            length = 0;
        }
        for (char c : str.toCharArray()) {
            if (length > 0 && length % i == 0) {
                sb.append('_');
            }
            sb.append(c);
            length++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩳ */
    public String m9530() {
        return m9524(8, ((BigInteger) this.f10106).toString(16).toUpperCase(), "0x");
    }

    /* JADX INFO: renamed from: ܿ */
    public String m9529() {
        return m9524(4, ((BigInteger) this.f10106).toString(8), "0_");
    }

    /* JADX INFO: renamed from: ֫ */
    public int m9525() {
        return ((BigInteger) this.f10106).intValue();
    }
}
