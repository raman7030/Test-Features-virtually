package p067l;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.ܽ۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C78L */
/* JADX INFO: loaded from: classes4.dex */
public final class C18199 {

    /* JADX INFO: renamed from: ֫ */
    public final C17984 f54334;

    /* JADX INFO: renamed from: ۧ */
    public final Executor f54335;

    /* JADX INFO: renamed from: ܳ */
    public boolean f54336;

    /* JADX INFO: renamed from: ܽ */
    public boolean f54337;

    /* JADX INFO: renamed from: ܿ */
    public boolean f54338;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f54339;

    public C18199(C17984 c17984) {
        ExecutorService executorService = C4081.f8987;
        this.f54334 = c17984;
        this.f54335 = executorService;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m41407() {
        synchronized (this) {
            this.f54336 = true;
            m41404();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41405() {
        synchronized (this) {
            this.f54339 = true;
            m41404();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41406() {
        synchronized (this) {
            this.f54338 = true;
            m41404();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m41404() {
        if (!this.f54337 && this.f54336 && this.f54339 && this.f54338) {
            this.f54337 = true;
            final C17984 c17984 = this.f54334;
            C12826.requireNonNull(c17984);
            this.f54335.execute(new Runnable() { // from class: l.ۧ۬ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    c17984.m40965();
                }
            });
        }
    }
}
