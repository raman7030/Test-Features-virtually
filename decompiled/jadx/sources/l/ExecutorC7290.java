package l;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.۟ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: FAYC */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC7290 implements Executor, Closeable {
    public volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;
    public volatile /* synthetic */ long parkedWorkersStack;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f22379;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f22380;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5174 f22381;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C16627 f22382;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f22383;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C16627 f22384;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C15050 f22378 = new C15050("NOT_IN_STACK");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f22377 = AtomicLongFieldUpdater.newUpdater(ExecutorC7290.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f22375 = AtomicLongFieldUpdater.newUpdater(ExecutorC7290.class, "controlState");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f22376 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC7290.class, "_isTerminated");

    public ExecutorC7290(int i, int i2, long j) {
        this.f22383 = i;
        this.f22379 = i2;
        this.f22380 = j;
        if (i < 1) {
            throw new IllegalArgumentException(C18307.m42645(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C18307.m42646("Max pool size ", i2, i, " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(C18307.m42645(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f22382 = new C16627();
        this.f22384 = new C16627();
        this.parkedWorkersStack = 0L;
        this.f22381 = new C5174(i + 1);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19541(C22812 c22812) {
        long j;
        int iM50908;
        if (c22812.m50913() != f22378) {
            return;
        }
        do {
            j = this.parkedWorkersStack;
            iM50908 = c22812.m50908();
            c22812.m50911(this.f22381.m14829((int) (2097151 & j)));
        } while (!f22377.compareAndSet(this, j, ((long) iM50908) | ((2097152 + j) & (-2097152))));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        AbstractRunnableC14510 abstractRunnableC14510M50910;
        if (f22376.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C22812 c22812 = null;
            C22812 c22813 = threadCurrentThread instanceof C22812 ? (C22812) threadCurrentThread : null;
            if (c22813 != null && C11233.m27802(c22813.f73652, this)) {
                c22812 = c22813;
            }
            synchronized (this.f22381) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objM14829 = this.f22381.m14829(i2);
                    C11233.m27799(objM14829);
                    C22812 c22814 = (C22812) objM14829;
                    if (c22814 != c22812) {
                        while (c22814.isAlive()) {
                            LockSupport.unpark(c22814);
                            c22814.join(10000L);
                        }
                        c22814.f73655.m37689(this.f22384);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f22384.m24246();
            this.f22382.m24246();
            while (true) {
                if (c22812 != null) {
                    abstractRunnableC14510M50910 = c22812.m50910(true);
                    if (abstractRunnableC14510M50910 == null) {
                        abstractRunnableC14510M50910 = (AbstractRunnableC14510) this.f22382.m24249();
                        if (abstractRunnableC14510M50910 == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    abstractRunnableC14510M50910 = (AbstractRunnableC14510) this.f22382.m24249();
                    if (abstractRunnableC14510M50910 == null && (abstractRunnableC14510M50910 = (AbstractRunnableC14510) this.f22384.m24249()) == null) {
                        break;
                    }
                }
                try {
                    abstractRunnableC14510M50910.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c22812 != null) {
                c22812.m50912(EnumC13639.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m19540(runnable, C9573.f29033);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19540(Runnable runnable, InterfaceC23683 interfaceC23683) {
        AbstractRunnableC14510 c20862;
        AbstractRunnableC14510 abstractRunnableC14510M37688;
        boolean zM24247;
        C9573.f29035.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC14510) {
            c20862 = (AbstractRunnableC14510) runnable;
            c20862.f44493 = jNanoTime;
            c20862.f44494 = interfaceC23683;
        } else {
            c20862 = new C20862(runnable, jNanoTime, interfaceC23683);
        }
        Thread threadCurrentThread = Thread.currentThread();
        C22812 c22812 = null;
        C22812 c22813 = threadCurrentThread instanceof C22812 ? (C22812) threadCurrentThread : null;
        if (c22813 != null && C11233.m27802(c22813.f73652, this)) {
            c22812 = c22813;
        }
        if (c22812 == null || c22812.f73650 == EnumC13639.TERMINATED || (c20862.f44494.mo18372() == 0 && c22812.f73650 == EnumC13639.BLOCKING)) {
            abstractRunnableC14510M37688 = c20862;
        } else {
            c22812.f73656 = true;
            abstractRunnableC14510M37688 = c22812.f73655.m37688(c20862);
        }
        if (abstractRunnableC14510M37688 != null) {
            if (abstractRunnableC14510M37688.f44494.mo18372() == 1) {
                zM24247 = this.f22384.m24247(abstractRunnableC14510M37688);
            } else {
                zM24247 = this.f22382.m24247(abstractRunnableC14510M37688);
            }
            if (!zM24247) {
                throw new RejectedExecutionException("DefaultDispatcher was terminated");
            }
        }
        if (c20862.f44494.mo18372() != 0) {
            long jAddAndGet = f22375.addAndGet(this, 2097152L);
            if (m19538() || m19537(jAddAndGet)) {
                return;
            }
            m19538();
            return;
        }
        m19543();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m19543() {
        if (m19538() || m19537(this.controlState)) {
            return;
        }
        m19538();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final boolean m19537(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f22383;
        if (i < i2) {
            int iM19539 = m19539();
            if (iM19539 == 1 && i2 > 1) {
                m19539();
            }
            if (iM19539 > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private final int m19539() {
        synchronized (this.f22381) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.f22383) {
                return 0;
            }
            if (i >= this.f22379) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 <= 0 || this.f22381.m14829(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            C22812 c22812 = new C22812(this, i3);
            this.f22381.m14830(i3, c22812);
            if (i3 != ((int) (2097151 & f22375.incrementAndGet(this)))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            c22812.start();
            return i2 + 1;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int iM14828 = this.f22381.m14828();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM14828; i6++) {
            C22812 c22812 = (C22812) this.f22381.m14829(i6);
            if (c22812 != null) {
                int iM37686 = c22812.f73655.m37686();
                int i7 = C11524.f34409[c22812.f73650.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM37686);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM37686);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (iM37686 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM37686);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        StringBuilder sb4 = new StringBuilder("DefaultDispatcher@");
        sb4.append(C11024.m27354(this));
        sb4.append("[Pool Size {core = ");
        sb4.append(this.f22383);
        sb4.append(", max = ");
        C5834.m16344(sb4, this.f22379, "}, Worker States {CPU = ", i, ", blocking = ");
        C5834.m16344(sb4, i2, ", parked = ", i3, ", dormant = ");
        C5834.m16344(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f22382.m24248());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f22384.m24248());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(this.f22383 - ((int) ((9223367638808264704L & j) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19542(C22812 c22812, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int iM50908 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (iM50908 == i) {
                if (i2 == 0) {
                    Object objM50913 = c22812.m50913();
                    while (true) {
                        if (objM50913 == f22378) {
                            iM50908 = -1;
                            break;
                        }
                        if (objM50913 == null) {
                            iM50908 = 0;
                            break;
                        }
                        C22812 c22813 = (C22812) objM50913;
                        iM50908 = c22813.m50908();
                        if (iM50908 != 0) {
                            break;
                        } else {
                            objM50913 = c22813.m50913();
                        }
                    }
                } else {
                    iM50908 = i2;
                }
            }
            if (iM50908 >= 0 && f22377.compareAndSet(this, j, j2 | ((long) iM50908))) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private final boolean m19538() {
        C15050 c15050;
        int i;
        while (true) {
            long j = this.parkedWorkersStack;
            C22812 c22812 = (C22812) this.f22381.m14829((int) (2097151 & j));
            if (c22812 == null) {
                c22812 = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM50913 = c22812.m50913();
                while (true) {
                    c15050 = f22378;
                    if (objM50913 == c15050) {
                        i = -1;
                        break;
                    }
                    if (objM50913 == null) {
                        i = 0;
                        break;
                    }
                    C22812 c22813 = (C22812) objM50913;
                    int iM50908 = c22813.m50908();
                    if (iM50908 != 0) {
                        i = iM50908;
                        break;
                    }
                    objM50913 = c22813.m50913();
                }
                if (i >= 0 && f22377.compareAndSet(this, j, ((long) i) | j2)) {
                    c22812.m50911(c15050);
                }
            }
            if (c22812 == null) {
                return false;
            }
            if (C22812.f73649.compareAndSet(c22812, -1, 0)) {
                LockSupport.unpark(c22812);
                return true;
            }
        }
    }
}
