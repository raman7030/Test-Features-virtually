package p067l;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.ۧ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9I9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12677 extends AbstractFutureC9498 {

    /* JADX INFO: renamed from: ۙ */
    public final C16028 f35571;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC3959 f35573;

    /* JADX INFO: renamed from: ᩹ */
    public final AtomicBoolean f35574 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩶ */
    public final ReentrantReadWriteLock f35572 = new ReentrantReadWriteLock();

    public C12677(C16028 c16028, InterfaceC3959 interfaceC3959) {
        this.f35571 = c16028;
        this.f35573 = interfaceC3959;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        AtomicBoolean atomicBoolean = this.f35574;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f35572;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!isDone() && !atomicBoolean.getAndSet(true)) {
                this.f35573.cancel();
                reentrantReadWriteLock.writeLock().unlock();
                return true;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return false;
        } catch (Throwable th) {
            try {
                atomicBoolean.set(false);
                throw ((C12776) C12776.f35977.mo8123(th));
            } catch (Throwable th2) {
                reentrantReadWriteLock.writeLock().unlock();
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f35572;
        reentrantReadWriteLock.readLock().lock();
        try {
            return this.f35574.get();
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f35572;
        reentrantReadWriteLock.readLock().lock();
        try {
            return this.f35574.get() || this.f35571.isDone();
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f35571.get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f35571.get(j, timeUnit);
    }
}
