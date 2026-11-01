package com.alipay.sdk.p010m.p012a0;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0244g;
import com.alipay.sdk.p010m.p058y.C0254q;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import p067l.ConcurrentMapC12768;

/* JADX INFO: renamed from: com.alipay.sdk.m.a0.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0083a {

    /* JADX INFO: renamed from: a */
    public static final String f288a = "CDT";

    /* JADX INFO: renamed from: b */
    public static final int f289b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f290c = 2;

    /* JADX INFO: renamed from: d */
    public static final int f291d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f292e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f293f = 5;

    /* JADX INFO: renamed from: g */
    public static ConcurrentMapC12768 f294g;

    /* JADX INFO: renamed from: h */
    public static ExecutorService f295h = Executors.newFixedThreadPool(16);

    /* JADX INFO: renamed from: com.alipay.sdk.m.a0.a$a */
    /* JADX INFO: compiled from: N673 */
    public interface a {
        /* JADX INFO: renamed from: a */
        Object mo448a(Object obj);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m447a(int i, Object obj) {
        if (f294g == null) {
            f294g = new ConcurrentMapC12768();
        }
        f294g.put(Integer.valueOf(i), new Pair(Long.valueOf(SystemClock.elapsedRealtime()), obj));
    }

    /* JADX INFO: renamed from: a */
    public static Pair m444a(int i, TimeUnit timeUnit, long j) {
        ConcurrentMapC12768 concurrentMapC12768 = f294g;
        if (concurrentMapC12768 == null) {
            return new Pair(Boolean.FALSE, null);
        }
        Pair pair = (Pair) concurrentMapC12768.get(Integer.valueOf(i));
        if (pair == null) {
            return new Pair(Boolean.FALSE, null);
        }
        Long l2 = (Long) pair.first;
        Object obj = pair.second;
        if (l2 != null && SystemClock.elapsedRealtime() - l2.longValue() <= TimeUnit.MILLISECONDS.convert(j, timeUnit)) {
            return new Pair(Boolean.TRUE, obj);
        }
        return new Pair(Boolean.FALSE, null);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m446a() {
        f294g = null;
    }

    /* JADX INFO: renamed from: a */
    public static Context m443a(Context context) {
        if (context == null) {
            return null;
        }
        return context.getApplicationContext();
    }

    /* JADX INFO: renamed from: a */
    public static Object m445a(int i, long j, TimeUnit timeUnit, a aVar, Callable callable, boolean z, long j2, TimeUnit timeUnit2, C0233a c0233a, boolean z2) {
        Object objCall;
        try {
            Pair pairM444a = m444a(i, timeUnit, j);
            if (((Boolean) pairM444a.first).booleanValue() && ((Boolean) aVar.mo448a(pairM444a.second)).booleanValue()) {
                C0244g.m1203d("getC", i + " got " + pairM444a.second);
                return pairM444a.second;
            }
            if (z2 && C0254q.m1300h()) {
                C0167a.m755b(c0233a, C0168b.f618l, "ch_get_main", "" + i);
                C0244g.m1203d("getC", i + " skip");
                objCall = null;
            } else {
                if (z) {
                    objCall = f295h.submit(callable).get(j2, timeUnit2);
                } else {
                    objCall = callable.call();
                }
                m447a(i, objCall);
            }
            C0244g.m1203d("getC", i + " new " + objCall);
            return objCall;
        } catch (Throwable th) {
            C0244g.m1198a(f288a, "ch_get_e|" + i, th);
            C0167a.m751a(c0233a, C0168b.f618l, "ch_get_e|" + i, th);
            C0244g.m1203d("getC", i + " err");
            return null;
        }
    }
}
