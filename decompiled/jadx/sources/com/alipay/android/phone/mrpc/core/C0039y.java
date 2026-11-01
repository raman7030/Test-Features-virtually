package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.y */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0039y {

    /* JADX INFO: renamed from: a */
    public InterfaceC0021g f159a;

    /* JADX INFO: renamed from: b */
    public C0010aa f160b = new C0010aa(this);

    public C0039y(InterfaceC0021g interfaceC0021g) {
        this.f159a = interfaceC0021g;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0021g m266a() {
        return this.f159a;
    }

    /* JADX INFO: renamed from: a */
    public Object m267a(Class cls) {
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0040z(this.f159a, cls, this.f160b));
    }
}
