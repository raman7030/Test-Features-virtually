package l;

import android.content.res.Resources;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4TG */
/* JADX INFO: loaded from: classes4.dex */
public final class C21303 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Method f68672;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f68673;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Object f68674 = new Object();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48333(Resources.Theme theme) {
        synchronized (f68674) {
            if (!f68673) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                    f68672 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                }
                f68673 = true;
            }
            Method method = f68672;
            if (method != null) {
                try {
                    method.invoke(theme, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    f68672 = null;
                }
            }
        }
    }
}
