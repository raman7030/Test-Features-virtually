package p067l;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩹ᩴ */
/* JADX INFO: compiled from: R697 */
/* JADX INFO: loaded from: classes.dex */
public final class C1956 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f75466 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final boolean f75467;

    /* JADX INFO: renamed from: ܽ */
    public static Method f75468;

    /* JADX INFO: renamed from: ᩳ */
    public static boolean f75469;

    static {
        f75467 = Build.VERSION.SDK_INT >= 27;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52733(View view, Rect rect, Rect rect2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1921.m51420(view, rect, rect2);
            return;
        }
        if (!f75469) {
            f75469 = true;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f75468 = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f75468.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
            }
        }
        Method method = f75468;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused2) {
            }
        }
    }
}
