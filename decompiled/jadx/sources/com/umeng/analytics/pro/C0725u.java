package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.C0636b;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.process.UMProcessDBDatasSender;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.C0832d;
import com.umeng.commonsdk.utils.UMUtils;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.analytics.pro.u */
/* JADX INFO: compiled from: X4HS */
/* JADX INFO: loaded from: classes.dex */
public class C0725u implements C0729y.a {

    /* JADX INFO: renamed from: a */
    public static final String f2949a = "session_start_time";

    /* JADX INFO: renamed from: b */
    public static final String f2950b = "session_end_time";

    /* JADX INFO: renamed from: c */
    public static final String f2951c = "session_id";

    /* JADX INFO: renamed from: d */
    public static final String f2952d = "pre_session_id";

    /* JADX INFO: renamed from: e */
    public static final String f2953e = "a_start_time";

    /* JADX INFO: renamed from: f */
    public static final String f2954f = "a_end_time";

    /* JADX INFO: renamed from: g */
    public static final String f2955g = "fg_count";

    /* JADX INFO: renamed from: h */
    public static String f2956h = null;

    /* JADX INFO: renamed from: i */
    public static Context f2957i = null;

    /* JADX INFO: renamed from: j */
    public static boolean f2958j = false;

    /* JADX INFO: renamed from: k */
    public static long f2959k = 0;

    /* JADX INFO: renamed from: l */
    public static boolean f2960l = true;

    /* JADX INFO: renamed from: m */
    public static long f2961m;

