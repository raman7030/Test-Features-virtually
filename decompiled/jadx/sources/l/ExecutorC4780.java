package l;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۙܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y4G0 */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC4780 implements Executor {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Runnable f15167;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Executor f15168;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f15166 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f15165 = new ArrayDeque();

    public ExecutorC4780(Executor executor) {
        this.f15168 = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        synchronized (this.f15166) {
            this.f15165.add(new Runnable() { // from class: l.᩶ܿ
                @Override // java.lang.Runnable
                public final void run() {
                    Runnable runnable2 = runnable;
                    ExecutorC4780 executorC4780 = this.f65560;
                    executorC4780.getClass();
                    try {
                        runnable2.run();
                    } finally {
                        executorC4780.m13963();
                    }
                }
            });
            if (this.f15167 == null) {
                m13963();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13963() {
        synchronized (this.f15166) {
            Runnable runnable = (Runnable) this.f15165.poll();
            this.f15167 = runnable;
            if (runnable != null) {
                ((ExecutorC3369) this.f15168).execute(runnable);
            }
        }
    }
}
