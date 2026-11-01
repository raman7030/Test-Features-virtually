package p067l;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ᩳ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19809 {

    /* JADX INFO: renamed from: b */
    public static final C19809 f60241b;

    /* JADX INFO: renamed from: a */
    public final Unsafe f60242a;

    static {
        Field fieldM45033g = m45033g();
        fieldM45033g.setAccessible(true);
        try {
            f60241b = new C19809((Unsafe) fieldM45033g.get(null));
        } catch (IllegalAccessException e) {
            throw new AssertionError("Couldn't get the Unsafe", e);
        }
    }

    public C19809(Unsafe unsafe) {
        this.f60242a = unsafe;
    }

    /* JADX INFO: renamed from: g */
    public static Field m45033g() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m45038e(C22826 c22826, long j) {
        int intVolatile;
        do {
            intVolatile = this.f60242a.getIntVolatile(c22826, j);
        } while (!this.f60242a.compareAndSwapInt(c22826, j, intVolatile, intVolatile - 4));
        return intVolatile;
    }

    /* JADX INFO: renamed from: i */
    public final long m45041i(Field field) {
        return this.f60242a.objectFieldOffset(field);
    }

    /* JADX INFO: renamed from: h */
    public final long m45040h(Class cls, String str) {
        try {
            return m45041i(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Cannot find field:", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m45034a(Class cls) {
        return this.f60242a.arrayBaseOffset(cls);
    }

    /* JADX INFO: renamed from: b */
    public final int m45035b(Class cls) {
        return this.f60242a.arrayIndexScale(cls);
    }

    /* JADX INFO: renamed from: f */
    public final Object m45039f(Object obj, long j) {
        return this.f60242a.getObjectVolatile(obj, j);
    }

    /* JADX INFO: renamed from: j */
    public final void m45042j(Object obj, long j, C2708 c2708) {
        this.f60242a.putObjectVolatile(obj, j, c2708);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m45036c(Object obj, long j, int i, int i2) {
        return this.f60242a.compareAndSwapInt(obj, j, i, i2);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m45037d(Object obj, long j, long j2, long j3) {
        return this.f60242a.compareAndSwapLong(obj, j, j2, j3);
    }
}
