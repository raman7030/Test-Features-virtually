package p067l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: l.ܺۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: K29L */
/* JADX INFO: loaded from: classes4.dex */
public final class C17500 {

    /* JADX INFO: renamed from: ᩳ */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f52323 = AtomicReferenceFieldUpdater.newUpdater(C17500.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: ܿ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f52322 = AtomicIntegerFieldUpdater.newUpdater(C17500.class, "producerIndex");

    /* JADX INFO: renamed from: ܽ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f52321 = AtomicIntegerFieldUpdater.newUpdater(C17500.class, "consumerIndex");

    /* JADX INFO: renamed from: ۧ */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f52320 = AtomicIntegerFieldUpdater.newUpdater(C17500.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: ֫ */
    public final AtomicReferenceArray f52324 = new AtomicReferenceArray(128);
    public volatile /* synthetic */ Object lastScheduledTask = null;
    public volatile /* synthetic */ int producerIndex = 0;
    public volatile /* synthetic */ int consumerIndex = 0;
    public volatile /* synthetic */ int blockingTasksInBuffer = 0;

    /* JADX INFO: renamed from: ֫ */
    public final int m39861() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractRunnableC16159 m39866() {
        AbstractRunnableC16159 abstractRunnableC16159 = (AbstractRunnableC16159) f52323.getAndSet(this, null);
        return abstractRunnableC16159 == null ? m39860() : abstractRunnableC16159;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractRunnableC16159 m39863(AbstractRunnableC16159 abstractRunnableC16159) {
        AbstractRunnableC16159 abstractRunnableC161510 = (AbstractRunnableC16159) f52323.getAndSet(this, abstractRunnableC16159);
        if (abstractRunnableC161510 == null) {
            return null;
        }
        if (abstractRunnableC161510.f47600.mo20320() == 1) {
            f52320.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return abstractRunnableC161510;
        }
        int i = this.producerIndex & 127;
        while (this.f52324.get(i) != null) {
            Thread.yield();
        }
        this.f52324.lazySet(i, abstractRunnableC161510);
        f52322.incrementAndGet(this);
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m39865(C17500 c17500) {
        AbstractRunnableC16159 abstractRunnableC16159M39860 = c17500.m39860();
        if (abstractRunnableC16159M39860 != null) {
            m39863(abstractRunnableC16159M39860);
            return -1L;
        }
        return m39859(c17500, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m39862(C17500 c17500) {
        int i = c17500.producerIndex;
        AtomicReferenceArray atomicReferenceArray = c17500.f52324;
        for (int i2 = c17500.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (c17500.blockingTasksInBuffer == 0) {
                break;
            }
            AbstractRunnableC16159 abstractRunnableC16159 = (AbstractRunnableC16159) atomicReferenceArray.get(i3);
            if (abstractRunnableC16159 != null && abstractRunnableC16159.f47600.mo20320() == 1) {
                do {
                    if (atomicReferenceArray.compareAndSet(i3, abstractRunnableC16159, null)) {
                        f52320.decrementAndGet(c17500);
                        m39863(abstractRunnableC16159);
                        return -1L;
                    }
                } while (atomicReferenceArray.get(i3) == abstractRunnableC16159);
            }
        }
        return m39859(c17500, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39864(C18171 c18171) {
        AbstractRunnableC16159 abstractRunnableC16159 = (AbstractRunnableC16159) f52323.getAndSet(this, null);
        if (abstractRunnableC16159 != null) {
            c18171.m26257(abstractRunnableC16159);
        }
        while (true) {
            AbstractRunnableC16159 abstractRunnableC16159M39860 = m39860();
            if (abstractRunnableC16159M39860 == null) {
                return;
            } else {
                c18171.m26257(abstractRunnableC16159M39860);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private final long m39859(C17500 c17500, boolean z) {
        while (true) {
            AbstractRunnableC16159 abstractRunnableC16159 = (AbstractRunnableC16159) c17500.lastScheduledTask;
            if (abstractRunnableC16159 == null) {
                return -2L;
            }
            if (z && abstractRunnableC16159.f47600.mo20320() != 1) {
                return -2L;
            }
            C11467.f31982.getClass();
            long jNanoTime = System.nanoTime() - abstractRunnableC16159.f47599;
            long j = C11467.f31978;
            if (jNanoTime < j) {
                return j - jNanoTime;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f52323;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c17500, abstractRunnableC16159, null)) {
                    m39863(abstractRunnableC16159);
                    return -1L;
                }
            } while (atomicReferenceFieldUpdater.get(c17500) == abstractRunnableC16159);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private final AbstractRunnableC16159 m39860() {
        AbstractRunnableC16159 abstractRunnableC16159;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f52321.compareAndSet(this, i, i + 1) && (abstractRunnableC16159 = (AbstractRunnableC16159) this.f52324.getAndSet(i2, null)) != null) {
                if (abstractRunnableC16159.f47600.mo20320() == 1) {
                    f52320.decrementAndGet(this);
                }
                return abstractRunnableC16159;
            }
        }
    }
}
