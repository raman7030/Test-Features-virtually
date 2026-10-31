package l;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 64YW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15824 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final HashMap f48903 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f48904 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17236 m37455(InterfaceC14413 interfaceC14413) {
        C11233.m27805(interfaceC14413, "object");
        boolean z = interfaceC14413 instanceof InterfaceC17236;
        boolean z2 = interfaceC14413 instanceof InterfaceC8085;
        if (z && z2) {
            return new C21491((InterfaceC8085) interfaceC14413, (InterfaceC17236) interfaceC14413);
        }
        if (z2) {
            return new C21491((InterfaceC8085) interfaceC14413, null);
        }
        if (z) {
            return (InterfaceC17236) interfaceC14413;
        }
        Class<?> cls = interfaceC14413.getClass();
        if (m37454(cls) == 2) {
            Object obj = f48904.get(cls);
            C11233.m27799(obj);
            List list = (List) obj;
            if (list.size() == 1) {
                return new C0507(m37456((Constructor) list.get(0), interfaceC14413));
            }
            int size = list.size();
            InterfaceC20080[] interfaceC20080Arr = new InterfaceC20080[size];
            for (int i = 0; i < size; i++) {
                interfaceC20080Arr[i] = m37456((Constructor) list.get(i), interfaceC14413);
            }
            return new C1029(interfaceC20080Arr);
        }
        return new C13002(interfaceC14413);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC20080 m37456(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            C11233.m27803(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return (InterfaceC20080) objNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x010e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m37454(Class cls) {
        Constructor declaredConstructor;
        Class<?>[] interfaces;
        int length;
        Class<?> cls2;
        HashMap map = f48903;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                C11233.m27803(name, "fullPackage");
                if (name.length() != 0) {
                    C11233.m27803(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    C11233.m27803(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                C11233.m27803(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String strConcat = C3016.m9235(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap map2 = f48904;
            if (declaredConstructor != null) {
                map2.put(cls, C1913.m6273(declaredConstructor));
            } else if (!C5263.f16468.m15178(cls)) {
                Class superclass = cls.getSuperclass();
                if (superclass != null && InterfaceC14413.class.isAssignableFrom(superclass)) {
                    C11233.m27803(superclass, "superclass");
                    if (m37454(superclass) != 1) {
                        Object obj = map2.get(superclass);
                        C11233.m27799(obj);
                        arrayList = new ArrayList((Collection) obj);
                        interfaces = cls.getInterfaces();
                        C11233.m27803(interfaces, "klass.interfaces");
                        length = interfaces.length;
                        for (int i2 = 0; i2 < length; i2++) {
                            cls2 = interfaces[i2];
                            if (cls2 == null) {
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                } else {
                    interfaces = cls.getInterfaces();
                    C11233.m27803(interfaces, "klass.interfaces");
                    length = interfaces.length;
                    while (i2 < length) {
                        cls2 = interfaces[i2];
                        if (cls2 == null && InterfaceC14413.class.isAssignableFrom(cls2)) {
                            C11233.m27803(cls2, "intrface");
                            if (m37454(cls2) != 1) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = map2.get(cls2);
                                C11233.m27799(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                        }
                    }
                    if (arrayList != null) {
                        map2.put(cls, arrayList);
                    }
                }
            }
            i = 2;
        }
        map.put(cls, Integer.valueOf(i));
        return i;
    }
}
