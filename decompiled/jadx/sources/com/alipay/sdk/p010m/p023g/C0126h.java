package com.alipay.sdk.p010m.p023g;

import com.alipay.sdk.p010m.p025h.C0137a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import org.json.alipay.C2395b;
import p067l.ConcurrentMapC12768;

/* JADX INFO: renamed from: com.alipay.sdk.m.g.h */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0126h implements InterfaceC0127i, InterfaceC0128j {
    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0128j
    /* JADX INFO: renamed from: a */
    public Object mo659a(Object obj) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (!(entry.getKey() instanceof String)) {
                throw new IllegalArgumentException("Map key must be String!");
            }
            treeMap.put((String) entry.getKey(), C0124f.m666b(entry.getValue()));
        }
        return treeMap;
    }

    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0127i
    /* JADX INFO: renamed from: a */
    public Object mo660a(Object obj, Type type) {
        if (!obj.getClass().equals(C2395b.class)) {
            return null;
        }
        C2395b c2395b = (C2395b) obj;
        Map mapM668a = m668a(type);
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Deserialize Map must be Generics!");
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type type2 = parameterizedType.getActualTypeArguments()[0];
        Type type3 = parameterizedType.getActualTypeArguments()[1];
        if (String.class != type2) {
            throw new IllegalArgumentException("Deserialize Map Key must be String.class");
        }
        Iterator itM55449a = c2395b.m55449a();
        while (itM55449a.hasNext()) {
            String str = (String) itM55449a.next();
            mapM668a.put(str, C0137a.m683a((Class) type3) ? c2395b.m55448a(str) : C0123e.m663a(c2395b.m55448a(str), type3));
        }
        return mapM668a;
    }

    /* JADX INFO: renamed from: a */
    public Map m668a(Type type) {
        if (type == Properties.class) {
            return new Properties();
        }
        if (type == Hashtable.class) {
            return new Hashtable();
        }
        if (type == IdentityHashMap.class) {
            return new IdentityHashMap();
        }
        if (type == SortedMap.class || type == TreeMap.class) {
            return new TreeMap();
        }
        if (type == ConcurrentMap.class || type == ConcurrentMapC12768.class) {
            return new ConcurrentMapC12768();
        }
        if (type == Map.class || type == HashMap.class) {
            return new HashMap();
        }
        if (type == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (type instanceof ParameterizedType) {
            return m668a(((ParameterizedType) type).getRawType());
        }
        Class cls = (Class) type;
        if (cls.isInterface()) {
            throw new IllegalArgumentException("unsupport type " + type);
        }
        try {
            return (Map) cls.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("unsupport type " + type, e);
        }
    }

    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0127i, com.alipay.sdk.p010m.p023g.InterfaceC0128j
    /* JADX INFO: renamed from: a */
    public boolean mo661a(Class cls) {
        return Map.class.isAssignableFrom(cls);
    }
}
