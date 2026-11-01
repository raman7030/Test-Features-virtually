package com.alipay.sdk.p010m.p058y;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.lang.reflect.Method;
import p067l.C0886;

/* JADX INFO: renamed from: com.alipay.sdk.m.y.j */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0247j {

    /* JADX INFO: renamed from: com.alipay.sdk.m.y.j$a */
    /* JADX INFO: compiled from: N673 */
    public class a {

        /* JADX INFO: renamed from: a */
        public static String f1171a = "0";

        /* JADX INFO: renamed from: b */
        public static String f1172b = "1";

        /* JADX INFO: renamed from: c */
        public static String f1173c = "2";

        /* JADX INFO: renamed from: d */
        public static String f1174d = "3";
    }

    /* JADX INFO: renamed from: a */
    public static String m1209a(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        String str = a.f1171a;
        if (context != null && (activeNetworkInfo = (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null) {
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                return a.f1172b;
            }
            if (type == 1) {
                str = a.f1173c;
                try {
                    boolean z = 1 != ((TelephonyManager) context.getSystemService("phone")).getSimState();
                    boolean z2 = C0886.m5543(context, "android.permission.CHANGE_NETWORK_STATE") == 0;
                    Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", null);
                    declaredMethod.setAccessible(true);
                    Boolean bool = (Boolean) declaredMethod.invoke(connectivityManager, null);
                    if (z && z2 && bool.booleanValue()) {
                        return a.f1174d;
                    }
                } catch (Throwable th) {
                    C0244g.m1199a(th);
                }
            }
        }
        return str;
    }
}
