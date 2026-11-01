package p067l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۨ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: BB0B */
/* JADX INFO: loaded from: classes3.dex */
public final class C13746 extends ArrayList {

    /* JADX INFO: renamed from: ᩸ */
    public final ReentrantLock f38848 = new ReentrantLock();

    /* JADX INFO: renamed from: ᩹ */
    public final AtomicInteger f38849 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩳ */
    public final void m31299() {
        this.f38848.lock();
        this.f38849.incrementAndGet();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m31298() {
        this.f38849.decrementAndGet();
        this.f38848.unlock();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m31297() {
        return this.f38849.get() > 0;
    }
}
