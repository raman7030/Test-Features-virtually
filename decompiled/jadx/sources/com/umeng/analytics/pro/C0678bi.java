package com.umeng.analytics.pro;

import java.io.Serializable;

/* JADX INFO: renamed from: com.umeng.analytics.pro.bi */
/* JADX INFO: compiled from: S4OJ */
/* JADX INFO: loaded from: classes.dex */
public class C0678bi implements Serializable {

    /* JADX INFO: renamed from: a */
    public final boolean f2473a;

    /* JADX INFO: renamed from: b */
    public final byte f2474b;

    /* JADX INFO: renamed from: c */
    public final String f2475c;

    /* JADX INFO: renamed from: d */
    public final boolean f2476d;

    public C0678bi(byte b, boolean z) {
        this.f2474b = b;
        this.f2473a = false;
        this.f2475c = null;
        this.f2476d = z;
    }

    public C0678bi(byte b) {
        this(b, false);
    }

    public C0678bi(byte b, String str) {
        this.f2474b = b;
        this.f2473a = true;
        this.f2475c = str;
        this.f2476d = false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2352a() {
        return this.f2473a;
    }

    /* JADX INFO: renamed from: b */
    public String m2353b() {
        return this.f2475c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m2354c() {
        return this.f2474b == 12;
    }

    /* JADX INFO: renamed from: d */
    public boolean m2355d() {
        byte b = this.f2474b;
        return b == 15 || b == 13 || b == 14;
    }

    /* JADX INFO: renamed from: e */
    public boolean m2356e() {
        return this.f2476d;
    }
}
