package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.ܿܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: B3B1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17388 extends AbstractC2572 {
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void mo40743() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C23304 c23304;
        Object obj = this.f8130;
        if ((obj == null) | (obj instanceof RunnableC14131)) {
            if (AbstractC2572.f8124) {
                c23304 = new C23304(new CancellationException("Future.cancel() was called."), z);
            } else {
                if (z) {
                    c23304 = C23304.f74916;
                } else {
                    c23304 = C23304.f74915;
                }
                C11003.requireNonNull(c23304);
            }
            while (!AbstractC2572.m8126(this, obj, c23304)) {
                obj = this.f8130;
                if (!(obj instanceof RunnableC14131)) {
                }
            }
            m40738(this, z);
            if (obj instanceof RunnableC14131) {
                throw null;
            }
            return true;
        }
        return false;
    }

    public boolean isCancelled() {
        return this.f8130 instanceof C23304;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f8130;
        return (!(obj instanceof RunnableC14131)) & (obj != null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m40739(Object obj) throws ExecutionException {
        if (obj instanceof C23304) {
            Throwable th = ((C23304) obj).f74917;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C1866) {
            throw new ExecutionException(((C1866) obj).f6358);
        }
        if (obj == AbstractC2572.f8127) {
            return null;
        }
        return obj;
    }

    @Override // l.InterfaceFutureC3277
    /* JADX INFO: renamed from: ֫ */
    public void mo10080(Runnable runnable, Executor executor) {
        C11039 c11039;
        C4025.m12106(executor, "Executor was null.");
        if (!isDone() && (c11039 = this.f8129) != C11039.f33179) {
            C11039 c110310 = new C11039(runnable, executor);
            do {
                c110310.f33181 = c11039;
                if (m8129(c11039, c110310)) {
                    return;
                } else {
                    c11039 = this.f8129;
                }
            } while (c11039 != C11039.f33179);
        }
        m40740(runnable, executor);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo26126(Object obj) {
        if (obj == null) {
            obj = AbstractC2572.f8127;
        }
        if (!AbstractC2572.m8126(this, null, obj)) {
            return false;
        }
        m40738(this, false);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo26127(Throwable th) {
        th.getClass();
        if (!AbstractC2572.m8126(this, null, new C1866(th))) {
            return false;
        }
        m40738(this, false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m40735(InterfaceFutureC3277 interfaceFutureC3277) {
        Object obj;
        Throwable thM33215;
        if (interfaceFutureC3277 instanceof InterfaceC16682) {
            Object c23304 = ((AbstractC17388) interfaceFutureC3277).f8130;
            if (c23304 instanceof C23304) {
                C23304 c23305 = (C23304) c23304;
                if (c23305.f74918) {
                    c23304 = c23305.f74917 != null ? new C23304(c23305.f74917, false) : C23304.f74915;
                }
            }
            C11003.requireNonNull(c23304);
            return c23304;
        }
        if ((interfaceFutureC3277 instanceof AbstractC23032) && (thM33215 = C13859.m33215((AbstractC23032) interfaceFutureC3277)) != null) {
            return new C1866(thM33215);
        }
        boolean zIsCancelled = interfaceFutureC3277.isCancelled();
        if ((!AbstractC2572.f8124) && zIsCancelled) {
            C23304 c23306 = C23304.f74915;
            C11003.requireNonNull(c23306);
            return c23306;
        }
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = interfaceFutureC3277.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error e) {
                e = e;
                return new C1866(e);
            } catch (CancellationException e2) {
                if (!zIsCancelled) {
                    return new C1866(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC3277, e2));
                }
                return new C23304(e2, false);
            } catch (ExecutionException e3) {
                if (zIsCancelled) {
                    return new C23304(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC3277, e3), false);
                }
                return new C1866(e3.getCause());
            } catch (Exception e4) {
                e = e4;
                return new C1866(e);
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? AbstractC2572.f8127 : obj;
        }
        return new C23304(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC3277), false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40736(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        m40737(sb, obj);
        sb.append("]");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40738(AbstractC17388 abstractC17388, boolean z) {
        abstractC17388.m8131();
        abstractC17388.mo40743();
        C11039 c11039M8128 = abstractC17388.m8128(C11039.f33179);
        C11039 c11039 = null;
        while (c11039M8128 != null) {
            C11039 c110310 = c11039M8128.f33181;
            c11039M8128.f33181 = c11039;
            c11039 = c11039M8128;
            c11039M8128 = c110310;
        }
        while (c11039 != null) {
            C11039 c110311 = c11039.f33181;
            Runnable runnable = c11039.f33182;
            C11003.requireNonNull(runnable);
            if (runnable instanceof RunnableC14131) {
                throw null;
            }
            Executor executor = c11039.f33180;
            C11003.requireNonNull(executor);
            m40740(runnable, executor);
            c11039 = c110311;
        }
    }

    @Override // l.AbstractC23032
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Throwable mo40741() {
        if (!(this instanceof InterfaceC16682)) {
            return null;
        }
        Object obj = this.f8130;
        if (obj instanceof C1866) {
            return ((C1866) obj).f6358;
        }
        return null;
    }

    public final String toString() {
        String strMo40742;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m40736(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            if (this.f8130 instanceof RunnableC14131) {
                sb.append(", setFuture=[");
                try {
                    sb.append((Object) null);
                } catch (Throwable th) {
                    if ((th instanceof Error) && !(th instanceof StackOverflowError)) {
                        throw th;
                    }
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strMo40742 = mo40742();
                    if (strMo40742 == null || strMo40742.isEmpty()) {
                        strMo40742 = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strMo40742 = "Exception thrown from implementation: " + th2.getClass();
                }
                if (strMo40742 != null) {
                    C20177.m46410(sb, ", info=[", strMo40742, "]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                m40736(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String mo40742() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40737(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m40740(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            AbstractC2572.f8126.m13744().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }
}
