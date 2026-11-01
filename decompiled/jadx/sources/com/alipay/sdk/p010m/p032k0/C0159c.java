package com.alipay.sdk.p010m.p032k0;

import com.alipay.sdk.p010m.p018d0.C0106a;

/* JADX INFO: renamed from: com.alipay.sdk.m.k0.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0159c extends C0157a {

    /* JADX INFO: renamed from: l */
    public static final int f520l = 1;

    /* JADX INFO: renamed from: m */
    public static final int f521m = 2;

    /* JADX INFO: renamed from: n */
    public static final int f522n = 3;

    /* JADX INFO: renamed from: o */
    public static final String f523o = "APPKEY_ERROR";

    /* JADX INFO: renamed from: p */
    public static final String f524p = "SUCCESS";

    /* JADX INFO: renamed from: c */
    public String f525c;

    /* JADX INFO: renamed from: d */
    public String f526d;

    /* JADX INFO: renamed from: e */
    public String f527e;

    /* JADX INFO: renamed from: f */
    public String f528f;

    /* JADX INFO: renamed from: g */
    public String f529g;

    /* JADX INFO: renamed from: h */
    public String f530h;

    /* JADX INFO: renamed from: i */
    public String f531i;

    /* JADX INFO: renamed from: j */
    public String f532j;

    /* JADX INFO: renamed from: k */
    public String f533k = "";

    /* JADX INFO: renamed from: a */
    public String m722a() {
        String str = this.f528f;
        return str == null ? "0" : str;
    }

    /* JADX INFO: renamed from: b */
    public boolean m723b() {
        return "1".equals(this.f527e);
    }

    /* JADX INFO: renamed from: c */
    public int m724c() {
        if (this.f518a) {
            return C0106a.m564a(this.f525c) ? 2 : 1;
        }
        return f523o.equals(this.f519b) ? 3 : 2;
    }
}
