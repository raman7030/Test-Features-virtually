package com.alipay.sdk.p010m.p058y;

import android.text.TextUtils;
import com.alipay.sdk.p010m.p033l.EnumC0163c;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p055w.C0233a;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p067l.C17588;

/* JADX INFO: renamed from: com.alipay.sdk.m.y.o */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0252o {

    /* JADX INFO: renamed from: a */
    public static final String f1206a = "resultStatus";

    /* JADX INFO: renamed from: b */
    public static final String f1207b = "memo";

    /* JADX INFO: renamed from: c */
    public static final String f1208c = "result";

    /* JADX INFO: renamed from: d */
    public static final String f1209d = "externalSdkData";

    /* JADX INFO: renamed from: a */
    public static Map m1237a(C0233a c0233a, String str) {
        Map mapM1236a = m1236a();
        try {
            return m1238a(str);
        } catch (Throwable th) {
            C0167a.m751a(c0233a, C0168b.f618l, C0168b.f628q, th);
            return mapM1236a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m1239b(String str, String str2) {
        String strSubstring = null;
        try {
            for (String str3 : str.split(C0249l.f1196b)) {
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
            C0244g.m1199a(th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m1240c(String str, String str2) {
        String strM40053 = C17588.m40053(str2, "={");
        return str.substring(strM40053.length() + str.indexOf(strM40053), str.lastIndexOf(C0249l.f1198d));
    }

    /* JADX INFO: renamed from: a */
    public static Map m1236a() {
        EnumC0163c enumC0163cM736a = EnumC0163c.m736a(EnumC0163c.CANCELED.m741c());
        HashMap map = new HashMap();
        map.put(f1206a, Integer.toString(enumC0163cM736a.m741c()));
        map.put(f1207b, enumC0163cM736a.m739b());
        map.put(f1208c, "");
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static Map m1238a(String str) {
        String[] strArrSplit = str.split(C0249l.f1196b);
        HashMap map = new HashMap();
        for (String str2 : strArrSplit) {
            String strSubstring = str2.substring(0, str2.indexOf("={"));
            map.put(strSubstring, m1240c(str2, strSubstring));
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public static String m1235a(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile("(^|;)" + str2 + "=\\{([^}]*?)\\}").matcher(str);
            return matcher.find() ? matcher.group(2) : "?";
        } catch (Throwable th) {
            C0244g.m1199a(th);
            return "?";
        }
    }
}
