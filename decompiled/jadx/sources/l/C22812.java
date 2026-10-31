package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.᩺ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: FAYC */
/* JADX INFO: loaded from: classes.dex */
public final class C22812 extends Thread {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f73649 = AtomicIntegerFieldUpdater.newUpdater(C22812.class, "workerCtl");
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;
    public volatile /* synthetic */ int workerCtl;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EnumC13639 f73650;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f73651;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ExecutorC7290 f73652;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f73653;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f73654;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C15921 f73655;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f73656;

    public C22812() {
        throw null;
    }

    public C22812(ExecutorC7290 executorC7290, int i) {
        this.f73652 = executorC7290;
        setDaemon(true);
        this.f73655 = new C15921();
        this.f73650 = EnumC13639.DORMANT;
        this.workerCtl = 0;
        this.nextParkedWorker = ExecutorC7290.f22378;
        this.f73651 = AbstractC19700.f63640.mo23493();
        m50914(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50908() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m50914(int i) {
        StringBuilder sb = new StringBuilder("DefaultDispatcher-worker-");
        this.f73652.getClass();
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m50911(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m50913() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractRunnableC14510 m50910(boolean z) {
        AbstractRunnableC14510 abstractRunnableC14510M50907;
        AbstractRunnableC14510 abstractRunnableC14510M50908;
        long j;
        AbstractRunnableC14510 abstractRunnableC14510M37691;
        if (this.f73650 != EnumC13639.CPU_ACQUIRED) {
            ExecutorC7290 executorC7290 = this.f73652;
            do {
                j = executorC7290.controlState;
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    if (!z || (abstractRunnableC14510M37691 = this.f73655.m37691()) == null) {
                        abstractRunnableC14510M37691 = (AbstractRunnableC14510) this.f73652.f22384.m24249();
                    }
                    return abstractRunnableC14510M37691 == null ? m50906(true) : abstractRunnableC14510M37691;
                }
            } while (!ExecutorC7290.f22375.compareAndSet(executorC7290, j, j - 4398046511104L));
            this.f73650 = EnumC13639.CPU_ACQUIRED;
        }
        if (z) {
            boolean z2 = m50909(this.f73652.f22383 * 2) == 0;
            if (z2 && (abstractRunnableC14510M50908 = m50907()) != null) {
                return abstractRunnableC14510M50908;
            }
            AbstractRunnableC14510 abstractRunnableC14510M37692 = this.f73655.m37691();
            if (abstractRunnableC14510M37692 != null) {
                return abstractRunnableC14510M37692;
            }
            if (!z2 && (abstractRunnableC14510M50907 = m50907()) != null) {
                return abstractRunnableC14510M50907;
            }
        } else {
            AbstractRunnableC14510 abstractRunnableC14510M50909 = m50907();
            if (abstractRunnableC14510M50909 != null) {
                return abstractRunnableC14510M50909;
            }
        }
        return m50906(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50912(EnumC13639 enumC13639) {
        EnumC13639 enumC136310 = this.f73650;
        boolean z = enumC136310 == EnumC13639.CPU_ACQUIRED;
        if (z) {
            ExecutorC7290.f22375.addAndGet(this.f73652, 4398046511104L);
        }
        if (enumC136310 != enumC13639) {
            this.f73650 = enumC13639;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (!this.f73652.isTerminated()) {
                    EnumC13639 enumC13639 = this.f73650;
                    EnumC13639 enumC136310 = EnumC13639.TERMINATED;
                    if (enumC13639 == enumC136310) {
                        break loop0;
                    }
                    AbstractRunnableC14510 abstractRunnableC14510M50910 = m50910(this.f73656);
                    if (abstractRunnableC14510M50910 != null) {
                        this.f73654 = 0L;
                        ExecutorC7290 executorC7290 = this.f73652;
                        int iMo18372 = abstractRunnableC14510M50910.f44494.mo18372();
                        this.f73653 = 0L;
                        if (this.f73650 == EnumC13639.PARKING) {
                            this.f73650 = EnumC13639.BLOCKING;
                        }
                        if (iMo18372 != 0 && m50912(EnumC13639.BLOCKING)) {
                            executorC7290.m19543();
                        }
                        executorC7290.getClass();
                        try {
                            abstractRunnableC14510M50910.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        if (iMo18372 != 0) {
                            ExecutorC7290.f22375.addAndGet(executorC7290, -2097152L);
                            if (this.f73650 == enumC136310) {
                                break;
                            }
                            this.f73650 = EnumC13639.DORMANT;
                            break;
                        }
                        break;
                    }
                    this.f73656 = false;
                    if (this.f73654 != 0) {
                        if (z) {
                            m50912(EnumC13639.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f73654);
                            this.f73654 = 0L;
                            break;
                        }
                        z = true;
                    } else if (this.nextParkedWorker == ExecutorC7290.f22378) {
                        this.f73652.m19541(this);
                    } else {
                        this.workerCtl = -1;
                        while (this.nextParkedWorker != ExecutorC7290.f22378 && this.workerCtl == -1 && !this.f73652.isTerminated()) {
                            EnumC13639 enumC136311 = this.f73650;
                            EnumC13639 enumC136312 = EnumC13639.TERMINATED;
                            if (enumC136311 == enumC136312) {
                                break;
                            }
                            m50912(EnumC13639.PARKING);
                            Thread.interrupted();
                            if (this.f73653 == 0) {
                                this.f73653 = System.nanoTime() + this.f73652.f22380;
                            }
                            LockSupport.parkNanos(this.f73652.f22380);
                            if (System.nanoTime() - this.f73653 >= 0) {
                                this.f73653 = 0L;
                                ExecutorC7290 executorC7291 = this.f73652;
                                synchronized (executorC7291.f22381) {
                                    if (!executorC7291.isTerminated()) {
                                        if (((int) (executorC7291.controlState & 2097151)) > executorC7291.f22383) {
                                            if (f73649.compareAndSet(this, -1, 1)) {
                                                int i = this.indexInArray;
                                                m50914(0);
                                                executorC7291.m19542(this, i, 0);
                                                int andDecrement = (int) (ExecutorC7290.f22375.getAndDecrement(executorC7291) & 2097151);
                                                if (andDecrement != i) {
                                                    Object objM14829 = executorC7291.f22381.m14829(andDecrement);
                                                    C11233.m27799(objM14829);
                                                    C22812 c22812 = (C22812) objM14829;
                                                    executorC7291.f22381.m14830(i, c22812);
                                                    c22812.m50914(i);
                                                    executorC7291.m19542(c22812, andDecrement, i);
                                                }
                                                executorC7291.f22381.m14830(andDecrement, null);
                                                C8058 c8058 = C8058.f24861;
                                                this.f73650 = enumC136312;
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
        m50912(EnumC13639.TERMINATED);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50909(int i) {
        int i2 = this.f73651;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f73651 = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private final AbstractRunnableC14510 m50907() {
        int iM50909 = m50909(2);
        ExecutorC7290 executorC7290 = this.f73652;
        if (iM50909 == 0) {
            AbstractRunnableC14510 abstractRunnableC14510 = (AbstractRunnableC14510) executorC7290.f22382.m24249();
            return abstractRunnableC14510 != null ? abstractRunnableC14510 : (AbstractRunnableC14510) executorC7290.f22384.m24249();
        }
        AbstractRunnableC14510 abstractRunnableC14511 = (AbstractRunnableC14510) executorC7290.f22384.m24249();
        return abstractRunnableC14511 != null ? abstractRunnableC14511 : (AbstractRunnableC14510) executorC7290.f22382.m24249();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final AbstractRunnableC14510 m50906(boolean z) {
        long jM37690;
        int i = (int) (this.f73652.controlState & 2097151);
        if (i < 2) {
            return null;
        }
        int iM50909 = m50909(i);
        ExecutorC7290 executorC7290 = this.f73652;
        long jMin = Long.MAX_VALUE;
        for (int i2 = 0; i2 < i; i2++) {
            iM50909++;
            if (iM50909 > i) {
                iM50909 = 1;
            }
            C22812 c22812 = (C22812) executorC7290.f22381.m14829(iM50909);
            if (c22812 != null && c22812 != this) {
                if (z) {
                    jM37690 = this.f73655.m37687(c22812.f73655);
                } else {
                    jM37690 = this.f73655.m37690(c22812.f73655);
                }
                if (jM37690 == -1) {
                    return this.f73655.m37691();
                }
                if (jM37690 > 0) {
                    jMin = Math.min(jMin, jM37690);
                }
            }
        }
        if (jMin == C13132.FOREVER_NS) {
            jMin = 0;
        }
        this.f73654 = jMin;
        return null;
    }
}
