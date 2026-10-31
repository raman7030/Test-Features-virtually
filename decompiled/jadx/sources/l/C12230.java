package l;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۫ۛ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1K9 */
/* JADX INFO: loaded from: classes4.dex */
public class C12230 extends AbstractC5447 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile boolean f36473 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f36474 = new AtomicInteger();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AtomicInteger f36476 = new AtomicInteger();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public ConcurrentLinkedQueue f36475 = new ConcurrentLinkedQueue();

    public C12230() {
        new Thread(new RunnableC22511(4, this)).start();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29732(C12230 c12230) {
        while (!c12230.f36473) {
            SystemClock.sleep(100L);
            while (!c12230.f36475.isEmpty()) {
                Runnable runnable = (Runnable) c12230.f36475.poll();
                if (runnable != null) {
                    runnable.run();
                    c12230.f36476.incrementAndGet();
                }
            }
        }
        while (!c12230.f36475.isEmpty()) {
            Runnable runnable2 = (Runnable) c12230.f36475.poll();
            if (runnable2 != null) {
                runnable2.run();
                c12230.f36476.incrementAndGet();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29733(Runnable runnable) {
        this.f36474.incrementAndGet();
        this.f36475.add(runnable);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m29734() {
        while (m29735()) {
            SystemClock.sleep(10L);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m29735() {
        if (this.f36473) {
            return false;
        }
        return (this.f36475.isEmpty() && this.f36474.get() == this.f36476.get()) ? false : true;
    }

    @Override // l.AbstractC5447
    /* JADX INFO: renamed from: ܽ */
    public final void mo15547() {
        this.f36473 = true;
    }
}
