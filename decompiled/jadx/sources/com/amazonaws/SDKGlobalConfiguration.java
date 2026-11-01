package com.amazonaws;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class SDKGlobalConfiguration {

    /* JADX INFO: renamed from: ֫ */
    public static final AtomicLong f1278 = new AtomicLong(0);

    /* JADX INFO: renamed from: ֫ */
    public static void m1366(long j) {
        f1278.set(j);
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m1365() {
        return f1278.get();
    }
}
