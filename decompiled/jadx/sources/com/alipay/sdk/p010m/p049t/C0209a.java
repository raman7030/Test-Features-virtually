package com.alipay.sdk.p010m.p049t;

import android.text.TextUtils;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0249l;
import p067l.C17073;

/* JADX INFO: renamed from: com.alipay.sdk.m.t.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0209a {
    /* JADX INFO: renamed from: a */
    public static String m1014a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] strArrSplit = str.split(C0233a.f1084p);
        if (strArrSplit.length == 0) {
            return "";
        }
        String strM1018e = null;
        String strM1017d = null;
        String strM1019f = null;
        String strM1016c = null;
        for (String str2 : strArrSplit) {
            if (TextUtils.isEmpty(strM1018e)) {
                strM1018e = m1018e(str2);
            }
            if (TextUtils.isEmpty(strM1017d)) {
                strM1017d = m1017d(str2);
            }
            if (TextUtils.isEmpty(strM1019f)) {
                strM1019f = m1019f(str2);
            }
            if (TextUtils.isEmpty(strM1016c)) {
                strM1016c = m1016c(str2);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(strM1018e)) {
            sb.append("biz_type=" + strM1018e + C0249l.f1196b);
        }
        if (!TextUtils.isEmpty(strM1017d)) {
            sb.append("biz_no=" + strM1017d + C0249l.f1196b);
        }
        if (!TextUtils.isEmpty(strM1019f)) {
            sb.append("trade_no=" + strM1019f + C0249l.f1196b);
        }
        if (!TextUtils.isEmpty(strM1016c)) {
            sb.append("app_userid=" + strM1016c + C0249l.f1196b);
        }
        String string = sb.toString();
        return string.endsWith(C0249l.f1196b) ? C17073.m38720(1, 0, string) : string;
    }

    /* JADX INFO: renamed from: b */
    public static String m1015b(String str) {
        String[] strArrSplit = str.split("=");
        if (strArrSplit.length <= 1) {
            return null;
        }
        String str2 = strArrSplit[1];
        return str2.contains("\"") ? str2.replaceAll("\"", "") : str2;
    }

    /* JADX INFO: renamed from: c */
    public static String m1016c(String str) {
        if (str.contains("app_userid")) {
            return m1015b(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static String m1017d(String str) {
        if (str.contains("biz_no")) {
            return m1015b(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static String m1018e(String str) {
        if (str.contains("biz_type")) {
            return m1015b(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static String m1019f(String str) {
        if (!str.contains(C0168b.f579B0) || str.startsWith(C0168b.f577A0)) {
            return null;
        }
        return m1015b(str);
    }
}
