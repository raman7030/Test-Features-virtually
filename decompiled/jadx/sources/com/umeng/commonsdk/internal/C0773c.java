package com.umeng.commonsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C0643aa;
import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0657ao;
import com.umeng.analytics.pro.C0658ap;
import com.umeng.analytics.pro.C0659aq;
import com.umeng.analytics.pro.C0716l;
import com.umeng.analytics.pro.C0719o;
import com.umeng.common.C0744b;
import com.umeng.commonsdk.C0753a;
import com.umeng.commonsdk.UMConfigureImpl;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.SelfChecker;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.C0770a;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.internal.utils.C0777b;
import com.umeng.commonsdk.internal.utils.InfoPreferenceAgent;
import com.umeng.commonsdk.internal.utils.UMInternalUtilsAgent;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.stateless.C0791b;
import com.umeng.commonsdk.stateless.C0793d;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.C0795b;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.C0809h;
import com.umeng.commonsdk.utils.C0831c;
import com.umeng.commonsdk.utils.C0832d;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.commonsdk.utils.onMessageSendListener;
import com.umeng.commonsdk.vchannel.C0834b;
import com.umeng.commonsdk.vchannel.Sender;
import com.umeng.umzid.ZIDManager;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p067l.C10965;

/* JADX INFO: renamed from: com.umeng.commonsdk.internal.c */
/* JADX INFO: compiled from: 1474 */
/* JADX INFO: loaded from: classes.dex */
public class C0773c implements UMLogDataProtocol {

    /* JADX INFO: renamed from: a */
    public static final String f3245a = "um_policy_grant";

    /* JADX INFO: renamed from: b */
    public static final String f3246b = "preInitInvokedFlag";

    /* JADX INFO: renamed from: c */
    public static final String f3247c = "policyGrantInvokedFlag";

    /* JADX INFO: renamed from: d */
    public static final String f3248d = "policyGrantResult";

    /* JADX INFO: renamed from: f */
    public static int f3249f = 1;

    /* JADX INFO: renamed from: g */
    public static final String f3250g = "info";

    /* JADX INFO: renamed from: h */
    public static final String f3251h = "stat";

    /* JADX INFO: renamed from: i */
    public static Class f3252i;

    /* JADX INFO: renamed from: j */
    public static Method f3253j;

    /* JADX INFO: renamed from: k */
    public static Method f3254k;

    /* JADX INFO: renamed from: l */
    public static Method f3255l;

    /* JADX INFO: renamed from: m */
    public static boolean f3256m;

