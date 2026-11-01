package com.alipay.apmobilesecuritysdk.p008e;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p006c.C0044a;
import com.alipay.sdk.p010m.p018d0.C0106a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.e.i */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0061i {

    /* JADX INFO: renamed from: a */
    public static String f185a = "";

    /* JADX INFO: renamed from: b */
    public static String f186b = "";

    /* JADX INFO: renamed from: c */
    public static String f187c = "";

    /* JADX INFO: renamed from: d */
    public static String f188d = "";

    /* JADX INFO: renamed from: e */
    public static String f189e = "";

    /* JADX INFO: renamed from: f */
    public static Map f190f = new HashMap();

    /* JADX INFO: renamed from: a */
    public static synchronized String m360a(String str) {
        String str2 = "apdidTokenCache" + str;
        if (f190f.containsKey(str2)) {
            String str3 = (String) f190f.get(str2);
            if (C0106a.m567b(str3)) {
                return str3;
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m361a() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m362a(C0054b c0054b) {
        if (c0054b != null) {
            m367b(c0054b.f171a);
            m369c(c0054b.f172b);
            m371d(c0054b.f173c);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m363a(C0055c c0055c) {
        if (c0055c != null) {
            m367b(c0055c.f174a);
            m369c(c0055c.f175b);
            m373e(c0055c.f177d);
            m375f(c0055c.f178e);
            m371d(c0055c.f176c);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m364a(String str, String str2) {
        String str3 = "apdidTokenCache" + str;
        if (f190f.containsKey(str3)) {
            f190f.remove(str3);
        }
        f190f.put(str3, str2);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m365a(Context context, String str) {
        long jM342a;
        try {
            jM342a = C0060h.m342a(context);
            if (jM342a < 0) {
                jM342a = 86400000;
            }
        } catch (Throwable unused) {
        }
        try {
            if (Math.abs(System.currentTimeMillis() - C0060h.m358h(context, str)) < jM342a) {
                return true;
            }
        } catch (Throwable th) {
            C0044a.m293a(th);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m366b() {
        return f185a;
    }

    /* JADX INFO: renamed from: b */
    public static void m367b(String str) {
        f185a = str;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized String m368c() {
        return f186b;
    }

    /* JADX INFO: renamed from: c */
    public static void m369c(String str) {
        f186b = str;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized String m370d() {
        return f188d;
    }

    /* JADX INFO: renamed from: d */
    public static void m371d(String str) {
        f187c = str;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized String m372e() {
        return f189e;
    }

    /* JADX INFO: renamed from: e */
    public static void m373e(String str) {
        f188d = str;
    }

    /* JADX INFO: renamed from: f */
    public static synchronized String m374f() {
        return f187c;
    }

    /* JADX INFO: renamed from: f */
    public static void m375f(String str) {
        f189e = str;
    }

    /* JADX INFO: renamed from: g */
    public static synchronized C0055c m376g() {
        return new C0055c(f185a, f186b, f187c, f188d, f189e);
    }

    /* JADX INFO: renamed from: h */
    public static void m377h() {
        f190f.clear();
        f185a = "";
        f186b = "";
        f188d = "";
        f189e = "";
        f187c = "";
    }
}
