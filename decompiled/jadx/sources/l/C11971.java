package l;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ۨ᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: BB0B */
/* JADX INFO: loaded from: classes3.dex */
public final class C11971 extends ArrayList {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f35838 = new ReentrantLock();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f35839 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m29245() {
        this.f35838.lock();
        this.f35839.incrementAndGet();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m29244() {
        this.f35839.decrementAndGet();
        this.f35838.unlock();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m29243() {
        return this.f35839.get() > 0;
    }
}
