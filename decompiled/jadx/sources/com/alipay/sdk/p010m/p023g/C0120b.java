package com.alipay.sdk.p010m.p023g;

import com.alipay.sdk.p010m.p025h.C0137a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import org.json.alipay.C2394a;

/* JADX INFO: renamed from: com.alipay.sdk.m.g.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0120b implements InterfaceC0127i, InterfaceC0128j {
    /* JADX INFO: renamed from: a */
    public static Collection m662a(Class cls, Type type) {
        if (cls == AbstractCollection.class) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new LinkedHashSet();
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new TreeSet();
        }
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(EnumSet.class)) {
            return EnumSet.noneOf((Class) (type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class));
        }
        try {
            return (Collection) cls.newInstance();
        } catch (Exception unused) {
            throw new IllegalArgumentException("create instane error, class ".concat(cls.getName()));
        }
    }

    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0128j
    /* JADX INFO: renamed from: a */
    public Object mo659a(Object obj) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(C0124f.m666b(it.next()));
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
        Collection collectionM662a = m662a(C0137a.m682a(type), type);
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Does not support the implement for generics.");
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        for (int i = 0; i < c2394a.m55439a(); i++) {
            collectionM662a.add(C0123e.m663a(c2394a.m55440a(i), type2));
        }
        return collectionM662a;
    }

    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0127i, com.alipay.sdk.p010m.p023g.InterfaceC0128j
    /* JADX INFO: renamed from: a */
    public boolean mo661a(Class cls) {
        return Collection.class.isAssignableFrom(cls);
    }
}
