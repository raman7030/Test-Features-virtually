package l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.ܺۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6W4 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ThreadFactoryC15849 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "MCP credential metadata");
        thread.setDaemon(true);
        return thread;
    }
}
