package com.alipay.sdk.p010m.p058y;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p012a0.C0084b;
import p067l.C17588;

/* JADX INFO: renamed from: com.alipay.sdk.m.y.d */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0241d {

    /* JADX INFO: renamed from: a */
    public static final String f1147a = "00:00:00:00:00:00";

    /* JADX INFO: renamed from: b */
    public static C0241d f1148b;

    public C0241d(Context context) {
    }

    /* JADX INFO: renamed from: b */
    public static C0241d m1180b(Context context) {
        if (f1148b == null) {
            f1148b = new C0241d(context);
        }
        return f1148b;
    }

    /* JADX INFO: renamed from: a */
    public String m1183a() {
        String strM40053 = C17588.m40053(m1184b(), "|");
        String strM1185c = m1185c();
        return TextUtils.isEmpty(strM1185c) ? C17588.m40053(strM40053, "000000000000000") : C17588.m40053(strM40053, strM1185c);
    }

    /* JADX INFO: renamed from: b */
    public String m1184b() {
        return "000000000000000";
    }

    /* JADX INFO: renamed from: c */
    public String m1185c() {
        return "000000000000000";
    }

    /* JADX INFO: renamed from: d */
    public String m1186d() {
        return f1147a;
    }

    /* JADX INFO: renamed from: d */
    public static EnumC0246i m1182d(Context context) {
        try {
            NetworkInfo networkInfoM449a = C0084b.m449a(null, context);
            if (networkInfoM449a == null || networkInfoM449a.getType() != 0) {
                return (networkInfoM449a == null || networkInfoM449a.getType() != 1) ? EnumC0246i.NONE : EnumC0246i.WIFI;
            }
            return EnumC0246i.m1205a(networkInfoM449a.getSubtype());
        } catch (Exception unused) {
            return EnumC0246i.NONE;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m1181c(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1179a(Context context) {
        return m1180b(context).m1183a().substring(0, 8);
    }
}
