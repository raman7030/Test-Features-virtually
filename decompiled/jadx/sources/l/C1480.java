package l;

/* JADX INFO: renamed from: l.֫֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L9U1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1480 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f5311 = {-1, 83, 77, 66, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f5310 = {-2, 83, 77, 66, 64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5122(long j, int i, byte[] bArr) {
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m5124(long j, int i, byte[] bArr) {
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m5121(int i, byte[] bArr) {
        return (bArr[i] & 255) + ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m5123(int i, byte[] bArr) {
        return (bArr[i] & 255) + ((bArr[i + 1] & 255) << 8) + ((bArr[i + 2] & 255) << 16) + ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static long m5125(int i, byte[] bArr) {
        return (((long) m5123(i, bArr)) & 4294967295L) + (((long) m5123(i + 4, bArr)) << 32);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m5126(long j, int i, byte[] bArr) {
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long m5127(int i, byte[] bArr) {
        return (((((long) m5123(i + 4, bArr)) << 32) | (((long) m5123(i, bArr)) & 4294967295L)) / 10000) - 11644473600000L;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m5128(long j, int i, byte[] bArr) {
        if (j != 0) {
            j = (j + 11644473600000L) * 10000;
        }
        m5126(j, i, bArr);
    }
}
