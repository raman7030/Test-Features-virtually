package com.alipay.sdk.p010m.p057x;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.sdk.app.OpenAuthTask;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p041p.C0188e;
import com.alipay.sdk.p010m.p058y.C0244g;
import java.util.Random;
import org.json.JSONObject;
import p067l.C7470;

/* JADX INFO: renamed from: com.alipay.sdk.m.x.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0237a {

    /* JADX INFO: renamed from: g */
    public static final String f1127g = "alipay_tid_storage";

    /* JADX INFO: renamed from: h */
    public static final String f1128h = "tidinfo";

    /* JADX INFO: renamed from: i */
    public static final String f1129i = "tid";

    /* JADX INFO: renamed from: j */
    public static final String f1130j = "client_key";

    /* JADX INFO: renamed from: k */
    public static final String f1131k = "timestamp";

    /* JADX INFO: renamed from: l */
    public static final String f1132l = "vimei";

    /* JADX INFO: renamed from: m */
    public static final String f1133m = "vimsi";

    /* JADX INFO: renamed from: n */
    public static Context f1134n;

    /* JADX INFO: renamed from: o */
    public static C0237a f1135o;

    /* JADX INFO: renamed from: a */
    public String f1136a;

    /* JADX INFO: renamed from: b */
    public String f1137b;

    /* JADX INFO: renamed from: c */
    public long f1138c;

    /* JADX INFO: renamed from: d */
    public String f1139d;

    /* JADX INFO: renamed from: e */
    public String f1140e;

    /* JADX INFO: renamed from: f */
    public boolean f1141f = false;

    /* JADX INFO: renamed from: b */
    public final void m1147b(Context context) {
        if (context != null) {
            f1134n = context.getApplicationContext();
        }
        if (this.f1141f) {
            return;
        }
        this.f1141f = true;
        m1157l();
    }

    /* JADX INFO: renamed from: c */
    public String m1148c() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        return hexString.length() > 10 ? hexString.substring(hexString.length() - 10) : hexString;
    }

    /* JADX INFO: renamed from: d */
    public final String m1149d() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        StringBuilder sbM17248 = C7470.m17248(hexString);
        sbM17248.append(random.nextInt(OpenAuthTask.f239OK) + 1000);
        return sbM17248.toString();
    }

    /* JADX INFO: renamed from: e */
    public String m1150e() {
        return this.f1137b;
    }

    /* JADX INFO: renamed from: f */
    public String m1151f() {
        return this.f1136a;
    }

    /* JADX INFO: renamed from: g */
    public Long m1152g() {
        return Long.valueOf(this.f1138c);
    }

    /* JADX INFO: renamed from: h */
    public String m1153h() {
        return this.f1139d;
    }

    /* JADX INFO: renamed from: i */
    public String m1154i() {
        return this.f1140e;
    }

    /* JADX INFO: renamed from: j */
    public boolean m1155j() {
        return m1156k();
    }

    /* JADX INFO: renamed from: k */
    public boolean m1156k() {
        return TextUtils.isEmpty(this.f1136a) || TextUtils.isEmpty(this.f1137b) || TextUtils.isEmpty(this.f1139d) || TextUtils.isEmpty(this.f1140e);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX INFO: renamed from: l */
    public final void m1157l() {
        String strOptString;
        String strOptString2;
        String strOptString3;
        String str;
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        String strOptString4 = null;
        try {
            String strM1162a = a.m1162a(f1127g, f1128h, true);
            if (TextUtils.isEmpty(strM1162a)) {
                str = null;
                strOptString2 = null;
                strOptString3 = null;
            } else {
                JSONObject jSONObject = new JSONObject(strM1162a);
                strOptString = jSONObject.optString("tid", "");
                try {
                    strOptString2 = jSONObject.optString(f1130j, "");
                    try {
                        lValueOf = Long.valueOf(jSONObject.optLong(f1131k, System.currentTimeMillis()));
                        strOptString3 = jSONObject.optString(f1132l, "");
                        try {
                            strOptString4 = jSONObject.optString(f1133m, "");
                        } catch (Exception e) {
                            e = e;
                            C0244g.m1199a(e);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        strOptString3 = null;
                    }
                } catch (Exception e3) {
                    e = e3;
                    strOptString2 = null;
                    strOptString3 = null;
                    C0244g.m1199a(e);
                    str = strOptString4;
                    strOptString4 = strOptString;
                    C0244g.m1201b(C0170a.f659B, "tid_str: load");
                    if (m1145a(strOptString4, strOptString2, strOptString3, str)) {
                        m1158m();
                        return;
                    }
                    this.f1136a = strOptString4;
                    this.f1137b = strOptString2;
                    this.f1138c = lValueOf.longValue();
                    this.f1139d = strOptString3;
                    this.f1140e = str;
                }
                str = strOptString4;
                strOptString4 = strOptString;
            }
        } catch (Exception e4) {
            e = e4;
            strOptString = null;
        }
        C0244g.m1201b(C0170a.f659B, "tid_str: load");
        if (m1145a(strOptString4, strOptString2, strOptString3, str)) {
            m1158m();
            return;
        }
        this.f1136a = strOptString4;
        this.f1137b = strOptString2;
        this.f1138c = lValueOf.longValue();
        this.f1139d = strOptString3;
        this.f1140e = str;
    }

    /* JADX INFO: renamed from: m */
    public final void m1158m() {
        this.f1136a = "";
        this.f1137b = m1148c();
        this.f1138c = System.currentTimeMillis();
        this.f1139d = m1149d();
        this.f1140e = m1149d();
        a.m1166b(f1127g, f1128h);
    }

    /* JADX INFO: renamed from: n */
    public final void m1159n() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tid", this.f1136a);
            jSONObject.put(f1130j, this.f1137b);
            jSONObject.put(f1131k, this.f1138c);
            jSONObject.put(f1132l, this.f1139d);
            jSONObject.put(f1133m, this.f1140e);
            a.m1164a(f1127g, f1128h, jSONObject.toString(), true);
        } catch (Exception e) {
            C0244g.m1199a(e);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1160o() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C0237a m1142a(Context context) {
        if (f1135o == null) {
            f1135o = new C0237a();
        }
        if (f1134n == null) {
            f1135o.m1147b(context);
        }
        return f1135o;
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.x.a$a */
    /* JADX INFO: compiled from: N673 */
    public class a {
        /* JADX INFO: renamed from: a */
        public static boolean m1165a(String str, String str2) {
            if (C0237a.f1134n == null) {
                return false;
            }
            return C0237a.f1134n.getSharedPreferences(str, 0).contains(str2);
        }

        /* JADX INFO: renamed from: b */
        public static void m1166b(String str, String str2) {
            if (C0237a.f1134n == null) {
                return;
            }
            C0237a.f1134n.getSharedPreferences(str, 0).edit().remove(str2).apply();
        }

        /* JADX INFO: renamed from: c */
        public static boolean m1167c(String str, String str2) {
            if (C0237a.f1134n == null) {
                return false;
            }
            return C0237a.f1134n.getSharedPreferences(str, 0).contains(str2);
        }

        /* JADX INFO: renamed from: d */
        public static String m1168d(String str, String str2) {
            return m1162a(str, str2, true);
        }

        /* JADX INFO: renamed from: a */
        public static String m1162a(String str, String str2, boolean z) {
            if (C0237a.f1134n == null) {
                return null;
            }
            String string = C0237a.f1134n.getSharedPreferences(str, 0).getString(str2, null);
            if (!TextUtils.isEmpty(string) && z) {
                string = C0188e.m910a(m1161a(), string, string);
                if (TextUtils.isEmpty(string)) {
                    C0244g.m1201b(C0170a.f659B, "tid_str: pref failed");
                }
            }
            C0244g.m1201b(C0170a.f659B, "tid_str: from local");
            return string;
        }

        /* JADX INFO: renamed from: a */
        public static void m1163a(String str, String str2, String str3) {
            m1164a(str, str2, str3, true);
        }

        /* JADX INFO: renamed from: a */
        public static void m1164a(String str, String str2, String str3, boolean z) {
            if (C0237a.f1134n == null) {
                return;
            }
            SharedPreferences sharedPreferences = C0237a.f1134n.getSharedPreferences(str, 0);
            if (z) {
                str3 = C0188e.m912b(m1161a(), str3, str3);
                TextUtils.isEmpty(str3);
            }
            sharedPreferences.edit().putString(str2, str3).apply();
        }

        /* JADX INFO: renamed from: a */
        public static String m1161a() {
            String packageName;
            try {
                packageName = C0237a.f1134n.getApplicationContext().getPackageName();
            } catch (Throwable th) {
                C0244g.m1199a(th);
                packageName = "";
            }
            return (packageName + "0000000000000000000000000000").substring(0, 24);
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1145a(String str, String str2, String str3, String str4) {
        return TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4);
    }

    /* JADX INFO: renamed from: b */
    public void m1146b() {
        C0244g.m1201b(C0170a.f659B, "tid_str: del");
        m1158m();
    }

    /* JADX INFO: renamed from: a */
    public void m1143a(String str, String str2) {
        C0244g.m1201b(C0170a.f659B, "tid_str: save");
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.f1136a = str;
        this.f1137b = str2;
        this.f1138c = System.currentTimeMillis();
        m1159n();
        m1160o();
    }

    /* JADX INFO: renamed from: a */
    public final void m1144a(String str, String str2, String str3, String str4, Long l2) {
        if (m1145a(str, str2, str3, str4)) {
            return;
        }
        this.f1136a = str;
        this.f1137b = str2;
        this.f1139d = str3;
        this.f1140e = str4;
        if (l2 == null) {
            this.f1138c = System.currentTimeMillis();
        } else {
            this.f1138c = l2.longValue();
        }
        m1159n();
    }
}
