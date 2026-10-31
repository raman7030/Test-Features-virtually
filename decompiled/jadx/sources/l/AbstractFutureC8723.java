package l;

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
public abstract class AbstractFutureC8723 implements Future, Serializable {
    public static final long serialVersionUID = -7721805057305804111L;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f26558;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final long f26561;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f26562 = 0;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile int f26563;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C20718[] f26557 = new C20718[32];

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final ReentrantLock f26560 = new ReentrantLock();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final ReferenceQueue f26559 = new ReferenceQueue();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo22553(Throwable th) {
    }

    /* JADX INFO: renamed from: ܽ */
    public abstract boolean mo12866();

    /* JADX INFO: renamed from: ᩳ */
    public abstract Object mo12867();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m22544(int i) {
        int i2;
        do {
            i2 = this.f26563;
            if (i2 < 0) {
                return i2;
            }
        } while (!f26558.compareAndSwapInt(this, f26561, i2, i2 | i));
        if ((i2 >>> 16) == 0) {
            return i;
        }
        synchronized (this) {
            notifyAll();
        }
        return i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m22555() {
        int i = this.f26563;
        if (i < 0) {
            return i;
        }
        try {
            return mo12866() ? m22544(-268435456) : i;
        } catch (Throwable th) {
            return m22548(th);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22552(long j) {
        int i = this.f26563;
        if (i < 0 || !f26558.compareAndSwapInt(this, f26561, i, i | 65536)) {
            return;
        }
        synchronized (this) {
            if (this.f26563 >= 0) {
                try {
                    wait(j);
                } catch (InterruptedException unused) {
                }
            } else {
                notifyAll();
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private int m22545() {
        boolean z = false;
        int iM22555 = C17189.f52695.m40441(this) ? m22555() : 0;
        if (iM22555 < 0 || (iM22555 = this.f26563) < 0) {
            return iM22555;
        }
        int i = iM22555;
        do {
            if (f26558.compareAndSwapInt(this, f26561, i, i | 65536)) {
                synchronized (this) {
                    if (this.f26563 >= 0) {
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
            i = this.f26563;
        } while (i >= 0);
        if (z) {
            Thread.currentThread().interrupt();
        }
        return i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m22550() throws InterruptedException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int iM22555 = this.f26563;
        if (iM22555 >= 0) {
            iM22555 = C17189.f52695.m40441(this) ? m22555() : 0;
            if (iM22555 >= 0) {
                while (true) {
                    int i = this.f26563;
                    if (i < 0) {
                        return i;
                    }
                    if (f26558.compareAndSwapInt(this, f26561, i, i | 65536)) {
                        synchronized (this) {
                            if (this.f26563 >= 0) {
                                wait(0L);
                            } else {
                                notifyAll();
                            }
                        }
                    }
                }
            }
        }
        return iM22555;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m22549() {
        int iM22555;
        int i = this.f26563;
        if (i < 0) {
            return i;
        }
        Thread threadCurrentThread = Thread.currentThread();
        if (!(threadCurrentThread instanceof C3784)) {
            return m22545();
        }
        C3784 c3784 = (C3784) threadCurrentThread;
        C17895 c17895 = c3784.f11956;
        return (!c17895.m41867(this) || (iM22555 = m22555()) >= 0) ? c3784.f11955.m40437(c17895, this, 0L) : iM22555;
    }

    public void run() throws Throwable {
        int iM22555 = m22555();
        if (iM22555 >= 0) {
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread instanceof C3784) {
                C3784 c3784 = (C3784) threadCurrentThread;
                iM22555 = c3784.f11955.m40437(c3784.f11956, this, 0L);
            } else {
                iM22555 = m22545();
            }
        }
        int i = iM22555 & (-268435456);
        if (i != -268435456) {
            if (i == -1073741824) {
                throw new CancellationException();
            }
            if (i != Integer.MIN_VALUE) {
                return;
            }
            Throwable thM22547 = m22547();
            C14157 c14157 = C17189.f52693;
            throw thM22547;
        }
    }

    static {
        Unsafe unsafe = C0961.f3616;
        f26558 = unsafe;
        try {
            f26561 = unsafe.objectFieldOffset(AbstractFutureC8723.class.getDeclaredField("᩸"));
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m22548(Throwable th) {
        int iM22544 = this.f26563;
        if (iM22544 >= 0) {
            int iIdentityHashCode = System.identityHashCode(this);
            ReentrantLock reentrantLock = f26560;
            reentrantLock.lock();
            try {
                m22551();
                C20718[] c20718Arr = f26557;
                int i = iIdentityHashCode & 31;
                C20718 c20718 = c20718Arr[i];
                while (true) {
                    if (c20718 == null) {
                        c20718Arr[i] = new C20718(this, th, c20718Arr[i], f26559);
                        break;
                    }
                    if (c20718.get() == this) {
                        break;
                    }
                    c20718 = c20718.f66712;
                }
                reentrantLock.unlock();
                iM22544 = m22544(Integer.MIN_VALUE);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        if (((-268435456) & iM22544) == Integer.MIN_VALUE) {
            mo22553(th);
        }
        return iM22544;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private Throwable m22547() {
        Throwable th;
        int iIdentityHashCode = System.identityHashCode(this);
        ReentrantLock reentrantLock = f26560;
        reentrantLock.lock();
        try {
            m22551();
            C20718 c20718 = f26557[iIdentityHashCode & 31];
            while (c20718 != null && c20718.get() != this) {
                c20718 = c20718.f66712;
            }
            reentrantLock.unlock();
            if (c20718 == null || (th = c20718.f66710) == null) {
                return null;
            }
            if (c20718.f66713 != Thread.currentThread().getId()) {
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

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static void m22551() {
        while (true) {
            Reference referencePoll = f26559.poll();
            if (referencePoll == null) {
                return;
            }
            if (referencePoll instanceof C20718) {
                int i = ((C20718) referencePoll).f66711 & 31;
                C20718[] c20718Arr = f26557;
                C20718 c20718 = c20718Arr[i];
                C20718 c20719 = null;
                while (c20718 != null) {
                    C20718 c207110 = c20718.f66712;
                    if (c20718 == referencePoll) {
                        if (c20719 == null) {
                            c20718Arr[i] = c207110;
                            break;
                        } else {
                            c20719.f66712 = c207110;
                            break;
                        }
                    }
                    c20719 = c20718;
                    c20718 = c207110;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final void m22546() {
        ReentrantLock reentrantLock = f26560;
        if (reentrantLock.tryLock()) {
            try {
                m22551();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return (m22544(-1073741824) & (-268435456)) == -1073741824;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f26563 < 0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return (this.f26563 & (-268435456)) == -1073741824;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        int iM22549 = (Thread.currentThread() instanceof C3784 ? m22549() : m22550()) & (-268435456);
        if (iM22549 == -1073741824) {
            throw new CancellationException();
        }
        if (iM22549 == Integer.MIN_VALUE) {
            throw new ExecutionException(m22547());
        }
        return mo12867();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        int i;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int iM22555 = this.f26563;
        if (iM22555 < 0 || nanos <= 0) {
            i = iM22555;
        } else {
            long jNanoTime = System.nanoTime() + nanos;
            if (jNanoTime == 0) {
                jNanoTime = 1;
            }
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread instanceof C3784) {
                C3784 c3784 = (C3784) threadCurrentThread;
                iM22555 = c3784.f11955.m40437(c3784.f11956, this, jNanoTime);
            } else {
                iM22555 = C17189.f52695.m40441(this) ? m22555() : 0;
                if (iM22555 >= 0) {
                    while (true) {
                        i = this.f26563;
                        if (i < 0) {
                            break;
                        }
                        long jNanoTime2 = jNanoTime - System.nanoTime();
                        if (jNanoTime2 <= 0) {
                            break;
                        }
                        long millis = TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                        if (millis > 0 && f26558.compareAndSwapInt(this, f26561, i, i | 65536)) {
                            synchronized (this) {
                                if (this.f26563 >= 0) {
                                    wait(millis);
                                } else {
                                    notifyAll();
                                }
                            }
                        }
                    }
                }
            }
            i = iM22555;
        }
        if (i >= 0) {
            i = this.f26563;
        }
        int i2 = i & (-268435456);
        if (i2 == -268435456) {
            return mo12867();
        }
        if (i2 == -1073741824) {
            throw new CancellationException();
        }
        if (i2 != Integer.MIN_VALUE) {
            throw new TimeoutException();
        }
        throw new ExecutionException(m22547());
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m22556() {
        m22549();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22554() {
        int i;
        do {
            i = this.f26563;
            if (((short) i) != 0) {
                return false;
            }
        } while (!f26558.compareAndSwapInt(this, f26561, i, ((-65536) & i) | 1));
        return true;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        Object objM22547;
        objectOutputStream.defaultWriteObject();
        int i = this.f26563 & (-268435456);
        if (i >= -268435456) {
            objM22547 = null;
        } else if (i == -1073741824) {
            objM22547 = new CancellationException();
        } else {
            objM22547 = m22547();
        }
        objectOutputStream.writeObject(objM22547);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        if (object != null) {
            m22548((Throwable) object);
        }
    }
}
