package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۗ᩻᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes3.dex */
public final class FutureC3575 implements Future, InterfaceC12747 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C24036 f11334 = new C24036(null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final long f11335;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final boolean f11336;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f11337;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final long f11338;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final long f11339;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Executor f11340;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile Object f11341;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile AbstractRunnableC4281 f11342;

    @Override // l.InterfaceC12747
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 mo10906() {
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m10919(AbstractRunnableC4281 abstractRunnableC4281) {
        AbstractRunnableC4281 abstractRunnableC4282 = this.f11342;
        m10900(abstractRunnableC4281, abstractRunnableC4282);
        return C18392.m42818(f11337, this, f11338, abstractRunnableC4282, abstractRunnableC4281);
    }

    static {
        Executor executorC19804;
        boolean z = C17189.f52689 > 1;
        f11336 = z;
        if (!z) {
            executorC19804 = new ExecutorC19804();
        } else {
            executorC19804 = C17189.f52695;
        }
        f11340 = executorC19804;
        Unsafe unsafe = C0961.f3616;
        f11337 = unsafe;
        try {
            f11339 = unsafe.objectFieldOffset(FutureC3575.class.getDeclaredField("᩸"));
            f11338 = unsafe.objectFieldOffset(FutureC3575.class.getDeclaredField("᩹"));
            f11335 = unsafe.objectFieldOffset(AbstractRunnableC4281.class.getDeclaredField("ۤ"));
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m10928() {
        C14863.m35260(f11337, this, f11339);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m10929(Object obj) {
        Unsafe unsafe = f11337;
        if (obj == null) {
            obj = f11334;
        }
        return C17686.m41421(unsafe, this, f11339, obj);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C24036 m10903(Throwable th) {
        if (!(th instanceof C13452)) {
            th = new C13452(th);
        }
        return new C24036(th);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10924(Throwable th) {
        C17686.m41421(f11337, this, f11339, m10903(th));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m10901(Object obj, Throwable th) {
        if (!(th instanceof C13452)) {
            th = new C13452(th);
        } else if ((obj instanceof C24036) && th == ((C24036) obj).f77869) {
            return obj;
        }
        return new C24036(th);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10913(Object obj, Throwable th) {
        C17686.m41421(f11337, this, f11339, m10901(obj, th));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10923(Object obj) {
        Throwable th;
        Unsafe unsafe = f11337;
        if ((obj instanceof C24036) && (th = ((C24036) obj).f77869) != null && !(th instanceof C13452)) {
            obj = new C24036(new C13452(th));
        }
        C17686.m41421(unsafe, this, f11339, obj);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Object m10904(Object obj) throws ExecutionException, InterruptedException {
        Throwable cause;
        if (obj == null) {
            throw new InterruptedException();
        }
        if (!(obj instanceof C24036)) {
            return obj;
        }
        Throwable th = ((C24036) obj).f77869;
        if (th == null) {
            return null;
        }
        if (th instanceof CancellationException) {
            throw ((CancellationException) th);
        }
        if ((th instanceof C13452) && (cause = th.getCause()) != null) {
            th = cause;
        }
        throw new ExecutionException(th);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static FutureC3575 m10896(RunnableC0625 runnableC0625, ThreadPoolExecutor threadPoolExecutor) {
        Executor executor;
        if (f11336 || threadPoolExecutor != C17189.f52695) {
            threadPoolExecutor.getClass();
            executor = threadPoolExecutor;
        } else {
            executor = f11340;
        }
        FutureC3575 futureC3575 = new FutureC3575();
        RunnableC7103 runnableC7103 = new RunnableC7103();
        runnableC7103.f21810 = futureC3575;
        runnableC7103.f21809 = runnableC0625;
        executor.execute(runnableC7103);
        return futureC3575;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static FutureC3575 m10897(C3636 c3636, Executor executor) {
        if (f11336 || executor != C17189.f52695) {
            executor.getClass();
        } else {
            executor = f11340;
        }
        FutureC3575 futureC3575 = new FutureC3575();
        RunnableC21215 runnableC21215 = new RunnableC21215();
        runnableC21215.f68357 = futureC3575;
        runnableC21215.f68356 = c3636;
        executor.execute(runnableC21215);
        return futureC3575;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m10920(Runnable runnable, Executor executor) {
        if (f11336 || executor != C17189.f52695) {
            executor.getClass();
        } else {
            executor = f11340;
        }
        return m10902(runnable, executor);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10900(AbstractRunnableC4281 abstractRunnableC4281, AbstractRunnableC4281 abstractRunnableC4282) {
        f11337.putOrderedObject(abstractRunnableC4281, f11335, abstractRunnableC4282);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m10926() {
        while (true) {
            FutureC3575 futureC3575Mo2888 = this;
            while (true) {
                AbstractRunnableC4281 abstractRunnableC4281 = futureC3575Mo2888.f11342;
                if (abstractRunnableC4281 == null) {
                    if (futureC3575Mo2888 == this || (abstractRunnableC4281 = this.f11342) == null) {
                        return;
                    } else {
                        futureC3575Mo2888 = this;
                    }
                }
                AbstractRunnableC4281 abstractRunnableC4282 = abstractRunnableC4281;
                AbstractRunnableC4281 abstractRunnableC4283 = abstractRunnableC4282.f13829;
                Unsafe unsafe = f11337;
                if (C18392.m42818(unsafe, futureC3575Mo2888, f11338, abstractRunnableC4282, abstractRunnableC4283)) {
                    if (abstractRunnableC4283 != null) {
                        if (futureC3575Mo2888 != this) {
                            while (!m10919(abstractRunnableC4282)) {
                            }
                        } else {
                            C20917.m47748(unsafe, abstractRunnableC4282, f11335, abstractRunnableC4283, null);
                        }
                    }
                    futureC3575Mo2888 = abstractRunnableC4282.mo2888(-1);
                    if (futureC3575Mo2888 == null) {
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10922() {
        AbstractRunnableC4281 abstractRunnableC4281;
        boolean zM42818 = false;
        while (true) {
            abstractRunnableC4281 = this.f11342;
            if (abstractRunnableC4281 == null || abstractRunnableC4281.mo5012()) {
                break;
            }
            zM42818 = C18392.m42818(f11337, this, f11338, abstractRunnableC4281, abstractRunnableC4281.f13829);
        }
        if (abstractRunnableC4281 == null || zM42818) {
            return;
        }
        AbstractRunnableC4281 abstractRunnableC4282 = abstractRunnableC4281.f13829;
        AbstractRunnableC4281 abstractRunnableC4283 = abstractRunnableC4281;
        while (abstractRunnableC4282 != null) {
            AbstractRunnableC4281 abstractRunnableC4284 = abstractRunnableC4282.f13829;
            if (!abstractRunnableC4282.mo5012()) {
                C20917.m47748(f11337, abstractRunnableC4283, f11335, abstractRunnableC4282, abstractRunnableC4284);
                return;
            } else {
                abstractRunnableC4283 = abstractRunnableC4282;
                abstractRunnableC4282 = abstractRunnableC4284;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10925(AbstractRunnableC4281 abstractRunnableC4281) {
        while (!m10919(abstractRunnableC4281)) {
            if (this.f11341 != null) {
                m10900(abstractRunnableC4281, (AbstractRunnableC4281) null);
                break;
            }
        }
        if (this.f11341 != null) {
            abstractRunnableC4281.mo2888(0);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m10908(FutureC3575 futureC3575, int i) {
        if (futureC3575 != null && futureC3575.f11342 != null) {
            Object obj = futureC3575.f11341;
            if (obj == null) {
                futureC3575.m10922();
            }
            if (i >= 0 && (obj != null || futureC3575.f11341 != null)) {
                futureC3575.m10926();
            }
        }
        if (this.f11341 == null || this.f11342 == null) {
            return null;
        }
        if (i < 0) {
            return this;
        }
        m10926();
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m10921(InterfaceC21423 interfaceC21423) {
        Object obj = this.f11341;
        if (obj != null) {
            FutureC3575 futureC3575 = new FutureC3575();
            if (obj instanceof C24036) {
                Throwable th = ((C24036) obj).f77869;
                if (th != null) {
                    futureC3575.f11341 = m10901(obj, th);
                    return futureC3575;
                }
                obj = null;
            }
            try {
                Object objApply = interfaceC21423.apply(obj);
                if (objApply == null) {
                    objApply = f11334;
                }
                futureC3575.f11341 = objApply;
                return futureC3575;
            } catch (Throwable th2) {
                futureC3575.f11341 = m10903(th2);
                return futureC3575;
            }
        }
        FutureC3575 futureC3576 = new FutureC3575();
        C5692 c5692 = new C5692(null, futureC3576, this);
        c5692.f17551 = interfaceC21423;
        m10925((AbstractRunnableC4281) c5692);
        return futureC3576;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m10909(C7144 c7144) {
        Object obj = this.f11341;
        if (obj != null) {
            FutureC3575 futureC3575 = new FutureC3575();
            if (obj instanceof C24036) {
                Throwable th = ((C24036) obj).f77869;
                if (th != null) {
                    futureC3575.f11341 = m10901(obj, th);
                    return futureC3575;
                }
                obj = null;
            }
            try {
                c7144.m19157(obj);
                futureC3575.f11341 = f11334;
                return futureC3575;
            } catch (Throwable th2) {
                futureC3575.f11341 = m10903(th2);
                return futureC3575;
            }
        }
        FutureC3575 futureC3576 = new FutureC3575();
        C0752 c0752 = new C0752(null, futureC3576, this);
        c0752.f2805 = c7144;
        m10925((AbstractRunnableC4281) c0752);
        return futureC3576;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private FutureC3575 m10902(Runnable runnable, Executor executor) {
        Throwable th;
        Object obj = this.f11341;
        if (obj != null) {
            FutureC3575 futureC3575 = new FutureC3575();
            if ((obj instanceof C24036) && (th = ((C24036) obj).f77869) != null) {
                futureC3575.f11341 = m10901(obj, th);
                return futureC3575;
            }
            try {
                if (executor != null) {
                    executor.execute(new C20509(null, futureC3575, this, runnable));
                    return futureC3575;
                }
                runnable.run();
                futureC3575.f11341 = f11334;
                return futureC3575;
            } catch (Throwable th2) {
                futureC3575.f11341 = m10903(th2);
                return futureC3575;
            }
        }
        FutureC3575 futureC3576 = new FutureC3575();
        m10925((AbstractRunnableC4281) new C20509(executor, futureC3576, this, runnable));
        return futureC3576;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0031  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m10916(Object obj, InterfaceC8017 interfaceC8017, C4986 c4986) {
        Throwable th;
        if (this.f11341 == null) {
            Throwable th2 = null;
            Object obj2 = null;
            if (c4986 != null) {
                try {
                    if (!c4986.m5011()) {
                        return false;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (th2 != null) {
                        th = th2;
                    }
                    m10913(obj, th);
                    return true;
                }
            }
            if (obj instanceof C24036) {
                th = ((C24036) obj).f77869;
            } else {
                th = null;
                obj2 = obj;
            }
            try {
                interfaceC8017.mo4663(obj2, th);
                if (th == null) {
                    C17686.m41421(f11337, this, f11339, obj);
                    return true;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                th = th;
                if (th2 != null) {
                    th = th2;
                }
            }
            m10913(obj, th);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m10917(Object obj, InterfaceC15071 interfaceC15071, C21920 c21920) {
        if (this.f11341 != null) {
            return true;
        }
        if (c21920 != null) {
            try {
                if (!c21920.m5011()) {
                    return false;
                }
            } catch (Throwable th) {
                m10924(th);
                return true;
            }
        }
        Throwable th2 = null;
        if (obj instanceof C24036) {
            th2 = ((C24036) obj).f77869;
            obj = null;
        }
        m10929(interfaceC15071.mo25124(obj, th2));
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m10918(Object obj, InterfaceC21423 interfaceC21423, C15568 c15568) {
        Throwable th;
        if (this.f11341 != null) {
            return true;
        }
        if (c15568 != null) {
            try {
                if (!c15568.m5011()) {
                    return false;
                }
            } catch (Throwable th2) {
                m10924(th2);
                return true;
            }
        }
        if (!(obj instanceof C24036) || (th = ((C24036) obj).f77869) == null) {
            C17686.m41421(f11337, this, f11339, obj);
            return true;
        }
        m10929(interfaceC21423.apply(th));
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static FutureC3575 m10899(FutureC3575[] futureC3575Arr, int i, int i2) {
        FutureC3575 futureC3575M10899;
        FutureC3575 futureC3575M108910;
        Object obj;
        Throwable th;
        C24036 c24036 = f11334;
        FutureC3575 futureC3575 = new FutureC3575();
        if (i > i2) {
            futureC3575.f11341 = c24036;
            return futureC3575;
        }
        int i3 = (i + i2) >>> 1;
        if (i == i3) {
            futureC3575M10899 = futureC3575Arr[i];
        } else {
            futureC3575M10899 = m10899(futureC3575Arr, i, i3);
        }
        if (futureC3575M10899 == null) {
            throw null;
        }
        if (i == i2) {
            futureC3575M108910 = futureC3575M10899;
        } else {
            int i4 = i3 + 1;
            futureC3575M108910 = i2 == i4 ? futureC3575Arr[i2] : m10899(futureC3575Arr, i4, i2);
        }
        if (futureC3575M108910 == null) {
            throw null;
        }
        Object obj2 = futureC3575M10899.f11341;
        if (obj2 == null || (obj = futureC3575M108910.f11341) == null) {
            C16274 c16274 = new C16274(null, futureC3575, futureC3575M10899);
            c16274.f27908 = futureC3575M108910;
            while (futureC3575M10899.f11341 == null) {
                if (futureC3575M10899.m10919((AbstractRunnableC4281) c16274)) {
                    if (futureC3575M108910.f11341 == null) {
                        C2870 c2870 = new C2870();
                        c2870.f9136 = c16274;
                        futureC3575M108910.m10925((AbstractRunnableC4281) c2870);
                        return futureC3575;
                    }
                    if (futureC3575M10899.f11341 != null) {
                        c16274.mo2888(0);
                    }
                    return futureC3575;
                }
            }
            futureC3575M108910.m10925((AbstractRunnableC4281) c16274);
            return futureC3575;
        }
        if (!(obj2 instanceof C24036) || (th = ((C24036) obj2).f77869) == null) {
            if (!(obj instanceof C24036) || (th = ((C24036) obj).f77869) == null) {
                futureC3575.f11341 = c24036;
                return futureC3575;
            }
            obj2 = obj;
        }
        futureC3575.f11341 = m10901(obj2, th);
        return futureC3575;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m10894(boolean z) {
        if (z && Thread.interrupted()) {
            return null;
        }
        boolean zM10919 = false;
        C19098 c19098 = null;
        while (true) {
            Object obj = this.f11341;
            if (obj != null) {
                if (c19098 != null) {
                    c19098.f60139 = null;
                    if (c19098.f60140) {
                        Thread.currentThread().interrupt();
                    }
                }
                m10926();
                return obj;
            }
            if (c19098 == null) {
                c19098 = new C19098(0L, 0L, z);
                if (Thread.currentThread() instanceof C3784) {
                    C17189.m40429(f11340, c19098);
                }
            } else if (!zM10919) {
                zM10919 = m10919((AbstractRunnableC4281) c19098);
            } else {
                if (z && c19098.f60140) {
                    c19098.f60139 = null;
                    m10922();
                    return null;
                }
                try {
                    C17189.m40430(c19098);
                } catch (InterruptedException unused) {
                    c19098.f60140 = true;
                }
            }
        }
    }

    public FutureC3575() {
    }

    public FutureC3575(Object obj) {
        this.f11341 = obj;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static FutureC3575 m10905(Object obj) {
        if (obj == null) {
            obj = f11334;
        }
        return new FutureC3575(obj);
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f11341 != null;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object objM10894 = this.f11341;
        if (objM10894 == null) {
            objM10894 = m10894(true);
        }
        return m10904(objM10894);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws TimeoutException {
        Object obj;
        long nanos = timeUnit.toNanos(j);
        Object obj2 = this.f11341;
        if (obj2 == null) {
            long jNanoTime = System.nanoTime() + nanos;
            long j2 = 0;
            if (jNanoTime == 0) {
                jNanoTime = 1;
            }
            boolean z = false;
            C19098 c19098 = null;
            Object obj3 = null;
            boolean zM10919 = false;
            while (true) {
                if (!z) {
                    boolean zInterrupted = Thread.interrupted();
                    if (zInterrupted) {
                        obj2 = obj3;
                    } else {
                        Object obj4 = this.f11341;
                        if (obj4 == null && nanos > j2) {
                            if (c19098 == null) {
                                obj = obj4;
                                C19098 c19099 = new C19098(nanos, jNanoTime, true);
                                if (Thread.currentThread() instanceof C3784) {
                                    C17189.m40429(f11340, c19099);
                                }
                                c19098 = c19099;
                            } else {
                                obj = obj4;
                                if (!zM10919) {
                                    zM10919 = m10919((AbstractRunnableC4281) c19098);
                                } else {
                                    try {
                                        C17189.m40430(c19098);
                                        z = c19098.f60140;
                                        nanos = c19098.f60141;
                                    } catch (InterruptedException unused) {
                                        z = true;
                                    }
                                    obj3 = obj;
                                }
                                j2 = 0;
                            }
                            obj3 = obj;
                            z = zInterrupted;
                            j2 = 0;
                        } else {
                            obj2 = obj4;
                        }
                    }
                    z = zInterrupted;
                    break;
                }
                obj2 = obj3;
                break;
            }
            if (c19098 != null) {
                c19098.f60139 = null;
                if (obj2 == null) {
                    m10922();
                }
            }
            if (obj2 != null) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                m10926();
            } else {
                if (!z) {
                    throw new TimeoutException();
                }
                obj2 = null;
            }
        }
        return m10904(obj2);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object m10930() {
        Object objM10894 = this.f11341;
        if (objM10894 == null) {
            objM10894 = m10894(false);
        }
        if (!(objM10894 instanceof C24036)) {
            return objM10894;
        }
        Throwable th = ((C24036) objM10894).f77869;
        if (th == null) {
            return null;
        }
        if (th instanceof CancellationException) {
            throw ((CancellationException) th);
        }
        if (th instanceof C13452) {
            throw ((C13452) th);
        }
        throw new C13452(th);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10912(Object obj) {
        m10929(obj);
        m10926();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10914(Throwable th) {
        th.getClass();
        C17686.m41421(f11337, this, f11339, new C24036(th));
        m10926();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m10907(Runnable runnable) {
        return m10902(runnable, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static FutureC3575 m10898(FutureC3575... futureC3575Arr) {
        return m10899(futureC3575Arr, 0, futureC3575Arr.length - 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        if (this.f11341 == null) {
            if (C17686.m41421(f11337, this, f11339, new C24036(new CancellationException()))) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        m10926();
        return z2 || isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        Object obj = this.f11341;
        return (obj instanceof C24036) && (((C24036) obj).f77869 instanceof CancellationException);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m10931() {
        Object obj = this.f11341;
        return (obj instanceof C24036) && obj != f11334;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    public final String toString() {
        String strM42645;
        Object obj = this.f11341;
        int i = 0;
        for (AbstractRunnableC4281 abstractRunnableC4281 = this.f11342; abstractRunnableC4281 != null; abstractRunnableC4281 = abstractRunnableC4281.f13829) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (obj == null) {
            strM42645 = i == 0 ? "[Not completed]" : C18307.m42645(i, "[Not completed, ", " dependents]");
        } else if (obj instanceof C24036) {
            C24036 c24036 = (C24036) obj;
            if (c24036.f77869 != null) {
                strM42645 = "[Completed exceptionally: " + c24036.f77869 + "]";
            } else {
                strM42645 = "[Completed normally]";
            }
        } else {
            strM42645 = "[Completed normally]";
        }
        sb.append(strM42645);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m10910(InterfaceC8017 interfaceC8017) {
        FutureC3575 futureC3575 = new FutureC3575();
        Object obj = this.f11341;
        if (obj == null) {
            C4986 c4986 = new C4986(null, futureC3575, this);
            c4986.f15709 = interfaceC8017;
            m10925((AbstractRunnableC4281) c4986);
            return futureC3575;
        }
        futureC3575.m10916(obj, interfaceC8017, (C4986) null);
        return futureC3575;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m10911(InterfaceC15071 interfaceC15071) {
        FutureC3575 futureC3575 = new FutureC3575();
        Object obj = this.f11341;
        if (obj == null) {
            C21920 c21920 = new C21920(null, futureC3575, this);
            c21920.f70175 = interfaceC15071;
            m10925((AbstractRunnableC4281) c21920);
            return futureC3575;
        }
        futureC3575.m10917(obj, interfaceC15071, (C21920) null);
        return futureC3575;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10915(InterfaceC21423 interfaceC21423) {
        FutureC3575 futureC3575 = new FutureC3575();
        Object obj = this.f11341;
        if (obj == null) {
            C15568 c15568 = new C15568(null, futureC3575, this);
            c15568.f47977 = interfaceC21423;
            m10925((AbstractRunnableC4281) c15568);
            return;
        }
        futureC3575.m10918(obj, interfaceC21423, (C15568) null);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m10927(InterfaceC21423 interfaceC21423) {
        Throwable th;
        FutureC3575 futureC3575 = new FutureC3575();
        Object obj = this.f11341;
        if (obj == null) {
            C8514 c8514 = new C8514(null, futureC3575, this);
            c8514.f26027 = interfaceC21423;
            m10925((AbstractRunnableC4281) c8514);
            return futureC3575;
        }
        if (obj instanceof C24036) {
            Throwable th2 = ((C24036) obj).f77869;
            if (th2 != null) {
                futureC3575.f11341 = m10901(obj, th2);
                return futureC3575;
            }
            obj = null;
        }
        try {
            FutureC3575 futureC3575Mo10906 = ((InterfaceC12747) interfaceC21423.apply(obj)).mo10906();
            Object c24036 = futureC3575Mo10906.f11341;
            if (c24036 != null) {
                if ((c24036 instanceof C24036) && (th = ((C24036) c24036).f77869) != null && !(th instanceof C13452)) {
                    c24036 = new C24036(new C13452(th));
                }
                futureC3575.f11341 = c24036;
                return futureC3575;
            }
            futureC3575Mo10906.m10925((AbstractRunnableC4281) new C22625(null, futureC3575, futureC3575Mo10906));
            return futureC3575;
        } catch (Throwable th3) {
            futureC3575.f11341 = m10903(th3);
            return futureC3575;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static FutureC3575 m10895(IllegalStateException illegalStateException) {
        return new FutureC3575(new C24036(illegalStateException));
    }
}
