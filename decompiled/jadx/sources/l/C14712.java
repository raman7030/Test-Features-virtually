package l;

/* JADX INFO: renamed from: l.ܳᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: I66L */
/* JADX INFO: loaded from: classes4.dex */
public final class C14712 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m35004(long j) {
        char[] cArr = new char[16];
        for (int i = 0; i < 16; i++) {
            cArr[15 - i] = Character.forDigit(((int) j) & 15, 16);
            j >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m35008(int i) {
        char[] cArr = new char[8];
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[7 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m35006(int i) {
        char[] cArr = new char[4];
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[3 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m35005(int i) {
        char[] cArr = new char[2];
        for (int i2 = 0; i2 < 2; i2++) {
            cArr[1 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m35007(int i) {
        return new String(new char[]{Character.forDigit(i & 15, 16)});
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m35003(int i) {
        char[] cArr = new char[9];
        if (i < 0) {
            cArr[0] = '-';
            i = -i;
        } else {
            cArr[0] = '+';
        }
        for (int i2 = 0; i2 < 8; i2++) {
            cArr[8 - i2] = Character.forDigit(i & 15, 16);
            i >>= 4;
        }
        return new String(cArr);
    }
}
