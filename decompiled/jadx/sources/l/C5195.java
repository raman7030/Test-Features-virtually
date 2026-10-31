package l;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۚۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G6PO */
/* JADX INFO: loaded from: classes2.dex */
public final class C5195 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final long f16281;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f16282;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final long f16283;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f16284;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final long f16285;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final long f16286;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final boolean f16287;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f16288;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f16289;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final void m14969() {
        int iAddAndGet = f16282.addAndGet(-1640531527);
        if (iAddAndGet == 0) {
            iAddAndGet = 1;
        }
        ((C0255) f16289.get()).f1538 = iAddAndGet;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int m14963() {
        return ((C0255) f16289.get()).f1538;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int m14964(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        ((C0255) f16289.get()).f1538 = i4;
        return i4;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int m14970() {
        int i;
        ThreadLocal threadLocal = f16289;
        int i2 = ((C0255) threadLocal.get()).f1539;
        if (i2 != 0) {
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >>> 17);
            i = i4 ^ (i4 << 5);
        } else {
            long andAdd = f16288.getAndAdd(-4942790177534073029L);
            long j = (andAdd ^ (andAdd >>> 33)) * (-49064778989728563L);
            i = (int) (((j ^ (j >>> 33)) * (-4265267296055464877L)) >>> 32);
            if (i == 0) {
                i = 1;
            }
        }
        ((C0255) threadLocal.get()).f1539 = i;
        return i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m14965(Thread thread) {
        if (f16287) {
            return;
        }
        Unsafe unsafe = f16284;
        unsafe.putObject(thread, f16286, (Object) null);
        unsafe.putObject(thread, f16283, (Object) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m14967(Thread thread, AccessControlContext accessControlContext) {
        if (f16287) {
            return;
        }
        f16284.putOrderedObject(thread, f16285, accessControlContext);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m14966(Thread thread, ClassLoader classLoader) {
        if (f16287) {
            return;
        }
        f16284.putObject(thread, f16281, classLoader);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m14968(String str) {
        Class<?> cls;
        try {
            cls = Class.forName(str, false, C5195.class.getClassLoader());
        } catch (Throwable unused) {
            cls = null;
        }
        return cls != null;
    }

    static {
        String property;
        Unsafe unsafe = C0961.f3616;
        f16284 = unsafe;
        try {
            boolean z = m14968("com.ibm.misc.JarVersion") && (property = System.getProperty("java.class.version", "45")) != null && property.length() >= 2 && "52".compareTo(property.substring(0, 2)) > 0;
            boolean zM14968 = m14968("android.util.DisplayMetrics") ? true : m14968("org.robovm.rt.bro.Bro");
            f16287 = zM14968;
            if (!zM14968) {
                f16286 = unsafe.objectFieldOffset(Thread.class.getDeclaredField("threadLocals"));
                f16283 = unsafe.objectFieldOffset(Thread.class.getDeclaredField("inheritableThreadLocals"));
                f16285 = unsafe.objectFieldOffset(Thread.class.getDeclaredField(z ? "accessControlContext" : "inheritedAccessControlContext"));
                f16281 = unsafe.objectFieldOffset(Thread.class.getDeclaredField("contextClassLoader"));
            } else {
                f16286 = 0L;
                f16283 = 0L;
                f16285 = 0L;
                f16281 = 0L;
            }
            f16289 = new C18601();
            f16282 = new AtomicInteger();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = (jCurrentTimeMillis ^ (jCurrentTimeMillis >>> 33)) * (-49064778989728563L);
            long j2 = (j ^ (j >>> 33)) * (-4265267296055464877L);
            long jNanoTime = System.nanoTime();
            long j3 = (jNanoTime ^ (jNanoTime >>> 33)) * (-49064778989728563L);
            long j4 = ((j3 >>> 33) ^ j3) * (-4265267296055464877L);
            f16288 = new AtomicLong((j2 ^ (j2 >>> 33)) ^ (j4 ^ (j4 >>> 33)));
            if (((Boolean) AccessController.doPrivileged(new C19307())).booleanValue()) {
                byte[] seed = SecureRandom.getSeed(8);
                long j5 = ((long) seed[0]) & 255;
                for (int i = 1; i < 8; i++) {
                    j5 = (j5 << 8) | (((long) seed[i]) & 255);
                }
                f16288.set(j5);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
