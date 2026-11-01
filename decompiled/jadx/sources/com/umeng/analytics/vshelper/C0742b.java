package com.umeng.analytics.vshelper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C0719o;
import com.umeng.analytics.pro.InterfaceC0660ar;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.analytics.vshelper.b */
/* JADX INFO: compiled from: 3BJ0 */
/* JADX INFO: loaded from: classes.dex */
public class C0742b implements InterfaceC0660ar {

    /* JADX INFO: renamed from: a */
    public static final String f3018a = "RealTimeDebugSwitch";

    /* JADX INFO: renamed from: b */
    public static int f3019b;

    @Override // com.umeng.analytics.pro.InterfaceC0660ar
    /* JADX INFO: renamed from: a */
    public void mo2242a() {
    }

    @Override // com.umeng.analytics.pro.InterfaceC0660ar
    /* JADX INFO: renamed from: a */
    public void mo2243a(Activity activity) {
    }

    @Override // com.umeng.analytics.pro.InterfaceC0660ar
    /* JADX INFO: renamed from: b */
    public void mo2245b() {
    }

    @Override // com.umeng.analytics.pro.InterfaceC0660ar
    /* JADX INFO: renamed from: b */
    public void mo2246b(Activity activity) {
    }

    @Override // com.umeng.analytics.pro.InterfaceC0660ar
    /* JADX INFO: renamed from: b */
    public void mo2247b(Activity activity, Bundle bundle) {
    }

    @Override // com.umeng.analytics.pro.InterfaceC0660ar
    /* JADX INFO: renamed from: c */
    public void mo2248c() {
    }

    @Override // com.umeng.analytics.pro.InterfaceC0660ar
    /* JADX INFO: renamed from: e */
    public void mo2251e(Activity activity) {
    }

    @Override // com.umeng.analytics.pro.InterfaceC0660ar
    /* JADX INFO: renamed from: a */
    public void mo2244a(Activity activity, Bundle bundle) {
        long jLongValue;
        if (f3019b == 0) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    String scheme = data.getScheme();
                    if (scheme != null && scheme.startsWith("um.")) {
                        String queryParameter = data.getQueryParameter(AnalyticsConfig.DEBUG_KEY);
                        String queryParameter2 = data.getQueryParameter(AnalyticsConfig.DEBUG_MODE_PERIOD);
                        if (TextUtils.isEmpty(queryParameter)) {
                            return;
                        }
                        if (TextUtils.isEmpty(queryParameter2)) {
                            jLongValue = 0;
                        } else {
                            try {
                                jLongValue = Long.valueOf(queryParameter2).longValue();
                            } catch (Throwable unused) {
                                jLongValue = 0;
                            }
                        }
                        HashMap map = new HashMap();
                        map.put(AnalyticsConfig.DEBUG_KEY, queryParameter);
                        if (jLongValue < 0) {
                            if (AnalyticsConfig.isRealTimeDebugMode()) {
                                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> call turnOffRealTimeDebug because sendaging < 0");
                                AnalyticsConfig.turnOffRealTimeDebug();
                                Context applicationContext = activity.getApplicationContext();
                                UMWorkDispatch.sendEvent(applicationContext, C0719o.a.f2894F, CoreProtocol.getInstance(applicationContext), null);
                                return;
                            }
                            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> Not currently in RealTimeDebug mode and doing nothing.");
                            return;
                        }
                        if (jLongValue > 0) {
                            AnalyticsConfig.turnOnRealTimeDebug(map);
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(AnalyticsConfig.RTD_START_TIME, System.currentTimeMillis());
                                if (jLongValue < 60) {
                                    jLongValue = 60;
                                }
                                if (jLongValue > 240) {
                                    jLongValue = 240;
                                }
                                jSONObject.put(AnalyticsConfig.RTD_PERIOD, jLongValue);
                                jSONObject.put(AnalyticsConfig.DEBUG_KEY, queryParameter);
                            } catch (Throwable unused2) {
                            }
                            Context applicationContext2 = activity.getApplicationContext();
                            UMWorkDispatch.sendEvent(applicationContext2, C0719o.a.f2893E, CoreProtocol.getInstance(applicationContext2), jSONObject);
                            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> turnOnRealTimeDebug[persistent] dk: " + queryParameter + "; period: " + jLongValue);
                            return;
                        }
                        AnalyticsConfig.turnOnRealTimeDebug(map);
                        Context applicationContext3 = activity.getApplicationContext();
                        UMWorkDispatch.sendEvent(applicationContext3, C0719o.a.f2894F, CoreProtocol.getInstance(applicationContext3), null);
                        UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> turnOnRealTimeDebug[non-persistent] dk: " + queryParameter);
                        return;
                    }
                    UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> scheme: " + scheme);
                    return;
                }
                UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> uri: " + data);
                return;
            }
            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> intent: " + intent);
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC0660ar
    /* JADX INFO: renamed from: c */
    public void mo2249c(Activity activity) {
        f3019b++;
    }

    @Override // com.umeng.analytics.pro.InterfaceC0660ar
    /* JADX INFO: renamed from: d */
    public void mo2250d(Activity activity) {
        f3019b--;
    }
}
