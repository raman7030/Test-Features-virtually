package p067l;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.۬᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G883 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15140 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f43223 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final AbstractC21847 f43224;

    static {
        AbstractC21847 c7094;
        try {
            c7094 = new C5753();
        } catch (ReflectiveOperationException unused) {
            c7094 = new C7094();
        }
        f43224 = c7094;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m34564(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc.getMessage();
        return "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34570(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            StringBuilder sbM11879 = C5410.m11879("Failed making ", m34565(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            sbM11879.append(m34564(e));
            throw new C15611(sbM11879.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m34565(AccessibleObject accessibleObject, boolean z) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + m34567((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            m34571(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + m34566((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m34567(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m34566(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        m34571(constructor, sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34571(AccessibleObject accessibleObject, StringBuilder sb) {
        Class<?>[] parameterTypes;
        sb.append('(');
        if (accessibleObject instanceof Method) {
            parameterTypes = ((Method) accessibleObject).getParameterTypes();
        } else {
            parameterTypes = ((Constructor) accessibleObject).getParameterTypes();
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m34572(Constructor constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e) {
            return "Failed making constructor '" + m34566(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + m34564(e);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m34574(Class cls) {
        return f43224.mo12829(cls);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String[] m34573(Class cls) {
        return f43224.mo12828(cls);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Method m34569(Class cls, Field field) {
        return f43224.mo12827(cls, field);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Constructor m34568(Class cls) {
        return f43224.mo12826(cls);
    }
}
