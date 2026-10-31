package l;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: R697 */
/* JADX INFO: loaded from: classes.dex */
public final class C22461 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f72738 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final boolean f72739;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Method f72740;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f72741;

    static {
        f72739 = Build.VERSION.SDK_INT >= 27;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50392(View view, Rect rect, Rect rect2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C21756.m49071(view, rect, rect2);
            return;
        }
        if (!f72741) {
            f72741 = true;
            try {
                Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                f72740 = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    f72740.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
            }
        }
        Method method = f72740;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception unused2) {
            }
        }
    }
}
