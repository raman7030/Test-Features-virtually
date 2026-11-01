package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: l.ۤۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6UK */
/* JADX INFO: loaded from: classes3.dex */
public final class C11939 {

    /* JADX INFO: renamed from: ֡ */
    public boolean f33229;

    /* JADX INFO: renamed from: ֨ */
    public ScheduledFuture f33230;

    /* JADX INFO: renamed from: ֫ */
    public RunnableC22629 f33231;

    /* JADX INFO: renamed from: ۖ */
    public boolean f33232;

    /* JADX INFO: renamed from: ۘ */
    public C16631 f33233;

    /* JADX INFO: renamed from: ۚ */
    public long f33234;

    /* JADX INFO: renamed from: ۜ */
    public long f33235;

    /* JADX INFO: renamed from: ۠ */
    public final C21561 f33236;

    /* JADX INFO: renamed from: ۡ */
    public FutureC5767 f33237;

    /* JADX INFO: renamed from: ۢ */
    public C7876 f33238;

    /* JADX INFO: renamed from: ۧ */
    public boolean f33239;

    /* JADX INFO: renamed from: ܳ */
    public volatile C10558 f33240;

    /* JADX INFO: renamed from: ܶ */
    public C22902 f33241;

    /* JADX INFO: renamed from: ܺ */
    public Thread f33242;

    /* JADX INFO: renamed from: ܿ */
    public long f33244;

    /* JADX INFO: renamed from: ᩳ */
    public long f33245;

    /* JADX INFO: renamed from: ᩴ */
    public final C14620 f33246;

    /* JADX INFO: renamed from: ᩵ */
    public boolean f33247;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f33249;

    /* JADX INFO: renamed from: ᩸ */
    public Throwable f33250;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f33251;

    /* JADX INFO: renamed from: ᩻ */
    public long f33252;

    /* JADX INFO: renamed from: ᩶ */
    public final ArrayList f33248 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public final FutureC5767 f33243 = new FutureC5767();

