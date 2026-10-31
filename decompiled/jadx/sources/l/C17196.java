package l;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܿ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79GJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17196 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Condition f52731;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f52732;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C16614 f52733;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2148 f52734;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Throwable f52735;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f52736;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC16490 f52737;

    public C17196(String str) {
        InterfaceC16490 interfaceC16490 = C10951.f32985;
        this.f52734 = C11321.m27961(C17196.class);
        this.f52736 = str;
        this.f52737 = interfaceC16490;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f52732 = reentrantLock;
        this.f52731 = reentrantLock.newCondition();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40458(C16614 c16614) {
        ReentrantLock reentrantLock = this.f52732;
        reentrantLock.lock();
        try {
            this.f52734.mo7082("Setting << {} >> to `{}`", this.f52736, c16614);
            this.f52733 = c16614;
            this.f52731.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40457(C2380 c2380) {
        ReentrantLock reentrantLock = this.f52732;
        reentrantLock.lock();
        try {
            this.f52735 = this.f52737.mo5928(c2380);
            this.f52731.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m40456(long j, TimeUnit timeUnit) throws Throwable {
        Object objM40460 = m40460(j, timeUnit);
        if (objM40460 != null) {
            return objM40460;
        }
        throw this.f52737.mo5928(new TimeoutException("Timeout expired"));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m40460(long j, TimeUnit timeUnit) {
        String str = this.f52736;
        InterfaceC2148 interfaceC2148 = this.f52734;
        ReentrantLock reentrantLock = this.f52732;
        reentrantLock.lock();
        try {
            try {
                Throwable th = this.f52735;
                if (th != null) {
                    throw th;
                }
                C16614 c16614 = this.f52733;
                if (c16614 != null) {
                    reentrantLock.unlock();
                    return c16614;
                }
                interfaceC2148.mo7100(str, "Awaiting << {} >>");
                Condition condition = this.f52731;
                if (j == 0) {
                    while (this.f52733 == null && this.f52735 == null) {
                        condition.await();
                    }
                } else if (!condition.await(j, timeUnit)) {
                    reentrantLock.unlock();
                    return null;
                }
                Throwable th2 = this.f52735;
                if (th2 != null) {
                    interfaceC2148.mo7102("<< {} >> woke to: {}", str, th2);
                    throw this.f52735;
                }
                C16614 c16615 = this.f52733;
                reentrantLock.unlock();
                return c16615;
            } catch (InterruptedException e) {
                throw this.f52737.mo5928(e);
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40459() {
        ReentrantLock reentrantLock = this.f52732;
        reentrantLock.lock();
        try {
            return this.f52735 == null && this.f52733 != null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String toString() {
        return this.f52736;
    }
}
