package p067l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.᩶ܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 7B0R */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ThreadFactoryC21647 implements ThreadFactory {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ String f68206;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f68206);
        thread.setPriority(10);
        return thread;
    }
}
