package l;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۧ᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: S371 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11270 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f33770 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Object f33771;

    static {
        Object objInvoke;
        Method method = null;
        try {
            objInvoke = Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            objInvoke = null;
        }
        f33771 = objInvoke;
        if (objInvoke != null) {
            try {
                Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
            } catch (ThreadDeath e2) {
                throw e2;
            } catch (Throwable unused2) {
            }
        }
        if (objInvoke == null) {
            return;
        }
        try {
            try {
                method = Class.forName("sun.misc.JavaLangAccess", false, null).getMethod("getStackTraceDepth", Throwable.class);
            } catch (ThreadDeath e3) {
                throw e3;
            } catch (Throwable unused3) {
            }
            if (method == null) {
                return;
            }
            method.invoke(objInvoke, new Throwable());
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused4) {
        }
    }
}
