package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.h */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0022h extends AbstractC0038x {

    /* JADX INFO: renamed from: a */
    public Context f104a;

    public C0022h(Context context) {
        this.f104a = context;
    }

    /* JADX INFO: renamed from: a */
    private InterfaceC0021g m190a(C0011ab c0011ab) {
        return new C0023i(this, c0011ab);
    }

    @Override // com.alipay.android.phone.mrpc.core.AbstractC0038x
    /* JADX INFO: renamed from: a */
    public Object mo191a(Class cls, C0011ab c0011ab) {
        return new C0039y(m190a(c0011ab)).m267a(cls);
    }
}
