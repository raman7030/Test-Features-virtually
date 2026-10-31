package com.alipay.sdk.m.y;

import android.os.SystemClock;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class c {
    public static final long a = 3000;
    public static long b = -1;

    public static synchronized boolean a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - b < a) {
            return true;
        }
        b = jElapsedRealtime;
        return false;
    }
}
