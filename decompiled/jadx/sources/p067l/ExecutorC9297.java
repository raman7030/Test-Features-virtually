package p067l;

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
public final class ExecutorC9297 implements Executor, Closeable {
    public volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;
    public volatile /* synthetic */ long parkedWorkersStack;

    /* JADX INFO: renamed from: ۗ */
    public final int f25270;

    /* JADX INFO: renamed from: ۙ */
    public final long f25271;

    /* JADX INFO: renamed from: ۬ */
    public final C7286 f25272;

    /* JADX INFO: renamed from: ᩶ */
    public final C18171 f25273;

    /* JADX INFO: renamed from: ᩸ */
    public final int f25274;

    /* JADX INFO: renamed from: ᩹ */
    public final C18171 f25275;

    /* JADX INFO: renamed from: ۫ */
    public static final C16672 f25269 = new C16672("NOT_IN_STACK");

    /* JADX INFO: renamed from: ۨ */
    public static final /* synthetic */ AtomicLongFieldUpdater f25268 = AtomicLongFieldUpdater.newUpdater(ExecutorC9297.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: ۛ */
    public static final /* synthetic */ AtomicLongFieldUpdater f25266 = AtomicLongFieldUpdater.newUpdater(ExecutorC9297.class, "controlState");

    /* JADX INFO: renamed from: ۤ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f25267 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC9297.class, "_isTerminated");

    public ExecutorC9297(int i, int i2, long j) {
        this.f25274 = i;
        this.f25270 = i2;
        this.f25271 = j;
        if (i < 1) {
            throw new IllegalArgumentException(C19768.m44906(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C19768.m44907("Max pool size ", i2, i, " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(C19768.m44906(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f25273 = new C18171();
        this.f25275 = new C18171();
        this.parkedWorkersStack = 0L;
        this.f25272 = new C7286(i + 1);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21508(C24049 c24049) {
        long j;
        int iM53298;
        if (c24049.m53303() != f25269) {
            return;
        }
        do {
            j = this.parkedWorkersStack;
            iM53298 = c24049.m53298();
            c24049.m53301(this.f25272.m16738((int) (2097151 & j)));
        } while (!f25268.compareAndSet(this, j, ((long) iM53298) | ((2097152 + j) & (-2097152))));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        AbstractRunnableC16159 abstractRunnableC16159M53300;
        if (f25267.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C24049 c24049 = null;
            C24049 c240410 = threadCurrentThread instanceof C24049 ? (C24049) threadCurrentThread : null;
            if (c240410 != null && C13045.m29864(c240410.f76384, this)) {
                c24049 = c240410;
            }
            synchronized (this.f25272) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objM16738 = this.f25272.m16738(i2);
                    C13045.m29861(objM16738);
                    C24049 c240411 = (C24049) objM16738;
                    if (c240411 != c24049) {
                        while (c240411.isAlive()) {
                            LockSupport.unpark(c240411);
                            c240411.join(10000L);
                        }
                        c240411.f76387.m39864(this.f25275);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f25275.m26256();
            this.f25273.m26256();
            while (true) {
                if (c24049 != null) {
                    abstractRunnableC16159M53300 = c24049.m53300(true);
                    if (abstractRunnableC16159M53300 == null) {
                        abstractRunnableC16159M53300 = (AbstractRunnableC16159) this.f25273.m26259();
                        if (abstractRunnableC16159M53300 == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    abstractRunnableC16159M53300 = (AbstractRunnableC16159) this.f25273.m26259();
                    if (abstractRunnableC16159M53300 == null && (abstractRunnableC16159M53300 = (AbstractRunnableC16159) this.f25275.m26259()) == null) {
                        break;
                    }
                }
                try {
                    abstractRunnableC16159M53300.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c24049 != null) {
                c24049.m53302(EnumC15331.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m21507(runnable, C11467.f31980);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21507(Runnable runnable, InterfaceC24877 interfaceC24877) {
        AbstractRunnableC16159 c22196;
        AbstractRunnableC16159 abstractRunnableC16159M39863;
        boolean zM26257;
        C11467.f31982.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC16159) {
            c22196 = (AbstractRunnableC16159) runnable;
            c22196.f47599 = jNanoTime;
            c22196.f47600 = interfaceC24877;
        } else {
            c22196 = new C22196(runnable, jNanoTime, interfaceC24877);
        }
        Thread threadCurrentThread = Thread.currentThread();
        C24049 c24049 = null;
        C24049 c240410 = threadCurrentThread instanceof C24049 ? (C24049) threadCurrentThread : null;
        if (c240410 != null && C13045.m29864(c240410.f76384, this)) {
            c24049 = c240410;
        }
        if (c24049 == null || c24049.f76382 == EnumC15331.TERMINATED || (c22196.f47600.mo20320() == 0 && c24049.f76382 == EnumC15331.BLOCKING)) {
            abstractRunnableC16159M39863 = c22196;
        } else {
            c24049.f76388 = true;
            abstractRunnableC16159M39863 = c24049.f76387.m39863(c22196);
        }
        if (abstractRunnableC16159M39863 != null) {
            if (abstractRunnableC16159M39863.f47600.mo20320() == 1) {
                zM26257 = this.f25275.m26257(abstractRunnableC16159M39863);
            } else {
                zM26257 = this.f25273.m26257(abstractRunnableC16159M39863);
            }
            if (!zM26257) {
                throw new RejectedExecutionException("DefaultDispatcher was terminated");
            }
        }
        if (c22196.f47600.mo20320() != 0) {
            long jAddAndGet = f25266.addAndGet(this, 2097152L);
            if (m21505() || m21504(jAddAndGet)) {
                return;
            }
            m21505();
            return;
        }
        m21510();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m21510() {
        if (m21505() || m21504(this.controlState)) {
            return;
        }
        m21505();
    }

    /* JADX INFO: renamed from: ۧ */
    private final boolean m21504(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f25274;
        if (i < i2) {
            int iM21506 = m21506();
            if (iM21506 == 1 && i2 > 1) {
                m21506();
            }
            if (iM21506 > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    private final int m21506() {
        synchronized (this.f25272) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.f25274) {
                return 0;
            }
            if (i >= this.f25270) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 <= 0 || this.f25272.m16738(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            C24049 c24049 = new C24049(this, i3);
            this.f25272.m16739(i3, c24049);
            if (i3 != ((int) (2097151 & f25266.incrementAndGet(this)))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            c24049.start();
            return i2 + 1;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int iM16737 = this.f25272.m16737();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM16737; i6++) {
            C24049 c24049 = (C24049) this.f25272.m16738(i6);
            if (c24049 != null) {
                int iM39861 = c24049.f76387.m39861();
                int i7 = C13321.f37406[c24049.f76382.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM39861);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM39861);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (iM39861 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM39861);
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
        sb4.append(C12846.m29416(this));
        sb4.append("[Pool Size {core = ");
        sb4.append(this.f25274);
        sb4.append(", max = ");
        C7913.m18269(sb4, this.f25270, "}, Worker States {CPU = ", i, ", blocking = ");
        C7913.m18269(sb4, i2, ", parked = ", i3, ", dormant = ");
        C7913.m18269(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f25273.m26258());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f25275.m26258());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(this.f25274 - ((int) ((9223367638808264704L & j) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21509(C24049 c24049, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int iM53298 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (iM53298 == i) {
                if (i2 == 0) {
                    Object objM53303 = c24049.m53303();
                    while (true) {
                        if (objM53303 == f25269) {
                            iM53298 = -1;
                            break;
                        }
                        if (objM53303 == null) {
                            iM53298 = 0;
                            break;
                        }
                        C24049 c240410 = (C24049) objM53303;
                        iM53298 = c240410.m53298();
                        if (iM53298 != 0) {
                            break;
                        } else {
                            objM53303 = c240410.m53303();
                        }
                    }
                } else {
                    iM53298 = i2;
                }
            }
            if (iM53298 >= 0 && f25268.compareAndSet(this, j, j2 | ((long) iM53298))) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private final boolean m21505() {
        C16672 c16672;
        int i;
        while (true) {
            long j = this.parkedWorkersStack;
            C24049 c24049 = (C24049) this.f25272.m16738((int) (2097151 & j));
            if (c24049 == null) {
                c24049 = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM53303 = c24049.m53303();
                while (true) {
                    c16672 = f25269;
                    if (objM53303 == c16672) {
                        i = -1;
                        break;
                    }
                    if (objM53303 == null) {
                        i = 0;
                        break;
                    }
                    C24049 c240410 = (C24049) objM53303;
                    int iM53298 = c240410.m53298();
                    if (iM53298 != 0) {
                        i = iM53298;
                        break;
                    }
                    objM53303 = c240410.m53303();
                }
                if (i >= 0 && f25268.compareAndSet(this, j, ((long) i) | j2)) {
                    c24049.m53301(c16672);
                }
            }
            if (c24049 == null) {
                return false;
            }
            if (C24049.f76381.compareAndSet(c24049, -1, 0)) {
                LockSupport.unpark(c24049);
                return true;
            }
        }
    }
}
