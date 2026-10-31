package com.alipay.sdk.m.n0;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class d {
    public String a;
    public int b;
    public long c = System.currentTimeMillis() + 86400000;

    public d(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public String toString() {
        return "ValueData{value='" + this.a + "', code=" + this.b + ", expired=" + this.c + '}';
    }
}
