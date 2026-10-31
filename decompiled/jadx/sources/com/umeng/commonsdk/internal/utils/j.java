package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: compiled from: R48C */
/* JADX INFO: loaded from: classes.dex */
public class j {
    public static final String a = "um_pri";
    public static final String b = "um_common_strength";
    public static final String c = "um_common_battery";

    public static String a(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(a, 0)) == null) {
            return null;
        }
        return sharedPreferences.getString(c, null);
    }

    public static void a(Context context, String str) {
        SharedPreferences sharedPreferences;
        if (context == null || TextUtils.isEmpty(str) || (sharedPreferences = context.getApplicationContext().getSharedPreferences(a, 0)) == null) {
            return;
        }
        sharedPreferences.edit().putString(c, str).commit();
    }
}
