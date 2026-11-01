package p067l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.ܿܰܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: B3B1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18894 extends AbstractC4813 {
    /* JADX INFO: renamed from: ᩳ */
    public void mo42996() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        C24517 c24517;
        Object obj = this.f10920;
        if ((obj == null) | (obj instanceof RunnableC15799)) {
            if (AbstractC4813.f10914) {
                c24517 = new C24517(new CancellationException("Future.cancel() was called."), z);
            } else {
                if (z) {
                    c24517 = C24517.f77661;
                } else {
                    c24517 = C24517.f77660;
                }
                C12826.requireNonNull(c24517);
            }
            while (!AbstractC4813.m10159(this, obj, c24517)) {
                obj = this.f10920;
                if (!(obj instanceof RunnableC15799)) {
                }
            }
            m42991(this, z);
            if (obj instanceof RunnableC15799) {
                throw null;
            }
            return true;
        }
        return false;
    }

    public boolean isCancelled() {
        return this.f10920 instanceof C24517;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f10920;
        return (!(obj instanceof RunnableC15799)) & (obj != null);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Object m42992(Object obj) throws ExecutionException {
        if (obj instanceof C24517) {
            Throwable th = ((C24517) obj).f77662;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof C4142) {
            throw new ExecutionException(((C4142) obj).f9139);
        }
        if (obj == AbstractC4813.f10917) {
            return null;
        }
        return obj;
    }

    @Override // p067l.InterfaceFutureC5483
    /* JADX INFO: renamed from: ֫ */
    public void mo12113(Runnable runnable, Executor executor) {
        C12860 c12860;
        C6194.m14026(executor, "Executor was null.");
        if (!isDone() && (c12860 = this.f10919) != C12860.f36174) {
            C12860 c12861 = new C12860(runnable, executor);
            do {
                c12861.f36176 = c12860;
                if (m10162(c12860, c12861)) {
                    return;
                } else {
                    c12860 = this.f10919;
                }
            } while (c12860 != C12860.f36174);
        }
        m42993(runnable, executor);
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo28151(Object obj) {
        if (obj == null) {
            obj = AbstractC4813.f10917;
        }
        if (!AbstractC4813.m10159(this, null, obj)) {
            return false;
        }
        m42991(this, false);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean mo28152(Throwable th) {
        th.getClass();
        if (!AbstractC4813.m10159(this, null, new C4142(th))) {
            return false;
        }
        m42991(this, false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static Object m42988(InterfaceFutureC5483 interfaceFutureC5483) {
        Object obj;
        Throwable thM35334;
        if (interfaceFutureC5483 instanceof InterfaceC18223) {
            Object c24517 = ((AbstractC18894) interfaceFutureC5483).f10920;
            if (c24517 instanceof C24517) {
                C24517 c24518 = (C24517) c24517;
                if (c24518.f77663) {
                    c24517 = c24518.f77662 != null ? new C24517(c24518.f77662, false) : C24517.f77660;
                }
            }
            C12826.requireNonNull(c24517);
            return c24517;
        }
        if ((interfaceFutureC5483 instanceof AbstractC24258) && (thM35334 = C15540.m35334((AbstractC24258) interfaceFutureC5483)) != null) {
            return new C4142(thM35334);
        }
        boolean zIsCancelled = interfaceFutureC5483.isCancelled();
        if ((!AbstractC4813.f10914) && zIsCancelled) {
            C24517 c24519 = C24517.f77660;
            C12826.requireNonNull(c24519);
            return c24519;
        }
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = interfaceFutureC5483.get();
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
                return new C4142(e);
            } catch (CancellationException e2) {
                if (!zIsCancelled) {
                    return new C4142(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC5483, e2));
                }
                return new C24517(e2, false);
            } catch (ExecutionException e3) {
                if (zIsCancelled) {
                    return new C24517(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC5483, e3), false);
                }
                return new C4142(e3.getCause());
            } catch (Exception e4) {
                e = e4;
                return new C4142(e);
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? AbstractC4813.f10917 : obj;
        }
        return new C24517(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + interfaceFutureC5483), false);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m42989(StringBuilder sb) {
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
        m42990(sb, obj);
        sb.append("]");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42991(AbstractC18894 abstractC18894, boolean z) {
        abstractC18894.m10164();
        abstractC18894.mo42996();
        C12860 c12860M10161 = abstractC18894.m10161(C12860.f36174);
        C12860 c12860 = null;
        while (c12860M10161 != null) {
            C12860 c12861 = c12860M10161.f36176;
            c12860M10161.f36176 = c12860;
            c12860 = c12860M10161;
            c12860M10161 = c12861;
        }
        while (c12860 != null) {
            C12860 c12862 = c12860.f36176;
            Runnable runnable = c12860.f36177;
            C12826.requireNonNull(runnable);
            if (runnable instanceof RunnableC15799) {
                throw null;
            }
            Executor executor = c12860.f36175;
            C12826.requireNonNull(executor);
            m42993(runnable, executor);
            c12860 = c12862;
        }
    }

    @Override // p067l.AbstractC24258
    /* JADX INFO: renamed from: ֫ */
    public final Throwable mo42994() {
        if (!(this instanceof InterfaceC18223)) {
            return null;
        }
        Object obj = this.f10920;
        if (obj instanceof C4142) {
            return ((C4142) obj).f9139;
        }
        return null;
    }

    public final String toString() {
        String strMo42995;
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
            m42989(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            if (this.f10920 instanceof RunnableC15799) {
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
                    strMo42995 = mo42995();
                    if (strMo42995 == null || strMo42995.isEmpty()) {
                        strMo42995 = null;
                    }
                } catch (Throwable th2) {
                    if ((th2 instanceof Error) && !(th2 instanceof StackOverflowError)) {
                        throw th2;
                    }
                    strMo42995 = "Exception thrown from implementation: " + th2.getClass();
                }
                if (strMo42995 != null) {
                    C21545.m48729(sb, ", info=[", strMo42995, "]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                m42989(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ܿ */
    public String mo42995() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: ֫ */
    private void m42990(StringBuilder sb, Object obj) {
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

    /* JADX INFO: renamed from: ۧ */
    public static void m42993(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            AbstractC4813.f10916.m15619().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }
}