    /* JADX INFO: renamed from: ֫ */
    public final synchronized FutureC5767 m27293(final C7876 c7876, boolean z) {
        if (this.f33239) {
            return m27288(new IllegalStateException("Persistence coordinator is closed"));
        }
        Throwable th = this.f33250;
        if (th != null) {
            return m27288(th);
        }
        FutureC5767 futureC5767 = this.f33237;
        if (futureC5767 == null) {
            this.f33238 = c7876;
            this.f33249 = z;
            this.f33237 = new FutureC5767();
            m27290();
            return this.f33237;
        }
        if (z) {
            return FutureC5767.m12882(-1L);
        }
        if (!this.f33249) {
            return futureC5767;
        }
        return futureC5767.m12904(new InterfaceC22729() { // from class: l.᩶ۙᩳ
            @Override // p067l.InterfaceC22729
            public final Object apply(Object obj) {
                FutureC5767 futureC5767M27293;
                C11939 c11939 = this.f67243;
                C7876 c7877 = c7876;
                Long l2 = (Long) obj;
                if (l2.longValue() >= 0) {
                    return FutureC5767.m12882(l2);
                }
                synchronized (c11939) {
                    futureC5767M27293 = c11939.m27293(c7877, false);
                }
                return futureC5767M27293;
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C6574 m27294(C10558 c10558, C22902 c22902) {
        C6574 c6574;
        if (this.f33239 || this.f33250 != null || this.f33242 != Thread.currentThread() || c10558.m24339() < this.f33235 || c10558.m24339() < this.f33240.m24339()) {
            throw new IllegalStateException("Recovery generation cannot replace current writer");
        }
        c6574 = new C6574(this, c10558, c22902);
        c22902.m51158();
        return c6574;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m27296(Throwable th) {
        this.f33250 = th;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m27298(RunnableC22629 runnableC22629) {
        if (!this.f33239 && this.f33250 == null) {
            this.f33231 = runnableC22629;
            m27290();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m27300() {
        if (this.f33239) {
            throw new IllegalStateException("Persistence coordinator is closed");
        }
        if (this.f33250 != null) {
            throw new IllegalStateException("Persistence requires reopening", this.f33250);
        }
        this.f33251 = true;
        this.f33232 = false;
        m27290();
    }

    public C11939(C10558 c10558, C22902 c22902, C21561 c21561, C14620 c14620) {
        this.f33240 = c10558;
        this.f33241 = c22902;
        this.f33246 = c14620;
        this.f33236 = c21561;
        try {
            c22902.m51158();
            this.f33235 = c10558.m24339();
        } catch (RuntimeException e) {
            c21561.close();
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r5 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m27297(C16631 c16631, long j) {
        C16631 c16632 = null;
        boolean z = false;
        try {
            synchronized (this) {
                try {
                    if (this.f33239) {
                        throw new IllegalStateException("Persistence coordinator is closed");
                    }
                    if (this.f33250 != null) {
                        throw new IllegalStateException("Persistence requires reopening", this.f33250);
                    }
                    if (c16631.f48877 <= this.f33235 || j < 0) {
                        throw new IllegalArgumentException("Invalid persistence request");
                    }
                    long jNanoTime = System.nanoTime();
                    C16631 c16633 = this.f33233;
                    if (c16633 == null) {
                        this.f33244 = jNanoTime;
                    }
                    this.f33252 = jNanoTime;
                    long j2 = this.f33245;
                    long j3 = C14849.FOREVER_NS;
                    if (j <= C14849.FOREVER_NS - j2) {
                        j3 = j2 + j;
                    }
                    this.f33245 = j3;
                    try {
                        this.f33233 = c16631;
                        this.f33235 = c16631.f48877;
                        z = true;
                        m27290();
                    } catch (Throwable th) {
                        th = th;
                        c16632 = c16633;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            throw th;
        } catch (Throwable th3) {
            if (c16632 != null) {
                c16632.close();
            }
            if (!z) {
                c16631.close();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final FutureC5767 m27292(long j) {
        synchronized (this) {
            Throwable th = this.f33250;
            if (th != null) {
                return m27288(th);
            }
            if (j >= 0 && j <= this.f33235) {
                long jM24339 = this.f33240.m24339();
                if (j <= jM24339) {
                    return FutureC5767.m12882(Long.valueOf(jM24339));
                }
                if (this.f33239) {
                    return m27288(new IllegalStateException("Persistence coordinator is closed"));
                }
                C7480.removeIf(this.f33248, new C23338());
                if (this.f33248.size() >= this.f33246.f41743) {
                    return m27288(new RejectedExecutionException("Persistence waiter limit reached"));
                }
                FutureC5767 futureC5767 = new FutureC5767();
                this.f33248.add(new C13950(j, futureC5767));
                this.f33251 = true;
                this.f33232 = false;
                m27290();
                return futureC5767;
            }
            return m27288(new IllegalArgumentException("Unknown session revision"));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m27299() {
        return this.f33240.m24339();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final FutureC5767 m27301() {
        return this.f33243;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [l.᩸ۙᩳ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ܳ */
    private void m27290() {
        if (this.f33239 || this.f33229 || this.f33250 != null) {
            return;
        }
        if (this.f33238 == null && this.f33231 == null && (this.f33232 || this.f33233 == null)) {
            return;
        }
        long jNanoTime = System.nanoTime();
        long jMax = 0;
        if (this.f33238 == null && this.f33231 == null && !this.f33251) {
            long j = this.f33245;
            C14620 c14620 = this.f33246;
            if (j < c14620.f41741) {
                jMax = Math.max(0L, Math.min(c14620.f41740 - (jNanoTime - this.f33252), c14620.f41742 - (jNanoTime - this.f33244)));
            }
        }
        ScheduledFuture scheduledFuture = this.f33230;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        final long j2 = this.f33234 + 1;
        this.f33234 = j2;
        this.f33230 = this.f33236.m48749(new Runnable() { // from class: l.᩸ۙᩳ
            @Override // java.lang.Runnable
            public final void run() {
                C11939.m27285(this.f71499, j2);
            }
        }, jMax);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX INFO: renamed from: ֫ */
    public static void m27285(C11939 c11939, long j) {
        C16631 c16631;
        RunnableC22629 runnableC22629;
        Error error;
        synchronized (c11939) {
            if (!c11939.f33239 && !c11939.f33229 && c11939.f33250 == null && j == c11939.f33234 && ((c16631 = c11939.f33233) != null || c11939.f33238 != null || c11939.f33231 != null)) {
                C16631 c16632 = null;
                c11939.f33230 = null;
                c11939.f33229 = true;
                C7876 c7876 = (!c11939.f33249 || c16631 == null || c11939.f33232) ? c11939.f33238 : null;
                boolean z = false;
                if (c7876 != null) {
                    c11939.f33238 = null;
                    c11939.f33242 = Thread.currentThread();
                    c16631 = null;
                    runnableC22629 = null;
                } else {
                    runnableC22629 = c11939.f33231;
                    if (runnableC22629 != null && (c16631 == null || c11939.f33232 || !c11939.f33251)) {
                        c11939.f33231 = null;
                        c16631 = null;
                    } else {
                        c11939.f33233 = null;
                        c11939.f33245 = 0L;
                        c11939.f33251 = false;
                        runnableC22629 = null;
                    }
                }
                if (c7876 != null) {
                    c11939.m27284(c7876);
                    return;
                }
                if (runnableC22629 != null) {
                    c11939.m27283((Runnable) runnableC22629);
                    return;
                }
                try {
                    c11939.f33240.m24343(c16631.f48875, c16631.f48876.f10147, c16631.f48878, c16631.f48879, c16631.f48877);
                    error = null;
                } catch (Throwable th) {
                    error = th;
                }
                ArrayList<C13950> arrayList = new ArrayList();
                long jM24339 = c11939.f33240.m24339();
                synchronized (c11939) {
                    c11939.f33229 = false;
                    if (error == null || c11939.f33239) {
                        c16632 = c16631;
                    } else {
                        c11939.f33232 = true;
                        if (c11939.f33233 == null) {
                            c11939.f33233 = c16631;
                            long jNanoTime = System.nanoTime();
                            c11939.f33252 = jNanoTime;
                            c11939.f33244 = jNanoTime;
                        } else {
                            c16632 = c16631;
                        }
                    }
                    Iterator it = c11939.f33248.iterator();
                    while (it.hasNext()) {
                        C13950 c13950 = (C13950) it.next();
                        if (error != null || c13950.f39347 <= jM24339) {
                            arrayList.add(c13950);
                            it.remove();
                        }
                    }
                    c11939.m27290();
                    if (c11939.f33239 && !c11939.f33247) {
                        z = true;
                    }
                    if (z) {
                        c11939.f33247 = true;
                    }
                }
                if (c16632 != null) {
                    try {
                        c16632.close();
                    } catch (Throwable th2) {
                        if (z) {
                            c11939.m27291();
                        }
                        for (C13950 c13951 : arrayList) {
                            if (error == null) {
                                c13951.f39346.m12889(Long.valueOf(jM24339));
                            } else {
                                c13951.f39346.m12891((Throwable) error);
                            }
                        }
                        throw th2;
                    }
                }
                if (z) {
                    c11939.m27291();
                }
                for (C13950 c13952 : arrayList) {
                    if (error == null) {
                        c13952.f39346.m12889(Long.valueOf(jM24339));
                    } else {
                        c13952.f39346.m12891((Throwable) error);
                    }
                }
                if (error instanceof Error) {
                    throw error;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m27283(Runnable runnable) {
        boolean z = false;
        try {
            runnable.run();
            synchronized (this) {
                this.f33229 = false;
                m27290();
                if (this.f33239 && !this.f33247) {
                    z = true;
                }
                if (z) {
                    this.f33247 = true;
                }
            }
        } finally {
            synchronized (this) {
                this.f33229 = false;
                m27290();
                if (this.f33239 && !this.f33247) {
                    z = true;
                }
                if (z) {
                    this.f33247 = true;
                }
                if (z) {
                    m27291();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m27284(InterfaceC5233 interfaceC5233) {
        long jRun;
        Error error;
        FutureC5767 futureC5767;
        Throwable th;
        boolean z;
        C16631 c16631 = null;
        try {
            jRun = interfaceC5233.run();
            error = null;
        } catch (Throwable th2) {
            jRun = -1;
            error = th2;
        }
        ArrayList<C13950> arrayList = new ArrayList();
        long jM24339 = this.f33240.m24339();
        synchronized (this) {
            this.f33229 = false;
            this.f33242 = null;
            futureC5767 = this.f33237;
            this.f33237 = null;
            th = this.f33250;
            C16631 c16632 = this.f33233;
            if (c16632 != null && c16632.f48877 <= jM24339) {
                this.f33233 = null;
                this.f33245 = 0L;
                this.f33251 = false;
                c16631 = c16632;
            }
            Iterator it = this.f33248.iterator();
            while (it.hasNext()) {
                C13950 c13950 = (C13950) it.next();
                if (th != null || c13950.f39347 <= jM24339) {
                    arrayList.add(c13950);
                    it.remove();
                }
            }
            m27290();
            z = this.f33239 && !this.f33247;
            if (z) {
                this.f33247 = true;
            }
        }
        if (c16631 != null) {
            try {
                c16631.close();
            } catch (Throwable th3) {
                if (z) {
                    m27291();
                }
                for (C13950 c13951 : arrayList) {
                    if (th == null) {
                        c13951.f39346.m12889(Long.valueOf(jM24339));
                    } else {
                        c13951.f39346.m12891(th);
                    }
                }
                if (error == null) {
                    futureC5767.m12889(Long.valueOf(jRun));
                    throw th3;
                }
                futureC5767.m12891((Throwable) error);
                throw th3;
            }
        }
        if (z) {
            m27291();
        }
        for (C13950 c13952 : arrayList) {
            if (th == null) {
                c13952.f39346.m12889(Long.valueOf(jM24339));
            } else {
                c13952.f39346.m12891(th);
            }
        }
        if (error == null) {
            futureC5767.m12889(Long.valueOf(jRun));
        } else {
            futureC5767.m12891((Throwable) error);
        }
        if (error instanceof Error) {
            throw error;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27295() {
        synchronized (this) {
            if (this.f33239) {
                return;
            }
            this.f33239 = true;
            ScheduledFuture scheduledFuture = this.f33230;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f33230 = null;
            this.f33234++;
            C16631 c16631 = this.f33233;
            this.f33233 = null;
            ArrayList arrayList = new ArrayList(this.f33248);
            this.f33248.clear();
            FutureC5767 futureC5767 = this.f33238 != null ? this.f33237 : null;
            this.f33238 = null;
            this.f33231 = null;
            if (futureC5767 != null) {
                this.f33237 = null;
            }
            boolean z = this.f33229;
            if (!z) {
                this.f33247 = true;
            }
            if (c16631 != null) {
                try {
                    c16631.close();
                } finally {
                    if (!z) {
                        m27291();
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C13950) it.next()).f39346.m12891((Throwable) new CancellationException("Persistence session abandoned"));
                    }
                    if (futureC5767 != null) {
                        futureC5767.m12891((Throwable) new CancellationException("Persistence session abandoned"));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m27291() {
        C21561 c21561 = this.f33236;
        try {
            this.f33241.m51159();
            c21561.close();
            th = null;
        } catch (Throwable th) {
            th = th;
            c21561.close();
        }
        FutureC5767 futureC5767 = this.f33243;
        if (th == null) {
            futureC5767.m12889((Object) null);
        } else {
            futureC5767.m12891(th);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static FutureC5767 m27288(Throwable th) {
        FutureC5767 futureC5767 = new FutureC5767();
        futureC5767.m12891(th);
        return futureC5767;
    }
}
