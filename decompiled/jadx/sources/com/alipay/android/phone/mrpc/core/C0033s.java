package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.s */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C0033s {

    /* JADX INFO: renamed from: a */
    public static Boolean f154a;

    /* JADX INFO: renamed from: a */
    public static final boolean m257a(Context context) {
        Boolean bool = f154a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean z = (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0;
            f154a = Boolean.valueOf(z);
            return z;
        } catch (Exception unused) {
            return false;
        }
    }
}
