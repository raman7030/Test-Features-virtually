package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class i implements g {
    public final /* synthetic */ ab a;
    public final /* synthetic */ h b;

    public i(h hVar, ab abVar) {
        this.b = hVar;
        this.a = abVar;
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public String a() {
        return this.a.a();
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public ad b() {
        return l.a(e());
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public ab c() {
        return this.a;
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public boolean d() {
        return this.a.c();
    }

    public Context e() {
        return this.b.a.getApplicationContext();
    }
}
