package com.alipay.apmobilesecuritysdk.p007d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.apmobilesecuritysdk.p006c.C0046c;
import com.alipay.sdk.p010m.p022f0.C0114b;
import com.alipay.sdk.p010m.p022f0.C0117e;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.d.d */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0051d {
    /* JADX INFO: renamed from: a */
    public static synchronized Map m305a(Context context) {
        HashMap map;
        C0117e c0117eM642a = C0117e.m642a();
        C0114b c0114bM597a = C0114b.m597a(APSecuritySdk.getInstance(context));
        map = new HashMap();
        map.put("AE1", c0117eM642a.m645b());
        map.put("AE2", c0117eM642a.m646c() ? "1" : "0");
        map.put("AE3", c0117eM642a.m644a(context) ? "1" : "0");
        map.put("AE4", c0117eM642a.m647d());
        map.put("AE5", c0117eM642a.m648e());
        map.put("AE6", c0117eM642a.m649f());
        map.put("AE7", c0117eM642a.m650g());
        map.put("AE8", c0117eM642a.m651h());
        map.put("AE9", c0117eM642a.m652i());
        map.put("AE10", c0117eM642a.m653j());
        map.put("AE11", c0117eM642a.m654k());
        map.put("AE12", c0117eM642a.m655l());
        map.put("AE13", c0117eM642a.m656m());
        map.put("AE14", c0117eM642a.m657n());
        map.put("AE15", c0117eM642a.m658o());
        map.put("AE21", c0114bM597a.m611f());
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized Map m306b(Context context) {
        HashMap map;
        map = new HashMap();
        try {
            map.put("AE16", C0046c.m297a(context).m298a());
        } catch (Throwable unused) {
        }
        return map;
    }
}
