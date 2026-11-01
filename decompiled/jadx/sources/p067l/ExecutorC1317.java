package p067l;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: l.ۢ۫ */
/* JADX INFO: compiled from: 0AMD */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC1317 implements Executor {

    /* JADX INFO: renamed from: ᩸ */
    public final Handler f31985;

    public ExecutorC1317(Handler handler) {
        this.f31985 = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        Handler handler = this.f31985;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }
}
