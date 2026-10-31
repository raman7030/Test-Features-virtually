package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.۬᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AXS */
/* JADX INFO: loaded from: classes3.dex */
public final class C13390 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Method f40014;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        C11233.m27799(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (C11233.m27802((Object) method2.getName(), (Object) "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                C11233.m27803(parameterTypes, "getParameterTypes(...)");
                if (C11233.m27802(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f40014 = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !C11233.m27802((Object) methods[i2].getName(), (Object) "getSuppressed"); i2++) {
        }
    }
}
