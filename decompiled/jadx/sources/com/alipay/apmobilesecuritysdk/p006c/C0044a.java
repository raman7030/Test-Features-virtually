package com.alipay.apmobilesecuritysdk.p006c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.alipay.apmobilesecuritysdk.p008e.C0060h;
import com.alipay.sdk.p010m.p026h0.C0138a;
import com.alipay.sdk.p010m.p026h0.C0139b;
import com.alipay.sdk.p010m.p026h0.C0141d;
import com.alipay.sdk.p010m.p034l0.InterfaceC0165a;
import com.amazonaws.auth.AWS4Signer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import p067l.C17588;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.c.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0044a {
    /* JADX INFO: renamed from: a */
    public static String m289a() {
        return C17588.m40053(new SimpleDateFormat(AWS4Signer.DATE_PATTERN).format(Calendar.getInstance().getTime()), ".log");
    }

    /* JADX INFO: renamed from: a */
    public static void m290a(Context context, InterfaceC0165a interfaceC0165a) {
        if (m294a(context) && C0060h.m350c(context)) {
            new C0139b(context.getFilesDir().getAbsolutePath() + "/log/ap", interfaceC0165a).m688a(context);
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m291a(Context context, String str, String str2, String str3) {
        C0141d.m690a(context.getFilesDir().getAbsolutePath() + "/log/ap", m289a(), m295b(context, str, str2, str3).toString());
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m292a(String str) {
        C0141d.m689a(str);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m293a(Throwable th) {
        C0141d.m691a(th);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m294a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }

    /* JADX INFO: renamed from: b */
    public static C0138a m295b(Context context, String str, String str2, String str3) {
        String packageName;
        try {
            packageName = context.getPackageName();
        } catch (Throwable unused) {
            packageName = "";
        }
        return new C0138a(Build.MODEL, packageName, "APPSecuritySDK-ALIPAYSDK", "3.4.0.202507280853", str, str2, str3);
    }
}
