package p067l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۚۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6OW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC7402 implements Runnable {

    /* JADX INFO: renamed from: ۗ */
    public final C14146 f19372;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C3378 f19373;

    /* JADX INFO: renamed from: ᩶ */
    public final CharSequence f19374;

    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC17043 f19375;

    /* JADX INFO: renamed from: ᩹ */
    public final AtomicInteger f19376 = new AtomicInteger();

    public RunnableC7402(C3378 c3378, C14146 c14146, CharSequence charSequence, AbstractC17043 abstractC17043) {
        this.f19373 = c3378;
        this.f19372 = c14146;
        this.f19374 = charSequence;
        this.f19375 = abstractC17043;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17124() {
        try {
            C4081.f8987.execute(this);
        } catch (Error | RuntimeException e) {
            AtomicReference atomicReference = this.f19373.f6682;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
            m17125();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17125() {
        this.f19372.m32526();
        if (this.f19376.compareAndSet(0, 2)) {
            this.f19373.f6681.countDown();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.֨ۤᩳ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public final void run() {
        final C3378 c3378 = this.f19373;
        AtomicInteger atomicInteger = this.f19376;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                try {
                    this.f19372.m32370(this.f19375, new InterfaceC18588() { // from class: l.֡ۤᩳ
                        @Override // p067l.InterfaceC18588
                        /* JADX INFO: renamed from: ᩻ */
                        public final boolean mo3924() {
                            return c3378.m5900();
                        }
                    }, this.f19374);
                } finally {
                    atomicInteger.set(2);
                    c3378.f6681.countDown();
                }
            } catch (IOException | Error | RuntimeException e) {
                AtomicReference atomicReference = c3378.f6682;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
        }
    }
}
