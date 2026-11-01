package p067l;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* JADX INFO: renamed from: l.֡ۤ */
/* JADX INFO: compiled from: O529 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0859 {

    /* JADX INFO: renamed from: ֫ */
    public static Method f4528;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f4528 = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m4187(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C1804.m46961(C1804.m46959(C1804.m46960(locale)));
        }
        try {
            return C1769.m45567((Locale) f4528.invoke(null, locale));
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return C1769.m45567(locale);
        }
    }
}
