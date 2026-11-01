package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: renamed from: com.umeng.analytics.pro.aa */
/* JADX INFO: compiled from: 8BM6 */
/* JADX INFO: loaded from: classes.dex */
public class C0643aa {

    /* JADX INFO: renamed from: a */
    public static InterfaceC0730z f2217a;

    /* JADX INFO: renamed from: b */
    public static boolean f2218b;

    /* JADX INFO: renamed from: a */
    public static synchronized String m2121a(Context context) {
        try {
            if (context == null) {
                throw new RuntimeException("Context is null");
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot be called from the main thread");
            }
            m2122b(context);
            InterfaceC0730z interfaceC0730z = f2217a;
            if (interfaceC0730z != null) {
                try {
                    return interfaceC0730z.mo2131a(context);
                } catch (Exception unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2122b(Context context) {
        if (f2217a != null || f2218b) {
            return;
        }
        synchronized (C0643aa.class) {
            if (f2217a == null && !f2218b) {
                f2217a = C0645ac.m2132a(context);
                f2218b = true;
            }
        }
    }
}
