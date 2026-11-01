package p067l;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۡۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K6PM */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractFutureC10659 implements Future, Serializable {
    public static final long serialVersionUID = -7721805057305804111L;

    /* JADX INFO: renamed from: ۙ */
    public static final Unsafe f29483;

    /* JADX INFO: renamed from: ᩶ */
    public static final long f29486;

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ int f29487 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public volatile int f29488;

    /* JADX INFO: renamed from: ۗ */
    public static final C22059[] f29482 = new C22059[32];

    /* JADX INFO: renamed from: ۬ */
    public static final ReentrantLock f29485 = new ReentrantLock();

    /* JADX INFO: renamed from: ۫ */
    public static final ReferenceQueue f29484 = new ReferenceQueue();

    /* JADX INFO: renamed from: ֫ */
    public void mo24522(Throwable th) {
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract boolean mo14730();

    /* JADX INFO: renamed from: ᩳ */
    public abstract Object mo14731();

    /* JADX INFO: renamed from: ֫ */
    private int m24513(int i) {
        int i2;
        do {
            i2 = this.f29488;
            if (i2 < 0) {
                return i2;
            }
        } while (!f29483.compareAndSwapInt(this, f29486, i2, i2 | i));
        if ((i2 >>> 16) == 0) {
            return i;
        }
        synchronized (this) {
            notifyAll();
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m24524() {
        int i = this.f29488;
        if (i < 0) {
            return i;
        }
        try {
            return mo14730() ? m24513(-268435456) : i;
        } catch (Throwable th) {
            return m24517(th);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24521(long j) {
        int i = this.f29488;
        if (i < 0 || !f29483.compareAndSwapInt(this, f29486, i, i | 65536)) {
            return;
        }
        synchronized (this) {
            if (this.f29488 >= 0) {
                try {
                    wait(j);
                } catch (InterruptedException unused) {
                }
            } else {
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private int m24514() {
        boolean z = false;
        int iM24524 = C18705.f55876.m42686(this) ? m24524() : 0;
        if (iM24524 < 0 || (iM24524 = this.f29488) < 0) {
            return iM24524;
        }
        int i = iM24524;
        do {
            if (f29483.compareAndSwapInt(this, f29486, i, i | 65536)) {
                synchronized (this) {
                    if (this.f29488 >= 0) {
                        try {
                            wait(0L);
                        } catch (InterruptedException unused) {
                            z = true;
                        }
                    } else {
                        notifyAll();
                    }
                }
            }
            i = this.f29488;
        } while (i >= 0);
        if (z) {
            Thread.currentThread().interrupt();
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩷ */
    private int m24519() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int iM24524 = this.f29488;
        if (iM24524 >= 0) {
            iM24524 = C18705.f55876.m42686(this) ? m24524() : 0;
            if (iM24524 >= 0) {
                while (true) {
                    int i = this.f29488;
                    if (i < 0) {
                        return i;
                    }
                    if (f29483.compareAndSwapInt(this, f29486, i, i | 65536)) {
                        synchronized (this) {
                            if (this.f29488 >= 0) {
                                wait(0L);
                            } else {
                                notifyAll();
                            }
                        }
                    }
                }
            }
        }
        return iM24524;
    }

    /* JADX INFO: renamed from: ܳ */
    private int m24518() {
        int iM24524;
        int i = this.f29488;
        if (i < 0) {
            return i;
        }
        Thread threadCurrentThread = Thread.currentThread();
        if (!(threadCurrentThread instanceof C5965)) {
            return m24514();
        }
        C5965 c5965 = (C5965) threadCurrentThread;
        C19376 c19376 = c5965.f14762;
        return (!c19376.m44114(this) || (iM24524 = m24524()) >= 0) ? c5965.f14761.m42682(c19376, this, 0L) : iM24524;
    }

    public void run() throws Throwable {
        int iM24524 = m24524();
        if (iM24524 >= 0) {
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread instanceof C5965) {
                C5965 c5965 = (C5965) threadCurrentThread;
                iM24524 = c5965.f14761.m42682(c5965.f14762, this, 0L);
            } else {
                iM24524 = m24514();
            }
        }
        int i = iM24524 & (-268435456);
        if (i != -268435456) {
            if (i == -1073741824) {
                throw new CancellationException();
            }
            if (i != Integer.MIN_VALUE) {
                return;
            }
            Throwable thM24516 = m24516();
            C15824 c15824 = C18705.f55874;
            throw thM24516;
        }
    }

    static {
        Unsafe unsafe = C3282.f6392;
        f29483 = unsafe;
        try {
            f29486 = unsafe.objectFieldOffset(AbstractFutureC10659.class.getDeclaredField("᩸"));
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private int m24517(Throwable th) {
        int iM24513 = this.f29488;
        if (iM24513 >= 0) {
            int iIdentityHashCode = System.identityHashCode(this);
            ReentrantLock reentrantLock = f29485;
            reentrantLock.lock();
            try {
                m24520();
                C22059[] c22059Arr = f29482;
                int i = iIdentityHashCode & 31;
                C22059 c22059 = c22059Arr[i];
                while (true) {
                    if (c22059 == null) {
                        c22059Arr[i] = new C22059(this, th, c22059Arr[i], f29484);
                        break;
                    }
                    if (c22059.get() == this) {
                        break;
                    }
                    c22059 = c22059.f69393;
                }
                reentrantLock.unlock();
                iM24513 = m24513(Integer.MIN_VALUE);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        if (((-268435456) & iM24513) == Integer.MIN_VALUE) {
            mo24522(th);
        }
        return iM24513;
    }

    /* JADX INFO: renamed from: ۢ */
    private Throwable m24516() {
        Throwable th;
        int iIdentityHashCode = System.identityHashCode(this);
        ReentrantLock reentrantLock = f29485;
        reentrantLock.lock();
        try {
            m24520();
            C22059 c22059 = f29482[iIdentityHashCode & 31];
            while (c22059 != null && c22059.get() != this) {
                c22059 = c22059.f69393;
            }
            reentrantLock.unlock();
            if (c22059 == null || (th = c22059.f69391) == null) {
                return null;
            }
            if (c22059.f69394 != Thread.currentThread().getId()) {
                try {
                    Constructor<?> constructor = null;
                    for (Constructor<?> constructor2 : th.getClass().getConstructors()) {
                        Class<?>[] parameterTypes = constructor2.getParameterTypes();
                        if (parameterTypes.length == 0) {
                            constructor = constructor2;
                        } else if (parameterTypes.length == 1 && parameterTypes[0] == Throwable.class) {
                            return (Throwable) constructor2.newInstance(th);
                        }
                    }
                    if (constructor != null) {
                        Throwable th2 = (Throwable) constructor.newInstance(null);
                        th2.initCause(th);
                        return th2;
                    }
                } catch (Exception unused) {
                }
            }
            return th;
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static void m24520() {
        while (true) {
            Reference referencePoll = f29484.poll();
            if (referencePoll == null) {
                return;
            }
            if (referencePoll instanceof C22059) {
                int i = ((C22059) referencePoll).f69392 & 31;
                C22059[] c22059Arr = f29482;
                C22059 c22059 = c22059Arr[i];
                C22059 c220510 = null;
                while (c22059 != null) {
                    C22059 c220511 = c22059.f69393;
                    if (c22059 == referencePoll) {
                        if (c220510 == null) {
                            c22059Arr[i] = c220511;
                            break;
                        } else {
                            c220510.f69393 = c220511;
                            break;
                        }
                    }
                    c220510 = c22059;
                    c22059 = c220511;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public static final void m24515() {
        ReentrantLock reentrantLock = f29485;
        if (reentrantLock.tryLock()) {
            try {
                m24520();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return (m24513(-1073741824) & (-268435456)) == -1073741824;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f29488 < 0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return (this.f29488 & (-268435456)) == -1073741824;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        int iM24518 = (Thread.currentThread() instanceof C5965 ? m24518() : m24519()) & (-268435456);
        if (iM24518 == -1073741824) {
            throw new CancellationException();
        }
        if (iM24518 == Integer.MIN_VALUE) {
            throw new ExecutionException(m24516());
        }
        return mo14731();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        int i;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int iM24524 = this.f29488;
        if (iM24524 < 0 || nanos <= 0) {
            i = iM24524;
        } else {
            long jNanoTime = System.nanoTime() + nanos;
            if (jNanoTime == 0) {
                jNanoTime = 1;
            }
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread instanceof C5965) {
                C5965 c5965 = (C5965) threadCurrentThread;
                iM24524 = c5965.f14761.m42682(c5965.f14762, this, jNanoTime);
            } else {
                iM24524 = C18705.f55876.m42686(this) ? m24524() : 0;
                if (iM24524 >= 0) {
                    while (true) {
                        i = this.f29488;
                        if (i < 0) {
                            break;
                        }
                        long jNanoTime2 = jNanoTime - System.nanoTime();
                        if (jNanoTime2 <= 0) {
                            break;
                        }
                        long millis = TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                        if (millis > 0 && f29483.compareAndSwapInt(this, f29486, i, i | 65536)) {
                            synchronized (this) {
                                if (this.f29488 >= 0) {
                                    wait(millis);
                                } else {
                                    notifyAll();
                                }
                            }
                        }
                    }
                }
            }
            i = iM24524;
        }
        if (i >= 0) {
            i = this.f29488;
        }
        int i2 = i & (-268435456);
        if (i2 == -268435456) {
            return mo14731();
        }
        if (i2 == -1073741824) {
            throw new CancellationException();
        }
        if (i2 != Integer.MIN_VALUE) {
            throw new TimeoutException();
        }
        throw new ExecutionException(m24516());
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m24525() {
        m24518();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m24523() {
        int i;
        do {
            i = this.f29488;
            if (((short) i) != 0) {
                return false;
            }
        } while (!f29483.compareAndSwapInt(this, f29486, i, ((-65536) & i) | 1));
        return true;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object objM24516;
        objectOutputStream.defaultWriteObject();
        int i = this.f29488 & (-268435456);
        if (i >= -268435456) {
            objM24516 = null;
        } else if (i == -1073741824) {
            objM24516 = new CancellationException();
        } else {
            objM24516 = m24516();
        }
        objectOutputStream.writeObject(objM24516);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        if (object != null) {
            m24517((Throwable) object);
        }
    }
}
