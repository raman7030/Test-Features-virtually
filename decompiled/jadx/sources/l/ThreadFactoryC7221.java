package l;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۟ۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47AI */
/* JADX INFO: loaded from: classes2.dex */
public final class ThreadFactoryC7221 implements ThreadFactory {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f22110 = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "RemoteArchiveZip-" + this.f22110.getAndIncrement());
        thread.setDaemon(true);
        return thread;
    }
}
