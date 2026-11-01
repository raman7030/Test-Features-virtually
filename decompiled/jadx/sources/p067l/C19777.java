package p067l;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩳ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C19777 {

    /* JADX INFO: renamed from: ᩻ */
    public static C19777 f60167;

    /* JADX INFO: renamed from: ᩳ */
    public Handler f60173;

    /* JADX INFO: renamed from: ֫ */
    public SecureRandom f60168 = new SecureRandom();

    /* JADX INFO: renamed from: ܽ */
    public List f60171 = C18426.m41997();

    /* JADX INFO: renamed from: ۧ */
    public List f60169 = C18426.m41997();

    /* JADX INFO: renamed from: ܿ */
    public Executor f60172 = C18455.m42011();

    /* JADX INFO: renamed from: ܳ */
    public Executor f60170 = C18455.m42011();

    /* JADX INFO: renamed from: ۧ */
    public static synchronized C19777 m44948() {
        if (f60167 == null) {
            f60167 = new C19777();
        }
        return f60167;
    }

    public C19777() {
        HandlerThread handlerThread = new HandlerThread("opensdk.report.handlerthread", 10);
        handlerThread.start();
        if (!handlerThread.isAlive() || handlerThread.getLooper() == null) {
            return;
        }
        this.f60173 = new HandlerC4354(this, handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44950(Bundle bundle, String str, boolean z) {
        int iM53971;
        C11060.m25471("openSDK_LOG.ReportManager", "-->reportVia, bundle: " + bundle.toString());
        C11060.m25471("openSDK_LOG.ReportManager", "-->availableFrequency, report: report_via | ext: " + str);
        boolean z2 = false;
        if (!TextUtils.isEmpty("report_via")) {
            if (C24158.m53410() == null || (iM53971 = C24470.m53965(C24158.m53410(), str).m53971("Common_BusinessReportFrequency")) == 0) {
                iM53971 = 100;
            }
            z2 = this.f60168.nextInt(100) < iM53971;
            C11060.m25471("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z2 + " | frequency: " + iM53971);
        }
        if (z2 || z) {
            this.f60172.execute(new RunnableC13072(this, bundle, z));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44946(String str, long j, long j2, long j3, int i) {
        m44947(str, j, j2, j3, i, "");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m44947(String str, long j, long j2, long j3, int i, String str2) {
        C11060.m25471("openSDK_LOG.ReportManager", "-->reportCgi, command: " + str + " | startTime: " + j + " | reqSize:" + j2 + " | rspSize: " + j3 + " | responseCode: " + i + " | detail: " + str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final HashMap m44949() {
        List listM41997 = C18426.m41997();
        List<Serializable> list = this.f60171;
        if (listM41997 != null) {
            list.addAll(listM41997);
        }
        C11060.m25471("openSDK_LOG.ReportManager", "-->prepareViaData, mViaList size: " + list.size());
        if (list.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Serializable serializable : list) {
            JSONObject jSONObject = new JSONObject();
            C24290 c24290 = (C24290) serializable;
            for (String str : c24290.f76941.keySet()) {
                try {
                    String str2 = (String) c24290.f76941.get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put(str, str2);
                } catch (JSONException e) {
                    C11060.m25465("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e);
                }
            }
            jSONArray.put(jSONObject);
        }
        C11060.m25471("openSDK_LOG.ReportManager", "-->prepareViaData, JSONArray array: " + jSONArray.toString());
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(AbstractC0213e.f989m, jSONArray);
            HashMap map = new HashMap();
            map.put(AbstractC0213e.f989m, jSONObject2.toString());
            return map;
        } catch (JSONException e2) {
            C11060.m25465("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e2);
            return null;
        }
    }
}
