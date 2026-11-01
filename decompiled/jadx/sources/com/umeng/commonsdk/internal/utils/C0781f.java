package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.umeng.commonsdk.internal.utils.f */
/* JADX INFO: compiled from: 048I */
/* JADX INFO: loaded from: classes.dex */
public class C0781f {

    /* JADX INFO: renamed from: a */
    public static final String f3293a = "info";

    /* JADX INFO: renamed from: b */
    public static final String f3294b = "ua";

    /* JADX INFO: renamed from: a */
    public static void m2859a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("info", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(f3294b, str).commit();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m2858a(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("info", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getString(f3294b, null);
        }
        return null;
    }
}
