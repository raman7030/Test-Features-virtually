package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.material.internal.ManufacturerUtils;

/* JADX INFO: compiled from: ABL6 */
/* JADX INFO: loaded from: classes.dex */
public class ac {
    public static final String a = "ro.build.version.emui";
    public static final String b = "hw_sc.build.platform.version";

    public static z a(Context context) {
        String str = Build.BRAND;
        al.a("Device", "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("huawei") || str.equalsIgnoreCase("honor") || str.equalsIgnoreCase("华为")) {
            return new ad();
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("redmi") || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米") || str.equalsIgnoreCase("blackshark")) {
            return new ak();
        }
        if (str.equalsIgnoreCase("vivo")) {
            return new aj();
        }
        if (str.equalsIgnoreCase("oppo") || str.equalsIgnoreCase("oneplus") || str.equalsIgnoreCase("realme")) {
            return new ah();
        }
        if (str.equalsIgnoreCase("lenovo") || str.equalsIgnoreCase("zuk")) {
            return new ae();
        }
        if (str.equalsIgnoreCase("nubia")) {
            return new ag();
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("SAMSUNG")) {
            return new ai();
        }
        if (b()) {
            return new ab();
        }
        if (a()) {
            return new ad();
        }
        if (str.equalsIgnoreCase(ManufacturerUtils.MEIZU) || str.equalsIgnoreCase("mblu")) {
            return new af();
        }
        return null;
    }

    public static boolean a() {
        return (TextUtils.isEmpty(a("ro.build.version.emui")) && TextUtils.isEmpty(a("hw_sc.build.platform.version"))) ? false : true;
    }

    public static boolean b() {
        return !TextUtils.isEmpty(a("ro.coolos.version"));
    }

    public static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }
}
