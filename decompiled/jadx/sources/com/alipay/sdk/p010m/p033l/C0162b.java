package com.alipay.sdk.p010m.p033l;

import com.alipay.sdk.p010m.p058y.C0249l;
import p067l.C10965;

/* JADX INFO: renamed from: com.alipay.sdk.m.l.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0162b {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f548a;

    /* JADX INFO: renamed from: b */
    public static volatile String f549b;

    /* JADX INFO: renamed from: a */
    public static void m730a(String str) {
        f549b = str;
    }

    /* JADX INFO: renamed from: b */
    public static String m732b() {
        EnumC0163c enumC0163cM736a = EnumC0163c.m736a(EnumC0163c.DOUBLE_REQUEST.m741c());
        return m729a(enumC0163cM736a.m741c(), enumC0163cM736a.m739b(), "");
    }

    /* JADX INFO: renamed from: c */
    public static boolean m733c() {
        return f548a;
    }

    /* JADX INFO: renamed from: d */
    public static String m734d() {
        return f549b;
    }

    /* JADX INFO: renamed from: e */
    public static String m735e() {
        EnumC0163c enumC0163cM736a = EnumC0163c.m736a(EnumC0163c.PARAMS_ERROR.m741c());
        return m729a(enumC0163cM736a.m741c(), enumC0163cM736a.m739b(), "");
    }

    /* JADX INFO: renamed from: a */
    public static void m731a(boolean z) {
        f548a = z;
    }

    /* JADX INFO: renamed from: a */
    public static String m728a() {
        EnumC0163c enumC0163cM736a = EnumC0163c.m736a(EnumC0163c.CANCELED.m741c());
        return m729a(enumC0163cM736a.m741c(), enumC0163cM736a.m739b(), "");
    }

    /* JADX INFO: renamed from: a */
    public static String m729a(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder("resultStatus={");
        sb.append(i);
        sb.append("};memo={");
        sb.append(str);
        sb.append("};result={");
        return C10965.m25286(sb, str2, C0249l.f1198d);
    }
}
