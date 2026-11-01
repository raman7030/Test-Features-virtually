package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.sdk.app.OpenAuthTask;
import com.rosan.dhizuku.shared.DhizukuVariables;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.C0636b;
import com.umeng.analytics.C0637c;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.process.UMProcessDBHelper;
import com.umeng.common.C0744b;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.C0770a;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.C0795b;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ReportPolicy;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.statistics.internal.StatTracer;
import com.umeng.commonsdk.statistics.noise.ABTest;
import com.umeng.commonsdk.statistics.noise.Defcon;
import com.umeng.commonsdk.utils.C0831c;
import com.umeng.commonsdk.utils.C0832d;
import com.umeng.commonsdk.utils.JSONArraySortUtil;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.analytics.pro.o */
/* JADX INFO: compiled from: D45J */
/* JADX INFO: loaded from: classes.dex */
public class C0719o {

    /* JADX INFO: renamed from: a */
    public static Context f2863a = null;

    /* JADX INFO: renamed from: l */
    public static final String f2864l = "first_activate_time";

    /* JADX INFO: renamed from: m */
    public static final String f2865m = "ana_is_f";

    /* JADX INFO: renamed from: n */
    public static final String f2866n = "thtstart";

    /* JADX INFO: renamed from: o */
    public static final String f2867o = "dstk_last_time";

    /* JADX INFO: renamed from: p */
    public static final String f2868p = "dstk_cnt";

    /* JADX INFO: renamed from: q */
    public static final String f2869q = "gkvc";

    /* JADX INFO: renamed from: r */
    public static final String f2870r = "ekvc";

    /* JADX INFO: renamed from: t */
    public static final String f2871t = "-1";

    /* JADX INFO: renamed from: x */
    public static final String f2872x = "com.umeng.umcrash.UMCrashUtils";

    /* JADX INFO: renamed from: y */
    public static Class f2873y;

    /* JADX INFO: renamed from: z */
    public static Method f2874z;

    /* JADX INFO: renamed from: b */
    public c f2875b;

    /* JADX INFO: renamed from: c */
    public SharedPreferences f2876c;

    /* JADX INFO: renamed from: d */
    public String f2877d;

    /* JADX INFO: renamed from: e */
    public String f2878e;

    /* JADX INFO: renamed from: f */
    public int f2879f;

    /* JADX INFO: renamed from: g */
    public JSONArray f2880g;

    /* JADX INFO: renamed from: h */
    public final int f2881h;

    /* JADX INFO: renamed from: i */
    public int f2882i;

    /* JADX INFO: renamed from: j */
    public int f2883j;

    /* JADX INFO: renamed from: k */
    public long f2884k;

    /* JADX INFO: renamed from: s */
    public final long f2885s;

    /* JADX INFO: renamed from: u */
    public boolean f2886u;

    /* JADX INFO: renamed from: v */
    public boolean f2887v;

    /* JADX INFO: renamed from: w */
    public Object f2888w;

    /* JADX INFO: renamed from: com.umeng.analytics.pro.o$a */
    /* JADX INFO: compiled from: D45J */
    public class a {

        /* JADX INFO: renamed from: A */
        public static final int f2889A = 8210;

        /* JADX INFO: renamed from: B */
        public static final int f2890B = 8211;

        /* JADX INFO: renamed from: C */
        public static final int f2891C = 8212;

        /* JADX INFO: renamed from: D */
        public static final int f2892D = 8213;

        /* JADX INFO: renamed from: E */
        public static final int f2893E = 8214;

        /* JADX INFO: renamed from: F */
        public static final int f2894F = 8215;

        /* JADX INFO: renamed from: a */
        public static final int f2895a = 4097;

        /* JADX INFO: renamed from: b */
        public static final int f2896b = 4098;

        /* JADX INFO: renamed from: c */
        public static final int f2897c = 4099;

        /* JADX INFO: renamed from: d */
        public static final int f2898d = 4100;

        /* JADX INFO: renamed from: e */
        public static final int f2899e = 4101;

        /* JADX INFO: renamed from: f */
        public static final int f2900f = 4102;

        /* JADX INFO: renamed from: g */
        public static final int f2901g = 4103;

        /* JADX INFO: renamed from: h */
        public static final int f2902h = 4104;

        /* JADX INFO: renamed from: i */
        public static final int f2903i = 4105;

        /* JADX INFO: renamed from: j */
        public static final int f2904j = 4106;

        /* JADX INFO: renamed from: k */
        public static final int f2905k = 4352;

        /* JADX INFO: renamed from: l */
        public static final int f2906l = 4353;

        /* JADX INFO: renamed from: m */
        public static final int f2907m = 4354;

        /* JADX INFO: renamed from: n */
        public static final int f2908n = 4355;

        /* JADX INFO: renamed from: o */
        public static final int f2909o = 4356;

        /* JADX INFO: renamed from: p */
        public static final int f2910p = 4357;

        /* JADX INFO: renamed from: q */
        public static final int f2911q = 8193;

        /* JADX INFO: renamed from: r */
        public static final int f2912r = 8194;

        /* JADX INFO: renamed from: s */
        public static final int f2913s = 8195;

        /* JADX INFO: renamed from: t */
        public static final int f2914t = 8196;

        /* JADX INFO: renamed from: u */
        public static final int f2915u = 8197;

        /* JADX INFO: renamed from: v */
        public static final int f2916v = 8199;

        /* JADX INFO: renamed from: w */
        public static final int f2917w = 8200;

        /* JADX INFO: renamed from: x */
        public static final int f2918x = 8201;

        /* JADX INFO: renamed from: y */
        public static final int f2919y = 8208;

        /* JADX INFO: renamed from: z */
        public static final int f2920z = 8209;
    }

    /* JADX INFO: renamed from: b */
    public void m2588b() {
    }

    static {
        m2567h();
    }

    /* JADX INFO: renamed from: h */
    public static void m2567h() {
        try {
            Class<?> cls = Class.forName(f2872x);
            f2873y = cls;
            Method declaredMethod = cls.getDeclaredMethod("setPuidAndProvider", String.class, String.class);
            if (declaredMethod != null) {
                f2874z = declaredMethod;
            }
        } catch (Throwable unused) {
        }
    }

    public C0719o() {
        this.f2875b = null;
        this.f2876c = null;
        this.f2877d = null;
        this.f2878e = null;
        this.f2879f = 10;
        this.f2880g = new JSONArray();
        this.f2881h = OpenAuthTask.Duplex;
        this.f2882i = 0;
        this.f2883j = 0;
        this.f2884k = 0L;
        this.f2885s = Defcon.MILLIS_8_HOURS;
        this.f2886u = false;
        this.f2887v = false;
        this.f2888w = new Object();
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2863a);
            this.f2884k = sharedPreferences.getLong("thtstart", 0L);
            this.f2882i = sharedPreferences.getInt("gkvc", 0);
            this.f2883j = sharedPreferences.getInt("ekvc", 0);
            this.f2875b = new c();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.o$b */
    /* JADX INFO: compiled from: D45J */
    public class b {

        /* JADX INFO: renamed from: a */
        public static final C0719o f2921a = new C0719o();
    }

    /* JADX INFO: renamed from: a */
    public static C0719o m2548a(Context context) {
        if (f2863a == null && context != null) {
            f2863a = context.getApplicationContext();
        }
        return b.f2921a;
    }

