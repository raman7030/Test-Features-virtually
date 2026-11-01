package p067l;

import com.umeng.analytics.pro.C0655am;
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
public final class C13763 {

    /* JADX INFO: renamed from: ֫ */
    public static final long f38902;

    /* JADX INFO: renamed from: ۧ */
    public static final long f38903;

    /* JADX INFO: renamed from: ܳ */
    public static final Unsafe f38904;

    /* JADX INFO: renamed from: ܽ */
    public static final long f38905;

    /* JADX INFO: renamed from: ܿ */
    public static final long f38906;

    /* JADX INFO: renamed from: ᩳ */
    public static final long f38907;

    static {
        long jObjectFieldOffset;
        try {
            Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", null).invoke(null, null);
            f38904 = unsafe;
            C23821 c23821 = new C23821(System.getProperty("java.boot.class.path", "").split(":", 2)[0], null);
            Class clsLoadClass = c23821.loadClass(C10927.m25185().getName());
            Class clsLoadClass2 = c23821.loadClass(C19925.m45226().getName());
            Class clsLoadClass3 = c23821.loadClass(Class.class.getName());
            f38907 = unsafe.objectFieldOffset(clsLoadClass.getDeclaredField("artMethod"));
            unsafe.objectFieldOffset(clsLoadClass.getDeclaredField("declaringClass"));
            f38905 = unsafe.objectFieldOffset(clsLoadClass2.getDeclaredField("artFieldOrMethod"));
            try {
                jObjectFieldOffset = unsafe.objectFieldOffset(clsLoadClass3.getDeclaredField("fields"));
            } catch (NoSuchFieldException unused) {
                Unsafe unsafe2 = f38904;
                jObjectFieldOffset = unsafe2.objectFieldOffset(clsLoadClass3.getDeclaredField("iFields"));
                unsafe2.objectFieldOffset(clsLoadClass3.getDeclaredField("sFields"));
            }
            Unsafe unsafe3 = f38904;
            long jObjectFieldOffset2 = unsafe3.objectFieldOffset(clsLoadClass3.getDeclaredField("methods"));
            f38906 = jObjectFieldOffset2;
            Method declaredMethod = C12422.class.getDeclaredMethod(C0655am.f2320av, null);
            Method declaredMethod2 = C12422.class.getDeclaredMethod("b", null);
            declaredMethod.setAccessible(true);
            declaredMethod2.setAccessible(true);
            MethodHandle methodHandleUnreflect = MethodHandles.lookup().unreflect(declaredMethod);
            MethodHandle methodHandleUnreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
            long j = f38905;
            long j2 = unsafe3.getLong(methodHandleUnreflect, j);
            long j3 = unsafe3.getLong(methodHandleUnreflect2, j);
            long j4 = unsafe3.getLong(C12422.class, jObjectFieldOffset2);
            long j5 = j3 - j2;
            f38903 = j5;
            f38902 = (j2 - j4) - j5;
            Field declaredField = C12422.class.getDeclaredField(C0655am.f2275aC);
            Field declaredField2 = C12422.class.getDeclaredField("j");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            MethodHandle methodHandleUnreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
            MethodHandle methodHandleUnreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
            unsafe3.getLong(methodHandleUnreflectGetter, j);
            unsafe3.getLong(methodHandleUnreflectGetter2, j);
            unsafe3.getLong(C12422.class, jObjectFieldOffset);
        } catch (ReflectiveOperationException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m31348(Class cls, Object obj, String str, Object... objArr) throws NoSuchMethodException {
        if (obj != null && !cls.isInstance(obj)) {
            throw new IllegalArgumentException("this object is not an instance of the given class");
        }
        Method declaredMethod = C15103.class.getDeclaredMethod("invoke", Object[].class);
        declaredMethod.setAccessible(true);
        Unsafe unsafe = f38904;
        long j = unsafe.getLong(cls, f38906);
        if (j == 0) {
            throw new NoSuchMethodException("Cannot find matching method");
        }
        int i = unsafe.getInt(j);
        for (int i2 = 0; i2 < i; i2++) {
            f38904.putLong(declaredMethod, f38907, f38902 + (((long) i2) * f38903) + j);
            if (str.equals(declaredMethod.getName())) {
                Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
                HashSet hashSet = C8398.f22522;
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

    /* JADX INFO: renamed from: ۧ */
    public static boolean m31350(String... strArr) {
        try {
            m31348(VMRuntime.class, m31348(VMRuntime.class, null, "getRuntime", new Object[0]), "setHiddenApiExemptions", strArr);
            return true;
        } catch (ReflectiveOperationException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m31349(String... strArr) {
        HashSet hashSet = C8398.f22522;
        hashSet.addAll(Arrays.asList(strArr));
        String[] strArr2 = new String[hashSet.size()];
        hashSet.toArray(strArr2);
        m31350(strArr2);
    }
}
