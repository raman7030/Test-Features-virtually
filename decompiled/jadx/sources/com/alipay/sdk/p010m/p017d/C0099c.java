package com.alipay.sdk.p010m.p017d;

import android.content.Context;
import com.alipay.sdk.p010m.p015c.InterfaceC0089b;
import com.alipay.sdk.p010m.p019e.C0108a;
import com.alipay.sdk.p010m.p056w0.C0236b;

/* JADX INFO: renamed from: com.alipay.sdk.m.d.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0099c implements InterfaceC0089b {

    /* JADX INFO: renamed from: d */
    public static final int f446d = 1;

    /* JADX INFO: renamed from: a */
    public C0236b f447a;

    /* JADX INFO: renamed from: b */
    public boolean f448b = false;

    /* JADX INFO: renamed from: c */
    public boolean f449c = false;

    @Override // com.alipay.sdk.p010m.p015c.InterfaceC0089b
    /* JADX INFO: renamed from: a */
    public String mo479a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f448b) {
            C0236b c0236b = new C0236b();
            this.f447a = c0236b;
            this.f449c = c0236b.m1130a(context, (C0236b.b) null) == 1;
            this.f448b = true;
        }
        C0108a.m577b("getOAID", "isSupported", Boolean.valueOf(this.f449c));
        if (this.f449c && this.f447a.m1138e()) {
            return this.f447a.m1134b();
        }
        return null;
    }
}
