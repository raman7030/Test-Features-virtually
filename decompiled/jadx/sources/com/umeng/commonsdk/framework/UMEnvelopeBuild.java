package com.umeng.commonsdk.framework;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0657ao;
import com.umeng.analytics.pro.C0659aq;
import com.umeng.analytics.pro.C0713i;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.C0771a;
import com.umeng.commonsdk.internal.C0772b;
import com.umeng.commonsdk.statistics.C0795b;
import com.umeng.commonsdk.statistics.UMErrorCode;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UMEnvelopeBuild {
    public static boolean transmissionSendFlag;

    public static synchronized boolean getTransmissionSendFlag() {
        return transmissionSendFlag;
    }

    public static synchronized void setTransmissionSendFlag(boolean z) {
        transmissionSendFlag = z;
    }

    public static boolean isOnline(Context context) {
        return UMFrUtils.isOnline(context) && !UMConfigure.needSendZcfgEnv(context);
    }

    public static long getLastSuccessfulBuildTime(Context context) {
        if (context == null) {
            return 0L;
        }
        return UMFrUtils.getLastSuccessfulBuildTime(context.getApplicationContext());
    }

    public static long getLastInstantBuildTime(Context context) {
        if (context == null) {
            return 0L;
        }
        return UMFrUtils.getLastInstantBuildTime(context.getApplicationContext());
    }

    public static boolean isReadyBuildNew(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        if (getTransmissionSendFlag()) {
            return isRet(context, uMBusinessType, false);
        }
        return false;
    }

    public static boolean isReadyBuild(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        C0770a.m2770a(context);
        return isRet(context, uMBusinessType, false);
    }

    public static boolean isReadyBuildStateless() {
        return getTransmissionSendFlag();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    public static boolean isRet(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType, boolean z) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            boolean zIsOnline = UMFrUtils.isOnline(applicationContext);
            int iEnvelopeFileNumber = UMFrUtils.envelopeFileNumber(applicationContext);
            if (zIsOnline) {
                if (uMBusinessType == UMLogDataProtocol.UMBusinessType.U_INTERNAL) {
                    if (UMFrUtils.hasEnvelopeFile(applicationContext, uMBusinessType)) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    if (C0770a.m2773a()) {
                        UMWorkDispatch.sendDelayProcessMsg(C0770a.m2774b());
                    } else if (!UMFrUtils.hasEnvelopeFile(applicationContext, uMBusinessType) && !UMConfigure.needSendZcfgEnv(context)) {
                        z = true;
                    }
                    z = false;
                }
            }
            if (zIsOnline && iEnvelopeFileNumber > 0) {
                C0770a.m2779d();
            }
        }
        return z;
    }

    public static JSONObject add2CacheTable(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        if (jSONObject == null || jSONObject2 == null) {
            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> [有状态]构建信封传入 header 或 body 字段为空，直接返回");
            return null;
        }
        C0713i c0713iM2480a = C0713i.m2480a(context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        UUID uuidRandomUUID = UUID.randomUUID();
        ContentValues contentValues = new ContentValues();
        contentValues.put(C0659aq.f2426e, str2);
        contentValues.put(C0659aq.f2427f, c0713iM2480a.m2504c(jSONObject.toString()));
        contentValues.put(C0659aq.f2428g, c0713iM2480a.m2504c(jSONObject2.toString()));
        contentValues.put(C0659aq.f2429h, String.valueOf(jCurrentTimeMillis));
        contentValues.put(C0659aq.f2430i, uuidRandomUUID.toString());
        contentValues.put(C0659aq.f2431j, str);
        contentValues.put(C0659aq.f2432k, str3);
        C0657ao.m2230a(context).m2236a(C0659aq.f2424c, contentValues);
        if (C0655am.f2275aC.equalsIgnoreCase(str2)) {
            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> [有状态]inner业务，返回空 JSONObject。");
        } else if (C0655am.f2274aB.equalsIgnoreCase(str2)) {
            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> [有状态]分享业务 返回body。");
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("header", new JSONObject());
                jSONObject3.put("share", jSONObject2.getJSONObject("share"));
                return jSONObject3;
            } catch (JSONException unused) {
            }
        } else if (!C0655am.f2322ax.equalsIgnoreCase(str2)) {
            try {
                if (C0655am.f2281aI.equalsIgnoreCase(str2)) {
                    UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> [有状态]统计业务 半开报文，返回body。");
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(C0795b.m2926a("header"), new JSONObject());
                    jSONObject4.put(C0795b.m2926a("analytics"), jSONObject2.getJSONObject("analytics"));
                    return jSONObject4;
                }
                UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> [有状态]统计业务 闭合报文，返回body。");
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put(C0795b.m2926a("header"), new JSONObject());
                jSONObject5.put(C0795b.m2926a("analytics"), jSONObject2.getJSONObject("analytics"));
                return jSONObject5;
            } catch (JSONException unused2) {
                return jSONObject2;
            }
        }
        return new JSONObject();
    }

    public static JSONObject buildEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        if (jSONObject.has("st")) {
            str = C0655am.f2281aI;
        } else {
            str = jSONObject2.has(C0655am.f2319au) ? C0655am.f2275aC : C0655am.f2320av;
        }
        return buildEnvelopeWithExtHeader(context, jSONObject, jSONObject2, UMServerURL.PATH_ANALYTICS, str, "9.5.2");
    }

    public static JSONObject buildEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> [有状态]业务发起构建普通有状态信封请求。");
        if (TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("exception", UMErrorCode.E_UM_BE_EMPTY_URL_PATH);
                    return jSONObject3;
                } catch (JSONException unused) {
                    return jSONObject3;
                }
            } catch (JSONException unused2) {
                return null;
            }
        }
        if (!UMUtils.isMainProgress(context)) {
            try {
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("exception", UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
                    return jSONObject4;
                } catch (JSONException unused3) {
                    return jSONObject4;
                }
            } catch (JSONException unused4) {
                return null;
            }
        }
        if (UMConfigure.needSendZcfgEnv(context)) {
            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> [有状态]零号报文应答数据 未获取到，写入二级缓存");
            return add2CacheTable(context, jSONObject, jSONObject2, str, str2, str3);
        }
        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> [有状态]零号报文应答数据 已获取到，判断二级缓存是否为空");
        if (C0657ao.m2230a(context).m2241c()) {
            UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存为空，直接打信封");
            return new C0795b().m2935a(context.getApplicationContext(), jSONObject, jSONObject2, str, str2, str3);
        }
        UMRTLog.m2756e(UMRTLog.RTLOG_TAG, "--->>> [有状态]二级缓存不为空，写入二级缓存");
        JSONObject jSONObjectAdd2CacheTable = add2CacheTable(context, jSONObject, jSONObject2, str, str2, str3);
        if (!UMWorkDispatch.eventHasExist(C0771a.f3235t)) {
            UMWorkDispatch.sendEvent(context, C0771a.f3235t, C0772b.m2790a(context).m2791a(), null);
        }
        return jSONObjectAdd2CacheTable;
    }

    public static JSONObject buildZeroEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        if (!UMUtils.isMainProgress(context)) {
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("exception", UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
                    return jSONObject3;
                } catch (JSONException unused) {
                    return jSONObject3;
                }
            } catch (JSONException unused2) {
                return null;
            }
        }
        return new C0795b().m2936b(context.getApplicationContext(), jSONObject, jSONObject2, str);
    }

    public static JSONObject buildSilentEnvelopeWithExtHeader(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        if (!UMUtils.isMainProgress(context)) {
            try {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("exception", UMErrorCode.E_UM_BE_NOT_MAINPROCESS);
                    return jSONObject3;
                } catch (JSONException unused) {
                    return jSONObject3;
                }
            } catch (JSONException unused2) {
                return null;
            }
        }
        return new C0795b().m2934a(context.getApplicationContext(), jSONObject, jSONObject2, str);
    }

    public static String imprintProperty(Context context, String str, String str2) {
        return context == null ? str2 : ImprintHandler.getImprintService(context.getApplicationContext()).m3050c().m3053a(str, str2);
    }

    public static long maxDataSpace(Context context) {
        if (context == null) {
            return 0L;
        }
        return C0795b.m2924a(context.getApplicationContext());
    }

    public static void sendProcessNextMsgOnce() {
        C0770a.m2779d();
    }

    public static void registerNetReceiver(Context context) {
        C0770a.m2776b(context);
    }
}
