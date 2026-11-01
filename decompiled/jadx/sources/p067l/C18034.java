package p067l;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ܽۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18034 {

    /* JADX INFO: renamed from: ֫ */
    public static final long f53848;

    /* JADX INFO: renamed from: ۧ */
    public static final Unsafe f53849;

    /* JADX INFO: renamed from: ܽ */
    public static final C18507 f53850 = new C18507();

    static {
        Unsafe unsafe = C3282.f6392;
        f53849 = unsafe;
        try {
            f53848 = unsafe.objectFieldOffset(C18507.class.getDeclaredField("֫"));
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m41074() {
        f53849.putOrderedInt(f53850, f53848, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m41073() {
        f53849.putIntVolatile(f53850, f53848, 0);
    }
}
