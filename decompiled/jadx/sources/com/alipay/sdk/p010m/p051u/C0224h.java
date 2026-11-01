package com.alipay.sdk.p010m.p051u;

import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0244g;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.sdk.m.u.h */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0224h extends AbstractC0213e {
    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: a */
    public JSONObject mo1045a() {
        return AbstractC0213e.m1034a("cashier", "sdkPreheat");
    }

    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: c */
    public boolean mo1047c() {
        return false;
    }

    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: a */
    public String mo1042a(C0233a c0233a, String str, JSONObject jSONObject) {
        String strMo1042a = super.mo1042a(c0233a, str, jSONObject);
        try {
            JSONObject jSONObject2 = new JSONObject(strMo1042a);
            jSONObject2.put("trdfrom", "0");
            jSONObject2.put("sourceBundleId", c0233a.m1101b().getPackageName());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("invokeFromAppName", c0233a.m1101b().getPackageName());
            jSONObject2.put("env", jSONObject3);
            return jSONObject2.toString();
        } catch (Throwable th) {
            C0167a.m751a(c0233a, C0168b.f618l, "buildBody", th);
            C0244g.m1199a(th);
            return strMo1042a;
        }
    }
}
