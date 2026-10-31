package l;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۙܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: OBKY */
/* JADX INFO: loaded from: classes2.dex */
public final class C4698 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object f14927;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Class f14928;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Method f14929;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f14928 = cls;
            f14927 = cls.newInstance();
            cls.getMethod("getUDID", Context.class);
            f14929 = cls.getMethod("getOAID", Context.class);
            cls.getMethod("getVAID", Context.class);
            cls.getMethod("getAAID", Context.class);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13773() {
        return (f14928 == null || f14927 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m13772(Context context) {
        Method method;
        Object obj = f14927;
        if (obj == null || (method = f14929) == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(obj, context);
            if (objInvoke != null) {
                return (String) objInvoke;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
