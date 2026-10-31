package com.alipay.sdk.m.j;

import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {
    public final String f;

    public c(String str) {
        this.f = str;
    }

    @Override // com.alipay.sdk.m.j.b
    public void a() throws UnsupportedEncodingException {
        this.a = (byte) 1;
        byte[] bytes = this.f.getBytes(com.alipay.sdk.m.w.a.D);
        this.c = bytes;
        this.b = (byte) bytes.length;
    }
}
