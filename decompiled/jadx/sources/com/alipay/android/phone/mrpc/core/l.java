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

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class l implements ad {
    public static l b;
    public static final ThreadFactory i = new n();
    public Context a;
    public ThreadPoolExecutor c;
    public b d;
    public long e;
    public long f;
    public long g;
    public int h;

    public l(Context context) {
        this.a = context;
        e();
    }

    public static final l a(Context context) {
        l lVar = b;
        return lVar != null ? lVar : b(context);
    }

    private FutureTask a(q qVar) {
        return new m(this, qVar, qVar);
    }

    public static final synchronized l b(Context context) {
        l lVar = b;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(context);
        b = lVar2;
        return lVar2;
    }

    private void e() {
        this.d = b.a("android");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 11, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue(20), i, new ThreadPoolExecutor.CallerRunsPolicy());
        this.c = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    public b a() {
        return this.d;
    }

    public q a(o oVar) {
        return new q(this, oVar);
    }

    @Override // com.alipay.android.phone.mrpc.core.ad
    public Future a(u uVar) {
        if (!(uVar instanceof o)) {
            throw new RuntimeException("request send error.");
        }
        if (s.a(this.a)) {
            d();
        }
        FutureTask futureTaskA = a(a((o) uVar));
        this.c.execute(futureTaskA);
        return futureTaskA;
    }

    public void a(long j) {
        this.e += j;
    }

    public long b() {
        long j = this.g;
        if (j == 0) {
            return 0L;
        }
        return ((this.e * 1000) / j) >> 10;
    }

    public void b(long j) {
        this.f += j;
        this.h++;
    }

    public long c() {
        int i2 = this.h;
        if (i2 == 0) {
            return 0L;
        }
        return this.f / ((long) i2);
    }

    public void c(long j) {
        this.g += j;
    }

    public String d() {
        return String.format("HttpManager" + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times", Integer.valueOf(this.c.getActiveCount()), Long.valueOf(this.c.getCompletedTaskCount()), Long.valueOf(this.c.getTaskCount()), Long.valueOf(b()), Long.valueOf(c()), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h));
    }
}