    public C0725u() {
        C0729y.m2667a().m2677a(this);
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.u$a */
    /* JADX INFO: compiled from: X4HS */
    public class a {

        /* JADX INFO: renamed from: a */
        public static final C0725u f2962a = new C0725u();
    }

    /* JADX INFO: renamed from: a */
    public static C0725u m2637a() {
        return a.f2962a;
    }

    /* JADX INFO: renamed from: d */
    private void m2641d(Context context) {
        try {
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(context).edit();
            editorEdit.putLong(f2955g, 0L);
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m2636a(Context context) {
        try {
            return PreferenceWrapper.getDefault(context).getLong(f2955g, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2640b(Context context) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2957i);
        if (sharedPreferences != null) {
            long j = sharedPreferences.getLong(f2955g, 0L);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit != null) {
                editorEdit.putLong(f2955g, j + 1);
                editorEdit.commit();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m2645a(Context context, long j) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2957i);
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.putLong(f2949a, j);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: a */
    public void m2646a(Context context, Object obj) {
        SharedPreferences.Editor editorEdit;
        try {
            if (f2957i == null && context != null) {
                f2957i = context.getApplicationContext();
            }
            long jLongValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2957i);
            if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null) {
                String string = sharedPreferences.getString(C0708d.f2645az, "");
                String appVersionName = UMUtils.getAppVersionName(f2957i);
                if (TextUtils.isEmpty(string)) {
                    editorEdit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(context)));
                    editorEdit.putString(C0708d.f2645az, appVersionName);
                    editorEdit.commit();
                } else if (!string.equals(appVersionName)) {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> onStartSessionInternal: upgrade version: " + string + "-> " + appVersionName);
                    int i = sharedPreferences.getInt("versioncode", 0);
                    String string2 = sharedPreferences.getString("pre_date", "");
                    String string3 = sharedPreferences.getString("pre_version", "");
                    String string4 = sharedPreferences.getString(C0708d.f2645az, "");
                    editorEdit.putInt("versioncode", Integer.parseInt(UMUtils.getAppVersionCode(context)));
                    editorEdit.putString(C0708d.f2645az, appVersionName);
                    editorEdit.putString("vers_date", string2);
                    editorEdit.putString("vers_pre_version", string3);
                    editorEdit.putString("cur_version", string4);
                    editorEdit.putInt("vers_code", i);
                    editorEdit.putString("vers_name", string);
                    editorEdit.commit();
                    if (f2960l) {
                        f2960l = false;
                    }
                    if (f2958j) {
                        f2958j = false;
                        m2652b(f2957i, jLongValue, true);
                        m2650b(f2957i, jLongValue);
                        return;
                    }
                    return;
                }
                if (f2958j) {
                    f2958j = false;
                    if (f2960l) {
                        f2960l = false;
                    }
                    f2956h = m2642e(context);
                    MLog.m2941d("创建新会话: " + f2956h);
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "mSessionChanged flag has been set, Start new session: " + f2956h);
                    return;
                }
                f2956h = sharedPreferences.getString("session_id", null);
                editorEdit.putLong(f2953e, jLongValue);
                editorEdit.putLong(f2954f, 0L);
                editorEdit.commit();
                MLog.m2941d("延续上一个会话: " + f2956h);
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "Extend current session: " + f2956h);
                if (f2960l) {
                    f2960l = false;
                    if (FieldManager.allow(C0832d.f3591E)) {
                        Context context2 = f2957i;
                        UMWorkDispatch.sendEventEx(context2, C0719o.a.f2892D, CoreProtocol.getInstance(context2), null, 0L);
                    }
                }
                m2643f(context);
                C0719o.m2548a(f2957i).m2585a(false);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2651b(Context context, Object obj) {
        long jLongValue;
        try {
            if (f2957i == null) {
                f2957i = UMGlobalContext.getAppContext(context);
            }
            if (obj == null) {
                jLongValue = System.currentTimeMillis();
            } else {
                jLongValue = ((Long) obj).longValue();
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2957i);
            if (sharedPreferences == null) {
                return;
            }
            f2959k = sharedPreferences.getLong(f2954f, 0L);
            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime: " + f2959k);
            String string = sharedPreferences.getString(C0708d.f2645az, "");
            String appVersionName = UMUtils.getAppVersionName(f2957i);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (editorEdit == null) {
                return;
            }
            if (!TextUtils.isEmpty(string) && !string.equals(appVersionName)) {
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> requestNewInstantSessionIf: version upgrade");
                editorEdit.putLong(f2949a, jLongValue);
                editorEdit.commit();
                C0719o.m2548a(f2957i).m2584a((Object) null, true);
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> force generate new session: session id = " + C0729y.m2667a().m2681c(f2957i));
                f2958j = true;
                m2644a(f2957i, jLongValue, true);
                return;
            }
            if (C0729y.m2667a().m2683e(f2957i)) {
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> More then 30 sec from last session.");
                f2958j = true;
                editorEdit.putLong(f2949a, jLongValue);
                editorEdit.commit();
                m2644a(f2957i, jLongValue, false);
                return;
            }
            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> less then 30 sec from last session, do nothing.");
            f2958j = false;
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public String m2644a(Context context, long j, boolean z) {
        String strM2679b = C0729y.m2667a().m2679b(context);
        UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> onInstantSessionInternal: current session id = " + strM2679b);
        if (TextUtils.isEmpty(strM2679b)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__e", j);
            JSONObject jSONObjectM2077b = C0636b.m2050a().m2077b();
            if (jSONObjectM2077b != null && jSONObjectM2077b.length() > 0) {
                jSONObject.put("__sp", jSONObjectM2077b);
            }
            JSONObject jSONObjectM2082c = C0636b.m2050a().m2082c();
            if (jSONObjectM2082c != null && jSONObjectM2082c.length() > 0) {
                jSONObject.put("__pp", jSONObjectM2082c);
            }
            C0713i.m2480a(context).m2499a(strM2679b, jSONObject, C0713i.a.INSTANTSESSIONBEGIN);
            C0719o.m2548a(context).m2584a(jSONObject, z);
        } catch (Throwable unused) {
        }
        return strM2679b;
    }

    /* JADX INFO: renamed from: c */
    public void m2655c(Context context, Object obj) {
        try {
            if (f2957i == null && context != null) {
                f2957i = context.getApplicationContext();
            }
            long jLongValue = ((Long) obj).longValue();
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences == null) {
                return;
            }
            if (sharedPreferences.getLong(f2953e, 0L) == 0) {
                MLog.m2947e("onPause called before onResume");
                return;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> onEndSessionInternal: write activity end time = " + jLongValue);
            editorEdit.putLong(f2954f, jLongValue);
            editorEdit.putLong(f2950b, jLongValue);
            editorEdit.commit();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    private String m2642e(Context context) {
        if (f2957i == null && context != null) {
            f2957i = context.getApplicationContext();
        }
        String strM2682d = C0729y.m2667a().m2682d(f2957i);
        try {
            m2643f(context);
            C0719o.m2548a(f2957i).m2594d((Object) null);
        } catch (Throwable unused) {
        }
        return strM2682d;
    }

    /* JADX INFO: renamed from: f */
    private void m2643f(Context context) {
        C0719o.m2548a(context).m2589b(context);
        C0719o.m2548a(context).m2593d();
    }

    /* JADX INFO: renamed from: b */
    public boolean m2652b(Context context, long j, boolean z) {
        String strM2674a;
        long j2;
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences != null && (strM2674a = C0729y.m2667a().m2674a(f2957i)) != null) {
                long j3 = sharedPreferences.getLong(f2953e, 0L);
                long j4 = sharedPreferences.getLong(f2954f, 0L);
                if (j3 <= 0 || j4 != 0) {
                    return false;
                }
                try {
                    if (z) {
                        j2 = f2959k;
                        if (j2 == 0) {
                            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime = 0, In-app upgrade, use currentTime: = " + j);
                            j2 = j;
                        } else {
                            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "------>>> lastActivityEndTime != 0, app upgrade, use lastActivityEndTime: = " + f2959k);
                        }
                        m2655c(f2957i, Long.valueOf(j2));
                    } else {
                        m2655c(f2957i, Long.valueOf(j));
                        j2 = j;
                    }
                    JSONObject jSONObject = new JSONObject();
                    if (z) {
                        jSONObject.put(C0709e.d.a.f2720g, j2);
                    } else {
                        jSONObject.put(C0709e.d.a.f2720g, j);
                    }
                    JSONObject jSONObjectM2077b = C0636b.m2050a().m2077b();
                    if (jSONObjectM2077b != null && jSONObjectM2077b.length() > 0) {
                        jSONObject.put("__sp", jSONObjectM2077b);
                    }
                    JSONObject jSONObjectM2082c = C0636b.m2050a().m2082c();
                    if (jSONObjectM2082c != null && jSONObjectM2082c.length() > 0) {
                        jSONObject.put("__pp", jSONObjectM2082c);
                    }
                    if (FieldManager.allow(C0832d.f3591E)) {
                        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>>*** foregroundCount = " + f2961m);
                        jSONObject.put(C0709e.d.a.f2721h, f2961m);
                        f2961m = 0L;
                    } else {
                        jSONObject.put(C0709e.d.a.f2721h, 0L);
                    }
                    C0713i.m2480a(context).m2499a(strM2674a, jSONObject, C0713i.a.END);
                    C0719o.m2548a(f2957i).m2595e();
                } catch (Throwable unused) {
                }
                return true;
            }
            return false;
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2650b(Context context, long j) {
        if (PreferenceWrapper.getDefault(context) == null) {
            return;
        }
        try {
            C0719o.m2548a(f2957i).m2592c((Object) null);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public String m2649b() {
        return f2956h;
    }

    /* JADX INFO: renamed from: c */
    public String m2654c(Context context) {
        try {
            if (f2956h == null) {
                return PreferenceWrapper.getDefault(context).getString("session_id", null);
            }
        } catch (Throwable unused) {
        }
        return f2956h;
    }

    /* JADX INFO: renamed from: c */
    public String m2653c() {
        return m2654c(f2957i);
    }

    @Override // com.umeng.analytics.pro.C0729y.a
    /* JADX INFO: renamed from: a */
    public void mo2648a(String str, String str2, long j, long j2, long j3) {
        m2638a(f2957i, str2, j, j2, j3);
        UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "saveSessionToDB: complete");
        if (AnalyticsConstants.SUB_PROCESS_EVENT) {
            Context context = f2957i;
            UMWorkDispatch.sendEvent(context, 36945, UMProcessDBDatasSender.getInstance(context), Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.umeng.analytics.pro.C0729y.a
    /* JADX INFO: renamed from: a */
    public void mo2647a(String str, long j, long j2, long j3) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m2639a(str, j);
    }

    /* JADX INFO: renamed from: a */
    private void m2638a(Context context, String str, long j, long j2, long j3) {
        if (TextUtils.isEmpty(f2956h)) {
            f2956h = C0729y.m2667a().m2674a(f2957i);
        }
        if (TextUtils.isEmpty(str) || str.equals(f2956h)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0709e.d.a.f2720g, j2);
            jSONObject.put(C0709e.d.a.f2721h, j3);
            JSONObject jSONObjectM2077b = C0636b.m2050a().m2077b();
            if (jSONObjectM2077b != null && jSONObjectM2077b.length() > 0) {
                jSONObject.put("__sp", jSONObjectM2077b);
            }
            JSONObject jSONObjectM2082c = C0636b.m2050a().m2082c();
            if (jSONObjectM2082c != null && jSONObjectM2082c.length() > 0) {
                jSONObject.put("__pp", jSONObjectM2082c);
            }
            C0713i.m2480a(context).m2499a(f2956h, jSONObject, C0713i.a.END);
        } catch (Exception unused) {
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("__e", j);
            C0713i.m2480a(context).m2499a(str, jSONObject2, C0713i.a.BEGIN);
            if (FieldManager.allow(C0832d.f3591E)) {
                f2961m = j3;
                m2641d(context);
                Context context2 = f2957i;
                UMWorkDispatch.sendEventEx(context2, C0719o.a.f2892D, CoreProtocol.getInstance(context2), null, 0L);
            }
        } catch (Exception unused2) {
        }
        f2956h = str;
    }

    /* JADX INFO: renamed from: a */
    private void m2639a(String str, long j) {
        SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(f2957i);
        if (sharedPreferences == null) {
            return;
        }
        long j2 = sharedPreferences.getLong(f2950b, 0L);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__ii", str);
            jSONObject.put("__e", j);
            jSONObject.put(C0709e.d.a.f2720g, j2);
            double[] location = AnalyticsConfig.getLocation();
            if (location != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C0708d.f2587C, location[0]);
                jSONObject2.put(C0708d.f2588D, location[1]);
                jSONObject2.put("ts", System.currentTimeMillis());
                jSONObject.put(C0709e.d.a.f2718e, jSONObject2);
            }
            Class<?> cls = Class.forName("android.net.TrafficStats");
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("getUidRxBytes", cls2);
            Method method2 = cls.getMethod("getUidTxBytes", cls2);
            int i = f2957i.getApplicationInfo().uid;
            if (i == -1) {
                return;
            }
            long jLongValue = ((Long) method.invoke(null, Integer.valueOf(i))).longValue();
            long jLongValue2 = ((Long) method2.invoke(null, Integer.valueOf(i))).longValue();
            if (jLongValue > 0 && jLongValue2 > 0) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(C0708d.f2592H, jLongValue);
                jSONObject3.put(C0708d.f2591G, jLongValue2);
                jSONObject.put(C0709e.d.a.f2717d, jSONObject3);
            }
            C0713i.m2480a(f2957i).m2499a(str, jSONObject, C0713i.a.NEWSESSION);
            C0726v.m2657a(f2957i);
            C0716l.m2527c(f2957i);
        } catch (Throwable unused) {
        }
    }
}
