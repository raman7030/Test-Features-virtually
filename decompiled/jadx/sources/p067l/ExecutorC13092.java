package p067l;

import java.util.LinkedList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۧ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC13092 implements Executor {

    /* JADX INFO: renamed from: ᩸ */
    public final LinkedList f36809 = new LinkedList();

    /* JADX INFO: renamed from: ᩹ */
    public Runnable f36810;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        this.f36809.offer(new RunnableC4374(this, runnable));
        if (this.f36810 == null) {
            m29957();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m29957() {
        Runnable runnable = (Runnable) this.f36809.poll();
        this.f36810 = runnable;
        if (runnable != null) {
            C18455.f55168.execute(runnable);
        }
    }
}
