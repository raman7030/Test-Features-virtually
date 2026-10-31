package com.alipay.sdk.m.y;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.lang.reflect.Method;
import l.C0881;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: compiled from: N673 */
    public class a {
        public static String a = "0";
        public static String b = "1";
        public static String c = "2";
        public static String d = "3";
    }

    public static String a(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        String str = a.a;
        if (context != null && (activeNetworkInfo = (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null) {
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                return a.b;
            }
            if (type == 1) {
                str = a.c;
                try {
                    boolean z = 1 != ((TelephonyManager) context.getSystemService("phone")).getSimState();
                    boolean z2 = C0881.m3229(context, "android.permission.CHANGE_NETWORK_STATE") == 0;
                    Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", null);
                    declaredMethod.setAccessible(true);
                    Boolean bool = (Boolean) declaredMethod.invoke(connectivityManager, null);
                    if (z && z2 && bool.booleanValue()) {
                        return a.d;
                    }
                } catch (Throwable th) {
                    g.a(th);
                }
            }
        }
        return str;
    }
}
