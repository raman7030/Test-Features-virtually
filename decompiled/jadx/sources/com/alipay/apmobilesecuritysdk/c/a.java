package com.alipay.apmobilesecuritysdk.c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.alipay.apmobilesecuritysdk.e.h;
import com.alipay.sdk.m.h0.d;
import com.amazonaws.auth.AWS4Signer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import l.C16014;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static String a() {
        return C16014.m37867(new SimpleDateFormat(AWS4Signer.DATE_PATTERN).format(Calendar.getInstance().getTime()), ".log");
    }

    public static void a(Context context, com.alipay.sdk.m.l0.a aVar) {
        if (a(context) && h.c(context)) {
            new com.alipay.sdk.m.h0.b(context.getFilesDir().getAbsolutePath() + "/log/ap", aVar).a(context);
        }
    }

    public static synchronized void a(Context context, String str, String str2, String str3) {
        d.a(context.getFilesDir().getAbsolutePath() + "/log/ap", a(), b(context, str, str2, str3).toString());
    }

    public static synchronized void a(String str) {
        d.a(str);
    }

    public static synchronized void a(Throwable th) {
        d.a(th);
    }

    public static boolean a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }

    public static com.alipay.sdk.m.h0.a b(Context context, String str, String str2, String str3) {
        String packageName;
        try {
            packageName = context.getPackageName();
        } catch (Throwable unused) {
            packageName = "";
        }
        return new com.alipay.sdk.m.h0.a(Build.MODEL, packageName, "APPSecuritySDK-ALIPAYSDK", "3.4.0.202507280853", str, str2, str3);
    }
}
