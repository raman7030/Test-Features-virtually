package com.alipay.apmobilesecuritysdk.p008e;

import android.content.Context;
import com.alipay.sdk.p010m.p018d0.C0106a;
import com.alipay.sdk.p010m.p020e0.C0110b;
import com.alipay.sdk.p010m.p024g0.C0131a;
import com.alipay.sdk.p010m.p024g0.C0135e;
import java.util.UUID;
import p067l.C21466;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.e.h */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0060h {

    /* JADX INFO: renamed from: a */
    public static String f184a = "";

    /* JADX INFO: renamed from: a */
    public static long m342a(Context context) {
        String strM359i = m359i(context, "update_time_interval");
        if (C0106a.m567b(strM359i)) {
            try {
                return Long.parseLong(strM359i);
            } catch (Exception unused) {
            }
        }
        return 86400000L;
    }

    /* JADX INFO: renamed from: a */
    public static void m343a(Context context, String str) {
        m345a(context, "update_time_interval", str);
    }

    /* JADX INFO: renamed from: a */
    public static void m344a(Context context, String str, long j) {
        C0131a.m670a(context, "vkeyid_settings", C21466.m48631("vkey_valid", str), j + "");
    }

    /* JADX INFO: renamed from: a */
    public static void m345a(Context context, String str, String str2) {
        C0131a.m670a(context, "vkeyid_settings", str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static void m346a(Context context, boolean z) {
        m345a(context, "log_switch", z ? "1" : "0");
    }

    /* JADX INFO: renamed from: b */
    public static String m347b(Context context) {
        return m359i(context, "last_apdid_env");
    }

    /* JADX INFO: renamed from: b */
    public static void m348b(Context context, String str) {
        m345a(context, "last_machine_boot_time", str);
    }

    /* JADX INFO: renamed from: c */
    public static void m349c(Context context, String str) {
        m345a(context, "last_apdid_env", str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m350c(Context context) {
        String strM359i = m359i(context, "log_switch");
        return strM359i != null && "1".equals(strM359i);
    }

    /* JADX INFO: renamed from: d */
    public static String m351d(Context context) {
        return m359i(context, "dynamic_key");
    }

    /* JADX INFO: renamed from: d */
    public static void m352d(Context context, String str) {
        m345a(context, "agent_switch", str);
    }

    /* JADX INFO: renamed from: e */
    public static String m353e(Context context) {
        return m359i(context, "apse_degrade");
    }

    /* JADX INFO: renamed from: e */
    public static void m354e(Context context, String str) {
        m345a(context, "dynamic_key", str);
    }

    /* JADX INFO: renamed from: f */
    public static String m355f(Context context) {
        String str;
        synchronized (C0060h.class) {
            if (C0106a.m564a(f184a)) {
                String strM679b = C0135e.m679b(context, "alipay_vkey_random", "random", "");
                f184a = strM679b;
                if (C0106a.m564a(strM679b)) {
                    String strM582a = C0110b.m582a(UUID.randomUUID().toString());
                    f184a = strM582a;
                    C0135e.m677a(context, "alipay_vkey_random", "random", strM582a);
                }
            }
            str = f184a;
        }
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static void m356f(Context context, String str) {
        m345a(context, "webrtc_url", str);
    }

    /* JADX INFO: renamed from: g */
    public static void m357g(Context context, String str) {
        m345a(context, "apse_degrade", str);
    }

    /* JADX INFO: renamed from: h */
    public static long m358h(Context context, String str) {
        try {
            String strM669a = C0131a.m669a(context, "vkeyid_settings", "vkey_valid" + str);
            if (C0106a.m564a(strM669a)) {
                return 0L;
            }
            return Long.parseLong(strM669a);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m359i(Context context, String str) {
        return C0131a.m669a(context, "vkeyid_settings", str);
    }
}
