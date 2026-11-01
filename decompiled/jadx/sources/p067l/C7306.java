package p067l;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۚۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G6PO */
/* JADX INFO: loaded from: classes2.dex */
public final class C7306 {

    /* JADX INFO: renamed from: ֫ */
    public static final long f19122;

    /* JADX INFO: renamed from: ۜ */
    public static final AtomicInteger f19123;

    /* JADX INFO: renamed from: ۧ */
    public static final long f19124;

    /* JADX INFO: renamed from: ܳ */
    public static final Unsafe f19125;

    /* JADX INFO: renamed from: ܽ */
    public static final long f19126;

    /* JADX INFO: renamed from: ܿ */
    public static final long f19127;

    /* JADX INFO: renamed from: ᩳ */
    public static final boolean f19128;

    /* JADX INFO: renamed from: ᩷ */
    public static final AtomicLong f19129;

    /* JADX INFO: renamed from: ᩻ */
    public static final ThreadLocal f19130;

    /* JADX INFO: renamed from: ۧ */
    public static final void m16879() {
        int iAddAndGet = f19123.addAndGet(-1640531527);
        if (iAddAndGet == 0) {
            iAddAndGet = 1;
        }
        ((C2611) f19130.get()).f4316 = iAddAndGet;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final int m16873() {
        return ((C2611) f19130.get()).f4316;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final int m16874(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        ((C2611) f19130.get()).f4316 = i4;
        return i4;
    }

    /* JADX INFO: renamed from: ܽ */
    public static final int m16880() {
        int i;
        ThreadLocal threadLocal = f19130;
        int i2 = ((C2611) threadLocal.get()).f4317;
        if (i2 != 0) {
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >>> 17);
            i = i4 ^ (i4 << 5);
        } else {
            long andAdd = f19129.getAndAdd(-4942790177534073029L);
            long j = (andAdd ^ (andAdd >>> 33)) * (-49064778989728563L);
            i = (int) (((j ^ (j >>> 33)) * (-4265267296055464877L)) >>> 32);
            if (i == 0) {
                i = 1;
            }
        }
        ((C2611) threadLocal.get()).f4317 = i;
        return i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m16875(Thread thread) {
        if (f19128) {
            return;
        }
        Unsafe unsafe = f19125;
        unsafe.putObject(thread, f19127, (Object) null);
        unsafe.putObject(thread, f19124, (Object) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m16877(Thread thread, AccessControlContext accessControlContext) {
        if (f19128) {
            return;
        }
        f19125.putOrderedObject(thread, f19126, accessControlContext);
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m16876(Thread thread, ClassLoader classLoader) {
        if (f19128) {
            return;
        }
        f19125.putObject(thread, f19122, classLoader);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m16878(String str) {
        Class<?> cls;
        try {
            cls = Class.forName(str, false, C7306.class.getClassLoader());
        } catch (Throwable unused) {
            cls = null;
        }
        return cls != null;
    }

    static {
        String property;
        Unsafe unsafe = C3282.f6392;
        f19125 = unsafe;
        try {
            boolean z = m16878("com.ibm.misc.JarVersion") && (property = System.getProperty("java.class.version", "45")) != null && property.length() >= 2 && "52".compareTo(property.substring(0, 2)) > 0;
            boolean zM16878 = m16878("android.util.DisplayMetrics") ? true : m16878("org.robovm.rt.bro.Bro");
            f19128 = zM16878;
            if (!zM16878) {
                f19127 = unsafe.objectFieldOffset(Thread.class.getDeclaredField("threadLocals"));
                f19124 = unsafe.objectFieldOffset(Thread.class.getDeclaredField("inheritableThreadLocals"));
                f19126 = unsafe.objectFieldOffset(Thread.class.getDeclaredField(z ? "accessControlContext" : "inheritedAccessControlContext"));
                f19122 = unsafe.objectFieldOffset(Thread.class.getDeclaredField("contextClassLoader"));
            } else {
                f19127 = 0L;
                f19124 = 0L;
                f19126 = 0L;
                f19122 = 0L;
            }
            f19130 = new C20047();
            f19123 = new AtomicInteger();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = (jCurrentTimeMillis ^ (jCurrentTimeMillis >>> 33)) * (-49064778989728563L);
            long j2 = (j ^ (j >>> 33)) * (-4265267296055464877L);
            long jNanoTime = System.nanoTime();
            long j3 = (jNanoTime ^ (jNanoTime >>> 33)) * (-49064778989728563L);
            long j4 = ((j3 >>> 33) ^ j3) * (-4265267296055464877L);
            f19129 = new AtomicLong((j2 ^ (j2 >>> 33)) ^ (j4 ^ (j4 >>> 33)));
            if (((Boolean) AccessController.doPrivileged(new C20718())).booleanValue()) {
                byte[] seed = SecureRandom.getSeed(8);
                long j5 = ((long) seed[0]) & 255;
                for (int i = 1; i < 8; i++) {
                    j5 = (j5 << 8) | (((long) seed[i]) & 255);
                }
                f19129.set(j5);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
