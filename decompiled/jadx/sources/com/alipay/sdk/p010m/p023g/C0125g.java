package com.alipay.sdk.p010m.p023g;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.TreeMap;
import org.json.alipay.C2395b;

/* JADX INFO: renamed from: com.alipay.sdk.m.g.g */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0125g implements InterfaceC0127i, InterfaceC0128j {
    /* JADX INFO: renamed from: a */
    public static Object m667a(Field field, Object obj) throws IllegalAccessException {
        if (field == null || obj == null || "this$0".equals(field.getName())) {
            return null;
        }
        boolean zIsAccessible = field.isAccessible();
        field.setAccessible(true);
        Object obj2 = field.get(obj);
        if (obj2 == null) {
            return null;
        }
        field.setAccessible(zIsAccessible);
        return C0124f.m666b(obj2);
    }

    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0128j
    /* JADX INFO: renamed from: a */
    public Object mo659a(Object obj) throws IllegalAccessException {
        TreeMap treeMap = new TreeMap();
        Class<?> superclass = obj.getClass();
        while (true) {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (superclass.equals(Object.class)) {
                return treeMap;
            }
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    Object objM667a = m667a(field, obj);
                    if (objM667a != null) {
                        treeMap.put(field.getName(), objM667a);
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
    }

    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0127i
    /* JADX INFO: renamed from: a */
    public Object mo660a(Object obj, Type type) throws IllegalAccessException, InstantiationException {
        if (!obj.getClass().equals(C2395b.class)) {
            return null;
        }
        C2395b c2395b = (C2395b) obj;
        Class superclass = (Class) type;
        Object objNewInstance = superclass.newInstance();
        while (!superclass.equals(Object.class)) {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    String name = field.getName();
                    Type genericType = field.getGenericType();
                    if (c2395b.m55451b(name)) {
                        field.setAccessible(true);
                        field.set(objNewInstance, C0123e.m663a(c2395b.m55448a(name), genericType));
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
        return objNewInstance;
    }

    @Override // com.alipay.sdk.p010m.p023g.InterfaceC0127i, com.alipay.sdk.p010m.p023g.InterfaceC0128j
    /* JADX INFO: renamed from: a */
    public boolean mo661a(Class cls) {
        return true;
    }
}
