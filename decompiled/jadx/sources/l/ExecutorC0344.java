package l;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.֡ۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 68UW */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC0344 implements Executor {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Handler f1756;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1756.post(runnable);
    }
}
