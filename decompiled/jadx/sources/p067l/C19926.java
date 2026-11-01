package p067l;

/* JADX INFO: renamed from: l.ᩴۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N70B */
/* JADX INFO: loaded from: classes4.dex */
public final class C19926 {

    /* JADX INFO: renamed from: ֫ */
    public C5844 f60492;

    /* JADX INFO: renamed from: ۧ */
    public long f60493;

    /* JADX INFO: renamed from: ܽ */
    public C17242 f60494;

    /* JADX INFO: renamed from: ᩳ */
    public long f60495;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public synchronized void m45231(C5844 c5844) {
        c5844.f14333 = true;
        if (this.f60492 == c5844) {
            this.f60492 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private synchronized void m45232(C5844 c5844) {
        long j = c5844.f14338;
        if (this.f60495 != j) {
            c5844.f14333 = true;
            return;
        }
        C5844 c5845 = this.f60492;
        if (c5845 != null) {
            c5845.f14333 = true;
            this.f60492 = null;
        }
        C17242 c17242 = this.f60494;
        c5844.f14335 = c17242 == null ? C11209.m25887() : c17242.f51310;
        C17242 c17243 = this.f60494;
        if (c17243 != null) {
            long unused = c17243.f51313;
        }
        c5844.getClass();
        this.f60493 = j;
        this.f60492 = c5844;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C10538 m45235(C17242 c17242, C16611 c16611) {
        long j;
        if (c17242 != this.f60494) {
            throw new IllegalArgumentException("Base result is not the current published result");
        }
        if (c16611.m37663() != c17242.f51311.m31692()) {
            throw new IllegalArgumentException("Base result and change set lengths differ");
        }
        j = this.f60495 + 1;
        this.f60495 = j;
        return new C10538(this, j, c17242.f51312, c17242, c16611);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C10538 m45236(C24320 c24320) {
        long j;
        j = 1 + this.f60495;
        this.f60495 = j;
        C12826.requireNonNull(c24320, "program");
        return new C10538(this, j, c24320, null, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m45237() {
        long j = this.f60495 + 1;
        this.f60495 = j;
        this.f60493 = j;
        C5844 c5844 = this.f60492;
        if (c5844 != null) {
            c5844.f14333 = true;
            this.f60492 = null;
        }
        this.f60494 = null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized C17242 m45239() {
        return this.f60494;
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m45240() {
        long j = this.f60495 + 1;
        this.f60495 = j;
        this.f60493 = j;
        C5844 c5844 = this.f60492;
        if (c5844 != null) {
            c5844.f14333 = true;
            this.f60492 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5844 m45234(C10538 c10538, C9729 c9729, long j, InterfaceC18588 interfaceC18588) {
        C10538.m24279(c10538, this, false);
        C5844 c5844 = new C5844(this, c10538.f29168, c9729, j, c10538.f29171, interfaceC18588, null, null);
        m45232(c5844);
        return c5844;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5844 m45233(C10538 c10538, C9729 c9729, long j, C2667 c2667) {
        C10538.m24279(c10538, this, true);
        C17242 c17242 = c10538.f29166;
        C5844 c5844 = new C5844(this, c17242.f51312, c9729, j, c10538.f29171, c2667, c17242, c10538.f29167);
        m45232(c5844);
        return c5844;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m45238(C5844 c5844) {
        C17242 c17242;
        C12826.requireNonNull(c5844, "work");
        if (c5844.f14337 != this || (c17242 = c5844.f14334) == null) {
            return false;
        }
        if (Thread.currentThread().isInterrupted() || c5844.m13129()) {
            m45231(c5844);
            return false;
        }
        synchronized (this) {
            if (this.f60492 == c5844 && this.f60493 == c5844.f14338 && !c5844.f14333) {
                this.f60494 = c17242;
                this.f60492 = null;
                return true;
            }
            return false;
        }
    }
}
