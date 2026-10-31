package l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۟᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F77E */
/* JADX INFO: loaded from: classes3.dex */
public final class C7742 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicReference f23950;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ExecutorService f23951;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23264 f23952;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f23953;

    public C7742(ExecutorService executorService, AtomicInteger atomicInteger, AtomicReference atomicReference, C10565 c10565) {
        this.f23951 = executorService;
        this.f23953 = atomicInteger;
        this.f23950 = atomicReference;
        this.f23952 = c10565;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20752(final InterfaceC14091 interfaceC14091) throws InterruptedException {
        while (true) {
            AtomicInteger atomicInteger = this.f23953;
            if (atomicInteger.get() > 500) {
                ((C10565) this.f23952).getClass();
                Thread.sleep(50L);
            } else {
                atomicInteger.incrementAndGet();
                try {
                    this.f23951.submit(new Runnable() { // from class: l.ۨ᩸ܽ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7742.m20751(this.f35843, interfaceC14091);
                        }
                    });
                    return;
                } catch (Throwable th) {
                    atomicInteger.decrementAndGet();
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20751(C7742 c7742, InterfaceC14091 interfaceC14091) {
        c7742.f23953.decrementAndGet();
        try {
            interfaceC14091.run();
        } catch (Exception e) {
            AtomicReference atomicReference = c7742.f23950;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        }
    }
}
