package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֫ۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: O700 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC1726 implements Executor {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f5966;

    public /* synthetic */ ExecutorC1726(C12392 c12392) {
        this.f5966 = c12392;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f5966.post(runnable);
    }
}
