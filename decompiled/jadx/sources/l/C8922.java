package l;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۡܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7SL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8922 extends AbstractC14565 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final long f27127;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f27128;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final long f27129;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final long f27130;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final long f27131;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final long f27132;

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫ */
    public final C15976 mo18447(AbstractC2572 abstractC2572) {
        C15976 c15976;
        C15976 c15977 = C15976.f49301;
        do {
            c15976 = abstractC2572.f8128;
            if (c15977 == c15976) {
                break;
            }
        } while (!mo18452(abstractC2572, c15976, c15977));
        return c15976;
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
            unsafe = (Unsafe) AccessController.doPrivileged(new C9628());
        }
        try {
            f27132 = unsafe.objectFieldOffset(AbstractC2572.class.getDeclaredField("᩶"));
            f27127 = unsafe.objectFieldOffset(AbstractC2572.class.getDeclaredField("᩸"));
            f27130 = unsafe.objectFieldOffset(AbstractC2572.class.getDeclaredField("᩹"));
            f27129 = unsafe.objectFieldOffset(C15976.class.getDeclaredField("ۧ"));
            f27131 = unsafe.objectFieldOffset(C15976.class.getDeclaredField("֫"));
            f27128 = unsafe;
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Unsafe m23029() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫ */
    public final void mo18448(C15976 c15976, Thread thread) {
        f27128.putObject(c15976, f27129, thread);
    }

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫ */
    public final void mo18449(C15976 c15976, C15976 c15977) {
        f27128.putObject(c15976, f27131, c15977);
    }

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18452(AbstractC2572 abstractC2572, C15976 c15976, C15976 c15977) {
        return C20917.m47748(f27128, abstractC2572, f27132, c15976, c15977);
    }

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18451(AbstractC2572 abstractC2572, C11039 c11039, C11039 c110310) {
        return C20917.m47748(f27128, abstractC2572, f27127, c11039, c110310);
    }

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫ */
    public final C11039 mo18446(AbstractC2572 abstractC2572, C11039 c11039) {
        C11039 c110310;
        do {
            c110310 = abstractC2572.f8129;
            if (c11039 == c110310) {
                break;
            }
        } while (!mo18451(abstractC2572, c110310, c11039));
        return c110310;
    }

    @Override // l.AbstractC14565
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo18450(AbstractC2572 abstractC2572, Object obj, Object obj2) {
        return C20917.m47748(f27128, abstractC2572, f27130, obj, obj2);
    }
}
