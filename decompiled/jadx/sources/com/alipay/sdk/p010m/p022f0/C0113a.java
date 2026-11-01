package com.alipay.sdk.p010m.p022f0;

import android.content.Context;

/* JADX INFO: renamed from: com.alipay.sdk.m.f0.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0113a {

    /* JADX INFO: renamed from: a */
    public static C0113a f459a = new C0113a();

    /* JADX INFO: renamed from: a */
    public static C0113a m595a() {
        return f459a;
    }

    /* JADX INFO: renamed from: a */
    public String m596a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName;
        } catch (Exception unused) {
            return "0.0.0";
        }
    }
}
