package p067l;

import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.֨֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y68P */
/* JADX INFO: loaded from: classes2.dex */
public final class C3129 {

    /* JADX INFO: renamed from: ֫ */
    public static Field f5698;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f5699;

    /* JADX INFO: renamed from: ܽ */
    public static Method f5700;

    /* JADX INFO: renamed from: ᩳ */
    public static boolean f5701;

    /* JADX INFO: renamed from: ֫ */
    public static void m5337(PopupWindow popupWindow, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            C7153.m16451(popupWindow, z);
            return;
        }
        if (!f5699) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f5698 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f5699 = true;
        }
        Field field = f5698;
        if (field != null) {
            try {
                field.set(popupWindow, Boolean.valueOf(z));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5336(PopupWindow popupWindow, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C7153.m16450(popupWindow, i);
            return;
        }
        if (!f5701) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f5700 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f5701 = true;
        }
        Method method = f5700;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i));
            } catch (Exception unused2) {
            }
        }
    }
}
