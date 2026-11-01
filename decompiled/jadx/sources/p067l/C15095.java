package p067l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.۬᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 0AXS */
/* JADX INFO: loaded from: classes3.dex */
public final class C15095 {

    /* JADX INFO: renamed from: ֫ */
    public static final Method f43085;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        C13045.m29861(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (C13045.m29864((Object) method2.getName(), (Object) "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                C13045.m29865(parameterTypes, "getParameterTypes(...)");
                if (C13045.m29864(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        f43085 = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !C13045.m29864((Object) methods[i2].getName(), (Object) "getSuppressed"); i2++) {
        }
    }
}
