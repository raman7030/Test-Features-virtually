package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.z */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0040z implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public InterfaceC0021g f161a;

    /* JADX INFO: renamed from: b */
    public Class f162b;

    /* JADX INFO: renamed from: c */
    public C0010aa f163c;

    public C0040z(InterfaceC0021g interfaceC0021g, Class cls, C0010aa c0010aa) {
        this.f161a = interfaceC0021g;
        this.f162b = cls;
        this.f163c = c0010aa;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f163c.m154a(obj, this.f162b, method, objArr);
    }
}
