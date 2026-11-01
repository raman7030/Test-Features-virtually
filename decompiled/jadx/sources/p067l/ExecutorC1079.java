package p067l;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۙܿ */
/* JADX INFO: compiled from: Y4G0 */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC1079 implements Executor {

    /* JADX INFO: renamed from: ᩸ */
    public Runnable f17999;

    /* JADX INFO: renamed from: ᩹ */
    public final Executor f18000;

    /* JADX INFO: renamed from: ᩶ */
    public final Object f17998 = new Object();

    /* JADX INFO: renamed from: ۙ */
    public final ArrayDeque f17997 = new ArrayDeque();

    public ExecutorC1079(Executor executor) {
        this.f18000 = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        synchronized (this.f17998) {
            this.f17997.add(new Runnable() { // from class: l.᩶ܿ
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable2 = runnable;
                    ExecutorC1079 executorC1079 = this.f68235;
                    executorC1079.getClass();
                    try {
                        runnable2.run();
                    } finally {
                        executorC1079.m15843();
                    }
                }
            });
            if (this.f17999 == null) {
                m15843();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m15843() {
        synchronized (this.f17998) {
            Runnable runnable = (Runnable) this.f17997.poll();
            this.f17999 = runnable;
            if (runnable != null) {
                ((ExecutorC1009) this.f18000).execute(runnable);
            }
        }
    }
}
