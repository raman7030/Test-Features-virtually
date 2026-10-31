package com.amazonaws;

import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;

/* JADX INFO: loaded from: classes.dex */
public enum Protocol {
    HTTP(a.s),
    HTTPS(b.a);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f112;

    Protocol(String str) {
        this.f112 = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f112;
    }
}
