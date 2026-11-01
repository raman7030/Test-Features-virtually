package com.alipay.sdk.p010m.p023g;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;
import org.json.alipay.C2394a;

/* JADX INFO: renamed from: com.alipay.sdk.m.g.k */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0129k implements InterfaceC0127i {
    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0127i
    /* JADX INFO: renamed from: a */
    public Object mo660a(Object obj, Type type) {
        if (!obj.getClass().equals(C2394a.class)) {
            return null;
        }
        C2394a c2394a = (C2394a) obj;
        HashSet hashSet = new HashSet();
        Type type2 = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
        for (int i = 0; i < c2394a.m55439a(); i++) {
            hashSet.add(C0123e.m663a(c2394a.m55440a(i), type2));
        }
        return hashSet;
    }

    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0127i, com.alipay.sdk.p010m.p023g.InterfaceC0128j
    /* JADX INFO: renamed from: a */
    public boolean mo661a(Class cls) {
        return Set.class.isAssignableFrom(cls);
    }
}
