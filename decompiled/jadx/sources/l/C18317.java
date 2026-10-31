package l;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.alipay.sdk.m.t.e;
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
public final class C18317 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C18317 f56949;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Handler f56955;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public SecureRandom f56950 = new SecureRandom();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public List f56953 = C16895.m39756();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public List f56951 = C16895.m39756();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Executor f56954 = C16926.m39770();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Executor f56952 = C16926.m39770();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static synchronized C18317 m42686() {
        if (f56949 == null) {
            f56949 = new C18317();
        }
        return f56949;
    }

    public C18317() {
        HandlerThread handlerThread = new HandlerThread("opensdk.report.handlerthread", 10);
        handlerThread.start();
        if (!handlerThread.isAlive() || handlerThread.getLooper() == null) {
            return;
        }
        this.f56955 = new HandlerC2089(this, handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42688(Bundle bundle, String str, boolean z) {
        int iM51575;
        C9145.m23520("openSDK_LOG.ReportManager", "-->reportVia, bundle: " + bundle.toString());
        C9145.m23520("openSDK_LOG.ReportManager", "-->availableFrequency, report: report_via | ext: " + str);
        boolean z2 = false;
        if (!TextUtils.isEmpty("report_via")) {
            if (C22927.m51019() == null || (iM51575 = C23255.m51569(C22927.m51019(), str).m51575("Common_BusinessReportFrequency")) == 0) {
                iM51575 = 100;
            }
            z2 = this.f56950.nextInt(100) < iM51575;
            C9145.m23520("openSDK_LOG.ReportManager", "-->availableFrequency, result: " + z2 + " | frequency: " + iM51575);
        }
        if (z2 || z) {
            this.f56954.execute(new RunnableC11262(this, bundle, z));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42684(String str, long j, long j2, long j3, int i) {
        m42685(str, j, j2, j3, i, "");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42685(String str, long j, long j2, long j3, int i, String str2) {
        C9145.m23520("openSDK_LOG.ReportManager", "-->reportCgi, command: " + str + " | startTime: " + j + " | reqSize:" + j2 + " | rspSize: " + j3 + " | responseCode: " + i + " | detail: " + str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap m42687() {
        List listM39756 = C16895.m39756();
        List<Serializable> list = this.f56953;
        if (listM39756 != null) {
            list.addAll(listM39756);
        }
        C9145.m23520("openSDK_LOG.ReportManager", "-->prepareViaData, mViaList size: " + list.size());
        if (list.size() == 0) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Serializable serializable : list) {
            JSONObject jSONObject = new JSONObject();
            C23066 c23066 = (C23066) serializable;
            for (String str : c23066.f74196.keySet()) {
                try {
                    String str2 = (String) c23066.f74196.get(str);
                    if (str2 == null) {
                        str2 = "";
                    }
                    jSONObject.put(str, str2);
                } catch (JSONException e) {
                    C9145.m23514("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e);
                }
            }
            jSONArray.put(jSONObject);
        }
        C9145.m23520("openSDK_LOG.ReportManager", "-->prepareViaData, JSONArray array: " + jSONArray.toString());
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(e.m, jSONArray);
            HashMap map = new HashMap();
            map.put(e.m, jSONObject2.toString());
            return map;
        } catch (JSONException e2) {
            C9145.m23514("openSDK_LOG.ReportManager", "-->prepareViaData, put bundle to json array exception", e2);
            return null;
        }
    }
}
