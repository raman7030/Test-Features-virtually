package l;

/* JADX INFO: renamed from: l.ᩳ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AR8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17906 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m41887(int i, long j) {
        int i2 = (int) j;
        if (i2 != j) {
            throw new ArithmeticException("integer overflow");
        }
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) >= 0) {
            return i3;
        }
        throw new ArithmeticException("integer overflow");
    }
}
