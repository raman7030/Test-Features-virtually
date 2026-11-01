package com.alipay.sdk.p010m.p051u;

import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p045r.C0199b;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0244g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.sdk.m.u.d */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0220d extends AbstractC0213e {
    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: a */
    public JSONObject mo1045a() {
        return AbstractC0213e.m1034a("cashier", "main");
    }

    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: c */
    public boolean mo1047c() {
        return false;
    }

    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: a */
    public Map mo1044a(boolean z, String str) {
        HashMap map = new HashMap();
        map.put(AbstractC0213e.f985i, "CBC");
        return map;
    }

    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: a */
    public String mo1041a(C0233a c0233a) {
        return mo1043a(c0233a, new HashMap(), new HashMap());
    }

    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: a */
    public String mo1042a(C0233a c0233a, String str, JSONObject jSONObject) {
        String strMo1042a = super.mo1042a(c0233a, str, jSONObject);
        try {
            String strM966f = C0199b.m956e().m966f();
            C0167a.m750a(c0233a, C0168b.f618l, "localConfigVersion", strM966f);
            JSONObject jSONObject2 = new JSONObject(strMo1042a);
            jSONObject2.put("h5_local", "true");
            jSONObject2.put("h5_local_version", strM966f);
            jSONObject2.put("route_pay_from", "h5");
            jSONObject2.put("init_from", "SDKLite");
            jSONObject2.put("cc", "y");
            return jSONObject2.toString();
        } catch (Throwable th) {
            C0167a.m751a(c0233a, C0168b.f618l, "buildBody", th);
            C0244g.m1199a(th);
            return strMo1042a;
        }
    }
}
