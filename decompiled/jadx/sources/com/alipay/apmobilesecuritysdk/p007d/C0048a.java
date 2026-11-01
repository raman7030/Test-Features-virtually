package com.alipay.apmobilesecuritysdk.p007d;

import android.content.Context;
import com.alipay.sdk.p010m.p018d0.C0106a;
import com.alipay.sdk.p010m.p022f0.C0113a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.d.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0048a {
    /* JADX INFO: renamed from: a */
    public static synchronized Map m302a(Context context, Map map) {
        HashMap map2;
        String strM563a = C0106a.m563a(map, "appchannel", "");
        map2 = new HashMap();
        map2.put("AA1", context.getPackageName());
        map2.put("AA2", C0113a.m595a().m596a(context));
        map2.put("AA3", "APPSecuritySDK-ALIPAYSDK");
        map2.put("AA4", "3.4.0.202507280853");
        map2.put("AA6", strM563a);
        return map2;
    }
}
