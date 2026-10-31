package l;

/* JADX INFO: renamed from: l.᩻ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DP */
/* JADX INFO: loaded from: classes.dex */
public final class C23424 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f75225 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final char[] f75226 = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51890(int i, long j) {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            stringBuffer.append(f75226[((int) (j >> (i * 4))) & 15]);
        }
        String string = stringBuffer.toString();
        if (string.isEmpty()) {
            string = "0";
        }
        return "0x".concat(string);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51889(int i) {
        int i2 = 8;
        while (i2 > 0 && (i >> ((i2 - 1) * 4)) == 0) {
            i2--;
        }
        return m51890(i2, i);
    }
}
