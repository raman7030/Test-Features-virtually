package com.alipay.sdk.p010m.p017d;

import android.content.Context;
import com.alipay.sdk.p010m.p015c.InterfaceC0089b;
import com.alipay.sdk.p010m.p019e.C0108a;
import com.alipay.sdk.p010m.p036m0.C0169a;

/* JADX INFO: renamed from: com.alipay.sdk.m.d.f */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0102f implements InterfaceC0089b {

    /* JADX INFO: renamed from: a */
    public boolean f451a = false;

    @Override // com.alipay.sdk.p010m.p015c.InterfaceC0089b
    /* JADX INFO: renamed from: a */
    public String mo479a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f451a) {
            C0169a.m796e(context);
            this.f451a = true;
        }
        boolean zM792a = C0169a.m792a();
        C0108a.m577b("getOAID", "isSupported", Boolean.valueOf(zM792a));
        if (zM792a) {
            return C0169a.m793b(context);
        }
        return null;
    }
}
