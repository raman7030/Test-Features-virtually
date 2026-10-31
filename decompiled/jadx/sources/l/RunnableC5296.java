package l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۚۤᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6OW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5296 implements Runnable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C12392 f16535;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1062 f16536;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CharSequence f16537;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f16538;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f16539 = new AtomicInteger();

    public RunnableC5296(C1062 c1062, C12392 c12392, CharSequence charSequence, AbstractC15440 abstractC15440) {
        this.f16536 = c1062;
        this.f16535 = c12392;
        this.f16537 = charSequence;
        this.f16538 = abstractC15440;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15221() {
        try {
            C1802.f6208.execute(this);
        } catch (Error | RuntimeException e) {
            AtomicReference atomicReference = this.f16536.f3911;
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
            m15222();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15222() {
        this.f16535.m30462();
        if (this.f16539.compareAndSet(0, 2)) {
            this.f16536.f3910.countDown();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.֨ۤᩳ] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.concurrent.CountDownLatch] */
    @Override // java.lang.Runnable
    public final void run() {
        final C1062 c1062 = this.f16536;
        AtomicInteger atomicInteger = this.f16539;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                try {
                    this.f16535.m30306(this.f16538, new InterfaceC17066() { // from class: l.֡ۤᩳ
                        @Override // l.InterfaceC17066
                        /* JADX INFO: renamed from: ᩻ */
                        public final boolean mo1526() {
                            return c1062.m3629();
                        }
                    }, this.f16537);
                } finally {
                    atomicInteger.set(2);
                    c1062.f3910.countDown();
                }
            } catch (IOException | Error | RuntimeException e) {
                AtomicReference atomicReference = c1062.f3911;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
        }
    }
}
