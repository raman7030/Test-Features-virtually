package p067l;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۙܳ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: OBKY */
/* JADX INFO: loaded from: classes2.dex */
public final class C6833 {

    /* JADX INFO: renamed from: ֫ */
    public static Object f17757;

    /* JADX INFO: renamed from: ۧ */
    public static Class f17758;

    /* JADX INFO: renamed from: ܽ */
    public static Method f17759;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f17758 = cls;
            f17757 = cls.newInstance();
            cls.getMethod("getUDID", Context.class);
            f17759 = cls.getMethod("getOAID", Context.class);
            cls.getMethod("getVAID", Context.class);
            cls.getMethod("getAAID", Context.class);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m15648() {
        return (f17758 == null || f17757 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m15647(Context context) {
        Method method;
        Object obj = f17757;
        if (obj == null || (method = f17759) == null) {
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
