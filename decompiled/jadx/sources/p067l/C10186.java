package p067l;

import android.content.Context;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.۠ܳ֨, reason: contains not printable characters */
/* JADX INFO: loaded from: classes3.dex */
public final class C10186 {

    /* JADX INFO: renamed from: ֫ */
    public static Method f28251;

    /* JADX INFO: renamed from: ֫ */
    public static String m23745(Context context) {
        C21586 c21586M48774 = C21586.m48774();
        return c21586M48774.m48777(context.getApplicationContext(), c21586M48774.f68061);
    }

    /* JADX INFO: renamed from: ֫ */
    public static final boolean m23746() {
        Context context = null;
        try {
            if (f28251 == null) {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", null);
                f28251 = method;
                method.setAccessible(true);
            }
            context = (Context) f28251.invoke(null, null);
        } catch (Exception e) {
            e.toString();
        }
        if (context == null) {
            return false;
        }
        return C21586.m48774().m48778(context, false);
    }
}
