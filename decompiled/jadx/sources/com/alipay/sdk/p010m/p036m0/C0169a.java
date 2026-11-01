package com.alipay.sdk.p010m.p036m0;

import android.content.Context;
import com.alipay.sdk.p010m.p013b.C0085a;
import com.alipay.sdk.p010m.p013b.C0086b;

/* JADX INFO: renamed from: com.alipay.sdk.m.m0.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0169a {
    /* JADX INFO: renamed from: a */
    public static String m791a(Context context) {
        if (C0085a.f307a) {
            return C0086b.b.f315a.m461a(context.getApplicationContext(), "AUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* JADX INFO: renamed from: b */
    public static String m793b(Context context) {
        if (C0085a.f307a) {
            return C0086b.b.f315a.m461a(context.getApplicationContext(), "OUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* JADX INFO: renamed from: c */
    public static String m794c(Context context) {
        if (C0085a.f307a) {
            return C0086b.b.f315a.m461a(context.getApplicationContext(), "GUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* JADX INFO: renamed from: d */
    public static String m795d(Context context) {
        if (C0085a.f307a) {
            return C0086b.b.f315a.m461a(context.getApplicationContext(), "DUID");
        }
        throw new RuntimeException("SDK Need Init First!");
    }

    /* JADX INFO: renamed from: e */
    public static void m796e(Context context) {
        C0085a.f308b = C0086b.b.f315a.m462a(context.getApplicationContext());
        C0085a.f307a = true;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m792a() {
        if (C0085a.f307a) {
            return C0085a.f308b;
        }
        throw new RuntimeException("SDK Need Init First!");
    }
}
