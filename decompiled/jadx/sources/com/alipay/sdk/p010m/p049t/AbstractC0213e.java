package com.alipay.sdk.p010m.p049t;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p033l.C0161a;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import com.alipay.sdk.p010m.p039o.C0181c;
import com.alipay.sdk.p010m.p047s.C0202b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p055w.C0234b;
import com.alipay.sdk.p010m.p057x.C0237a;
import com.alipay.sdk.p010m.p058y.C0243f;
import com.alipay.sdk.p010m.p058y.C0244g;
import com.alipay.sdk.p010m.p058y.C0253p;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.sdk.m.t.e */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0213e {

    /* JADX INFO: renamed from: c */
    public static final String f979c = "msp-gzip";

    /* JADX INFO: renamed from: d */
    public static final String f980d = "Msp-Param";

    /* JADX INFO: renamed from: e */
    public static final String f981e = "Operation-Type";

    /* JADX INFO: renamed from: f */
    public static final String f982f = "content-type";

    /* JADX INFO: renamed from: g */
    public static final String f983g = "Version";

    /* JADX INFO: renamed from: h */
    public static final String f984h = "AppId";

    /* JADX INFO: renamed from: i */
    public static final String f985i = "des-mode";

    /* JADX INFO: renamed from: j */
    public static final String f986j = "namespace";

    /* JADX INFO: renamed from: k */
    public static final String f987k = "api_name";

    /* JADX INFO: renamed from: l */
    public static final String f988l = "api_version";

    /* JADX INFO: renamed from: m */
    public static final String f989m = "data";

    /* JADX INFO: renamed from: n */
    public static final String f990n = "params";

    /* JADX INFO: renamed from: o */
    public static final String f991o = "public_key";

    /* JADX INFO: renamed from: p */
    public static final String f992p = "device";

    /* JADX INFO: renamed from: q */
    public static final String f993q = "action";

    /* JADX INFO: renamed from: r */
    public static final String f994r = "type";

    /* JADX INFO: renamed from: s */
    public static final String f995s = "method";

    /* JADX INFO: renamed from: a */
    public boolean f996a = true;

    /* JADX INFO: renamed from: b */
    public boolean f997b = true;

    /* JADX INFO: renamed from: a */
    public Map mo1044a(boolean z, String str) {
        HashMap map = new HashMap();
        map.put(f979c, String.valueOf(z));
        map.put(f981e, "alipay.msp.cashier.dispatch.bytes");
        map.put(f982f, "application/octet-stream");
        map.put(f983g, UMCrashManager.CM_VERSION);
        map.put(f984h, "TAOBAO");
        map.put(f980d, C0209a.m1014a(str));
        map.put(f985i, "CBC");
        return map;
    }

    /* JADX INFO: renamed from: a */
    public abstract JSONObject mo1045a();

    /* JADX INFO: renamed from: b */
    public String mo1046b() {
        return "4.9.0";
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo1047c();

    /* JADX INFO: renamed from: a */
    public String mo1041a(C0233a c0233a) {
        HashMap map = new HashMap();
        map.put(f992p, Build.MODEL);
        map.put("namespace", "com.alipay.mobilecashier");
        map.put(f987k, "com.alipay.mcpay");
        map.put(f988l, mo1046b());
        return mo1043a(c0233a, map, new HashMap());
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m1034a(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", str);
        jSONObject2.put(f995s, str2);
        jSONObject.put("action", jSONObject2);
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public String mo1042a(C0233a c0233a, String str, JSONObject jSONObject) {
        C0234b c0234bM1121c = C0234b.m1121c();
        C0237a c0237aM1142a = C0237a.m1142a(c0234bM1121c.m1125b());
        JSONObject jSONObjectM1192a = C0243f.m1192a(new JSONObject(), jSONObject);
        try {
            jSONObjectM1192a.put(C0171b.f691d, str);
            jSONObjectM1192a.put("tid", c0237aM1142a.m1151f());
            jSONObjectM1192a.put(C0171b.f689b, c0234bM1121c.m1123a().m891a(c0233a, c0237aM1142a, mo1047c()));
            jSONObjectM1192a.put(C0171b.f692e, C0254q.m1268a(c0233a, c0234bM1121c.m1125b(), C0161a.f547d, false));
            jSONObjectM1192a.put(C0171b.f693f, C0254q.m1301h(c0234bM1121c.m1125b()));
            jSONObjectM1192a.put(C0171b.f695h, C0170a.f669h);
            jSONObjectM1192a.put("utdid", c0234bM1121c.m1126d());
            jSONObjectM1192a.put(C0171b.f697j, c0237aM1142a.m1150e());
            jSONObjectM1192a.put(C0171b.f698k, C0181c.m884b(c0234bM1121c.m1125b()));
        } catch (Throwable th) {
            C0167a.m751a(c0233a, C0168b.f618l, "BodyErr", th);
            C0244g.m1199a(th);
        }
        return jSONObjectM1192a.toString();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1035a(C0202b.b bVar) {
        return Boolean.valueOf(m1033a(bVar, f979c)).booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public static String m1033a(C0202b.b bVar, String str) {
        Map map;
        List list;
        if (bVar == null || str == null || (map = bVar.f951a) == null || (list = (List) map.get(str)) == null) {
            return null;
        }
        return TextUtils.join(",", list);
    }

    /* JADX INFO: renamed from: a */
    public String mo1043a(C0233a c0233a, HashMap map, HashMap map2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
        }
        if (map2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry entry2 : map2.entrySet()) {
                jSONObject3.put((String) entry2.getKey(), entry2.getValue());
            }
            jSONObject2.put("params", jSONObject3);
        }
        jSONObject.put(f989m, jSONObject2);
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1036a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(f989m);
            if (!jSONObject.has("params")) {
                return false;
            }
            String strOptString = jSONObject.getJSONObject("params").optString(f991o, null);
            if (!TextUtils.isEmpty(strOptString)) {
                C0181c.m882a(strOptString);
                return true;
            }
        } catch (JSONException e) {
            C0244g.m1199a(e);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public C0210b m1037a(C0233a c0233a, Context context) {
        return mo1038a(c0233a, context, "");
    }

    /* JADX INFO: renamed from: a */
    public C0210b mo1038a(C0233a c0233a, Context context, String str) {
        return m1039a(c0233a, context, str, C0253p.m1243b(context));
    }

    /* JADX INFO: renamed from: a */
    public C0210b m1039a(C0233a c0233a, Context context, String str, String str2) {
        return m1040a(c0233a, context, str, str2, true);
    }

    /* JADX INFO: renamed from: a */
    public C0210b m1040a(C0233a c0233a, Context context, String str, String str2, boolean z) {
        C0244g.m1201b(C0170a.f659B, "Packet: " + str2);
        C0211c c0211c = new C0211c(this.f997b);
        C0210b c0210b = new C0210b(mo1041a(c0233a), mo1042a(c0233a, str, mo1045a()));
        Map mapMo1044a = mo1044a(false, str);
        C0212d c0212dM1030a = c0211c.m1030a(c0210b, this.f996a, (String) mapMo1044a.get("iSr"));
        C0202b.b bVarM977a = C0202b.m977a(context, new C0202b.a(str2, mo1044a(c0212dM1030a.m1032b(), str), c0212dM1030a.m1031a()));
        if (bVarM977a != null) {
            C0210b c0210bM1029a = c0211c.m1029a(new C0212d(m1035a(bVarM977a), bVarM977a.f953c), (String) mapMo1044a.get("iSr"));
            return (c0210bM1029a != null && m1036a(c0210bM1029a.m1021b()) && z) ? m1040a(c0233a, context, str, str2, false) : c0210bM1029a;
        }
        throw new RuntimeException("Response is null.");
    }
}
