package l;

/* JADX INFO: renamed from: l.ܺܰۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: D9BL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15972 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int f49281 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long f49282 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static int f49283 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int f49284 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean f49285 = false;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int f49286 = -1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static int f49287;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m37750(String str) {
        return str.endsWith(".apk") || str.endsWith(".apk.bak") || str.endsWith(".apk.1") || str.endsWith(".jar");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m37760(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m37744(int i, byte[] bArr) {
        return (bArr[i] & 255) | (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m37761(int i) {
        f49286 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m37755(int i, byte[] bArr) {
        return (((long) bArr[i]) & 255) | (((long) bArr[i + 7]) << 56) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 1]) & 255) << 8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m37743() {
        return f49281;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37745(int i) {
        f49281 = i;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static void m37753() {
        C18081.m42150();
        C16669.m39185();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m37759() {
        return f49284;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37757(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >>> 8) & 255);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37756(int i) {
        f49284 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37746(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >>> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >>> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >>> 24) & 255);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m37764() {
        return f49283;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m37765(int i) {
        f49283 = i;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m37762() {
        return f49287;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37748(long j, int i, byte[] bArr) {
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >>> 8) & 255);
        bArr[i + 2] = (byte) ((j >>> 16) & 255);
        bArr[i + 3] = (byte) ((j >>> 24) & 255);
        bArr[i + 4] = (byte) ((j >>> 32) & 255);
        bArr[i + 5] = (byte) ((j >>> 40) & 255);
        bArr[i + 6] = (byte) ((j >>> 48) & 255);
        bArr[i + 7] = (byte) ((j >>> 56) & 255);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m37763(int i) {
        f49287 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m37754() {
        return f49282;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37747(long j) {
        f49282 = j;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m37766() {
        return f49285;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37749(boolean z) {
        f49285 = z;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m37758() {
        return f49282 < System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m37751() {
        return f49286 == -1;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m37767() {
        return f49286 == 0;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static void m37752() {
        f49286 = -1;
        f49281 = 0;
        f49284 = 0;
        f49283 = 0;
        f49287 = 0;
        f49282 = 0L;
        f49285 = false;
    }
}
