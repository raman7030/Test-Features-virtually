package l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֨᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: RANP */
/* JADX INFO: loaded from: classes2.dex */
public final class C1396 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5630 f5033;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C5630 f5034 = new C5630(null, null, null);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m4888(AbstractC2808 abstractC2808) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        C5630 c5630 = f5033;
        C5630 c5631 = f5034;
        if (c5630 == null) {
            try {
                C5630 c5632 = new C5630(Class.class.getDeclaredMethod("getModule", null), abstractC2808.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), abstractC2808.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f5033 = c5632;
                c5630 = c5632;
            } catch (Exception unused) {
                f5033 = c5631;
                c5630 = c5631;
            }
        }
        if (c5630 == c5631 || (method = c5630.f17401) == null || (objInvoke = method.invoke(abstractC2808.getClass(), null)) == null || (method2 = c5630.f17400) == null || (objInvoke2 = method2.invoke(objInvoke, null)) == null) {
            return null;
        }
        Method method3 = c5630.f17402;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
