package p067l;

import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ܳܰ */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1564 {

    /* JADX INFO: renamed from: ֫ */
    public static Field f47677;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f47678;

    /* JADX INFO: renamed from: ܽ */
    public static Field f47679;

    /* JADX INFO: renamed from: ᩳ */
    public static Field f47680;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f47680 = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f47679 = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f47677 = declaredField3;
            declaredField3.setAccessible(true);
            f47678 = true;
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1914 m36891(View view) {
        if (f47678 && view.isAttachedToWindow()) {
            try {
                Object obj = f47680.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) f47679.get(obj);
                    Rect rect2 = (Rect) f47677.get(obj);
                    if (rect != null && rect2 != null) {
                        C2019 c2019 = new C2019();
                        c2019.m54782(C1388.m29403(rect.left, rect.top, rect.right, rect.bottom));
                        c2019.m54783(C1388.m29403(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        C1914 c1914M54780 = c2019.m54780();
                        c1914M54780.m51168(c1914M54780);
                        c1914M54780.m51166(view.getRootView());
                        return c1914M54780;
                    }
                }
            } catch (IllegalAccessException e) {
                e.getMessage();
            }
        }
        return null;
    }
}
