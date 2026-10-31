package com.alipay.sdk.m.y;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.C16014;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class o {
    public static final String a = "resultStatus";
    public static final String b = "memo";
    public static final String c = "result";
    public static final String d = "externalSdkData";

    public static Map a(com.alipay.sdk.m.w.a aVar, String str) {
        Map mapA = a();
        try {
            return a(str);
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(aVar, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.q, th);
            return mapA;
        }
    }

    public static String b(String str, String str2) {
        String strSubstring = null;
        try {
            for (String str3 : str.split(l.b)) {
                String[] strArrSplit = str3.split("=", 2);
                if (strArrSplit.length == 2) {
                    String strTrim = strArrSplit[0].trim();
                    String strTrim2 = strArrSplit[1].trim();
                    if (TextUtils.equals(strTrim, str2)) {
                        strSubstring = strTrim2.substring(1, strTrim2.length() - 1);
                    } else {
                        continue;
                    }
                }
            }
            return strSubstring;
        } catch (Throwable th) {
            g.a(th);
            return null;
        }
    }

    public static String c(String str, String str2) {
        String strM37867 = C16014.m37867(str2, "={");
        return str.substring(strM37867.length() + str.indexOf(strM37867), str.lastIndexOf(l.d));
    }

    public static Map a() {
        com.alipay.sdk.m.l.c cVarA = com.alipay.sdk.m.l.c.a(com.alipay.sdk.m.l.c.CANCELED.c());
        HashMap map = new HashMap();
        map.put(a, Integer.toString(cVarA.c()));
        map.put(b, cVarA.b());
        map.put(c, "");
        return map;
    }

    public static Map a(String str) {
        String[] strArrSplit = str.split(l.b);
        HashMap map = new HashMap();
        for (String str2 : strArrSplit) {
            String strSubstring = str2.substring(0, str2.indexOf("={"));
            map.put(strSubstring, c(str2, strSubstring));
        }
        return map;
    }

    public static String a(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile("(^|;)" + str2 + "=\\{([^}]*?)\\}").matcher(str);
            return matcher.find() ? matcher.group(2) : "?";
        } catch (Throwable th) {
            g.a(th);
            return "?";
        }
    }
}
