package p067l;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֡ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC2695 implements Executor {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Handler f4532;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f4532.post(runnable);
    }
}
