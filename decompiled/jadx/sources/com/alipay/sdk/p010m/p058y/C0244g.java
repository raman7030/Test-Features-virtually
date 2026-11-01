package com.alipay.sdk.p010m.p058y;

import com.alipay.sdk.interior.Log;
import com.alipay.sdk.p010m.p039o.C0180b;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p067l.C21459;
import p067l.C9179;

/* JADX INFO: renamed from: com.alipay.sdk.m.y.g */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0244g {

    /* JADX INFO: renamed from: a */
    public static Log.ISdkLogCallback f1149a = null;

    /* JADX INFO: renamed from: b */
    public static final String f1150b = "alipaysdk";

    /* JADX INFO: renamed from: a */
    public static void m1196a(Log.ISdkLogCallback iSdkLogCallback) {
        f1149a = iSdkLogCallback;
    }

    /* JADX INFO: renamed from: b */
    public static void m1201b(String str, String str2) {
        m1197a(m1195a(str, str2));
    }

    /* JADX INFO: renamed from: c */
    public static void m1202c(String str, String str2) {
        m1197a(m1195a(str, str2));
    }

    /* JADX INFO: renamed from: d */
    public static void m1203d(String str, String str2) {
        m1197a(m1195a(str, str2));
    }

    /* JADX INFO: renamed from: e */
    public static void m1204e(String str, String str2) {
        m1197a(m1195a(str, str2));
    }

    /* JADX INFO: renamed from: a */
    public static void m1197a(String str) {
        try {
            Log.ISdkLogCallback iSdkLogCallback = f1149a;
            if (iSdkLogCallback != null) {
                if (C0180b.m829i().m854g(null)) {
                    iSdkLogCallback.onLogLine("[AlipaySDK] " + str);
                } else {
                    iSdkLogCallback.onLogLine("[AlipaySDK] " + new SimpleDateFormat("hh:mm:ss.SSS", Locale.getDefault()).format(new Date()) + " " + str);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m1200b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: renamed from: a */
    public static void m1198a(String str, String str2, Throwable th) {
        StringBuilder sbM21133 = C9179.m21133(m1195a(str, str2), " ");
        sbM21133.append(m1200b(th));
        m1197a(sbM21133.toString());
    }

    /* JADX INFO: renamed from: a */
    public static void m1199a(Throwable th) {
        if (th == null) {
            return;
        }
        try {
            m1197a(m1200b(th));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1195a(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        return !C0180b.m829i().m854g(null) ? C21459.m48622("[", str, "][", str2, "]") : C21459.m48622("[", str, "][", str2, "]");
    }
}
