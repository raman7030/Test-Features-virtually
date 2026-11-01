package com.alipay.sdk.p010m.p058y;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p041p.C0188e;
import com.alipay.sdk.p010m.p055w.C0233a;

/* JADX INFO: renamed from: com.alipay.sdk.m.y.m */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0250m {

    /* JADX INFO: renamed from: a */
    public static String f1202a;

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m1229a(Context context, String str) {
        boolean zContains;
        try {
            zContains = PreferenceManager.getDefaultSharedPreferences(context).contains(str);
        } catch (Throwable th) {
            C0244g.m1199a(th);
            zContains = false;
        }
        return zContains;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m1230b(Context context, String str) {
        try {
            PreferenceManager.getDefaultSharedPreferences(context).edit().remove(str).apply();
        } catch (Throwable th) {
            C0244g.m1199a(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m1228a(C0233a c0233a, Context context, String str, String str2) {
        String strM910a;
        strM910a = null;
        try {
            String string = PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
            strM910a = TextUtils.isEmpty(string) ? null : C0188e.m910a(m1227a(context), string, str);
            if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(strM910a)) {
                C0167a.m755b(c0233a, C0168b.f620m, C0168b.f585F, str + "," + string);
            }
        } catch (Exception e) {
            C0244g.m1199a(e);
        }
        return strM910a;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m1231b(C0233a c0233a, Context context, String str, String str2) {
        try {
            String strM912b = C0188e.m912b(m1227a(context), str2, str);
            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(strM912b)) {
                C0167a.m755b(c0233a, C0168b.f620m, C0168b.f586G, str + "," + str2);
            }
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, strM912b).apply();
        } catch (Throwable th) {
            C0244g.m1199a(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1227a(Context context) {
        String packageName;
        if (TextUtils.isEmpty(f1202a)) {
            try {
                packageName = context.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                C0244g.m1199a(th);
                packageName = "";
            }
            f1202a = (packageName + "0000000000000000000000000000").substring(0, 24);
        }
        return f1202a;
    }
}
