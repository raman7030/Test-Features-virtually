package com.umeng.analytics.pro;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.umeng.analytics.C0636b;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.vshelper.C0742b;
import com.umeng.analytics.vshelper.InterfaceC0741a;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.C0832d;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.analytics.pro.l */
/* JADX INFO: compiled from: Q5HZ */
/* JADX INFO: loaded from: classes.dex */
public class C0716l {

    /* JADX INFO: renamed from: a */
    public static String f2836a;

    /* JADX INFO: renamed from: b */
    public boolean f2845b;

    /* JADX INFO: renamed from: c */
    public boolean f2846c;

    /* JADX INFO: renamed from: f */
    public InterfaceC0741a f2847f;

    /* JADX INFO: renamed from: g */
    public Application.ActivityLifecycleCallbacks f2848g;

    /* JADX INFO: renamed from: h */
    public final Map f2849h;

    /* JADX INFO: renamed from: l */
    public boolean f2850l;

    /* JADX INFO: renamed from: m */
    public int f2851m;

    /* JADX INFO: renamed from: n */
    public int f2852n;

    /* JADX INFO: renamed from: i */
    public static JSONArray f2839i = new JSONArray();

    /* JADX INFO: renamed from: j */
    public static Object f2840j = new Object();

    /* JADX INFO: renamed from: k */
    public static Application f2841k = null;

    /* JADX INFO: renamed from: d */
    public static String f2837d = null;

    /* JADX INFO: renamed from: e */
    public static int f2838e = -1;

    /* JADX INFO: renamed from: o */
    public static boolean f2842o = true;

    /* JADX INFO: renamed from: p */
    public static Object f2843p = new Object();

