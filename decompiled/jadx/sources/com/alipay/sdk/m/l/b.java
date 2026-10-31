package com.alipay.sdk.m.l;

import com.alipay.sdk.m.y.l;
import l.C9045;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public static volatile boolean a;
    public static volatile String b;

    public static void a(String str) {
        b = str;
    }

    public static String b() {
        c cVarA = c.a(c.DOUBLE_REQUEST.c());
        return a(cVarA.c(), cVarA.b(), "");
    }

    public static boolean c() {
        return a;
    }

    public static String d() {
        return b;
    }

    public static String e() {
        c cVarA = c.a(c.PARAMS_ERROR.c());
        return a(cVarA.c(), cVarA.b(), "");
    }

    public static void a(boolean z) {
        a = z;
    }

    public static String a() {
        c cVarA = c.a(c.CANCELED.c());
        return a(cVarA.c(), cVarA.b(), "");
    }

    public static String a(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder("resultStatus={");
        sb.append(i);
        sb.append("};memo={");
        sb.append(str);
        sb.append("};result={");
        return C9045.m23341(sb, str2, l.d);
    }
}
