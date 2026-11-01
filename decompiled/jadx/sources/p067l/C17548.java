package p067l;

/* JADX INFO: renamed from: l.ܺܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9BL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17548 {

    /* JADX INFO: renamed from: ֫ */
    public static int f52439 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static long f52440 = 0;

    /* JADX INFO: renamed from: ܳ */
    public static int f52441 = 0;

    /* JADX INFO: renamed from: ܽ */
    public static int f52442 = 0;

    /* JADX INFO: renamed from: ܿ */
    public static boolean f52443 = false;

    /* JADX INFO: renamed from: ᩳ */
    public static int f52444 = -1;

    /* JADX INFO: renamed from: ᩻ */
    public static int f52445;

    /* JADX INFO: renamed from: ֫ */
    public static boolean m39934(String str) {
        return str.endsWith(".apk") || str.endsWith(".apk.bak") || str.endsWith(".apk.1") || str.endsWith(".jar");
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m39944(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m39928(int i, byte[] bArr) {
        return (bArr[i] & 255) | (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m39945(int i) {
        f52444 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m39939(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | (((long) bArr[i + 7]) << 56) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 1]) & 255) << 8);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m39927() {
        return f52439;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39929(int i) {
        f52439 = i;
    }

    /* JADX INFO: renamed from: ۢ */
    public static void m39937() {
        C19553.m44409();
        C18211.m41420();
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m39943() {
        return f52442;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m39941(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >>> 8) & 255);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m39940(int i) {
        f52442 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39930(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >>> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >>> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >>> 24) & 255);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m39948() {
        return f52441;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m39949(int i) {
        f52441 = i;
    }

    /* JADX INFO: renamed from: ܿ */
    public static int m39946() {
        return f52445;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39932(long j, int i, byte[] bArr) {
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >>> 8) & 255);
        bArr[i + 2] = (byte) ((j >>> 16) & 255);
        bArr[i + 3] = (byte) ((j >>> 24) & 255);
        bArr[i + 4] = (byte) ((j >>> 32) & 255);
        bArr[i + 5] = (byte) ((j >>> 40) & 255);
        bArr[i + 6] = (byte) ((j >>> 48) & 255);
        bArr[i + 7] = (byte) ((j >>> 56) & 255);
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m39947(int i) {
        f52445 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m39938() {
        return f52440;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39931(long j) {
        f52440 = j;
    }

    /* JADX INFO: renamed from: ᩷ */
    public static boolean m39950() {
        return f52443;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39933(boolean z) {
        f52443 = z;
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m39942() {
        return f52440 < System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ۜ */
    public static boolean m39935() {
        return f52444 == -1;
    }

    /* JADX INFO: renamed from: ᩻ */
    public static boolean m39951() {
        return f52444 == 0;
    }

    /* JADX INFO: renamed from: ۡ */
    public static void m39936() {
        f52444 = -1;
        f52439 = 0;
        f52442 = 0;
        f52441 = 0;
        f52445 = 0;
        f52440 = 0L;
        f52443 = false;
    }
}
