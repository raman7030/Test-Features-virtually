package com.alipay.apmobilesecuritysdk.p007d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.apmobilesecuritysdk.p008e.C0057e;
import com.alipay.apmobilesecuritysdk.p008e.C0058f;
import com.alipay.sdk.p010m.p018d0.C0106a;
import com.alipay.sdk.p010m.p022f0.C0114b;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.d.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0050c {
    /* JADX INFO: renamed from: a */
    public static Map m304a(Context context) {
        C0114b c0114bM597a = C0114b.m597a(APSecuritySdk.getInstance(context));
        HashMap map = new HashMap();
        C0058f c0058fM326a = C0057e.m326a(context);
        String strM602a = c0114bM597a.m602a(context);
        String strM622k = c0114bM597a.m622k(context);
        if (c0058fM326a != null) {
            if (C0106a.m564a(strM602a)) {
                strM602a = c0058fM326a.m330b();
            }
            if (C0106a.m564a(strM622k)) {
                strM622k = c0058fM326a.m336e();
            }
        }
        C0057e.m327a(context, new C0058f("", strM602a, "", "", strM622k));
        map.put("AD1", "");
        map.put("AD2", strM602a);
        map.put("AD3", c0114bM597a.m610e(context));
        map.put("AD5", c0114bM597a.m614g(context));
        map.put("AD6", c0114bM597a.m616h(context));
        map.put("AD7", c0114bM597a.m618i(context));
        map.put("AD9", c0114bM597a.m620j(context));
        map.put("AD10", strM622k);
        map.put("AD11", c0114bM597a.m605c());
        map.put("AD12", c0114bM597a.m607d());
        map.put("AD13", c0114bM597a.m609e());
        map.put("AD14", c0114bM597a.m613g());
        map.put("AD15", c0114bM597a.m615h());
        map.put("AD16", c0114bM597a.m617i());
        map.put("AD17", "");
        map.put("AD19", c0114bM597a.m624l(context));
        map.put("AD20", c0114bM597a.m619j());
        map.put("AD22", "");
        map.put("AD24", C0106a.m572g(c0114bM597a.m612f(context)));
        map.put("AD26", c0114bM597a.m608d(context));
        map.put("AD27", c0114bM597a.m628o());
        map.put("AD28", c0114bM597a.m632q());
        map.put("AD29", c0114bM597a.m635s());
        map.put("AD30", c0114bM597a.m630p());
        map.put("AD31", c0114bM597a.m634r());
        map.put("AD32", c0114bM597a.m625m());
        map.put("AD33", c0114bM597a.m627n());
        map.put("AD34", c0114bM597a.m631p(context));
        map.put("AD35", c0114bM597a.m633q(context));
        map.put("AD36", c0114bM597a.m626m(context));
        map.put("AD37", c0114bM597a.m623l());
        map.put("AD38", c0114bM597a.m621k());
        map.put("AD39", c0114bM597a.m604b(context));
        map.put("AD40", c0114bM597a.m606c(context));
        map.put("AD41", c0114bM597a.m601a());
        map.put("AD42", c0114bM597a.m603b());
        return map;
    }
}
