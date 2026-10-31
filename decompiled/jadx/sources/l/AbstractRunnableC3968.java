package l;

/* JADX INFO: renamed from: l.ۘ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AYL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractRunnableC3968 implements Runnable, Comparable, InterfaceC8907, InterfaceC10113 {
    public volatile Object _heap;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f12593;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f12594;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized int m12005(long j, C18785 c18785, RunnableC16667 runnableC16667) {
        if (this._heap == C5379.f16733) {
            return 2;
        }
        synchronized (c18785) {
            AbstractRunnableC3968 abstractRunnableC3968 = (AbstractRunnableC3968) c18785.m29725();
            if (AbstractC19491.m44897((AbstractC19491) runnableC16667)) {
                return 1;
            }
            if (abstractRunnableC3968 == null) {
                c18785.f59299 = j;
            } else {
                long j2 = abstractRunnableC3968.f12594;
                if (j2 - j < 0) {
                    j = j2;
                }
                if (j - c18785.f59299 > 0) {
                    c18785.f59299 = j;
                }
            }
            long j3 = this.f12594;
            long j4 = c18785.f59299;
            if (j3 - j4 < 0) {
                this.f12594 = j4;
            }
            c18785.m29727(this);
            return 0;
        }
    }

    @Override // l.InterfaceC8907
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized void mo12010() {
        Object obj = this._heap;
        if (obj == C5379.f16733) {
            return;
        }
        C18785 c18785 = obj instanceof C18785 ? (C18785) obj : null;
        if (c18785 != null) {
            c18785.m29728(this);
        }
        this._heap = C5379.f16733;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f12594 - ((AbstractRunnableC3968) obj).f12594;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12229 m12006() {
        Object obj = this._heap;
        if (obj instanceof C12229) {
            return (C12229) obj;
        }
        return null;
    }

    @Override // l.InterfaceC10113
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12008(C12229 c12229) {
        if (this._heap == C5379.f16733) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = c12229;
    }

    @Override // l.InterfaceC10113
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12007(int i) {
        this.f12593 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m12009() {
        return this.f12593;
    }

    public final String toString() {
        return "Delayed[nanos=" + this.f12594 + ']';
    }
}
