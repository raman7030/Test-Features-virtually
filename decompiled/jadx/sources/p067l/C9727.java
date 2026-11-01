package p067l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.۟᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F77E */
/* JADX INFO: loaded from: classes3.dex */
public final class C9727 {

    /* JADX INFO: renamed from: ֫ */
    public final AtomicReference f26863;

    /* JADX INFO: renamed from: ۧ */
    public final ExecutorService f26864;

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC24479 f26865;

    /* JADX INFO: renamed from: ᩳ */
    public final AtomicInteger f26866;

    public C9727(ExecutorService executorService, AtomicInteger atomicInteger, AtomicReference atomicReference, C12410 c12410) {
        this.f26864 = executorService;
        this.f26866 = atomicInteger;
        this.f26863 = atomicReference;
        this.f26865 = c12410;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m22732(final InterfaceC15761 interfaceC15761) throws InterruptedException {
        while (true) {
            AtomicInteger atomicInteger = this.f26866;
            if (atomicInteger.get() > 500) {
                ((C12410) this.f26865).getClass();
                Thread.sleep(50L);
            } else {
                atomicInteger.incrementAndGet();
                try {
                    this.f26864.submit(new Runnable() { // from class: l.ۨ᩸ܽ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C9727.m22731(this.f38853, interfaceC15761);
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

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m22731(C9727 c9727, InterfaceC15761 interfaceC15761) {
        c9727.f26866.decrementAndGet();
        try {
            interfaceC15761.run();
        } catch (Exception e) {
            AtomicReference atomicReference = c9727.f26863;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        }
    }
}
