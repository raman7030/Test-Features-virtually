package l;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.۬᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G883 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13438 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f40152 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC20495 f40153;

    static {
        AbstractC20495 c4972;
        try {
            c4972 = new C3561();
        } catch (ReflectiveOperationException unused) {
            c4972 = new C4972();
        }
        f40153 = c4972;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m32462(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc.getMessage();
        return "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32468(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            StringBuilder sbM9834 = C3200.m9834("Failed making ", m32463(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            sbM9834.append(m32462(e));
            throw new C13934(sbM9834.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m32463(AccessibleObject accessibleObject, boolean z) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + m32465((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            m32469(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + m32464((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m32465(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m32464(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        m32469(constructor, sb);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32469(AccessibleObject accessibleObject, StringBuilder sb) {
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m32470(Constructor constructor) {
        try {
            constructor.setAccessible(true);
            return null;
        } catch (Exception e) {
            return "Failed making constructor '" + m32464(constructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + m32462(e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m32472(Class cls) {
        return f40153.mo10849(cls);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String[] m32471(Class cls) {
        return f40153.mo10848(cls);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Method m32467(Class cls, Field field) {
        return f40153.mo10847(cls, field);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Constructor m32466(Class cls) {
        return f40153.mo10846(cls);
    }
}
