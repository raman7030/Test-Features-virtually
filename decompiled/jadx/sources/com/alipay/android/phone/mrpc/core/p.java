package com.alipay.android.phone.mrpc.core;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class p extends v {
    public int c;
    public String d;
    public long e;
    public long f;
    public String g;
    public HttpUrlHeader h;

    public p(HttpUrlHeader httpUrlHeader, int i, String str, byte[] bArr) {
        this.h = httpUrlHeader;
        this.c = i;
        this.d = str;
        this.a = bArr;
    }

    public HttpUrlHeader a() {
        return this.h;
    }

    public void a(long j) {
        this.e = j;
    }

    public void a(String str) {
        this.g = str;
    }

    public void b(long j) {
        this.f = j;
    }
}
