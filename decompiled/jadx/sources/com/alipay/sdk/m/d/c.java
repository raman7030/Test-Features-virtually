package com.alipay.sdk.m.d;

import android.content.Context;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class c implements com.alipay.sdk.m.c.b {
    public static final int d = 1;
    public com.alipay.sdk.m.w0.b a;
    public boolean b = false;
    public boolean c = false;

    @Override // com.alipay.sdk.m.c.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.b) {
            com.alipay.sdk.m.w0.b bVar = new com.alipay.sdk.m.w0.b();
            this.a = bVar;
            this.c = bVar.a(context, (com.alipay.sdk.m.w0.b.InterfaceC0029b) null) == 1;
            this.b = true;
        }
        com.alipay.sdk.m.e.a.b("getOAID", "isSupported", Boolean.valueOf(this.c));
        if (this.c && this.a.e()) {
            return this.a.b();
        }
        return null;
    }
}
