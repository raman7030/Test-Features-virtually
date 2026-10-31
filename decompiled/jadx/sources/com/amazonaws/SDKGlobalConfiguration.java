package com.amazonaws;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class SDKGlobalConfiguration {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f118 = new AtomicLong(0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m200(long j) {
        f118.set(j);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m199() {
        return f118.get();
    }
}
