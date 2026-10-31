package l;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.ۙ֡ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: E177 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4300 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final LinkedList f13868 = new LinkedList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f13869 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f13867 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f13872 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f13871 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f13870 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f13866 = false;

    public C4300() {
    }

    public C4300(int i) {
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12878() {
        synchronized (this.f13870) {
            if (this.f13869.get()) {
                return;
            }
            this.f13867.set(true);
            this.f13869.set(true);
            this.f13871 = System.currentTimeMillis();
            this.f13872 = 0L;
            this.f13868.clear();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m12879() {
        synchronized (this.f13870) {
            this.f13869.set(false);
            this.f13868.clear();
            this.f13872 = 0L;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12877(long j) {
        if (j <= 0 || !this.f13869.get()) {
            return;
        }
        synchronized (this.f13870) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!this.f13868.isEmpty()) {
                C19823 c19823 = (C19823) this.f13868.getLast();
                if (jCurrentTimeMillis - c19823.f64055 < 50) {
                    c19823.f64054 += j;
                    m12875(jCurrentTimeMillis);
                    return;
                }
            }
            this.f13868.addLast(new C19823(jCurrentTimeMillis, j));
            m12875(jCurrentTimeMillis);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m12876() {
        long jMin;
        if (!this.f13869.get()) {
            return 0L;
        }
        synchronized (this.f13870) {
            m12875(System.currentTimeMillis());
            jMin = this.f13872;
            if (this.f13866) {
                jMin += Math.min(jMin / 12, 5242880L);
            }
        }
        return jMin;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m12875(long j) {
        if (j - this.f13871 < 500) {
            return;
        }
        this.f13871 = j;
        LinkedList linkedList = this.f13868;
        if (linkedList.isEmpty()) {
            this.f13872 = 0L;
            return;
        }
        long j2 = j - 2000;
        while (!linkedList.isEmpty() && ((C19823) linkedList.getFirst()).f64055 < j2) {
            linkedList.removeFirst();
        }
        long j3 = ((C19823) linkedList.getFirst()).f64055;
        Iterator it = linkedList.iterator();
        long j4 = 0;
        while (it.hasNext()) {
            j4 += ((C19823) it.next()).f64054;
        }
        long j5 = j - j3;
        AtomicBoolean atomicBoolean = this.f13867;
        if (atomicBoolean.get()) {
            if (j5 < 200) {
                this.f13872 = 0L;
                this.f13871 = j - 400;
                return;
            }
            atomicBoolean.set(false);
        }
        if (j5 == 0) {
            this.f13872 = 0L;
            return;
        }
        long j6 = (j4 * 1000) / j5;
        long j7 = this.f13872;
        if (j7 == 0 || j6 > j7) {
            this.f13872 = j6;
        } else {
            this.f13872 = Math.round((j7 * 0.19999999999999996d) + (j6 * 0.8d));
        }
        if (this.f13872 < 0) {
            this.f13872 = 0L;
        }
    }
}
