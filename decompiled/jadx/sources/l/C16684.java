package l;

/* JADX INFO: renamed from: l.ܽܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes4.dex */
public final class C16684 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f51212;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f51213;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f51214;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Runnable f51215;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C6807 f51216;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Runnable f51217;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Runnable f51218;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f51219;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m39218() {
        return (this.f51213 || this.f51212) ? false : true;
    }

    public C16684(C6807 c6807, Runnable runnable, Runnable runnable2) {
        this.f51216 = c6807;
        this.f51217 = runnable;
        this.f51215 = runnable2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m39220() {
        Runnable runnable;
        synchronized (this) {
            if (this.f51213) {
                runnable = null;
            } else {
                this.f51213 = true;
                runnable = this.f51217;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m39221() {
        synchronized (this) {
            if (this.f51219) {
                return;
            }
            this.f51219 = true;
            Runnable runnable = this.f51218;
            this.f51218 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39217(Runnable runnable) {
        synchronized (this) {
            if (!this.f51219) {
                Runnable runnable2 = this.f51218;
                if (runnable2 != null) {
                    runnable = new RunnableC1709(1, runnable2, runnable);
                }
                this.f51218 = runnable;
                runnable = null;
            }
        }
        if (runnable != null) {
            ((RunnableC19508) runnable).run();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m39219() {
        synchronized (this) {
            if (this.f51214) {
                return;
            }
            this.f51214 = true;
            this.f51215.run();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m39221();
        synchronized (this) {
            if (this.f51212) {
                return;
            }
            this.f51212 = true;
            C6807.m18462(this.f51216, this);
        }
    }
}
