package p067l;

/* JADX INFO: renamed from: l.ۘ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AYL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC6140 implements Runnable, Comparable, InterfaceC10834, InterfaceC11980 {
    public volatile Object _heap;

    /* JADX INFO: renamed from: ᩸ */
    public int f15404;

    /* JADX INFO: renamed from: ᩹ */
    public long f15405;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized int m13929(long j, C20222 c20222, RunnableC18209 runnableC18209) {
        if (this._heap == C7481.f19571) {
            return 2;
        }
        synchronized (c20222) {
            AbstractRunnableC6140 abstractRunnableC6140 = (AbstractRunnableC6140) c20222.m31787();
            if (AbstractC20893.m47194((AbstractC20893) runnableC18209)) {
                return 1;
            }
            if (abstractRunnableC6140 == null) {
                c20222.f62522 = j;
            } else {
                long j2 = abstractRunnableC6140.f15405;
                if (j2 - j < 0) {
                    j = j2;
                }
                if (j - c20222.f62522 > 0) {
                    c20222.f62522 = j;
                }
            }
            long j3 = this.f15405;
            long j4 = c20222.f62522;
            if (j3 - j4 < 0) {
                this.f15405 = j4;
            }
            c20222.m31789(this);
            return 0;
        }
    }

    @Override // p067l.InterfaceC10834
    /* JADX INFO: renamed from: ܿ */
    public final synchronized void mo13934() {
        Object obj = this._heap;
        if (obj == C7481.f19571) {
            return;
        }
        C20222 c20222 = obj instanceof C20222 ? (C20222) obj : null;
        if (c20222 != null) {
            c20222.m31790(this);
        }
        this._heap = C7481.f19571;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f15405 - ((AbstractRunnableC6140) obj).f15405;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13991 m13930() {
        Object obj = this._heap;
        if (obj instanceof C13991) {
            return (C13991) obj;
        }
        return null;
    }

    @Override // p067l.InterfaceC11980
    /* JADX INFO: renamed from: ֫ */
    public final void mo13932(C13991 c13991) {
        if (this._heap == C7481.f19571) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c13991;
    }

    @Override // p067l.InterfaceC11980
    /* JADX INFO: renamed from: ֫ */
    public final void mo13931(int i) {
        this.f15404 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m13933() {
        return this.f15404;
    }

    public final String toString() {
        return "Delayed[nanos=" + this.f15405 + ']';
    }
}
