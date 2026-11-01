package com.alipay.sdk.p010m.p058y;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.alipay.sdk.m.y.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0240c {

    /* JADX INFO: renamed from: a */
    public static final long f1145a = 3000;

    /* JADX INFO: renamed from: b */
    public static long f1146b = -1;

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m1178a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f1146b < f1145a) {
            return true;
        }
        f1146b = jElapsedRealtime;
        return false;
    }
}
