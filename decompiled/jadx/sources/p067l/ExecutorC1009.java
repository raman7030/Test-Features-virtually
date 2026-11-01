package p067l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۗܿ */
/* JADX INFO: compiled from: Y4G0 */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC1009 implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