    /* JADX INFO: renamed from: q */
    public static InterfaceC0660ar f2844q = new C0742b();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m2516a(C0716l c0716l) {
        int i = c0716l.f2852n;
        c0716l.f2852n = i - 1;
        return i;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m2522b(C0716l c0716l) {
        int i = c0716l.f2851m;
        c0716l.f2851m = i - 1;
        return i;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m2530e(C0716l c0716l) {
        int i = c0716l.f2852n;
        c0716l.f2852n = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int m2532f(C0716l c0716l) {
        int i = c0716l.f2851m;
        c0716l.f2851m = i + 1;
        return i;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2535a() {
        return this.f2850l;
    }

    /* JADX INFO: renamed from: com.umeng.analytics.pro.l$a */
    /* JADX INFO: compiled from: Q5HZ */
    public class a {

        /* JADX INFO: renamed from: a */
        public static final C0716l f2854a = new C0716l();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C0716l m2517a(Context context) {
        if (f2841k == null && context != null) {
            if (context instanceof Activity) {
                f2841k = ((Activity) context).getApplication();
            } else if (context instanceof Application) {
                f2841k = (Application) context;
            }
        }
        return a.f2854a;
    }

    /* JADX INFO: renamed from: b */
    public void m2537b(Context context) {
        synchronized (f2843p) {
            if (f2842o) {
                f2842o = false;
                Activity globleActivity = DeviceConfig.getGlobleActivity(context);
                if (globleActivity == null) {
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: 无前台Activity，直接退出。");
                    return;
                }
                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: 补救成功，前台Activity名：" + globleActivity.getLocalClassName());
                m2518a(globleActivity);
                return;
            }
            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> init触发onResume: firstResumeCall = false，直接返回。");
        }
    }

    public C0716l() {
        this.f2849h = new HashMap();
        this.f2850l = false;
        this.f2845b = false;
        this.f2846c = false;
        this.f2851m = 0;
        this.f2852n = 0;
        this.f2847f = PageNameMonitor.getInstance();
        this.f2848g = new Application.ActivityLifecycleCallbacks() { // from class: com.umeng.analytics.pro.l.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                UMLog uMLog = UMConfigure.umDebugLog;
                MobclickAgent.PageMode pageMode = MobclickAgent.PageMode.AUTO;
                if (activity != null) {
                    if (activity.isChangingConfigurations()) {
                        C0716l.m2516a(C0716l.this);
                        return;
                    }
                    C0716l.m2522b(C0716l.this);
                    if (C0716l.this.f2851m <= 0) {
                        if (C0716l.f2838e == 0 && UMUtils.isMainProgress(activity)) {
                            return;
                        }
                        int i = C0716l.f2838e;
                        if (i == 1 || (i == 0 && !UMUtils.isMainProgress(activity))) {
                            HashMap map = new HashMap();
                            map.put("pairUUID", C0716l.f2837d);
                            map.put("reason", "Normal");
                            map.put("pid", Integer.valueOf(Process.myPid()));
                            map.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            map.put("activityName", activity.toString());
                            C0636b c0636bM2050a = C0636b.m2050a();
                            if (c0636bM2050a != null) {
                                c0636bM2050a.m2065a((Context) activity, "$$_onUMengEnterBackground", (Map) map);
                            }
                            if (C0716l.f2837d != null) {
                                C0716l.f2837d = null;
                            }
                        }
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                if (activity != null) {
                    if (C0716l.this.f2851m <= 0) {
                        if (C0716l.f2837d == null) {
                            C0716l.f2837d = UUID.randomUUID().toString();
                        }
                        if (C0716l.f2838e == -1) {
                            C0716l.f2838e = activity.isTaskRoot() ? 1 : 0;
                        }
                        if (C0716l.f2838e == 0 && UMUtils.isMainProgress(activity)) {
                            HashMap map = new HashMap();
                            map.put("activityName", activity.toString());
                            map.put("pid", Integer.valueOf(Process.myPid()));
                            map.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            C0636b c0636bM2050a = C0636b.m2050a();
                            if (c0636bM2050a != null) {
                                c0636bM2050a.m2065a((Context) activity, "$$_onUMengEnterForegroundInitError", (Map) map);
                            }
                            C0716l.f2838e = -2;
                            if (UMConfigure.isDebugLog()) {
                                UMLog.mutlInfo(2, C0714j.f2810ar);
                            }
                        } else if (C0716l.f2838e == 1 || !UMUtils.isMainProgress(activity)) {
                            HashMap map2 = new HashMap();
                            map2.put("pairUUID", C0716l.f2837d);
                            map2.put("pid", Integer.valueOf(Process.myPid()));
                            map2.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(activity) ? 1 : 0));
                            map2.put("activityName", activity.toString());
                            if (C0636b.m2050a() != null) {
                                C0636b.m2050a().m2065a((Context) activity, "$$_onUMengEnterForeground", (Map) map2);
                            }
                        }
                    }
                    if (C0716l.this.f2852n < 0) {
                        C0716l.m2530e(C0716l.this);
                    } else {
                        C0716l.m2532f(C0716l.this);
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                if (FieldManager.allow(C0832d.f3592F)) {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> onActivityResumed: FirstResumeTrigger enabled.");
                    synchronized (C0716l.f2843p) {
                        if (C0716l.f2842o) {
                            boolean unused = C0716l.f2842o = false;
                        }
                    }
                    C0716l.this.m2518a(activity);
                } else {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> onActivityResumed: FirstResumeTrigger disabled.");
                    C0716l.this.m2518a(activity);
                }
                C0716l.f2844q.mo2249c(activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                if (FieldManager.allow(C0832d.f3592F)) {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> onActivityPaused: FirstResumeTrigger enabled.");
                    synchronized (C0716l.f2843p) {
                        if (C0716l.f2842o) {
                            return;
                        }
                    }
                } else {
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> onActivityPaused: FirstResumeTrigger disabled.");
                }
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO) {
                    C0716l.this.m2526c(activity);
                    C0636b.m2050a().m2098i();
                    C0716l.this.f2845b = false;
                    C0716l.f2844q.mo2250d(activity);
                    return;
                }
                if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.MANUAL) {
                    C0636b.m2050a().m2098i();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                C0716l.f2844q.mo2244a(activity, bundle);
            }
        };
        synchronized (this) {
            if (f2841k != null) {
                m2534g();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m2534g() {
        if (this.f2850l) {
            return;
        }
        this.f2850l = true;
        if (f2841k != null) {
            f2841k.registerActivityLifecycleCallbacks(this.f2848g);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2536b() {
        this.f2850l = false;
        if (f2841k != null) {
            f2841k.unregisterActivityLifecycleCallbacks(this.f2848g);
            f2841k = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2538c() {
        m2526c((Activity) null);
        m2536b();
    }

    /* JADX INFO: renamed from: a */
    public static void m2519a(Context context, String str) {
        if (f2838e == 1 && UMUtils.isMainProgress(context)) {
            HashMap map = new HashMap();
            map.put("pairUUID", f2837d);
            map.put("reason", str);
            if (f2837d != null) {
                f2837d = null;
            }
            if (context != null) {
                map.put("pid", Integer.valueOf(Process.myPid()));
                map.put("isMainProcess", Integer.valueOf(UMUtils.isMainProgress(context) ? 1 : 0));
                map.put("Context", context.toString());
                C0636b.m2050a().m2065a(context, "$$_onUMengEnterBackground", (Map) map);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2527c(Context context) {
        String string;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f2840j) {
                    string = f2839i.toString();
                    f2839i = new JSONArray();
                }
                if (string.length() > 0) {
                    jSONObject.put(C0709e.d.a.f2716c, new JSONArray(string));
                    C0713i.m2480a(context).m2499a(C0725u.m2637a().m2653c(), jSONObject, C0713i.a.AUTOPAGE);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m2518a(Activity activity) {
        if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION != MobclickAgent.PageMode.AUTO) {
            if (UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.MANUAL) {
                synchronized (f2843p) {
                    C0636b.m2050a().m2097h();
                }
                return;
            }
            return;
        }
        if (activity != null) {
            String str = activity.getPackageName() + "." + activity.getLocalClassName();
            this.f2847f.activityResume(str);
            if (this.f2845b) {
                this.f2845b = false;
                if (!TextUtils.isEmpty(f2836a)) {
                    if (f2836a.equals(str)) {
                        return;
                    }
                    m2523b(activity);
                    synchronized (f2843p) {
                        C0636b.m2050a().m2097h();
                    }
                    return;
                }
                f2836a = str;
                return;
            }
            m2523b(activity);
            synchronized (f2843p) {
                C0636b.m2050a().m2097h();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2523b(Activity activity) {
        f2836a = activity.getPackageName() + "." + activity.getLocalClassName();
        synchronized (this.f2849h) {
            this.f2849h.put(f2836a, Long.valueOf(System.currentTimeMillis()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m2526c(Activity activity) {
        long jLongValue;
        long jCurrentTimeMillis;
        try {
            synchronized (this.f2849h) {
                if (f2836a == null && activity != null) {
                    f2836a = activity.getPackageName() + "." + activity.getLocalClassName();
                }
                if (TextUtils.isEmpty(f2836a) || !this.f2849h.containsKey(f2836a)) {
                    jLongValue = 0;
                    jCurrentTimeMillis = 0;
                } else {
                    jLongValue = ((Long) this.f2849h.get(f2836a)).longValue();
                    jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                    this.f2849h.remove(f2836a);
                }
            }
            synchronized (f2840j) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C0708d.f2666v, f2836a);
                    jSONObject.put("duration", jCurrentTimeMillis);
                    jSONObject.put(C0708d.f2668x, jLongValue);
                    jSONObject.put("type", 0);
                    f2839i.put(jSONObject);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
        }
    }
}
