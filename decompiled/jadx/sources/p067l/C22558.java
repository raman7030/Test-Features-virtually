package p067l;

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
public final class C22558 {

    /* JADX INFO: renamed from: ֫ */
    public static final long f71145;

    /* JADX INFO: renamed from: ۜ */
    public static final Unsafe f71146;

    /* JADX INFO: renamed from: ۧ */
    public static final long f71147;

    /* JADX INFO: renamed from: ܳ */
    public static final AbstractC16521 f71148;

    /* JADX INFO: renamed from: ܽ */
    public static final boolean f71149;

    /* JADX INFO: renamed from: ܿ */
    public static final boolean f71150;

    /* JADX INFO: renamed from: ᩳ */
    public static final boolean f71151;

    /* JADX INFO: renamed from: ᩻ */
    public static final Class f71152;

    static {
        Unsafe unsafeM50573 = m50573();
        f71146 = unsafeM50573;
        f71152 = C2597.m3898();
        boolean zM50583 = m50583(Long.TYPE);
        boolean zM50584 = m50583(Integer.TYPE);
        AbstractC16521 c9816 = null;
        if (unsafeM50573 != null) {
            if (!C2597.m3899()) {
                c9816 = new C9816(unsafeM50573);
            } else if (zM50583) {
                c9816 = new C3110(unsafeM50573);
            } else if (zM50584) {
                c9816 = new C7134(unsafeM50573);
            }
        }
        f71148 = c9816;
        f71151 = c9816 == null ? false : c9816.mo5314();
        f71149 = c9816 == null ? false : c9816.mo22896();
        f71147 = m50567(byte[].class);
        m50567(boolean[].class);
        m50574(boolean[].class);
        m50567(int[].class);
        m50574(int[].class);
        m50567(long[].class);
        m50574(long[].class);
        m50567(float[].class);
        m50574(float[].class);
        m50567(double[].class);
        m50574(double[].class);
        m50567(Object[].class);
        m50574(Object[].class);
        Field fieldM50569 = m50569();
        f71145 = (fieldM50569 == null || c9816 == null) ? -1L : c9816.m37485(fieldM50569);
        f71150 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m50581() {
        return f71149;
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m50578() {
        return f71151;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m50551(Class cls) {
        try {
            return f71146.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m50568(Field field) {
        return f71148.m37485(field);
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m50567(Class cls) {
        if (f71149) {
            return f71148.m37480(cls);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m50574(Class cls) {
        if (f71149) {
            f71148.m37484(cls);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte m50548(long j, Object obj) {
        return (byte) ((f71148.m37487((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: ۜ */
    public static int m50564(long j, Object obj) {
        return f71148.m37487(j, obj);
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte m50566(long j, Object obj) {
        return (byte) ((f71148.m37487((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m50575(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iM37487 = f71148.m37487(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m50554(((255 & b) << i) | (iM37487 & (~(255 << i))), j2, obj);
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m50577(long j, Object obj) {
        return ((byte) ((f71148.m37487((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m50580(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m50554(((255 & b) << i) | (f71148.m37487(j2, obj) & (~(255 << i))), j2, obj);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m50582(long j, Object obj) {
        return ((byte) ((f71148.m37487((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50554(int i, long j, Object obj) {
        f71148.m37481(i, j, obj);
    }

    /* JADX INFO: renamed from: ᩷ */
    public static long m50584(long j, Object obj) {
        return f71148.m37486(j, obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50560(Object obj, long j, long j2) {
        f71148.m37483(obj, j, j2);
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m50579(long j, Object obj) {
        return f71148.mo5312(j, obj);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m50576(Object obj, long j, boolean z) {
        f71148.mo5311(obj, j, z);
    }

    /* JADX INFO: renamed from: ᩻ */
    public static float m50585(long j, Object obj) {
        return f71148.mo5316(j, obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50559(Object obj, long j, float f) {
        f71148.mo5310(obj, j, f);
    }

    /* JADX INFO: renamed from: ܳ */
    public static double m50572(long j, Object obj) {
        return f71148.mo5315(j, obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50558(Object obj, long j, double d) {
        f71148.mo5309(obj, j, d);
    }

    /* JADX INFO: renamed from: ۢ */
    public static Object m50565(long j, Object obj) {
        return f71148.m37488(j, obj);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50555(long j, Object obj, Object obj2) {
        f71148.m37482(j, obj, obj2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte m50549(long j, byte[] bArr) {
        return f71148.mo5313(f71147 + j, bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50563(byte[] bArr, long j, byte b) {
        f71148.mo5308((Object) bArr, f71147 + j, b);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50556(long j, byte[] bArr, long j2, long j3) {
        f71148.mo5307(j, bArr, j2, j3);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte m50547(long j) {
        return f71148.mo5305(j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m50550(ByteBuffer byteBuffer) {
        return f71148.m37486(f71145, byteBuffer);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m50552(Field field) {
        return f71148.mo5306(field);
    }

    /* JADX INFO: renamed from: ܽ */
    public static Unsafe m50573() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C2439());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᩳ */
    public static boolean m50583(Class cls) {
        if (!C2597.m3899()) {
            return false;
        }
        try {
            Class cls2 = f71152;
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

    /* JADX INFO: renamed from: ۧ */
    public static Field m50569() {
        Field declaredField;
        Field declaredField2;
        if (C2597.m3899()) {
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

    /* JADX INFO: renamed from: ֫ */
    public static void m50561(Object obj, long j, boolean z) {
        m50575(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m50571(Object obj, long j, boolean z) {
        m50580(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50562(Throwable th) {
        Logger.getLogger(C22558.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }
}
