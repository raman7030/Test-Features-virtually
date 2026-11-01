package p067l;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۟ۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47AI */
/* JADX INFO: loaded from: classes2.dex */
public final class ThreadFactoryC9231 implements ThreadFactory {

    /* JADX INFO: renamed from: ֫ */
    public final AtomicInteger f24994 = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "RemoteArchiveZip-" + this.f24994.getAndIncrement());
        thread.setDaemon(true);
        return thread;
    }
}
