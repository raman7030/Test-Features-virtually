package p067l;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚۢ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D5S8 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C7370 {

    /* JADX INFO: renamed from: ܽ */
    public static C7370 f19305 = new C7370();

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f19306 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f19307 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final boolean m17081(Class cls) {
        HashMap map = this.f19307;
        Boolean bool = (Boolean) map.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (((InterfaceC10032) method.getAnnotation(InterfaceC10032.class)) != null) {
                    m17078(cls, declaredMethods);
                    return true;
                }
            }
            map.put(cls, Boolean.FALSE);
            return false;
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C20782 m17080(Class cls) {
        C20782 c20782 = (C20782) this.f19306.get(cls);
        return c20782 != null ? c20782 : m17078(cls, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m17079(HashMap map, C2675 c2675, EnumC24133 enumC24133, Class cls) {
        EnumC24133 enumC24134 = (EnumC24133) map.get(c2675);
        if (enumC24134 == null || enumC24133 == enumC24134) {
            if (enumC24134 == null) {
                map.put(c2675, enumC24133);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c2675.f4482.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC24134 + ", new value " + enumC24133);
    }

    /* JADX INFO: renamed from: ֫ */
    private C20782 m17078(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null) {
            map.putAll(m17080(superclass).f65329);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : m17080(cls2).f65329.entrySet()) {
                m17079(map, (C2675) entry.getKey(), (EnumC24133) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC10032 interfaceC10032 = (InterfaceC10032) method.getAnnotation(InterfaceC10032.class);
            if (interfaceC10032 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC24784.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC24133 enumC24133Value = interfaceC10032.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC24133.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC24133Value != EnumC24133.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m17079(map, new C2675(method, i), enumC24133Value, cls);
                z = true;
            }
        }
        C20782 c20782 = new C20782(map);
        this.f19306.put(cls, c20782);
        this.f19307.put(cls, Boolean.valueOf(z));
        return c20782;
    }
}
