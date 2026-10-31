package com.alipay.sdk.m.f0;

import android.content.Context;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static a a = new a();

    public static a a() {
        return a;
    }

    public String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName;
        } catch (Exception unused) {
            return "0.0.0";
        }
    }
}
