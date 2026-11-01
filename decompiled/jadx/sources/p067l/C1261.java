package p067l;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: l.۠᩹ */
/* JADX INFO: compiled from: K22G */
/* JADX INFO: loaded from: classes3.dex */
public final class C1261 {

    /* JADX INFO: renamed from: ֫ */
    public static final Class f28779;

    /* JADX INFO: renamed from: ۧ */
    public static final Handler f28780 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ܳ */
    public static final Method f28781;

    /* JADX INFO: renamed from: ܽ */
    public static final Field f28782;

    /* JADX INFO: renamed from: ܿ */
    public static final Method f28783;

    /* JADX INFO: renamed from: ᩳ */
    public static final Method f28784;

    /* JADX INFO: renamed from: ᩻ */
    public static final Field f28785;

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f28779 = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f28782 = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f28785 = declaredField2;
        Class cls2 = f28779;
        Class<?> cls3 = Boolean.TYPE;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, cls3, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
                declaredMethod = null;
            }
        }
        f28783 = declaredMethod;
        Class cls4 = f28779;
        if (cls4 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls4.getDeclaredMethod("performStopActivity", IBinder.class, cls3);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
                declaredMethod2 = null;
            }
        }
        f28784 = declaredMethod2;
        Class cls5 = f28779;
        int i = Build.VERSION.SDK_INT;
        if ((i == 26 || i == 27) && cls5 != null) {
            try {
                Method declaredMethod3 = cls5.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f28781 = method;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m24105(Activity activity) {
        Object obj;
        Handler handler = f28780;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            activity.recreate();
            return true;
        }
        Method method = f28781;
        if (((i != 26 && i != 27) || method != null) && (f28784 != null || f28783 != null)) {
            try {
                Object obj2 = f28785.get(activity);
                if (obj2 != null && (obj = f28782.get(activity)) != null) {
                    Application application = activity.getApplication();
                    C0911 c0911 = new C0911(activity);
                    application.registerActivityLifecycleCallbacks(c0911);
                    handler.post(new RunnableC1821(c0911, obj2));
                    try {
                        if (i == 26 || i == 27) {
                            Boolean bool = Boolean.FALSE;
                            method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                        } else {
                            activity.recreate();
                        }
                        handler.post(new RunnableC0876(application, c0911));
                        return true;
                    } catch (Throwable th) {
                        handler.post(new RunnableC0876(application, c0911));
                        throw th;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m24106(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f28785.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f28780.postAtFrontOfQueue(new RunnableC1121(f28782.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
