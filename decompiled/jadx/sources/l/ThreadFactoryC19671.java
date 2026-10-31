package l;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.᩵᩵ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7CF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ThreadFactoryC19671 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "remote-file-transfer-conflict-timeout");
        thread.setDaemon(true);
        return thread;
    }
}
