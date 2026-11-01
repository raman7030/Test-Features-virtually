package p067l;

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
public final class FutureC5767 implements Future, InterfaceC14484 {

    /* JADX INFO: renamed from: ۗ */
    public static final C25213 f14140 = new C25213(null);

    /* JADX INFO: renamed from: ۙ */
    public static final long f14141;

    /* JADX INFO: renamed from: ۛ */
    public static final boolean f14142;

    /* JADX INFO: renamed from: ۤ */
    public static final Unsafe f14143;

    /* JADX INFO: renamed from: ۫ */
    public static final long f14144;

    /* JADX INFO: renamed from: ۬ */
    public static final long f14145;

    /* JADX INFO: renamed from: ᩶ */
    public static final Executor f14146;

    /* JADX INFO: renamed from: ᩸ */
    public volatile Object f14147;

    /* JADX INFO: renamed from: ᩹ */
    public volatile AbstractRunnableC6438 f14148;

    @Override // p067l.InterfaceC14484
    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 mo12883() {
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m12896(AbstractRunnableC6438 abstractRunnableC6438) {
        AbstractRunnableC6438 abstractRunnableC6439 = this.f14148;
        m12877(abstractRunnableC6438, abstractRunnableC6439);
        return C19849.m45090(f14143, this, f14144, abstractRunnableC6439, abstractRunnableC6438);
    }

    static {
        Executor executorC21191;
        boolean z = C18705.f55870 > 1;
        f14142 = z;
        if (!z) {
            executorC21191 = new ExecutorC21191();
        } else {
            executorC21191 = C18705.f55876;
        }
        f14146 = executorC21191;
        Unsafe unsafe = C3282.f6392;
        f14143 = unsafe;
        try {
            f14145 = unsafe.objectFieldOffset(FutureC5767.class.getDeclaredField("᩸"));
            f14144 = unsafe.objectFieldOffset(FutureC5767.class.getDeclaredField("᩹"));
            f14141 = unsafe.objectFieldOffset(AbstractRunnableC6438.class.getDeclaredField("ۤ"));
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m12905() {
        C16495.m37413(f14143, this, f14145);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m12906(Object obj) {
        Unsafe unsafe = f14143;
        if (obj == null) {
            obj = f14140;
        }
        return C19178.m43667(unsafe, this, f14145, obj);
    }

    /* JADX INFO: renamed from: ܽ */
    public static C25213 m12880(Throwable th) {
        if (!(th instanceof C15154)) {
            th = new C15154(th);
        }
        return new C25213(th);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12901(Throwable th) {
        C19178.m43667(f14143, this, f14145, m12880(th));
    }

    /* JADX INFO: renamed from: ۧ */
    public static Object m12878(Object obj, Throwable th) {
        if (!(th instanceof C15154)) {
            th = new C15154(th);
        } else if ((obj instanceof C25213) && th == ((C25213) obj).f80621) {
            return obj;
        }
        return new C25213(th);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12890(Object obj, Throwable th) {
        C19178.m43667(f14143, this, f14145, m12878(obj, th));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12900(Object obj) {
        Throwable th;
        Unsafe unsafe = f14143;
        if ((obj instanceof C25213) && (th = ((C25213) obj).f80621) != null && !(th instanceof C15154)) {
            obj = new C25213(new C15154(th));
        }
        C19178.m43667(unsafe, this, f14145, obj);
    }

    /* JADX INFO: renamed from: ܿ */
    public static Object m12881(Object obj) throws ExecutionException, InterruptedException {
        Throwable cause;
        if (obj == null) {
            throw new InterruptedException();
        }
        if (!(obj instanceof C25213)) {
            return obj;
        }
        Throwable th = ((C25213) obj).f80621;
        if (th == null) {
            return null;
        }
        if (th instanceof CancellationException) {
            throw ((CancellationException) th);
        }
        if ((th instanceof C15154) && (cause = th.getCause()) != null) {
            th = cause;
        }
        throw new ExecutionException(th);
    }

    /* JADX INFO: renamed from: ֫ */
    public static FutureC5767 m12873(RunnableC2963 runnableC2963, ThreadPoolExecutor threadPoolExecutor) {
        Executor executor;
        if (f14142 || threadPoolExecutor != C18705.f55876) {
            threadPoolExecutor.getClass();
            executor = threadPoolExecutor;
        } else {
            executor = f14146;
        }
        FutureC5767 futureC5767 = new FutureC5767();
        RunnableC9120 runnableC9120 = new RunnableC9120();
        runnableC9120.f24691 = futureC5767;
        runnableC9120.f24690 = runnableC2963;
        executor.execute(runnableC9120);
        return futureC5767;
    }

    /* JADX INFO: renamed from: ֫ */
    public static FutureC5767 m12874(C5824 c5824, Executor executor) {
        if (f14142 || executor != C18705.f55876) {
            executor.getClass();
        } else {
            executor = f14146;
        }
        FutureC5767 futureC5767 = new FutureC5767();
        RunnableC22532 runnableC22532 = new RunnableC22532();
        runnableC22532.f71040 = futureC5767;
        runnableC22532.f71039 = c5824;
        executor.execute(runnableC22532);
        return futureC5767;
    }

    /* JADX INFO: renamed from: ۧ */
    public final FutureC5767 m12897(Runnable runnable, Executor executor) {
        if (f14142 || executor != C18705.f55876) {
            executor.getClass();
        } else {
            executor = f14146;
        }
        return m12879(runnable, executor);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12877(AbstractRunnableC6438 abstractRunnableC6438, AbstractRunnableC6438 abstractRunnableC6439) {
        f14143.putOrderedObject(abstractRunnableC6438, f14141, abstractRunnableC6439);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m12903() {
        while (true) {
            FutureC5767 futureC5767Mo5217 = this;
            while (true) {
                AbstractRunnableC6438 abstractRunnableC6438 = futureC5767Mo5217.f14148;
                if (abstractRunnableC6438 == null) {
                    if (futureC5767Mo5217 == this || (abstractRunnableC6438 = this.f14148) == null) {
                        return;
                    } else {
                        futureC5767Mo5217 = this;
                    }
                }
                AbstractRunnableC6438 abstractRunnableC6439 = abstractRunnableC6438;
                AbstractRunnableC6438 abstractRunnableC64310 = abstractRunnableC6439.f16646;
                Unsafe unsafe = f14143;
                if (C19849.m45090(unsafe, futureC5767Mo5217, f14144, abstractRunnableC6439, abstractRunnableC64310)) {
                    if (abstractRunnableC64310 != null) {
                        if (futureC5767Mo5217 != this) {
                            while (!m12896(abstractRunnableC6439)) {
                            }
                        } else {
                            C22248.m50078(unsafe, abstractRunnableC6439, f14141, abstractRunnableC64310, null);
                        }
                    }
                    futureC5767Mo5217 = abstractRunnableC6439.mo5217(-1);
                    if (futureC5767Mo5217 == null) {
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12899() {
        AbstractRunnableC6438 abstractRunnableC6438;
        boolean zM45090 = false;
        while (true) {
            abstractRunnableC6438 = this.f14148;
            if (abstractRunnableC6438 == null || abstractRunnableC6438.mo7255()) {
                break;
            }
            zM45090 = C19849.m45090(f14143, this, f14144, abstractRunnableC6438, abstractRunnableC6438.f16646);
        }
        if (abstractRunnableC6438 == null || zM45090) {
            return;
        }
        AbstractRunnableC6438 abstractRunnableC6439 = abstractRunnableC6438.f16646;
        AbstractRunnableC6438 abstractRunnableC64310 = abstractRunnableC6438;
        while (abstractRunnableC6439 != null) {
            AbstractRunnableC6438 abstractRunnableC64311 = abstractRunnableC6439.f16646;
            if (!abstractRunnableC6439.mo7255()) {
                C22248.m50078(f14143, abstractRunnableC64310, f14141, abstractRunnableC6439, abstractRunnableC64311);
                return;
            } else {
                abstractRunnableC64310 = abstractRunnableC6439;
                abstractRunnableC6439 = abstractRunnableC64311;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12902(AbstractRunnableC6438 abstractRunnableC6438) {
        while (!m12896(abstractRunnableC6438)) {
            if (this.f14147 != null) {
                m12877(abstractRunnableC6438, (AbstractRunnableC6438) null);
                break;
            }
        }
        if (this.f14147 != null) {
            abstractRunnableC6438.mo5217(0);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 m12885(FutureC5767 futureC5767, int i) {
        if (futureC5767 != null && futureC5767.f14148 != null) {
            Object obj = futureC5767.f14147;
            if (obj == null) {
                futureC5767.m12899();
            }
            if (i >= 0 && (obj != null || futureC5767.f14147 != null)) {
                futureC5767.m12903();
            }
        }
        if (this.f14147 == null || this.f14148 == null) {
            return null;
        }
        if (i < 0) {
            return this;
        }
        m12903();
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final FutureC5767 m12898(InterfaceC22729 interfaceC22729) {
        Object obj = this.f14147;
        if (obj != null) {
            FutureC5767 futureC5767 = new FutureC5767();
            if (obj instanceof C25213) {
                Throwable th = ((C25213) obj).f80621;
                if (th != null) {
                    futureC5767.f14147 = m12878(obj, th);
                    return futureC5767;
                }
                obj = null;
            }
            try {
                Object objApply = interfaceC22729.apply(obj);
                if (objApply == null) {
                    objApply = f14140;
                }
                futureC5767.f14147 = objApply;
                return futureC5767;
            } catch (Throwable th2) {
                futureC5767.f14147 = m12880(th2);
                return futureC5767;
            }
        }
        FutureC5767 futureC5768 = new FutureC5767();
        C7779 c7779 = new C7779(null, futureC5768, this);
        c7779.f20398 = interfaceC22729;
        m12902((AbstractRunnableC6438) c7779);
        return futureC5768;
    }

    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 m12886(C9158 c9158) {
        Object obj = this.f14147;
        if (obj != null) {
            FutureC5767 futureC5767 = new FutureC5767();
            if (obj instanceof C25213) {
                Throwable th = ((C25213) obj).f80621;
                if (th != null) {
                    futureC5767.f14147 = m12878(obj, th);
                    return futureC5767;
                }
                obj = null;
            }
            try {
                c9158.m21100(obj);
                futureC5767.f14147 = f14140;
                return futureC5767;
            } catch (Throwable th2) {
                futureC5767.f14147 = m12880(th2);
                return futureC5767;
            }
        }
        FutureC5767 futureC5768 = new FutureC5767();
        C3084 c3084 = new C3084(null, futureC5768, this);
        c3084.f5578 = c9158;
        m12902((AbstractRunnableC6438) c3084);
        return futureC5768;
    }

    /* JADX INFO: renamed from: ܽ */
    private FutureC5767 m12879(Runnable runnable, Executor executor) {
        Throwable th;
        Object obj = this.f14147;
        if (obj != null) {
            FutureC5767 futureC5767 = new FutureC5767();
            if ((obj instanceof C25213) && (th = ((C25213) obj).f80621) != null) {
                futureC5767.f14147 = m12878(obj, th);
                return futureC5767;
            }
            try {
                if (executor != null) {
                    executor.execute(new C21861(null, futureC5767, this, runnable));
                    return futureC5767;
                }
                runnable.run();
                futureC5767.f14147 = f14140;
                return futureC5767;
            } catch (Throwable th2) {
                futureC5767.f14147 = m12880(th2);
                return futureC5767;
            }
        }
        FutureC5767 futureC5768 = new FutureC5767();
        m12902((AbstractRunnableC6438) new C21861(executor, futureC5768, this, runnable));
        return futureC5768;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0031  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m12893(Object obj, InterfaceC9988 interfaceC9988, C7108 c7108) {
        Throwable th;
        if (this.f14147 == null) {
            Throwable th2 = null;
            Object obj2 = null;
            if (c7108 != null) {
                try {
                    if (!c7108.m7254()) {
                        return false;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (th2 != null) {
                        th = th2;
                    }
                    m12890(obj, th);
                    return true;
                }
            }
            if (obj instanceof C25213) {
                th = ((C25213) obj).f80621;
            } else {
                th = null;
                obj2 = obj;
            }
            try {
                interfaceC9988.mo6895(obj2, th);
                if (th == null) {
                    C19178.m43667(f14143, this, f14145, obj);
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
            m12890(obj, th);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m12894(Object obj, InterfaceC16692 interfaceC16692, C23202 c23202) {
        if (this.f14147 != null) {
            return true;
        }
        if (c23202 != null) {
            try {
                if (!c23202.m7254()) {
                    return false;
                }
            } catch (Throwable th) {
                m12901(th);
                return true;
            }
        }
        Throwable th2 = null;
        if (obj instanceof C25213) {
            th2 = ((C25213) obj).f80621;
            obj = null;
        }
        m12906(interfaceC16692.mo27141(obj, th2));
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m12895(Object obj, InterfaceC22729 interfaceC22729, C17165 c17165) {
        Throwable th;
        if (this.f14147 != null) {
            return true;
        }
        if (c17165 != null) {
            try {
                if (!c17165.m7254()) {
                    return false;
                }
            } catch (Throwable th2) {
                m12901(th2);
                return true;
            }
        }
        if (!(obj instanceof C25213) || (th = ((C25213) obj).f80621) == null) {
            C19178.m43667(f14143, this, f14145, obj);
            return true;
        }
        m12906(interfaceC22729.apply(th));
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static FutureC5767 m12876(FutureC5767[] futureC5767Arr, int i, int i2) {
        FutureC5767 futureC5767M12876;
        FutureC5767 futureC5767M12877;
        Object obj;
        Throwable th;
        C25213 c25213 = f14140;
        FutureC5767 futureC5767 = new FutureC5767();
        if (i > i2) {
            futureC5767.f14147 = c25213;
            return futureC5767;
        }
        int i3 = (i + i2) >>> 1;
        if (i == i3) {
            futureC5767M12876 = futureC5767Arr[i];
        } else {
            futureC5767M12876 = m12876(futureC5767Arr, i, i3);
        }
        if (futureC5767M12876 == null) {
            throw null;
        }
        if (i == i2) {
            futureC5767M12877 = futureC5767M12876;
        } else {
            int i4 = i3 + 1;
            futureC5767M12877 = i2 == i4 ? futureC5767Arr[i2] : m12876(futureC5767Arr, i4, i2);
        }
        if (futureC5767M12877 == null) {
            throw null;
        }
        Object obj2 = futureC5767M12876.f14147;
        if (obj2 == null || (obj = futureC5767M12877.f14147) == null) {
            C17836 c17836 = new C17836(null, futureC5767, futureC5767M12876);
            c17836.f30854 = futureC5767M12877;
            while (futureC5767M12876.f14147 == null) {
                if (futureC5767M12876.m12896((AbstractRunnableC6438) c17836)) {
                    if (futureC5767M12877.f14147 == null) {
                        C5097 c5097 = new C5097();
                        c5097.f11935 = c17836;
                        futureC5767M12877.m12902((AbstractRunnableC6438) c5097);
                        return futureC5767;
                    }
                    if (futureC5767M12876.f14147 != null) {
                        c17836.mo5217(0);
                    }
                    return futureC5767;
                }
            }
            futureC5767M12877.m12902((AbstractRunnableC6438) c17836);
            return futureC5767;
        }
        if (!(obj2 instanceof C25213) || (th = ((C25213) obj2).f80621) == null) {
            if (!(obj instanceof C25213) || (th = ((C25213) obj).f80621) == null) {
                futureC5767.f14147 = c25213;
                return futureC5767;
            }
            obj2 = obj;
        }
        futureC5767.f14147 = m12878(obj2, th);
        return futureC5767;
    }

    /* JADX INFO: renamed from: ֫ */
    private Object m12871(boolean z) {
        if (z && Thread.interrupted()) {
            return null;
        }
        boolean zM12896 = false;
        C20520 c20520 = null;
        while (true) {
            Object obj = this.f14147;
            if (obj != null) {
                if (c20520 != null) {
                    c20520.f63373 = null;
                    if (c20520.f63374) {
                        Thread.currentThread().interrupt();
                    }
                }
                m12903();
                return obj;
            }
            if (c20520 == null) {
                c20520 = new C20520(0L, 0L, z);
                if (Thread.currentThread() instanceof C5965) {
                    C18705.m42674(f14146, c20520);
                }
            } else if (!zM12896) {
                zM12896 = m12896((AbstractRunnableC6438) c20520);
            } else {
                if (z && c20520.f63374) {
                    c20520.f63373 = null;
                    m12899();
                    return null;
                }
                try {
                    C18705.m42675(c20520);
                } catch (InterruptedException unused) {
                    c20520.f63374 = true;
                }
            }
        }
    }

    public FutureC5767() {
    }

    public FutureC5767(Object obj) {
        this.f14147 = obj;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static FutureC5767 m12882(Object obj) {
        if (obj == null) {
            obj = f14140;
        }
        return new FutureC5767(obj);
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14147 != null;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object objM12871 = this.f14147;
        if (objM12871 == null) {
            objM12871 = m12871(true);
        }
        return m12881(objM12871);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws TimeoutException {
        Object obj;
        long nanos = timeUnit.toNanos(j);
        Object obj2 = this.f14147;
        if (obj2 == null) {
            long jNanoTime = System.nanoTime() + nanos;
            long j2 = 0;
            if (jNanoTime == 0) {
                jNanoTime = 1;
            }
            boolean z = false;
            C20520 c20520 = null;
            Object obj3 = null;
            boolean zM12896 = false;
            while (true) {
                if (!z) {
                    boolean zInterrupted = Thread.interrupted();
                    if (zInterrupted) {
                        obj2 = obj3;
                    } else {
                        Object obj4 = this.f14147;
                        if (obj4 == null && nanos > j2) {
                            if (c20520 == null) {
                                obj = obj4;
                                C20520 c20521 = new C20520(nanos, jNanoTime, true);
                                if (Thread.currentThread() instanceof C5965) {
                                    C18705.m42674(f14146, c20521);
                                }
                                c20520 = c20521;
                            } else {
                                obj = obj4;
                                if (!zM12896) {
                                    zM12896 = m12896((AbstractRunnableC6438) c20520);
                                } else {
                                    try {
                                        C18705.m42675(c20520);
                                        z = c20520.f63374;
                                        nanos = c20520.f63375;
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
            if (c20520 != null) {
                c20520.f63373 = null;
                if (obj2 == null) {
                    m12899();
                }
            }
            if (obj2 != null) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                m12903();
            } else {
                if (!z) {
                    throw new TimeoutException();
                }
                obj2 = null;
            }
        }
        return m12881(obj2);
    }

    /* JADX INFO: renamed from: ܿ */
    public final Object m12907() {
        Object objM12871 = this.f14147;
        if (objM12871 == null) {
            objM12871 = m12871(false);
        }
        if (!(objM12871 instanceof C25213)) {
            return objM12871;
        }
        Throwable th = ((C25213) objM12871).f80621;
        if (th == null) {
            return null;
        }
        if (th instanceof CancellationException) {
            throw ((CancellationException) th);
        }
        if (th instanceof C15154) {
            throw ((C15154) th);
        }
        throw new C15154(th);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12889(Object obj) {
        m12906(obj);
        m12903();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12891(Throwable th) {
        th.getClass();
        C19178.m43667(f14143, this, f14145, new C25213(th));
        m12903();
    }

    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 m12884(Runnable runnable) {
        return m12879(runnable, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static FutureC5767 m12875(FutureC5767... futureC5767Arr) {
        return m12876(futureC5767Arr, 0, futureC5767Arr.length - 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        if (this.f14147 == null) {
            if (C19178.m43667(f14143, this, f14145, new C25213(new CancellationException()))) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        m12903();
        return z2 || isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        Object obj = this.f14147;
        return (obj instanceof C25213) && (((C25213) obj).f80621 instanceof CancellationException);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m12908() {
        Object obj = this.f14147;
        return (obj instanceof C25213) && obj != f14140;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    public final String toString() {
        String strM44906;
        Object obj = this.f14147;
        int i = 0;
        for (AbstractRunnableC6438 abstractRunnableC6438 = this.f14148; abstractRunnableC6438 != null; abstractRunnableC6438 = abstractRunnableC6438.f16646) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (obj == null) {
            strM44906 = i == 0 ? "[Not completed]" : C19768.m44906(i, "[Not completed, ", " dependents]");
        } else if (obj instanceof C25213) {
            C25213 c25213 = (C25213) obj;
            if (c25213.f80621 != null) {
                strM44906 = "[Completed exceptionally: " + c25213.f80621 + "]";
            } else {
                strM44906 = "[Completed normally]";
            }
        } else {
            strM44906 = "[Completed normally]";
        }
        sb.append(strM44906);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 m12887(InterfaceC9988 interfaceC9988) {
        FutureC5767 futureC5767 = new FutureC5767();
        Object obj = this.f14147;
        if (obj == null) {
            C7108 c7108 = new C7108(null, futureC5767, this);
            c7108.f18543 = interfaceC9988;
            m12902((AbstractRunnableC6438) c7108);
            return futureC5767;
        }
        futureC5767.m12893(obj, interfaceC9988, (C7108) null);
        return futureC5767;
    }

    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 m12888(InterfaceC16692 interfaceC16692) {
        FutureC5767 futureC5767 = new FutureC5767();
        Object obj = this.f14147;
        if (obj == null) {
            C23202 c23202 = new C23202(null, futureC5767, this);
            c23202.f72889 = interfaceC16692;
            m12902((AbstractRunnableC6438) c23202);
            return futureC5767;
        }
        futureC5767.m12894(obj, interfaceC16692, (C23202) null);
        return futureC5767;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12892(InterfaceC22729 interfaceC22729) {
        FutureC5767 futureC5767 = new FutureC5767();
        Object obj = this.f14147;
        if (obj == null) {
            C17165 c17165 = new C17165(null, futureC5767, this);
            c17165.f51109 = interfaceC22729;
            m12902((AbstractRunnableC6438) c17165);
            return;
        }
        futureC5767.m12895(obj, interfaceC22729, (C17165) null);
    }

    /* JADX INFO: renamed from: ܽ */
    public final FutureC5767 m12904(InterfaceC22729 interfaceC22729) {
        Throwable th;
        FutureC5767 futureC5767 = new FutureC5767();
        Object obj = this.f14147;
        if (obj == null) {
            C10461 c10461 = new C10461(null, futureC5767, this);
            c10461.f28942 = interfaceC22729;
            m12902((AbstractRunnableC6438) c10461);
            return futureC5767;
        }
        if (obj instanceof C25213) {
            Throwable th2 = ((C25213) obj).f80621;
            if (th2 != null) {
                futureC5767.f14147 = m12878(obj, th2);
                return futureC5767;
            }
            obj = null;
        }
        try {
            FutureC5767 futureC5767Mo12883 = ((InterfaceC14484) interfaceC22729.apply(obj)).mo12883();
            Object c25213 = futureC5767Mo12883.f14147;
            if (c25213 != null) {
                if ((c25213 instanceof C25213) && (th = ((C25213) c25213).f80621) != null && !(th instanceof C15154)) {
                    c25213 = new C25213(new C15154(th));
                }
                futureC5767.f14147 = c25213;
                return futureC5767;
            }
            futureC5767Mo12883.m12902((AbstractRunnableC6438) new C23872(null, futureC5767, futureC5767Mo12883));
            return futureC5767;
        } catch (Throwable th3) {
            futureC5767.f14147 = m12880(th3);
            return futureC5767;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static FutureC5767 m12872(IllegalStateException illegalStateException) {
        return new FutureC5767(new C25213(illegalStateException));
    }
}
