package com.alipay.sdk.p010m.p043q;

import com.alipay.sdk.p010m.p058y.C0244g;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.alipay.sdk.m.q.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0190a {

    /* JADX INFO: renamed from: a */
    public static final String f890a = "TaskHelper";

    /* JADX INFO: renamed from: b */
    public static final int f891b = 4;

    /* JADX INFO: renamed from: c */
    public static volatile C0190a f892c = null;

    /* JADX INFO: renamed from: d */
    public static int f893d = 32;

    /* JADX INFO: renamed from: e */
    public static ThreadPoolExecutor f894e;

    /* JADX INFO: renamed from: com.alipay.sdk.m.q.a$a */
    /* JADX INFO: compiled from: N673 */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f895a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            C0244g.m1203d(C0190a.f890a, "newThread create coreSize=4 kat=2");
            return new Thread(runnable, "MspTaskHelper NEW #" + this.f895a.getAndIncrement());
        }
    }

    static {
        try {
            ThreadPoolExecutor threadPoolExecutor = f894e;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
        } catch (Throwable th) {
            C0244g.m1199a(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ThreadPoolExecutor m919a() {
        if (f894e == null) {
            synchronized (C0190a.class) {
                if (f894e == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, f893d, 2L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a());
                    f894e = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f894e;
    }

    /* JADX INFO: renamed from: b */
    public static C0190a m921b() {
        if (f892c == null) {
            synchronized (C0190a.class) {
                if (f892c == null) {
                    f892c = new C0190a();
                }
            }
        }
        return f892c;
    }

    /* JADX INFO: renamed from: a */
    public static void m920a(Runnable runnable) {
        m919a().execute(runnable);
    }
}
