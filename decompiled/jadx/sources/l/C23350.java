package l;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩻֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6RO */
/* JADX INFO: loaded from: classes.dex */
public final class C23350 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C6417 f75019;

    static {
        final AtomicInteger atomicInteger = new AtomicInteger();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(256), new ThreadFactory() { // from class: l.ܳ֡ᩳ
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "editable-prepare-" + atomicInteger.incrementAndGet());
                thread.setDaemon(true);
                return thread;
            }
        }, new ThreadPoolExecutor.AbortPolicy());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f75019 = new C6417(new C1143(33554432L), new C4671(), threadPoolExecutor);
    }
}
