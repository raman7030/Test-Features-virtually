package com.alipay.sdk.m.y;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class m {
    public static String a;

    public static synchronized boolean a(Context context, String str) {
        boolean zContains;
        try {
            zContains = PreferenceManager.getDefaultSharedPreferences(context).contains(str);
        } catch (Throwable th) {
            g.a(th);
            zContains = false;
        }
        return zContains;
    }

    public static synchronized void b(Context context, String str) {
        try {
            PreferenceManager.getDefaultSharedPreferences(context).edit().remove(str).apply();
        } catch (Throwable th) {
            g.a(th);
        }
    }

    public static synchronized String a(com.alipay.sdk.m.w.a aVar, Context context, String str, String str2) {
        String strA;
        strA = null;
        try {
            String string = PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
            strA = TextUtils.isEmpty(string) ? null : com.alipay.sdk.m.p.e.a(a(context), string, str);
            if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(strA)) {
                com.alipay.sdk.m.m.a.b(aVar, com.alipay.sdk.m.m.b.m, com.alipay.sdk.m.m.b.F, str + "," + string);
            }
        } catch (Exception e) {
            g.a(e);
        }
        return strA;
    }

    public static synchronized void b(com.alipay.sdk.m.w.a aVar, Context context, String str, String str2) {
        try {
            String strB = com.alipay.sdk.m.p.e.b(a(context), str2, str);
            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(strB)) {
                com.alipay.sdk.m.m.a.b(aVar, com.alipay.sdk.m.m.b.m, com.alipay.sdk.m.m.b.G, str + "," + str2);
            }
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, strB).apply();
        } catch (Throwable th) {
            g.a(th);
        }
    }

    public static String a(Context context) {
        String packageName;
        if (TextUtils.isEmpty(a)) {
            try {
                packageName = context.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                g.a(th);
                packageName = "";
            }
            a = (packageName + "0000000000000000000000000000").substring(0, 24);
        }
        return a;
    }
}
