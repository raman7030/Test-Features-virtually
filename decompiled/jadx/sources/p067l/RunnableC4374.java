package p067l;

/* JADX INFO: renamed from: l.֫᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4374 implements Runnable {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Runnable f9829;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ ExecutorC13092 f9830;

    public RunnableC4374(ExecutorC13092 executorC13092, Runnable runnable) {
        this.f9830 = executorC13092;
        this.f9829 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ExecutorC13092 executorC13092 = this.f9830;
        try {
            this.f9829.run();
        } finally {
            executorC13092.m29957();
        }
    }
}
