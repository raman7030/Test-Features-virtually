package l;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.ۖۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HA0I */
/* JADX INFO: loaded from: classes2.dex */
public final class ThreadFactoryC2435 implements ThreadFactory {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ThreadFactory f7762 = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f7762.newThread(runnable);
        threadNewThread.setName("JmDNS " + threadNewThread.getName());
        return threadNewThread;
    }
}
