package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Proxy;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class y {
    public g a;
    public aa b = new aa(this);

    public y(g gVar) {
        this.a = gVar;
    }

    public g a() {
        return this.a;
    }

    public Object a(Class cls) {
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new z(this.a, cls, this.b));
    }
}
