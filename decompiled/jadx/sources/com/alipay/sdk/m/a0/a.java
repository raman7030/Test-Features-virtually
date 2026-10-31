package com.alipay.sdk.m.a0;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import com.alipay.sdk.m.y.g;
import com.alipay.sdk.m.y.q;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import l.ConcurrentMapC10942;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static final String a = "CDT";
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static ConcurrentMapC10942 g;
    public static ExecutorService h = Executors.newFixedThreadPool(16);

    /* JADX INFO: renamed from: com.alipay.sdk.m.a0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: N673 */
    public interface InterfaceC0003a {
        Object a(Object obj);
    }

    public static synchronized void a(int i, Object obj) {
        if (g == null) {
            g = new ConcurrentMapC10942();
        }
        g.put(Integer.valueOf(i), new Pair(Long.valueOf(SystemClock.elapsedRealtime()), obj));
    }

    public static Pair a(int i, TimeUnit timeUnit, long j) {
        ConcurrentMapC10942 concurrentMapC10942 = g;
        if (concurrentMapC10942 == null) {
            return new Pair(Boolean.FALSE, null);
        }
        Pair pair = (Pair) concurrentMapC10942.get(Integer.valueOf(i));
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

    public static synchronized void a() {
        g = null;
    }

    public static Context a(Context context) {
        if (context == null) {
            return null;
        }
        return context.getApplicationContext();
    }

    public static Object a(int i, long j, TimeUnit timeUnit, InterfaceC0003a interfaceC0003a, Callable callable, boolean z, long j2, TimeUnit timeUnit2, com.alipay.sdk.m.w.a aVar, boolean z2) {
        Object objCall;
        try {
            Pair pairA = a(i, timeUnit, j);
            if (((Boolean) pairA.first).booleanValue() && ((Boolean) interfaceC0003a.a(pairA.second)).booleanValue()) {
                g.d("getC", i + " got " + pairA.second);
                return pairA.second;
            }
            if (z2 && q.h()) {
                com.alipay.sdk.m.m.a.b(aVar, com.alipay.sdk.m.m.b.f77909l, "ch_get_main", "" + i);
                g.d("getC", i + " skip");
                objCall = null;
            } else {
                if (z) {
                    objCall = h.submit(callable).get(j2, timeUnit2);
                } else {
                    objCall = callable.call();
                }
                a(i, objCall);
            }
            g.d("getC", i + " new " + objCall);
            return objCall;
        } catch (Throwable th) {
            g.a(a, "ch_get_e|" + i, th);
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, "ch_get_e|" + i, th);
            g.d("getC", i + " err");
            return null;
        }
    }
}
