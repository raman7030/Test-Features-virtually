package com.alipay.sdk.p010m.p017d;

import android.content.Context;
import com.alipay.sdk.p010m.p015c.InterfaceC0089b;
import com.alipay.sdk.p010m.p019e.C0108a;
import com.alipay.sdk.p010m.p052u0.C0229e;

/* JADX INFO: renamed from: com.alipay.sdk.m.d.h */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0104h implements InterfaceC0089b {
    @Override // com.alipay.sdk.p010m.p015c.InterfaceC0089b
    /* JADX INFO: renamed from: a */
    public String mo479a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zM1073c = C0229e.m1073c(context);
        C0108a.m577b("getOAID", "isSupported", Boolean.valueOf(zM1073c));
        if (zM1073c) {
            return C0229e.m1069a(context);
        }
        return null;
    }
}
