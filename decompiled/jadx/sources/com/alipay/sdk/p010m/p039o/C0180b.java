package com.alipay.sdk.p010m.p039o;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p049t.C0210b;
import com.alipay.sdk.p010m.p051u.C0218b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p055w.C0234b;
import com.alipay.sdk.p010m.p058y.C0238a;
import com.alipay.sdk.p010m.p058y.C0243f;
import com.alipay.sdk.p010m.p058y.C0244g;
import com.alipay.sdk.p010m.p058y.C0250m;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.umeng.analytics.pro.C0655am;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p067l.C24104;

/* JADX INFO: renamed from: com.alipay.sdk.m.o.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C0180b {

    /* JADX INFO: renamed from: A0 */
    public static final String f742A0 = "start_trans";

    /* JADX INFO: renamed from: B0 */
    public static final String f743B0 = "up_before_pay";

    /* JADX INFO: renamed from: C0 */
    public static final String f744C0 = "lck_k";

    /* JADX INFO: renamed from: D0 */
    public static final String f745D0 = "use_sc_lck_a";

    /* JADX INFO: renamed from: E0 */
    public static final String f746E0 = "utdid_factor";

    /* JADX INFO: renamed from: F0 */
    public static final String f747F0 = "cfg_max_time";

    /* JADX INFO: renamed from: G0 */
    public static final String f748G0 = "get_oa_id";

    /* JADX INFO: renamed from: H0 */
    public static final String f749H0 = "notifyFailApp";

    /* JADX INFO: renamed from: I0 */
    public static final String f750I0 = "startactivity_in_ui_thread";

    /* JADX INFO: renamed from: J0 */
    public static final String f751J0 = "optimize_trans_activity_degrade";

    /* JADX INFO: renamed from: K0 */
    public static final String f752K0 = "register_app_degrade_2";

    /* JADX INFO: renamed from: L0 */
    public static final String f753L0 = "sdk_pre_heat";

    /* JADX INFO: renamed from: M */
    public static final String f754M = "DynCon";

    /* JADX INFO: renamed from: M0 */
    public static final String f755M0 = "external_sdk_data_degrade";

    /* JADX INFO: renamed from: N */
    public static final int f756N = 10000;

    /* JADX INFO: renamed from: N0 */
    public static final String f757N0 = "local_web_pay";

    /* JADX INFO: renamed from: O */
    public static final String f758O = "https://h5.m.taobao.com/mlapp/olist.html";

    /* JADX INFO: renamed from: O0 */
    public static final String f759O0 = "degrade_web_ua_version";

    /* JADX INFO: renamed from: P */
    public static final int f760P = 10;

    /* JADX INFO: renamed from: P0 */
    public static final String f761P0 = "intercept_batch";

    /* JADX INFO: renamed from: Q */
    public static final boolean f762Q = true;

    /* JADX INFO: renamed from: Q0 */
    public static final String f763Q0 = "debug_upgrade_warn";

    /* JADX INFO: renamed from: R */
    public static final boolean f764R = false;

    /* JADX INFO: renamed from: R0 */
    public static final String f765R0 = "fetch_config_when_register_app";

    /* JADX INFO: renamed from: S */
    public static final boolean f766S = true;

    /* JADX INFO: renamed from: S0 */
    public static final String f767S0 = "gray_log_print_performance";

    /* JADX INFO: renamed from: T */
    public static final boolean f768T = true;

    /* JADX INFO: renamed from: T0 */
    public static final String f769T0 = "enable_china_mobile_bridge_mode";

    /* JADX INFO: renamed from: U */
    public static final boolean f770U = false;

    /* JADX INFO: renamed from: U0 */
    public static final String f771U0 = "bind_with_startActivity";

    /* JADX INFO: renamed from: V */
    public static final boolean f772V = true;

    /* JADX INFO: renamed from: V0 */
    public static final String f773V0 = "enableStartActivityFallback";

    /* JADX INFO: renamed from: W */
    public static final boolean f774W = false;

    /* JADX INFO: renamed from: W0 */
    public static final String f775W0 = "enableBindExFallback";

    /* JADX INFO: renamed from: X */
    public static final boolean f776X = false;

    /* JADX INFO: renamed from: X0 */
    public static final String f777X0 = "degrade_exit_local_web_pay_on_back";

    /* JADX INFO: renamed from: Y */
    public static final boolean f778Y = false;

    /* JADX INFO: renamed from: Y0 */
    public static C0180b f779Y0 = null;

    /* JADX INFO: renamed from: Z */
    public static final boolean f780Z = true;

    /* JADX INFO: renamed from: a0 */
    public static final String f781a0 = "";

    /* JADX INFO: renamed from: b0 */
    public static final boolean f782b0 = false;

    /* JADX INFO: renamed from: c0 */
    public static final boolean f783c0 = false;

    /* JADX INFO: renamed from: d0 */
    public static final int f784d0 = 1000;

    /* JADX INFO: renamed from: e0 */
    public static final boolean f785e0 = true;

    /* JADX INFO: renamed from: f0 */
    public static final String f786f0 = "";

    /* JADX INFO: renamed from: g0 */
    public static final boolean f787g0 = false;

    /* JADX INFO: renamed from: h0 */
    public static final boolean f788h0 = false;

    /* JADX INFO: renamed from: i0 */
    public static final int f789i0 = 1000;

    /* JADX INFO: renamed from: j0 */
    public static final int f790j0 = 20000;

    /* JADX INFO: renamed from: k0 */
    public static final boolean f791k0 = false;

    /* JADX INFO: renamed from: l0 */
    public static final boolean f792l0 = false;

    /* JADX INFO: renamed from: m0 */
    public static final String f793m0 = "alipay_cashier_dynamic_config";

    /* JADX INFO: renamed from: n0 */
    public static final String f794n0 = "timeout";

    /* JADX INFO: renamed from: o0 */
    public static final String f795o0 = "h5_port_degrade";

    /* JADX INFO: renamed from: p0 */
    public static final String f796p0 = "st_sdk_config";

    /* JADX INFO: renamed from: q0 */
    public static final String f797q0 = "tbreturl";

    /* JADX INFO: renamed from: r0 */
    public static final String f798r0 = "launchAppSwitch";

    /* JADX INFO: renamed from: s0 */
    public static final String f799s0 = "configQueryInterval";

    /* JADX INFO: renamed from: t0 */
    public static final String f800t0 = "deg_log_mcgw";

    /* JADX INFO: renamed from: u0 */
    public static final String f801u0 = "deg_start_srv_first";

    /* JADX INFO: renamed from: v0 */
    public static final String f802v0 = "prev_jump_dual";

    /* JADX INFO: renamed from: w0 */
    public static final String f803w0 = "bind_use_imp";

    /* JADX INFO: renamed from: x0 */
    public static final String f804x0 = "bind_use_allow_activity_starts";

    /* JADX INFO: renamed from: y0 */
    public static final String f805y0 = "retry_bnd_once";

    /* JADX INFO: renamed from: z0 */
    public static final String f806z0 = "skip_trans";

    /* JADX INFO: renamed from: E */
    public Boolean f811E;

    /* JADX INFO: renamed from: F */
    public Boolean f812F;

    /* JADX INFO: renamed from: G */
    public Boolean f813G;

    /* JADX INFO: renamed from: H */
    public boolean f814H;

    /* JADX INFO: renamed from: I */
    public JSONObject f815I;

    /* JADX INFO: renamed from: J */
    public boolean f816J;

    /* JADX INFO: renamed from: K */
    public List f817K;

    /* JADX INFO: renamed from: L */
    public int f818L;

    /* JADX INFO: renamed from: a */
    public int f819a = 10000;

    /* JADX INFO: renamed from: b */
    public boolean f820b = false;

    /* JADX INFO: renamed from: c */
    public String f821c = f758O;

    /* JADX INFO: renamed from: d */
    public int f822d = 10;

    /* JADX INFO: renamed from: e */
    public boolean f823e = true;

    /* JADX INFO: renamed from: f */
    public boolean f824f = false;

    /* JADX INFO: renamed from: g */
    public boolean f825g = false;

    /* JADX INFO: renamed from: h */
    public boolean f826h = false;

    /* JADX INFO: renamed from: i */
    public boolean f827i = true;

    /* JADX INFO: renamed from: j */
    public boolean f828j = true;

    /* JADX INFO: renamed from: k */
    public boolean f829k = false;

    /* JADX INFO: renamed from: l */
    public boolean f830l = true;

    /* JADX INFO: renamed from: m */
    public boolean f831m = false;

    /* JADX INFO: renamed from: n */
    public boolean f832n = false;

    /* JADX INFO: renamed from: o */
    public boolean f833o = false;

    /* JADX INFO: renamed from: p */
    public boolean f834p = true;

    /* JADX INFO: renamed from: q */
    public String f835q = "";

    /* JADX INFO: renamed from: r */
    public String f836r = "";

    /* JADX INFO: renamed from: s */
    public boolean f837s = false;

    /* JADX INFO: renamed from: t */
    public boolean f838t = false;

    /* JADX INFO: renamed from: u */
    public boolean f839u = false;

    /* JADX INFO: renamed from: v */
    public int f840v = 1000;

    /* JADX INFO: renamed from: w */
    public boolean f841w = false;

    /* JADX INFO: renamed from: x */
    public Boolean f842x = null;

    /* JADX INFO: renamed from: y */
    public Boolean f843y = null;

    /* JADX INFO: renamed from: z */
    public Boolean f844z = null;

    /* JADX INFO: renamed from: A */
    public Boolean f807A = null;

    /* JADX INFO: renamed from: B */
    public Boolean f808B = null;

    /* JADX INFO: renamed from: C */
    public Boolean f809C = null;

    /* JADX INFO: renamed from: D */
    public C0179a f810D = new C0179a();

    /* JADX INFO: renamed from: com.alipay.sdk.m.o.b$a */
    /* JADX INFO: compiled from: N673 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0233a f845a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f846b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f847c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f848d;

        public a(C0233a c0233a, Context context, boolean z, int i) {
            this.f845a = c0233a;
            this.f846b = context;
            this.f847c = z;
            this.f848d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C0210b c0210bM1037a = new C0218b().m1037a(this.f845a, this.f846b);
                if (c0210bM1037a != null) {
                    C0180b.this.m836a(this.f845a, c0210bM1037a.m1020a());
                    C0180b.this.m858j(C0233a.m1094f());
                    C0167a.m749a(this.f845a, C0168b.f618l, "offcfg|" + this.f847c + "|" + this.f848d);
                }
            } catch (Throwable th) {
                C0244g.m1199a(th);
            }
        }
    }

    public C0180b() {
        Boolean bool = Boolean.FALSE;
        this.f811E = bool;
        this.f812F = bool;
        this.f813G = bool;
        this.f814H = false;
        this.f816J = true;
        this.f817K = null;
        this.f818L = -1;
    }

    /* JADX INFO: renamed from: A */
    public boolean m830A() {
        return this.f820b;
    }

    /* JADX INFO: renamed from: B */
    public boolean m831B() {
        return this.f824f;
    }

    /* JADX INFO: renamed from: C */
    public boolean m832C() {
        return this.f833o;
    }

    /* JADX INFO: renamed from: D */
    public final JSONObject m833D() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(f794n0, m861l());
        jSONObject.put(f795o0, m830A());
        jSONObject.put(f797q0, m868s());
        jSONObject.put(f799s0, m849e());
        jSONObject.put(f798r0, b.m878a(m862m()));
        jSONObject.put(f761P0, m859j());
        jSONObject.put(f800t0, m853g());
        jSONObject.put(f801u0, m855h());
        jSONObject.put(f802v0, m864o());
        jSONObject.put(f803w0, m845c());
        jSONObject.put(f804x0, m843b());
        jSONObject.put(f805y0, m865p());
        jSONObject.put(f806z0, m867r());
        jSONObject.put(f742A0, m832C());
        jSONObject.put(f743B0, m869t());
        jSONObject.put(f745D0, m866q());
        jSONObject.put(f744C0, m860k());
        jSONObject.put(f771U0, m847d());
        jSONObject.put(f747F0, m851f());
        jSONObject.put(f748G0, m875z());
        jSONObject.put(f749H0, m873x());
        jSONObject.put(f773V0, m874y());
        jSONObject.put(f775W0, m872w());
        jSONObject.put(f750I0, m831B());
        jSONObject.put(C0238a.f1143b, m834a());
        C0243f.m1193a(jSONObject, f751J0, this.f842x);
        C0243f.m1193a(jSONObject, f752K0, this.f843y);
        C0243f.m1193a(jSONObject, f753L0, this.f807A);
        C0243f.m1193a(jSONObject, f755M0, this.f808B);
        C0243f.m1193a(jSONObject, f757N0, this.f809C);
        C0243f.m1193a(jSONObject, f759O0, this.f844z);
        C0243f.m1194a(jSONObject, f763Q0, this.f810D.m824a());
        C0243f.m1193a(jSONObject, f765R0, this.f811E);
        C0243f.m1193a(jSONObject, f767S0, this.f812F);
        C0243f.m1193a(jSONObject, f769T0, this.f813G);
        C0243f.m1193a(jSONObject, f777X0, Boolean.valueOf(this.f814H));
        return jSONObject;
    }

    /* JADX INFO: renamed from: b */
    public boolean m843b() {
        return this.f830l;
    }

    /* JADX INFO: renamed from: c */
    public boolean m845c() {
        return this.f829k;
    }

    /* JADX INFO: renamed from: d */
    public String m847d() {
        return this.f836r;
    }

    /* JADX INFO: renamed from: e */
    public int m849e() {
        return this.f822d;
    }

    /* JADX INFO: renamed from: f */
    public final int m851f() {
        return this.f840v;
    }

    /* JADX INFO: renamed from: g */
    public boolean m853g() {
        return this.f826h;
    }

    /* JADX INFO: renamed from: h */
    public boolean m855h() {
        return this.f827i;
    }

    /* JADX INFO: renamed from: i */
    public boolean m857i(C0233a c0233a) {
        m837a(c0233a, f753L0, String.valueOf(this.f807A));
        Boolean bool = this.f807A;
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public boolean m859j() {
        return this.f823e;
    }

    /* JADX INFO: renamed from: k */
    public String m860k() {
        return this.f835q;
    }

    /* JADX INFO: renamed from: l */
    public int m861l() {
        int i = this.f819a;
        if (i < 1000 || i > 20000) {
            C0244g.m1201b(f754M, "time(def) = 10000");
            return 10000;
        }
        C0244g.m1201b(f754M, "time = " + this.f819a);
        return this.f819a;
    }

    /* JADX INFO: renamed from: m */
    public List m862m() {
        return this.f817K;
    }

    /* JADX INFO: renamed from: n */
    public String m863n() {
        return this.f810D.m826b();
    }

    /* JADX INFO: renamed from: o */
    public boolean m864o() {
        return this.f828j;
    }

    /* JADX INFO: renamed from: p */
    public boolean m865p() {
        return this.f831m;
    }

    /* JADX INFO: renamed from: q */
    public boolean m866q() {
        return this.f839u;
    }

    /* JADX INFO: renamed from: r */
    public boolean m867r() {
        return this.f832n;
    }

    /* JADX INFO: renamed from: s */
    public String m868s() {
        return this.f821c;
    }

    /* JADX INFO: renamed from: t */
    public boolean m869t() {
        return this.f834p;
    }

    /* JADX INFO: renamed from: u */
    public void m870u() {
        Context contextM1125b = C0234b.m1121c().m1125b();
        String strM1228a = C0250m.m1228a(C0233a.m1094f(), contextM1125b, f793m0, null);
        try {
            this.f818L = Integer.parseInt(C0250m.m1228a(C0233a.m1094f(), contextM1125b, f746E0, "-1"));
        } catch (Exception unused) {
        }
        m838a(strM1228a);
    }

    /* JADX INFO: renamed from: v */
    public boolean m871v() {
        Boolean bool = this.f844z;
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: w */
    public boolean m872w() {
        return this.f838t;
    }

    /* JADX INFO: renamed from: x */
    public boolean m873x() {
        return this.f841w;
    }

    /* JADX INFO: renamed from: y */
    public boolean m874y() {
        return this.f837s;
    }

    /* JADX INFO: renamed from: z */
    public boolean m875z() {
        return this.f816J;
    }

    /* JADX INFO: renamed from: b */
    public boolean m844b(C0233a c0233a) {
        m837a(c0233a, f751J0, String.valueOf(this.f842x));
        Boolean bool = this.f842x;
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public boolean m846c(C0233a c0233a) {
        m837a(c0233a, f752K0, String.valueOf(this.f843y));
        Boolean bool = this.f843y;
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public boolean m848d(C0233a c0233a) {
        m837a(c0233a, f777X0, String.valueOf(this.f814H));
        return !this.f814H;
    }

    /* JADX INFO: renamed from: e */
    public boolean m850e(C0233a c0233a) {
        m837a(c0233a, f765R0, String.valueOf(this.f811E));
        Boolean bool = this.f811E;
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public boolean m852f(C0233a c0233a) {
        m837a(c0233a, f769T0, String.valueOf(this.f813G));
        Boolean bool = this.f813G;
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public boolean m854g(C0233a c0233a) {
        m837a(c0233a, f767S0, String.valueOf(this.f812F));
        Boolean bool = this.f812F;
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: h */
    public boolean m856h(C0233a c0233a) {
        m837a(c0233a, f757N0, String.valueOf(this.f809C));
        Boolean bool = this.f809C;
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: j */
    public final void m858j(C0233a c0233a) {
        try {
            C0250m.m1231b(c0233a, C0234b.m1121c().m1125b(), f793m0, m833D().toString());
        } catch (Exception e) {
            C0244g.m1199a(e);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.o.b$b */
    /* JADX INFO: compiled from: N673 */
    public final class b {

        /* JADX INFO: renamed from: a */
        public final String f850a;

        /* JADX INFO: renamed from: b */
        public final int f851b;

        /* JADX INFO: renamed from: c */
        public final String f852c;

        public b(String str, int i, String str2) {
            this.f850a = str;
            this.f851b = i;
            this.f852c = str2;
        }

        /* JADX INFO: renamed from: a */
        public static b m876a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new b(jSONObject.optString("pn"), jSONObject.optInt(C0655am.f2277aE, 0), jSONObject.optString("pk"));
        }

        public String toString() {
            return String.valueOf(m879a(this));
        }

        /* JADX INFO: renamed from: a */
        public static List m877a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                b bVarM876a = m876a(jSONArray.optJSONObject(i));
                if (bVarM876a != null) {
                    arrayList.add(bVarM876a);
                }
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: a */
        public static JSONObject m879a(b bVar) {
            if (bVar == null) {
                return null;
            }
            try {
                return new JSONObject().put("pn", bVar.f850a).put(C0655am.f2277aE, bVar.f851b).put("pk", bVar.f852c);
            } catch (JSONException e) {
                C0244g.m1199a(e);
                return null;
            }
        }

        /* JADX INFO: renamed from: a */
        public static JSONArray m878a(List list) {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(m879a((b) it.next()));
            }
            return jSONArray;
        }
    }

    /* JADX INFO: renamed from: i */
    public static C0180b m829i() {
        if (f779Y0 == null) {
            C0180b c0180b = new C0180b();
            f779Y0 = c0180b;
            c0180b.m870u();
        }
        return f779Y0;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m834a() {
        return this.f815I;
    }

    /* JADX INFO: renamed from: a */
    public boolean m842a(C0233a c0233a) {
        m837a(c0233a, f755M0, String.valueOf(this.f808B));
        Boolean bool = this.f808B;
        return bool != null && bool.booleanValue();
    }

    /* JADX INFO: renamed from: a */
    public void m840a(boolean z) {
        this.f825g = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m838a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            m839a(new JSONObject(str));
        } catch (Throwable th) {
            C0244g.m1199a(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m836a(C0233a c0233a, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(f796p0);
            C0238a.m1173a(c0233a, jSONObjectOptJSONObject, C0238a.m1171a(c0233a, jSONObject));
            if (jSONObjectOptJSONObject != null) {
                m839a(jSONObjectOptJSONObject);
            } else {
                C0244g.m1204e(f754M, "empty config");
            }
        } catch (Throwable th) {
            C0244g.m1199a(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m839a(JSONObject jSONObject) {
        C0244g.m1203d(C0170a.f659B, "readFromJson:" + jSONObject);
        this.f819a = jSONObject.optInt(f794n0, 10000);
        this.f820b = jSONObject.optBoolean(f795o0, false);
        this.f821c = jSONObject.optString(f797q0, f758O).trim();
        this.f822d = jSONObject.optInt(f799s0, 10);
        this.f817K = b.m877a(jSONObject.optJSONArray(f798r0));
        this.f823e = jSONObject.optBoolean(f761P0, true);
        this.f826h = jSONObject.optBoolean(f800t0, false);
        this.f827i = jSONObject.optBoolean(f801u0, true);
        this.f828j = jSONObject.optBoolean(f802v0, true);
        this.f829k = jSONObject.optBoolean(f803w0, false);
        this.f830l = jSONObject.optBoolean(f804x0, true);
        this.f831m = jSONObject.optBoolean(f805y0, false);
        this.f832n = jSONObject.optBoolean(f806z0, false);
        this.f833o = jSONObject.optBoolean(f742A0, false);
        this.f834p = jSONObject.optBoolean(f743B0, true);
        this.f835q = jSONObject.optString(f744C0, "");
        this.f839u = jSONObject.optBoolean(f745D0, false);
        this.f841w = jSONObject.optBoolean(f749H0, false);
        this.f836r = jSONObject.optString(f771U0, "");
        this.f840v = jSONObject.optInt(f747F0, 1000);
        this.f816J = jSONObject.optBoolean(f748G0, true);
        this.f837s = jSONObject.optBoolean(f773V0, false);
        this.f838t = jSONObject.optBoolean(f775W0, false);
        this.f824f = jSONObject.optBoolean(f750I0, false);
        this.f815I = jSONObject.optJSONObject(C0238a.f1143b);
        if (jSONObject.has(f751J0)) {
            this.f842x = Boolean.valueOf(jSONObject.optBoolean(f751J0, false));
        } else {
            this.f842x = null;
        }
        if (jSONObject.has(f752K0)) {
            this.f843y = Boolean.valueOf(jSONObject.optBoolean(f752K0, false));
        } else {
            this.f843y = null;
        }
        if (jSONObject.has(f753L0)) {
            this.f807A = Boolean.valueOf(jSONObject.optBoolean(f753L0, false));
        } else {
            this.f807A = null;
        }
        if (jSONObject.has(f755M0)) {
            this.f808B = Boolean.valueOf(jSONObject.optBoolean(f755M0, false));
        } else {
            this.f808B = null;
        }
        if (jSONObject.has(f757N0)) {
            this.f809C = Boolean.valueOf(jSONObject.optBoolean(f757N0, false));
        } else {
            this.f809C = null;
        }
        if (jSONObject.has(f759O0)) {
            this.f844z = Boolean.valueOf(jSONObject.optBoolean(f759O0, false));
        } else {
            this.f844z = null;
        }
        this.f810D.m825a(jSONObject.optString(f763Q0, null));
        if (jSONObject.has(f765R0)) {
            this.f811E = Boolean.valueOf(jSONObject.optBoolean(f765R0, false));
        } else {
            this.f811E = null;
        }
        if (jSONObject.has(f767S0)) {
            this.f812F = Boolean.valueOf(jSONObject.optBoolean(f767S0, false));
        } else {
            this.f812F = null;
        }
        if (jSONObject.has(f769T0)) {
            this.f813G = Boolean.valueOf(jSONObject.optBoolean(f769T0, false));
        } else {
            this.f813G = null;
        }
        this.f814H = jSONObject.optBoolean(f777X0, false);
    }

    /* JADX INFO: renamed from: a */
    public void m835a(C0233a c0233a, Context context, boolean z, int i) {
        C0167a.m749a(c0233a, C0168b.f618l, "oncfg|" + z + "|" + i);
        a aVar = new a(c0233a, context, z, i);
        if (z && !C0254q.m1300h()) {
            int iM851f = m851f();
            if (C0254q.m1266a(iM851f, aVar, "AlipayDCPBlok")) {
                return;
            }
            C0167a.m755b(c0233a, C0168b.f618l, C0168b.f621m0, "" + iM851f);
            return;
        }
        Thread thread = new Thread(aVar);
        thread.setName("AlipayDCP");
        thread.start();
    }

    /* JADX INFO: renamed from: a */
    public boolean m841a(Context context, int i) {
        if (this.f818L == -1) {
            this.f818L = C0254q.m1244a();
            C0250m.m1231b(C0233a.m1094f(), context, f746E0, String.valueOf(this.f818L));
        }
        return this.f818L < i;
    }

    /* JADX INFO: renamed from: a */
    public final void m837a(C0233a c0233a, String str, String str2) {
        if (c0233a == null) {
            return;
        }
        C0167a.m750a(c0233a, C0168b.f618l, "getConfig", C24104.m53357(str, "|", str2));
    }
}