    /* JADX INFO: renamed from: a */
    public void m2581a() {
        if (f2863a != null) {
            synchronized (this.f2888w) {
                if (this.f2886u) {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> network is now available, rebuild instant session data packet.");
                    Context context = f2863a;
                    UMWorkDispatch.sendEvent(context, a.f2906l, CoreProtocol.getInstance(context), null);
                }
            }
            synchronized (this.f2888w) {
                if (this.f2887v) {
                    Context context2 = f2863a;
                    UMWorkDispatch.sendEvent(context2, a.f2907m, CoreProtocol.getInstance(context2), null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2591c() {
        m2589b(f2863a);
        m2593d();
        m2585a(true);
    }

    /* JADX INFO: renamed from: a */
    private void m2550a(String str, String str2) {
        Method method;
        Class cls = f2873y;
        if (cls == null || (method = f2874z) == null) {
            return;
        }
        try {
            method.invoke(cls, str, str2);
        } catch (Throwable unused) {
            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> reflect call setPuidAndProvider method of crash lib failed.");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2583a(Object obj, int i) {
        if (C0831c.m3310a()) {
            if (i != 4357) {
                return;
            }
            try {
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> clean db in silent mode.");
                C0712h.m2472a(f2863a);
                C0831c.m3313c(f2863a);
            } catch (Throwable unused) {
            }
        }
        if (AnalyticsConfig.enable) {
            try {
                switch (i) {
                    case a.f2895a /* 4097 */:
                        if (UMUtils.isMainProgress(f2863a)) {
                            if (obj != null) {
                                m2560e(obj);
                            }
                            if ("-1".equals(((JSONObject) obj).optString("__i"))) {
                                return;
                            }
                            m2585a(false);
                            return;
                        }
                        UMProcessDBHelper.getInstance(f2863a).insertEventsInSubProcess(UMFrUtils.getSubProcessName(f2863a), new JSONArray().put(obj));
                        return;
                    case a.f2896b /* 4098 */:
                        if (obj != null) {
                            m2560e(obj);
                        }
                        if ("-1".equals(((JSONObject) obj).optString("__i"))) {
                            return;
                        }
                        m2585a(false);
                        return;
                    case a.f2897c /* 4099 */:
                        C0726v.m2657a(f2863a);
                        return;
                    case a.f2898d /* 4100 */:
                        C0716l.m2527c(f2863a);
                        return;
                    case a.f2899e /* 4101 */:
                        UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_SIGNIN");
                        m2584a((Object) null, true);
                        m2565g(obj);
                        return;
                    case a.f2900f /* 4102 */:
                        UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_SIGNOFF");
                        m2584a((Object) null, true);
                        m2562f(obj);
                        return;
                    case a.f2901g /* 4103 */:
                        UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> START_SESSION");
                        C0725u.m2637a().m2646a(f2863a, obj);
                        synchronized (this.f2888w) {
                            this.f2887v = true;
                            break;
                        }
                        return;
                    case a.f2902h /* 4104 */:
                        C0725u.m2637a().m2655c(f2863a, obj);
                        return;
                    case a.f2903i /* 4105 */:
                        m2593d();
                        return;
                    case a.f2904j /* 4106 */:
                        m2568h(obj);
                        return;
                    default:
                        switch (i) {
                            case a.f2905k /* 4352 */:
                                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> INSTANT_SESSION_START");
                                C0725u.m2637a().m2651b(f2863a, obj);
                                synchronized (this.f2888w) {
                                    this.f2886u = true;
                                    break;
                                }
                                return;
                            case a.f2906l /* 4353 */:
                                m2584a(obj, true);
                                return;
                            case a.f2907m /* 4354 */:
                                m2591c();
                                return;
                            case a.f2908n /* 4355 */:
                                if (!UMUtils.isMainProgress(f2863a)) {
                                    UMProcessDBHelper.getInstance(f2863a).insertEventsInSubProcess(UMFrUtils.getSubProcessName(f2863a), new JSONArray().put(obj));
                                    return;
                                } else {
                                    if (obj != null) {
                                        m2560e(obj);
                                        m2593d();
                                        return;
                                    }
                                    return;
                                }
                            case a.f2909o /* 4356 */:
                                if (obj == null || f2873y == null || f2874z == null) {
                                    return;
                                }
                                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> PROFILE_CHANGE_NOTIFY");
                                String string = "";
                                String string2 = "";
                                if (obj instanceof JSONObject) {
                                    JSONObject jSONObject = (JSONObject) obj;
                                    if (jSONObject.has(DhizukuVariables.PARAM_CLIENT_UID) && jSONObject.has(C0708d.f2597M)) {
                                        string = jSONObject.getString(C0708d.f2597M);
                                        string2 = jSONObject.getString(DhizukuVariables.PARAM_CLIENT_UID);
                                    }
                                    m2550a(string2, string);
                                    return;
                                }
                                return;
                            default:
                                switch (i) {
                                    case a.f2913s /* 8195 */:
                                        C0636b.m2050a().m2071a(obj);
                                        return;
                                    case a.f2914t /* 8196 */:
                                        C0636b.m2050a().m2102m();
                                        return;
                                    case a.f2915u /* 8197 */:
                                        C0636b.m2050a().m2100k();
                                        return;
                                    default:
                                        switch (i) {
                                            case a.f2916v /* 8199 */:
                                            case a.f2917w /* 8200 */:
                                                C0636b.m2050a().m2080b(obj);
                                                return;
                                            case a.f2918x /* 8201 */:
                                                C0636b.m2050a().m2080b((Object) null);
                                                return;
                                            default:
                                                switch (i) {
                                                    case a.f2919y /* 8208 */:
                                                        UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> receive DELAY_BUILD_ENVELOPE event.");
                                                        Context context = f2863a;
                                                        UMWorkDispatch.sendEvent(context, a.f2920z, CoreProtocol.getInstance(context), null);
                                                        Context context2 = f2863a;
                                                        UMWorkDispatch.sendEvent(context2, a.f2907m, CoreProtocol.getInstance(context2), null);
                                                        return;
                                                    case a.f2920z /* 8209 */:
                                                        m2584a(obj, false);
                                                        return;
                                                    case a.f2889A /* 8210 */:
                                                        UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> recv BUILD_ENVELOPE_IMMEDIATELY.");
                                                        if (UMUtils.isMainProgress(f2863a) && !(this.f2875b.m2603c() instanceof ReportPolicy.ReportQuasiRealtime)) {
                                                            m2585a(true);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        switch (i) {
                                                            case a.f2892D /* 8213 */:
                                                                if (FieldManager.allow(C0832d.f3591E)) {
                                                                    if (DeviceConfig.getGlobleActivity(f2863a) != null) {
                                                                        C0725u.m2640b(f2863a);
                                                                    }
                                                                    Context context3 = f2863a;
                                                                    UMWorkDispatch.sendEventEx(context3, a.f2892D, CoreProtocol.getInstance(context3), null, 5000L);
                                                                    return;
                                                                }
                                                                return;
                                                            case a.f2893E /* 8214 */:
                                                                if (obj != null && (obj instanceof JSONObject)) {
                                                                    String strOptString = ((JSONObject) obj).optString(AnalyticsConfig.RTD_START_TIME);
                                                                    String strOptString2 = ((JSONObject) obj).optString(AnalyticsConfig.RTD_PERIOD);
                                                                    String strOptString3 = ((JSONObject) obj).optString(AnalyticsConfig.DEBUG_KEY);
                                                                    if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || TextUtils.isEmpty(strOptString3)) {
                                                                        return;
                                                                    }
                                                                    C0744b.m2706a(f2863a, AnalyticsConfig.RTD_SP_FILE, AnalyticsConfig.RTD_START_TIME, strOptString);
                                                                    C0744b.m2706a(f2863a, AnalyticsConfig.RTD_SP_FILE, AnalyticsConfig.RTD_PERIOD, strOptString2);
                                                                    C0744b.m2706a(f2863a, AnalyticsConfig.RTD_SP_FILE, AnalyticsConfig.DEBUG_KEY, strOptString3);
                                                                    return;
                                                                }
                                                                return;
                                                            case a.f2894F /* 8215 */:
                                                                C0744b.m2705a(f2863a, AnalyticsConfig.RTD_SP_FILE);
                                                                return;
                                                            default:
                                                                return;
                                                        }
                                                }
                                        }
                                }
                        }
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2585a(boolean z) {
        if (m2557c(z)) {
            if (!(this.f2875b.m2603c() instanceof ReportPolicy.ReportQuasiRealtime)) {
                if (UMEnvelopeBuild.isReadyBuild(f2863a, UMLogDataProtocol.UMBusinessType.U_APP)) {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> constructMessage()");
                    m2570j();
                    return;
                }
                return;
            }
            if (z) {
                if (UMEnvelopeBuild.isOnline(f2863a)) {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> send session start in policy ReportQuasiRealtime.");
                    m2570j();
                    return;
                }
                return;
            }
            if (UMEnvelopeBuild.isReadyBuild(f2863a, UMLogDataProtocol.UMBusinessType.U_APP)) {
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> send normal data in policy ReportQuasiRealtime.");
                m2570j();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private void m2569i() {
        JSONObject jSONObjectM2586b = m2586b(UMEnvelopeBuild.maxDataSpace(f2863a));
        if (jSONObjectM2586b == null || jSONObjectM2586b.length() < 1) {
            return;
        }
        JSONObject jSONObject = (JSONObject) jSONObjectM2586b.opt("header");
        JSONObject jSONObject2 = (JSONObject) jSONObjectM2586b.opt("content");
        if (f2863a == null || jSONObject == null || jSONObject2 == null) {
            return;
        }
        UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> constructInstantMessage: request build envelope.");
        JSONObject jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(f2863a, jSONObject, jSONObject2);
        if (jSONObjectBuildEnvelopeWithExtHeader != null) {
            try {
                if (jSONObjectBuildEnvelopeWithExtHeader.has("exception")) {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + jSONObjectBuildEnvelopeWithExtHeader.getInt("exception"));
                }
            } catch (Throwable unused) {
            }
            if (UMConfigure.isDebugLog()) {
                m2561e(jSONObjectBuildEnvelopeWithExtHeader);
            }
            m2590b((Object) jSONObjectBuildEnvelopeWithExtHeader);
        }
    }

    /* JADX INFO: renamed from: j */
    private void m2570j() {
        JSONObject jSONObjectBuildEnvelopeWithExtHeader;
        JSONObject jSONObjectM2580a = m2580a(UMEnvelopeBuild.maxDataSpace(f2863a));
        if (jSONObjectM2580a == null || jSONObjectM2580a.length() < 1) {
            return;
        }
        JSONObject jSONObject = (JSONObject) jSONObjectM2580a.opt("header");
        JSONObject jSONObject2 = (JSONObject) jSONObjectM2580a.opt("content");
        Context context = f2863a;
        if (context == null || jSONObject == null || jSONObject2 == null || (jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, jSONObject2)) == null) {
            return;
        }
        try {
            if (jSONObjectBuildEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "Build envelope error code: " + jSONObjectBuildEnvelopeWithExtHeader.getInt("exception"));
            }
        } catch (Throwable unused) {
        }
        if (UMConfigure.isDebugLog()) {
            m2558d(jSONObjectBuildEnvelopeWithExtHeader);
        }
        m2582a((Object) jSONObjectBuildEnvelopeWithExtHeader);
    }

    /* JADX INFO: renamed from: a */
    private boolean m2552a(JSONArray jSONArray) {
        int length = jSONArray.length();
        List listAsList = Arrays.asList("$$_onUMengEnterForeground", "$$_onUMengEnterBackground", "$$_onUMengEnterForegroundInitError");
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null && listAsList.contains(jSONObjectOptJSONObject.optString("id"))) {
                    i++;
                }
            } catch (Throwable unused) {
            }
        }
        return i >= length;
    }

    /* JADX INFO: renamed from: a */
    private boolean m2553a(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ekv");
        int length = jSONArrayOptJSONArray.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(itKeys.next());
                    if (jSONArrayOptJSONArray2 != null && m2552a(jSONArrayOptJSONArray2)) {
                        i++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return i >= length;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m2580a(long j) {
        if (TextUtils.isEmpty(C0729y.m2667a().m2682d(f2863a))) {
            return null;
        }
        JSONObject jSONObjectM2587b = m2587b(false);
        int iM2617a = C0722r.m2613a().m2617a(f2863a);
        if (jSONObjectM2587b.length() > 0) {
            if (jSONObjectM2587b.length() == 1) {
                if (jSONObjectM2587b.optJSONObject(C0708d.f2596L) != null && iM2617a != 3) {
                    return null;
                }
                if (!TextUtils.isEmpty(jSONObjectM2587b.optString("userlevel")) && iM2617a != 3) {
                    return null;
                }
            } else if (jSONObjectM2587b.length() == 2 && jSONObjectM2587b.optJSONObject(C0708d.f2596L) != null && !TextUtils.isEmpty(jSONObjectM2587b.optString("userlevel")) && iM2617a != 3) {
                return null;
            }
            String strOptString = jSONObjectM2587b.optString(C0708d.f2658n);
            String strOptString2 = jSONObjectM2587b.optString(C0708d.f2604T);
            String strOptString3 = jSONObjectM2587b.optString("ekv");
            if (TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && m2553a(jSONObjectM2587b)) {
                return null;
            }
        } else if (iM2617a != 3) {
            return null;
        }
        JSONObject jSONObjectM2572l = m2572l();
        if (jSONObjectM2572l != null) {
            m2556c(jSONObjectM2572l);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (iM2617a == 3) {
                jSONObject2.put("analytics", new JSONObject());
            } else if (jSONObjectM2587b.length() > 0) {
                jSONObject2.put("analytics", jSONObjectM2587b);
            }
            if (jSONObjectM2572l != null && jSONObjectM2572l.length() > 0) {
                jSONObject.put("header", jSONObjectM2572l);
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("content", jSONObject2);
            }
            return m2549a(jSONObject, j);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2555b(JSONObject jSONObject) {
        JSONObject jSONObjectM2509f;
        if (C0713i.m2480a(UMGlobalContext.getAppContext(f2863a)).m2505c() || (jSONObjectM2509f = C0713i.m2480a(UMGlobalContext.getAppContext(f2863a)).m2509f()) == null) {
            return;
        }
        String strOptString = jSONObjectM2509f.optString("__av");
        String strOptString2 = jSONObjectM2509f.optString("__vc");
        try {
            if (TextUtils.isEmpty(strOptString)) {
                jSONObject.put(C0795b.m2926a("app_version"), UMUtils.getAppVersionName(f2863a));
            } else {
                jSONObject.put(C0795b.m2926a("app_version"), strOptString);
            }
            if (TextUtils.isEmpty(strOptString2)) {
                jSONObject.put(C0795b.m2926a("version_code"), UMUtils.getAppVersionCode(f2863a));
            } else {
                jSONObject.put(C0795b.m2926a("version_code"), strOptString2);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m2586b(long j) {
        if (TextUtils.isEmpty(C0729y.m2667a().m2682d(UMGlobalContext.getAppContext(f2863a)))) {
            return null;
        }
        JSONObject jSONObjectM2500b = C0713i.m2480a(UMGlobalContext.getAppContext(f2863a)).m2500b(false);
        String[] strArrM2106a = C0637c.m2106a(f2863a);
        if (strArrM2106a != null && !TextUtils.isEmpty(strArrM2106a[0]) && !TextUtils.isEmpty(strArrM2106a[1])) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(C0708d.f2597M, strArrM2106a[0]);
                jSONObject.put(C0708d.f2598N, strArrM2106a[1]);
                if (jSONObject.length() > 0) {
                    jSONObjectM2500b.put(C0708d.f2596L, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        int iM2617a = C0722r.m2613a().m2617a(f2863a);
        if (jSONObjectM2500b.length() == 1 && jSONObjectM2500b.optJSONObject(C0708d.f2596L) != null && iM2617a != 3) {
            return null;
        }
        C0722r.m2613a().m2619b(jSONObjectM2500b, f2863a);
        if (jSONObjectM2500b.length() <= 0 && iM2617a != 3) {
            return null;
        }
        JSONObject jSONObjectM2571k = m2571k();
        if (jSONObjectM2571k != null) {
            m2555b(jSONObjectM2571k);
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            if (iM2617a == 3) {
                jSONObject3.put("analytics", new JSONObject());
            } else if (jSONObjectM2500b.length() > 0) {
                jSONObject3.put("analytics", jSONObjectM2500b);
            }
            if (jSONObjectM2571k != null && jSONObjectM2571k.length() > 0) {
                jSONObject2.put("header", jSONObjectM2571k);
            }
            if (jSONObject3.length() > 0) {
                jSONObject2.put("content", jSONObject3);
            }
            return m2554b(jSONObject2, j);
        } catch (Throwable unused2) {
            return jSONObject2;
        }
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m2549a(JSONObject jSONObject, long j) {
        try {
            if (C0721q.m2611a(jSONObject) <= j) {
                return jSONObject;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("header");
            jSONObject2.put(C0708d.f2613aB, C0721q.m2611a(jSONObject));
            jSONObject.put("header", jSONObject2);
            return C0721q.m2612a(f2863a, j, jSONObject);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: b */
    private JSONObject m2554b(JSONObject jSONObject, long j) {
        try {
            if (C0721q.m2611a(jSONObject) <= j) {
                return jSONObject;
            }
            jSONObject = null;
            C0713i.m2480a(f2863a).m2497a(true, false);
            C0713i.m2480a(f2863a).m2501b();
            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> Instant session packet overload !!! ");
            return null;
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: k */
    private JSONObject m2571k() {
        JSONObject jSONObjectM2572l = m2572l();
        if (jSONObjectM2572l != null) {
            try {
                jSONObjectM2572l.put("st", "1");
            } catch (Throwable unused) {
            }
        }
        return jSONObjectM2572l;
    }

    /* JADX INFO: renamed from: c */
    private void m2556c(JSONObject jSONObject) {
        try {
            if (!C0713i.m2480a(f2863a).m2508e()) {
                JSONObject jSONObjectM2510g = C0713i.m2480a(f2863a).m2510g();
                if (jSONObjectM2510g != null) {
                    String strOptString = jSONObjectM2510g.optString("__av");
                    String strOptString2 = jSONObjectM2510g.optString("__vc");
                    if (TextUtils.isEmpty(strOptString)) {
                        jSONObject.put(C0795b.m2926a("app_version"), UMUtils.getAppVersionName(f2863a));
                    } else {
                        jSONObject.put(C0795b.m2926a("app_version"), strOptString);
                    }
                    if (TextUtils.isEmpty(strOptString2)) {
                        jSONObject.put(C0795b.m2926a("version_code"), UMUtils.getAppVersionCode(f2863a));
                        return;
                    } else {
                        jSONObject.put(C0795b.m2926a("version_code"), strOptString2);
                        return;
                    }
                }
                return;
            }
            jSONObject.put(C0795b.m2926a("app_version"), UMUtils.getAppVersionName(f2863a));
            jSONObject.put(C0795b.m2926a("version_code"), UMUtils.getAppVersionCode(f2863a));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: l */
    private JSONObject m2572l() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (AnalyticsConfig.mWrapperType != null && AnalyticsConfig.mWrapperVersion != null) {
                jSONObject.put(C0795b.m2926a("wrapper_version"), AnalyticsConfig.mWrapperVersion);
                jSONObject.put(C0795b.m2926a("wrapper_type"), AnalyticsConfig.mWrapperType);
            }
            int verticalType = AnalyticsConfig.getVerticalType(f2863a);
            jSONObject.put(C0795b.m2926a(C0708d.f2653i), verticalType);
            String str = "9.5.2";
            if (verticalType == 1) {
                String gameSdkVersion = AnalyticsConfig.getGameSdkVersion(f2863a);
                if (!TextUtils.isEmpty(gameSdkVersion)) {
                    str = gameSdkVersion;
                }
                jSONObject.put(C0795b.m2926a("sdk_version"), str);
            } else {
                jSONObject.put(C0795b.m2926a("sdk_version"), "9.5.2");
            }
            String strMD5 = HelperUtils.MD5(AnalyticsConfig.getSecretKey(f2863a));
            if (!TextUtils.isEmpty(strMD5)) {
                jSONObject.put(C0795b.m2926a("secret"), strMD5);
            }
            String strImprintProperty = UMEnvelopeBuild.imprintProperty(f2863a, "pr_ve", null);
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2863a);
            String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(f2863a, "ekv_bl_ver", "");
            if (!TextUtils.isEmpty(strImprintProperty2)) {
                if (AnalyticsConfig.CLEAR_EKV_BL) {
                    jSONObject.put(C0795b.m2926a(C0708d.f2635ap), "");
                } else {
                    jSONObject.put(C0795b.m2926a(C0708d.f2635ap), strImprintProperty2);
                }
            }
            String strImprintProperty3 = UMEnvelopeBuild.imprintProperty(f2863a, "ekv_wl_ver", "");
            if (!TextUtils.isEmpty(strImprintProperty3)) {
                if (AnalyticsConfig.CLEAR_EKV_WL) {
                    jSONObject.put(C0795b.m2926a(C0708d.f2636aq), "");
                } else {
                    jSONObject.put(C0795b.m2926a(C0708d.f2636aq), strImprintProperty3);
                }
            }
            jSONObject.put(C0795b.m2926a(C0708d.f2627ah), "1.0.0");
            if (m2579s()) {
                jSONObject.put(C0795b.m2926a(C0708d.f2629aj), "1");
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putLong(f2865m, 0L).commit();
                }
            }
            jSONObject.put(C0795b.m2926a(C0708d.f2656l), m2573m());
            jSONObject.put(C0795b.m2926a(C0708d.f2657m), m2574n());
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString("vers_name", "");
                if (!TextUtils.isEmpty(string)) {
                    String str2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (TextUtils.isEmpty(strImprintProperty)) {
                        jSONObject.put(C0795b.m2926a(C0708d.f2656l), sharedPreferences.getString("vers_pre_version", "0"));
                        jSONObject.put(C0795b.m2926a(C0708d.f2657m), sharedPreferences.getString("vers_date", str2));
                    }
                    sharedPreferences.edit().putString("pre_version", string).putString("cur_version", DeviceConfig.getAppVersionName(f2863a)).putString("pre_date", str2).remove("vers_name").remove("vers_code").remove("vers_date").remove("vers_pre_version").commit();
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0113 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0009, B:5:0x0017, B:53:0x010b, B:55:0x0113, B:57:0x0120, B:58:0x0123, B:60:0x012b, B:62:0x0134, B:64:0x013d, B:66:0x0157, B:67:0x015c, B:69:0x0168, B:70:0x0189, B:7:0x0020, B:9:0x0026, B:10:0x0030, B:12:0x0036, B:15:0x0048, B:19:0x0054, B:20:0x005a, B:22:0x0060, B:24:0x006d, B:26:0x0073, B:27:0x007f, B:28:0x0093, B:30:0x0099, B:31:0x00a3, B:32:0x00a9, B:35:0x00b1, B:36:0x00b6, B:38:0x00bc, B:42:0x00cb, B:44:0x00d9, B:52:0x0106, B:45:0x00df, B:47:0x00f4, B:46:0x00ed, B:48:0x00fe), top: B:74:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0120 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0009, B:5:0x0017, B:53:0x010b, B:55:0x0113, B:57:0x0120, B:58:0x0123, B:60:0x012b, B:62:0x0134, B:64:0x013d, B:66:0x0157, B:67:0x015c, B:69:0x0168, B:70:0x0189, B:7:0x0020, B:9:0x0026, B:10:0x0030, B:12:0x0036, B:15:0x0048, B:19:0x0054, B:20:0x005a, B:22:0x0060, B:24:0x006d, B:26:0x0073, B:27:0x007f, B:28:0x0093, B:30:0x0099, B:31:0x00a3, B:32:0x00a9, B:35:0x00b1, B:36:0x00b6, B:38:0x00bc, B:42:0x00cb, B:44:0x00d9, B:52:0x0106, B:45:0x00df, B:47:0x00f4, B:46:0x00ed, B:48:0x00fe), top: B:74:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0157 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0009, B:5:0x0017, B:53:0x010b, B:55:0x0113, B:57:0x0120, B:58:0x0123, B:60:0x012b, B:62:0x0134, B:64:0x013d, B:66:0x0157, B:67:0x015c, B:69:0x0168, B:70:0x0189, B:7:0x0020, B:9:0x0026, B:10:0x0030, B:12:0x0036, B:15:0x0048, B:19:0x0054, B:20:0x005a, B:22:0x0060, B:24:0x006d, B:26:0x0073, B:27:0x007f, B:28:0x0093, B:30:0x0099, B:31:0x00a3, B:32:0x00a9, B:35:0x00b1, B:36:0x00b6, B:38:0x00bc, B:42:0x00cb, B:44:0x00d9, B:52:0x0106, B:45:0x00df, B:47:0x00f4, B:46:0x00ed, B:48:0x00fe), top: B:74:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0168 A[Catch: all -> 0x0192, TryCatch #0 {all -> 0x0192, blocks: (B:3:0x0009, B:5:0x0017, B:53:0x010b, B:55:0x0113, B:57:0x0120, B:58:0x0123, B:60:0x012b, B:62:0x0134, B:64:0x013d, B:66:0x0157, B:67:0x015c, B:69:0x0168, B:70:0x0189, B:7:0x0020, B:9:0x0026, B:10:0x0030, B:12:0x0036, B:15:0x0048, B:19:0x0054, B:20:0x005a, B:22:0x0060, B:24:0x006d, B:26:0x0073, B:27:0x007f, B:28:0x0093, B:30:0x0099, B:31:0x00a3, B:32:0x00a9, B:35:0x00b1, B:36:0x00b6, B:38:0x00bc, B:42:0x00cb, B:44:0x00d9, B:52:0x0106, B:45:0x00df, B:47:0x00f4, B:46:0x00ed, B:48:0x00fe), top: B:74:0x0009 }] */
    /* JADX INFO: renamed from: b */
    public JSONObject m2587b(boolean z) {
        String str;
        String str2;
        String str3;
        SharedPreferences sharedPreferences;
        String[] strArrM2106a;
        JSONObject jSONObject;
        String str4;
        String string;
        String str5 = "userlevel";
        String str6 = C0708d.f2665u;
        JSONObject jSONObject2 = null;
        try {
            JSONObject jSONObjectM2493a = C0713i.m2480a(f2863a).m2493a(z);
            if (jSONObjectM2493a == null) {
                str = "userlevel";
                jSONObject2 = new JSONObject();
            } else {
                try {
                    if (jSONObjectM2493a.has(C0708d.f2658n)) {
                        JSONArray jSONArray = jSONObjectM2493a.getJSONArray(C0708d.f2658n);
                        JSONArray jSONArray2 = new JSONArray();
                        int i = 0;
                        while (i < jSONArray.length()) {
                            JSONObject jSONObject3 = (JSONObject) jSONArray.get(i);
                            JSONArray jSONArrayOptJSONArray = jSONObject3.optJSONArray(C0708d.f2664t);
                            JSONArray jSONArrayOptJSONArray2 = jSONObject3.optJSONArray(str6);
                            if (jSONArrayOptJSONArray == null && jSONArrayOptJSONArray2 != null) {
                                jSONObject3.put(C0708d.f2664t, jSONArrayOptJSONArray2);
                                jSONObject3.remove(str6);
                            }
                            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray2 != null) {
                                ArrayList arrayList = new ArrayList();
                                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                    arrayList.add((JSONObject) jSONArrayOptJSONArray.get(i2));
                                }
                                for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                                    arrayList.add((JSONObject) jSONArrayOptJSONArray2.get(i3));
                                }
                                JSONArraySortUtil jSONArraySortUtil = new JSONArraySortUtil();
                                jSONArraySortUtil.setCompareKey(C0708d.f2668x);
                                Collections.sort(arrayList, jSONArraySortUtil);
                                JSONArray jSONArray3 = new JSONArray();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    jSONArray3.put((JSONObject) it.next());
                                }
                                jSONObject3.put(C0708d.f2664t, jSONArray3);
                                jSONObject3.remove(str6);
                            }
                            if (jSONObject3.has(C0708d.f2664t)) {
                                JSONArray jSONArrayOptJSONArray3 = jSONObject3.optJSONArray(C0708d.f2664t);
                                int i4 = 0;
                                while (i4 < jSONArrayOptJSONArray3.length()) {
                                    JSONObject jSONObject4 = jSONArrayOptJSONArray3.getJSONObject(i4);
                                    if (jSONObject4.has(C0708d.f2668x)) {
                                        str = str5;
                                        try {
                                            jSONObject4.put("ts", jSONObject4.getLong(C0708d.f2668x));
                                            jSONObject4.remove(C0708d.f2668x);
                                        } catch (Exception unused) {
                                            MLog.m2947e("merge pages error");
                                            jSONObject2 = jSONObjectM2493a;
                                            sharedPreferences = PreferenceWrapper.getDefault(f2863a);
                                            if (sharedPreferences != null) {
                                                str4 = str;
                                                string = sharedPreferences.getString(str4, "");
                                                if (!TextUtils.isEmpty(string)) {
                                                    jSONObject2.put(str4, string);
                                                }
                                            }
                                            strArrM2106a = C0637c.m2106a(f2863a);
                                            if (strArrM2106a != null) {
                                                jSONObject = new JSONObject();
                                                jSONObject.put(C0708d.f2597M, strArrM2106a[0]);
                                                jSONObject.put(C0708d.f2598N, strArrM2106a[1]);
                                                if (jSONObject.length() > 0) {
                                                    jSONObject2.put(C0708d.f2596L, jSONObject);
                                                }
                                            }
                                            if (ABTest.getService(f2863a).isInTest()) {
                                                JSONObject jSONObject5 = new JSONObject();
                                                jSONObject5.put(ABTest.getService(f2863a).getTestName(), ABTest.getService(f2863a).getGroupInfo());
                                                jSONObject2.put(C0708d.f2595K, jSONObject5);
                                            }
                                            C0722r.m2613a().m2618a(jSONObject2, f2863a);
                                            return jSONObject2;
                                        }
                                    } else {
                                        str = str5;
                                    }
                                    i4++;
                                    str5 = str;
                                    str6 = str6;
                                }
                                str2 = str5;
                                str3 = str6;
                                jSONObject3.put(C0708d.f2664t, jSONArrayOptJSONArray3);
                                jSONObject3.put(C0708d.f2670z, jSONArrayOptJSONArray3.length());
                            } else {
                                str2 = str5;
                                str3 = str6;
                                jSONObject3.put(C0708d.f2670z, 0);
                            }
                            jSONArray2.put(jSONObject3);
                            i++;
                            str5 = str2;
                            str6 = str3;
                        }
                        str = str5;
                        jSONObjectM2493a.put(C0708d.f2658n, jSONArray2);
                        jSONObject2 = jSONObjectM2493a;
                    } else {
                        str = "userlevel";
                        jSONObject2 = jSONObjectM2493a;
                    }
                } catch (Exception unused2) {
                    str = str5;
                }
            }
            sharedPreferences = PreferenceWrapper.getDefault(f2863a);
            if (sharedPreferences != null) {
                str4 = str;
                string = sharedPreferences.getString(str4, "");
                if (!TextUtils.isEmpty(string)) {
                    jSONObject2.put(str4, string);
                }
            }
            strArrM2106a = C0637c.m2106a(f2863a);
            if (strArrM2106a != null && !TextUtils.isEmpty(strArrM2106a[0]) && !TextUtils.isEmpty(strArrM2106a[1])) {
                jSONObject = new JSONObject();
                jSONObject.put(C0708d.f2597M, strArrM2106a[0]);
                jSONObject.put(C0708d.f2598N, strArrM2106a[1]);
                if (jSONObject.length() > 0) {
                    jSONObject2.put(C0708d.f2596L, jSONObject);
                }
            }
            if (ABTest.getService(f2863a).isInTest()) {
                JSONObject jSONObject6 = new JSONObject();
                jSONObject6.put(ABTest.getService(f2863a).getTestName(), ABTest.getService(f2863a).getGroupInfo());
                jSONObject2.put(C0708d.f2595K, jSONObject6);
            }
            C0722r.m2613a().m2618a(jSONObject2, f2863a);
        } catch (Throwable unused3) {
        }
        return jSONObject2;
    }

    /* JADX INFO: renamed from: m */
    private String m2573m() {
        String string = "0";
        String strImprintProperty = null;
        try {
            strImprintProperty = UMEnvelopeBuild.imprintProperty(f2863a, "pr_ve", null);
            if (!TextUtils.isEmpty(strImprintProperty)) {
                string = strImprintProperty;
            } else {
                if (!TextUtils.isEmpty(this.f2877d)) {
                    return this.f2877d;
                }
                if (this.f2876c == null) {
                    this.f2876c = PreferenceWrapper.getDefault(f2863a);
                }
                String string2 = this.f2876c.getString("pre_version", "");
                String appVersionName = DeviceConfig.getAppVersionName(f2863a);
                if (TextUtils.isEmpty(string2)) {
                    this.f2876c.edit().putString("pre_version", "0").putString("cur_version", appVersionName).commit();
                } else {
                    string = this.f2876c.getString("cur_version", "");
                    if (appVersionName.equals(string)) {
                        string = string2;
                    } else {
                        this.f2876c.edit().putString("pre_version", string).putString("cur_version", appVersionName).commit();
                    }
                }
            }
        } catch (Throwable unused) {
        }
        this.f2877d = string;
        return string;
    }

    /* JADX INFO: renamed from: n */
    private String m2574n() {
        String strImprintProperty = null;
        try {
            strImprintProperty = UMEnvelopeBuild.imprintProperty(f2863a, "ud_da", null);
            if (TextUtils.isEmpty(strImprintProperty)) {
                if (!TextUtils.isEmpty(this.f2878e)) {
                    return this.f2878e;
                }
                if (this.f2876c == null) {
                    this.f2876c = PreferenceWrapper.getDefault(f2863a);
                }
                String string = this.f2876c.getString("pre_date", "");
                if (TextUtils.isEmpty(string)) {
                    string = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    this.f2876c.edit().putString("pre_date", string).commit();
                } else {
                    String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(System.currentTimeMillis()));
                    if (!string.equals(str)) {
                        this.f2876c.edit().putString("pre_date", str).commit();
                        strImprintProperty = str;
                    }
                }
                strImprintProperty = string;
            }
        } catch (Throwable unused) {
        }
        this.f2878e = strImprintProperty;
        return strImprintProperty;
    }

    /* JADX INFO: renamed from: d */
    public void m2593d() {
        try {
            if (this.f2880g.length() > 0) {
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>>*** flushMemoryData: 事件落库。");
                C0713i.m2480a(f2863a).m2495a(this.f2880g);
                this.f2880g = new JSONArray();
            }
            PreferenceWrapper.getDefault(f2863a).edit().putLong("thtstart", this.f2884k).putInt("gkvc", this.f2882i).putInt("ekvc", this.f2883j).commit();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.o$d */
    /* JADX INFO: compiled from: D45J */
    public class d {

        /* JADX INFO: renamed from: a */
        public Map f2928a;

        /* JADX INFO: renamed from: b */
        public String f2929b;

        /* JADX INFO: renamed from: c */
        public String f2930c;

        /* JADX INFO: renamed from: d */
        public long f2931d;

        public d() {
            this.f2928a = null;
            this.f2929b = null;
            this.f2930c = null;
            this.f2931d = 0L;
        }

        public d(String str, Map map, String str2, long j) {
            this.f2928a = map;
            this.f2929b = str;
            this.f2931d = j;
            this.f2930c = str2;
        }

        /* JADX INFO: renamed from: a */
        public Map m2604a() {
            return this.f2928a;
        }

        /* JADX INFO: renamed from: b */
        public String m2605b() {
            return this.f2930c;
        }

        /* JADX INFO: renamed from: c */
        public String m2606c() {
            return this.f2929b;
        }

        /* JADX INFO: renamed from: d */
        public long m2607d() {
            return this.f2931d;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m2560e(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (2050 == jSONObject.getInt("__t")) {
                if (!m2551a(this.f2884k, this.f2882i)) {
                    return;
                } else {
                    this.f2882i++;
                }
            } else if (2049 == jSONObject.getInt("__t")) {
                if (!m2551a(this.f2884k, this.f2883j)) {
                    return;
                } else {
                    this.f2883j++;
                }
            }
            if (AnalyticsConfig.isRealTimeDebugMode()) {
                if (this.f2880g == null) {
                    this.f2880g = new JSONArray();
                }
                this.f2880g.put(jSONObject);
                C0713i.m2480a(f2863a).m2495a(this.f2880g);
                this.f2880g = new JSONArray();
                return;
            }
            if (this.f2880g.length() >= this.f2879f) {
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>>*** 超过10个事件，事件落库。");
                C0713i.m2480a(f2863a).m2495a(this.f2880g);
                this.f2880g = new JSONArray();
            }
            if (this.f2884k == 0) {
                this.f2884k = System.currentTimeMillis();
            }
            this.f2880g.put(jSONObject);
        } catch (Throwable th) {
            MLog.m2951e(th);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m2551a(long j, int i) {
        if (j == 0) {
            return true;
        }
        if (System.currentTimeMillis() - j <= Defcon.MILLIS_8_HOURS) {
            return i < 5000;
        }
        m2575o();
        return true;
    }

    /* JADX INFO: renamed from: o */
    private void m2575o() {
        try {
            this.f2882i = 0;
            this.f2883j = 0;
            this.f2884k = System.currentTimeMillis();
            PreferenceWrapper.getDefault(f2863a).edit().putLong(f2867o, System.currentTimeMillis()).putInt(f2868p, 0).commit();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m2557c(boolean z) {
        if (m2579s() || AnalyticsConfig.isRealTimeDebugMode()) {
            return true;
        }
        if (this.f2875b == null) {
            this.f2875b = new c();
        }
        this.f2875b.m2600a();
        ReportPolicy.ReportStrategy reportStrategyM2603c = this.f2875b.m2603c();
        boolean zShouldSendMessage = reportStrategyM2603c.shouldSendMessage(z);
        if (zShouldSendMessage) {
            if (((reportStrategyM2603c instanceof ReportPolicy.ReportByInterval) || (reportStrategyM2603c instanceof ReportPolicy.DebugPolicy) || (reportStrategyM2603c instanceof ReportPolicy.ReportQuasiRealtime)) && m2576p()) {
                m2593d();
            }
            if ((reportStrategyM2603c instanceof ReportPolicy.DefconPolicy) && m2576p()) {
                m2593d();
            }
            if (UMConfigure.isDebugLog()) {
                MLog.m2941d("数据发送策略 : ".concat(reportStrategyM2603c.getClass().getSimpleName()));
            }
        }
        return zShouldSendMessage;
    }

    /* JADX INFO: renamed from: p */
    private boolean m2576p() {
        try {
            if (!TextUtils.isEmpty(C0725u.m2637a().m2649b())) {
                m2589b(f2863a);
            }
            if (this.f2880g.length() <= 0) {
                return false;
            }
            for (int i = 0; i < this.f2880g.length(); i++) {
                JSONObject jSONObjectOptJSONObject = this.f2880g.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                    String strOptString = jSONObjectOptJSONObject.optString("__i");
                    if (TextUtils.isEmpty(strOptString) || "-1".equals(strOptString)) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.o$c */
    /* JADX INFO: compiled from: D45J */
    public class c {

        /* JADX INFO: renamed from: a */
        public ReportPolicy.ReportStrategy f2922a = null;

        /* JADX INFO: renamed from: b */
        public int f2923b = -1;

        /* JADX INFO: renamed from: c */
        public int f2924c = -1;

        /* JADX INFO: renamed from: d */
        public int f2925d = -1;

        /* JADX INFO: renamed from: e */
        public int f2926e = -1;

        /* JADX INFO: renamed from: f */
        public ABTest f2927f;

        public c() {
            this.f2927f = null;
            this.f2927f = ABTest.getService(C0719o.f2863a);
        }

        /* JADX INFO: renamed from: a */
        public void m2600a() {
            try {
                int[] iArrM2601a = m2601a(-1, -1);
                this.f2923b = iArrM2601a[0];
                this.f2924c = iArrM2601a[1];
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: renamed from: a */
        public int[] m2601a(int i, int i2) {
            int iIntValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C0719o.f2863a, C0770a.f3194p, "-1")).intValue();
            int iIntValue2 = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C0719o.f2863a, C0770a.f3195q, "-1")).intValue();
            if (iIntValue == -1 || !ReportPolicy.isValid(iIntValue)) {
                return new int[]{i, i2};
            }
            if (6 == iIntValue) {
                if (iIntValue2 == -1 || iIntValue2 < 90 || iIntValue2 > 86400) {
                    iIntValue2 = 90;
                }
                return new int[]{iIntValue, iIntValue2 * 1000};
            }
            if (11 == iIntValue) {
                if (iIntValue2 == -1 || iIntValue2 < 15 || iIntValue2 > 3600) {
                    iIntValue2 = 15;
                }
                return new int[]{iIntValue, iIntValue2 * 1000};
            }
            return new int[]{i, i2};
        }

        /* JADX INFO: renamed from: a */
        public int m2599a(int i) {
            int iIntValue = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C0719o.f2863a, "test_report_interval", "-1")).intValue();
            return (iIntValue == -1 || iIntValue < 90 || iIntValue > 86400) ? i : iIntValue * 1000;
        }

        /* JADX INFO: renamed from: b */
        public void m2602b() {
            ReportPolicy.ReportStrategy defconPolicy;
            Defcon service = Defcon.getService(C0719o.f2863a);
            if (!service.isOpen()) {
                int iM2599a = 0;
                boolean z = Integer.valueOf(UMEnvelopeBuild.imprintProperty(C0719o.f2863a, "integrated_test", "-1")).intValue() == 1;
                if (UMConfigure.isDebugLog() && z && !MLog.DEBUG) {
                    UMLog.mutlInfo(C0714j.f2776K, 3, "\\|", null, null);
                }
                if (MLog.DEBUG && z) {
                    this.f2922a = new ReportPolicy.DebugPolicy(StatTracer.getInstance(C0719o.f2863a));
                } else if (this.f2927f.isInTest() && "RPT".equals(this.f2927f.getTestName())) {
                    if (this.f2927f.getTestPolicy() == 6) {
                        if (Integer.valueOf(UMEnvelopeBuild.imprintProperty(C0719o.f2863a, "test_report_interval", "-1")).intValue() != -1) {
                            iM2599a = m2599a(90000);
                        } else {
                            iM2599a = this.f2924c;
                            if (iM2599a <= 0) {
                                iM2599a = this.f2926e;
                            }
                        }
                    }
                    this.f2922a = m2598b(this.f2927f.getTestPolicy(), iM2599a);
                } else {
                    int i = this.f2925d;
                    int i2 = this.f2926e;
                    int i3 = this.f2923b;
                    if (i3 != -1) {
                        i2 = this.f2924c;
                        i = i3;
                    }
                    this.f2922a = m2598b(i, i2);
                }
            } else {
                ReportPolicy.ReportStrategy reportStrategy = this.f2922a;
                if (!(reportStrategy instanceof ReportPolicy.DefconPolicy) || !reportStrategy.isValid()) {
                    defconPolicy = new ReportPolicy.DefconPolicy(StatTracer.getInstance(C0719o.f2863a), service);
                } else {
                    defconPolicy = this.f2922a;
                }
                this.f2922a = defconPolicy;
            }
            if (UMConfigure.isDebugLog()) {
                try {
                    ReportPolicy.ReportStrategy reportStrategy2 = this.f2922a;
                    if (reportStrategy2 instanceof ReportPolicy.ReportAtLaunch) {
                        UMLog.mutlInfo(C0714j.f2774I, 3, "", null, null);
                        return;
                    }
                    if (reportStrategy2 instanceof ReportPolicy.ReportByInterval) {
                        UMLog.mutlInfo(C0714j.f2775J, 3, "", new String[]{"@"}, new String[]{String.valueOf(((ReportPolicy.ReportByInterval) reportStrategy2).getReportInterval() / 1000)});
                    } else if (reportStrategy2 instanceof ReportPolicy.DebugPolicy) {
                        UMLog.mutlInfo(C0714j.f2777L, 3, "", null, null);
                    } else if (reportStrategy2 instanceof ReportPolicy.ReportQuasiRealtime) {
                        UMLog.mutlInfo(C0714j.f2778M, 3, "", new String[]{"@"}, new String[]{String.valueOf(((ReportPolicy.ReportQuasiRealtime) reportStrategy2).getReportInterval() / 1000)});
                    }
                } catch (Throwable unused) {
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public ReportPolicy.ReportStrategy m2603c() {
            m2602b();
            return this.f2922a;
        }

        /* JADX INFO: renamed from: b */
        private ReportPolicy.ReportStrategy m2598b(int i, int i2) {
            if (i == 0) {
                ReportPolicy.ReportStrategy reportStrategy = this.f2922a;
                return reportStrategy instanceof ReportPolicy.ReportRealtime ? reportStrategy : new ReportPolicy.ReportRealtime();
            }
            if (i == 1) {
                ReportPolicy.ReportStrategy reportStrategy2 = this.f2922a;
                return reportStrategy2 instanceof ReportPolicy.ReportAtLaunch ? reportStrategy2 : new ReportPolicy.ReportAtLaunch();
            }
            if (i == 4) {
                ReportPolicy.ReportStrategy reportStrategy3 = this.f2922a;
                return reportStrategy3 instanceof ReportPolicy.ReportDaily ? reportStrategy3 : new ReportPolicy.ReportDaily(StatTracer.getInstance(C0719o.f2863a));
            }
            if (i == 5) {
                ReportPolicy.ReportStrategy reportStrategy4 = this.f2922a;
                return reportStrategy4 instanceof ReportPolicy.ReportWifiOnly ? reportStrategy4 : new ReportPolicy.ReportWifiOnly(C0719o.f2863a);
            }
            if (i == 6) {
                ReportPolicy.ReportStrategy reportStrategy5 = this.f2922a;
                if (reportStrategy5 instanceof ReportPolicy.ReportByInterval) {
                    ((ReportPolicy.ReportByInterval) reportStrategy5).setReportInterval(i2);
                    return reportStrategy5;
                }
                return new ReportPolicy.ReportByInterval(StatTracer.getInstance(C0719o.f2863a), i2);
            }
            if (i == 8) {
                ReportPolicy.ReportStrategy reportStrategy6 = this.f2922a;
                return reportStrategy6 instanceof ReportPolicy.SmartPolicy ? reportStrategy6 : new ReportPolicy.SmartPolicy(StatTracer.getInstance(C0719o.f2863a));
            }
            if (i == 11) {
                ReportPolicy.ReportStrategy reportStrategy7 = this.f2922a;
                if (reportStrategy7 instanceof ReportPolicy.ReportQuasiRealtime) {
                    ((ReportPolicy.ReportQuasiRealtime) reportStrategy7).setReportInterval(i2);
                    return reportStrategy7;
                }
                ReportPolicy.ReportQuasiRealtime reportQuasiRealtime = new ReportPolicy.ReportQuasiRealtime();
                reportQuasiRealtime.setReportInterval(i2);
                return reportQuasiRealtime;
            }
            ReportPolicy.ReportStrategy reportStrategy8 = this.f2922a;
            return reportStrategy8 instanceof ReportPolicy.ReportAtLaunch ? reportStrategy8 : new ReportPolicy.ReportAtLaunch();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m2558d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has(C0795b.m2926a("analytics"))) {
                JSONObject jSONObject4 = jSONObject.getJSONObject(C0795b.m2926a("analytics"));
                if (jSONObject4.has("ekv")) {
                    jSONObject3.put("ekv", jSONObject4.getJSONArray("ekv"));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.m2941d("[埋点验证模式]事件:" + jSONObject3.toString());
                        } else {
                            MLog.m2941d("事件:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(C0708d.f2604T)) {
                    jSONObject3.put(C0708d.f2604T, jSONObject4.getJSONArray(C0708d.f2604T));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.m2941d("[埋点验证模式]游戏事件:" + jSONObject3.toString());
                        } else {
                            MLog.m2941d("游戏事件:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(C0708d.f2599O)) {
                    jSONObject3.put(C0708d.f2599O, jSONObject4.getJSONArray(C0708d.f2599O));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.m2941d("[埋点验证模式]错误:" + jSONObject3.toString());
                        } else {
                            MLog.m2941d("错误:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(C0708d.f2658n)) {
                    JSONArray jSONArray = jSONObject4.getJSONArray(C0708d.f2658n);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            if (jSONObject5.has(C0708d.f2665u)) {
                                jSONObject5.remove(C0708d.f2665u);
                            }
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put(C0708d.f2658n, jSONArray2);
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.m2941d("[埋点验证模式]会话:" + jSONObject3.toString());
                        } else {
                            MLog.m2941d("会话:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(C0708d.f2593I)) {
                    jSONObject3.put(C0708d.f2593I, jSONObject4.getJSONObject(C0708d.f2593I));
                }
                if (jSONObject4.has(C0708d.f2596L)) {
                    jSONObject3.put(C0708d.f2596L, jSONObject4.getJSONObject(C0708d.f2596L));
                    if (jSONObject3.length() > 0) {
                        if (AnalyticsConfig.isRealTimeDebugMode()) {
                            MLog.m2941d("[埋点验证模式]账号:" + jSONObject3.toString());
                        } else {
                            MLog.m2941d("账号:" + jSONObject3.toString());
                        }
                        jSONObject3 = new JSONObject();
                    }
                }
            }
            if (jSONObject.has("dplus")) {
                jSONObject3.put("dplus", jSONObject.getJSONObject("dplus"));
            }
            if (jSONObject.has(C0795b.m2926a("header")) && (jSONObject2 = jSONObject.getJSONObject(C0795b.m2926a("header"))) != null && jSONObject2.length() > 0) {
                if (jSONObject2.has(C0795b.m2926a("sdk_version"))) {
                    jSONObject3.put("sdk_version", jSONObject2.getString(C0795b.m2926a("sdk_version")));
                }
                if (jSONObject2.has(C0795b.m2926a("device_id"))) {
                    jSONObject3.put("device_id", jSONObject2.getString(C0795b.m2926a("device_id")));
                }
                if (jSONObject2.has(C0795b.m2926a("device_model"))) {
                    jSONObject3.put("device_model", jSONObject2.getString(C0795b.m2926a("device_model")));
                }
                if (jSONObject2.has(C0795b.m2926a("version_code"))) {
                    jSONObject3.put("version", jSONObject2.getInt(C0795b.m2926a("version_code")));
                }
                if (jSONObject2.has(C0795b.m2926a("appkey"))) {
                    jSONObject3.put("appkey", jSONObject2.getString(C0795b.m2926a("appkey")));
                }
                if (jSONObject2.has(C0795b.m2926a("channel"))) {
                    jSONObject3.put("channel", jSONObject2.getString(C0795b.m2926a("channel")));
                }
                if (jSONObject3.length() > 0) {
                    MLog.m2941d("基础信息:" + jSONObject3.toString());
                    jSONObject3 = new JSONObject();
                }
            }
            jSONObject3.length();
        } catch (Throwable th) {
            MLog.m2951e(th);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m2561e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.length() <= 0) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject.has(C0795b.m2926a("analytics"))) {
                JSONObject jSONObject4 = jSONObject.getJSONObject(C0795b.m2926a("analytics"));
                if (jSONObject4.has(C0708d.f2658n)) {
                    JSONArray jSONArray = jSONObject4.getJSONArray(C0708d.f2658n);
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject5 = jSONArray.getJSONObject(i);
                        if (jSONObject5 != null && jSONObject5.length() > 0) {
                            jSONArray2.put(jSONObject5);
                        }
                    }
                    jSONObject3.put(C0708d.f2658n, jSONArray2);
                    if (jSONObject3.length() > 0) {
                        MLog.m2941d("本次启动会话:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
                if (jSONObject4.has(C0708d.f2596L)) {
                    jSONObject3.put(C0708d.f2596L, jSONObject4.getJSONObject(C0708d.f2596L));
                    if (jSONObject3.length() > 0) {
                        MLog.m2941d("本次启动账号:" + jSONObject3.toString());
                        jSONObject3 = new JSONObject();
                    }
                }
            }
            if (jSONObject.has(C0795b.m2926a("header")) && jSONObject.has(C0795b.m2926a("header")) && (jSONObject2 = jSONObject.getJSONObject(C0795b.m2926a("header"))) != null && jSONObject2.length() > 0) {
                if (jSONObject2.has(C0795b.m2926a("sdk_version"))) {
                    jSONObject3.put("sdk_version", jSONObject2.getString(C0795b.m2926a("sdk_version")));
                }
                if (jSONObject2.has(C0795b.m2926a("device_id"))) {
                    jSONObject3.put("device_id", jSONObject2.getString(C0795b.m2926a("device_id")));
                }
                if (jSONObject2.has(C0795b.m2926a("device_model"))) {
                    jSONObject3.put("device_model", jSONObject2.getString(C0795b.m2926a("device_model")));
                }
                if (jSONObject2.has(C0795b.m2926a("version_code"))) {
                    jSONObject3.put("version", jSONObject2.getInt(C0795b.m2926a("version_code")));
                }
                if (jSONObject2.has(C0795b.m2926a("appkey"))) {
                    jSONObject3.put("appkey", jSONObject2.getString(C0795b.m2926a("appkey")));
                }
                if (jSONObject2.has(C0795b.m2926a("channel"))) {
                    jSONObject3.put("channel", jSONObject2.getString(C0795b.m2926a("channel")));
                }
                if (jSONObject3.length() > 0) {
                    MLog.m2941d("本次启动基础信息:" + jSONObject3.toString());
                    jSONObject3 = new JSONObject();
                }
            }
            jSONObject3.length();
        } catch (Throwable th) {
            MLog.m2951e(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2582a(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0) {
                    if (jSONObject.has("exception")) {
                        if (101 == jSONObject.getInt("exception")) {
                            return;
                        }
                        m2566g(jSONObject);
                        return;
                    }
                    m2566g(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2590b(Object obj) {
        if (obj != null) {
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0) {
                    if (jSONObject.has("exception")) {
                        if (101 == jSONObject.getInt("exception")) {
                            return;
                        }
                        m2563f(jSONObject);
                        return;
                    }
                    m2563f(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private void m2563f(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        try {
            if (jSONObject.getJSONObject(C0795b.m2926a("header")).has(C0708d.f2613aB)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has(C0795b.m2926a("analytics"))) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(C0795b.m2926a("analytics"));
                    if (jSONObject2.has(C0708d.f2658n) && (jSONObjectOptJSONObject2 = jSONObject2.getJSONArray(C0708d.f2658n).optJSONObject(0)) != null) {
                        String strOptString = jSONObjectOptJSONObject2.optString("id");
                        if (!TextUtils.isEmpty(strOptString)) {
                            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> removeAllInstantData: really delete instant session data");
                            C0713i.m2480a(f2863a).m2502b(strOptString);
                        }
                    }
                }
                C0713i.m2480a(f2863a).m2501b();
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> removeAllInstantData: send INSTANT_SESSION_START_CONTINUE event because OVERSIZE.");
                Context context = f2863a;
                UMWorkDispatch.sendEvent(context, a.f2906l, CoreProtocol.getInstance(context), null);
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has(C0795b.m2926a("analytics")) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(C0795b.m2926a("analytics"))) != null && jSONObjectOptJSONObject.length() > 0 && jSONObjectOptJSONObject.has(C0708d.f2658n)) {
                C0713i.m2480a(f2863a).m2497a(true, false);
            }
            C0713i.m2480a(f2863a).m2501b();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    private void m2566g(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        try {
            if (jSONObject.getJSONObject(C0795b.m2926a("header")).has(C0708d.f2613aB)) {
                if (jSONObject.has("content")) {
                    jSONObject = jSONObject.getJSONObject("content");
                }
                if (jSONObject.has(C0795b.m2926a("analytics"))) {
                    if (jSONObject.getJSONObject(C0795b.m2926a("analytics")).has(C0708d.f2658n)) {
                        C0713i.m2480a(f2863a).m2512i();
                        C0713i.m2480a(f2863a).m2511h();
                        C0713i.m2480a(f2863a).m2503b(true, false);
                        C0713i.m2480a(f2863a).m2494a();
                        return;
                    }
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> Error, Should not go to this branch.");
                    return;
                }
                return;
            }
            if (jSONObject.has("content")) {
                jSONObject = jSONObject.getJSONObject("content");
            }
            if (jSONObject.has(C0795b.m2926a("analytics")) && (jSONObjectOptJSONObject = jSONObject.optJSONObject(C0795b.m2926a("analytics"))) != null && jSONObjectOptJSONObject.length() > 0) {
                if (jSONObjectOptJSONObject.has(C0708d.f2658n)) {
                    C0713i.m2480a(f2863a).m2503b(true, false);
                }
                if (jSONObjectOptJSONObject.has("ekv") || jSONObjectOptJSONObject.has(C0708d.f2604T)) {
                    C0713i.m2480a(f2863a).m2511h();
                }
                if (jSONObjectOptJSONObject.has(C0708d.f2599O)) {
                    C0713i.m2480a(f2863a).m2512i();
                }
            }
            C0713i.m2480a(f2863a).m2494a();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2592c(Object obj) {
        m2589b(f2863a);
        m2593d();
        if (m2559d(false)) {
            m2570j();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2589b(Context context) {
        try {
            C0713i.m2480a(context).m2507d();
            m2577q();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public void m2595e() {
        if (m2559d(false)) {
            m2570j();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2594d(Object obj) {
        m2578r();
        m2573m();
        m2574n();
        m2585a(true);
    }

    /* JADX INFO: renamed from: d */
    private boolean m2559d(boolean z) {
        if (this.f2875b == null) {
            this.f2875b = new c();
        }
        ReportPolicy.ReportStrategy reportStrategyM2603c = this.f2875b.m2603c();
        if (!(reportStrategyM2603c instanceof ReportPolicy.DefconPolicy)) {
            return true;
        }
        if (z) {
            return ((ReportPolicy.DefconPolicy) reportStrategyM2603c).shouldSendMessageByInstant();
        }
        return reportStrategyM2603c.shouldSendMessage(false);
    }

    /* JADX INFO: renamed from: a */
    public void m2584a(Object obj, boolean z) {
        if (z) {
            if (m2559d(true)) {
                m2569i();
            }
        } else if (UMEnvelopeBuild.isOnline(f2863a) && m2559d(true)) {
            m2569i();
        }
    }

    /* JADX INFO: renamed from: q */
    private void m2577q() {
        if (this.f2880g.length() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.f2880g.length(); i++) {
                try {
                    JSONObject jSONObject = this.f2880g.getJSONObject(i);
                    if (jSONObject != null && jSONObject.length() > 0) {
                        String strOptString = jSONObject.optString("__i");
                        String str = "-1";
                        if (TextUtils.isEmpty(strOptString) || "-1".equals(strOptString)) {
                            String strM2649b = C0725u.m2637a().m2649b();
                            if (!TextUtils.isEmpty(strM2649b)) {
                                str = strM2649b;
                            }
                            jSONObject.put("__i", str);
                        }
                        jSONArray.put(jSONObject);
                    } else {
                        jSONArray.put(jSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            this.f2880g = jSONArray;
        }
    }

    /* JADX INFO: renamed from: r */
    private void m2578r() {
        Context context;
        SharedPreferences sharedPreferences;
        try {
            if (!m2579s() || (context = f2863a) == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null || sharedPreferences.getLong("first_activate_time", 0L) != 0) {
                return;
            }
            sharedPreferences.edit().putLong("first_activate_time", System.currentTimeMillis()).commit();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public long m2596f() {
        SharedPreferences sharedPreferences;
        long jCurrentTimeMillis = 0;
        try {
            Context context = f2863a;
            if (context == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null) {
                return 0L;
            }
            long j = sharedPreferences.getLong("first_activate_time", 0L);
            if (j != 0) {
                return j;
            }
            try {
                jCurrentTimeMillis = System.currentTimeMillis();
                sharedPreferences.edit().putLong("first_activate_time", jCurrentTimeMillis).commit();
                return jCurrentTimeMillis;
            } catch (Throwable unused) {
                return j;
            }
        } catch (Throwable unused2) {
            return jCurrentTimeMillis;
        }
    }

    /* JADX INFO: renamed from: s */
    private boolean m2579s() {
        SharedPreferences sharedPreferences;
        try {
            Context context = f2863a;
            return (context == null || (sharedPreferences = PreferenceWrapper.getDefault(context)) == null || sharedPreferences.getLong(f2865m, -1L) == 0) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: f */
    private void m2562f(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                long j = jSONObject.getLong("ts");
                m2589b(f2863a);
                m2593d();
                String[] strArrM2106a = C0637c.m2106a(f2863a);
                if (strArrM2106a == null || TextUtils.isEmpty(strArrM2106a[0]) || TextUtils.isEmpty(strArrM2106a[1])) {
                    return;
                }
                C0725u.m2637a().m2645a(f2863a, j);
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> onProfileSignIn: force generate new session: session id = " + C0729y.m2667a().m2681c(f2863a));
                boolean zM2652b = C0725u.m2637a().m2652b(f2863a, j, false);
                C0637c.m2107b(f2863a);
                C0725u.m2637a().m2644a(f2863a, j, true);
                if (zM2652b) {
                    C0725u.m2637a().m2650b(f2863a, j);
                }
            }
        } catch (Throwable th) {
            if (MLog.DEBUG) {
                MLog.m2949e(" Excepthon  in  onProfileSignOff", th);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m2565g(Object obj) {
        try {
            m2589b(f2863a);
            m2593d();
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject != null && jSONObject.length() > 0) {
                String string = jSONObject.getString(C0708d.f2597M);
                String string2 = jSONObject.getString(DhizukuVariables.PARAM_CLIENT_UID);
                long j = jSONObject.getLong("ts");
                String[] strArrM2106a = C0637c.m2106a(f2863a);
                if (strArrM2106a != null && string.equals(strArrM2106a[0]) && string2.equals(strArrM2106a[1])) {
                    return;
                }
                C0725u.m2637a().m2645a(f2863a, j);
                String strM2681c = C0729y.m2667a().m2681c(f2863a);
                boolean zM2652b = C0725u.m2637a().m2652b(f2863a, j, false);
                C0637c.m2105a(f2863a, string, string2);
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> onProfileSignIn: force generate new session: session id = " + strM2681c);
                C0725u.m2637a().m2644a(f2863a, j, true);
                if (zM2652b) {
                    C0725u.m2637a().m2650b(f2863a, j);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    private void m2568h(Object obj) {
        try {
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null || jSONObject.length() <= 0 || !jSONObject.has("__ii")) {
                return;
            }
            String strOptString = jSONObject.optString("__ii");
            jSONObject.remove("__ii");
            if (TextUtils.isEmpty(strOptString)) {
                return;
            }
            C0713i.m2480a(f2863a).m2498a(strOptString, obj.toString(), 2);
        } catch (Throwable unused) {
        }
    }
}
