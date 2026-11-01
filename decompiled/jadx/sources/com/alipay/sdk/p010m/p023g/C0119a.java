package com.alipay.sdk.p010m.p023g;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.alipay.C2394a;

/* JADX INFO: renamed from: com.alipay.sdk.m.g.a */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0119a implements InterfaceC0127i, InterfaceC0128j {
    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0128j
    /* JADX INFO: renamed from: a */
    public Object mo659a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Object[]) obj) {
            arrayList.add(C0124f.m666b(obj2));
        }
        return arrayList;
    }

    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0127i
    /* JADX INFO: renamed from: a */
    public Object mo660a(Object obj, Type type) {
        if (!obj.getClass().equals(C2394a.class)) {
            return null;
        }
        C2394a c2394a = (C2394a) obj;
        if (type instanceof GenericArrayType) {
            throw new IllegalArgumentException("Does not support generic array!");
        }
        Class<?> componentType = ((Class) type).getComponentType();
        int iM55439a = c2394a.m55439a();
        Object objNewInstance = Array.newInstance(componentType, iM55439a);
        for (int i = 0; i < iM55439a; i++) {
            Array.set(objNewInstance, i, C0123e.m663a(c2394a.m55440a(i), componentType));
        }
        return objNewInstance;
    }

    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0127i, com.alipay.sdk.p010m.p023g.InterfaceC0128j
    /* JADX INFO: renamed from: a */
    public boolean mo661a(Class cls) {
        return cls.isArray();
    }
}
