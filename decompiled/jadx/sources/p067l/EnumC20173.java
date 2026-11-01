package p067l;

/* JADX INFO: renamed from: l.ᩴۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7F0 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC20173 {
    Visible("@+"),
    Invisible("@-"),
    VisibleType("@T+"),
    InvisibleType("@T-");


    /* JADX INFO: renamed from: ᩸ */
    public final String f62435;

    EnumC20173(String str) {
        this.f62435 = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m45654(String str) {
        return str.startsWith(Invisible.f62435) || str.startsWith(Visible.f62435);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m45656(String str) {
        return str.startsWith(InvisibleType.f62435) || str.startsWith(VisibleType.f62435);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m45652(String str) {
        return str.startsWith("@");
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m45655(String str) {
        return str.endsWith("-");
    }
}
