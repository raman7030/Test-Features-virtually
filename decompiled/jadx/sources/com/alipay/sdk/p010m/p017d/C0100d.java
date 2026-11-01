package com.alipay.sdk.p010m.p017d;

import android.content.Context;
import com.alipay.sdk.p010m.p015c.InterfaceC0089b;
import com.alipay.sdk.p010m.p019e.C0108a;
import com.alipay.sdk.p010m.p038n0.C0174b;

/* JADX INFO: renamed from: com.alipay.sdk.m.d.d */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0100d implements InterfaceC0089b {
    @Override // com.alipay.sdk.p010m.p015c.InterfaceC0089b
    /* JADX INFO: renamed from: a */
    public String mo479a(Context context) {
        if (context == null) {
            return null;
        }
        boolean zM804a = C0174b.m804a();
        C0108a.m577b("getOAID", "isSupported", Boolean.valueOf(zM804a));
        if (zM804a) {
            return C0174b.m805b(context);
        }
        return null;
    }
}
