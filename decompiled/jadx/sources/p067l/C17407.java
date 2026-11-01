package p067l;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 64YW */
/* JADX INFO: loaded from: classes4.dex */
public final class C17407 {

    /* JADX INFO: renamed from: ֫ */
    public static final HashMap f52041 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public static final HashMap f52042 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public static final InterfaceC18749 m39627(InterfaceC16066 interfaceC16066) {
        C13045.m29867(interfaceC16066, "object");
        boolean z = interfaceC16066 instanceof InterfaceC18749;
        boolean z2 = interfaceC16066 instanceof InterfaceC10052;
        if (z && z2) {
            return new C22793((InterfaceC10052) interfaceC16066, (InterfaceC18749) interfaceC16066);
        }
        if (z2) {
            return new C22793((InterfaceC10052) interfaceC16066, null);
        }
        if (z) {
            return (InterfaceC18749) interfaceC16066;
        }
        Class<?> cls = interfaceC16066.getClass();
        if (m39626(cls) == 2) {
            Object obj = f52042.get(cls);
            C13045.m29861(obj);
            List list = (List) obj;
            if (list.size() == 1) {
                return new C2850(m39628((Constructor) list.get(0), interfaceC16066));
            }
            int size = list.size();
            InterfaceC21452[] interfaceC21452Arr = new InterfaceC21452[size];
            for (int i = 0; i < size; i++) {
                interfaceC21452Arr[i] = m39628((Constructor) list.get(i), interfaceC16066);
            }
            return new C3346(interfaceC21452Arr);
        }
        return new C14725(interfaceC16066);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC21452 m39628(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            C13045.m29865(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return (InterfaceC21452) objNewInstance;
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
    /* JADX INFO: renamed from: ֫ */
    public static int m39626(Class cls) {
        Constructor declaredConstructor;
        Class<?>[] interfaces;
        int length;
        Class<?> cls2;
        HashMap map = f52041;
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
                C13045.m29865(name, "fullPackage");
                if (name.length() != 0) {
                    C13045.m29865(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    C13045.m29865(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                C13045.m29865(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String strConcat = C5235.m11293(canonicalName, ".", "_").concat("_LifecycleAdapter");
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
            HashMap map2 = f52042;
            if (declaredConstructor != null) {
                map2.put(cls, C4187.m8475(declaredConstructor));
            } else if (!C7370.f19305.m17081(cls)) {
                Class superclass = cls.getSuperclass();
                if (superclass != null && InterfaceC16066.class.isAssignableFrom(superclass)) {
                    C13045.m29865(superclass, "superclass");
                    if (m39626(superclass) != 1) {
                        Object obj = map2.get(superclass);
                        C13045.m29861(obj);
                        arrayList = new ArrayList((Collection) obj);
                        interfaces = cls.getInterfaces();
                        C13045.m29865(interfaces, "klass.interfaces");
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
                    C13045.m29865(interfaces, "klass.interfaces");
                    length = interfaces.length;
                    while (i2 < length) {
                        cls2 = interfaces[i2];
                        if (cls2 == null && InterfaceC16066.class.isAssignableFrom(cls2)) {
                            C13045.m29865(cls2, "intrface");
                            if (m39626(cls2) != 1) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = map2.get(cls2);
                                C13045.m29861(obj2);
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
