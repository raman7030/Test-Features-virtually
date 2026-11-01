package p067l;

/* JADX INFO: renamed from: l.᩺ۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBNC */
/* JADX INFO: loaded from: classes.dex */
public final class C24185 {
    /* JADX INFO: renamed from: ֫ */
    public static void m53469(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i >> 8) & 255);
        bArr[i2 + 2] = (byte) ((i >> 16) & 255);
        bArr[i2 + 3] = (byte) ((i >> 24) & 255);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m53472(long j, int i, byte[] bArr) {
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) ((j >> 24) & 255);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m53470(long j, int i, byte[] bArr) {
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) ((j >> 24) & 255);
        bArr[i + 4] = (byte) ((j >> 32) & 255);
        bArr[i + 5] = (byte) ((j >> 40) & 255);
        bArr[i + 6] = (byte) ((j >> 48) & 255);
        bArr[i + 7] = (byte) ((j >> 56) & 255);
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m53468(int i, byte[] bArr) {
        long j = ((long) bArr[i]) & 255;
        long j2 = ((long) bArr[i + 1]) & 255;
        long j3 = ((long) bArr[i + 2]) & 255;
        return ((((long) bArr[i + 3]) & 255) << 24) | j | (j2 << 8) | (j3 << 16);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m53471(int i) {
        byte[] bArr = new byte[4];
        m53469(i, 0, bArr);
        return bArr;
    }
}
