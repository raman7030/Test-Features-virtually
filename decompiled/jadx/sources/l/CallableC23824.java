package l;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩻ܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6R3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC23824 implements Callable {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f77093 = new AtomicInteger();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6891 f77094;

    public CallableC23824(C6891 c6891) {
        this.f77094 = c6891;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int andIncrement;
        C6891 c6891 = this.f77094;
        AtomicInteger atomicInteger = this.f77093;
        if (!atomicInteger.compareAndSet(0, 1)) {
            return null;
        }
        try {
            try {
                if (!C6891.m18669(c6891) && c6891.f21293.get() < c6891.f21294.size()) {
                    C7744 c7744 = (C7744) c6891.f21292.get();
                    try {
                        C14093 c14093M20770 = c7744.m20770();
                        while (!C6891.m18669(c6891) && (andIncrement = c6891.f21293.getAndIncrement()) < c6891.f21294.size()) {
                            c6891.f21290[andIncrement] = ((InterfaceC14651) c6891.f21294.get(andIncrement)).mo13523(c14093M20770);
                        }
                        c7744.close();
                    } catch (Throwable th) {
                        if (c7744 != null) {
                            try {
                                c7744.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
                atomicInteger.set(2);
                c6891.f21289.countDown();
                return null;
            } catch (Throwable th3) {
                atomicInteger.set(2);
                c6891.f21289.countDown();
                throw th3;
            }
        } catch (Error | RuntimeException e) {
            c6891.f21291.set(true);
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52513() {
        if (this.f77093.compareAndSet(0, 2)) {
            this.f77094.f21289.countDown();
        }
    }
}
