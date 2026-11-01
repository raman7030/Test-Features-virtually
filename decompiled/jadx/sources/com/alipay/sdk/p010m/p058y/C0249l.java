package com.alipay.sdk.p010m.p058y;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p055w.C0233a;
import p067l.C17073;

/* JADX INFO: renamed from: com.alipay.sdk.m.y.l */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0249l {

    /* JADX INFO: renamed from: a */
    public static final String f1195a = "pref_trade_token";

    /* JADX INFO: renamed from: b */
    public static final String f1196b = ";";

    /* JADX INFO: renamed from: c */
    public static final String f1197c = "result={";

    /* JADX INFO: renamed from: d */
    public static final String f1198d = "}";

    /* JADX INFO: renamed from: e */
    public static final String f1199e = "trade_token=\"";

    /* JADX INFO: renamed from: f */
    public static final String f1200f = "\"";

    /* JADX INFO: renamed from: g */
    public static final String f1201g = "trade_token=";

    /* JADX INFO: renamed from: a */
    public static void m1226a(C0233a c0233a, Context context, String str) {
        try {
            String strM1225a = m1225a(str);
            C0244g.m1201b(C0170a.f659B, "trade token: " + strM1225a);
            if (TextUtils.isEmpty(strM1225a)) {
                return;
            }
            C0250m.m1231b(c0233a, context, f1195a, strM1225a);
        } catch (Throwable th) {
            C0167a.m751a(c0233a, C0168b.f618l, C0168b.f588I, th);
            C0244g.m1199a(th);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1225a(String str) {
        String strSubstring = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(f1196b);
        for (int i = 0; i < strArrSplit.length; i++) {
            if (strArrSplit[i].startsWith(f1197c) && strArrSplit[i].endsWith(f1198d)) {
                String str2 = strArrSplit[i];
                String[] strArrSplit2 = str2.substring(8, str2.length() - 1).split(C0233a.f1084p);
                for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
                    if (strArrSplit2[i2].startsWith(f1199e) && strArrSplit2[i2].endsWith("\"")) {
                        strSubstring = C17073.m38720(1, 13, strArrSplit2[i2]);
                        break;
                    }
                    if (strArrSplit2[i2].startsWith(f1201g)) {
                        strSubstring = strArrSplit2[i2].substring(12);
                        break;
                    }
                }
            }
        }
        return strSubstring;
    }

    /* JADX INFO: renamed from: a */
    public static String m1224a(C0233a c0233a, Context context) {
        String strM1228a = C0250m.m1228a(c0233a, context, f1195a, "");
        C0244g.m1201b(C0170a.f659B, "get trade token: " + strM1228a);
        return strM1228a;
    }
}
