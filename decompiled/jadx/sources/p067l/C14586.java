package p067l;

/* JADX INFO: renamed from: l.۬ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: YAHK */
/* JADX INFO: loaded from: classes3.dex */
public final class C14586 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m33379(C5057 c5057) {
        return (c5057 == null || c5057.isNegative() || c5057.isZero()) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5057 m33378(C5057 c5057, C5057 c5058) {
        if (c5057 != null) {
            return c5057;
        }
        C12826.requireNonNull(c5058, "defaultValue");
        return c5058;
    }
}
