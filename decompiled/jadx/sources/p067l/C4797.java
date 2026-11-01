package p067l;

/* JADX INFO: renamed from: l.ۖ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6PN */
/* JADX INFO: loaded from: classes2.dex */
public final class C4797 {

    /* JADX INFO: renamed from: ܿ */
    public static final char[] f10877 = new char[0];

    /* JADX INFO: renamed from: ֫ */
    public final char[][] f10878 = new char[16][];

    /* JADX INFO: renamed from: ۧ */
    public long f10879;

    /* JADX INFO: renamed from: ܽ */
    public int f10880;

    /* JADX INFO: renamed from: ᩳ */
    public final long f10881;

    /* JADX INFO: renamed from: ۧ */
    public static long m10119(int i) {
        return (-8) & ((((long) i) * 2) + 23);
    }

    public C4797(long j) {
        this.f10881 = Math.min(65536L, j);
    }

    /* JADX INFO: renamed from: ֫ */
    public final char[] m10123(int i) {
        int i2 = this.f10880;
        do {
            i2--;
            if (i2 < 0) {
                return null;
            }
        } while (this.f10878[i2].length != i);
        return m10120(i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m10122(char[] cArr) {
        int length = cArr.length;
        long jM10119 = m10119(length);
        if (length < 16 || length > 8192 || (length & (length - 1)) != 0) {
            return false;
        }
        int i = this.f10880;
        char[][] cArr2 = this.f10878;
        if (i == cArr2.length) {
            return false;
        }
        long j = this.f10879;
        if (jM10119 > this.f10881 - j) {
            return false;
        }
        this.f10880 = i + 1;
        cArr2[i] = cArr;
        this.f10879 = j + jM10119;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m10121() {
        int i = this.f10880;
        if (i == 0) {
            return 0L;
        }
        return m10119(m10120(i - 1).length);
    }

    /* JADX INFO: renamed from: ܽ */
    private char[] m10120(int i) {
        char[][] cArr = this.f10878;
        char[] cArr2 = cArr[i];
        int i2 = this.f10880 - 1;
        this.f10880 = i2;
        cArr[i] = cArr[i2];
        cArr[i2] = null;
        this.f10879 -= m10119(cArr2.length);
        return cArr2;
    }
}
