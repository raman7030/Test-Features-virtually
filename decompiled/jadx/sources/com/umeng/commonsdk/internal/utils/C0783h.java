package com.umeng.commonsdk.internal.utils;

import android.os.Build;
import java.io.File;
import p067l.C17588;

/* JADX INFO: renamed from: com.umeng.commonsdk.internal.utils.h */
/* JADX INFO: compiled from: A48R */
/* JADX INFO: loaded from: classes.dex */
public class C0783h {
    /* JADX INFO: renamed from: a */
    public static boolean m2860a() {
        return m2861b() || m2862c() || m2863d() || m2864e();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2861b() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2862c() {
        try {
            if (new File("/system/app/Superuser.apk").exists()) {
                return true;
            }
        } catch (Exception unused) {
        }
        try {
            return new File("/system/app/Kinguser.apk").exists();
        } catch (Exception unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2863d() {
        return new C0780e().m2857a(C0780e.a.check_su_binary) != null;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m2864e() {
        String[] strArr = {"/bin", "/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/", "/su/bin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i = 0; i < 12; i++) {
            if (new File(C17588.m40053(strArr[i], "su")).exists()) {
                return true;
            }
        }
        return false;
    }
}
