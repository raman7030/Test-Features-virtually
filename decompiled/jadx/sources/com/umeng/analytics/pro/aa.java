package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: 8BM6 */
/* JADX INFO: loaded from: classes.dex */
public class aa {
    public static z a;
    public static boolean b;

    public static synchronized String a(Context context) {
        try {
            if (context == null) {
                throw new RuntimeException("Context is null");
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot be called from the main thread");
            }
            b(context);
            z zVar = a;
            if (zVar != null) {
                try {
                    return zVar.a(context);
                } catch (Exception unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void b(Context context) {
        if (a != null || b) {
            return;
        }
        synchronized (aa.class) {
            if (a == null && !b) {
                a = ac.a(context);
                b = true;
            }
        }
    }
}
