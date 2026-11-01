package com.alipay.apmobilesecuritysdk.p007d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p006c.C0045b;
import com.alipay.apmobilesecuritysdk.p008e.C0060h;
import com.alipay.sdk.p010m.p018d0.C0106a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.d.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0049b {
    /* JADX INFO: renamed from: a */
    public static synchronized Map m303a(Context context, Map map) {
        HashMap map2;
        map2 = new HashMap();
        String strM563a = C0106a.m563a(map, "tid", "");
        String strM563a2 = C0106a.m563a(map, "utdid", "");
        String strM563a3 = C0106a.m563a(map, "userId", "");
        String strM563a4 = C0106a.m563a(map, "appName", "");
        String strM563a5 = C0106a.m563a(map, "appKeyClient", "");
        String strM563a6 = C0106a.m563a(map, "tmxSessionId", "");
        String strM355f = C0060h.m355f(context);
        String strM563a7 = C0106a.m563a(map, "sessionId", "");
        map2.put("AC1", strM563a);
        map2.put("AC2", strM563a2);
        map2.put("AC3", "");
        map2.put("AC4", strM355f);
        map2.put("AC5", strM563a3);
        map2.put("AC6", strM563a6);
        map2.put("AC7", C0045b.m296a(context));
        map2.put("AC8", strM563a4);
        map2.put("AC9", strM563a5);
        if (C0106a.m567b(strM563a7)) {
            map2.put("AC10", strM563a7);
        }
        return map2;
    }
}
