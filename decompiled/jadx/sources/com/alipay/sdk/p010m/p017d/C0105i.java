package com.alipay.sdk.p010m.p017d;

import android.content.Context;
import com.alipay.sdk.p010m.p015c.InterfaceC0089b;
import com.alipay.sdk.p010m.p019e.C0108a;
import com.alipay.sdk.p010m.p040o0.C0183b;

/* JADX INFO: renamed from: com.alipay.sdk.m.d.i */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0105i implements InterfaceC0089b {
    @Override // com.alipay.sdk.p010m.p015c.InterfaceC0089b
    /* JADX INFO: renamed from: a */
    public String mo479a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zM895a = C0183b.m895a();
        C0108a.m577b("getOAID", "isSupported", Boolean.valueOf(zM895a));
        if (zM895a) {
            return C0183b.m896b(context);
        }
        return null;
    }
}
