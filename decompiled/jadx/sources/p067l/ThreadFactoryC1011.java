package p067l;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۗᩴ */
/* JADX INFO: compiled from: T58S */
/* JADX INFO: loaded from: classes2.dex */
public final class ThreadFactoryC1011 implements ThreadFactory {

    /* JADX INFO: renamed from: ֫ */
    public final AtomicInteger f13594 = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f13594.getAndIncrement());
        return thread;
    }
}
