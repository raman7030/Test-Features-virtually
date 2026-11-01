package com.alipay.sdk.p010m.p055w;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.app.AlipayApi;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p039o.C0180b;
import com.alipay.sdk.p010m.p058y.C0238a;
import com.alipay.sdk.p010m.p058y.C0244g;
import com.alipay.sdk.p010m.p058y.C0250m;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.analytics.pro.C0655am;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;
import p067l.C17073;
import p067l.C24104;
import p067l.C6988;
import p067l.C7470;

/* JADX INFO: renamed from: com.alipay.sdk.m.w.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0233a {

    /* JADX INFO: renamed from: A */
    public static final String f1074A = "extInfo";

    /* JADX INFO: renamed from: B */
    public static final String f1075B = "ap_link_token";

    /* JADX INFO: renamed from: C */
    public static final String f1076C = "act_info";

    /* JADX INFO: renamed from: D */
    public static final String f1077D = "UTF-8";

    /* JADX INFO: renamed from: E */
    public static final String f1078E = "preheatUserToken";

    /* JADX INFO: renamed from: F */
    public static final String f1079F = "preheatToken";

    /* JADX INFO: renamed from: G */
    public static final String f1080G = "preheatTime";

    /* JADX INFO: renamed from: H */
    public static final String f1081H = "sp_preheatUserToken";

    /* JADX INFO: renamed from: I */
    public static final String f1082I = "new_external_info==";

    /* JADX INFO: renamed from: o */
    public static final String f1083o = "\"&";

    /* JADX INFO: renamed from: p */
    public static final String f1084p = "&";

    /* JADX INFO: renamed from: q */
    public static final String f1085q = "bizcontext=\"";

    /* JADX INFO: renamed from: r */
    public static final String f1086r = "bizcontext=";

    /* JADX INFO: renamed from: s */
    public static final String f1087s = "\"";

    /* JADX INFO: renamed from: t */
    public static final String f1088t = "appkey";

    /* JADX INFO: renamed from: u */
    public static final String f1089u = "ty";

    /* JADX INFO: renamed from: v */
    public static final String f1090v = "sv";

    /* JADX INFO: renamed from: w */
    public static final String f1091w = "an";

    /* JADX INFO: renamed from: x */
    public static final String f1092x = "setting";

    /* JADX INFO: renamed from: y */
    public static final String f1093y = "av";

    /* JADX INFO: renamed from: z */
    public static final String f1094z = "sdk_start_time";

    /* JADX INFO: renamed from: a */
    public String f1095a;

    /* JADX INFO: renamed from: b */
    public String f1096b;

    /* JADX INFO: renamed from: c */
    public Context f1097c;

    /* JADX INFO: renamed from: d */
    public final String f1098d;

    /* JADX INFO: renamed from: e */
    public final long f1099e;

    /* JADX INFO: renamed from: f */
    public final int f1100f;

    /* JADX INFO: renamed from: g */
    public final String f1101g;

    /* JADX INFO: renamed from: h */
    public String f1102h;

    /* JADX INFO: renamed from: i */
    public String f1103i;

    /* JADX INFO: renamed from: j */
    public boolean f1104j = false;

    /* JADX INFO: renamed from: k */
    public boolean f1105k = false;

    /* JADX INFO: renamed from: l */
    public boolean f1106l = false;

    /* JADX INFO: renamed from: m */
    public final ActivityInfo f1107m;

    /* JADX INFO: renamed from: n */
    public final C0168b f1108n;

    public C0233a(Context context, String str, String str2) {
        String str3;
        this.f1095a = "";
        this.f1096b = "";
        this.f1097c = null;
        this.f1102h = null;
        this.f1103i = null;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        this.f1108n = new C0168b(context, zIsEmpty);
        String strM1092b = m1092b(str, this.f1096b);
        this.f1098d = strM1092b;
        this.f1099e = SystemClock.elapsedRealtime();
        this.f1100f = C0254q.m1296g();
        ActivityInfo activityInfoM1247a = C0254q.m1247a(context);
        this.f1107m = activityInfoM1247a;
        this.f1101g = str2;
        if (!zIsEmpty) {
            C0167a.m750a(this, C0168b.f618l, "eptyp", C24104.m53357(str2, "|", strM1092b));
            if (activityInfoM1247a != null) {
                str3 = activityInfoM1247a.name + "|" + activityInfoM1247a.launchMode;
            } else {
                str3 = "null";
            }
            C0167a.m750a(this, C0168b.f618l, "actInfo", str3);
            C0167a.m750a(this, C0168b.f618l, "sys", C0254q.m1254a(this));
            C0167a.m750a(this, C0168b.f618l, "sdkv", "478258c-clean");
            C0167a.m750a(this, C0168b.f618l, "registerApp", AlipayApi.f221e + "");
        }
        try {
            this.f1097c = context.getApplicationContext();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.f1095a = packageInfo.versionName;
            this.f1096b = packageInfo.packageName;
        } catch (Exception e) {
            C0244g.m1199a(e);
        }
        if (!zIsEmpty) {
            C0167a.m749a(this, C0168b.f618l, C0655am.f2280aH + C0254q.m1296g());
            C0167a.m750a(this, C0168b.f618l, C0168b.f596Q, "" + SystemClock.elapsedRealtime());
            C0167a.m748a(context, this, str, this.f1098d);
        }
        if (!zIsEmpty && C0180b.m829i().m869t()) {
            C0180b.m829i().m835a(this, this.f1097c, true, 2);
        }
        if (C0180b.m829i().m842a((C0233a) null)) {
            return;
        }
        this.f1102h = C0250m.m1228a(this, m1101b(), f1081H, "");
        this.f1103i = m1093c(str, this.f1096b);
    }

    /* JADX INFO: renamed from: f */
    public static C0233a m1094f() {
        return null;
    }

    /* JADX INFO: renamed from: a */
    public String m1095a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (str.startsWith(f1082I)) {
            return m1109d(str);
        }
        return m1112f(str) ? m1106c(str) : m1110e(str);
    }

    /* JADX INFO: renamed from: b */
    public Context m1101b() {
        return this.f1097c;
    }

    /* JADX INFO: renamed from: c */
    public String m1105c() {
        return this.f1096b;
    }

    /* JADX INFO: renamed from: d */
    public String m1108d() {
        return this.f1095a;
    }

    /* JADX INFO: renamed from: e */
    public final String m1110e(String str) {
        try {
            String strM1097a = m1097a(str, f1083o, f1085q);
            if (TextUtils.isEmpty(strM1097a)) {
                return str + f1084p + m1096a(f1085q, "\"");
            }
            if (!strM1097a.endsWith("\"")) {
                strM1097a = strM1097a.concat("\"");
            }
            int iIndexOf = str.indexOf(strM1097a);
            return str.substring(0, iIndexOf) + m1103b(strM1097a, f1085q, "\"") + str.substring(iIndexOf + strM1097a.length());
        } catch (Throwable th) {
            C0167a.m752a(this, C0168b.f618l, "fmt2", th, str);
            return str;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1112f(String str) {
        return !str.contains(f1083o);
    }

    /* JADX INFO: renamed from: g */
    public String m1113g() {
        return this.f1103i;
    }

    /* JADX INFO: renamed from: h */
    public boolean m1114h() {
        return this.f1105k;
    }

    /* JADX INFO: renamed from: i */
    public boolean m1115i() {
        return this.f1104j;
    }

    /* JADX INFO: renamed from: j */
    public boolean m1116j() {
        return this.f1106l;
    }

    /* JADX INFO: renamed from: b */
    public final String m1103b(String str, String str2, String str3) {
        JSONObject jSONObject;
        String strSubstring = str.substring(str2.length());
        boolean z = false;
        String strSubstring2 = strSubstring.substring(0, strSubstring.length() - str3.length());
        if (strSubstring2.length() >= 2 && strSubstring2.startsWith("\"") && strSubstring2.endsWith("\"")) {
            z = true;
            jSONObject = new JSONObject(C17073.m38720(1, 1, strSubstring2));
        } else {
            jSONObject = new JSONObject(strSubstring2);
        }
        String strM1098a = m1098a(jSONObject);
        if (z) {
            strM1098a = C6988.m16053("\"", strM1098a, "\"");
        }
        return C24104.m53357(str2, strM1098a, str3);
    }

    /* JADX INFO: renamed from: c */
    public final String m1106c(String str) {
        try {
            String strM1097a = m1097a(str, f1084p, f1086r);
            if (TextUtils.isEmpty(strM1097a)) {
                return str + f1084p + m1096a(f1086r, "");
            }
            int iIndexOf = str.indexOf(strM1097a);
            return str.substring(0, iIndexOf) + m1103b(strM1097a, f1086r, "") + str.substring(iIndexOf + strM1097a.length());
        } catch (Throwable th) {
            C0167a.m752a(this, C0168b.f618l, "fmt1", th, str);
            return str;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m1109d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str.substring(19));
            jSONObject.put("bizcontext", m1102b(jSONObject.optString("bizcontext")));
            return f1082I + jSONObject.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.w.a$a */
    /* JADX INFO: compiled from: N673 */
    public final class a {

        /* JADX INFO: renamed from: a */
        public static final HashMap f1109a = new HashMap();

        /* JADX INFO: renamed from: b */
        public static final HashMap f1110b = new HashMap();

        /* JADX INFO: renamed from: c */
        public static final String f1111c = "i_uuid_b_c";

        /* JADX INFO: renamed from: a */
        public static void m1119a(C0233a c0233a, Intent intent) {
            if (c0233a == null || intent == null) {
                return;
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            f1109a.put(uuidRandomUUID, c0233a);
            intent.putExtra(f1111c, uuidRandomUUID);
        }

        /* JADX INFO: renamed from: a */
        public static C0233a m1117a(Intent intent) {
            if (intent == null) {
                return null;
            }
            Serializable serializableExtra = intent.getSerializableExtra(f1111c);
            if (serializableExtra instanceof UUID) {
                return (C0233a) f1109a.remove((UUID) serializableExtra);
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        public static void m1120a(C0233a c0233a, String str) {
            if (c0233a == null || TextUtils.isEmpty(str)) {
                return;
            }
            f1110b.put(str, c0233a);
        }

        /* JADX INFO: renamed from: a */
        public static C0233a m1118a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (C0233a) f1110b.remove(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m1097a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(str2);
        for (int i = 0; i < strArrSplit.length; i++) {
            if (!TextUtils.isEmpty(strArrSplit[i]) && strArrSplit[i].startsWith(str3)) {
                return strArrSplit[i];
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m1093c(String str, String str2) {
        try {
            Locale locale = Locale.getDefault();
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            return C0254q.m1298g(String.format(locale, "%s%s%d%s", str, str2, Long.valueOf(System.currentTimeMillis()), UUID.randomUUID().toString()));
        } catch (Throwable th) {
            C0244g.m1202c(C0170a.f659B, "generatePreheatTokenError");
            C0244g.m1199a(th);
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m1111e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(f1075B, this.f1098d);
            if (m1100a() && C0180b.m829i().m857i(null)) {
                jSONObject.put(f1078E, this.f1102h);
                jSONObject.put(f1079F, this.f1103i);
                jSONObject.put(f1080G, System.currentTimeMillis() + "");
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final String m1096a(String str, String str2) {
        StringBuilder sbM17248 = C7470.m17248(str);
        sbM17248.append(m1098a(new JSONObject()));
        sbM17248.append(str2);
        return sbM17248.toString();
    }

    /* JADX INFO: renamed from: a */
    public String m1098a(JSONObject jSONObject) {
        String str;
        try {
            if (!jSONObject.has("appkey")) {
                jSONObject.put("appkey", C0170a.f669h);
            }
            if (!jSONObject.has(f1089u)) {
                jSONObject.put(f1089u, "and_lite");
            }
            if (!jSONObject.has(f1090v)) {
                jSONObject.put(f1090v, "h.a.3.8.40");
            }
            if (!jSONObject.has(f1091w)) {
                jSONObject.put(f1091w, this.f1096b);
            }
            if (!jSONObject.has(f1093y)) {
                jSONObject.put(f1093y, this.f1095a);
            }
            if (!jSONObject.has(f1094z)) {
                jSONObject.put(f1094z, System.currentTimeMillis());
            }
            if (!jSONObject.has(f1074A)) {
                jSONObject.put(f1074A, m1111e());
            }
            if (!jSONObject.has(f1076C)) {
                if (this.f1107m != null) {
                    str = this.f1107m.name + "|" + this.f1107m.launchMode;
                } else {
                    str = "null";
                }
                jSONObject.put(f1076C, str);
            }
            return jSONObject.toString();
        } catch (Throwable th) {
            C0167a.m752a(this, C0168b.f618l, "fmt3", th, String.valueOf(jSONObject));
            C0244g.m1199a(th);
            return jSONObject != null ? jSONObject.toString() : "{}";
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m1102b(String str) {
        return m1098a(new JSONObject(str));
    }

    /* JADX INFO: renamed from: b */
    public static String m1092b(String str, String str2) {
        try {
            Locale locale = Locale.getDefault();
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            return "EP1" + C0254q.m1298g(String.format(locale, "%s%s%d%s", str, str2, Long.valueOf(System.currentTimeMillis()), UUID.randomUUID().toString())) + "_" + System.currentTimeMillis();
        } catch (Throwable unused) {
            return "-";
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1107c(boolean z) {
        this.f1106l = z;
    }

    /* JADX INFO: renamed from: a */
    public static HashMap m1091a(C0233a c0233a) {
        HashMap map = new HashMap();
        if (c0233a != null) {
            map.put("sdk_ver", "15.8.40");
            map.put("app_name", c0233a.f1096b);
            map.put("token", c0233a.f1098d);
            map.put("call_type", c0233a.f1101g);
            map.put("ts_api_invoke", String.valueOf(c0233a.f1099e));
            C0238a.m1172a(c0233a, map);
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public void m1099a(boolean z) {
        this.f1105k = z;
    }

    /* JADX INFO: renamed from: b */
    public void m1104b(boolean z) {
        this.f1104j = z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1100a() {
        return !TextUtils.isEmpty(this.f1102h);
    }
}
