package com.alipay.sdk.m.k0;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class c extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f77908l = 1;
    public static final int m = 2;
    public static final int n = 3;
    public static final String o = "APPKEY_ERROR";
    public static final String p = "SUCCESS";
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k = "";

    public String a() {
        String str = this.f;
        return str == null ? "0" : str;
    }

    public boolean b() {
        return "1".equals(this.e);
    }

    public int c() {
        if (this.a) {
            return com.alipay.sdk.m.d0.a.a(this.c) ? 2 : 1;
        }
        return o.equals(this.b) ? 3 : 2;
    }
}
