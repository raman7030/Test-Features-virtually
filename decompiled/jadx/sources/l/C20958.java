package l;

/* JADX INFO: renamed from: l.᩷ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E142 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20958 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f67730 = ApplicationC20075.f65008.getBoolean("show_bookmarks_tip", true);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47777() {
        return f67730;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m47778() {
        if (f67730) {
            f67730 = false;
            ApplicationC20075.f65008.edit().putBoolean("show_bookmarks_tip", false).apply();
            C16870.m39669();
        }
    }
}
