package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.i */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0023i implements InterfaceC0021g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0011ab f105a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0022h f106b;

    public C0023i(C0022h c0022h, C0011ab c0011ab) {
        this.f106b = c0022h;
        this.f105a = c0011ab;
    }

    @Override // com.alipay.android.phone.mrpc.core.InterfaceC0021g
    /* JADX INFO: renamed from: a */
    public String mo185a() {
        return this.f105a.m155a();
    }

    @Override // com.alipay.android.phone.mrpc.core.InterfaceC0021g
    /* JADX INFO: renamed from: b */
    public InterfaceC0013ad mo186b() {
        return C0026l.m202a(m192e());
    }

    @Override // com.alipay.android.phone.mrpc.core.InterfaceC0021g
    /* JADX INFO: renamed from: c */
    public C0011ab mo187c() {
        return this.f105a;
    }

    @Override // com.alipay.android.phone.mrpc.core.InterfaceC0021g
    /* JADX INFO: renamed from: d */
    public boolean mo188d() {
        return this.f105a.m158c();
    }

    /* JADX INFO: renamed from: e */
    public Context m192e() {
        return this.f106b.f104a.getApplicationContext();
    }
}
