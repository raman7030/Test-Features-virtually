package com.alipay.sdk.m.y;

import android.content.Context;
import android.text.TextUtils;
import l.C15472;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class l {
    public static final String a = "pref_trade_token";
    public static final String b = ";";
    public static final String c = "result={";
    public static final String d = "}";
    public static final String e = "trade_token=\"";
    public static final String f = "\"";
    public static final String g = "trade_token=";

    public static void a(com.alipay.sdk.m.w.a aVar, Context context, String str) {
        try {
            String strA = a(str);
            g.b(com.alipay.sdk.m.n.a.B, "trade token: " + strA);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            m.b(aVar, context, a, strA);
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.I, th);
            g.a(th);
        }
    }

    public static String a(String str) {
        String strSubstring = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(b);
        for (int i = 0; i < strArrSplit.length; i++) {
            if (strArrSplit[i].startsWith(c) && strArrSplit[i].endsWith(d)) {
                String str2 = strArrSplit[i];
                String[] strArrSplit2 = str2.substring(8, str2.length() - 1).split(com.alipay.sdk.m.w.a.p);
                for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
                    if (strArrSplit2[i2].startsWith(e) && strArrSplit2[i2].endsWith("\"")) {
                        strSubstring = C15472.m36561(1, 13, strArrSplit2[i2]);
                        break;
                    }
                    if (strArrSplit2[i2].startsWith(g)) {
                        strSubstring = strArrSplit2[i2].substring(12);
                        break;
                    }
                }
            }
        }
        return strSubstring;
    }

    public static String a(com.alipay.sdk.m.w.a aVar, Context context) {
        String strA = m.a(aVar, context, a, "");
        g.b(com.alipay.sdk.m.n.a.B, "get trade token: " + strA);
        return strA;
    }
}
