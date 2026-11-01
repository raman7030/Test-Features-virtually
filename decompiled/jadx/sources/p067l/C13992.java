package p067l;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۫ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1K9 */
/* JADX INFO: loaded from: classes4.dex */
public class C13992 extends AbstractC7545 {

    /* JADX INFO: renamed from: ۗ */
    public volatile boolean f39490 = false;

    /* JADX INFO: renamed from: ۙ */
    public AtomicInteger f39491 = new AtomicInteger();

    /* JADX INFO: renamed from: ۬ */
    public AtomicInteger f39493 = new AtomicInteger();

    /* JADX INFO: renamed from: ۫ */
    public ConcurrentLinkedQueue f39492 = new ConcurrentLinkedQueue();

    public C13992() {
        new Thread(new RunnableC23763(4, this)).start();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m31794(C13992 c13992) {
        while (!c13992.f39490) {
            SystemClock.sleep(100L);
            while (!c13992.f39492.isEmpty()) {
                Runnable runnable = (Runnable) c13992.f39492.poll();
                if (runnable != null) {
                    runnable.run();
                    c13992.f39493.incrementAndGet();
                }
            }
        }
        while (!c13992.f39492.isEmpty()) {
            Runnable runnable2 = (Runnable) c13992.f39492.poll();
            if (runnable2 != null) {
                runnable2.run();
                c13992.f39493.incrementAndGet();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31795(Runnable runnable) {
        this.f39491.incrementAndGet();
        this.f39492.add(runnable);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m31796() {
        while (m31797()) {
            SystemClock.sleep(10L);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m31797() {
        if (this.f39490) {
            return false;
        }
        return (this.f39492.isEmpty() && this.f39491.get() == this.f39493.get()) ? false : true;
    }

    @Override // p067l.AbstractC7545
    /* JADX INFO: renamed from: ܽ */
    public final void mo17458() {
        this.f39490 = true;
    }
}
