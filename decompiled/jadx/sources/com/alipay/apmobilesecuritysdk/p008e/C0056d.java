package com.alipay.apmobilesecuritysdk.p008e;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p006c.C0044a;
import com.alipay.apmobilesecuritysdk.p009f.C0062a;
import com.alipay.sdk.p010m.p018d0.C0106a;
import com.alipay.sdk.p010m.p057x.C0237a;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.e.d */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0056d {
    /* JADX INFO: renamed from: a */
    public static C0055c m319a(String str) {
        try {
            if (C0106a.m564a(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new C0055c(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString(C0237a.f1131k), jSONObject.optString("tid"), jSONObject.optString("utdid"));
        } catch (Exception e) {
            C0044a.m293a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m320a(Context context) {
        C0062a.m380a(context, "vkeyid_profiles_v4", "key_deviceid_v4", "");
        C0062a.m381a("wxcasxx_v4", "key_wxcasxx_v4", "");
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m321a(Context context, C0055c c0055c) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("apdid", c0055c.f174a);
            jSONObject.put("deviceInfoHash", c0055c.f175b);
            jSONObject.put(C0237a.f1131k, c0055c.f176c);
            jSONObject.put("tid", c0055c.f177d);
            jSONObject.put("utdid", c0055c.f178e);
            String string = jSONObject.toString();
            C0062a.m380a(context, "vkeyid_profiles_v4", "key_deviceid_v4", string);
            C0062a.m381a("wxcasxx_v4", "key_wxcasxx_v4", string);
        } catch (Exception e) {
            C0044a.m293a(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m322b(Context context) {
    }

    /* JADX INFO: renamed from: c */
    public static synchronized C0055c m323c(Context context) {
        String strM378a;
        strM378a = C0062a.m378a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
        if (C0106a.m564a(strM378a)) {
            strM378a = C0062a.m379a("wxcasxx_v4", "key_wxcasxx_v4");
        }
        return m319a(strM378a);
    }

    /* JADX INFO: renamed from: d */
    public static synchronized C0055c m324d(Context context) {
        String strM378a = C0062a.m378a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
        if (C0106a.m564a(strM378a)) {
            return null;
        }
        return m319a(strM378a);
    }

    /* JADX INFO: renamed from: e */
    public static synchronized C0055c m325e(Context context) {
        String strM379a = C0062a.m379a("wxcasxx_v4", "key_wxcasxx_v4");
        if (C0106a.m564a(strM379a)) {
            return null;
        }
        return m319a(strM379a);
    }
}
