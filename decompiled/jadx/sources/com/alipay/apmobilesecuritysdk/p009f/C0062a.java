package com.alipay.apmobilesecuritysdk.p009f;

import android.content.Context;
import com.alipay.sdk.p010m.p018d0.C0106a;
import com.alipay.sdk.p010m.p020e0.C0111c;
import com.alipay.sdk.p010m.p024g0.C0132b;
import com.alipay.sdk.p010m.p024g0.C0135e;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.f.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0062a {
    /* JADX INFO: renamed from: a */
    public static String m378a(Context context, String str, String str2) {
        if (context != null && !C0106a.m564a(str) && !C0106a.m564a(str2)) {
            try {
                String strM679b = C0135e.m679b(context, str, str2, "");
                if (C0106a.m564a(strM679b)) {
                    return null;
                }
                return C0111c.m589b(C0111c.m583a(), strM679b);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m379a(String str, String str2) {
        synchronized (C0062a.class) {
            if (!C0106a.m564a(str) && !C0106a.m564a(str2)) {
                try {
                    String strM671a = C0132b.m671a(str);
                    if (!C0106a.m564a(strM671a)) {
                        String string = new JSONObject(strM671a).getString(str2);
                        if (!C0106a.m564a(string)) {
                            return C0111c.m589b(C0111c.m583a(), string);
                        }
                    }
                } catch (Throwable unused) {
                    return null;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m380a(Context context, String str, String str2, String str3) {
        if (C0106a.m564a(str) || C0106a.m564a(str2) || context == null) {
            return;
        }
        try {
            String strM584a = C0111c.m584a(C0111c.m583a(), str3);
            HashMap map = new HashMap();
            map.put(str2, strM584a);
            C0135e.m678a(context, str, map);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m381a(String str, String str2, String str3) {
        synchronized (C0062a.class) {
            if (C0106a.m564a(str) || C0106a.m564a(str2)) {
                return;
            }
            try {
                String strM671a = C0132b.m671a(str);
                JSONObject jSONObject = new JSONObject();
                if (C0106a.m567b(strM671a)) {
                    try {
                        jSONObject = new JSONObject(strM671a);
                    } catch (Exception unused) {
                        jSONObject = new JSONObject();
                    }
                }
                jSONObject.put(str2, C0111c.m584a(C0111c.m583a(), str3));
                C0132b.m672a(str, jSONObject.toString());
            } catch (Throwable unused2) {
            }
        }
    }
}
