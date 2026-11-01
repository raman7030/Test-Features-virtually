package com.alipay.sdk.p010m.p015c;

import android.content.Context;
import android.os.Looper;
import com.alipay.sdk.p010m.p017d.C0097a;

/* JADX INFO: renamed from: com.alipay.sdk.m.c.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0090c {

    /* JADX INFO: renamed from: a */
    public static InterfaceC0089b f348a;

    /* JADX INFO: renamed from: b */
    public static boolean f349b;

    /* JADX INFO: renamed from: b */
    public static void m481b(Context context) {
        if (f348a != null || f349b) {
            return;
        }
        synchronized (C0090c.class) {
            if (f348a == null && !f349b) {
                f348a = C0097a.m555a(context);
                f349b = true;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m480a(Context context) {
        try {
            if (context == null) {
                throw new RuntimeException("Context is null");
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot be called from the main thread");
            }
            m481b(context);
            InterfaceC0089b interfaceC0089b = f348a;
            if (interfaceC0089b != null) {
                try {
                    return interfaceC0089b.mo479a(context);
                } catch (Exception unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
