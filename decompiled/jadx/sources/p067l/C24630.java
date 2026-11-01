package p067l;

/* JADX INFO: renamed from: l.᩻ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DP */
/* JADX INFO: loaded from: classes.dex */
public final class C24630 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f77971 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final char[] f77972 = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: ֫ */
    public static String m54288(int i, long j) {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            stringBuffer.append(f77972[((int) (j >> (i * 4))) & 15]);
        }
        String string = stringBuffer.toString();
        if (string.isEmpty()) {
            string = "0";
        }
        return "0x".concat(string);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m54287(int i) {
        int i2 = 8;
        while (i2 > 0 && (i >> ((i2 - 1) * 4)) == 0) {
            i2--;
        }
        return m54288(i2, i);
    }
}
