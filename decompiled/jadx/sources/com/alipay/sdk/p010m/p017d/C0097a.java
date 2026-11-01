package com.alipay.sdk.p010m.p017d;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p015c.InterfaceC0089b;
import com.alipay.sdk.p010m.p019e.C0108a;
import com.google.android.material.internal.ManufacturerUtils;

/* JADX INFO: renamed from: com.alipay.sdk.m.d.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0097a {

    /* JADX INFO: renamed from: a */
    public static final String f438a = "ro.build.version.emui";

    /* JADX INFO: renamed from: b */
    public static final String f439b = "hw_sc.build.platform.version";

    /* JADX INFO: renamed from: a */
    public static InterfaceC0089b m555a(Context context) {
        String str = Build.BRAND;
        C0108a.m577b("Device", "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("huawei") || str.equalsIgnoreCase("honor") || str.equalsIgnoreCase("华为")) {
            return new C0098b();
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("redmi") || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米") || str.equalsIgnoreCase("blackshark")) {
            return new C0105i();
        }
        if (str.equalsIgnoreCase("vivo")) {
            return new C0104h();
        }
        if (str.equalsIgnoreCase("oppo") || str.equalsIgnoreCase("oneplus") || str.equalsIgnoreCase("realme")) {
            return new C0102f();
        }
        if (str.equalsIgnoreCase("lenovo") || str.equalsIgnoreCase("zuk")) {
            return new C0099c();
        }
        if (str.equalsIgnoreCase("nubia")) {
            return new C0101e();
        }
        if (str.equalsIgnoreCase(ManufacturerUtils.SAMSUNG)) {
            return new C0103g();
        }
        if (m557a()) {
            return new C0098b();
        }
        if (str.equalsIgnoreCase(ManufacturerUtils.MEIZU) || str.equalsIgnoreCase("mblu")) {
            return new C0100d();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m557a() {
        return (TextUtils.isEmpty(m556a("ro.build.version.emui")) && TextUtils.isEmpty(m556a("hw_sc.build.platform.version"))) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static String m556a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }
}
