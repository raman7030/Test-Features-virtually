package p067l;

/* JADX INFO: renamed from: l.ۖ֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4465 {

    /* JADX INFO: renamed from: a */
    public static final long f10031a;

    /* JADX INFO: renamed from: b */
    public static final long f10032b;

    /* JADX INFO: renamed from: c */
    public static final char[] f10033c;

    /* JADX INFO: renamed from: d */
    public static long m9402d(String str) {
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '@') {
                j |= 1 << cCharAt;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: c */
    public static long m9401c(String str) {
        int length = str.length();
        long j = 0;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= '@' && cCharAt < 128) {
                j |= 1 << (cCharAt - '@');
            }
        }
        return j;
    }

    static {
        long j = 0;
        for (int iMax = Math.max(Math.min(48, 63), 0); iMax <= Math.max(Math.min(57, 63), 0); iMax++) {
            j |= 1 << iMax;
        }
        long jM9400b = m9400b('A', 'Z') | m9400b('a', 'z');
        long jM9402d = m9402d("-_.!~*'()");
        long jM9401c = jM9400b | m9401c("-_.!~*'()");
        long jM9402d2 = j | jM9402d | m9402d(":@&=+$,");
        long jM9401c2 = jM9401c | m9401c(":@&=+$,");
        f10031a = jM9402d2 | m9402d(";/");
        f10032b = jM9401c2 | m9401c(";/");
        f10033c = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    /* JADX INFO: renamed from: b */
    public static long m9400b(char c, char c2) {
        long j = 0;
        for (int iMax = Math.max(Math.min((int) c, 127), 64) - 64; iMax <= Math.max(Math.min((int) c2, 127), 64) - 64; iMax++) {
            j |= 1 << iMax;
        }
        return j;
    }

    /* JADX INFO: renamed from: a */
    public static int m9399a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            throw new AssertionError();
        }
        return c - '7';
    }
}
