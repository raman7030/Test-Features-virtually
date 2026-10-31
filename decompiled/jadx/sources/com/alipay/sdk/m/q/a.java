package com.alipay.sdk.m.q;

import com.alipay.sdk.m.y.g;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static final String a = "TaskHelper";
    public static final int b = 4;
    public static volatile a c = null;
    public static int d = 32;
    public static ThreadPoolExecutor e;

    /* JADX INFO: renamed from: com.alipay.sdk.m.q.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: N673 */
    public class ThreadFactoryC0020a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            g.d(a.a, "newThread create coreSize=4 kat=2");
            return new Thread(runnable, "MspTaskHelper NEW #" + this.a.getAndIncrement());
        }
    }

    static {
        try {
            ThreadPoolExecutor threadPoolExecutor = e;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
        } catch (Throwable th) {
            g.a(th);
        }
    }

    public static ThreadPoolExecutor a() {
        if (e == null) {
            synchronized (a.class) {
                if (e == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, d, 2L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0020a());
                    e = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return e;
    }

    public static a b() {
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    public static void a(Runnable runnable) {
        a().execute(runnable);
    }
}
