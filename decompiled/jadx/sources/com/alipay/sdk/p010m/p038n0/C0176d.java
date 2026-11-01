package com.alipay.sdk.p010m.p038n0;

/* JADX INFO: renamed from: com.alipay.sdk.m.n0.d */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0176d {

    /* JADX INFO: renamed from: a */
    public String f727a;

    /* JADX INFO: renamed from: b */
    public int f728b;

    /* JADX INFO: renamed from: c */
    public long f729c = System.currentTimeMillis() + 86400000;

    public C0176d(String str, int i) {
        this.f727a = str;
        this.f728b = i;
    }

    public String toString() {
        return "ValueData{value='" + this.f727a + "', code=" + this.f728b + ", expired=" + this.f729c + '}';
    }
}
