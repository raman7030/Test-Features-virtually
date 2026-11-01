package com.umeng.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.rosan.dhizuku.shared.DhizukuVariables;
import com.umeng.analytics.filter.C0638a;
import com.umeng.analytics.filter.C0639b;
import com.umeng.analytics.pro.C0708d;
import com.umeng.analytics.pro.C0713i;
import com.umeng.analytics.pro.C0714j;
import com.umeng.analytics.pro.C0715k;
import com.umeng.analytics.pro.C0716l;
import com.umeng.analytics.pro.C0717m;
import com.umeng.analytics.pro.C0719o;
import com.umeng.analytics.pro.C0720p;
import com.umeng.analytics.pro.C0723s;
import com.umeng.analytics.pro.C0725u;
import com.umeng.analytics.pro.C0726v;
import com.umeng.analytics.pro.C0729y;
import com.umeng.analytics.pro.InterfaceC0718n;
import com.umeng.analytics.pro.InterfaceC0724t;
import com.umeng.common.ISysListener;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.C0832d;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.microedition.khronos.opengles.GL10;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.analytics.b */
/* JADX INFO: compiled from: A69W */
/* JADX INFO: loaded from: classes.dex */
public class C0636b implements InterfaceC0718n, InterfaceC0724t {

    /* JADX INFO: renamed from: A */
    public static final String f2167A = "umsp_2";

    /* JADX INFO: renamed from: B */
    public static final String f2168B = "umsp_3";

    /* JADX INFO: renamed from: C */
    public static final String f2169C = "umsp_4";

    /* JADX INFO: renamed from: D */
    public static final String f2170D = "umsp_5";

    /* JADX INFO: renamed from: a */
    public static Context f2171a = null;

    /* JADX INFO: renamed from: h */
    public static final String f2172h = "sp_uapp";

    /* JADX INFO: renamed from: i */
    public static final String f2173i = "prepp_uapp";

    /* JADX INFO: renamed from: o */
    public static final int f2174o = 128;

    /* JADX INFO: renamed from: p */
    public static final int f2175p = 256;

    /* JADX INFO: renamed from: q */
    public static String f2176q = "";

    /* JADX INFO: renamed from: r */
    public static String f2177r = "";

    /* JADX INFO: renamed from: s */
    public static final String f2178s = "ekv_bl";

    /* JADX INFO: renamed from: t */
    public static final String f2179t = "ekv_bl_ver";

    /* JADX INFO: renamed from: v */
    public static final String f2180v = "ekv_wl";

    /* JADX INFO: renamed from: w */
    public static final String f2181w = "ekv_wl_ver";

    /* JADX INFO: renamed from: z */
    public static final String f2182z = "umsp_1";

    /* JADX INFO: renamed from: b */
    public ISysListener f2183b;

    /* JADX INFO: renamed from: c */
    public C0720p f2184c;

    /* JADX INFO: renamed from: d */
    public C0726v f2185d;

    /* JADX INFO: renamed from: e */
    public C0715k f2186e;

    /* JADX INFO: renamed from: f */
    public C0725u f2187f;

    /* JADX INFO: renamed from: g */
    public C0716l f2188g;

    /* JADX INFO: renamed from: j */
    public boolean f2189j;

    /* JADX INFO: renamed from: k */
    public volatile JSONObject f2190k;

    /* JADX INFO: renamed from: l */
    public volatile JSONObject f2191l;

    /* JADX INFO: renamed from: m */
    public volatile JSONObject f2192m;

    /* JADX INFO: renamed from: n */
    public boolean f2193n;

    /* JADX INFO: renamed from: u */
    public C0638a f2194u;

    /* JADX INFO: renamed from: x */
    public C0639b f2195x;

    /* JADX INFO: renamed from: y */
    public C0717m f2196y;

