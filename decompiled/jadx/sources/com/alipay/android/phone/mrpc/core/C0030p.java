package com.alipay.android.phone.mrpc.core;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.p */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0030p extends C0036v {

    /* JADX INFO: renamed from: c */
    public int f131c;

    /* JADX INFO: renamed from: d */
    public String f132d;

    /* JADX INFO: renamed from: e */
    public long f133e;

    /* JADX INFO: renamed from: f */
    public long f134f;

    /* JADX INFO: renamed from: g */
    public String f135g;

    /* JADX INFO: renamed from: h */
    public HttpUrlHeader f136h;

    public C0030p(HttpUrlHeader httpUrlHeader, int i, String str, byte[] bArr) {
        this.f136h = httpUrlHeader;
        this.f131c = i;
        this.f132d = str;
        this.f157a = bArr;
    }

    /* JADX INFO: renamed from: a */
    public HttpUrlHeader m225a() {
        return this.f136h;
    }

    /* JADX INFO: renamed from: a */
    public void m226a(long j) {
        this.f133e = j;
    }

    /* JADX INFO: renamed from: a */
    public void m227a(String str) {
        this.f135g = str;
    }

    /* JADX INFO: renamed from: b */
    public void m228b(long j) {
        this.f134f = j;
    }
}
