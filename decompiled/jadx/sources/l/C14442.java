package l;

/* JADX INFO: renamed from: l.ܳۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8OU */
/* JADX INFO: loaded from: classes3.dex */
public final class C14442 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final String[] f44265 = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int[] f44269 = {44100, 48000, 32000};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int[] f44263 = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f44267 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f44264 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f44266 = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int[] f44268 = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m34471(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f44269[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f44263[i4 - 1] : f44267[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f44264[i4 - 1] : f44266[i4 - 1];
        } else {
            i6 = f44268[i4 - 1];
        }
        if (i2 == 3) {
            return C23868.m52580(i6, 144, i7, i8);
        }
        return C23868.m52580(i3 == 1 ? 72 : 144, i6, i7, i8);
    }
}
