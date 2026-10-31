package l;

import android.graphics.Rect;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14553 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Field f44570;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f44571;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Field f44572;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Field f44573;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f44573 = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f44572 = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f44570 = declaredField3;
            declaredField3.setAccessible(true);
            f44571 = true;
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21610 m34742(View view) {
        if (f44571 && view.isAttachedToWindow()) {
            try {
                Object obj = f44573.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) f44572.get(obj);
                    Rect rect2 = (Rect) f44570.get(obj);
                    if (rect != null && rect2 != null) {
                        C23726 c23726 = new C23726();
                        c23726.m52375(C11007.m27341(rect.left, rect.top, rect.right, rect.bottom));
                        c23726.m52376(C11007.m27341(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        C21610 c21610M52373 = c23726.m52373();
                        c21610M52373.m48820(c21610M52373);
                        c21610M52373.m48818(view.getRootView());
                        return c21610M52373;
                    }
                }
            } catch (IllegalAccessException e) {
                e.getMessage();
            }
        }
        return null;
    }
}
