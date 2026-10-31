package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class z implements InvocationHandler {
    public g a;
    public Class b;
    public aa c;

    public z(g gVar, Class cls, aa aaVar) {
        this.a = gVar;
        this.b = cls;
        this.c = aaVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return this.c.a(obj, this.b, method, objArr);
    }
}
