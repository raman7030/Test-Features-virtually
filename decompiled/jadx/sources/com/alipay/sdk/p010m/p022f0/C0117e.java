package com.alipay.sdk.p010m.p022f0;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* JADX INFO: renamed from: com.alipay.sdk.m.f0.e */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0117e {

    /* JADX INFO: renamed from: a */
    public static C0117e f467a = new C0117e();

    /* JADX INFO: renamed from: a */
    public static C0117e m642a() {
        return f467a;
    }

    /* JADX INFO: renamed from: a */
    public final String m643a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m644a(Context context) {
        try {
            return Build.HARDWARE.contains("goldfish") || Build.PRODUCT.contains("sdk") || Build.FINGERPRINT.contains("generic");
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m645b() {
        return "android";
    }

    /* JADX INFO: renamed from: c */
    public boolean m646c() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        for (int i = 0; i < 5; i++) {
            try {
                if (new File(strArr[i] + "su").exists()) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public String m647d() {
        return Build.BOARD;
    }

    /* JADX INFO: renamed from: e */
    public String m648e() {
        return Build.BRAND;
    }

    /* JADX INFO: renamed from: f */
    public String m649f() {
        return Build.DEVICE;
    }

    /* JADX INFO: renamed from: g */
    public String m650g() {
        return Build.DISPLAY;
    }

    /* JADX INFO: renamed from: h */
    public String m651h() {
        return Build.VERSION.INCREMENTAL;
    }

    /* JADX INFO: renamed from: i */
    public String m652i() {
        return Build.MANUFACTURER;
    }

    /* JADX INFO: renamed from: j */
    public String m653j() {
        return Build.MODEL;
    }

    /* JADX INFO: renamed from: k */
    public String m654k() {
        return Build.PRODUCT;
    }

    /* JADX INFO: renamed from: l */
    public String m655l() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: renamed from: m */
    public String m656m() {
        return Build.VERSION.SDK;
    }

    /* JADX INFO: renamed from: n */
    public String m657n() {
        return Build.TAGS;
    }

    /* JADX INFO: renamed from: o */
    public String m658o() {
        return m643a("ro.kernel.qemu", "0");
    }
}
