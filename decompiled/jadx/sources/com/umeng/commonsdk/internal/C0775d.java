package com.umeng.commonsdk.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.inputmethod.InputMethodInfo;
import com.umeng.analytics.pro.C0655am;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.internal.utils.C0776a;
import com.umeng.commonsdk.internal.utils.C0779d;
import com.umeng.commonsdk.internal.utils.C0785j;
import com.umeng.commonsdk.internal.utils.C0786k;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.C0832d;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.commonsdk.internal.d */
/* JADX INFO: compiled from: 2478 */
/* JADX INFO: loaded from: classes.dex */
public class C0775d {
    /* JADX INFO: renamed from: a */
    public static void m2812a(Context context) {
        try {
            ULog.m2986i("walle", "[internal] workEvent send envelope");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0655am.f2286aN, C0771a.f3220e);
            JSONObject jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(context, jSONObject, m2819d(context), UMServerURL.PATH_ANALYTICS, C0655am.f2275aC, C0771a.f3220e);
            if (jSONObjectBuildEnvelopeWithExtHeader == null || jSONObjectBuildEnvelopeWithExtHeader.has("exception")) {
                return;
            }
            ULog.m2986i("walle", "[internal] workEvent send envelope back, result is ok");
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2816b(Context context) {
        ULog.m2986i("walle", "[internal] begin by stateful--->>>");
        if (context != null) {
            m2825j(context);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2818c(Context context) {
        ULog.m2986i("walle", "[internal] begin by stateful--->>>");
        if (context == null || !UMEnvelopeBuild.getTransmissionSendFlag()) {
            return;
        }
        m2825j(context);
    }

    /* JADX INFO: renamed from: j */
    public static void m2825j(Context context) {
        try {
            if (UMEnvelopeBuild.isReadyBuild(context, UMLogDataProtocol.UMBusinessType.U_INTERNAL)) {
                UMWorkDispatch.sendEvent(context, 32769, C0772b.m2790a(context).m2791a(), null, 5000L);
            }
            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 冷启动：5秒后触发2号数据仓遗留信封检查动作。");
            UMWorkDispatch.sendEvent(context, C0771a.f3237v, C0772b.m2790a(context).m2791a(), null, 5000L);
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m2819d(Context context) {
        JSONObject jSONObjectM2815b;
        JSONArray jSONArrayM2823h;
        JSONObject jSONObjectM2811a;
        JSONArray jSONArrayM2827l;
        JSONArray jSONArrayM2826k;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            try {
                if (FieldManager.allow(C0832d.f3596J) && (jSONArrayM2826k = m2826k(applicationContext)) != null && jSONArrayM2826k.length() > 0) {
                    jSONObject2.put("rs", jSONArrayM2826k);
                }
            } catch (Exception e) {
                UMCrashManager.reportCrash(applicationContext, e);
            }
            try {
                if (FieldManager.allow(C0832d.f3628ao) && (jSONArrayM2827l = m2827l(applicationContext)) != null && jSONArrayM2827l.length() > 0) {
                    jSONObject2.put("by", jSONArrayM2827l);
                }
            } catch (Exception e2) {
                UMCrashManager.reportCrash(applicationContext, e2);
            }
            try {
                m2813a(applicationContext, jSONObject2);
            } catch (Exception e3) {
                UMCrashManager.reportCrash(applicationContext, e3);
            }
            try {
                m2817b(applicationContext, jSONObject2);
            } catch (Exception e4) {
                UMCrashManager.reportCrash(applicationContext, e4);
            }
            try {
                if (FieldManager.allow(C0832d.f3629ap) && (jSONObjectM2811a = m2811a()) != null && jSONObjectM2811a.length() > 0) {
                    jSONObject2.put("build", jSONObjectM2811a);
                }
            } catch (Exception e5) {
                UMCrashManager.reportCrash(applicationContext, e5);
            }
            try {
                JSONObject jSONObjectM2820e = m2820e(applicationContext);
                if (jSONObjectM2820e != null && jSONObjectM2820e.length() > 0) {
                    jSONObject2.put("scr", jSONObjectM2820e);
                }
            } catch (Exception e6) {
                UMCrashManager.reportCrash(applicationContext, e6);
            }
            try {
                JSONObject jSONObjectM2821f = m2821f(applicationContext);
                if (jSONObjectM2821f != null && jSONObjectM2821f.length() > 0) {
                    jSONObject2.put("sinfo", jSONObjectM2821f);
                }
            } catch (Exception e7) {
                UMCrashManager.reportCrash(applicationContext, e7);
            }
            try {
                JSONArray jSONArrayM2822g = m2822g(applicationContext);
                if (jSONArrayM2822g != null && jSONArrayM2822g.length() > 0) {
                    jSONObject2.put("input", jSONArrayM2822g);
                }
            } catch (Exception e8) {
                UMCrashManager.reportCrash(applicationContext, e8);
            }
            try {
                if (FieldManager.allow(C0832d.f3620ag) && (jSONArrayM2823h = m2823h(applicationContext)) != null && jSONArrayM2823h.length() > 0) {
                    jSONObject2.put("appls", jSONArrayM2823h);
                }
            } catch (Exception e9) {
                UMCrashManager.reportCrash(applicationContext, e9);
            }
            try {
                JSONObject jSONObjectM2824i = m2824i(applicationContext);
                if (jSONObjectM2824i != null && jSONObjectM2824i.length() > 0) {
                    jSONObject2.put("mem", jSONObjectM2824i);
                }
            } catch (Exception e10) {
                UMCrashManager.reportCrash(applicationContext, e10);
            }
            try {
                if (FieldManager.allow(C0832d.f3630aq) && (jSONObjectM2815b = m2815b()) != null && jSONObjectM2815b.length() > 0) {
                    jSONObject2.put(C0655am.f2362w, jSONObjectM2815b);
                }
            } catch (Exception unused) {
            }
            try {
                jSONObject.put(C0655am.f2319au, jSONObject2);
            } catch (JSONException e11) {
                UMCrashManager.reportCrash(applicationContext, e11);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m2815b() throws Throwable {
        try {
            C0779d.a aVarM2853a = C0779d.m2853a();
            if (aVarM2853a == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("pro", aVarM2853a.f3278a);
                jSONObject.put("pla", aVarM2853a.f3279b);
                jSONObject.put("cpus", aVarM2853a.f3280c);
                jSONObject.put("fea", aVarM2853a.f3281d);
                jSONObject.put("imp", aVarM2853a.f3282e);
                jSONObject.put("arc", aVarM2853a.f3283f);
                jSONObject.put("var", aVarM2853a.f3284g);
                jSONObject.put("par", aVarM2853a.f3285h);
                jSONObject.put("rev", aVarM2853a.f3286i);
                jSONObject.put("har", aVarM2853a.f3287j);
                jSONObject.put("rev", aVarM2853a.f3288k);
                jSONObject.put("ser", aVarM2853a.f3289l);
                jSONObject.put("cur_cpu", C0779d.m2856d());
                jSONObject.put("max_cpu", C0779d.m2854b());
                jSONObject.put("min_cpu", C0779d.m2855c());
                jSONObject.put("ts", System.currentTimeMillis());
                return jSONObject;
            } catch (Exception unused) {
                return jSONObject;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static JSONArray m2826k(Context context) {
        JSONArray jSONArray;
        Throwable th;
        List<ActivityManager.RunningServiceInfo> runningServices;
        JSONArray jSONArray2 = null;
        if (context == null) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService("activity");
            if (activityManager == null || (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) == null || runningServices.isEmpty()) {
                return null;
            }
            for (int i = 0; i < runningServices.size(); i++) {
                if (runningServices.get(i) != null && runningServices.get(i).service != null && runningServices.get(i).service.getClassName() != null && runningServices.get(i).service.getPackageName() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("sn", runningServices.get(i).service.getClassName().toString());
                        jSONObject.put("pn", runningServices.get(i).service.getPackageName().toString());
                        if (jSONArray2 == null) {
                            jSONArray2 = new JSONArray();
                        }
                        jSONArray2.put(jSONObject);
                    } catch (JSONException unused) {
                    }
                }
            }
            if (jSONArray2 == null) {
                return jSONArray2;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("ts", System.currentTimeMillis());
                jSONObject2.put("ls", jSONArray2);
            } catch (JSONException unused2) {
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("sers", jSONObject2);
            } catch (JSONException unused3) {
            }
            jSONArray = new JSONArray();
            try {
                jSONArray.put(jSONObject3);
            } catch (Throwable th2) {
                th = th2;
                UMCrashManager.reportCrash(context, th);
            }
            return jSONArray;
        } catch (Throwable th3) {
            jSONArray = jSONArray2;
            th = th3;
        }
        UMCrashManager.reportCrash(context, th);
        return jSONArray;
    }

    /* JADX INFO: renamed from: l */
    public static JSONArray m2827l(Context context) {
        JSONArray jSONArray = new JSONArray();
        String strM2865a = C0785j.m2865a(context);
        if (!TextUtils.isEmpty(strM2865a)) {
            try {
                jSONArray.put(new JSONObject(strM2865a));
            } catch (Exception unused) {
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public static void m2813a(Context context, JSONObject jSONObject) {
        PackageManager packageManager;
        if (context == null || (packageManager = context.getApplicationContext().getPackageManager()) == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        m2814a(jSONObject, "gp", packageManager.hasSystemFeature("android.hardware.location.gps"));
        m2814a(jSONObject, "to", packageManager.hasSystemFeature("android.hardware.touchscreen"));
        m2814a(jSONObject, "mo", packageManager.hasSystemFeature("android.hardware.telephony"));
        m2814a(jSONObject, "ca", packageManager.hasSystemFeature("android.hardware.camera"));
        m2814a(jSONObject, "fl", packageManager.hasSystemFeature("android.hardware.camera.flash"));
    }

    /* JADX INFO: renamed from: a */
    public static void m2814a(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (z) {
                jSONObject.put(str, 1);
            } else {
                jSONObject.put(str, 0);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m2817b(Context context, JSONObject jSONObject) {
        if (context != null) {
            String strM2869a = C0786k.m2869a(context);
            if (TextUtils.isEmpty(strM2869a)) {
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(strM2869a);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                if (jSONObject2.has(C0786k.f3301d)) {
                    jSONObject.put(C0786k.f3301d, jSONObject2.opt(C0786k.f3301d));
                }
                if (jSONObject2.has(C0786k.f3300c)) {
                    jSONObject.put(C0786k.f3300c, jSONObject2.opt(C0786k.f3300c));
                }
                if (jSONObject2.has(C0786k.f3299b)) {
                    jSONObject.put(C0786k.f3299b, jSONObject2.opt(C0786k.f3299b));
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m2811a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("a_pr", Build.PRODUCT);
            jSONObject.put("a_bl", Build.BOOTLOADER);
            jSONObject.put("a_rv", Build.getRadioVersion());
            jSONObject.put("a_fp", Build.FINGERPRINT);
            jSONObject.put("a_hw", Build.HARDWARE);
            jSONObject.put("a_host", Build.HOST);
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            int i2 = 0;
            while (true) {
                String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
                if (i2 >= strArr.length) {
                    break;
                }
                jSONArray.put(strArr[i2]);
                i2++;
            }
            if (jSONArray.length() > 0) {
                jSONObject.put("a_s32", jSONArray);
            }
            JSONArray jSONArray2 = new JSONArray();
            int i3 = 0;
            while (true) {
                String[] strArr2 = Build.SUPPORTED_64_BIT_ABIS;
                if (i3 >= strArr2.length) {
                    break;
                }
                jSONArray2.put(strArr2[i3]);
                i3++;
            }
            if (jSONArray2.length() > 0) {
                jSONObject.put("a_s64", jSONArray2);
            }
            JSONArray jSONArray3 = new JSONArray();
            while (true) {
                String[] strArr3 = Build.SUPPORTED_ABIS;
                if (i >= strArr3.length) {
                    break;
                }
                jSONArray3.put(strArr3[i]);
                i++;
            }
            if (jSONArray3.length() > 0) {
                jSONObject.put("a_sa", jSONArray3);
            }
            jSONObject.put("a_ta", Build.TAGS);
            jSONObject.put("a_uk", "unknown");
            jSONObject.put("a_user", Build.USER);
            jSONObject.put("a_cpu1", Build.CPU_ABI);
            jSONObject.put("a_cpu2", Build.CPU_ABI2);
            jSONObject.put("a_ra", Build.RADIO);
            if (Build.VERSION.SDK_INT >= 23) {
                jSONObject.put("a_bos", Build.VERSION.BASE_OS);
                jSONObject.put("a_pre", Build.VERSION.PREVIEW_SDK_INT);
                jSONObject.put("a_sp", Build.VERSION.SECURITY_PATCH);
            }
            jSONObject.put("a_cn", Build.VERSION.CODENAME);
            jSONObject.put("a_intl", Build.VERSION.INCREMENTAL);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: e */
    public static JSONObject m2820e(Context context) {
        DisplayMetrics displayMetrics;
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            try {
                jSONObject.put("a_st_h", C0776a.m2834c(context));
                jSONObject.put("a_nav_h", C0776a.m2837d(context));
                if (context.getResources() != null && (displayMetrics = context.getResources().getDisplayMetrics()) != null) {
                    jSONObject.put("a_den", displayMetrics.density);
                    jSONObject.put("a_dpi", displayMetrics.densityDpi);
                    return jSONObject;
                }
            } catch (Exception e) {
                UMCrashManager.reportCrash(context, e);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: f */
    public static JSONObject m2821f(Context context) {
        JSONObject jSONObject = new JSONObject();
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            String packageName = applicationContext.getPackageName();
            try {
                jSONObject.put("a_fit", C0776a.m2829a(applicationContext, packageName));
                jSONObject.put("a_alut", C0776a.m2831b(applicationContext, packageName));
                jSONObject.put("a_c", C0776a.m2836c(applicationContext, packageName));
                jSONObject.put("a_uid", C0776a.m2838d(applicationContext, packageName));
                if (C0776a.m2830a()) {
                    jSONObject.put("a_root", 1);
                } else {
                    jSONObject.put("a_root", 0);
                }
                jSONObject.put("tf", C0776a.m2832b());
                jSONObject.put("s_fs", C0776a.m2828a(applicationContext));
                jSONObject.put("a_meid", DeviceConfig.getMeid(applicationContext));
                jSONObject.put("a_imsi", DeviceConfig.getImsi(applicationContext));
                jSONObject.put("st", C0776a.m2835c());
                String simICCID = DeviceConfig.getSimICCID(applicationContext);
                if (!TextUtils.isEmpty(simICCID)) {
                    try {
                        jSONObject.put("a_iccid", simICCID);
                    } catch (Exception unused) {
                    }
                }
                String secondSimIMEi = DeviceConfig.getSecondSimIMEi(applicationContext);
                if (!TextUtils.isEmpty(secondSimIMEi)) {
                    try {
                        jSONObject.put("a_simei", secondSimIMEi);
                    } catch (Exception unused2) {
                    }
                }
                jSONObject.put("hn", C0776a.m2839d());
                jSONObject.put("ts", System.currentTimeMillis());
            } catch (Exception e) {
                UMCrashManager.reportCrash(applicationContext, e);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: g */
    public static JSONArray m2822g(Context context) {
        Context applicationContext;
        List<InputMethodInfo> listM2842f;
        JSONArray jSONArray = new JSONArray();
        if (context != null && (listM2842f = C0776a.m2842f((applicationContext = context.getApplicationContext()))) != null) {
            for (InputMethodInfo inputMethodInfo : listM2842f) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("a_id", inputMethodInfo.getId());
                    jSONObject.put("a_pn", inputMethodInfo.getPackageName());
                    jSONObject.put("ts", System.currentTimeMillis());
                    jSONArray.put(jSONObject);
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(applicationContext, th);
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: h */
    public static JSONArray m2823h(Context context) {
        Context applicationContext;
        List<C0776a.a> listM2843g;
        JSONArray jSONArray = new JSONArray();
        if (context != null && (listM2843g = C0776a.m2843g((applicationContext = context.getApplicationContext()))) != null && !listM2843g.isEmpty()) {
            for (C0776a.a aVar : listM2843g) {
                if (aVar != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("a_pn", aVar.f3264a);
                        jSONObject.put("a_la", aVar.f3265b);
                        jSONObject.put("ts", System.currentTimeMillis());
                        jSONArray.put(jSONObject);
                    } catch (Exception e) {
                        UMCrashManager.reportCrash(applicationContext, e);
                    }
                }
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: i */
    public static JSONObject m2824i(Context context) {
        Context applicationContext;
        ActivityManager.MemoryInfo memoryInfoM2844h;
        JSONObject jSONObject = new JSONObject();
        if (context != null && (memoryInfoM2844h = C0776a.m2844h((applicationContext = context.getApplicationContext()))) != null) {
            try {
                jSONObject.put(C0655am.f2281aI, memoryInfoM2844h.totalMem);
                jSONObject.put("f", memoryInfoM2844h.availMem);
                jSONObject.put("ts", System.currentTimeMillis());
                return jSONObject;
            } catch (Exception e) {
                UMCrashManager.reportCrash(applicationContext, e);
            }
        }
        return jSONObject;
    }
}
