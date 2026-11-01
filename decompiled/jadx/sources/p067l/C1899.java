package p067l;

import android.content.res.Resources;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩸ۗ */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes4.dex */
public final class C1899 {

    /* JADX INFO: renamed from: ֫ */
    public static Method f71363;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f71364;

    /* JADX INFO: renamed from: ܽ */
    public static final Object f71365 = new Object();

    /* JADX INFO: renamed from: ֫ */
    public static void m50667(Resources.Theme theme) {
        synchronized (f71365) {
            if (!f71364) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                    f71363 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f71364 = true;
            }
            Method method = f71363;
            if (method != null) {
                try {
                    method.invoke(theme, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    f71363 = null;
                }
            }
        }
    }
}
