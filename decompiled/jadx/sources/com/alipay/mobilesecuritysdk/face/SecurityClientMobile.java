package com.alipay.mobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.apmobilesecuritysdk.p004a.C0041a;
import com.alipay.sdk.p010m.p018d0.C0106a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class SecurityClientMobile {
    public static synchronized String GetApdid(Context context, Map map) {
        HashMap map2 = new HashMap();
        map2.put("utdid", C0106a.m563a(map, "utdid", ""));
        map2.put("tid", C0106a.m563a(map, "tid", ""));
        map2.put("userId", C0106a.m563a(map, "userId", ""));
        APSecuritySdk.getInstance(context).initToken(0, map2, null);
        return C0041a.m275b(context);
    }
}
