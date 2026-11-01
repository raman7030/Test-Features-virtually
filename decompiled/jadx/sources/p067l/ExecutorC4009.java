package p067l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֫ۡܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: O700 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC4009 implements Executor {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C14146 f8743;

    public /* synthetic */ ExecutorC4009(C14146 c14146) {
        this.f8743 = c14146;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f8743.post(runnable);
    }
}
