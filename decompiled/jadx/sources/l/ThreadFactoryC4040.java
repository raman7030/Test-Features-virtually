package l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.ۘܺۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6V4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ThreadFactoryC4040 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "mcp-text-search-cache");
        thread.setDaemon(true);
        return thread;
    }
}
