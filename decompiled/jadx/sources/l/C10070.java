package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: renamed from: l.ۤۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6UK */
/* JADX INFO: loaded from: classes3.dex */
public final class C10070 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f30271;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f30272;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public RunnableC21318 f30273;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f30274;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C15007 f30275;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f30276;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f30277;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C20194 f30278;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public FutureC3575 f30279;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C5795 f30280;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f30281;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile C8617 f30282;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C21605 f30283;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Thread f30284;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f30286;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f30287;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C12891 f30288;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f30289;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f30291;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Throwable f30292;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f30293;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f30294;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f30290 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 f30285 = new FutureC3575();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized FutureC3575 m25276(final C5795 c5795, boolean z) {
        if (this.f30281) {
            return m25271(new IllegalStateException("Persistence coordinator is closed"));
        }
        Throwable th = this.f30292;
        if (th != null) {
            return m25271(th);
        }
        FutureC3575 futureC3575 = this.f30279;
        if (futureC3575 == null) {
            this.f30280 = c5795;
            this.f30291 = z;
            this.f30279 = new FutureC3575();
            m25273();
            return this.f30279;
        }
        if (z) {
            return FutureC3575.m10905(-1L);
        }
        if (!this.f30291) {
            return futureC3575;
        }
        return futureC3575.m10927(new InterfaceC21423() { // from class: l.᩶ۙᩳ
            @Override // l.InterfaceC21423
            public final Object apply(Object obj) {
                FutureC3575 futureC3575M25276;
                C10070 c10070 = this.f64607;
                C5795 c5796 = c5795;
                Long l2 = (Long) obj;
                if (l2.longValue() >= 0) {
                    return FutureC3575.m10905(l2);
                }
                synchronized (c10070) {
                    futureC3575M25276 = c10070.m25276(c5796, false);
                }
                return futureC3575M25276;
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C4425 m25277(C8617 c8617, C21605 c21605) {
        C4425 c4425;
        if (this.f30281 || this.f30292 != null || this.f30284 != Thread.currentThread() || c8617.m22370() < this.f30277 || c8617.m22370() < this.f30282.m22370()) {
            throw new IllegalStateException("Recovery generation cannot replace current writer");
        }
        c4425 = new C4425(this, c8617, c21605);
        c21605.m48811();
        return c4425;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m25279(Throwable th) {
        this.f30292 = th;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m25281(RunnableC21318 runnableC21318) {
        if (!this.f30281 && this.f30292 == null) {
            this.f30273 = runnableC21318;
            m25273();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m25283() {
        if (this.f30281) {
            throw new IllegalStateException("Persistence coordinator is closed");
        }
        if (this.f30292 != null) {
            throw new IllegalStateException("Persistence requires reopening", this.f30292);
        }
        this.f30293 = true;
        this.f30274 = false;
        m25273();
    }

    public C10070(C8617 c8617, C21605 c21605, C20194 c20194, C12891 c12891) {
        this.f30282 = c8617;
        this.f30283 = c21605;
        this.f30288 = c12891;
        this.f30278 = c20194;
        try {
            c21605.m48811();
            this.f30277 = c8617.m22370();
        } catch (RuntimeException e) {
            c20194.close();
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m25280(C15007 c15007, long j) {
        C15007 c15008 = null;
        boolean z = false;
        try {
            synchronized (this) {
                try {
                    if (this.f30281) {
                        throw new IllegalStateException("Persistence coordinator is closed");
                    }
                    if (this.f30292 != null) {
                        throw new IllegalStateException("Persistence requires reopening", this.f30292);
                    }
                    if (c15007.f45764 <= this.f30277 || j < 0) {
                        throw new IllegalArgumentException("Invalid persistence request");
                    }
                    long jNanoTime = System.nanoTime();
                    C15007 c15009 = this.f30275;
                    if (c15009 == null) {
                        this.f30286 = jNanoTime;
                    }
                    this.f30294 = jNanoTime;
                    long j2 = this.f30287;
                    long j3 = C13132.FOREVER_NS;
                    if (j <= C13132.FOREVER_NS - j2) {
                        j3 = j2 + j;
                    }
                    this.f30287 = j3;
                    try {
                        this.f30275 = c15007;
                        this.f30277 = c15007.f45764;
                        z = true;
                        m25273();
                    } catch (Throwable th) {
                        th = th;
                        c15008 = c15009;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            throw th;
        } catch (Throwable th3) {
            if (c15008 != null) {
                c15008.close();
            }
            if (!z) {
                c15007.close();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m25275(long j) {
        synchronized (this) {
            Throwable th = this.f30292;
            if (th != null) {
                return m25271(th);
            }
            if (j >= 0 && j <= this.f30277) {
                long jM22370 = this.f30282.m22370();
                if (j <= jM22370) {
                    return FutureC3575.m10905(Long.valueOf(jM22370));
                }
                if (this.f30281) {
                    return m25271(new IllegalStateException("Persistence coordinator is closed"));
                }
                C5378.removeIf(this.f30290, new C22064());
                if (this.f30290.size() >= this.f30288.f38700) {
                    return m25271(new RejectedExecutionException("Persistence waiter limit reached"));
                }
                FutureC3575 futureC3575 = new FutureC3575();
                this.f30290.add(new C12186(j, futureC3575));
                this.f30293 = true;
                this.f30274 = false;
                m25273();
                return futureC3575;
            }
            return m25271(new IllegalArgumentException("Unknown session revision"));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m25282() {
        return this.f30282.m22370();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m25284() {
        return this.f30285;
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
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m25273() {
        if (this.f30281 || this.f30271 || this.f30292 != null) {
            return;
        }
        if (this.f30280 == null && this.f30273 == null && (this.f30274 || this.f30275 == null)) {
            return;
        }
        long jNanoTime = System.nanoTime();
        long jMax = 0;
        if (this.f30280 == null && this.f30273 == null && !this.f30293) {
            long j = this.f30287;
            C12891 c12891 = this.f30288;
            if (j < c12891.f38698) {
                jMax = Math.max(0L, Math.min(c12891.f38697 - (jNanoTime - this.f30294), c12891.f38699 - (jNanoTime - this.f30286)));
            }
        }
        ScheduledFuture scheduledFuture = this.f30272;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        final long j2 = this.f30276 + 1;
        this.f30276 = j2;
        this.f30272 = this.f30278.m46430(new Runnable() { // from class: l.᩸ۙᩳ
            @Override // java.lang.Runnable
            public final void run() {
                C10070.m25268(this.f68805, j2);
            }
        }, jMax);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25268(C10070 c10070, long j) {
        C15007 c15007;
        RunnableC21318 runnableC21318;
        Error error;
        synchronized (c10070) {
            if (!c10070.f30281 && !c10070.f30271 && c10070.f30292 == null && j == c10070.f30276 && ((c15007 = c10070.f30275) != null || c10070.f30280 != null || c10070.f30273 != null)) {
                C15007 c15008 = null;
                c10070.f30272 = null;
                c10070.f30271 = true;
                C5795 c5795 = (!c10070.f30291 || c15007 == null || c10070.f30274) ? c10070.f30280 : null;
                boolean z = false;
                if (c5795 != null) {
                    c10070.f30280 = null;
                    c10070.f30284 = Thread.currentThread();
                    c15007 = null;
                    runnableC21318 = null;
                } else {
                    runnableC21318 = c10070.f30273;
                    if (runnableC21318 != null && (c15007 == null || c10070.f30274 || !c10070.f30293)) {
                        c10070.f30273 = null;
                        c15007 = null;
                    } else {
                        c10070.f30275 = null;
                        c10070.f30287 = 0L;
                        c10070.f30293 = false;
                        runnableC21318 = null;
                    }
                }
                if (c5795 != null) {
                    c10070.m25267(c5795);
                    return;
                }
                if (runnableC21318 != null) {
                    c10070.m25266((Runnable) runnableC21318);
                    return;
                }
                try {
                    c10070.f30282.m22374(c15007.f45762, c15007.f45763.f7359, c15007.f45765, c15007.f45766, c15007.f45764);
                    error = null;
                } catch (Throwable th) {
                    error = th;
                }
                ArrayList<C12186> arrayList = new ArrayList();
                long jM22370 = c10070.f30282.m22370();
                synchronized (c10070) {
                    c10070.f30271 = false;
                    if (error == null || c10070.f30281) {
                        c15008 = c15007;
                    } else {
                        c10070.f30274 = true;
                        if (c10070.f30275 == null) {
                            c10070.f30275 = c15007;
                            long jNanoTime = System.nanoTime();
                            c10070.f30294 = jNanoTime;
                            c10070.f30286 = jNanoTime;
                        } else {
                            c15008 = c15007;
                        }
                    }
                    Iterator it = c10070.f30290.iterator();
                    while (it.hasNext()) {
                        C12186 c12186 = (C12186) it.next();
                        if (error != null || c12186.f36336 <= jM22370) {
                            arrayList.add(c12186);
                            it.remove();
                        }
                    }
                    c10070.m25273();
                    if (c10070.f30281 && !c10070.f30289) {
                        z = true;
                    }
                    if (z) {
                        c10070.f30289 = true;
                    }
                }
                if (c15008 != null) {
                    try {
                        c15008.close();
                    } catch (Throwable th2) {
                        if (z) {
                            c10070.m25274();
                        }
                        for (C12186 c12187 : arrayList) {
                            if (error == null) {
                                c12187.f36335.m10912(Long.valueOf(jM22370));
                            } else {
                                c12187.f36335.m10914((Throwable) error);
                            }
                        }
                        throw th2;
                    }
                }
                if (z) {
                    c10070.m25274();
                }
                for (C12186 c12188 : arrayList) {
                    if (error == null) {
                        c12188.f36335.m10912(Long.valueOf(jM22370));
                    } else {
                        c12188.f36335.m10914((Throwable) error);
                    }
                }
                if (error instanceof Error) {
                    throw error;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25266(Runnable runnable) {
        boolean z = false;
        try {
            runnable.run();
            synchronized (this) {
                this.f30271 = false;
                m25273();
                if (this.f30281 && !this.f30289) {
                    z = true;
                }
                if (z) {
                    this.f30289 = true;
                }
            }
        } finally {
            synchronized (this) {
                this.f30271 = false;
                m25273();
                if (this.f30281 && !this.f30289) {
                    z = true;
                }
                if (z) {
                    this.f30289 = true;
                }
                if (z) {
                    m25274();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m25267(InterfaceC3014 interfaceC3014) {
        long jRun;
        Error error;
        FutureC3575 futureC3575;
        Throwable th;
        boolean z;
        C15007 c15007 = null;
        try {
            jRun = interfaceC3014.run();
            error = null;
        } catch (Throwable th2) {
            jRun = -1;
            error = th2;
        }
        ArrayList<C12186> arrayList = new ArrayList();
        long jM22370 = this.f30282.m22370();
        synchronized (this) {
            this.f30271 = false;
            this.f30284 = null;
            futureC3575 = this.f30279;
            this.f30279 = null;
            th = this.f30292;
            C15007 c15008 = this.f30275;
            if (c15008 != null && c15008.f45764 <= jM22370) {
                this.f30275 = null;
                this.f30287 = 0L;
                this.f30293 = false;
                c15007 = c15008;
            }
            Iterator it = this.f30290.iterator();
            while (it.hasNext()) {
                C12186 c12186 = (C12186) it.next();
                if (th != null || c12186.f36336 <= jM22370) {
                    arrayList.add(c12186);
                    it.remove();
                }
            }
            m25273();
            z = this.f30281 && !this.f30289;
            if (z) {
                this.f30289 = true;
            }
        }
        if (c15007 != null) {
            try {
                c15007.close();
            } catch (Throwable th3) {
                if (z) {
                    m25274();
                }
                for (C12186 c12187 : arrayList) {
                    if (th == null) {
                        c12187.f36335.m10912(Long.valueOf(jM22370));
                    } else {
                        c12187.f36335.m10914(th);
                    }
                }
                if (error == null) {
                    futureC3575.m10912(Long.valueOf(jRun));
                    throw th3;
                }
                futureC3575.m10914((Throwable) error);
                throw th3;
            }
        }
        if (z) {
            m25274();
        }
        for (C12186 c12188 : arrayList) {
            if (th == null) {
                c12188.f36335.m10912(Long.valueOf(jM22370));
            } else {
                c12188.f36335.m10914(th);
            }
        }
        if (error == null) {
            futureC3575.m10912(Long.valueOf(jRun));
        } else {
            futureC3575.m10914((Throwable) error);
        }
        if (error instanceof Error) {
            throw error;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25278() {
        synchronized (this) {
            if (this.f30281) {
                return;
            }
            this.f30281 = true;
            ScheduledFuture scheduledFuture = this.f30272;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f30272 = null;
            this.f30276++;
            C15007 c15007 = this.f30275;
            this.f30275 = null;
            ArrayList arrayList = new ArrayList(this.f30290);
            this.f30290.clear();
            FutureC3575 futureC3575 = this.f30280 != null ? this.f30279 : null;
            this.f30280 = null;
            this.f30273 = null;
            if (futureC3575 != null) {
                this.f30279 = null;
            }
            boolean z = this.f30271;
            if (!z) {
                this.f30289 = true;
            }
            if (c15007 != null) {
                try {
                    c15007.close();
                } finally {
                    if (!z) {
                        m25274();
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C12186) it.next()).f36335.m10914((Throwable) new CancellationException("Persistence session abandoned"));
                    }
                    if (futureC3575 != null) {
                        futureC3575.m10914((Throwable) new CancellationException("Persistence session abandoned"));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m25274() {
        C20194 c20194 = this.f30278;
        try {
            this.f30283.m48812();
            c20194.close();
            th = null;
        } catch (Throwable th) {
            th = th;
            c20194.close();
        }
        FutureC3575 futureC3575 = this.f30285;
        if (th == null) {
            futureC3575.m10912((Object) null);
        } else {
            futureC3575.m10914(th);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static FutureC3575 m25271(Throwable th) {
        FutureC3575 futureC3575 = new FutureC3575();
        futureC3575.m10914(th);
        return futureC3575;
    }
}
