package p067l;

/* JADX INFO: renamed from: l.֡ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9PV */
/* JADX INFO: loaded from: classes2.dex */
public final class C2597 {

    /* JADX INFO: renamed from: ֫ */
    public static final boolean f4296;

    /* JADX INFO: renamed from: ۧ */
    public static final Class f4297;

    /* JADX INFO: renamed from: ۧ */
    public static boolean m3899() {
        return (f4297 == null || f4296) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Class m3898() {
        return f4297;
    }

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f4297 = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f4296 = cls2 != null;
    }
}
