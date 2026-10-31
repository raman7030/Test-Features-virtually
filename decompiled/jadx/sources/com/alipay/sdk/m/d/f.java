package com.alipay.sdk.m.d;

import android.content.Context;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class f implements com.alipay.sdk.m.c.b {
    public boolean a = false;

    @Override // com.alipay.sdk.m.c.b
    public String a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.a) {
            com.alipay.sdk.m.m0.a.e(context);
            this.a = true;
        }
        boolean zA = com.alipay.sdk.m.m0.a.a();
        com.alipay.sdk.m.e.a.b("getOAID", "isSupported", Boolean.valueOf(zA));
        if (zA) {
            return com.alipay.sdk.m.m0.a.b(context);
        }
        return null;
    }
}
