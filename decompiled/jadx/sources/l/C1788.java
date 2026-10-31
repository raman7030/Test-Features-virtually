package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֫ۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6R5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1788 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public FutureC3575 f6173;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f6174 = new Object();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f6175;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f6176;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7164 f6177;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f6178;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public RunnableC1644 f6179;

    public C1788(InterfaceC7164 interfaceC7164) {
        this.f6177 = interfaceC7164;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5951(boolean z) {
        synchronized (this.f6174) {
            try {
                if (z) {
                    if (this.f6175) {
                        throw new IllegalStateException("Text owner is closed");
                    }
                    this.f6178++;
                } else {
                    int i = this.f6178;
                    if (i == 0) {
                        throw new IllegalStateException("Unbalanced internal read-only state");
                    }
                    this.f6178 = i - 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m5946();
        m5947();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m5953() {
        return Thread.holdsLock(this.f6174) && this.f6176 != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5952() {
        boolean z;
        synchronized (this.f6174) {
            z = !this.f6175 && this.f6178 == 0 && this.f6176 == 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m5955() {
        synchronized (this.f6174) {
            if (this.f6175) {
                return FutureC3575.m10895(new IllegalStateException("Text owner is closed"));
            }
            if (m5952()) {
                return FutureC3575.m10905(null);
            }
            if (this.f6173 == null) {
                this.f6173 = new FutureC3575();
            }
            return this.f6173.m10921((InterfaceC21423) new C5368());
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m5946() {
        synchronized (this.f6174) {
            if (this.f6173 != null && (this.f6175 || m5952())) {
                FutureC3575 futureC3575 = this.f6173;
                this.f6173 = null;
                boolean z = this.f6175;
                if (z) {
                    futureC3575.m10914((Throwable) new IllegalStateException("Text owner is closed"));
                } else {
                    futureC3575.m10912((Object) null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m5948(Object obj, Supplier supplier) {
        try {
            synchronized (this.f6174) {
                if (!this.f6175) {
                    this.f6176++;
                    try {
                        obj = supplier.get();
                        this.f6176--;
                    } catch (Throwable th) {
                        this.f6176--;
                        throw th;
                    }
                }
            }
            m5946();
            m5947();
            return obj;
        } catch (Throwable th2) {
            m5946();
            m5947();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m5949(C19865 c19865) {
        Object objM5948;
        synchronized (this.f6174) {
            objM5948 = null;
            if (this.f6178 == 0) {
                objM5948 = m5948(null, c19865);
            }
        }
        return objM5948;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5950(RunnableC1644 runnableC1644) {
        synchronized (this.f6174) {
            if (this.f6175) {
                return;
            }
            this.f6175 = true;
            this.f6179 = runnableC1644;
            m5946();
            m5947();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m5947() {
        synchronized (this.f6174) {
            if (this.f6178 == 0 && this.f6176 == 0) {
                RunnableC1644 runnableC1644 = this.f6179;
                this.f6179 = null;
                if (runnableC1644 != null) {
                    runnableC1644.run();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m5954() {
        synchronized (this.f6174) {
            this.f6175 = true;
        }
        m5946();
    }
}
