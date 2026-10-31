package l;

/* JADX INFO: renamed from: l.ᩴۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7F0 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC18734 {
    Visible("@+"),
    Invisible("@-"),
    VisibleType("@T+"),
    InvisibleType("@T-");


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f59212;

    EnumC18734(String str) {
        this.f59212 = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m43387(String str) {
        return str.startsWith(Invisible.f59212) || str.startsWith(Visible.f59212);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m43389(String str) {
        return str.startsWith(InvisibleType.f59212) || str.startsWith(VisibleType.f59212);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43385(String str) {
        return str.startsWith("@");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m43388(String str) {
        return str.endsWith("-");
    }
}
