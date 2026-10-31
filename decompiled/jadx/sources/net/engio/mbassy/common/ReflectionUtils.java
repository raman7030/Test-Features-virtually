package net.engio.mbassy.common;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ReflectionUtils {
    public static Method[] getMethods(IPredicate iPredicate, Class cls) {
        ArrayList arrayList = new ArrayList();
        getMethods(iPredicate, cls, arrayList);
        Method[] methodArr = new Method[arrayList.size()];
        arrayList.toArray(methodArr);
        return methodArr;
    }

    public static void getMethods(IPredicate iPredicate, Class cls, ArrayList arrayList) {
        try {
            for (Method method : cls.getDeclaredMethods()) {
                if (iPredicate.apply(method)) {
                    arrayList.add(method);
                }
            }
        } catch (Exception unused) {
        }
        if (cls.equals(Object.class)) {
            return;
        }
        getMethods(iPredicate, cls.getSuperclass(), arrayList);
    }

    public static Method getOverridingMethod(Method method, Class cls) {
        while (!cls.equals(method.getDeclaringClass())) {
            try {
                return cls.getDeclaredMethod(method.getName(), method.getParameterTypes());
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static Class[] getSuperTypes(Class cls) {
        ArrayList arrayList = new ArrayList();
        collectInterfaces(cls, arrayList);
        while (!cls.equals(Object.class) && !cls.isInterface()) {
            arrayList.add(cls.getSuperclass());
            cls = cls.getSuperclass();
            collectInterfaces(cls, arrayList);
        }
        Class[] clsArr = new Class[arrayList.size()];
        arrayList.toArray(clsArr);
        return clsArr;
    }

    public static void collectInterfaces(Class cls, Collection collection) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            collection.add(cls2);
            collectInterfaces(cls2, collection);
        }
    }

    public static boolean containsOverridingMethod(Method[] methodArr, Method method) {
        for (Method method2 : methodArr) {
            if (isOverriddenBy(method, method2)) {
                return true;
            }
        }
        return false;
    }

    public static Annotation getAnnotation(AnnotatedElement annotatedElement, Class cls, Set set) {
        if (set.contains(annotatedElement)) {
            return null;
        }
        set.add(annotatedElement);
        Annotation annotation = annotatedElement.getAnnotation(cls);
        if (annotation != null) {
            return annotation;
        }
        for (Annotation annotation2 : annotatedElement.getAnnotations()) {
            Annotation annotation3 = getAnnotation(annotation2.annotationType(), cls, set);
            if (annotation3 != null) {
                return annotation3;
            }
        }
        return null;
    }

    public static Annotation getAnnotation(AnnotatedElement annotatedElement, Class cls) {
        return getAnnotation(annotatedElement, cls, new HashSet());
    }

    public static boolean isOverriddenBy(Method method, Method method2) {
        if (method.getDeclaringClass().equals(method2.getDeclaringClass()) || !method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()) || !method.getName().equals(method2.getName())) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?>[] parameterTypes2 = method2.getParameterTypes();
        for (int i = 0; i < parameterTypes2.length; i++) {
            if (!parameterTypes[i].equals(parameterTypes2[i])) {
                return false;
            }
        }
        return true;
    }
}
