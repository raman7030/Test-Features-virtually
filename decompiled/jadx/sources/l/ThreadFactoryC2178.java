package l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.ۖ֡ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7B2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ThreadFactoryC2178 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "Remote LAN KeepAlive #" + C19112.f60204.incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
