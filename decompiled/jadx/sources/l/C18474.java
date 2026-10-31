package l;

/* JADX INFO: renamed from: l.ᩴۖܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: N70B */
/* JADX INFO: loaded from: classes4.dex */
public final class C18474 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C3657 f57272;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f57273;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15650 f57274;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f57275;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public synchronized void m42955(C3657 c3657) {
        c3657.f11527 = true;
        if (this.f57272 == c3657) {
            this.f57272 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private synchronized void m42956(C3657 c3657) {
        long j = c3657.f11532;
        if (this.f57275 != j) {
            c3657.f11527 = true;
            return;
        }
        C3657 c3658 = this.f57272;
        if (c3658 != null) {
            c3658.f11527 = true;
            this.f57272 = null;
        }
        C15650 c15650 = this.f57274;
        c3657.f11529 = c15650 == null ? C9302.m23878() : c15650.f48170;
        C15650 c15651 = this.f57274;
        if (c15651 != null) {
            long unused = c15651.f48173;
        }
        c3657.getClass();
        this.f57273 = j;
        this.f57272 = c3657;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C8596 m42959(C15650 c15650, C14986 c14986) {
        long j;
        if (c15650 != this.f57274) {
            throw new IllegalArgumentException("Base result is not the current published result");
        }
        if (c14986.m35507() != c15650.f48171.m29630()) {
            throw new IllegalArgumentException("Base result and change set lengths differ");
        }
        j = this.f57275 + 1;
        this.f57275 = j;
        return new C8596(this, j, c15650.f48172, c15650, c14986);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C8596 m42960(C23097 c23097) {
        long j;
        j = 1 + this.f57275;
        this.f57275 = j;
        C11003.requireNonNull(c23097, "program");
        return new C8596(this, j, c23097, null, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m42961() {
        long j = this.f57275 + 1;
        this.f57275 = j;
        this.f57273 = j;
        C3657 c3657 = this.f57272;
        if (c3657 != null) {
            c3657.f11527 = true;
            this.f57272 = null;
        }
        this.f57274 = null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C15650 m42963() {
        return this.f57274;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m42964() {
        long j = this.f57275 + 1;
        this.f57275 = j;
        this.f57273 = j;
        C3657 c3657 = this.f57272;
        if (c3657 != null) {
            c3657.f11527 = true;
            this.f57272 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3657 m42958(C8596 c8596, C7744 c7744, long j, InterfaceC17066 interfaceC17066) {
        C8596.m22310(c8596, this, false);
        C3657 c3657 = new C3657(this, c8596.f26251, c7744, j, c8596.f26254, interfaceC17066, null, null);
        m42956(c3657);
        return c3657;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3657 m42957(C8596 c8596, C7744 c7744, long j, C0314 c0314) {
        C8596.m22310(c8596, this, true);
        C15650 c15650 = c8596.f26249;
        C3657 c3657 = new C3657(this, c15650.f48172, c7744, j, c8596.f26254, c0314, c15650, c8596.f26250);
        m42956(c3657);
        return c3657;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m42962(C3657 c3657) {
        C15650 c15650;
        C11003.requireNonNull(c3657, "work");
        if (c3657.f11531 != this || (c15650 = c3657.f11528) == null) {
            return false;
        }
        if (Thread.currentThread().isInterrupted() || c3657.m11153()) {
            m42955(c3657);
            return false;
        }
        synchronized (this) {
            if (this.f57272 == c3657 && this.f57273 == c3657.f11532 && !c3657.f11527) {
                this.f57274 = c15650;
                this.f57272 = null;
                return true;
            }
            return false;
        }
    }
}
