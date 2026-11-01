package com.alipay.sdk.p010m.p058y;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p012a0.C0084b;
import com.alipay.sdk.p010m.p027i.C0142a;
import com.alipay.sdk.p010m.p029j.C0149a;
import com.alipay.sdk.p010m.p029j.C0151c;
import com.alipay.sdk.p010m.p029j.C0154f;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p039o.C0180b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p055w.C0234b;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.sdk.m.y.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0238a {

    /* JADX INFO: renamed from: a */
    public static final String f1142a = "ap_req";

    /* JADX INFO: renamed from: b */
    public static final String f1143b = "ap_args";

    /* JADX INFO: renamed from: c */
    public static final String f1144c = "ap_resp";

    /* JADX INFO: renamed from: a */
    public static C0142a m1169a() {
        try {
            try {
                return C0149a.m716a("NP", System.currentTimeMillis(), new C0151c(C0234b.m1121c().m1126d()), (short) C0167a.d.m767a(C0234b.m1121c().m1125b()), new C0154f());
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return C0149a.m717c();
        }
    }

    /* JADX INFO: renamed from: a */
    public static HashMap m1170a(C0233a c0233a) {
        HashMap map = new HashMap();
        try {
            C0142a c0142aM1169a = m1169a();
            JSONObject jSONObject = new JSONObject();
            Context contextM1101b = c0233a != null ? c0233a.m1101b() : null;
            if (contextM1101b == null) {
                contextM1101b = C0234b.m1121c().m1125b().getApplicationContext();
            }
            String strM1255a = C0254q.m1255a(c0233a, contextM1101b);
            String strM451b = C0084b.m451b(c0233a, contextM1101b);
            jSONObject.put("ap_q", c0142aM1169a != null ? c0142aM1169a.m694a() : "");
            jSONObject.put(C0233a.f1075B, c0233a != null ? c0233a.f1098d : "");
            jSONObject.put("u_pd", String.valueOf(C0254q.m1296g()));
            jSONObject.put("u_lk", String.valueOf(C0254q.m1289e(C0254q.m1274b())));
            jSONObject.put("u_pi", String.valueOf(c0233a != null ? c0233a.f1101g : "_"));
            jSONObject.put("u_fu", strM1255a);
            jSONObject.put("u_oi", strM451b);
            map.put(f1142a, jSONObject.toString());
            StringBuilder sb = new StringBuilder();
            sb.append(c0142aM1169a != null ? c0142aM1169a.m694a() : "");
            sb.append("|");
            sb.append(strM1255a);
            C0167a.m750a(c0233a, C0168b.f618l, "ap_q", sb.toString());
            return map;
        } catch (Exception e) {
            C0167a.m751a(c0233a, C0168b.f618l, "APMEx1", e);
            return map;
        }
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m1171a(C0233a c0233a, JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString(f1144c);
        try {
            if (TextUtils.isEmpty(strOptString)) {
                return null;
            }
            return new JSONObject(strOptString);
        } catch (JSONException e) {
            C0167a.m751a(c0233a, C0168b.f618l, "APMEx2", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1173a(C0233a c0233a, JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null || jSONObject2 == null) {
            return;
        }
        try {
            jSONObject.putOpt(f1143b, jSONObject2);
        } catch (JSONException e) {
            C0167a.m751a(c0233a, C0168b.f618l, "APMEx2", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1172a(C0233a c0233a, HashMap map) {
        JSONObject jSONObjectM834a = C0180b.m829i().m834a();
        if (map == null || jSONObjectM834a == null) {
            return;
        }
        C0167a.m750a(c0233a, C0168b.f618l, "ap_r", jSONObjectM834a.optString("ap_r"));
        map.putAll(C0254q.m1263a(jSONObjectM834a));
    }
}