    /* JADX INFO: renamed from: k */
    public synchronized void m2100k() {
        try {
            Context context = f2171a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.m2947e("unregisterSuperPropertyByCoreProtocol can not be called in child process");
                return;
            }
            if (this.f2190k != null) {
                SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(f2171a).edit();
                editorEdit.putString(f2172h, this.f2190k.toString());
                editorEdit.commit();
            } else {
                this.f2190k = new JSONObject();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: l */
    public synchronized JSONObject m2101l() {
        Context context = f2171a;
        if (context == null) {
            return null;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m2947e("getSuperPropertiesJSONObject can not be called in child process");
            return null;
        }
        if (this.f2190k == null) {
            this.f2190k = new JSONObject();
        }
        return this.f2190k;
    }

    /* JADX INFO: renamed from: m */
    public synchronized void m2102m() {
        try {
            Context context = f2171a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m2947e("clearSuperPropertiesByCoreProtocol can not be called in child process");
                } else {
                    SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(f2171a).edit();
                    editorEdit.remove(f2172h);
                    editorEdit.commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    static {
        Context appContext = UMGlobalContext.getAppContext();
        if (appContext != null) {
            f2171a = appContext.getApplicationContext();
        }
    }

    public C0636b() {
        this.f2184c = new C0720p();
        this.f2185d = new C0726v();
        this.f2186e = new C0715k();
        this.f2187f = C0725u.m2637a();
        this.f2188g = null;
        this.f2189j = false;
        this.f2190k = null;
        this.f2191l = null;
        this.f2192m = null;
        this.f2193n = false;
        this.f2194u = null;
        this.f2195x = null;
        this.f2196y = null;
        this.f2184c.m2609a(this);
    }

    /* JADX INFO: renamed from: com.umeng.analytics.b$a */
    /* JADX INFO: compiled from: A69W */
    public class a {

        /* JADX INFO: renamed from: a */
        public static final C0636b f2197a = new C0636b();
    }

    /* JADX INFO: renamed from: a */
    public static C0636b m2050a() {
        return a.f2197a;
    }

    /* JADX INFO: renamed from: a */
    public void m2058a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f2171a == null) {
                f2171a = context.getApplicationContext();
            }
            if (this.f2194u == null) {
                C0638a c0638a = new C0638a("ekv_bl", "ekv_bl_ver");
                this.f2194u = c0638a;
                c0638a.register(f2171a);
            }
            if (this.f2195x == null) {
                C0639b c0639b = new C0639b("ekv_wl", "ekv_wl_ver");
                this.f2195x = c0639b;
                c0639b.register(f2171a);
            }
            if (UMUtils.isMainProgress(f2171a)) {
                if (!this.f2189j) {
                    this.f2189j = true;
                    m2055i(f2171a);
                }
                synchronized (this) {
                    if (!this.f2193n) {
                        C0716l c0716lM2517a = C0716l.m2517a(context);
                        this.f2188g = c0716lM2517a;
                        if (c0716lM2517a.m2535a()) {
                            this.f2193n = true;
                        }
                        this.f2196y = C0717m.m2540a();
                        try {
                            C0717m.m2541a(context);
                            this.f2196y.m2546a(this);
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (UMConfigure.isDebugLog()) {
                    UMLog.mutlInfo(C0714j.f2767B, 3, "", null, null);
                }
                UMWorkDispatch.registerConnStateObserver(CoreProtocol.getInstance(f2171a));
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: i */
    private void m2055i(Context context) {
        try {
            if (context == null) {
                MLog.m2947e("unexpected null context in getNativeSuperProperties");
                return;
            }
            if (f2171a == null) {
                f2171a = context.getApplicationContext();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (this.f2190k == null) {
                this.f2190k = new JSONObject();
            }
            if (this.f2191l == null) {
                this.f2191l = new JSONObject();
            }
            String string = sharedPreferences.getString(f2173i, null);
            if (!TextUtils.isEmpty(string)) {
                try {
                    this.f2192m = new JSONObject(string);
                } catch (JSONException unused) {
                }
            }
            if (this.f2192m == null) {
                this.f2192m = new JSONObject();
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m2077b() {
        return this.f2190k;
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m2082c() {
        return this.f2192m;
    }

    /* JADX INFO: renamed from: d */
    public JSONObject m2085d() {
        return this.f2191l;
    }

    /* JADX INFO: renamed from: e */
    public void m2090e() {
        this.f2191l = null;
    }

    /* JADX INFO: renamed from: a */
    public void m2072a(String str) {
        if (!UMUtils.isMainProgress(f2171a)) {
            MLog.m2947e("onPageStart can not be called in child process");
            return;
        }
        try {
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_AUTO) {
                this.f2185d.m2658a(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2081b(String str) {
        if (!UMUtils.isMainProgress(f2171a)) {
            MLog.m2947e("onPageEnd can not be called in child process");
            return;
        }
        try {
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_AUTO) {
                this.f2185d.m2660b(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2070a(ISysListener iSysListener) {
        if (!UMUtils.isMainProgress(f2171a)) {
            MLog.m2947e("setSysListener can not be called in child process");
        } else {
            this.f2183b = iSysListener;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2059a(Context context, int i) {
        if (context == null) {
            MLog.m2947e("unexpected null context in setVerticalType");
            return;
        }
        if (f2171a == null) {
            f2171a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f2171a)) {
            MLog.m2947e("setVerticalType can not be called in child process");
            return;
        }
        if (!this.f2189j || !this.f2193n) {
            m2058a(f2171a);
        }
        AnalyticsConfig.m2046a(f2171a, i);
    }

    /* JADX INFO: renamed from: f */
    public String m2091f() {
        if (!UMUtils.isMainProgress(f2171a)) {
            MLog.m2947e("getOnResumedActivityName can not be called in child process");
            return null;
        }
        return f2176q;
    }

    /* JADX INFO: renamed from: g */
    public String m2094g() {
        if (!UMUtils.isMainProgress(f2171a)) {
            MLog.m2947e("getOnPausedActivityName can not be called in child process");
            return null;
        }
        return f2177r;
    }

    /* JADX INFO: renamed from: b */
    public void m2078b(Context context) {
        if (context == null) {
            MLog.m2947e("unexpected null context in onResume");
            return;
        }
        if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
            return;
        }
        if (f2171a == null) {
            f2171a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f2171a)) {
            MLog.m2947e("onResume can not be called in child process");
            return;
        }
        if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
            UMLog.m2750aq(C0714j.f2824o, 2, "\\|");
        }
        try {
            if (!this.f2189j || !this.f2193n) {
                m2058a(context);
            }
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_MANUAL) {
                this.f2186e.m2658a(context.getClass().getName());
            }
            m2097h();
            if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
                f2176q = context.getClass().getName();
            }
        } catch (Throwable th) {
            MLog.m2949e("Exception occurred in Mobclick.onResume(). ", th);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2083c(Context context) {
        if (context == null) {
            UMLog.m2750aq(C0714j.f2825p, 0, "\\|");
            return;
        }
        if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
            return;
        }
        if (f2171a == null) {
            f2171a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f2171a)) {
            MLog.m2947e("onPause can not be called in child process");
            return;
        }
        if (UMConfigure.isDebugLog() && !(context instanceof Activity)) {
            UMLog.m2750aq(C0714j.f2826q, 2, "\\|");
        }
        try {
            if (!this.f2189j || !this.f2193n) {
                m2058a(context);
            }
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.LEGACY_MANUAL) {
                this.f2186e.m2660b(context.getClass().getName());
            }
            m2098i();
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m2949e("Exception occurred in Mobclick.onRause(). ", th);
            }
        }
        if (UMConfigure.isDebugLog() && (context instanceof Activity)) {
            f2177r = context.getClass().getName();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2064a(Context context, String str, HashMap map) {
        if (context == null) {
            return;
        }
        try {
            if (f2171a == null) {
                f2171a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f2171a)) {
                MLog.m2947e("onGKVEvent can not be called in child process");
                return;
            }
            if (!this.f2189j || !this.f2193n) {
                m2058a(f2171a);
            }
            String string = "";
            if (this.f2190k == null) {
                this.f2190k = new JSONObject();
            } else {
                string = this.f2190k.toString();
            }
            C0723s.m2620a(f2171a).m2633a(str, map, string);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m2951e(th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2061a(Context context, String str) {
        if (context == null) {
            UMLog.m2750aq(C0714j.f2832w, 0, "\\|");
            return;
        }
        if (f2171a == null) {
            f2171a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f2171a)) {
            MLog.m2947e("reportError can not be called in child process");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if (UMConfigure.isDebugLog()) {
                UMLog.m2750aq(C0714j.f2833x, 0, "\\|");
                return;
            }
            return;
        }
        try {
            if (!this.f2189j || !this.f2193n) {
                m2058a(f2171a);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ts", System.currentTimeMillis());
            jSONObject.put(C0708d.f2601Q, 2);
            jSONObject.put(C0708d.f2602R, str);
            jSONObject.put("__ii", this.f2187f.m2653c());
            Context context2 = f2171a;
            UMWorkDispatch.sendEvent(context2, C0719o.a.f2904j, CoreProtocol.getInstance(context2), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m2951e(th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2067a(Context context, Throwable th) {
        if (context == null || th == null) {
            UMLog.m2750aq(C0714j.f2834y, 0, "\\|");
            return;
        }
        if (f2171a == null) {
            f2171a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f2171a)) {
            MLog.m2947e("reportError can not be called in child process");
            return;
        }
        try {
            if (!this.f2189j || !this.f2193n) {
                m2058a(f2171a);
            }
            m2061a(f2171a, DataHelper.convertExceptionToString(th));
        } catch (Exception e) {
            if (MLog.DEBUG) {
                MLog.m2951e(e);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m2097h() {
        try {
            Context context = f2171a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m2947e("onStartSessionInternal can not be called in child process");
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                Context context2 = f2171a;
                UMWorkDispatch.sendEvent(context2, C0719o.a.f2905k, CoreProtocol.getInstance(context2), Long.valueOf(jCurrentTimeMillis));
                Context context3 = f2171a;
                UMWorkDispatch.sendEvent(context3, C0719o.a.f2901g, CoreProtocol.getInstance(context3), Long.valueOf(jCurrentTimeMillis));
            }
            ISysListener iSysListener = this.f2183b;
            if (iSysListener != null) {
                iSysListener.onAppResume();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public void m2098i() {
        try {
            Context context = f2171a;
            if (context != null) {
                if (!UMUtils.isMainProgress(context)) {
                    MLog.m2947e("onEndSessionInternal can not be called in child process");
                    return;
                }
                Context context2 = f2171a;
                UMWorkDispatch.sendEvent(context2, C0719o.a.f2902h, CoreProtocol.getInstance(context2), Long.valueOf(System.currentTimeMillis()));
                Context context3 = f2171a;
                UMWorkDispatch.sendEvent(context3, C0719o.a.f2898d, CoreProtocol.getInstance(context3), null);
                Context context4 = f2171a;
                UMWorkDispatch.sendEvent(context4, C0719o.a.f2897c, CoreProtocol.getInstance(context4), null);
                Context context5 = f2171a;
                UMWorkDispatch.sendEvent(context5, C0719o.a.f2903i, CoreProtocol.getInstance(context5), null);
            }
        } catch (Throwable unused) {
        }
        ISysListener iSysListener = this.f2183b;
        if (iSysListener != null) {
            iSysListener.onAppPause();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2079b(Context context, String str) {
        try {
            if (context == null) {
                UMLog.m2750aq(C0714j.f2779N, 0, "\\|");
                return;
            }
            if (f2171a == null) {
                f2171a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f2171a)) {
                MLog.m2947e("onDeepLinkReceived can not be called in child process");
                return;
            }
            if (!this.f2189j || !this.f2193n) {
                m2058a(f2171a);
            }
            if (!TextUtils.isEmpty(str)) {
                HashMap map = new HashMap();
                map.put(C0708d.f2616aE, str);
                m2051a(f2171a, C0708d.f2615aD, (Map) map, -1L, false);
                return;
            }
            UMLog.m2750aq(C0714j.f2780O, 0, "\\|");
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m2951e(th);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m2054c(String str) {
        if (this.f2194u.enabled() && this.f2194u.matchHit(str)) {
            return true;
        }
        if (!this.f2195x.enabled()) {
            return false;
        }
        if (!this.f2195x.matchHit(str)) {
            return true;
        }
        UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> white list match! id = " + str);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m2063a(Context context, String str, String str2, long j, int i) {
        if (context == null) {
            return;
        }
        try {
            if (f2171a == null) {
                f2171a = context.getApplicationContext();
            }
            if (!this.f2189j || !this.f2193n) {
                m2058a(f2171a);
            }
            if (m2054c(str)) {
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> filter ekv [" + str + "].");
                return;
            }
            String string = "";
            if (this.f2190k == null) {
                this.f2190k = new JSONObject();
            } else {
                string = this.f2190k.toString();
            }
            C0723s.m2620a(f2171a).m2631a(str, str2, j, i, string);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m2951e(th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2066a(Context context, String str, Map map, long j) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (Arrays.asList(C0708d.f2617aF).contains(str)) {
                    UMLog.m2750aq(C0714j.f2811b, 0, "\\|");
                    return;
                }
                if (map.isEmpty()) {
                    UMLog.m2750aq(C0714j.f2813d, 0, "\\|");
                    return;
                }
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    if (Arrays.asList(C0708d.f2617aF).contains(((Map.Entry) it.next()).getKey())) {
                        UMLog.m2750aq(C0714j.f2814e, 0, "\\|");
                        return;
                    }
                }
                m2051a(context, str, map, j, false);
                return;
            }
            UMLog.m2750aq(C0714j.f2812c, 0, "\\|");
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m2951e(th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2065a(Context context, String str, Map map) {
        m2051a(context, str, map, -1L, true);
    }

    /* JADX INFO: renamed from: a */
    private void m2051a(Context context, String str, Map map, long j, boolean z) {
        try {
            if (context == null) {
                MLog.m2947e("context is null in onEventNoCheck, please check!");
                return;
            }
            if (f2171a == null) {
                f2171a = context.getApplicationContext();
            }
            if (!this.f2189j || !this.f2193n) {
                m2058a(f2171a);
            }
            if (m2054c(str)) {
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> filter ekv [" + str + "].");
                return;
            }
            String string = "";
            if (this.f2190k == null) {
                this.f2190k = new JSONObject();
            } else {
                string = this.f2190k.toString();
            }
            C0723s.m2620a(f2171a).m2632a(str, map, j, string, z);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m2951e(th);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2086d(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (f2171a == null) {
                f2171a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f2171a)) {
                MLog.m2947e("onKillProcess can not be called in child process");
                return;
            }
            C0716l c0716l = this.f2188g;
            if (c0716l != null) {
                c0716l.m2538c();
            }
            C0716l.m2519a(context, "onKillProcess");
            C0715k c0715k = this.f2186e;
            if (c0715k != null) {
                c0715k.m2659b();
            }
            C0726v c0726v = this.f2185d;
            if (c0726v != null) {
                c0726v.m2659b();
            }
            Context context2 = f2171a;
            if (context2 != null) {
                C0725u c0725u = this.f2187f;
                if (c0725u != null) {
                    c0725u.m2655c(context2, Long.valueOf(System.currentTimeMillis()));
                }
                C0719o.m2548a(f2171a).m2593d();
                C0726v.m2657a(f2171a);
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
                    C0716l.m2527c(f2171a);
                }
                PreferenceWrapper.getDefault(f2171a).edit().commit();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC0724t
    /* JADX INFO: renamed from: a */
    public void mo2074a(Throwable th) {
        try {
            Context context = f2171a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.m2947e("onAppCrash can not be called in child process");
                return;
            }
            if (AnalyticsConfig.enable) {
                C0726v c0726v = this.f2185d;
                if (c0726v != null) {
                    c0726v.m2659b();
                }
                C0716l.m2519a(f2171a, "onAppCrash");
                C0715k c0715k = this.f2186e;
                if (c0715k != null) {
                    c0715k.m2659b();
                }
                C0716l c0716l = this.f2188g;
                if (c0716l != null) {
                    c0716l.m2538c();
                }
                C0725u c0725u = this.f2187f;
                if (c0725u != null) {
                    c0725u.m2655c(f2171a, Long.valueOf(System.currentTimeMillis()));
                }
                if (th != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("ts", System.currentTimeMillis());
                    jSONObject.put(C0708d.f2601Q, 1);
                    jSONObject.put(C0708d.f2602R, DataHelper.convertExceptionToString(th));
                    C0713i.m2480a(f2171a).m2498a(this.f2187f.m2653c(), jSONObject.toString(), 1);
                }
                C0719o.m2548a(f2171a).m2593d();
                C0726v.m2657a(f2171a);
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
                    C0716l.m2527c(f2171a);
                }
                PreferenceWrapper.getDefault(f2171a).edit().commit();
            }
        } catch (Exception e) {
            if (MLog.DEBUG) {
                MLog.m2949e("Exception in onAppCrash", e);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2073a(String str, String str2) {
        try {
            Context context = f2171a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.m2947e("onProfileSignIn can not be called in child process");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0708d.f2597M, str);
            jSONObject.put(DhizukuVariables.PARAM_CLIENT_UID, str2);
            jSONObject.put("ts", jCurrentTimeMillis);
            Context context2 = f2171a;
            UMWorkDispatch.sendEvent(context2, C0719o.a.f2899e, CoreProtocol.getInstance(context2), jSONObject);
            Context context3 = f2171a;
            UMWorkDispatch.sendEvent(context3, C0719o.a.f2909o, CoreProtocol.getInstance(context3), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m2949e(" Excepthon  in  onProfileSignIn", th);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m2099j() {
        try {
            Context context = f2171a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.m2947e("onProfileSignOff can not be called in child process");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ts", jCurrentTimeMillis);
            Context context2 = f2171a;
            UMWorkDispatch.sendEvent(context2, C0719o.a.f2900f, CoreProtocol.getInstance(context2), jSONObject);
            Context context3 = f2171a;
            UMWorkDispatch.sendEvent(context3, C0719o.a.f2909o, CoreProtocol.getInstance(context3), jSONObject);
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m2949e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2076a(boolean z) {
        Context context = f2171a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m2947e("setCatchUncaughtExceptions can not be called in child process");
        } else {
            if (AnalyticsConfig.CHANGE_CATCH_EXCEPTION_NOTALLOW) {
                return;
            }
            AnalyticsConfig.CATCH_EXCEPTION = z;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2075a(GL10 gl10) {
        String[] gpu = UMUtils.getGPU(gl10);
        if (gpu.length == 2) {
            AnalyticsConfig.GPU_VENDER = gpu[0];
            AnalyticsConfig.GPU_RENDERER = gpu[1];
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2056a(double d, double d2) {
        Context context = f2171a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m2947e("setLocation can not be called in child process");
            return;
        }
        if (AnalyticsConfig.f2144a == null) {
            AnalyticsConfig.f2144a = new double[2];
        }
        double[] dArr = AnalyticsConfig.f2144a;
        dArr[0] = d;
        dArr[1] = d2;
    }

    /* JADX INFO: renamed from: a */
    public void m2060a(Context context, MobclickAgent.EScenarioType eScenarioType) {
        if (context == null) {
            MLog.m2947e("unexpected null context in setScenarioType");
            return;
        }
        if (f2171a == null) {
            f2171a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f2171a)) {
            MLog.m2947e("setScenarioType can not be called in child process");
            return;
        }
        if (eScenarioType != null) {
            m2059a(f2171a, eScenarioType.toValue());
        }
        if (this.f2189j && this.f2193n) {
            return;
        }
        m2058a(f2171a);
    }

    /* JADX INFO: renamed from: c */
    public void m2084c(Context context, String str) {
        if (context == null) {
            UMLog.m2750aq(C0714j.f2835z, 0, "\\|");
            return;
        }
        if (f2171a == null) {
            f2171a = context.getApplicationContext();
        }
        if (!UMUtils.isMainProgress(f2171a)) {
            MLog.m2947e("setSecret can not be called in child process");
            return;
        }
        if (!this.f2189j || !this.f2193n) {
            m2058a(f2171a);
        }
        AnalyticsConfig.m2047a(f2171a, str);
    }

    /* JADX INFO: renamed from: a */
    public void m2057a(long j) {
        Context context = f2171a;
        if (context == null) {
            return;
        }
        if (!UMUtils.isMainProgress(context)) {
            MLog.m2947e("setSessionContinueMillis can not be called in child process");
        } else {
            AnalyticsConfig.kContinueSessionMillis = j;
            C0729y.m2667a().m2676a(AnalyticsConfig.kContinueSessionMillis);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m2062a(Context context, String str, Object obj) {
        int i = 0;
        try {
            if (context == null) {
                UMLog.m2750aq(C0714j.f2798af, 0, "\\|");
                return;
            }
            if (f2171a == null) {
                f2171a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f2171a)) {
                MLog.m2947e("registerSuperProperty can not be called in child process");
                return;
            }
            if (!this.f2189j || !this.f2193n) {
                m2058a(f2171a);
            }
            if (!TextUtils.isEmpty(str) && obj != null) {
                if (!str.equals(f2182z) && !str.equals(f2167A) && !str.equals(f2168B) && !str.equals(f2169C) && !str.equals(f2170D)) {
                    MLog.m2947e("property name is " + str + ", please check key, must be correct!");
                    return;
                }
                if ((obj instanceof String) && !HelperUtils.checkStrLen(obj.toString(), 256)) {
                    MLog.m2947e("property value is " + obj + ", please check value, lawless!");
                    return;
                }
                try {
                    if (this.f2190k == null) {
                        this.f2190k = new JSONObject();
                    }
                    if (obj.getClass().isArray()) {
                        if (obj instanceof String[]) {
                            String[] strArr = (String[]) obj;
                            if (strArr.length > 10) {
                                MLog.m2947e("please check value, size is " + strArr.length + ", overstep 10!");
                                return;
                            }
                            JSONArray jSONArray = new JSONArray();
                            while (i < strArr.length) {
                                String str2 = strArr[i];
                                if (str2 != null && HelperUtils.checkStrLen(str2, 256)) {
                                    jSONArray.put(strArr[i]);
                                    i++;
                                }
                                MLog.m2947e("please check value, length is " + strArr[i].length() + ", overlength 256!");
                                return;
                            }
                            this.f2190k.put(str, jSONArray);
                        } else if (obj instanceof long[]) {
                            long[] jArr = (long[]) obj;
                            if (jArr.length > 10) {
                                MLog.m2947e("please check value, size is " + jArr.length + ", overstep 10!");
                                return;
                            }
                            JSONArray jSONArray2 = new JSONArray();
                            while (i < jArr.length) {
                                jSONArray2.put(jArr[i]);
                                i++;
                            }
                            this.f2190k.put(str, jSONArray2);
                        } else if (obj instanceof int[]) {
                            int[] iArr = (int[]) obj;
                            if (iArr.length > 10) {
                                MLog.m2947e("please check value, size is " + iArr.length + ", overstep 10!");
                                return;
                            }
                            JSONArray jSONArray3 = new JSONArray();
                            while (i < iArr.length) {
                                jSONArray3.put(iArr[i]);
                                i++;
                            }
                            this.f2190k.put(str, jSONArray3);
                        } else if (obj instanceof float[]) {
                            float[] fArr = (float[]) obj;
                            if (fArr.length > 10) {
                                MLog.m2947e("please check value, size is " + fArr.length + ", overstep 10!");
                                return;
                            }
                            JSONArray jSONArray4 = new JSONArray();
                            while (i < fArr.length) {
                                jSONArray4.put(fArr[i]);
                                i++;
                            }
                            this.f2190k.put(str, jSONArray4);
                        } else if (obj instanceof double[]) {
                            double[] dArr = (double[]) obj;
                            if (dArr.length > 10) {
                                MLog.m2947e("please check value, size is " + dArr.length + ", overstep 10!");
                                return;
                            }
                            JSONArray jSONArray5 = new JSONArray();
                            while (i < dArr.length) {
                                jSONArray5.put(dArr[i]);
                                i++;
                            }
                            this.f2190k.put(str, jSONArray5);
                        } else if (obj instanceof short[]) {
                            short[] sArr = (short[]) obj;
                            if (sArr.length > 10) {
                                MLog.m2947e("please check value, size is " + sArr.length + ", overstep 10!");
                                return;
                            }
                            JSONArray jSONArray6 = new JSONArray();
                            while (i < sArr.length) {
                                jSONArray6.put((int) sArr[i]);
                                i++;
                            }
                            this.f2190k.put(str, jSONArray6);
                        } else {
                            MLog.m2947e("please check value, illegal type!");
                            return;
                        }
                    } else {
                        if (!(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Integer) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof Short)) {
                            MLog.m2947e("please check value, illegal type!");
                            return;
                        }
                        this.f2190k.put(str, obj);
                    }
                } catch (Throwable unused) {
                }
                Context context2 = f2171a;
                UMWorkDispatch.sendEvent(context2, C0719o.a.f2913s, CoreProtocol.getInstance(context2), this.f2190k.toString());
                return;
            }
            UMLog.m2750aq(C0714j.f2799ag, 0, "\\|");
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2052a(String str, Object obj) {
        try {
            if (this.f2190k == null) {
                this.f2190k = new JSONObject();
            }
            int i = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    if (strArr.length > 10) {
                        return;
                    }
                    JSONArray jSONArray = new JSONArray();
                    while (i < strArr.length) {
                        String str2 = strArr[i];
                        if (str2 != null && !HelperUtils.checkStrLen(str2, 256)) {
                            jSONArray.put(strArr[i]);
                        }
                        i++;
                    }
                    this.f2190k.put(str, jSONArray);
                    return;
                }
                if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    JSONArray jSONArray2 = new JSONArray();
                    while (i < jArr.length) {
                        jSONArray2.put(jArr[i]);
                        i++;
                    }
                    this.f2190k.put(str, jSONArray2);
                    return;
                }
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    JSONArray jSONArray3 = new JSONArray();
                    while (i < iArr.length) {
                        jSONArray3.put(iArr[i]);
                        i++;
                    }
                    this.f2190k.put(str, jSONArray3);
                    return;
                }
                if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    JSONArray jSONArray4 = new JSONArray();
                    while (i < fArr.length) {
                        jSONArray4.put(fArr[i]);
                        i++;
                    }
                    this.f2190k.put(str, jSONArray4);
                    return;
                }
                if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    JSONArray jSONArray5 = new JSONArray();
                    while (i < dArr.length) {
                        jSONArray5.put(dArr[i]);
                        i++;
                    }
                    this.f2190k.put(str, jSONArray5);
                    return;
                }
                if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    JSONArray jSONArray6 = new JSONArray();
                    while (i < sArr.length) {
                        jSONArray6.put((int) sArr[i]);
                        i++;
                    }
                    this.f2190k.put(str, jSONArray6);
                    return;
                }
                return;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                JSONArray jSONArray7 = new JSONArray();
                while (i < list.size()) {
                    Object obj2 = list.get(i);
                    if ((obj2 instanceof String) || (obj2 instanceof Long) || (obj2 instanceof Integer) || (obj2 instanceof Float) || (obj2 instanceof Double) || (obj2 instanceof Short)) {
                        jSONArray7.put(list.get(i));
                    }
                    i++;
                }
                this.f2190k.put(str, jSONArray7);
                return;
            }
            if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                this.f2190k.put(str, obj);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m2071a(Object obj) {
        try {
            Context context = f2171a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.m2947e("registerSuperPropertyByCoreProtocol can not be called in child process");
                return;
            }
            if (obj != null) {
                String str = (String) obj;
                SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(f2171a).edit();
                if (editorEdit != null && !TextUtils.isEmpty(str)) {
                    editorEdit.putString(f2172h, this.f2190k.toString()).commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m2087d(Context context, String str) {
        try {
            if (context == null) {
                UMLog.m2750aq(C0714j.f2800ah, 0, "\\|");
                return;
            }
            if (f2171a == null) {
                f2171a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f2171a)) {
                MLog.m2947e("unregisterSuperProperty can not be called in child process");
                return;
            }
            if (!this.f2189j || !this.f2193n) {
                m2058a(f2171a);
            }
            if (TextUtils.isEmpty(str)) {
                UMLog.m2750aq(C0714j.f2799ag, 0, "\\|");
                return;
            }
            if (!str.equals(f2182z) && !str.equals(f2167A) && !str.equals(f2168B) && !str.equals(f2169C) && !str.equals(f2170D)) {
                MLog.m2947e("please check key or value, must be correct!");
                return;
            }
            if (this.f2190k == null) {
                this.f2190k = new JSONObject();
            }
            if (this.f2190k.has(str)) {
                this.f2190k.remove(str);
                Context context2 = f2171a;
                UMWorkDispatch.sendEvent(context2, C0719o.a.f2915u, CoreProtocol.getInstance(context2), str);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized Object m2088e(Context context, String str) {
        try {
            if (context == null) {
                UMLog.m2750aq(C0714j.f2801ai, 0, "\\|");
                return null;
            }
            if (f2171a == null) {
                f2171a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f2171a)) {
                MLog.m2947e("getSuperProperty can not be called in child process");
                return null;
            }
            if (TextUtils.isEmpty(str)) {
                UMLog.m2750aq(C0714j.f2799ag, 0, "\\|");
                return null;
            }
            if (!str.equals(f2182z) && !str.equals(f2167A) && !str.equals(f2168B) && !str.equals(f2169C) && !str.equals(f2170D)) {
                MLog.m2947e("please check key or value, must be correct!");
                return null;
            }
            if (this.f2190k != null) {
                if (this.f2190k.has(str)) {
                    return this.f2190k.opt(str);
                }
            } else {
                this.f2190k = new JSONObject();
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized String m2089e(Context context) {
        try {
            if (context == null) {
                UMLog.m2750aq(C0714j.f2801ai, 0, "\\|");
                return null;
            }
            if (f2171a == null) {
                f2171a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f2171a)) {
                MLog.m2947e("getSuperProperties can not be called in child process");
                return null;
            }
            if (this.f2190k != null) {
                return this.f2190k.toString();
            }
            this.f2190k = new JSONObject();
            return null;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m2092f(Context context) {
        try {
            if (context == null) {
                UMLog.m2750aq(C0714j.f2800ah, 0, "\\|");
                return;
            }
            if (f2171a == null) {
                f2171a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f2171a)) {
                MLog.m2947e("clearSuperProperties can not be called in child process");
                return;
            }
            if (!this.f2189j || !this.f2193n) {
                m2058a(f2171a);
            }
            this.f2190k = new JSONObject();
            Context context2 = f2171a;
            UMWorkDispatch.sendEvent(context2, C0719o.a.f2914t, CoreProtocol.getInstance(context2), null);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m2068a(Context context, List list) {
        try {
            if (context == null) {
                UMLog.m2750aq(C0714j.f2802aj, 0, "\\|");
                return;
            }
            if (f2171a == null) {
                f2171a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f2171a)) {
                MLog.m2947e("setFirstLaunchEvent can not be called in child process");
                return;
            }
            if (!this.f2189j || !this.f2193n) {
                m2058a(f2171a);
            }
            C0723s.m2620a(f2171a).m2634a(list);
        } catch (Throwable th) {
            MLog.m2951e(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m2069a(Context context, JSONObject jSONObject) {
        JSONObject jSONObject2;
        try {
            if (context == null) {
                UMLog.m2750aq(C0714j.f2804al, 0, "\\|");
                return;
            }
            if (f2171a == null) {
                f2171a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f2171a)) {
                MLog.m2947e("registerPreProperties can not be called in child process");
                return;
            }
            if (!this.f2189j || !this.f2193n) {
                m2058a(f2171a);
            }
            if (this.f2192m == null) {
                this.f2192m = new JSONObject();
            }
            if (jSONObject == null || jSONObject.length() <= 0) {
                UMLog.m2750aq(C0714j.f2805am, 0, "\\|");
                return;
            }
            try {
                jSONObject2 = new JSONObject(this.f2192m.toString());
            } catch (Exception unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            Iterator<String> itKeys = jSONObject.keys();
            if (itKeys != null) {
                while (itKeys.hasNext()) {
                    try {
                        String string = itKeys.next().toString();
                        Object obj = jSONObject.get(string);
                        if (m2053b(string, obj)) {
                            jSONObject2.put(string, obj);
                            if (jSONObject2.length() > 10) {
                                MLog.m2947e("please check propertics, size overlength!");
                                return;
                            }
                            continue;
                        } else {
                            return;
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            this.f2192m = jSONObject2;
            if (this.f2192m.length() > 0) {
                Context context2 = f2171a;
                UMWorkDispatch.sendEvent(context2, C0719o.a.f2916v, CoreProtocol.getInstance(context2), this.f2192m.toString());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m2093f(Context context, String str) {
        try {
            if (context == null) {
                UMLog.m2750aq(C0714j.f2806an, 0, "\\|");
                return;
            }
            if (f2171a == null) {
                f2171a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f2171a)) {
                MLog.m2947e("unregisterPreProperty can not be called in child process");
                return;
            }
            if (!this.f2189j || !this.f2193n) {
                m2058a(f2171a);
            }
            if (this.f2192m == null) {
                this.f2192m = new JSONObject();
            }
            if (str != null && str.length() > 0) {
                if (this.f2192m.has(str)) {
                    this.f2192m.remove(str);
                    Context context2 = f2171a;
                    UMWorkDispatch.sendEvent(context2, C0719o.a.f2917w, CoreProtocol.getInstance(context2), this.f2192m.toString());
                } else if (UMConfigure.isDebugLog()) {
                    UMLog.m2750aq(C0714j.f2807ao, 0, "\\|");
                }
                return;
            }
            MLog.m2947e("please check propertics, property is null!");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m2095g(Context context) {
        try {
            if (context == null) {
                UMLog.m2750aq(C0714j.f2808ap, 0, "\\|");
                return;
            }
            if (f2171a == null) {
                f2171a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f2171a)) {
                MLog.m2947e("clearPreProperties can not be called in child process");
                return;
            }
            if (!this.f2189j || !this.f2193n) {
                m2058a(f2171a);
            }
            if (this.f2192m.length() > 0) {
                Context context2 = f2171a;
                UMWorkDispatch.sendEvent(context2, C0719o.a.f2918x, CoreProtocol.getInstance(context2), null);
            }
            this.f2192m = new JSONObject();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public synchronized JSONObject m2096h(Context context) {
        try {
            if (context == null) {
                UMLog.m2750aq(C0714j.f2809aq, 0, "\\|");
                return null;
            }
            if (f2171a == null) {
                f2171a = context.getApplicationContext();
            }
            if (!UMUtils.isMainProgress(f2171a)) {
                MLog.m2947e("getPreProperties can not be called in child process");
                return null;
            }
            if (!this.f2189j || !this.f2193n) {
                m2058a(f2171a);
            }
            if (this.f2192m == null) {
                this.f2192m = new JSONObject();
            }
            JSONObject jSONObject = new JSONObject();
            if (this.f2192m.length() > 0) {
                try {
                    jSONObject = new JSONObject(this.f2192m.toString());
                } catch (JSONException unused) {
                }
            }
            return jSONObject;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m2080b(Object obj) {
        try {
            Context context = f2171a;
            if (context == null) {
                return;
            }
            if (!UMUtils.isMainProgress(context)) {
                MLog.m2947e("updateNativePrePropertiesByCoreProtocol can not be called in child process");
                return;
            }
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(f2171a).edit();
            if (obj != null) {
                String str = (String) obj;
                if (editorEdit != null && !TextUtils.isEmpty(str)) {
                    editorEdit.putString(f2173i, str).commit();
                }
            } else if (editorEdit != null) {
                editorEdit.remove(f2173i).commit();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m2053b(String str, Object obj) {
        int length;
        try {
            if (TextUtils.isEmpty(str)) {
                MLog.m2947e("key is " + str + ", please check key, illegal");
                return false;
            }
            try {
                length = str.getBytes(C0233a.f1077D).length;
            } catch (UnsupportedEncodingException unused) {
                length = 0;
            }
            if (length > 128) {
                MLog.m2947e("key length is " + length + ", please check key, illegal");
                return false;
            }
            if (obj instanceof String) {
                if (((String) obj).getBytes(C0233a.f1077D).length <= 256) {
                    return true;
                }
                MLog.m2947e("value length is " + ((String) obj).getBytes(C0233a.f1077D).length + ", please check value, illegal");
                return false;
            }
            if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float)) {
                return true;
            }
            MLog.m2947e("value is " + obj + ", please check value, type illegal");
            return false;
        } catch (Throwable unused2) {
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC0718n
    /* JADX INFO: renamed from: n */
    public void mo2103n() {
        UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> onIntoBackground triggered.");
        if (AnalyticsConfig.enable && FieldManager.m2731b()) {
            if (FieldManager.allow(C0832d.f3590D)) {
                if (UMWorkDispatch.eventHasExist(C0719o.a.f2889A)) {
                    return;
                }
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> 退出时发送策略 被触发！");
                Context context = f2171a;
                UMWorkDispatch.sendEvent(context, C0719o.a.f2889A, CoreProtocol.getInstance(context), null);
                return;
            }
            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> 退出发送策略: 云控控制字关闭。功能不生效");
        }
    }
}
