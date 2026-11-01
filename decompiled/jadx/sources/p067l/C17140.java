package p067l;

/* JADX INFO: renamed from: l.ܶ᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F3BK */
/* JADX INFO: loaded from: classes4.dex */
public final class C17140 {
    /* JADX INFO: renamed from: ֫ */
    public static void m38802(long j, String str) {
        if (j >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m38803(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
