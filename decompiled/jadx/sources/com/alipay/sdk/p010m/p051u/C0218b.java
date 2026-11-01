package com.alipay.sdk.p010m.p051u;

import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0238a;
import com.alipay.sdk.p010m.p058y.C0244g;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.sdk.m.u.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0218b extends AbstractC0213e {
    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: a */
    public JSONObject mo1045a() {
        return AbstractC0213e.m1034a("sdkConfig", "obtain");
    }

    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: b */
    public String mo1046b() {
        return "5.0.0";
    }

    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: c */
    public boolean mo1047c() {
        return true;
    }

    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: a */
    public String mo1043a(C0233a c0233a, HashMap map, HashMap map2) {
        if (map2 == null) {
            map2 = new HashMap();
        }
        map2.putAll(C0238a.m1170a(c0233a));
        C0244g.m1203d(C0170a.f659B, "cf " + map2);
        return super.mo1043a(c0233a, map, map2);
    }
}
