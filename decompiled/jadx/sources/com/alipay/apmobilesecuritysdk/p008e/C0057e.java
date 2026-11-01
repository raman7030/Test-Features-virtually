package com.alipay.apmobilesecuritysdk.p008e;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p006c.C0044a;
import com.alipay.apmobilesecuritysdk.p009f.C0062a;
import com.alipay.sdk.p010m.p018d0.C0106a;
import com.umeng.commonsdk.statistics.idtracking.C0807f;
import com.umeng.commonsdk.statistics.idtracking.C0808g;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.e.e */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0057e {
    /* JADX INFO: renamed from: a */
    public static C0058f m326a(Context context) {
        if (context == null) {
            return null;
        }
        String strM378a = C0062a.m378a(context, "device_feature_prefs_name", "device_feature_prefs_key");
        if (C0106a.m564a(strM378a)) {
            strM378a = C0062a.m379a("device_feature_file_name", "device_feature_file_key");
        }
        if (C0106a.m564a(strM378a)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM378a);
            C0058f c0058f = new C0058f();
            c0058f.m329a(jSONObject.getString(C0807f.f3430a));
            c0058f.m331b(jSONObject.getString("imsi"));
            c0058f.m333c(jSONObject.getString(C0808g.f3432a));
            c0058f.m335d(jSONObject.getString("bluetoothmac"));
            c0058f.m337e(jSONObject.getString("gsi"));
            return c0058f;
        } catch (Exception e) {
            C0044a.m293a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m327a(Context context, C0058f c0058f) {
        if (c0058f == null || context == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C0807f.f3430a, c0058f.m328a());
            jSONObject.put("imsi", c0058f.m330b());
            jSONObject.put(C0808g.f3432a, c0058f.m332c());
            jSONObject.put("bluetoothmac", c0058f.m334d());
            jSONObject.put("gsi", c0058f.m336e());
            String string = jSONObject.toString();
            C0062a.m381a("device_feature_file_name", "device_feature_file_key", string);
            C0062a.m380a(context, "device_feature_prefs_name", "device_feature_prefs_key", string);
        } catch (Exception e) {
            C0044a.m293a(e);
        }
    }
}
