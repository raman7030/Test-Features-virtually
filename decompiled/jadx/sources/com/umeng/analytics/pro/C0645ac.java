package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.material.internal.ManufacturerUtils;

/* JADX INFO: renamed from: com.umeng.analytics.pro.ac */
/* JADX INFO: compiled from: ABL6 */
/* JADX INFO: loaded from: classes.dex */
public class C0645ac {

    /* JADX INFO: renamed from: a */
    public static final String f2228a = "ro.build.version.emui";

    /* JADX INFO: renamed from: b */
    public static final String f2229b = "hw_sc.build.platform.version";

    /* JADX INFO: renamed from: a */
    public static InterfaceC0730z m2132a(Context context) {
        String str = Build.BRAND;
        C0654al.m2141a("Device", "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("huawei") || str.equalsIgnoreCase("honor") || str.equalsIgnoreCase("华为")) {
            return new C0646ad();
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("redmi") || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米") || str.equalsIgnoreCase("blackshark")) {
            return new C0653ak();
        }
        if (str.equalsIgnoreCase("vivo")) {
            return new C0652aj();
        }
        if (str.equalsIgnoreCase("oppo") || str.equalsIgnoreCase("oneplus") || str.equalsIgnoreCase("realme")) {
            return new C0650ah();
        }
        if (str.equalsIgnoreCase("lenovo") || str.equalsIgnoreCase("zuk")) {
            return new C0647ae();
        }
        if (str.equalsIgnoreCase("nubia")) {
            return new C0649ag();
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("SAMSUNG")) {
            return new C0651ai();
        }
        if (m2135b()) {
            return new C0644ab();
        }
        if (m2134a()) {
            return new C0646ad();
        }
        if (str.equalsIgnoreCase(ManufacturerUtils.MEIZU) || str.equalsIgnoreCase("mblu")) {
            return new C0648af();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2134a() {
        return (TextUtils.isEmpty(m2133a("ro.build.version.emui")) && TextUtils.isEmpty(m2133a("hw_sc.build.platform.version"))) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2135b() {
        return !TextUtils.isEmpty(m2133a("ro.coolos.version"));
    }

    /* JADX INFO: renamed from: a */
    public static String m2133a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }
}
