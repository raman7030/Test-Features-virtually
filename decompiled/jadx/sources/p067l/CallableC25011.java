package p067l;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩻ܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6R3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC25011 implements Callable {

    /* JADX INFO: renamed from: ֫ */
    public final AtomicInteger f79844 = new AtomicInteger();

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C8918 f79845;

    public CallableC25011(C8918 c8918) {
        this.f79845 = c8918;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int andIncrement;
        C8918 c8918 = this.f79845;
        AtomicInteger atomicInteger = this.f79844;
        if (!atomicInteger.compareAndSet(0, 1)) {
            return null;
        }
        try {
            try {
                if (!C8918.m20618(c8918) && c8918.f24170.get() < c8918.f24171.size()) {
                    C9729 c9729 = (C9729) c8918.f24169.get();
                    try {
                        C15763 c15763M22750 = c9729.m22750();
                        while (!C8918.m20618(c8918) && (andIncrement = c8918.f24170.getAndIncrement()) < c8918.f24171.size()) {
                            c8918.f24167[andIncrement] = ((InterfaceC16293) c8918.f24171.get(andIncrement)).mo15412(c15763M22750);
                        }
                        c9729.close();
                    } catch (Throwable th) {
                        if (c9729 != null) {
                            try {
                                c9729.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                atomicInteger.set(2);
                c8918.f24166.countDown();
                return null;
            } catch (Throwable th3) {
                atomicInteger.set(2);
                c8918.f24166.countDown();
                throw th3;
            }
        } catch (Error | RuntimeException e) {
            c8918.f24168.set(true);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54922() {
        if (this.f79844.compareAndSet(0, 2)) {
            this.f79845.f24166.countDown();
        }
    }
}
