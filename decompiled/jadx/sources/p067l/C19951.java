package p067l;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.ᩴۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AIE */
/* JADX INFO: loaded from: classes4.dex */
public final class C19951 {

    /* JADX INFO: renamed from: ᩳ */
    public long f60564;

    /* JADX INFO: renamed from: ۧ */
    public final AtomicInteger f60560 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ܿ */
    public final Object f60563 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public final ConcurrentMapC12768 f60559 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ܳ */
    public final AtomicLong f60561 = new AtomicLong();

    /* JADX INFO: renamed from: ܽ */
    public final C21293 f60562 = new C21293();

    /* JADX INFO: renamed from: ܽ */
    public static /* synthetic */ void m45278(C19951 c19951) {
        c19951.f60564++;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static /* synthetic */ void m45280(C19951 c19951) {
        c19951.f60564--;
    }

    /* JADX INFO: renamed from: ֫ */
    public final ConcurrentMapC12768 m45281() {
        return this.f60559;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AtomicInteger m45282() {
        return this.f60560;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C21293 m45283() {
        return this.f60562;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final AtomicLong m45284() {
        return this.f60561;
    }

    public final String toString() {
        return "ObjectDeque [idleObjects=" + this.f60562 + ", createCount=" + this.f60560 + ", allObjects=" + this.f60559 + ", numInterested=" + this.f60561 + "]";
    }
}
