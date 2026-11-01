package com.alipay.sdk.p010m.p038n0;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.alipay.sdk.m.n0.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0174b {

    /* JADX INFO: renamed from: a */
    public static final String f723a = "OpenIdHelper";

    /* JADX INFO: renamed from: b */
    public static Method f724b;

    /* JADX INFO: renamed from: a */
    public static String m802a(Context context) {
        C0178f c0178fM814a = C0178f.m814a();
        return c0178fM814a.m820a(context.getApplicationContext(), c0178fM814a.f734c);
    }

    /* JADX INFO: renamed from: a */
    public static void m803a(boolean z) {
        C0178f.m814a();
        C0178f.m817a(z);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m804a() {
        Context context = null;
        try {
            if (f724b == null) {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", null);
                f724b = method;
                method.setAccessible(true);
            }
            context = (Context) f724b.invoke(null, null);
        } catch (Exception e) {
            e.toString();
        }
        if (context == null) {
            return false;
        }
        return C0178f.m814a().m821a(context, false);
    }

    /* JADX INFO: renamed from: b */
    public static String m805b(Context context) {
        C0178f c0178fM814a = C0178f.m814a();
        return c0178fM814a.m820a(context.getApplicationContext(), c0178fM814a.f733b);
    }

    /* JADX INFO: renamed from: c */
    public static String m806c(Context context) {
        C0178f c0178fM814a = C0178f.m814a();
        return c0178fM814a.m820a(context.getApplicationContext(), c0178fM814a.f732a);
    }

    /* JADX INFO: renamed from: d */
    public static String m807d(Context context) {
        C0178f c0178fM814a = C0178f.m814a();
        return c0178fM814a.m820a(context.getApplicationContext(), c0178fM814a.f735d);
    }
}
