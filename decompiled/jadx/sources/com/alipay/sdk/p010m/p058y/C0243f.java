package com.alipay.sdk.p010m.p058y;

import com.alipay.sdk.p010m.p037n.C0170a;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.sdk.m.y.f */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0243f {
    /* JADX INFO: renamed from: a */
    public static JSONObject m1192a(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = new JSONObject();
        try {
            JSONObject[] jSONObjectArr = {jSONObject, jSONObject2};
            for (int i = 0; i < 2; i++) {
                JSONObject jSONObject4 = jSONObjectArr[i];
                if (jSONObject4 != null) {
                    Iterator<String> itKeys = jSONObject4.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject3.put(next, jSONObject4.get(next));
                    }
                }
            }
            return jSONObject3;
        } catch (JSONException e) {
            C0244g.m1199a(e);
            return jSONObject3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1191a(String str) {
        try {
            return JSONObject.quote(str).replace("'", "\\'");
        } catch (Throwable th) {
            C0244g.m1201b(C0170a.f659B, "escapeJsonStringError");
            C0244g.m1199a(th);
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1193a(JSONObject jSONObject, String str, Boolean bool) {
        if (jSONObject == null || str == null) {
            return;
        }
        if (bool == null) {
            jSONObject.remove(str);
        } else {
            jSONObject.put(str, bool);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1194a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null || str == null) {
            return;
        }
        if (str2 == null) {
            jSONObject.remove(str);
        } else {
            jSONObject.put(str, str2);
        }
    }
}
