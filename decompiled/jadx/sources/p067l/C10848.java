package p067l;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۡܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7SL */
/* JADX INFO: loaded from: classes3.dex */
public final class C10848 extends AbstractC16211 {

    /* JADX INFO: renamed from: ֫ */
    public static final long f30059;

    /* JADX INFO: renamed from: ۧ */
    public static final Unsafe f30060;

    /* JADX INFO: renamed from: ܳ */
    public static final long f30061;

    /* JADX INFO: renamed from: ܽ */
    public static final long f30062;

    /* JADX INFO: renamed from: ܿ */
    public static final long f30063;

    /* JADX INFO: renamed from: ᩳ */
    public static final long f30064;

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final C17552 mo20396(AbstractC4813 abstractC4813) {
        C17552 c17552;
        C17552 c17553 = C17552.f52459;
        do {
            c17552 = abstractC4813.f10918;
            if (c17553 == c17552) {
                break;
            }
        } while (!mo20401(abstractC4813, c17552, c17553));
        return c17552;
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C11519());
        }
        try {
            f30064 = unsafe.objectFieldOffset(AbstractC4813.class.getDeclaredField("᩶"));
            f30059 = unsafe.objectFieldOffset(AbstractC4813.class.getDeclaredField("᩸"));
            f30062 = unsafe.objectFieldOffset(AbstractC4813.class.getDeclaredField("᩹"));
            f30061 = unsafe.objectFieldOffset(C17552.class.getDeclaredField("ۧ"));
            f30063 = unsafe.objectFieldOffset(C17552.class.getDeclaredField("֫"));
            f30060 = unsafe;
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ Unsafe m25003() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final void mo20397(C17552 c17552, Thread thread) {
        f30060.putObject(c17552, f30061, thread);
    }

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final void mo20398(C17552 c17552, C17552 c17553) {
        f30060.putObject(c17552, f30063, c17553);
    }

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20401(AbstractC4813 abstractC4813, C17552 c17552, C17552 c17553) {
        return C22248.m50078(f30060, abstractC4813, f30064, c17552, c17553);
    }

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20400(AbstractC4813 abstractC4813, C12860 c12860, C12860 c12861) {
        return C22248.m50078(f30060, abstractC4813, f30059, c12860, c12861);
    }

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final C12860 mo20395(AbstractC4813 abstractC4813, C12860 c12860) {
        C12860 c12861;
        do {
            c12861 = abstractC4813.f10919;
            if (c12860 == c12861) {
                break;
            }
        } while (!mo20400(abstractC4813, c12861, c12860));
        return c12861;
    }

    @Override // p067l.AbstractC16211
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo20399(AbstractC4813 abstractC4813, Object obj, Object obj2) {
        return C22248.m50078(f30060, abstractC4813, f30062, obj, obj2);
    }
}
