package l;

/* JADX INFO: renamed from: l.֡ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9PV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0241 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final boolean f1518;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Class f1519;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m1501() {
        return (f1519 == null || f1518) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Class m1500() {
        return f1519;
    }

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f1519 = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f1518 = cls2 != null;
    }
}
