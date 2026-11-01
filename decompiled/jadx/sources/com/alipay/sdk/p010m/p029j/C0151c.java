package com.alipay.sdk.p010m.p029j;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.alipay.sdk.m.j.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C0151c extends AbstractC0150b {

    /* JADX INFO: renamed from: f */
    public final String f506f;

    public C0151c(String str) {
        this.f506f = str;
    }

    @Override // com.alipay.sdk.p010m.p029j.AbstractC0150b
    /* JADX INFO: renamed from: a */
    public void mo718a() throws UnsupportedEncodingException {
        this.f503a = (byte) 1;
        byte[] bytes = this.f506f.getBytes(C0233a.f1077D);
        this.f505c = bytes;
        this.f504b = (byte) bytes.length;
    }
}
