package l;

/* JADX INFO: renamed from: l.۬ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: YAHK */
/* JADX INFO: loaded from: classes3.dex */
public final class C12856 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31293(C2828 c2828) {
        return (c2828 == null || c2828.isNegative() || c2828.isZero()) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2828 m31292(C2828 c2828, C2828 c2829) {
        if (c2828 != null) {
            return c2828;
        }
        C11003.requireNonNull(c2829, "defaultValue");
        return c2829;
    }
}
