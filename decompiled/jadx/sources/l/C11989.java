package l;

import com.umeng.analytics.pro.am;
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۨ᩹ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 197J */
/* JADX INFO: loaded from: classes3.dex */
public final class C11989 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final long f35892;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final long f35893;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f35894;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final long f35895;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final long f35896;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final long f35897;

    static {
        long jObjectFieldOffset;
        try {
            Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", null).invoke(null, null);
            f35894 = unsafe;
            C22572 c22572 = new C22572(System.getProperty("java.boot.class.path", "").split(":", 2)[0], null);
            Class clsLoadClass = c22572.loadClass(C9005.m23241().getName());
            Class clsLoadClass2 = c22572.loadClass(C18473.m42950().getName());
            Class clsLoadClass3 = c22572.loadClass(Class.class.getName());
            f35897 = unsafe.objectFieldOffset(clsLoadClass.getDeclaredField("artMethod"));
            unsafe.objectFieldOffset(clsLoadClass.getDeclaredField("declaringClass"));
            f35895 = unsafe.objectFieldOffset(clsLoadClass2.getDeclaredField("artFieldOrMethod"));
            try {
                jObjectFieldOffset = unsafe.objectFieldOffset(clsLoadClass3.getDeclaredField("fields"));
            } catch (NoSuchFieldException unused) {
                Unsafe unsafe2 = f35894;
                jObjectFieldOffset = unsafe2.objectFieldOffset(clsLoadClass3.getDeclaredField("iFields"));
                unsafe2.objectFieldOffset(clsLoadClass3.getDeclaredField("sFields"));
            }
            Unsafe unsafe3 = f35894;
            long jObjectFieldOffset2 = unsafe3.objectFieldOffset(clsLoadClass3.getDeclaredField("methods"));
            f35896 = jObjectFieldOffset2;
            Method declaredMethod = C10578.class.getDeclaredMethod(am.av, null);
            Method declaredMethod2 = C10578.class.getDeclaredMethod("b", null);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
            MethodHandle methodHandleUnreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
            long j = f35895;
            long j2 = unsafe3.getLong(methodHandleUnreflect, j);
            long j3 = unsafe3.getLong(methodHandleUnreflect2, j);
            long j4 = unsafe3.getLong(C10578.class, jObjectFieldOffset2);
            long j5 = j3 - j2;
            f35893 = j5;
            f35892 = (j2 - j4) - j5;
            Field declaredField = C10578.class.getDeclaredField(am.aC);
            Field declaredField2 = C10578.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle methodHandleUnreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            unsafe3.getLong(methodHandleUnreflectGetter, j);
            unsafe3.getLong(methodHandleUnreflectGetter2, j);
            unsafe3.getLong(C10578.class, jObjectFieldOffset);
        } catch (ReflectiveOperationException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m29293(Class cls, Object obj, String str, Object... objArr) throws NoSuchMethodException {
        if (obj != null && !cls.isInstance(obj)) {
            throw new IllegalArgumentException("this object is not an instance of the given class");
        }
        Method declaredMethod = C13399.class.getDeclaredMethod("invoke", Object[].class);
        declaredMethod.setAccessible(true);
        Unsafe unsafe = f35894;
        long j = unsafe.getLong(cls, f35896);
        if (j == 0) {
            throw new NoSuchMethodException("Cannot find matching method");
        }
        int i = unsafe.getInt(j);
        for (int i2 = 0; i2 < i; i2++) {
            f35894.putLong(declaredMethod, f35897, f35892 + (((long) i2) * f35893) + j);
            if (str.equals(declaredMethod.getName())) {
                Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
                HashSet hashSet = C6344.f19650;
                if (parameterTypes.length == objArr.length) {
                    for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                        if (parameterTypes[i3].isPrimitive()) {
                            Class<?> cls2 = parameterTypes[i3];
                            if ((cls2 != Integer.TYPE || (objArr[i3] instanceof Integer)) && ((cls2 != Byte.TYPE || (objArr[i3] instanceof Byte)) && ((cls2 != Character.TYPE || (objArr[i3] instanceof Character)) && ((cls2 != Boolean.TYPE || (objArr[i3] instanceof Boolean)) && ((cls2 != Double.TYPE || (objArr[i3] instanceof Double)) && ((cls2 != Float.TYPE || (objArr[i3] instanceof Float)) && ((cls2 != Long.TYPE || (objArr[i3] instanceof Long)) && (cls2 != Short.TYPE || (objArr[i3] instanceof Short))))))))) {
                            }
                        } else {
                            Object obj2 = objArr[i3];
                            if (obj2 == null || parameterTypes[i3].isInstance(obj2)) {
                            }
                        }
                    }
                    return declaredMethod.invoke(obj, objArr);
                }
                continue;
            }
        }
        throw new NoSuchMethodException("Cannot find matching method");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m29295(String... strArr) {
        try {
            m29293(VMRuntime.class, m29293(VMRuntime.class, null, "getRuntime", new Object[0]), "setHiddenApiExemptions", strArr);
            return true;
        } catch (ReflectiveOperationException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29294(String... strArr) {
        HashSet hashSet = C6344.f19650;
        hashSet.addAll(Arrays.asList(strArr));
        String[] strArr2 = new String[hashSet.size()];
        hashSet.toArray(strArr2);
        m29295(strArr2);
    }
}
