package p067l;

/* JADX INFO: renamed from: l.֫֡᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L9U1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3775 {

    /* JADX INFO: renamed from: ۧ */
    public static final byte[] f8084 = {-1, 83, 77, 66, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] f8083 = {-2, 83, 77, 66, 64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ֫ */
    public static void m7364(long j, int i, byte[] bArr) {
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m7366(long j, int i, byte[] bArr) {
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m7363(int i, byte[] bArr) {
        return (bArr[i] & 255) + ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m7365(int i, byte[] bArr) {
        return (bArr[i] & 255) + ((bArr[i + 1] & 255) << 8) + ((bArr[i + 2] & 255) << 16) + ((bArr[i + 3] & 255) << 24);
    }

    /* JADX INFO: renamed from: ܽ */
    public static long m7367(int i, byte[] bArr) {
        return (((long) m7365(i, bArr)) & 4294967295L) + (((long) m7365(i + 4, bArr)) << 32);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m7368(long j, int i, byte[] bArr) {
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static long m7369(int i, byte[] bArr) {
        return (((((long) m7365(i + 4, bArr)) << 32) | (((long) m7365(i, bArr)) & 4294967295L)) / 10000) - 11644473600000L;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m7370(long j, int i, byte[] bArr) {
        if (j != 0) {
            j = (j + 11644473600000L) * 10000;
        }
        m7368(j, i, bArr);
    }
}
