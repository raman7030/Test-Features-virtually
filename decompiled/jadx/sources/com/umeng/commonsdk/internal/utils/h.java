package com.umeng.commonsdk.internal.utils;

import android.os.Build;
import java.io.File;
import l.C16014;

/* JADX INFO: compiled from: A48R */
/* JADX INFO: loaded from: classes.dex */
public class h {
    public static boolean a() {
        return b() || c() || d() || e();
    }

    public static boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    public static boolean c() {
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

    public static boolean d() {
        return new e().a(e.a.check_su_binary) != null;
    }

    public static boolean e() {
        String[] strArr = {"/bin", "/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/", "/su/bin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i = 0; i < 12; i++) {
            if (new File(C16014.m37867(strArr[i], "su")).exists()) {
                return true;
            }
        }
        return false;
    }
}
