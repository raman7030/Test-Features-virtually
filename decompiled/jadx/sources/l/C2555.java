package l;

/* JADX INFO: renamed from: l.ۖ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6PN */
/* JADX INFO: loaded from: classes2.dex */
public final class C2555 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final char[] f8087 = new char[0];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char[][] f8088 = new char[16][];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f8089;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f8090;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f8091;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m8087(int i) {
        return (-8) & ((((long) i) * 2) + 23);
    }

    public C2555(long j) {
        this.f8091 = Math.min(65536L, j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char[] m8091(int i) {
        int i2 = this.f8090;
        do {
            i2--;
            if (i2 < 0) {
                return null;
            }
        } while (this.f8088[i2].length != i);
        return m8088(i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m8090(char[] cArr) {
        int length = cArr.length;
        long jM8087 = m8087(length);
        if (length < 16 || length > 8192 || (length & (length - 1)) != 0) {
            return false;
        }
        int i = this.f8090;
        char[][] cArr2 = this.f8088;
        if (i == cArr2.length) {
            return false;
        }
        long j = this.f8089;
        if (jM8087 > this.f8091 - j) {
            return false;
        }
        this.f8090 = i + 1;
        cArr2[i] = cArr;
        this.f8089 = j + jM8087;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m8089() {
        int i = this.f8090;
        if (i == 0) {
            return 0L;
        }
        return m8087(m8088(i - 1).length);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private char[] m8088(int i) {
        char[][] cArr = this.f8088;
        char[] cArr2 = cArr[i];
        int i2 = this.f8090 - 1;
        this.f8090 = i2;
        cArr[i] = cArr[i2];
        cArr[i2] = null;
        this.f8089 -= m8087(cArr2.length);
        return cArr2;
    }
}
