package com.tencent.p062mm.opensdk.utils;

/* JADX INFO: loaded from: classes.dex */
public class Log {
    public static ILog logImpl;

    /* JADX INFO: renamed from: d */
    public static void m2020d(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            return;
        }
        iLog.m2015d(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public static void m2021e(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            return;
        }
        iLog.m2016e(str, str2);
    }

    /* JADX INFO: renamed from: i */
    public static void m2022i(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            return;
        }
        iLog.m2017i(str, str2);
    }

    public static void setLogImpl(ILog iLog) {
        logImpl = iLog;
    }

    /* JADX INFO: renamed from: v */
    public static void m2023v(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            return;
        }
        iLog.m2018v(str, str2);
    }

    /* JADX INFO: renamed from: w */
    public static void m2024w(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            return;
        }
        iLog.m2019w(str, str2);
    }
}
