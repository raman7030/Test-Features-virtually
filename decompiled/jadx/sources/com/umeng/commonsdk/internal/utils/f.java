package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: 048I */
/* JADX INFO: loaded from: classes.dex */
public class f {
    public static final String a = "info";
    public static final String b = "ua";

    public static void a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("info", 0);
        if (sharedPreferences != null) {
            sharedPreferences.edit().putString(b, str).commit();
        }
    }

    public static String a(Context context) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("info", 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getString(b, null);
        }
        return null;
    }
}
