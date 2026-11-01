package p067l;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ۧ֡ */
/* JADX INFO: compiled from: W9N5 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1370 implements InterfaceFutureC5483 {

    /* JADX INFO: renamed from: ۙ */
    public static final AbstractC1467 f34938;

    /* JADX INFO: renamed from: ۬ */
    public static final Object f34940;

    /* JADX INFO: renamed from: ᩶ */
    public volatile C0915 f34941;

    /* JADX INFO: renamed from: ᩸ */
    public volatile C1432 f34942;

    /* JADX INFO: renamed from: ᩹ */
    public volatile Object f34943;

    /* JADX INFO: renamed from: ۗ */
    public static final boolean f34937 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: ۫ */
    public static final Logger f34939 = Logger.getLogger(AbstractC1370.class.getName());

    static {
        AbstractC1467 c1222;
        try {
            c1222 = new C1992(AtomicReferenceFieldUpdater.newUpdater(C0915.class, Thread.class, "ۧ"), AtomicReferenceFieldUpdater.newUpdater(C0915.class, C0915.class, "֫"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1370.class, C0915.class, "᩶"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1370.class, C1432.class, "᩸"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1370.class, Object.class, "᩹"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c1222 = new C1222();
        }
        f34938 = c1222;
        if (th != null) {
            f34939.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f34940 = new Object();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m28718(C0915 c0915) {
        c0915.f7988 = null;
        while (true) {
            C0915 c0916 = this.f34941;
            if (c0916 == C0915.f7986) {
                return;
            }
            C0915 c0917 = null;
            while (c0916 != null) {
                C0915 c0918 = c0916.f7987;
                if (c0916.f7988 != null) {
                    c0917 = c0916;
                } else if (c0917 != null) {
                    c0917.f7987 = c0918;
                    if (c0917.f7988 == null) {
                    }
                } else if (!f34938.mo22446(this, c0916, c0918)) {
                }
                c0916 = c0918;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C0915 c0915 = C0915.f7986;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f34943;
        if ((obj != null) && (!(obj instanceof RunnableC1537))) {
            return m28716(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0915 c0916 = this.f34941;
            if (c0916 != c0915) {
                C0915 c0917 = new C0915();
                while (true) {
                    AbstractC1467 abstractC1467 = f34938;
                    abstractC1467.mo22444(c0917, c0916);
                    if (abstractC1467.mo22446(this, c0916, c0917)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m28718(c0917);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f34943;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC1537))) {
                                return m28716(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m28718(c0917);
                        break;
                    }
                    c0916 = this.f34941;
                    if (c0916 == c0915) {
                    }
                }
            }
            return m28716(this.f34943);
        }
        while (nanos > 0) {
            Object obj3 = this.f34943;
            if ((obj3 != null) && (!(obj3 instanceof RunnableC1537))) {
                return m28716(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbM33191 = C14536.m33191("Waited ", " ", j);
        sbM33191.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbM33191.toString();
        if (nanos + 1000 < 0) {
            String strM40053 = C17588.m40053(string3, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM40054 = strM40053 + jConvert + " " + lowerCase;
                if (z) {
                    strM40054 = C17588.m40053(strM40054, ",");
                }
                strM40053 = C17588.m40053(strM40054, " ");
            }
            if (z) {
                strM40053 = strM40053 + nanos2 + " nanoseconds ";
            }
            string3 = C17588.m40053(strM40053, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(C17588.m40053(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(C24104.m53357(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C0915 c0915 = C0915.f7986;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f34943;
        if ((obj2 != null) & (!(obj2 instanceof RunnableC1537))) {
            return m28716(obj2);
        }
        C0915 c0916 = this.f34941;
        if (c0916 != c0915) {
            C0915 c0917 = new C0915();
            do {
                AbstractC1467 abstractC1467 = f34938;
                abstractC1467.mo22444(c0917, c0916);
                if (abstractC1467.mo22446(this, c0916, c0917)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m28718(c0917);
                            throw new InterruptedException();
                        }
                        obj = this.f34943;
                    } while (!((obj != null) & (!(obj instanceof RunnableC1537))));
                    return m28716(obj);
                }
                c0916 = this.f34941;
            } while (c0916 != c0915);
        }
        return m28716(this.f34943);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m28716(Object obj) throws ExecutionException {
        if (obj instanceof C1362) {
            Throwable th = ((C1362) obj).f34426;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C1152) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f34940) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f34943;
        return (!(obj instanceof RunnableC1537)) & (obj != null);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f34943 instanceof C1362;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C1362 c1362;
        Object obj = this.f34943;
        if ((obj == null) | (obj instanceof RunnableC1537)) {
            if (f34937) {
                c1362 = new C1362(new CancellationException("Future.cancel() was called."), z);
            } else if (z) {
                c1362 = C1362.f34425;
            } else {
                c1362 = C1362.f34424;
            }
            while (!f34938.mo22445(this, obj, c1362)) {
                obj = this.f34943;
                if (!(obj instanceof RunnableC1537)) {
                }
            }
            m28719(this);
            if (obj instanceof RunnableC1537) {
                throw null;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public static Object m28720(AbstractC1370 abstractC1370) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractC1370.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m28719(AbstractC1370 abstractC1370) {
        C0915 c0915;
        C1432 c1432;
        do {
            c0915 = abstractC1370.f34941;
        } while (!f34938.mo22446(abstractC1370, c0915, C0915.f7986));
        while (c0915 != null) {
            Thread thread = c0915.f7988;
            if (thread != null) {
                c0915.f7988 = null;
                LockSupport.unpark(thread);
            }
            c0915 = c0915.f7987;
        }
        do {
            c1432 = abstractC1370.f34942;
        } while (!f34938.mo22447(abstractC1370, c1432, C1432.f38545));
        C1432 c1433 = null;
        while (c1432 != null) {
            C1432 c1434 = c1432.f38547;
            c1432.f38547 = c1433;
            c1433 = c1432;
            c1432 = c1434;
        }
        while (c1433 != null) {
            C1432 c1435 = c1433.f38547;
            Runnable runnable = c1433.f38548;
            if (runnable instanceof RunnableC1537) {
                throw null;
            }
            m28721(runnable, c1433.f38546);
            c1433 = c1435;
        }
    }

    public final String toString() {
        String strM28722;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f34943 instanceof C1362) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m28717(sb);
        } else {
            try {
                strM28722 = m28722();
            } catch (RuntimeException e) {
                strM28722 = "Exception thrown from implementation: " + e.getClass();
            }
            if (strM28722 != null && !strM28722.isEmpty()) {
                C21545.m48729(sb, "PENDING, info=[", strM28722, "]");
            } else if (isDone()) {
                m28717(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public final String m28722() {
        if (this.f34943 instanceof RunnableC1537) {
            return C6988.m16053("setFuture=[", "null", "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: ֫ */
    private void m28717(StringBuilder sb) {
        try {
            Object objM28720 = m28720(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM28720 == this ? "this future" : String.valueOf(objM28720));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m28721(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f34939.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // p067l.InterfaceFutureC5483
    /* JADX INFO: renamed from: ֫ */
    public final void mo12113(Runnable runnable, Executor executor) {
        executor.getClass();
        C1432 c1432 = this.f34942;
        C1432 c1433 = C1432.f38545;
        if (c1432 != c1433) {
            C1432 c1434 = new C1432(runnable, executor);
            do {
                c1434.f38547 = c1432;
                if (f34938.mo22447(this, c1432, c1434)) {
                    return;
                } else {
                    c1432 = this.f34942;
                }
            } while (c1432 != c1433);
        }
        m28721(runnable, executor);
    }
}
