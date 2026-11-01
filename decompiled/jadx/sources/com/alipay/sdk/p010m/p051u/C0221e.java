package com.alipay.sdk.p010m.p051u;

import android.content.Context;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p049t.C0210b;
import com.alipay.sdk.p010m.p055w.C0233a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.sdk.m.u.e */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0221e extends AbstractC0213e {

    /* JADX INFO: renamed from: t */
    public static final String f1002t = "log_v";

    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: a */
    public String mo1042a(C0233a c0233a, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: a */
    public Map mo1044a(boolean z, String str) {
        HashMap map = new HashMap();
        map.put(AbstractC0213e.f979c, String.valueOf(z));
        map.put(AbstractC0213e.f982f, "application/octet-stream");
        map.put(AbstractC0213e.f985i, "CBC");
        return map;
    }

    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: a */
    public JSONObject mo1045a() {
        return null;
    }

    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: c */
    public boolean mo1047c() {
        return false;
    }

    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: a */
    public String mo1041a(C0233a c0233a) {
        HashMap map = new HashMap();
        map.put(AbstractC0213e.f987k, "/sdk/log");
        map.put(AbstractC0213e.f988l, "1.0.0");
        HashMap map2 = new HashMap();
        map2.put(f1002t, "1.0");
        return mo1043a(c0233a, map, map2);
    }

    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: a */
    public C0210b mo1038a(C0233a c0233a, Context context, String str) {
        return m1040a(c0233a, context, str, C0170a.f666e, true);
    }
}
