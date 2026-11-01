package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.umeng.commonsdk.internal.utils.j */
/* JADX INFO: compiled from: R48C */
/* JADX INFO: loaded from: classes.dex */
public class C0785j {

    /* JADX INFO: renamed from: a */
    public static final String f3295a = "um_pri";

    /* JADX INFO: renamed from: b */
    public static final String f3296b = "um_common_strength";

    /* JADX INFO: renamed from: c */
    public static final String f3297c = "um_common_battery";

    /* JADX INFO: renamed from: a */
    public static String m2865a(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f3295a, 0)) == null) {
            return null;
        }
        return sharedPreferences.getString(f3297c, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m2866a(Context context, String str) {
        SharedPreferences sharedPreferences;
        if (context == null || TextUtils.isEmpty(str) || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f3295a, 0)) == null) {
            return;
        }
        sharedPreferences.edit().putString(f3297c, str).commit();
    }
}
