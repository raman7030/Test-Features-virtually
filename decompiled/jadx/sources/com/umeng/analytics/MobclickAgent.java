package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C0714j;
import com.umeng.common.ISysListener;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class MobclickAgent {

    public enum PageMode {
        AUTO,
        MANUAL,
        LEGACY_AUTO,
        LEGACY_MANUAL
    }

    public static void enableEncrypt(boolean z) {
    }

    public static void setCheckDevice(boolean z) {
    }

    public static void setDebugMode(boolean z) {
    }

    public static void setLatencyWindow(long j) {
    }

    public static void setScenarioType(Context context, EScenarioType eScenarioType) {
    }

    public static void init(Context context) {
        C0636b.m2050a().m2058a(context);
    }

    public static void setLocation(double d, double d2) {
        C0636b.m2050a().m2056a(d, d2);
    }

    public static void setCatchUncaughtExceptions(boolean z) {
        C0636b.m2050a().m2076a(z);
    }

    public static void setSecret(Context context, String str) {
        C0636b.m2050a().m2084c(context, str);
    }

    public static void setSessionContinueMillis(long j) {
        if (j <= 30000) {
            j = 30000;
        }
        C0636b.m2050a().m2057a(j);
    }

    public static C0636b getAgent() {
        return C0636b.m2050a();
    }

    public static void setOpenGLContext(GL10 gl10) {
        C0636b.m2050a().m2075a(gl10);
    }

    public static void setPageCollectionMode(PageMode pageMode) {
        UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION = pageMode;
    }

    public static void onPageStart(String str) {
        if (!TextUtils.isEmpty(str)) {
            C0636b.m2050a().m2072a(str);
        } else {
            UMLog.m2750aq(C0714j.f2768C, 0, "\\|");
        }
    }

    public static void onPageEnd(String str) {
        if (!TextUtils.isEmpty(str)) {
            C0636b.m2050a().m2081b(str);
        } else {
            UMLog.m2750aq(C0714j.f2769D, 0, "\\|");
        }
    }

    public static void onPause(Context context) {
        C0636b.m2050a().m2083c(context);
    }

    public static void onResume(Context context) {
        if (context == null) {
            UMLog.m2750aq(C0714j.f2823n, 0, "\\|");
        } else {
            C0636b.m2050a().m2078b(context);
        }
    }

    public static void reportError(Context context, String str) {
        try {
            Class<?> cls = Class.forName("com.umeng.umcrash.UMCrash");
            Method declaredMethod = cls.getDeclaredMethod("generateCustomLog", String.class, String.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(cls, str, "DEFAULT");
            }
        } catch (Throwable unused) {
        }
    }

    public static void reportError(Context context, Throwable th) {
        try {
            Class<?> cls = Class.forName("com.umeng.umcrash.UMCrash");
            Method declaredMethod = cls.getDeclaredMethod("generateCustomLog", Throwable.class, String.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(cls, th, "DEFAULT");
            }
        } catch (Throwable unused) {
        }
    }

    public static void onEvent(Context context, String str) {
        C0636b.m2050a().m2063a(context, str, (String) null, -1L, 1);
    }

    public static void onEvent(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            UMLog.m2750aq(C0714j.f2820k, 0, "\\|");
        } else {
            C0636b.m2050a().m2063a(context, str, str2, -1L, 1);
        }
    }

    public static void onEvent(Context context, String str, Map map) {
        if (map == null) {
            UMLog.m2750aq(C0714j.f2792a, 0, "\\|");
        } else {
            C0636b.m2050a().m2066a(context, str, new HashMap(map), -1L);
        }
    }

    public static void onEventObject(Context context, String str, Map map) {
        if (map == null) {
            UMLog.m2750aq(C0714j.f2792a, 0, "\\|");
        } else {
            C0636b.m2050a().m2066a(context, str, map, -1L);
        }
    }

    public static void onEventValue(Context context, String str, Map map, int i) {
        HashMap map2;
        if (map == null) {
            map2 = new HashMap();
        } else {
            map2 = new HashMap(map);
        }
        map2.put("__ct__", Integer.valueOf(i));
        C0636b.m2050a().m2066a(context, str, map2, -1L);
    }

    public static void onKillProcess(Context context) {
        C0636b.m2050a().m2086d(context);
    }

    public static void onProfileSignIn(String str) {
        onProfileSignIn("_adhoc", str);
    }

    public static void onProfileSignIn(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            UMLog.m2750aq(C0714j.f2829t, 0, "\\|");
            return;
        }
        if (str2.length() > 64) {
            UMLog.m2750aq(C0714j.f2830u, 0, "\\|");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            C0636b.m2050a().m2073a("_adhoc", str2);
        } else if (str.length() > 32) {
            UMLog.m2750aq(C0714j.f2831v, 0, "\\|");
        } else {
            C0636b.m2050a().m2073a(str, str2);
        }
    }

    public static void onProfileSignOff() {
        C0636b.m2050a().m2099j();
    }

    public enum EScenarioType {
        E_UM_NORMAL(0),
        E_UM_GAME(1);


        /* JADX INFO: renamed from: a */
        public int f2157a;

        EScenarioType(int i) {
            this.f2157a = i;
        }

        public int toValue() {
            return this.f2157a;
        }
    }

    public static void setFirstLaunchEvent(Context context, List list) {
        getAgent().m2068a(context, list);
    }

    public static void registerPreProperties(Context context, JSONObject jSONObject) {
        getAgent().m2069a(context, jSONObject);
    }

    public static void unregisterPreProperty(Context context, String str) {
        getAgent().m2093f(context, str);
    }

    public static void clearPreProperties(Context context) {
        getAgent().m2095g(context);
    }

    public static JSONObject getPreProperties(Context context) {
        return getAgent().m2096h(context);
    }

    public static void disableExceptionCatch() {
        C0636b.m2050a().m2076a(false);
        AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW = true;
    }

    public static void setGameScenarioType(Context context) {
        C0636b.m2050a().m2060a(context, EScenarioType.E_UM_GAME);
    }

    public static void disable() {
        AnalyticsConfig.enable = false;
    }

    public static void setSysListener(ISysListener iSysListener) {
        C0636b.m2050a().m2070a(iSysListener);
    }

    public static void onGKVEvent(Context context, String str, HashMap map) {
        C0636b.m2050a().m2064a(context, str, map);
    }
}
