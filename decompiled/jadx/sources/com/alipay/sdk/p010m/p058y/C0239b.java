package com.alipay.sdk.p010m.p058y;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;

/* JADX INFO: renamed from: com.alipay.sdk.m.y.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0239b {
    /* JADX INFO: renamed from: a */
    public static int m1174a(Context context) {
        try {
            Resources resources = context.getResources();
            return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
        } catch (Throwable th) {
            C0244g.m1199a(th);
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m1175b(Context context) {
        try {
            Resources resources = context.getResources();
            return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        } catch (Throwable th) {
            C0244g.m1199a(th);
            return 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m1176c(Context context) {
        return context.getApplicationContext().getApplicationInfo().targetSdkVersion;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1177d(Context context) {
        return m1176c(context) >= 35 && Build.VERSION.SDK_INT >= 35;
    }
}
