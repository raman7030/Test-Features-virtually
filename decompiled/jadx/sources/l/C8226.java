package l;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.۠ܳ֨, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C8226 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Method f25341;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21776(Context context) {
        C20221 c20221M46454 = C20221.m46454();
        return c20221M46454.m46457(context.getApplicationContext(), c20221M46454.f65413);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final boolean m21777() {
        Context context = null;
        try {
            if (f25341 == null) {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", null);
                f25341 = method;
                method.setAccessible(true);
            }
            context = (Context) f25341.invoke(null, null);
        } catch (Exception e) {
            e.toString();
        }
        if (context == null) {
            return false;
        }
        return C20221.m46454().m46458(context, false);
    }
}