    /* JADX INFO: renamed from: e */
    public Context f3257e;

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j) {
        return null;
    }

    static {
        m2798c();
    }

    /* JADX INFO: renamed from: c */
    public static void m2798c() {
        try {
            f3252i = ZIDManager.class;
            Method declaredMethod = ZIDManager.class.getDeclaredMethod("getInstance", null);
            if (declaredMethod != null) {
                f3253j = declaredMethod;
            }
            Method declaredMethod2 = f3252i.getDeclaredMethod("getZID", Context.class);
            if (declaredMethod2 != null) {
                f3254k = declaredMethod2;
            }
            Method declaredMethod3 = f3252i.getDeclaredMethod("getSDKVersion", null);
            if (declaredMethod3 != null) {
                f3255l = declaredMethod3;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public String m2809a() {
        Method method;
        Class cls = f3252i;
        if (cls == null || (method = f3253j) == null || f3254k == null) {
            return "";
        }
        try {
            Object objInvoke = method.invoke(cls, null);
            return objInvoke != null ? (String) f3254k.invoke(objInvoke, this.f3257e) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m2796b() {
        Method method;
        Class cls = f3252i;
        if (cls == null || (method = f3253j) == null || f3255l == null) {
            return "";
        }
        try {
            Object objInvoke = method.invoke(cls, null);
            return objInvoke != null ? (String) f3255l.invoke(objInvoke, null) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public C0773c(Context context) {
        if (context != null) {
            this.f3257e = context.getApplicationContext();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m2794a(Context context) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0795b.m2926a("appkey"), UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put(C0795b.m2926a("app_version"), UMGlobalContext.getInstance(context).getAppVersion());
            jSONObject.put(C0795b.m2926a(C0655am.f2363x), AnalyticsConstants.SDK_TYPE);
            JSONObject jSONObjectBuildZeroEnvelopeWithExtHeader = UMEnvelopeBuild.buildZeroEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.ZCFG_PATH);
            if (jSONObjectBuildZeroEnvelopeWithExtHeader != null && jSONObjectBuildZeroEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文失败.");
            } else {
                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文 成功!!!");
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    private void m2797b(Context context) {
        try {
            String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, C0655am.f2346g, "");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0795b.m2926a("appkey"), UMGlobalContext.getInstance(context).getAppkey());
            jSONObject.put(C0795b.m2926a(C0655am.f2346g), strImprintProperty);
            JSONObject jSONObjectBuildSilentEnvelopeWithExtHeader = UMEnvelopeBuild.buildSilentEnvelopeWithExtHeader(context, jSONObject, null, UMServerURL.SILENT_HEART_BEAT);
            if (jSONObjectBuildSilentEnvelopeWithExtHeader != null && jSONObjectBuildSilentEnvelopeWithExtHeader.has("exception")) {
                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 构建心跳报文失败.");
            } else {
                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 构建心跳报文 成功!!!");
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    private void m2800d() {
        C0657ao c0657aoM2230a = C0657ao.m2230a(this.f3257e);
        C0658ap c0658apM2235a = c0657aoM2230a.m2235a(C0659aq.f2424c);
        if (c0658apM2235a != null) {
            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建成真正信封。");
            try {
                String str = c0658apM2235a.f2416a;
                String str2 = c0658apM2235a.f2417b;
                JSONObject jSONObjectM2935a = new C0795b().m2935a(this.f3257e.getApplicationContext(), new JSONObject(c0658apM2235a.f2418c), new JSONObject(c0658apM2235a.f2419d), c0658apM2235a.f2420e, str2, c0658apM2235a.f2421f);
                if (jSONObjectM2935a != null && jSONObjectM2935a.has("exception")) {
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 失败。删除二级缓存记录");
                } else {
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存记录构建真正信封 成功! 删除二级缓存记录。");
                }
                c0657aoM2230a.m2237a(C0659aq.f2424c, str);
                c0657aoM2230a.m2239b();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m2799c(final Context context) {
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    SharedPreferences sharedPreferences = context.getSharedPreferences(C0809h.f3434a, 0);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strM2121a = C0643aa.m2121a(context);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (!TextUtils.isEmpty(strM2121a) && sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(C0809h.f3436c, (jCurrentTimeMillis2 - jCurrentTimeMillis) + "");
                        editorEdit.commit();
                    }
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                        editorEdit2.putString(C0809h.f3435b, strM2121a);
                        editorEdit2.commit();
                    }
                    UMConfigureImpl.removeInterruptFlag();
                } catch (Throwable unused) {
                }
            }
        }).start();
    }

    /* JADX INFO: renamed from: a */
    public static void m2795a(Context context, final OnGetOaidListener onGetOaidListener) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        new Thread(new Runnable() { // from class: com.umeng.commonsdk.internal.c.2
            @Override // java.lang.Runnable
            public void run() {
                String strM2121a = C0643aa.m2121a(applicationContext);
                OnGetOaidListener onGetOaidListener2 = onGetOaidListener;
                if (onGetOaidListener2 != null) {
                    onGetOaidListener2.onGetOaid(strM2121a);
                }
            }
        }).start();
    }

    /* JADX INFO: renamed from: d */
    public static void m2801d(final Context context) {
        if (FieldManager.allow(C0832d.f3593G)) {
            m2795a(context, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.3
                @Override // com.umeng.commonsdk.listener.OnGetOaidListener
                public void onGetOaid(String str) {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    try {
                        SharedPreferences sharedPreferences = context.getSharedPreferences(C0809h.f3434a, 0);
                        if (sharedPreferences == null || sharedPreferences.getString(C0809h.f3435b, "").equalsIgnoreCase(str)) {
                            return;
                        }
                        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 更新本地缓存OAID");
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString(C0809h.f3435b, str);
                        editorEdit.commit();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    private void m2802e() {
        if (!f3256m) {
            if (FieldManager.allow(C0832d.f3593G)) {
                f3256m = true;
                m2795a(this.f3257e, new OnGetOaidListener() { // from class: com.umeng.commonsdk.internal.c.4
                    @Override // com.umeng.commonsdk.listener.OnGetOaidListener
                    public void onGetOaid(String str) {
                        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> OAID云控参数更新(不采集->采集)：采集完成");
                        if (!TextUtils.isEmpty(str)) {
                            try {
                                SharedPreferences sharedPreferences = C0773c.this.f3257e.getSharedPreferences(C0809h.f3434a, 0);
                                if (sharedPreferences != null) {
                                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                    editorEdit.putString(C0809h.f3435b, str);
                                    editorEdit.commit();
                                }
                            } catch (Throwable unused) {
                            }
                            UMWorkDispatch.sendEvent(C0773c.this.f3257e, C0771a.f3238w, C0772b.m2790a(C0773c.this.f3257e).m2791a(), null);
                            return;
                        }
                        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> oaid返回null或者空串，不需要 伪冷启动。");
                    }
                });
                return;
            }
            return;
        }
        if (FieldManager.allow(C0832d.f3593G)) {
            return;
        }
        f3256m = false;
    }

    /* JADX INFO: renamed from: f */
    private void m2804f() {
        if (FieldManager.allow(C0832d.f3593G)) {
            f3256m = true;
            UMConfigureImpl.registerInterruptFlag();
            UMConfigureImpl.init(this.f3257e);
            f3249f++;
            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 要读取 oaid，需等待读取结果.");
            UMConfigureImpl.registerMessageSendListener(new onMessageSendListener() { // from class: com.umeng.commonsdk.internal.c.5
                @Override // com.umeng.commonsdk.utils.onMessageSendListener
                public void onMessageSend() {
                    if (C0773c.this.f3257e != null) {
                        UMWorkDispatch.sendEvent(C0773c.this.f3257e, C0771a.f3239x, C0772b.m2790a(C0773c.this.f3257e).m2791a(), null);
                    }
                    UMConfigureImpl.removeMessageSendListener(this);
                }
            });
            m2799c(this.f3257e);
        }
    }

    /* JADX INFO: renamed from: e */
    private void m2803e(Context context) {
        long jLongValue;
        long jLongValue2;
        if (context == null) {
            return;
        }
        String strM2704a = C0744b.m2704a(context, AnalyticsConfig.RTD_SP_FILE, AnalyticsConfig.DEBUG_KEY);
        if (TextUtils.isEmpty(strM2704a)) {
            return;
        }
        String strM2704a2 = C0744b.m2704a(context, AnalyticsConfig.RTD_SP_FILE, AnalyticsConfig.RTD_START_TIME);
        String strM2704a3 = C0744b.m2704a(context, AnalyticsConfig.RTD_SP_FILE, AnalyticsConfig.RTD_PERIOD);
        if (TextUtils.isEmpty(strM2704a2)) {
            jLongValue = 0;
        } else {
            try {
                jLongValue = Long.valueOf(strM2704a2).longValue();
            } catch (Throwable unused) {
                jLongValue = 0;
            }
        }
        if (TextUtils.isEmpty(strM2704a3)) {
            jLongValue2 = 0;
        } else {
            try {
                jLongValue2 = Long.valueOf(strM2704a3).longValue();
            } catch (Throwable unused2) {
                jLongValue2 = 0;
            }
        }
        if (jLongValue == 0 || jLongValue2 == 0) {
            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> [RTD]本地缓存startTime或者duration值无效，清除缓存数据");
            C0744b.m2705a(context, AnalyticsConfig.RTD_SP_FILE);
            return;
        }
        if (System.currentTimeMillis() - jLongValue > jLongValue2 * 60000) {
            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> [RTD]本地缓存dk值已经超时，清除缓存数据。");
            C0744b.m2705a(context, AnalyticsConfig.RTD_SP_FILE);
            if (AnalyticsConfig.isRealTimeDebugMode()) {
                AnalyticsConfig.turnOffRealTimeDebug();
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        map.put(AnalyticsConfig.DEBUG_KEY, strM2704a);
        if (AnalyticsConfig.isRealTimeDebugMode()) {
            return;
        }
        UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> [RTD]本地缓存dk值在有效期内，切换到埋点验证模式。");
        AnalyticsConfig.turnOnRealTimeDebug(map);
    }

    /* JADX WARN: Code duplicated, block: B:86:0x024b  */
    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i) throws JSONException, IllegalAccessException, InvocationTargetException {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        boolean z = true;
        boolean z2 = false;
        ULog.m2986i("walle", "[internal] workEvent");
        if (C0831c.m3310a()) {
            if (32802 == i) {
                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 静默模式：进入心跳处理逻辑!");
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jM3312b = C0831c.m3312b(this.f3257e);
                boolean zM3315e = C0831c.m3315e(this.f3257e);
                if (C0831c.m3311a(jM3312b, jCurrentTimeMillis, C0831c.m3308a(this.f3257e))) {
                    if (UMFrUtils.hasEnvelopeFile(this.f3257e, UMLogDataProtocol.UMBusinessType.U_Silent)) {
                        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 静默心跳信封文件已存在，尝试发送之!");
                    } else {
                        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 构建静默心跳信封.");
                        m2797b(this.f3257e);
                    }
                    UMEnvelopeBuild.registerNetReceiver(this.f3257e);
                }
                if (zM3315e) {
                    return;
                }
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> send REBUILD_DB msg in silent mode.");
                Context context = this.f3257e;
                UMWorkDispatch.sendEvent(context, C0719o.a.f2910p, CoreProtocol.getInstance(context), null, 2000L);
            }
            return;
        }
        try {
            switch (i) {
                case 32769:
                    ULog.m2986i("walle", "[internal] workEvent send envelope");
                    try {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        String strM2121a = C0643aa.m2121a(this.f3257e);
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        if (!TextUtils.isEmpty(strM2121a) && (sharedPreferences = this.f3257e.getSharedPreferences(C0809h.f3434a, 0)) != null) {
                            SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                            editorEdit2.putString(C0809h.f3435b, strM2121a);
                            editorEdit2.putString(C0809h.f3436c, (jCurrentTimeMillis3 - jCurrentTimeMillis2) + "");
                            editorEdit2.commit();
                        }
                        break;
                    } catch (Throwable unused) {
                    }
                    UMInternalManagerAgent.class.getMethod("sendInternalEnvelopeByStateful2", Context.class).invoke(UMInternalManagerAgent.class, this.f3257e);
                    break;
                case C0771a.f3223h /* 32771 */:
                    if (obj != null && (obj instanceof C0777b)) {
                        JSONObject jSONObject = new JSONObject();
                        C0777b c0777b = (C0777b) obj;
                        try {
                            jSONObject.put("le", c0777b.f3266a);
                            jSONObject.put("vol", c0777b.f3267b);
                            jSONObject.put("temp", c0777b.f3268c);
                            jSONObject.put("st", c0777b.f3269d);
                            jSONObject.put("ct", c0777b.f3270e);
                            jSONObject.put("ts", c0777b.f3271f);
                            break;
                        } catch (Throwable unused2) {
                        }
                        String string = jSONObject.toString();
                        UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "battery info: " + string);
                        UMInternalUtilsAgent.class.getMethod("saveBattery", Context.class, String.class).invoke(UMInternalUtilsAgent.class, this.f3257e, string);
                        break;
                    }
                    break;
                case C0771a.f3227l /* 32775 */:
                    InfoPreferenceAgent.class.getMethod("saveUA", Context.class, String.class).invoke(InfoPreferenceAgent.class, this.f3257e, (String) obj);
                    break;
                case C0771a.f3228m /* 32776 */:
                    SharedPreferences sharedPreferences2 = this.f3257e.getApplicationContext().getSharedPreferences("info", 0);
                    if (sharedPreferences2 != null) {
                        sharedPreferences2.edit().putString(f3251h, (String) obj).commit();
                    }
                    break;
                case C0771a.f3229n /* 32777 */:
                    ULog.m2986i("walle", "[internal] workEvent send envelope");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(C0655am.f2286aN, C0771a.f3220e);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(C0655am.f2319au, new JSONObject());
                    JSONObject jSONObjectBuildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(this.f3257e, jSONObject2, jSONObject3);
                    if (jSONObjectBuildEnvelopeWithExtHeader != null && !jSONObjectBuildEnvelopeWithExtHeader.has("exception")) {
                        ULog.m2986i("walle", "[internal] workEvent send envelope back, result is ok");
                        break;
                    }
                    break;
                case C0771a.f3230o /* 32779 */:
                    Sender.handleEvent(this.f3257e, (C0834b) obj);
                    break;
                case C0771a.f3231p /* 32781 */:
                    if (!UMFrUtils.hasEnvelopeFile(this.f3257e, UMLogDataProtocol.UMBusinessType.U_ZeroEnv)) {
                        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 构建零号报文");
                        m2794a(this.f3257e);
                    } else {
                        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 零号报文信封文件已存在，尝试发送之!");
                    }
                    break;
                case C0771a.f3234s /* 32784 */:
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 零号报文流程，接收到云控配置加载成功通知(成功收到零号报文应答)。");
                    m2804f();
                    f3249f--;
                    m2806g();
                    break;
                case C0771a.f3235t /* 32785 */:
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> [有状态]接收到消费二级缓存数据通知.");
                    if (!C0657ao.m2230a(this.f3257e).m2241c()) {
                        m2800d();
                        if (!UMWorkDispatch.eventHasExist(C0771a.f3235t)) {
                            Context context2 = this.f3257e;
                            UMWorkDispatch.sendEvent(context2, C0771a.f3235t, C0772b.m2790a(context2).m2791a(), null);
                        }
                    } else {
                        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> [有状态]已消费完毕,二级缓存数据库为空.");
                    }
                    break;
                case C0771a.f3236u /* 32786 */:
                    UMCrashManager.buildEnvelope(this.f3257e, obj);
                    break;
                case C0771a.f3237v /* 32787 */:
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 触发2号仓遗留信封检查动作。");
                    String strM2902a = C0793d.m2902a(this.f3257e, false);
                    String strM2902a2 = C0793d.m2902a(this.f3257e, true);
                    if (!TextUtils.isEmpty(strM2902a)) {
                        File file = new File(strM2902a);
                        if (file.exists() && file.isDirectory()) {
                            z2 = true;
                        }
                    }
                    if (TextUtils.isEmpty(strM2902a2)) {
                        z = z2;
                    } else {
                        File file2 = new File(strM2902a2);
                        if (!file2.exists() || !file2.isDirectory()) {
                            z = z2;
                        }
                    }
                    if (!z) {
                        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 触发2号仓遗留信封检查，没有需要处理的目录，不需要处理。");
                    } else if (!C0791b.m2879a()) {
                        new C0791b(this.f3257e);
                        C0791b.m2880b();
                    } else {
                        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 触发2号仓遗留信封检查，Sender已创建，不需要处理。");
                    }
                    break;
                case C0771a.f3238w /* 32788 */:
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 云控下发参数更新，触发 伪冷启动。");
                    C0795b.m2930a();
                    m2802e();
                    if (FieldManager.allow(C0832d.f3591E) && !UMWorkDispatch.eventHasExist()) {
                        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 云控下发参数更新 前台计数器功能 打开，触发 5秒周期检查机制");
                        Context context3 = this.f3257e;
                        UMWorkDispatch.sendEventEx(context3, C0719o.a.f2892D, CoreProtocol.getInstance(context3), null, 5000L);
                    }
                    if (FieldManager.allow(C0832d.f3592F)) {
                        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 云控下发参数更新 FirstResume功能 打开，触发 trigger");
                        C0716l.m2517a(this.f3257e).m2537b(this.f3257e);
                    }
                    break;
                case C0771a.f3239x /* 32790 */:
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 成功接收到(OAID)读取结束通知。");
                    f3249f--;
                    m2806g();
                    break;
                case C0771a.f3240y /* 32791 */:
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 正常冷启动流程，接收到云控配置加载成功通知。");
                    m2801d(this.f3257e);
                    C0753a.m2728a(this.f3257e);
                    m2805f(this.f3257e);
                    break;
                case C0771a.f3241z /* 32792 */:
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 保存隐私授权结果.");
                    if (obj instanceof Integer) {
                        int iIntValue = ((Integer) obj).intValue();
                        SharedPreferences sharedPreferences3 = this.f3257e.getApplicationContext().getSharedPreferences(f3245a, 0);
                        if (sharedPreferences3 != null) {
                            sharedPreferences3.edit().putInt("policyGrantResult", iIntValue).commit();
                        }
                    }
                    break;
                case C0771a.f3204A /* 32793 */:
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 保存preInit执行结果及授权API是否调用结果.");
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject4 = (JSONObject) obj;
                        if (jSONObject4.has(C0771a.f3213J)) {
                            int i2 = jSONObject4.getInt(C0771a.f3213J);
                            int i3 = jSONObject4.getInt(C0771a.f3214K);
                            int i4 = jSONObject4.getInt("policyGrantResult");
                            SharedPreferences sharedPreferences4 = this.f3257e.getApplicationContext().getSharedPreferences(f3245a, 0);
                            if (sharedPreferences4 != null && (editorEdit = sharedPreferences4.edit()) != null) {
                                editorEdit.putInt(f3246b, i2);
                                editorEdit.putInt(f3247c, i3);
                                editorEdit.putInt("policyGrantResult", i4);
                                editorEdit.commit();
                            }
                            File file3 = new File(this.f3257e.getFilesDir().getAbsolutePath() + File.separator + C0659aq.f2434m);
                            if (!file3.exists()) {
                                file3.createNewFile();
                            }
                        }
                    }
                    break;
                case C0771a.f3205B /* 32800 */:
                    File filesDir = this.f3257e.getFilesDir();
                    StringBuilder sb = new StringBuilder();
                    sb.append(filesDir.getAbsolutePath());
                    File file4 = new File(C10965.m25286(sb, File.separator, C0659aq.f2434m));
                    if (file4.exists()) {
                        file4.delete();
                    }
                    break;
                case C0771a.f3206C /* 32801 */:
                    SelfChecker.doCheck(this.f3257e);
                    break;
                case C0771a.f3208E /* 32803 */:
                    ConnectivityManager connectivityManager = (ConnectivityManager) this.f3257e.getSystemService("connectivity");
                    if (connectivityManager == null) {
                        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> ConnectivityManager is null!");
                        C0770a.m2772a(false);
                        C0791b.m2878a(false);
                    } else {
                        try {
                            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            if (activeNetworkInfo == null) {
                                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> NetworkInfo is null!");
                                C0770a.m2772a(false);
                                C0791b.m2878a(false);
                            } else if (activeNetworkInfo.isAvailable()) {
                                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> network state changed: Available");
                                C0770a.m2772a(true);
                                C0791b.m2878a(true);
                            } else {
                                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> network state changed: unAvailable");
                                C0770a.m2772a(false);
                                C0791b.m2878a(false);
                            }
                        } catch (Throwable unused3) {
                            C0770a.m2772a(false);
                            C0791b.m2878a(false);
                            return;
                        }
                    }
                    break;
                case C0771a.f3209F /* 32804 */:
                    m2803e(this.f3257e);
                    break;
            }
        } catch (Throwable unused4) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static Class m2793a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    private void m2805f(Context context) {
        Object objInvoke;
        Method declaredMethod;
        Context applicationContext = context.getApplicationContext();
        String appkey = UMUtils.getAppkey(context);
        try {
            Class clsM2793a = m2793a("com.umeng.umzid.ZIDManager");
            Method declaredMethod2 = clsM2793a.getDeclaredMethod("getInstance", null);
            if (declaredMethod2 == null || (objInvoke = declaredMethod2.invoke(clsM2793a, null)) == null || (declaredMethod = clsM2793a.getDeclaredMethod("init", Context.class, String.class, m2793a("com.umeng.umzid.IZIDCompletionCallback"))) == null) {
                return;
            }
            declaredMethod.invoke(objInvoke, applicationContext, appkey, null);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    private void m2806g() {
        if (f3249f <= 0) {
            m2808h();
            m2805f(this.f3257e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m2807g(Context context) {
        File filesDir = context.getFilesDir();
        StringBuilder sb = new StringBuilder();
        sb.append(filesDir.getAbsolutePath());
        File file = new File(C10965.m25286(sb, File.separator, C0659aq.f2433l));
        if (file.exists()) {
            return;
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: h */
    private void m2808h() {
        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> 真实构建条件满足，开始构建业务信封。");
        if (UMUtils.isMainProgress(this.f3257e)) {
            m2807g(this.f3257e);
            C0753a.m2728a(this.f3257e);
            Context context = this.f3257e;
            UMWorkDispatch.sendEvent(context, C0719o.a.f2919y, CoreProtocol.getInstance(context), null);
            Context context2 = this.f3257e;
            UMWorkDispatch.sendEvent(context2, C0771a.f3235t, C0772b.m2790a(context2).m2791a(), null);
        }
    }
}
