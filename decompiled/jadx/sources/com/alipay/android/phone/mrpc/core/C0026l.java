package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.l */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0026l implements InterfaceC0013ad {

    /* JADX INFO: renamed from: b */
    public static C0026l f113b;

    /* JADX INFO: renamed from: i */
    public static final ThreadFactory f114i = new ThreadFactoryC0028n();

    /* JADX INFO: renamed from: a */
    public Context f115a;

    /* JADX INFO: renamed from: c */
    public ThreadPoolExecutor f116c;

    /* JADX INFO: renamed from: d */
    public C0016b f117d;

    /* JADX INFO: renamed from: e */
    public long f118e;

    /* JADX INFO: renamed from: f */
    public long f119f;

    /* JADX INFO: renamed from: g */
    public long f120g;

    /* JADX INFO: renamed from: h */
    public int f121h;

    public C0026l(Context context) {
        this.f115a = context;
        m205e();
    }

    /* JADX INFO: renamed from: a */
    public static final C0026l m202a(Context context) {
        C0026l c0026l = f113b;
        return c0026l != null ? c0026l : m204b(context);
    }

    /* JADX INFO: renamed from: a */
    private FutureTask m203a(CallableC0031q callableC0031q) {
        return new C0027m(this, callableC0031q, callableC0031q);
    }

    /* JADX INFO: renamed from: b */
    public static final synchronized C0026l m204b(Context context) {
        C0026l c0026l = f113b;
        if (c0026l != null) {
            return c0026l;
        }
        C0026l c0026l2 = new C0026l(context);
        f113b = c0026l2;
        return c0026l2;
    }

    /* JADX INFO: renamed from: e */
    private void m205e() {
        this.f117d = C0016b.m168a("android");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 11, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue(20), f114i, new ThreadPoolExecutor.CallerRunsPolicy());
        this.f116c = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.f115a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    /* JADX INFO: renamed from: a */
    public C0016b m206a() {
        return this.f117d;
    }

    /* JADX INFO: renamed from: a */
    public CallableC0031q m207a(C0029o c0029o) {
        return new CallableC0031q(this, c0029o);
    }

    @Override // com.alipay.android.phone.mrpc.core.InterfaceC0013ad
    /* JADX INFO: renamed from: a */
    public Future mo160a(AbstractC0035u abstractC0035u) {
        if (!(abstractC0035u instanceof C0029o)) {
            throw new RuntimeException("request send error.");
        }
        if (C0033s.m257a(this.f115a)) {
            m213d();
        }
        FutureTask futureTaskM203a = m203a(m207a((C0029o) abstractC0035u));
        this.f116c.execute(futureTaskM203a);
        return futureTaskM203a;
    }

    /* JADX INFO: renamed from: a */
    public void m208a(long j) {
        this.f118e += j;
    }

    /* JADX INFO: renamed from: b */
    public long m209b() {
        long j = this.f120g;
        if (j == 0) {
            return 0L;
        }
        return ((this.f118e * 1000) / j) >> 10;
    }

    /* JADX INFO: renamed from: b */
    public void m210b(long j) {
        this.f119f += j;
        this.f121h++;
    }

    /* JADX INFO: renamed from: c */
    public long m211c() {
        int i = this.f121h;
        if (i == 0) {
            return 0L;
        }
        return this.f119f / ((long) i);
    }

    /* JADX INFO: renamed from: c */
    public void m212c(long j) {
        this.f120g += j;
    }

    /* JADX INFO: renamed from: d */
    public String m213d() {
        return String.format("HttpManager" + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times", Integer.valueOf(this.f116c.getActiveCount()), Long.valueOf(this.f116c.getCompletedTaskCount()), Long.valueOf(this.f116c.getTaskCount()), Long.valueOf(m209b()), Long.valueOf(m211c()), Long.valueOf(this.f118e), Long.valueOf(this.f119f), Long.valueOf(this.f120g), Integer.valueOf(this.f121h));
    }
}
