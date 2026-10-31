package l;

/* JADX INFO: renamed from: l.ۡ۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7AQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C8897 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m22973(int i, int i2, int i3, float f) {
        if (i <= 0 || i2 <= 0) {
            return -1;
        }
        boolean z = i3 == 90 || i3 == 270;
        float f2 = z ? i2 : i;
        float f3 = z ? i : i2;
        if (f <= 0.0f) {
            f = 1.0f;
        }
        float f4 = f2 * f;
        if (Math.abs(f4 - f3) < 1.0f) {
            return -1;
        }
        return f4 > f3 ? 0 : 1;
    }
}
