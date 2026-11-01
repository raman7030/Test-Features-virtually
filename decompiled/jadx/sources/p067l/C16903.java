package p067l;

import bin.p000mt.json.JSONObject;
import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0708d;

/* JADX INFO: renamed from: l.ܶܳܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 47OP */
/* JADX INFO: loaded from: classes4.dex */
public final class C16903 {

    /* JADX INFO: renamed from: ֫ */
    public final C12962 f50052;

    /* JADX INFO: renamed from: ۧ */
    public final C12962 f50053;

    /* JADX INFO: renamed from: ܽ */
    public final String f50054;

    public C16903() {
        this("", new C6946(""), null);
    }

    public C16903(String str, C12962 c12962, C12962 c12963) {
        this.f50054 = str;
        c12962 = c12962.m29724() == 31 ? new C6946(C0708d.f2599O) : c12962;
        this.f50053 = c12962;
        this.f50052 = c12963;
        c12962.f36466 = this;
        if (c12963 != null) {
            c12963.f36466 = this;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final C12962 m38465() {
        return this.f50053;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C12962 m38464() {
        return this.f50052;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38463() {
        C12962 c12962;
        return this.f50053.m29721(false) && ((c12962 = this.f50052) == null || c12962.m29721(true));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m38467() {
        return this.f50054;
    }

    /* JADX INFO: renamed from: ܿ */
    public final JSONObject m38466() {
        JSONObject jSONObject = new JSONObject();
        C12962 c12962 = this.f50053;
        jSONObject.put(C0655am.f2320av, c12962.m29724());
        jSONObject.put("b", this.f50054);
        int iM29724 = c12962.m29724();
        if (iM29724 == 0) {
            jSONObject.put(C0655am.f2278aF, c12962.mo15919());
        } else if (iM29724 == 27) {
            jSONObject.put("f", c12962.mo29726());
        } else if (iM29724 == 34) {
            jSONObject.put(C0655am.f2279aG, c12962.mo29726());
        }
        C12962 c12963 = this.f50052;
        if (c12963 != null) {
            jSONObject.put("d", c12963.m29724());
            int iM29725 = c12963.m29724();
            if (iM29725 == 0) {
                jSONObject.put("e", c12963.mo15919());
            } else {
                if (iM29725 == 27) {
                    jSONObject.put("g", c12963.mo29726());
                    return jSONObject;
                }
                if (iM29725 == 34) {
                    jSONObject.put(C0655am.f2275aC, c12963.mo29726());
                    return jSONObject;
                }
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C16903 m38462(JSONObject jSONObject) {
        C12962 c6946;
        int i = jSONObject.getInt(C0655am.f2320av);
        String string = jSONObject.getString("b");
        C12962 c6947 = null;
        if (i == 0) {
            c6946 = new C6946(jSONObject.getString(C0655am.f2278aF));
        } else if (i == 27) {
            c6946 = new C23710(jSONObject.getJSONObject("f"));
        } else if (i == 34) {
            c6946 = new C13652(jSONObject.getJSONObject(C0655am.f2279aG), null);
        } else {
            c6946 = new C12962(i);
        }
        if (jSONObject.contains("d")) {
            int i2 = jSONObject.getInt("d");
            if (i2 == 0) {
                c6947 = new C6946(jSONObject.getString("e"));
            } else if (i2 == 27) {
                c6947 = new C23710(jSONObject.getJSONObject("g"));
            } else if (i2 == 34) {
                c6947 = new C13652(jSONObject.getJSONObject(C0655am.f2275aC), null);
            } else {
                c6947 = new C12962(i2);
            }
        }
        return new C16903(string, c6946, c6947);
    }
}
