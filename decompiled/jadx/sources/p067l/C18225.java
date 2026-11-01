package p067l;

/* JADX INFO: renamed from: l.ܽܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5GW */
/* JADX INFO: loaded from: classes4.dex */
public final class C18225 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public boolean f54397;

    /* JADX INFO: renamed from: ۙ */
    public boolean f54398;

    /* JADX INFO: renamed from: ۤ */
    public boolean f54399;

    /* JADX INFO: renamed from: ۫ */
    public final Runnable f54400;

    /* JADX INFO: renamed from: ۬ */
    public final C8838 f54401;

    /* JADX INFO: renamed from: ᩶ */
    public final Runnable f54402;

    /* JADX INFO: renamed from: ᩸ */
    public Runnable f54403;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f54404;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m41453() {
        return (this.f54398 || this.f54397) ? false : true;
    }

    public C18225(C8838 c8838, Runnable runnable, Runnable runnable2) {
        this.f54401 = c8838;
        this.f54402 = runnable;
        this.f54400 = runnable2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m41455() {
        Runnable runnable;
        synchronized (this) {
            if (this.f54398) {
                runnable = null;
            } else {
                this.f54398 = true;
                runnable = this.f54402;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m41456() {
        synchronized (this) {
            if (this.f54404) {
                return;
            }
            this.f54404 = true;
            Runnable runnable = this.f54403;
            this.f54403 = null;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41452(Runnable runnable) {
        synchronized (this) {
            if (!this.f54404) {
                Runnable runnable2 = this.f54403;
                if (runnable2 != null) {
                    runnable = new RunnableC3993(1, runnable2, runnable);
                }
                this.f54403 = runnable;
                runnable = null;
            }
        }
        if (runnable != null) {
            ((RunnableC20909) runnable).run();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m41454() {
        synchronized (this) {
            if (this.f54399) {
                return;
            }
            this.f54399 = true;
            this.f54400.run();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m41456();
        synchronized (this) {
            if (this.f54397) {
                return;
            }
            this.f54397 = true;
            C8838.m20411(this.f54401, this);
        }
    }
}
