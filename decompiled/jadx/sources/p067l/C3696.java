package p067l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֨᩸᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: RANP */
/* JADX INFO: loaded from: classes2.dex */
public final class C3696 {

    /* JADX INFO: renamed from: ֫ */
    public static C7720 f7805;

    /* JADX INFO: renamed from: ۧ */
    public static final C7720 f7806 = new C7720(null, null, null);

    /* JADX INFO: renamed from: ֫ */
    public static String m7127(AbstractC5038 abstractC5038) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        C7720 c7720 = f7805;
        C7720 c7721 = f7806;
        if (c7720 == null) {
            try {
                C7720 c7722 = new C7720(Class.class.getDeclaredMethod("getModule", null), abstractC5038.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), abstractC5038.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f7805 = c7722;
                c7720 = c7722;
            } catch (Exception unused) {
                f7805 = c7721;
                c7720 = c7721;
            }
        }
        if (c7720 == c7721 || (method = c7720.f20247) == null || (objInvoke = method.invoke(abstractC5038.getClass(), null)) == null || (method2 = c7720.f20246) == null || (objInvoke2 = method2.invoke(objInvoke, null)) == null) {
            return null;
        }
        Method method3 = c7720.f20248;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
