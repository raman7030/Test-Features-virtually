package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C0714j;
import com.umeng.common.C0744b;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class AnalyticsConfig {
    public static boolean CATCH_EXCEPTION = false;
    public static boolean CHANGE_CATCH_EXCEPTION_NOTALLOW = true;
    public static boolean CLEAR_EKV_BL = false;
    public static boolean CLEAR_EKV_WL = false;
    public static final String DEBUG_KEY = "debugkey";
    public static final String DEBUG_MODE_PERIOD = "sendaging";
    public static String GPU_RENDERER = "";
    public static String GPU_VENDER = "";
    public static final String RTD_PERIOD = "period";
    public static final String RTD_SP_FILE = "um_rtd_conf";
    public static final String RTD_START_TIME = "startTime";

    /* JADX INFO: renamed from: a */
    public static double[] f2144a = null;

    /* JADX INFO: renamed from: b */
    public static String f2145b = null;

    /* JADX INFO: renamed from: c */
    public static String f2146c = null;

    /* JADX INFO: renamed from: d */
    public static String f2147d = null;

    /* JADX INFO: renamed from: e */
    public static int f2148e = 0;
    public static boolean enable = true;

    /* JADX INFO: renamed from: f */
    public static Object f2149f = new Object();

    /* JADX INFO: renamed from: g */
    public static boolean f2150g = false;

    /* JADX INFO: renamed from: h */
    public static String f2151h = "";
    public static long kContinueSessionMillis = 30000;
    public static String mWrapperType;
    public static String mWrapperVersion;

    public static void turnOnRealTimeDebug(Map map) {
        synchronized (f2149f) {
            f2150g = true;
            if (map != null && map.containsKey(DEBUG_KEY)) {
                f2151h = (String) map.get(DEBUG_KEY);
            }
        }
    }

    public static void turnOffRealTimeDebug() {
        synchronized (f2149f) {
            f2150g = false;
            f2151h = "";
        }
    }

    public static boolean isRealTimeDebugMode() {
        boolean z;
        synchronized (f2149f) {
            z = f2150g;
        }
        return z;
    }

    public static String getRealTimeDebugKey() {
        String str;
        synchronized (f2149f) {
            str = f2151h;
        }
        return str;
    }

    /* JADX INFO: renamed from: a */
    public static void m2048a(String str) {
        f2146c = str;
    }

    public static String getAppkey(Context context) {
        return UMUtils.getAppkey(context);
    }

    public static String getChannel(Context context) {
        return UMUtils.getChannel(context);
    }

    public static double[] getLocation() {
        return f2144a;
    }

    /* JADX INFO: renamed from: a */
    public static void m2047a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            f2147d = str;
            C0744b.m2703a(context).m2709a(f2147d);
        } else {
            UMLog.m2750aq(C0714j.f2766A, 0, "\\|");
        }
    }

    public static String getSecretKey(Context context) {
        if (TextUtils.isEmpty(f2147d)) {
            f2147d = C0744b.m2703a(context).m2713c();
        }
        return f2147d;
    }

    /* JADX INFO: renamed from: a */
    public static void m2046a(Context context, int i) {
        f2148e = i;
        C0744b.m2703a(context).m2708a(f2148e);
    }

    public static int getVerticalType(Context context) {
        if (f2148e == 0) {
            f2148e = C0744b.m2703a(context).m2714d();
        }
        return f2148e;
    }

    public static String getGameSdkVersion(Context context) {
        try {
            Class<?> cls = Class.forName("com.umeng.analytics.game.GameSdkVersion");
            return (String) cls.getDeclaredField("SDK_VERSION").get(cls);
        } catch (Throwable unused) {
            return null;
        }
    }
}
