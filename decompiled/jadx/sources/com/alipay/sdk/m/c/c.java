package com.alipay.sdk.m.c;

import android.content.Context;
import android.os.Looper;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class c {
    public static b a;
    public static boolean b;

    public static void b(Context context) {
        if (a != null || b) {
            return;
        }
        synchronized (c.class) {
            if (a == null && !b) {
                a = com.alipay.sdk.m.d.a.a(context);
                b = true;
            }
        }
    }

    public static synchronized String a(Context context) {
        try {
            if (context == null) {
                throw new RuntimeException("Context is null");
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot be called from the main thread");
            }
            b(context);
            b bVar = a;
            if (bVar != null) {
                try {
                    return bVar.a(context);
                } catch (Exception unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
