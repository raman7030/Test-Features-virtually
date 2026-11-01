package p067l;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: l.ۖۡ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HA0I */
/* JADX INFO: loaded from: classes2.dex */
public final class ThreadFactoryC4683 implements ThreadFactory {

    /* JADX INFO: renamed from: ֫ */
    public final ThreadFactory f10553 = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f10553.newThread(runnable);
        threadNewThread.setName("JmDNS " + threadNewThread.getName());
        return threadNewThread;
    }
}
