package com.alipay.android.phone.mrpc.core;

import android.os.Looper;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.ac */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0012ac {
    /* JADX INFO: renamed from: a */
    public static boolean m159a() {
        return Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper();
    }
}
