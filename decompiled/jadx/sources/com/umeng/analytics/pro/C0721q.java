package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMRTLog;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.umeng.analytics.pro.q */
/* JADX INFO: compiled from: N464 */
/* JADX INFO: loaded from: classes.dex */
public class C0721q {
    /* JADX INFO: renamed from: a */
    public static JSONObject m2612a(Context context, long j, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (!jSONObject.has("content")) {
                return jSONObject2;
            }
            JSONObject jSONObject3 = jSONObject.getJSONObject("content");
            if (jSONObject3.has("analytics")) {
                JSONObject jSONObject4 = jSONObject3.getJSONObject("analytics");
                if (jSONObject4.has("ekv")) {
                    jSONObject4.remove("ekv");
                }
                if (jSONObject4.has(C0708d.f2604T)) {
                    jSONObject4.remove(C0708d.f2604T);
                }
                if (jSONObject4.has(C0708d.f2599O)) {
                    jSONObject4.remove(C0708d.f2599O);
                }
                jSONObject3.put("analytics", jSONObject4);
            }
            jSONObject2.put("content", jSONObject3);
            if (jSONObject.has("header")) {
                jSONObject2.put("header", jSONObject.getJSONObject("header"));
            }
            if (m2611a(jSONObject2) <= j) {
                return jSONObject2;
            }
            jSONObject2 = null;
            C0713i.m2480a(context).m2512i();
            C0713i.m2480a(context).m2511h();
            C0713i.m2480a(context).m2503b(true, false);
            C0713i.m2480a(context).m2494a();
            UMRTLog.m2757i(UMRTLog.RTLOG_TAG, "--->>> u-app packet overload !!! ");
            return null;
        } catch (Throwable unused) {
            return jSONObject2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m2611a(JSONObject jSONObject) {
        return jSONObject.toString().getBytes().length;
    }

    /* JADX INFO: renamed from: a */
    public static long m2610a(JSONArray jSONArray) {
        return jSONArray.toString().getBytes().length;
    }
}
