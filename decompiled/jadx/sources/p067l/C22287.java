package p067l;

/* JADX INFO: renamed from: l.᩷ܶܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E142 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22287 {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f70415 = ApplicationC21448.f67649.getBoolean("show_bookmarks_tip", true);

    /* JADX INFO: renamed from: ֫ */
    public static boolean m50107() {
        return f70415;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m50108() {
        if (f70415) {
            f70415 = false;
            ApplicationC21448.f67649.edit().putBoolean("show_bookmarks_tip", false).apply();
            C18402.m41905();
        }
    }
}
