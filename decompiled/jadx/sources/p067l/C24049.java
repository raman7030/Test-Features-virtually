package p067l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.᩺ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: FAYC */
/* JADX INFO: loaded from: classes.dex */
public final class C24049 extends Thread {

    /* JADX INFO: renamed from: ۤ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f76381 = AtomicIntegerFieldUpdater.newUpdater(C24049.class, "workerCtl");
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;
    public volatile /* synthetic */ int workerCtl;

    /* JADX INFO: renamed from: ۗ */
    public EnumC15331 f76382;

    /* JADX INFO: renamed from: ۙ */
    public int f76383;

    /* JADX INFO: renamed from: ۫ */
    public final /* synthetic */ ExecutorC9297 f76384;

    /* JADX INFO: renamed from: ۬ */
    public long f76385;

    /* JADX INFO: renamed from: ᩶ */
    public long f76386;

    /* JADX INFO: renamed from: ᩸ */
    public final C17500 f76387;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f76388;

    public C24049() {
        throw null;
    }

    public C24049(ExecutorC9297 executorC9297, int i) {
        this.f76384 = executorC9297;
        setDaemon(true);
        this.f76387 = new C17500();
        this.f76382 = EnumC15331.DORMANT;
        this.workerCtl = 0;
        this.nextParkedWorker = ExecutorC9297.f25269;
        this.f76383 = AbstractC21092.f66271.mo25444();
        m53304(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m53298() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m53304(int i) {
        StringBuilder sb = new StringBuilder("DefaultDispatcher-worker-");
        this.f76384.getClass();
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53301(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m53303() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractRunnableC16159 m53300(boolean z) {
        AbstractRunnableC16159 abstractRunnableC16159M53297;
        AbstractRunnableC16159 abstractRunnableC16159M53298;
        long j;
        AbstractRunnableC16159 abstractRunnableC16159M39866;
        if (this.f76382 != EnumC15331.CPU_ACQUIRED) {
            ExecutorC9297 executorC9297 = this.f76384;
            do {
                j = executorC9297.controlState;
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    if (!z || (abstractRunnableC16159M39866 = this.f76387.m39866()) == null) {
                        abstractRunnableC16159M39866 = (AbstractRunnableC16159) this.f76384.f25275.m26259();
                    }
                    return abstractRunnableC16159M39866 == null ? m53296(true) : abstractRunnableC16159M39866;
                }
            } while (!ExecutorC9297.f25266.compareAndSet(executorC9297, j, j - 4398046511104L));
            this.f76382 = EnumC15331.CPU_ACQUIRED;
        }
        if (z) {
            boolean z2 = m53299(this.f76384.f25274 * 2) == 0;
            if (z2 && (abstractRunnableC16159M53298 = m53297()) != null) {
                return abstractRunnableC16159M53298;
            }
            AbstractRunnableC16159 abstractRunnableC16159M39867 = this.f76387.m39866();
            if (abstractRunnableC16159M39867 != null) {
                return abstractRunnableC16159M39867;
            }
            if (!z2 && (abstractRunnableC16159M53297 = m53297()) != null) {
                return abstractRunnableC16159M53297;
            }
        } else {
            AbstractRunnableC16159 abstractRunnableC16159M53299 = m53297();
            if (abstractRunnableC16159M53299 != null) {
                return abstractRunnableC16159M53299;
            }
        }
        return m53296(false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m53302(EnumC15331 enumC15331) {
        EnumC15331 enumC15332 = this.f76382;
        boolean z = enumC15332 == EnumC15331.CPU_ACQUIRED;
        if (z) {
            ExecutorC9297.f25266.addAndGet(this.f76384, 4398046511104L);
        }
        if (enumC15332 != enumC15331) {
            this.f76382 = enumC15331;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (!this.f76384.isTerminated()) {
                    EnumC15331 enumC15331 = this.f76382;
                    EnumC15331 enumC15332 = EnumC15331.TERMINATED;
                    if (enumC15331 == enumC15332) {
                        break loop0;
                    }
                    AbstractRunnableC16159 abstractRunnableC16159M53300 = m53300(this.f76388);
                    if (abstractRunnableC16159M53300 != null) {
                        this.f76386 = 0L;
                        ExecutorC9297 executorC9297 = this.f76384;
                        int iMo20320 = abstractRunnableC16159M53300.f47600.mo20320();
                        this.f76385 = 0L;
                        if (this.f76382 == EnumC15331.PARKING) {
                            this.f76382 = EnumC15331.BLOCKING;
                        }
                        if (iMo20320 != 0 && m53302(EnumC15331.BLOCKING)) {
                            executorC9297.m21510();
                        }
                        executorC9297.getClass();
                        try {
                            abstractRunnableC16159M53300.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        if (iMo20320 != 0) {
                            ExecutorC9297.f25266.addAndGet(executorC9297, -2097152L);
                            if (this.f76382 == enumC15332) {
                                break;
                            }
                            this.f76382 = EnumC15331.DORMANT;
                            break;
                        }
                        break;
                    }
                    this.f76388 = false;
                    if (this.f76386 != 0) {
                        if (z) {
                            m53302(EnumC15331.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f76386);
                            this.f76386 = 0L;
                            break;
                        }
                        z = true;
                    } else if (this.nextParkedWorker == ExecutorC9297.f25269) {
                        this.f76384.m21508(this);
                    } else {
                        this.workerCtl = -1;
                        while (this.nextParkedWorker != ExecutorC9297.f25269 && this.workerCtl == -1 && !this.f76384.isTerminated()) {
                            EnumC15331 enumC15333 = this.f76382;
                            EnumC15331 enumC15334 = EnumC15331.TERMINATED;
                            if (enumC15333 == enumC15334) {
                                break;
                            }
                            m53302(EnumC15331.PARKING);
                            Thread.interrupted();
                            if (this.f76385 == 0) {
                                this.f76385 = System.nanoTime() + this.f76384.f25271;
                            }
                            LockSupport.parkNanos(this.f76384.f25271);
                            if (System.nanoTime() - this.f76385 >= 0) {
                                this.f76385 = 0L;
                                ExecutorC9297 executorC9298 = this.f76384;
                                synchronized (executorC9298.f25272) {
                                    if (!executorC9298.isTerminated()) {
                                        if (((int) (executorC9298.controlState & 2097151)) > executorC9298.f25274) {
                                            if (f76381.compareAndSet(this, -1, 1)) {
                                                int i = this.indexInArray;
                                                m53304(0);
                                                executorC9298.m21509(this, i, 0);
                                                int andDecrement = (int) (ExecutorC9297.f25266.getAndDecrement(executorC9298) & 2097151);
                                                if (andDecrement != i) {
                                                    Object objM16738 = executorC9298.f25272.m16738(andDecrement);
                                                    C13045.m29861(objM16738);
                                                    C24049 c24049 = (C24049) objM16738;
                                                    executorC9298.f25272.m16739(i, c24049);
                                                    c24049.m53304(i);
                                                    executorC9298.m21509(c24049, andDecrement, i);
                                                }
                                                executorC9298.f25272.m16739(andDecrement, null);
                                                C10027 c10027 = C10027.f27775;
                                                this.f76382 = enumC15334;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        m53302(EnumC15331.TERMINATED);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m53299(int i) {
        int i2 = this.f76383;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f76383 = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* JADX INFO: renamed from: ܽ */
    private final AbstractRunnableC16159 m53297() {
        int iM53299 = m53299(2);
        ExecutorC9297 executorC9297 = this.f76384;
        if (iM53299 == 0) {
            AbstractRunnableC16159 abstractRunnableC16159 = (AbstractRunnableC16159) executorC9297.f25273.m26259();
            return abstractRunnableC16159 != null ? abstractRunnableC16159 : (AbstractRunnableC16159) executorC9297.f25275.m26259();
        }
        AbstractRunnableC16159 abstractRunnableC161510 = (AbstractRunnableC16159) executorC9297.f25275.m26259();
        return abstractRunnableC161510 != null ? abstractRunnableC161510 : (AbstractRunnableC16159) executorC9297.f25273.m26259();
    }

    /* JADX INFO: renamed from: ۧ */
    private final AbstractRunnableC16159 m53296(boolean z) {
        long jM39865;
        int i = (int) (this.f76384.controlState & 2097151);
        if (i < 2) {
            return null;
        }
        int iM53299 = m53299(i);
        ExecutorC9297 executorC9297 = this.f76384;
        long jMin = Long.MAX_VALUE;
        for (int i2 = 0; i2 < i; i2++) {
            iM53299++;
            if (iM53299 > i) {
                iM53299 = 1;
            }
            C24049 c24049 = (C24049) executorC9297.f25272.m16738(iM53299);
            if (c24049 != null && c24049 != this) {
                if (z) {
                    jM39865 = this.f76387.m39862(c24049.f76387);
                } else {
                    jM39865 = this.f76387.m39865(c24049.f76387);
                }
                if (jM39865 == -1) {
                    return this.f76387.m39866();
                }
                if (jM39865 > 0) {
                    jMin = Math.min(jMin, jM39865);
                }
            }
        }
        if (jMin == C14849.FOREVER_NS) {
            jMin = 0;
        }
        this.f76386 = jMin;
        return null;
    }
}
