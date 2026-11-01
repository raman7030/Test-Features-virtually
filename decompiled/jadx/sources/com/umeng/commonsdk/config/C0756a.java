package com.umeng.commonsdk.config;

/* JADX INFO: renamed from: com.umeng.commonsdk.config.a */
/* JADX INFO: compiled from: NBM3 */
/* JADX INFO: loaded from: classes.dex */
public class C0756a {
    /* JADX INFO: renamed from: a */
    public static boolean m2735a(int i, int i2) {
        return i2 >= 0 && i2 <= 31 && (i & (1 << i2)) != 0;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2736a(long j, int i) {
        return i >= 0 && i <= 63 && (j & (1 << i)) != 0;
    }

    /* JADX INFO: renamed from: b */
    public static int m2737b(int i, int i2) {
        return i | (1 << i2);
    }

    /* JADX INFO: renamed from: b */
    public static long m2738b(long j, int i) {
        return (i < 0 || i > 63) ? j : j | (1 << i);
    }

    /* JADX INFO: renamed from: c */
    public static int m2739c(int i, int i2) {
        return i & (~(1 << i2));
    }

    /* JADX INFO: renamed from: c */
    public static long m2740c(long j, int i) {
        return (i < 0 || i > 63) ? j : j & (~(1 << i));
    }
}
