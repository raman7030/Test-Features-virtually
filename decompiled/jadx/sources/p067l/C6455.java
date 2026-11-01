package p067l;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۙ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: E177 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6455 {

    /* JADX INFO: renamed from: ܳ */
    public final LinkedList f16683 = new LinkedList();

    /* JADX INFO: renamed from: ܽ */
    public final AtomicBoolean f16684 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ۧ */
    public final AtomicBoolean f16682 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩻ */
    public long f16687 = 0;

    /* JADX INFO: renamed from: ᩳ */
    public long f16686 = 0;

    /* JADX INFO: renamed from: ܿ */
    public final Object f16685 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public final boolean f16681 = false;

    public C6455() {
    }

    public C6455(int i) {
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14742() {
        synchronized (this.f16685) {
            if (this.f16684.get()) {
                return;
            }
            this.f16682.set(true);
            this.f16684.set(true);
            this.f16686 = System.currentTimeMillis();
            this.f16687 = 0L;
            this.f16683.clear();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m14743() {
        synchronized (this.f16685) {
            this.f16684.set(false);
            this.f16683.clear();
            this.f16687 = 0L;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14741(long j) {
        if (j <= 0 || !this.f16684.get()) {
            return;
        }
        synchronized (this.f16685) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!this.f16683.isEmpty()) {
                C21208 c21208 = (C21208) this.f16683.getLast();
                if (jCurrentTimeMillis - c21208.f66692 < 50) {
                    c21208.f66691 += j;
                    m14739(jCurrentTimeMillis);
                    return;
                }
            }
            this.f16683.addLast(new C21208(jCurrentTimeMillis, j));
            m14739(jCurrentTimeMillis);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m14740() {
        long jMin;
        if (!this.f16684.get()) {
            return 0L;
        }
        synchronized (this.f16685) {
            m14739(System.currentTimeMillis());
            jMin = this.f16687;
            if (this.f16681) {
                jMin += Math.min(jMin / 12, 5242880L);
            }
        }
        return jMin;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m14739(long j) {
        if (j - this.f16686 < 500) {
            return;
        }
        this.f16686 = j;
        LinkedList linkedList = this.f16683;
        if (linkedList.isEmpty()) {
            this.f16687 = 0L;
            return;
        }
        long j2 = j - 2000;
        while (!linkedList.isEmpty() && ((C21208) linkedList.getFirst()).f66692 < j2) {
            linkedList.removeFirst();
        }
        long j3 = ((C21208) linkedList.getFirst()).f66692;
        Iterator it = linkedList.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 += ((C21208) it.next()).f66691;
        }
        long j5 = j - j3;
        AtomicBoolean atomicBoolean = this.f16682;
        if (atomicBoolean.get()) {
            if (j5 < 200) {
                this.f16687 = 0L;
                this.f16686 = j - 400;
                return;
            }
            atomicBoolean.set(false);
        }
        if (j5 == 0) {
            this.f16687 = 0L;
            return;
        }
        long j6 = (j4 * 1000) / j5;
        long j7 = this.f16687;
        if (j7 == 0 || j6 > j7) {
            this.f16687 = j6;
        } else {
            this.f16687 = Math.round((j7 * 0.19999999999999996d) + (j6 * 0.8d));
        }
        if (this.f16687 < 0) {
            this.f16687 = 0L;
        }
    }
}
