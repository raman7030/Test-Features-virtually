package com.alipay.mobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.sdk.m.d0.a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class SecurityClientMobile {
    public static synchronized String GetApdid(Context context, Map map) {
        HashMap map2 = new HashMap();
        map2.put("utdid", a.a(map, "utdid", ""));
        map2.put("tid", a.a(map, "tid", ""));
        map2.put("userId", a.a(map, "userId", ""));
        APSecuritySdk.getInstance(context).initToken(0, map2, null);
        return com.alipay.apmobilesecuritysdk.a.a.b(context);
    }
}
