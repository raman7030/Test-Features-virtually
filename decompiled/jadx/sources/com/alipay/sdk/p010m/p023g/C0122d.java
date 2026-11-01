package com.alipay.sdk.p010m.p023g;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.alipay.sdk.m.g.d */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0122d implements InterfaceC0127i, InterfaceC0128j {
    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0128j
    /* JADX INFO: renamed from: a */
    public Object mo659a(Object obj) {
        return ((Enum) obj).name();
    }

    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0127i
    /* JADX INFO: renamed from: a */
    public Object mo660a(Object obj, Type type) {
        return Enum.valueOf((Class) type, obj.toString());
    }

    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0127i, com.alipay.sdk.p010m.p023g.InterfaceC0128j
    /* JADX INFO: renamed from: a */
    public boolean mo661a(Class cls) {
        return Enum.class.isAssignableFrom(cls);
    }
}
