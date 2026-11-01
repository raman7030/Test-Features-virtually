package com.umeng.umzid;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.umeng.umzid.b */
/* JADX INFO: loaded from: classes.dex */
public class C0840b {

    /* JADX INFO: renamed from: a */
    public static volatile ScheduledThreadPoolExecutor f3682a;

    /* JADX INFO: renamed from: b */
    public static ThreadFactory f3683b = new a();

    /* JADX INFO: renamed from: com.umeng.umzid.b$a */
    public final class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public AtomicInteger f3684a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("ZIDThreadPoolExecutor" + this.f3684a.addAndGet(1));
            return thread;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ScheduledThreadPoolExecutor m3327a() {
        if (f3682a == null) {
            synchronized (C0840b.class) {
                if (f3682a == null) {
                    f3682a = new ScheduledThreadPoolExecutor(Runtime.getRuntime().availableProcessors() * 4, f3683b);
                }
            }
        }
        return f3682a;
    }

    /* JADX INFO: renamed from: a */
    public static void m3328a(Runnable runnable) {
        try {
            m3327a().execute(runnable);
        } catch (Throwable unused) {
        }
    }
}
