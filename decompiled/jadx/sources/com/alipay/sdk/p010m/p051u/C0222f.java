package com.alipay.sdk.p010m.p051u;

import android.content.Context;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p041p.C0185b;
import com.alipay.sdk.p010m.p047s.C0202b;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p049t.C0210b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p055w.C0234b;
import com.alipay.sdk.p010m.p058y.C0244g;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.sdk.m.u.f */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0222f extends AbstractC0213e {
    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: a */
    public String mo1042a(C0233a c0233a, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // com.alipay.sdk.p010m.p049t.AbstractC0213e
    /* JADX INFO: renamed from: a */
    public Map mo1044a(boolean z, String str) {
        return new HashMap();
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
    public C0210b mo1038a(C0233a c0233a, Context context, String str) throws Throwable {
        C0244g.m1203d(C0170a.f659B, "mdap post");
        byte[] bArrM905a = C0185b.m905a(str.getBytes(Charset.forName(C0233a.f1077D)));
        HashMap map = new HashMap();
        map.put("utdId", C0234b.m1121c().m1126d());
        map.put("logHeader", "RAW");
        map.put("bizCode", C0244g.f1150b);
        map.put("productId", "alipaysdk_android");
        map.put("Content-Encoding", "Gzip");
        map.put("productVersion", "15.8.40");
        C0202b.b bVarM977a = C0202b.m977a(context, new C0202b.a(C0170a.f667f, map, bArrM905a));
        C0244g.m1203d(C0170a.f659B, "mdap got " + bVarM977a);
        if (bVarM977a == null) {
            throw new RuntimeException("Response is null");
        }
        boolean zM1035a = AbstractC0213e.m1035a(bVarM977a);
        try {
            byte[] bArrM906b = bVarM977a.f953c;
            if (zM1035a) {
                bArrM906b = C0185b.m906b(bArrM906b);
            }
            return new C0210b("", new String(bArrM906b, Charset.forName(C0233a.f1077D)));
        } catch (Exception e) {
            C0244g.m1199a(e);
            return null;
        }
    }
}
