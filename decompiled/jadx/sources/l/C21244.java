package l;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.᩸֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 59PE */
/* JADX INFO: loaded from: classes4.dex */
public final class C21244 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final long f68463;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f68464;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final long f68465;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC14892 f68466;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final boolean f68467;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final boolean f68468;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final boolean f68469;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Class f68470;

    static {
        Unsafe unsafeM48242 = m48242();
        f68464 = unsafeM48242;
        f68470 = C0241.m1500();
        boolean zM48252 = m48252(Long.TYPE);
        boolean zM48253 = m48252(Integer.TYPE);
        AbstractC14892 c7837 = null;
        if (unsafeM48242 != null) {
            if (!C0241.m1501()) {
                c7837 = new C7837(unsafeM48242);
            } else if (zM48252) {
                c7837 = new C0781(unsafeM48242);
            } else if (zM48253) {
                c7837 = new C5015(unsafeM48242);
            }
        }
        f68466 = c7837;
        f68469 = c7837 == null ? false : c7837.mo2985();
        f68467 = c7837 == null ? false : c7837.mo20931();
        f68465 = m48236(byte[].class);
        m48236(boolean[].class);
        m48243(boolean[].class);
        m48236(int[].class);
        m48243(int[].class);
        m48236(long[].class);
        m48243(long[].class);
        m48236(float[].class);
        m48243(float[].class);
        m48236(double[].class);
        m48243(double[].class);
        m48236(Object[].class);
        m48243(Object[].class);
        Field fieldM48238 = m48238();
        f68463 = (fieldM48238 == null || c7837 == null) ? -1L : c7837.m35333(fieldM48238);
        f68468 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m48250() {
        return f68467;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m48247() {
        return f68469;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m48220(Class cls) {
        try {
            return f68464.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m48237(Field field) {
        return f68466.m35333(field);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m48236(Class cls) {
        if (f68467) {
            return f68466.m35328(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m48243(Class cls) {
        if (f68467) {
            f68466.m35332(cls);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte m48217(long j, Object obj) {
        return (byte) ((f68466.m35335((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static int m48233(long j, Object obj) {
        return f68466.m35335(j, obj);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte m48235(long j, Object obj) {
        return (byte) ((f68466.m35335((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m48244(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM35335 = f68466.m35335(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m48223(((255 & b) << i) | (iM35335 & (~(255 << i))), j2, obj);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m48246(long j, Object obj) {
        return ((byte) ((f68466.m35335((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m48249(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m48223(((255 & b) << i) | (f68466.m35335(j2, obj) & (~(255 << i))), j2, obj);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m48251(long j, Object obj) {
        return ((byte) ((f68466.m35335((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48223(int i, long j, Object obj) {
        f68466.m35329(i, j, obj);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m48253(long j, Object obj) {
        return f68466.m35334(j, obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48229(Object obj, long j, long j2) {
        f68466.m35331(obj, j, j2);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m48248(long j, Object obj) {
        return f68466.mo2983(j, obj);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m48245(Object obj, long j, boolean z) {
        f68466.mo2982(obj, j, z);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static float m48254(long j, Object obj) {
        return f68466.mo2987(j, obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48228(Object obj, long j, float f) {
        f68466.mo2981(obj, j, f);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static double m48241(long j, Object obj) {
        return f68466.mo2986(j, obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48227(Object obj, long j, double d) {
        f68466.mo2980(obj, j, d);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static Object m48234(long j, Object obj) {
        return f68466.m35336(j, obj);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48224(long j, Object obj, Object obj2) {
        f68466.m35330(j, obj, obj2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte m48218(long j, byte[] bArr) {
        return f68466.mo2984(f68465 + j, bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48232(byte[] bArr, long j, byte b) {
        f68466.mo2979((Object) bArr, f68465 + j, b);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48225(long j, byte[] bArr, long j2, long j3) {
        f68466.mo2978(j, bArr, j2, j3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte m48216(long j) {
        return f68466.mo2976(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m48219(ByteBuffer byteBuffer) {
        return f68466.m35334(f68463, byteBuffer);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m48221(Field field) {
        return f68466.mo2977(field);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Unsafe m48242() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C0075());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m48252(Class cls) {
        if (!C0241.m1501()) {
            return false;
        }
        try {
            Class cls2 = f68470;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Field m48238() {
        Field declaredField;
        Field declaredField2;
        if (C0241.m1501()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48230(Object obj, long j, boolean z) {
        m48244(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48240(Object obj, long j, boolean z) {
        m48249(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48231(Throwable th) {
        Logger.getLogger(C21244.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }
}
