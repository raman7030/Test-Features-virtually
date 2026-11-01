package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.common.C0744b;

/* JADX INFO: renamed from: com.umeng.analytics.c */
/* JADX INFO: compiled from: 26AD */
/* JADX INFO: loaded from: classes.dex */
public class C0637c {

    /* JADX INFO: renamed from: a */
    public static String[] f2198a = new String[2];

    /* JADX INFO: renamed from: a */
    public static void m2105a(Context context, String str, String str2) {
        String[] strArr = f2198a;
        strArr[0] = str;
        strArr[1] = str2;
        if (context != null) {
            C0744b.m2703a(context).m2710a(str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String[] m2106a(Context context) {
        String[] strArrM2711a;
        if (!TextUtils.isEmpty(f2198a[0]) && !TextUtils.isEmpty(f2198a[1])) {
            return f2198a;
        }
        if (context == null || (strArrM2711a = C0744b.m2703a(context).m2711a()) == null) {
            return null;
        }
        String[] strArr = f2198a;
        strArr[0] = strArrM2711a[0];
        strArr[1] = strArrM2711a[1];
        return strArr;
    }

    /* JADX INFO: renamed from: b */
    public static void m2107b(Context context) {
        String[] strArr = f2198a;
        strArr[0] = null;
        strArr[1] = null;
        if (context != null) {
            C0744b.m2703a(context).m2712b();
        }
    }
}
