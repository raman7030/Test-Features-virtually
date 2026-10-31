package l;

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

/* JADX INFO: renamed from: l.ۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: W9N5 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10635 implements InterfaceFutureC3277 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final AbstractC12604 f31967;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Object f31969;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile C1462 f31970;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile C11899 f31971;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile Object f31972;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final boolean f31966 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Logger f31968 = Logger.getLogger(AbstractC10635.class.getName());

    static {
        AbstractC12604 c7665;
        try {
            c7665 = new C23187(AtomicReferenceFieldUpdater.newUpdater(C1462.class, Thread.class, "ۧ"), AtomicReferenceFieldUpdater.newUpdater(C1462.class, C1462.class, "֫"), AtomicReferenceFieldUpdater.newUpdater(AbstractC10635.class, C1462.class, "᩶"), AtomicReferenceFieldUpdater.newUpdater(AbstractC10635.class, C11899.class, "᩸"), AtomicReferenceFieldUpdater.newUpdater(AbstractC10635.class, Object.class, "᩹"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c7665 = new C7665();
        }
        f31967 = c7665;
        if (th != null) {
            f31968.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f31969 = new Object();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26678(C1462 c1462) {
        c1462.f5215 = null;
        while (true) {
            C1462 c1463 = this.f31970;
            if (c1463 == C1462.f5213) {
                return;
            }
            C1462 c1464 = null;
            while (c1463 != null) {
                C1462 c1465 = c1463.f5214;
                if (c1463.f5215 != null) {
                    c1464 = c1463;
                } else if (c1464 != null) {
                    c1464.f5214 = c1465;
                    if (c1464.f5215 == null) {
                    }
                } else if (!f31967.mo20466(this, c1463, c1465)) {
                }
                c1463 = c1465;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        C1462 c1462 = C1462.f5213;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f31972;
        if ((obj != null) && (!(obj instanceof RunnableC14014))) {
            return m26676(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C1462 c1463 = this.f31970;
            if (c1463 != c1462) {
                C1462 c1464 = new C1462();
                while (true) {
                    AbstractC12604 abstractC12604 = f31967;
                    abstractC12604.mo20464(c1464, c1463);
                    if (abstractC12604.mo20466(this, c1463, c1464)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m26678(c1464);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f31972;
                            if ((obj2 != null) && (!(obj2 instanceof RunnableC14014))) {
                                return m26676(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m26678(c1464);
                        break;
                    }
                    c1463 = this.f31970;
                    if (c1463 == c1462) {
                    }
                }
            }
            return m26676(this.f31972);
        }
        while (nanos > 0) {
            Object obj3 = this.f31972;
            if ((obj3 != null) && (!(obj3 instanceof RunnableC14014))) {
                return m26676(obj3);
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
        StringBuilder sbM31106 = C12803.m31106("Waited ", " ", j);
        sbM31106.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbM31106.toString();
        if (nanos + 1000 < 0) {
            String strM37867 = C16014.m37867(string3, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM37868 = strM37867 + jConvert + " " + lowerCase;
                if (z) {
                    strM37868 = C16014.m37867(strM37868, ",");
                }
                strM37867 = C16014.m37867(strM37868, " ");
            }
            if (z) {
                strM37867 = strM37867 + nanos2 + " nanoseconds ";
            }
            string3 = C16014.m37867(strM37867, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(C16014.m37867(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(C22870.m50967(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        C1462 c1462 = C1462.f5213;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f31972;
        if ((obj2 != null) & (!(obj2 instanceof RunnableC14014))) {
            return m26676(obj2);
        }
        C1462 c1463 = this.f31970;
        if (c1463 != c1462) {
            C1462 c1464 = new C1462();
            do {
                AbstractC12604 abstractC12604 = f31967;
                abstractC12604.mo20464(c1464, c1463);
                if (abstractC12604.mo20466(this, c1463, c1464)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m26678(c1464);
                            throw new InterruptedException();
                        }
                        obj = this.f31972;
                    } while (!((obj != null) & (!(obj instanceof RunnableC14014))));
                    return m26676(obj);
                }
                c1463 = this.f31970;
            } while (c1463 != c1462);
        }
        return m26676(this.f31972);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m26676(Object obj) throws ExecutionException {
        if (obj instanceof C10488) {
            Throwable th = ((C10488) obj).f31463;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C6254) {
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f31969) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f31972;
        return (!(obj instanceof RunnableC14014)) & (obj != null);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f31972 instanceof C10488;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C10488 c10488;
        Object obj = this.f31972;
        if ((obj == null) | (obj instanceof RunnableC14014)) {
            if (f31966) {
                c10488 = new C10488(new CancellationException("Future.cancel() was called."), z);
            } else if (z) {
                c10488 = C10488.f31462;
            } else {
                c10488 = C10488.f31461;
            }
            while (!f31967.mo20465(this, obj, c10488)) {
                obj = this.f31972;
                if (!(obj instanceof RunnableC14014)) {
                }
            }
            m26679(this);
            if (obj instanceof RunnableC14014) {
                throw null;
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m26680(AbstractC10635 abstractC10635) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractC10635.get();
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26679(AbstractC10635 abstractC10635) {
        C1462 c1462;
        C11899 c11899;
        do {
            c1462 = abstractC10635.f31970;
        } while (!f31967.mo20466(abstractC10635, c1462, C1462.f5213));
        while (c1462 != null) {
            Thread thread = c1462.f5215;
            if (thread != null) {
                c1462.f5215 = null;
                LockSupport.unpark(thread);
            }
            c1462 = c1462.f5214;
        }
        do {
            c11899 = abstractC10635.f31971;
        } while (!f31967.mo20467(abstractC10635, c11899, C11899.f35535));
        C11899 c118910 = null;
        while (c11899 != null) {
            C11899 c118911 = c11899.f35537;
            c11899.f35537 = c118910;
            c118910 = c11899;
            c11899 = c118911;
        }
        while (c118910 != null) {
            C11899 c118912 = c118910.f35537;
            Runnable runnable = c118910.f35538;
            if (runnable instanceof RunnableC14014) {
                throw null;
            }
            m26681(runnable, c118910.f35536);
            c118910 = c118912;
        }
    }

    public final String toString() {
        String strM26682;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f31972 instanceof C10488) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m26677(sb);
        } else {
            try {
                strM26682 = m26682();
            } catch (RuntimeException e) {
                strM26682 = "Exception thrown from implementation: " + e.getClass();
            }
            if (strM26682 != null && !strM26682.isEmpty()) {
                C20177.m46410(sb, "PENDING, info=[", strM26682, "]");
            } else if (isDone()) {
                m26677(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m26682() {
        if (this.f31972 instanceof RunnableC14014) {
            return C4860.m14172("setFuture=[", "null", "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26677(StringBuilder sb) {
        try {
            Object objM26680 = m26680(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM26680 == this ? "this future" : String.valueOf(objM26680));
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m26681(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f31968.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // l.InterfaceFutureC3277
    /* JADX INFO: renamed from: ֫ */
    public final void mo10080(Runnable runnable, Executor executor) {
        executor.getClass();
        C11899 c11899 = this.f31971;
        C11899 c118910 = C11899.f35535;
        if (c11899 != c118910) {
            C11899 c118911 = new C11899(runnable, executor);
            do {
                c118911.f35537 = c11899;
                if (f31967.mo20467(this, c11899, c118911)) {
                    return;
                } else {
                    c11899 = this.f31971;
                }
            } while (c11899 != c118910);
        }
        m26681(runnable, executor);
    }
}
