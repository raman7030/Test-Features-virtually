package com.alipay.sdk.p010m.p044q0;

/* JADX INFO: renamed from: com.alipay.sdk.m.q0.g */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0197g {
    /* JADX INFO: renamed from: a */
    public static String m949a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }
}
