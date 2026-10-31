package l;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: renamed from: l.֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: O529 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0341 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Method f1752;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f1752 = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m1788(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C19393.m44667(C19393.m44665(C19393.m44666(locale)));
        }
        try {
            return C18687.m43301((Locale) f1752.invoke(null, locale));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return C18687.m43301(locale);
        }
    }
}
