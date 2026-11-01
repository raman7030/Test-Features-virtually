package p067l;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܿ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79GJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C18711 {

    /* JADX INFO: renamed from: ֫ */
    public final Condition f55912;

    /* JADX INFO: renamed from: ۧ */
    public final ReentrantLock f55913;

    /* JADX INFO: renamed from: ܳ */
    public C18158 f55914;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC4410 f55915;

    /* JADX INFO: renamed from: ܿ */
    public Throwable f55916;

    /* JADX INFO: renamed from: ᩳ */
    public final String f55917;

    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC18040 f55918;

    public C18711(String str) {
        InterfaceC18040 interfaceC18040 = C12776.f35977;
        this.f55915 = C13128.m30022(C18711.class);
        this.f55917 = str;
        this.f55918 = interfaceC18040;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f55913 = reentrantLock;
        this.f55912 = reentrantLock.newCondition();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42704(C18158 c18158) {
        ReentrantLock reentrantLock = this.f55913;
        reentrantLock.lock();
        try {
            this.f55915.mo9177("Setting << {} >> to `{}`", this.f55917, c18158);
            this.f55914 = c18158;
            this.f55912.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42703(C4630 c4630) {
        ReentrantLock reentrantLock = this.f55913;
        reentrantLock.lock();
        try {
            this.f55916 = this.f55918.mo8123(c4630);
            this.f55912.signalAll();
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m42702(long j, TimeUnit timeUnit) throws Throwable {
        Object objM42706 = m42706(j, timeUnit);
        if (objM42706 != null) {
            return objM42706;
        }
        throw this.f55918.mo8123(new TimeoutException("Timeout expired"));
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m42706(long j, TimeUnit timeUnit) {
        String str = this.f55917;
        InterfaceC4410 interfaceC4410 = this.f55915;
        ReentrantLock reentrantLock = this.f55913;
        reentrantLock.lock();
        try {
            try {
                Throwable th = this.f55916;
                if (th != null) {
                    throw th;
                }
                C18158 c18158 = this.f55914;
                if (c18158 != null) {
                    reentrantLock.unlock();
                    return c18158;
                }
                interfaceC4410.mo9195(str, "Awaiting << {} >>");
                Condition condition = this.f55912;
                if (j == 0) {
                    while (this.f55914 == null && this.f55916 == null) {
                        condition.await();
                    }
                } else if (!condition.await(j, timeUnit)) {
                    reentrantLock.unlock();
                    return null;
                }
                Throwable th2 = this.f55916;
                if (th2 != null) {
                    interfaceC4410.mo9197("<< {} >> woke to: {}", str, th2);
                    throw this.f55916;
                }
                C18158 c18159 = this.f55914;
                reentrantLock.unlock();
                return c18159;
            } catch (InterruptedException e) {
                throw this.f55918.mo8123(e);
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m42705() {
        ReentrantLock reentrantLock = this.f55913;
        reentrantLock.lock();
        try {
            return this.f55916 == null && this.f55914 != null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String toString() {
        return this.f55917;
    }
}
