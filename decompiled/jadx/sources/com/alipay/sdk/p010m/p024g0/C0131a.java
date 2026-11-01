package com.alipay.sdk.p010m.p024g0;

import android.content.Context;
import com.alipay.sdk.p010m.p018d0.C0106a;
import com.alipay.sdk.p010m.p020e0.C0111c;
import java.util.HashMap;

/* JADX INFO: renamed from: com.alipay.sdk.m.g0.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0131a {
    /* JADX INFO: renamed from: a */
    public static String m669a(Context context, String str, String str2) {
        synchronized (C0131a.class) {
            String strM589b = null;
            if (context != null) {
                if (!C0106a.m564a(str) && !C0106a.m564a(str2)) {
                    try {
                        String strM679b = C0135e.m679b(context, str, str2, "");
                        if (!C0106a.m564a(strM679b)) {
                            strM589b = C0111c.m589b(C0111c.m583a(), strM679b);
                        }
                    } catch (Throwable unused) {
                    }
                    return strM589b;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m670a(Context context, String str, String str2, String str3) {
        synchronized (C0131a.class) {
            if (C0106a.m564a(str) || C0106a.m564a(str2) || context == null) {
                return;
            }
            try {
                String strM584a = C0111c.m584a(C0111c.m583a(), str3);
                HashMap map = new HashMap();
                map.put(str2, strM584a);
                C0135e.m678a(context, str, map);
            } catch (Throwable unused) {
            }
        }
    }
}
