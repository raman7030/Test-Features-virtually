package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class h extends x {
    public Context a;

    public h(Context context) {
        this.a = context;
    }

    private g a(ab abVar) {
        return new i(this, abVar);
    }

    @Override // com.alipay.android.phone.mrpc.core.x
    public Object a(Class cls, ab abVar) {
        return new y(a(abVar)).a(cls);
    }
}
